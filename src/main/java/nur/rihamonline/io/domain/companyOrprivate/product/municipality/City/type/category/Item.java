package nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
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
    @JsonIgnore
    private Category category;


}
