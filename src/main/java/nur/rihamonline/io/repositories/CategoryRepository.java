package nur.rihamonline.io.repositories;



import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {


    Category findByName(String s);
    //Product getById(Long id);
}
