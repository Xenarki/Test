public class Vehicle {
    int passengers;
    int mpg;
    int fuelcap;

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
}

