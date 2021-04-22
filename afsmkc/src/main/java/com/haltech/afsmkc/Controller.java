package com.haltech.afsmkc;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;

@RestController
@RequestMapping("/harmadik")
public class Controller {

    @GetMapping()
    public String harmadik(@RequestParam(required = false) String name) {
        if (!StringUtils.hasText(name)) {name = "Felhasznalo";}
        return MessageFormat.format("Hello {0}!", name);
    }

    @PostMapping("/megfordit")
    public String megfordit(@RequestParam(required = false) String text) {
        if (!StringUtils.hasText(text)) {text = "Alma a fa alatt";}
        return new StringBuilder(text).reverse().toString();
    }
}
