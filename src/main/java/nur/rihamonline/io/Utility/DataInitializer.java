package nur.rihamonline.io.Utility;

import nur.rihamonline.io.domain.companyOrprivate.product.Product;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.City;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.Type;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Category;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Item;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.Municipality;
import nur.rihamonline.io.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;

@Component
public class DataInitializer {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private MunicipalityRepository municipalityRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private TypeRepository sellRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @PostConstruct
    public void init(){

        Product product = new Product();
        product.setId((long)1);
        product.setName("blocket");
        productRepository.save(product);


        Municipality vast = new Municipality("vast");
        Municipality ost = new Municipality("ost");
        Municipality norr = new Municipality("norr");
        Municipality syd = new Municipality("syd");
        municipalityRepository.save(ost);
        municipalityRepository.save(vast);
        municipalityRepository.save(norr);
        municipalityRepository.save(syd);


        City gbg = new City();
        gbg.setId((long)1);
        gbg.setName("gbg");
        cityRepository.save(gbg);

        Type kop = new Type();
        kop.setId((long)1);
        kop.setName("kop");
        sellRepository.save(kop);

        Category category = new Category();
        category.setId((long)1);
        category.setName("bil");
        categoryRepository.save(category);

        Item item = new Item();
        item.setId((long)1);
        item.setTitle("bil");

        itemRepository.save(item);



    }
}
