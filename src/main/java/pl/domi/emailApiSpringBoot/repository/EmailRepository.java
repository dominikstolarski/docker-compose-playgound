package pl.domi.emailApiSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.domi.emailApiSpringBoot.domain.Email;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {

}
