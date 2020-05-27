package lt.kb.bandomasis.egzaminas.services;

import lt.kb.bandomasis.egzaminas.dao.StudentasDao;
import lt.kb.bandomasis.egzaminas.model.Studentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Klase naudojama apsirasyt crud operacijoms naudojant Studentas tipo duomenims
 */
@Service
public class StudentasService {

    private final StudentasDao studentasDao;

    public StudentasService(StudentasDao studentasDao) {
        this.studentasDao = studentasDao;
    }

    public List<Studentas> getAllStudents() {

        return  studentasDao.findAll();
    }

}
