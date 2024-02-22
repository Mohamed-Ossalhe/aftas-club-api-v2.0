package ma.youcode.aftasclubapiv2.dto.requests;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import ma.youcode.aftasclubapiv2.enums.IdentityDocumentType;
import ma.youcode.aftasclubapiv2.enums.UserRole;

import java.time.LocalDate;

public record UserRequest(
        String name,
        String email,
        String password,
        String familyName,
        LocalDate accessionDate,
        String nationality,
        String role,
        String identityDocument,
        String identityNumber
) implements _Request {
}
