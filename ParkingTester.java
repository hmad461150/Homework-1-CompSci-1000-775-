public class ParkingTester {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        System.out.println(parkingLot.toString());
        Car infinitiA = new Car("Infiniti", "A", true);
        int infSpot = parkingLot.park(infinitiA);
        System.out.println(parkingLot.toString());
        Car cadillacB = new Car("Cadillac", "B", false);
        parkingLot.park(cadillacB);
        System.out.println(parkingLot.toString());
        parkingLot.removeCar(infSpot);
        System.out.println(parkingLot.toString());
    }
}
