package com.adamtheman.mypetclinic.services;

import com.adamtheman.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
