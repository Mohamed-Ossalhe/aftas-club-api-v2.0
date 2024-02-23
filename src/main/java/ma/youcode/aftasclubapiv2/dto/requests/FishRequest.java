package ma.youcode.aftasclubapiv2.dto.requests;

public record FishRequest(
        String name,
        Integer averageWeight
) implements _Request {
}
