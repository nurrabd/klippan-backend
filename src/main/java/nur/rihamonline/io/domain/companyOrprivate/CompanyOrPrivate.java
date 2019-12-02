package nur.rihamonline.io.domain.companyOrprivate;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CompanyOrPrivate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;




}
