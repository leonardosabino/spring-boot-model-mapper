package br.com.modelmapper.modelmapper.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO implements Serializable {

    private static final long serialVersionUID = 2053451254782469370L;

    private String name;
    private Integer age;
    private String ethnicity;

    protected boolean canEqual(final Object other) {
        return other instanceof PersonDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $age = this.getAge();
        result = result * PRIME + ($age == null ? 43 : $age.hashCode());
        final Object $ethnicity = this.getEthnicity();
        result = result * PRIME + ($ethnicity == null ? 43 : $ethnicity.hashCode());
        return result;
    }

}
