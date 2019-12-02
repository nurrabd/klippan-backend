package nur.rihamonline.io.repositories;

import nur.rihamonline.io.domain.companyOrprivate.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MassageRepository extends CrudRepository<Product, Long> {


    //Product findByUsername(String username);
    //Product getById(Long id);
}
