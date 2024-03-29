package com.api.generator.api.controller;

import com.api.generator.api.model.Pet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class PetsController implements com.api.generator.api.controller.PetsApi {

    @Override
    public void createPets(List<Pet> pet) {
    }

    @Override
    public List<Pet> listPets(Integer limit) {
        return List.of(new Pet(1L, "name"), new Pet(2L, "name"));
    }

    @Override
    public Pet showPetById(String petId) {
        return new Pet(Long.valueOf(petId), "name");
    }
}
