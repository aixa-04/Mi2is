package IS.grupoD.Mi2is.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola mundo";
    }

}