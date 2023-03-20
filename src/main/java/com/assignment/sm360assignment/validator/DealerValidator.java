package com.assignment.sm360assignment.validator;

import com.assignment.sm360assignment.dtos.DealerDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DealerValidator {

    public static List<String> validate(DealerDto dealerDto){
        List<String> errors = new ArrayList<>();

        if (dealerDto == null) {
            errors.add("Veuillez renseigner le nom du Dealer");
            errors.add("Veuillez renseigner la limite de publication");

            return errors;
        }

        if (!StringUtils.hasLength(dealerDto.getName())){
            errors.add("Veuillez renseigner le nom du Dealer");
        }
        if (dealerDto.getLimit_p() == Integer.parseInt(null)){
            errors.add("Veuillez renseigner la limite de publication");
        }
        return errors;
    }
 }
