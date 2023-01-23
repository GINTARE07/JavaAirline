package airline;

public enum PlaneType {
    BOEING737 (250, 150 ),
    BOEING434(210, 120),
    AIRBUS720(320, 220);

    private int capacity;
    private int totalWeight;


    PlaneType(int capacity, int total_weight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getPlaneCapacity() {
        return capacity;
    }

    public int getPlaneTypeWeight() {
        return totalWeight;
    }
}
