package nur.rihamonline.io.services;
import nur.rihamonline.io.domain.ProductInfo;
import nur.rihamonline.io.domain.companyOrprivate.product.Product;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.City;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.Type;

import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Category;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Item;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.Municipality;
import nur.rihamonline.io.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private MunicipalityRepository municipalityRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private TypeRepository typeRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ItemRepository itemRepository;

    public Iterable<Product> findAllProducts(){


        return productRepository.findAll();
    }


    public Product saveOrUpdateProject(Product project) {

        return productRepository.save(project);
    }

    public Item saveOrUpdateItem(Item item){
        return itemRepository.save(item);
    }




    public Product saveOrUpdateProduct(ProductInfo productInfo) {

        Product product1 = productRepository.getById((long)1);
        System.out.println(product1.getId());

        Municipality municipality = municipalityRepository.findByName(productInfo.getMunicipality());
        System.out.println(municipality.getId());
        municipality.setProduct(product1);

        City city = cityRepository.findByName(productInfo.getCity());
        city.setMunicipality(municipality);
        Type type = typeRepository.findByName(productInfo.getType());
        type.setCity(city);
        Category category = categoryRepository.findByName(productInfo.getCategory());
        category.setType(type);
        Item item = new Item();
        item.setCategory(category);
        item.setCity(city);
        item.setMunicipality(municipality);
        item.setType(type);
        item.setTitle(productInfo.getTitle());
        item.setPrice(productInfo.getPrice());
        item.setText(productInfo.getText());
        itemRepository.save(item);



       return productRepository.save(product1);


    }


    public Municipality findAllProductsByMunicipality(String s) {
        return municipalityRepository.findByName(s);
    }

    public Iterable<Item> findAllProductsByItems() {
        return itemRepository.findAll();
    }
}
