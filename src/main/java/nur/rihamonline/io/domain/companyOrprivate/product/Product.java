package nur.rihamonline.io.domain.companyOrprivate.product;
import lombok.Data;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.Municipality;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, length = 250)
    private String name;

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "product", orphanRemoval = true)
    private List<Municipality> municipalities = new ArrayList<>();








}
