package data.models;

public class PoliticalParty {
    private final int partyID;
    private final String name;

    public PoliticalParty(int partyID, String name) {
        this.partyID = partyID;
        this.name = name;
    }

    public int getId() {
        return partyID;
    }

    public String getName() {
        return name;
    }

    public boolean contains(String party) {
        return true;
    }
}