package com.adamtheman.mypetclinic.repositories;

import com.adamtheman.mypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
