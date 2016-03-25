package com.goodcorner.persistence.dao;

import com.goodcorner.persistence.entity.AdEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("adDao")
public class AdDao {

    @PersistenceContext
    private EntityManager manager;

    public void saveAd(AdEntity adEntity) {
        manager.persist(adEntity);
        manager.flush(); //this ensures that adEntity.getId() works
    }

//    @SuppressWarnings("unchecked")
//    public List<AdEntity> findAdEntities() {
//        Criteria criteria = getSession().createCriteria(AdEntity.class);
//        return (List<AdEntity>) criteria.list();
//    }
//
//    public AdEntity findById(String adEntityId){
//        Criteria criteria = getSession().createCriteria(AdEntity.class);
//        criteria.add(Restrictions.eq("id", adEntityId));
//        return (AdEntity) criteria.uniqueResult();
//    }
//
//    public void updateEntity(AdEntity adEntity){
//        getSession().update(adEntity);
//    }
}
