package pl.woelke.PasswordGeneratorapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.woelke.PasswordGeneratorapi.controller.model.Password;
import pl.woelke.PasswordGeneratorapi.service.PasswordService;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequiredArgsConstructor
public class PasswordController {

    private static final Logger LOGGER = Logger.getLogger(PasswordController.class.getName());
    private final PasswordService passwordService;

    @GetMapping("/passwords")
    public List<Password> getPasswords() {

        List<Password> passwords = passwordService.getPasswords();
        return passwords;
    }

    @GetMapping("/passwords/{id}")
    public void getPassword(@PathVariable long id) {
        passwordService.getDailyPassword(id);
    }
}
