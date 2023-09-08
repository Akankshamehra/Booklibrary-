public class Patron {
    private int patronId;
    private String name;

    public Patron(int patronId, String name) {
        this.patronId = patronId;
        this.name = name;
    }

    public int getPatronId() {
        return patronId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patron ID: " + patronId + "\nName: " + name;
    }
}