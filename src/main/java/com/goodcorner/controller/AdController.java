package com.goodcorner.controller;

import com.goodcorner.model.Ad;
import com.goodcorner.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ad")
public class AdController {

    @Autowired
    private AdService adService;

    @RequestMapping(method = RequestMethod.POST)
    public Ad createAd(@RequestBody Ad ad) {
        adService.createAd(ad);
        return ad;
    }
}
