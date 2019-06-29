package br.com.modelmapper.modelmapper.service;

import br.com.modelmapper.modelmapper.model.dto.PersonDTO;
import br.com.modelmapper.modelmapper.model.entity.PersonEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperService {

    @Autowired
    private ModelMapper modelMapper;

    public PersonDTO simpleMapper(){

        PersonEntity personEntity = buildSimpleMapperEntity();

        return modelMapper.map(personEntity, PersonDTO.class);
    }

    private PersonEntity buildSimpleMapperEntity(){
        return new PersonEntity("Natalia", 22, "Negra");
    }
}
