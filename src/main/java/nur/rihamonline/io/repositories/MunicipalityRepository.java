package nur.rihamonline.io.repositories;

import nur.rihamonline.io.domain.companyOrprivate.product.municipality.Municipality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipalityRepository extends CrudRepository<Municipality, Long> {


    Municipality findByName(String s);
    //Product getById(Long id);
}
