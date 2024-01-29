public class ParkingLot {


    public ParkingSpot[] spots;




    public ParkingLot(){
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < spots.length; i++) {
            if (i > 1) spots[i] = new ParkingSpot(false);
            else spots[i] = new ParkingSpot(true);
        }

    }




    public int park(Car car) {
        for (int i = 0; i < spots.length; i++ ){
            if (spots[i].isHandicap == car.handicap) {
                spots[i].carParked = car;
                assert (spots[i].carParked == car);
                return i;
            }
        }
        return -1;
    }


    public Car removeCar(int i) {
        Car temp = spots[i].carParked;
        spots[i].carParked = null;
        return temp;
    }


    public String toString() {
        int handicapSpots = 0;
        int standardSpots = 0;
        
        for (int i = 0; i < spots.length; i++) {
            if (spots[i].isHandicap && spots[i].carParked == null) {
                handicapSpots++;
            } else if (spots[i].carParked == null) {
                standardSpots++;
            }
        }

        return "" + handicapSpots + " " + standardSpots;
    }
}
