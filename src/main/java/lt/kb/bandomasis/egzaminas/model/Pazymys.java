package lt.kb.bandomasis.egzaminas.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Klase aprasanti pazymiai lentele duomenu bazeje
 */
@Entity
@Table(name = "pazymiai")
public class Pazymys {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    private Date data;
    private Integer pazymys;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST}, optional = false)
    @JoinColumn(name = "studentas_id")
    private Studentas studentas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getPazymys() {
        return pazymys;
    }

    public void setPazymys(Integer pazymys) {
        this.pazymys = pazymys;
    }
}
