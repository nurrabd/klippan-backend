
package nur.rihamonline.io.controller;


import nur.rihamonline.io.domain.ProductInfo;
import nur.rihamonline.io.domain.companyOrprivate.product.Product;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.City.type.category.Item;
import nur.rihamonline.io.domain.companyOrprivate.product.municipality.Municipality;
import nur.rihamonline.io.repositories.MunicipalityRepository;
import nur.rihamonline.io.services.MapValidationErrorService;
import nur.rihamonline.io.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@CrossOrigin
@RequestMapping("/api/product")
public class ProductController {


    @Autowired
    private ProductService productService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @GetMapping("/all")
    public Iterable<Product> findAllProjects(){

        return productService.findAllProducts();
    }

    @GetMapping("/kommun/{s}")
    public Municipality findAllProjectsByMunicipality( @PathVariable String s){

        return productService.findAllProductsByMunicipality(s);
    }

//hittta alla genomitems
//hittta alla genomitems
    @GetMapping("/allitems")
    public Iterable<Item> findAllProjectsByItems(){

        return productService.findAllProductsByItems();
    }


    @PostMapping("/createk")
    public ResponseEntity<?> createNewMunci(@Valid @RequestBody ProductInfo project, BindingResult result, Principal principal){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        Product project1 = productService.saveOrUpdateProduct(project);
        return new ResponseEntity<Product>(project1, HttpStatus.CREATED);
    }

}