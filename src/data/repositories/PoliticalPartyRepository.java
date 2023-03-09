package data.repositories;

import data.models.PoliticalParty;

import java.util.List;

public interface PoliticalPartyRepository {
    List<PoliticalParty> getAllParties();

    PoliticalParty getPartyById(int id);
}