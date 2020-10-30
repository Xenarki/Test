public class TruckDemo {
    public static void main(String arhs[]){
        Truck semi = new Truck(2, 200, 7, 44000);
        int dist = 252;
        double gallons = semi.fuelneeded(dist);
        System.out.print(gallons);
    }
}
