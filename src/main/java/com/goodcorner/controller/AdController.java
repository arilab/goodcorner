package com.goodcorner.controller;

import com.goodcorner.model.Ad;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ad")
public class AdController {
    @RequestMapping(method = RequestMethod.POST)
    public Ad createAd(@RequestBody Ad ad) {
        return ad;
    }
}
