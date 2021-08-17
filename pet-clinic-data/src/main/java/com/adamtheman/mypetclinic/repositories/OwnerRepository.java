package com.adamtheman.mypetclinic.repositories;

import com.adamtheman.mypetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
