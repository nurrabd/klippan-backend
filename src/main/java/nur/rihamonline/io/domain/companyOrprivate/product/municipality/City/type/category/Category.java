package nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, length = 250)
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Type type;

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "category", orphanRemoval = true)
    private List<Item> items  = new ArrayList<>();







}
