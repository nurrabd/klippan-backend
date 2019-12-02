
package nur.rihamonline.io.controller;

import nur.rihamonline.io.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class RatingController {


    @Autowired
    private UserService userService;





}