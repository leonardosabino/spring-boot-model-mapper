package br.com.modelmapper.modelmapper.model.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = 7255105065668327360L;

    private String name;
    private Integer age;
    private String race;

}
