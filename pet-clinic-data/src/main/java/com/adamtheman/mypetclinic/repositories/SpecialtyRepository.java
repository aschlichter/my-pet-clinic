package com.adamtheman.mypetclinic.repositories;

import com.adamtheman.mypetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
