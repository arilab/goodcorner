package com.goodcorner.service.validation;

import com.goodcorner.model.Ad;
import org.junit.Test;


public class AdValidatorTest {

    @Test
    public void Ad_should_not_have_null_id() {
        Ad ad = new Ad();

        assert(ad.getId() == 0);
    }


}
