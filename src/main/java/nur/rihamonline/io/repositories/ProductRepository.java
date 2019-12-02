package nur.rihamonline.io.repositories;

import nur.rihamonline.io.domain.companyOrprivate.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


    Product findByName(String s);
    Product getById(Long id);
}
