package nur.rihamonline.io.repositories;

import nur.rihamonline.io.domain.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Long> {


    //Product findByUsername(String username);
    //Product getById(Long id);
}
