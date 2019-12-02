package nur.rihamonline.io.repositories;



import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {


    //Car findByName(String s);
    //Product getById(Long id);
}
