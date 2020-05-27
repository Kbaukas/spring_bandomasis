package lt.kb.bandomasis.egzaminas.services;

import lt.kb.bandomasis.egzaminas.dao.PazymysDao;
import lt.kb.bandomasis.egzaminas.model.Pazymys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

/**
 *Klase naudojama apsirasyt crud operacijoms naudojant Pazymys tipo duomenims
 *
 */
@Service
public class PazymysService {

    @Autowired
    private PazymysDao pazymysDao;
    public  PazymysService() {}

    public List<Pazymys> getAllPazymys() {
        return pazymysDao.findAll();

    }
}
