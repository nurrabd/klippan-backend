package nur.rihamonline.io.domain;

import lombok.Data;




@Data
public class ProductInfo {
    private String municipality;
    private String  city;
    private String type;
    private String category;
    private String title;
    private String text;
    private String price;

}
