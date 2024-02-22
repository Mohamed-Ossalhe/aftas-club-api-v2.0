package ma.youcode.aftasclubapiv2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.youcode.aftasclubapiv2.enums.IdentityDocumentType;
import ma.youcode.aftasclubapiv2.enums.UserRole;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "_user")
@AllArgsConstructor
public class User extends AbstractEntity {
    private String name;
    private String familyName;
    private LocalDate accessionDate;
    private String nationality;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Enumerated(EnumType.STRING)
    private IdentityDocumentType identityDocument;

    @Column(unique = true, nullable = false)
    private String identityNumber;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Hunting> huntsList;

    @OneToMany(mappedBy = "id.user", fetch = FetchType.LAZY)
    private List<Ranking> rankings;
}
