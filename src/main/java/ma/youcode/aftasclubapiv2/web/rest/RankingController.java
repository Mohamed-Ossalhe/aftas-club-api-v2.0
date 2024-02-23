package ma.youcode.aftasclubapiv2.web.rest;

import lombok.RequiredArgsConstructor;
import ma.youcode.aftasclubapiv2.dto.requests.RankRequest;
import ma.youcode.aftasclubapiv2.dto.responses.RankResponse;
import ma.youcode.aftasclubapiv2.entities.embedded.RankId;
import ma.youcode.aftasclubapiv2.services.RankingService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/rankings")
public class RankingController extends _Controller<RankId, RankRequest, RankResponse, RankingService> {
}
