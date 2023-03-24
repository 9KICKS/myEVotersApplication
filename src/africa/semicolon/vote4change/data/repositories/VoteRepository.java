package africa.semicolon.vote4change.data.repositories;

import africa.semicolon.vote4change.data.models.User;
import africa.semicolon.vote4change.data.models.Vote;
import java.util.List;

public interface VoteRepository {
    Vote addVote(Vote vote);
    Vote getVote(int voteId);
    List<Vote> getAllVotes();
    List<Vote> getVotesByUser(User user);
    void deleteVote(int voteId);
}