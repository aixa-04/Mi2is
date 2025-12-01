package IS.grupoD.Mi2is.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Hola Mundo! Esto lo hicimos el sábado 29/11/2025.";
    }

    @GetMapping("/")
    public String inicio() {
        return "Bienvenido a Mi2is";
    }

}
