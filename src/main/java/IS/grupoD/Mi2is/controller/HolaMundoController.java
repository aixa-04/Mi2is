package IS.grupoD.Mi2is.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Hola Mundo!";
    }

    @GetMapping("/")
    public String inicio() {
        return "Bienvenido a Mi2is";
    }

}
