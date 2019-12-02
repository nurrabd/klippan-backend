package nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.City;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Category;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, length = 250)
    private String name;

    //OneToMany with car
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "type", orphanRemoval = true)
    private List<Category> categories = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private City city;







}
