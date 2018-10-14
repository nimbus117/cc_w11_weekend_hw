public enum PlaneType {
    BOEING737(2),
    BOEING747(3),
    BOEING777(4),
    AIRBUSA380(5);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}