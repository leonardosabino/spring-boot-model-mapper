package br.com.modelmapper.modelmapper.config;

import java.util.Set;

import br.com.modelmapper.modelmapper.model.mapper.MapperLoader;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.reflections.Reflections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() throws Exception {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        var reflections = new Reflections("br.com.modelmapper.modelmapper.model.mapper");

        Set<Class<? extends MapperLoader>> allClasses = reflections.getSubTypesOf(MapperLoader.class);

        for (Class clazz : allClasses) {
            if (!clazz.isInterface()) {
                var instance = clazz.newInstance();
                ((MapperLoader) instance).load(modelMapper);
            }
        }

        return modelMapper;
    }

}
