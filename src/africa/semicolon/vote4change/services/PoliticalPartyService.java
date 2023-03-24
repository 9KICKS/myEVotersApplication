package africa.semicolon.vote4change.services;

import africa.semicolon.vote4change.data.models.PoliticalParty;

public interface PoliticalPartyService {
    PoliticalParty findByName(String name);
}