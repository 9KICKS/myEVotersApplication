package data.repositories;

import data.models.PoliticalParty;
import java.util.ArrayList;
import java.util.List;

public class PoliticalPartyRepositoryImpl implements PoliticalPartyRepository {
    private final List<PoliticalParty> parties;

    public PoliticalPartyRepositoryImpl() {
        parties = new ArrayList<>();
    }

    @Override
    public List<PoliticalParty> getAllParties() {
        return parties;
    }

    @Override
    public PoliticalParty getPartyById(int id) {
        for (PoliticalParty party : parties) {
            if (party.getId() == id) {
                return party;
            }
        }
        return null;
    }
}