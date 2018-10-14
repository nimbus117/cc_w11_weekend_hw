public enum AirlineType {
    AA("American Airlines"),
    AC("Air Canada"),
    AS("Alaska Airlines"),
    BA("British Airways"),
    LH("Lufthansa");

    private final String name;

    AirlineType(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}

