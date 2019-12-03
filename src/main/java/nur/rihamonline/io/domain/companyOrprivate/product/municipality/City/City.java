package nur.rihamonline.io.domain.companyOrprivate.product.municipality.City;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.Type;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Item;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.Municipality;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, length = 250)
    private String name;
    //OneToMany with car
    @OneToMany(cascade = CascadeType.REFRESH,  mappedBy = "city", orphanRemoval = true)
    private List<Type> types = new ArrayList<>();
    @OneToMany(cascade = CascadeType.REFRESH,  mappedBy = "city", orphanRemoval = true)
    private List<Item> items = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Municipality municipality;







}
