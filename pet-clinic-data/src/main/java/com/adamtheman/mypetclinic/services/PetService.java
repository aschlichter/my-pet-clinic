package com.adamtheman.mypetclinic.services;

import com.adamtheman.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
