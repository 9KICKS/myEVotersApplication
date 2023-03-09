package services;

import data.models.PoliticalParty;
import java.util.List;

public class PoliticalPartyServiceImpl implements PoliticalPartyService {
    private final List<PoliticalParty> parties;

    public PoliticalPartyServiceImpl(List<PoliticalParty> parties) {
        this.parties = parties;
    }

    @Override
    public PoliticalParty findByName(String name) {
        for (PoliticalParty party : parties) {
            if (party.getName().equals(name)) {
                return party;
            }
        }
        return null;
    }
}