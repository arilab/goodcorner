package com.goodcorner.service;

import com.goodcorner.entitymapper.AdEntityMapper;
import com.goodcorner.model.Ad;
import com.goodcorner.persistence.dao.AdDao;
import com.goodcorner.persistence.entity.AdEntity;
import com.goodcorner.service.validation.AdValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;


@Service("adService")
@Transactional
public class AdService {
    @Autowired
    private AdDao adDao;

    @Autowired
    private AdValidator adValidator;

    public Ad createAd(Ad ad) {
        if (adValidator.validateBeforeCreate(ad).isEmpty() == false)
            return ad;
        ad.setCreationDate(LocalDate.now());

        AdEntityMapper adEntityMapper = new AdEntityMapper();
        AdEntity adEntity = adEntityMapper.toEntity(ad);
        adDao.saveAd(adEntity);
        ad.setId(adEntity.getId());
        return ad;
    }
}
