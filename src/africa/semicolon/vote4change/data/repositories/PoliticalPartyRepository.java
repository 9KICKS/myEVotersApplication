package africa.semicolon.vote4change.data.repositories;

import africa.semicolon.vote4change.data.models.PoliticalParty;
import java.util.List;

public interface PoliticalPartyRepository {
    List<PoliticalParty> getAllParties();
    PoliticalParty getPartyById(int id);
    PoliticalParty getPartyByName(String name);
}