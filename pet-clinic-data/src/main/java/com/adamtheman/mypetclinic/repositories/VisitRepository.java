package com.adamtheman.mypetclinic.repositories;

import com.adamtheman.mypetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
