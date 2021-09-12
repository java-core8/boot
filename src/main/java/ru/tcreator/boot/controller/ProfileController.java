package ru.tcreator.boot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tcreator.boot.profile.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {
    private final SystemProfile profile;

    ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getStr() {
        return profile.getProfile();
    }

}
