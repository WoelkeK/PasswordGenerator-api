package pl.woelke.PasswordGeneratorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.woelke.PasswordGeneratorapi.controller.model.Password;

@Repository
public interface PasswordRepository extends JpaRepository<Password, Long> {

}
