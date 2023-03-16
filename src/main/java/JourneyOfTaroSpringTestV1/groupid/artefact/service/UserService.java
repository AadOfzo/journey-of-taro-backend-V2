package JourneyOfTaroSpringTestV1.groupid.artefact.service;

import JourneyOfTaroSpringTestV1.groupid.artefact.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RequestMapping("api/v1/users")
public class UserService {

    @GetMapping
    public List<User> getUsers() {
        return List.of();
    }
}
