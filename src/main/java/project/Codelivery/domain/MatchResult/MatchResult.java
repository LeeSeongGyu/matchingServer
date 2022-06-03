package project.Codelivery.domain.MatchResult;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.Codelivery.domain.BaseTimeEntity;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Match_result")
public class MatchResult extends BaseTimeEntity {
    @Id
    @Column(name = "match_id")
    private int matchId;

    @Column
    private int user1;
    private int user2;
    private int user1_result;
    private int user2_result;

    @Builder
    public MatchResult(int user1, int user2){
        this.matchId = (user1*100000) + user2;
        this.user1 = user1;
        this.user2 = user2;
    }
}
