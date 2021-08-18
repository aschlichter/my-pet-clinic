package com.adamtheman.mypetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(Long id, String firstName, String lastname) {
        super(id);
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastname;

}
