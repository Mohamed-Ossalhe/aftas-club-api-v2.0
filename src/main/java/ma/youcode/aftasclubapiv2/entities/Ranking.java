package ma.youcode.aftasclubapiv2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.youcode.aftasclubapiv2.entities.embedded.RankId;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ranking {
    @EmbeddedId
    RankId id;

    @Column(columnDefinition = "INT DEFAULT 0")
    private Integer rank;

    @Column(columnDefinition = "INT DEFAULT 0")
    private Integer score;
}
