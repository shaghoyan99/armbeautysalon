package am.absweb.controller;

import am.abscomman.model.User;
import am.abscomman.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;
import java.util.Optional;

@ControllerAdvice
@RequiredArgsConstructor
public class HeaderController {

    private final UserService userService;

    @ModelAttribute("user")
    public User user (@AuthenticationPrincipal Principal principal) {
        String username = null;
        User user = null;
        if (principal != null) {
            username = principal.getName();
            Optional<User> byUsername = userService.findByUsername(username);
            user = byUsername.get();
        }
        return user;
    }
}
