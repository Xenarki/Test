public class Vehicle {
   private int passengers;
   private int mpg;
   private int fuelcap;

    Vehicle(int p, int m, int f){
        passengers = p;
        mpg = m;
        fuelcap = f;
    }

    int range(){
        return mpg * fuelcap;
    }
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }
}

