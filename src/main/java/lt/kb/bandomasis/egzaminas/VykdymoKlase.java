package lt.kb.bandomasis.egzaminas;

import lt.kb.bandomasis.egzaminas.dao.PazymysDao;
import lt.kb.bandomasis.egzaminas.model.Pazymys;
import lt.kb.bandomasis.egzaminas.model.Studentas;
import lt.kb.bandomasis.egzaminas.services.PazymysService;
import lt.kb.bandomasis.egzaminas.services.StudentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Klase naudojama paleisti musu sukurtus medodus
 *
 *
 */

@Component
public  class VykdymoKlase implements CommandLineRunner {
    @Autowired
    private PazymysService pazymysService;
    @Autowired
    StudentasService studentasService;


    @Override
    public void run(String... args) throws Exception {

        String metai="2018-08-16";
        System.out.println("*************************** Studentai ******************************************");

        uzkrautiDuomenis().stream().sorted(Comparator.comparing(Studentas::getPavarde)
                .thenComparing(Studentas::getVardas))
                .forEach(studentas -> System.out.println("Vardas : "+studentas.getVardas()+" Pavarde: "+studentas.getPavarde()) );

//        uzkrautiDuomenis().stream().forEach(studentas -> studentas.getPazymys().forEach(pazymys -> System.out.println(pazymys.getPazymys())));
        System.out.println("---------------------- Studentu vidurkis ----------------------------------");
       System.out.println("Kurso vidurkis: " +kursoVidurkis(java.sql.Date.valueOf(metai)));
    }
    public double kursoVidurkis(Date metai) {
        OptionalDouble kursovid;
        kursovid = pazymysService.getAllPazymys().stream().filter(pazymys -> pazymys.getData().compareTo(metai) == 0)
                .mapToDouble(Pazymys::getPazymys).average();
        if (kursovid.isPresent()) return kursovid.getAsDouble();
        else {
            System.out.println("metais " + metai + " nera irasu");
            return 0;
        }

    }
    public List<Studentas> uzkrautiDuomenis(){
       return studentasService.getAllStudents();
         }
}
