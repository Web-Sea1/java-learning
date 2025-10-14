class Main{
    static class Vehicle
    {
        void brand()
        {
            System.out.println("Benz");
        }
    }
    static class Car extends Vehicle
    {
        void brand(){
            System.out.println("Swift");
        }
    }
    static class Truck extends Vehicle
    {
        void brand(){
            System.out.println("Ashok Leyland");
        }
    }

    public static void main(String[] args){
        Vehicle veh = new Vehicle();
        veh.brand();
        veh = new Car();
        veh.brand();
        veh = new Truck();
        veh.brand();
    }
}
