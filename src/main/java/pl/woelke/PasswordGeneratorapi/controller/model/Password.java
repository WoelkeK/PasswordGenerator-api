package pl.woelke.PasswordGeneratorapi.controller.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Password {

    private LocalDateTime day;
    private String password;

    public Password() {
    }
}
