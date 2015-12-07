package in.clayfish.elusen.controllers;

import in.clayfish.elusen.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author shuklaalok7
 * @since 07/12/15
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public User homepage(@PathParam(value = "name") String name) {
        User user = new User();
        user.setUsername(name);
        user.setPassword("bad_password");
        return user;
    }

}
