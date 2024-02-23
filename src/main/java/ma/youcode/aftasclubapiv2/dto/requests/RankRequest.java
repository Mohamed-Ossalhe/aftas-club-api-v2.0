package ma.youcode.aftasclubapiv2.dto.requests;

public record RankRequest(
        Integer rank,
        Integer score
) implements _Request {
}
