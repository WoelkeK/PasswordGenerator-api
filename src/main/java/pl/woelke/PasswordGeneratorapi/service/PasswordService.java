package pl.woelke.PasswordGeneratorapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import pl.woelke.PasswordGeneratorapi.controller.model.Password;
import pl.woelke.PasswordGeneratorapi.repository.PasswordRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PasswordService {

    private final PasswordRepository passwordRepository;

    public List<Password> getPasswords() {
        List<Password> passwords = passwordRepository.findAll();
        return passwords;
    }

    public void getDailyPassword(@PathVariable Long id) {
        Optional<Password> dailyPassword = passwordRepository.findById(id);
    }
}
