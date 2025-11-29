package IS.grupoD.Mi2is.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola mundo";
    }

    @GetMapping("/")
    public String home() {
        return "Bienvenido a la página principal";
    }

}