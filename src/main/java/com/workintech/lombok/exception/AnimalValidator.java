package com.workintech.lombok.exception;

import com.workintech.lombok.entity.Animal;
import com.workintech.lombok.entity.Kangaroo;
import com.workintech.lombok.entity.Koala;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class AnimalValidator {

    public static void isIdValid(int id) {
        if (id <= 0) {
            throw new AnimalException("Id is not valid: " + id, HttpStatus.BAD_REQUEST);
        }
    }

    public static void isIdNotExist(Map animals, int id) {
        if (!animals.containsKey(id)) {
            throw new AnimalException("Animal with given id is not exist: " + id, HttpStatus.NOT_FOUND);
        }
    }

    public static void isIdExist(Map animals, int id) {
        if (animals.containsKey(id)) {
            throw new AnimalException("Animal with given id is already exist: " + id, HttpStatus.BAD_REQUEST);
        }
    }

    public static void isAnimalValid(Animal animal) {
        if ((animal.getName() == null || animal.getName().isEmpty()) ||
                animal.getWeight() <= 0 || animal.getWeight() > 100) {
            throw new AnimalException("Animal credentials are not valid", HttpStatus.BAD_REQUEST);
        }
    }

    public static void isKangarooValid(Kangaroo kangaroo){
        if((kangaroo.getHeight() < 0.5 || kangaroo.getHeight() > 2.00)){
            throw new AnimalException("Kangaroo credentials are not valid", HttpStatus.BAD_REQUEST);
        }
    }

    public static void isKoalaValid(Koala koala){
        if(koala.getSleepHour() < 18){
            throw new AnimalException("Koala credentials are not valid", HttpStatus.BAD_REQUEST);
        }
    }

}
