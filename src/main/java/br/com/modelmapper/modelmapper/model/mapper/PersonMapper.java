package br.com.modelmapper.modelmapper.model.mapper;

import br.com.modelmapper.modelmapper.model.dto.PersonDTO;
import br.com.modelmapper.modelmapper.model.entity.PersonEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class PersonMapper implements MapperLoader{

    @Override
    public void load(ModelMapper modelMapper) {
        TypeMap<PersonEntity, PersonDTO> typeMap = modelMapper.createTypeMap(PersonEntity.class, PersonDTO.class);

        typeMap.addMappings(mapper -> {
            mapper.map(PersonEntity::getRace,
                    PersonDTO::setEthnicity);
        });
    }

}
