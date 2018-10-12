public enum PlaneType {
    BOEING737(10),
    BOEING747(20),
    BOEING777(30),
    AIRBUSA380(40);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}