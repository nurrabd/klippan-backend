package nur.rihamonline.io.repositories;

import nur.rihamonline.io.domain.companyOrprivate.product.Product;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {


    City findByName(String city);
    //Product getById(Long id);
}
