package HospitalManagementSystem;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class HospitalManagementSystem {
    private static final String url = "jdbc:mysql://localhost:3306/hospital";
    private static final String username = "root";
    private static final String password = "6137";
    public static void main(String[] args) {
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Patient patient = new Patient(connection, scanner);
            Doctor doctor = new Doctor(connection);
            while (true) {
                System.out.println("HOSPITAL MANAGEMENT SYSTEM");
                System.out.println("1. Add Patients");
                System.out.println("2. View Patients");
                System.out.println("3. View Doctors");
                System.out.println("4. Book Appointment");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                switch(choice){
                    case 1:
                        //add patient
                        patient.addpatient();
                        System.out.println();
                        break;
                    case 2:
                        //viewpatient
                        patient.viewPatient();
                        System.out.println();
                        break;
                    case 3:
                        //viewdoctors
                        doctor.viewDoctors();
                        System.out.println();
                        break;
                        case 4:
                            //book appointment
                            bookAppointment(patient,doctor,connection,scanner);
                            System.out.println();
                            break;
                            case 5:
                                return;
                    default:
                        System.out.println("Invalid Choice !!!");
                        break;
                                        }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void bookAppointment(Patient patient, Doctor doctor, Connection connection, Scanner scanner){
        System.out.println("Enter the patient ID:");
        int patientID = scanner.nextInt();
        System.out.println("Enter the Doctor ID: ");
        int doctorID = scanner.nextInt();
        System.out.println("Enter the appointment ID:");
        String appointmentID = scanner.nextLine();
        if(patient.getPatientById(patientID) && doctor.getDoctorById(doctorID)){
            if(checkDoctorAvailability(doctorID,appointmentID,connection)){
             String appointmentQuery="INSERT INTO appointments(patient_id, doctor_id, appointment_id) VALUES (? ? ?)";
             try{
          PreparedStatement preparedStatement = connection.prepareStatement(appointmentQuery);
          preparedStatement.setInt(1,patientID);
          preparedStatement.setInt(2,doctorID);
          preparedStatement.setString(3,appointmentID);
          int affectedRows = preparedStatement.executeUpdate();
          if(affectedRows>0){
              System.out.println("Appointment booked Successfully");
          }else{
              System.out.println("Failed to book Appointment");
          }
             }catch(SQLException e){
                 e.printStackTrace();
             }

            }else {
                System.out.println("Doctor not available on this date");
            }

        }else{
            System.out.println("Either Doctor or Patient not available on this date");
        }

    }
    public static boolean checkDoctorAvailability(int DoctorID, String appointmentID, Connection connection){
        String query =  "SELECT COUNT(*) FROM appointments WHERE doctor_id = ? AND appointment_id = ?";
        try{
          PreparedStatement preparedStatement = connection.prepareStatement(query);
          preparedStatement.setInt(1,DoctorID);
          preparedStatement.setString(2,appointmentID);
          ResultSet resultset = preparedStatement.executeQuery();
          if(resultset.next()) {
              int count = resultset.getInt(1);
              if (count > 0) {
                  return true;
              } else {
                  return false;
              }
          }
        }catch(SQLException e){
            e.printStackTrace();
        }
          return false;
    }
}
