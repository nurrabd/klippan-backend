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





    @ManyToOne(fetch = FetchType.LAZY)

    private Category category;
    @ManyToOne(fetch = FetchType.LAZY)

    private City city;
    @ManyToOne(fetch = FetchType.LAZY)

    private Type type;
    @ManyToOne(fetch = FetchType.LAZY)

    private Municipality municipality;


}
