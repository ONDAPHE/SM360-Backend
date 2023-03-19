package com.assignment.sm360assignment.validator;

import com.assignment.sm360assignment.dtos.ListingDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ListingValidator {

        public static List<String> validate(ListingDto listingDto){
            List errors = new ArrayList<>();

            if (listingDto == null) {
                errors.add("Veuillez renseigner le nom du vehicule");
                errors.add("Veuillez renseigner le prix du vehicule");
                errors.add("Veuillez renseigner la date de publication");
                errors.add("Veuillez renseigner l'etat de la publication ");
                errors.add("Veuillez selectionner un dealer");

                return errors;
            }

            if (!StringUtils.hasLength(listingDto.getVehiculeDto())){
                errors.add("Veuillez renseigner le nom du vehicule");
            }

            if (listingDto.getPriceDto() == null){
                errors.add("Veuillez renseigner le prix du vehicule");
            }
            if (!StringUtils.hasLength(String.valueOf(listingDto.getStateDto()))){
                errors.add("Veuillez renseigner l'etat de la publication ");
            }
            if (listingDto.getCreatedAtDto() == null){
                errors.add("Veuillez renseigner la date de publication");
            }
            if (listingDto.getDealerDto()==null || (listingDto.getDealerDto().getIdDealer() == Integer.parseInt(null))){
                errors.add("Veuillez selectionner un dealer");
            }

            return errors;
        }
}
