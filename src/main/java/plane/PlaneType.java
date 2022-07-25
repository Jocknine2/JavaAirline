package plane;

public enum PlaneType {
    BOEING747(150, 183500),
    AIRBUS_A380(509, 391000),
    CESSNA(2, 757);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}

