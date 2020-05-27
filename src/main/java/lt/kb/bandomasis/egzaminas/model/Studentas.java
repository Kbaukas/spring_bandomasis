package lt.kb.bandomasis.egzaminas.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Klase aprasanti studentai lentele duomenu bazeje
 *
 */
@Entity
@Table(name = "studentai")
public class Studentas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
   private Integer id;
    private String vardas;
    private String pavarde;
    private String el_pastas;
    @OneToMany(mappedBy = "studentas", fetch = FetchType.LAZY)
    private List<Pazymys> pazymys=new ArrayList<>();
       public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getEl_pastas() {
        return el_pastas;
    }

    public void setEl_pastas(String el_pastas) {
        this.el_pastas = el_pastas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Pazymys> getPazymys() {
        return pazymys;
    }

    public void setPazymys(List<Pazymys> pazymys) {
        this.pazymys = pazymys;
    }
}
