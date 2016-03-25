package com.goodcorner.entitymapper;

import com.goodcorner.model.Ad;
import com.goodcorner.persistence.entity.AdEntity;

import java.sql.Date;


public class AdEntityMapper {
    public AdEntity toEntity(Ad ad) {
        AdEntity adEntity = new AdEntity();
        adEntity.setId(ad.getId());
        adEntity.setDescription(ad.getDescription());
        adEntity.setEmail(ad.getEmail());
        adEntity.setName(ad.getName());
        adEntity.setPrice(ad.getPrice());
        adEntity.setTitle(ad.getTitle());
        adEntity.setCreationDate(Date.valueOf(ad.getCreationDate()));
        return adEntity;
    }

    public Ad fromEntity(AdEntity adEntity) {
        Ad ad = new Ad();
        ad.setId(adEntity.getId());
        ad.setDescription(adEntity.getDescription());
        ad.setEmail(adEntity.getEmail());
        ad.setName(adEntity.getName());
        ad.setPrice(adEntity.getPrice());
        ad.setTitle(adEntity.getTitle());
        ad.setCreationDate(ad.getCreationDate());
        return ad;
    }
}
