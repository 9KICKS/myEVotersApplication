package africa.semicolon.vote4change.data.repositories;

import africa.semicolon.vote4change.data.models.User;
import africa.semicolon.vote4change.data.models.Vote;
import java.util.ArrayList;
import java.util.List;

public class VoteRepositoryImpl implements VoteRepository {
    private final List<Vote> votes = new ArrayList<>();

    private int nextVoteId = 1;

    @Override
    public Vote addVote(Vote vote) {
        int voteId = nextVoteId++;
        vote.setVoteID(voteId);
        votes.add(vote);
        return vote;
    }

    @Override
    public Vote getVote(int voteId) {
        for (Vote vote : votes) {
            if (vote.getVoteID() == voteId) {
                return vote;
            }
        }
        return null;
    }

    @Override
    public List<Vote> getAllVotes() {
        return new ArrayList<>(votes);
    }

    @Override
    public List<Vote> getVotesByUser(User user) {
        List<Vote> userVotes = new ArrayList<>();
        for (Vote vote : votes) {
            if (vote.getUser().equals(user)) {
                userVotes.add(vote);
            }
        }
        return userVotes;
    }

    @Override
    public void deleteVote(int voteId) {
        Vote voteToRemove = null;
        for (Vote vote : votes) {
            if (vote.getVoteID() == voteId) {
                voteToRemove = vote;
                break;
            }
        }
        if (voteToRemove != null) {
            votes.remove(voteToRemove);
        }
    }
}