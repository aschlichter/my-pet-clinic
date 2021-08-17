package com.adamtheman.mypetclinic.repositories;

import com.adamtheman.mypetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
