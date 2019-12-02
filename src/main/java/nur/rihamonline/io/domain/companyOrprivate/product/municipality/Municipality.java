package nur.rihamonline.io.domain.companyOrprivate.product.municipality;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import nur.rihamonline.io.domain.companyOrprivate.product.Product;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.City;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Data
public class Municipality {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    @Column(unique = true, length = 250)
    private String name;

    //OneToMany with cities
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "municipality", orphanRemoval = true)
    private List<City> cities = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Product product;

    public Municipality() {
    }
}
