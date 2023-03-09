package services;

import data.models.Candidate;
import dtos.requests.AddCandidateRequest;
import dtos.requests.EditCandidateRequest;
import dtos.requests.GetCandidateRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CandidateServiceImpl implements CandidateService {
    private final List<Candidate> candidates;

    private int nextCandidateId;

    public CandidateServiceImpl() {
        candidates = new ArrayList<>();
        nextCandidateId = 1;
    }

    @Override
    public List<Candidate> getCandidates() {
        return new ArrayList<>(candidates);
    }

    @Override
    public Candidate getCandidateById(int id) {
        return candidates.stream()
                .filter(candidate -> candidate.getCandidateID() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Candidate addCandidate(AddCandidateRequest request) {
        int candidateId = nextCandidateId++;
        Candidate candidate = new Candidate(candidateId, request.getCandidateName(), request.getPoliticalParty(), request.getElectionID());
        candidates.add(candidate);
        return candidate;
    }

    @Override
    public Candidate editCandidate(EditCandidateRequest request) {
        Candidate candidate = getCandidateById(request.getCandidateID());
        if (candidate == null) {
            return null;
        }
        candidate.setName(request.getCandidateName());
        candidate.setPoliticalParty(request.getPoliticalParty());
        return candidate;
    }

    @Override
    public void removeCandidate(int id) {
        candidates.removeIf(candidate -> candidate.getCandidateID() == id);
    }

    @Override
    public List<Candidate> searchCandidates(GetCandidateRequest request) {
        String name = request.getCandidateName();
        String party = request.getPoliticalParty();
        return candidates.stream()
                .filter(candidate -> (name == null || candidate.getName().contains(name))
                        && (party == null || candidate.getPoliticalParty().contains(party)))
                .collect(Collectors.toList());
    }
}