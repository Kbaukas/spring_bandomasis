package lt.kb.bandomasis.egzaminas.dao;

import lt.kb.bandomasis.egzaminas.model.Studentas;
import org.apache.catalina.Store;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentasDao  extends JpaRepository<Studentas,Integer> {

    @Override
    @EntityGraph(attributePaths = {"pazymys"})
//    @Query("select s from  Store s left join fetch s.productInStores")
    List<Studentas> findAll();

}
