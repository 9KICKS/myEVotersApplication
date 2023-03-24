package africa.semicolon.vote4change.data.repositories;

import africa.semicolon.vote4change.data.models.Candidate;
import java.util.List;

public interface CandidateRepository {
    List<Candidate> getAllCandidates();
    Candidate getCandidateById(int id);
    Candidate getCandidateByName(String name);
}