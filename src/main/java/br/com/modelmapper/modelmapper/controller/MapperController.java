package br.com.modelmapper.modelmapper.controller;

import br.com.modelmapper.modelmapper.model.dto.PersonDTO;
import br.com.modelmapper.modelmapper.service.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapperController {

    @Autowired
    private MapperService mapperService;

    @GetMapping
    public PersonDTO SimpleMapper() {
        return mapperService.simpleMapper();
    }
}
