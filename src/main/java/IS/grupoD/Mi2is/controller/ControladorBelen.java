package IS.grupoD.Mi2is.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorBelen {

    @GetMapping("/")
    public String hola() {
        return "Bienvenido a la página principal";
    }

}