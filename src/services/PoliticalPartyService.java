package services;

import data.models.PoliticalParty;

public interface PoliticalPartyService {
    PoliticalParty findByName(String name);
}
