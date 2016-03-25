package com.goodcorner.service.validation;

import com.goodcorner.model.Ad;
import com.goodcorner.utilities.StringFunctions;
import org.springframework.stereotype.Service;

@Service("adValidator")
public class AdValidator {

    public String validateBeforeCreate(Ad ad) {
        StringBuilder mandatoryErrorMessages = validateMandatoryBeforeCreate(ad);
        if (mandatoryErrorMessages.length() != 0)
            return mandatoryErrorMessages.toString();

        if (ad.getId() != 0)
            return "Can not create an Ad if you specify an id";

        if (ad.getCreationDate() != null)
            return "Can not create an Ad if you specify a creation date";

        return "";
    }

    protected StringBuilder validateMandatoryBeforeCreate(Ad ad) {
        StringBuilder errorMessages = new StringBuilder();

        if (ad.getName()==null || StringFunctions.isBlank(ad.getName())) {
            errorMessages.append("Name is mandatory<br>");
        }
        if (ad.getEmail()==null || StringFunctions.isBlank(ad.getEmail())) {
            errorMessages.append("Email is mandatory<br>");
        }
        if (ad.getTitle()==null || StringFunctions.isBlank(ad.getTitle())) {
            errorMessages.append("Title is mandatory<br>");
        }
        if (ad.getDescription()==null || StringFunctions.isBlank(ad.getDescription())) {
            errorMessages.append("Description is mandatory<br>");
        }
        if (ad.getPrice()==null) {
            errorMessages.append("Price is mandatory<br>");
        }

        return errorMessages;
    }
}
