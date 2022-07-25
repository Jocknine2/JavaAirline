package plane;

public class Plane {
    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }


    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacityFromPlaneType(){
        return this.planeType.getCapacity();
    }

    public int getWeightFromPlaneType(){
        return this.planeType.getWeight();
    }
}
