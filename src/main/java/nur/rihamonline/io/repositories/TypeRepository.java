package nur.rihamonline.io.repositories;


import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {


    Type findByName(String s);
    //Product getById(Long id);
}
