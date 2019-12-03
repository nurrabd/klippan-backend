package nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.City;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.Type;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.Municipality;

import javax.persistence.*;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String text;
    private String price;
    private String cat;
    private String cit;
    private String mun;
    private String typ;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private City city;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Type type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Municipality municipality;


    public String getCat() {
        return category.getName();
    }



    public String getCit() {
        return city.getName();
    }



    public String getMun() {
        return municipality.getName();
    }



    public String getTyp() {
        return type.getName();
    }


}
