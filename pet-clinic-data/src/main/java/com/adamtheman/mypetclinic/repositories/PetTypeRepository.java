package com.adamtheman.mypetclinic.repositories;

import com.adamtheman.mypetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
