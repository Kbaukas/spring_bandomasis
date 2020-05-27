package lt.kb.bandomasis.egzaminas;
import lt.kb.bandomasis.egzaminas.dao.PazymysDao;
import lt.kb.bandomasis.egzaminas.model.Pazymys;
import lt.kb.bandomasis.egzaminas.services.PazymysService;
import lt.kb.bandomasis.egzaminas.services.StudentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
import java.util.OptionalDouble;
@SpringBootApplication
//@EnableJpaRepositories
/**
 * Spring paleidziamasis main metodas
 */
public class EgzaminasApplication {

    public static void main(String[] args) {
        SpringApplication.run(EgzaminasApplication.class, args);}}