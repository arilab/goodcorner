package com.goodcorner.service;

import com.goodcorner.model.Ad;
import com.goodcorner.persistence.dao.AdDao;
import com.goodcorner.persistence.entity.AdEntity;
import com.goodcorner.service.validation.AdValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AdServiceTest {

    @Mock
    private AdDao adDao;

    @Mock
    private AdValidator adValidator;

    @InjectMocks
    private AdService adService;

    @Test
    public void createAd_should_initialize_creation_date_as_today() {
        Ad adWithoutCreationDate = new Ad();
        adWithoutCreationDate.setCreationDate(null);
        String EMPTY_STRING = "";
        doReturn(EMPTY_STRING).when(adValidator).validateBeforeCreate(any(Ad.class));

        Ad actualReturnedAd = adService.createAd(adWithoutCreationDate);

        assertThat(actualReturnedAd.getCreationDate()).isToday();
    }

    @Test
    public void createAd_should_return_ad_with_id() {
        Ad adWithZeroId = new Ad();
        adWithZeroId.setId(0);
        String EMPTY_STRING = "";
        final int expectedAdId = 154;
        doReturn(EMPTY_STRING).when(adValidator).validateBeforeCreate(any(Ad.class));
        doAnswer(new Answer() {
            public Object answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                AdEntity adEntityToSave = (AdEntity)args[0];
                adEntityToSave.setId(expectedAdId);
                return null;
            }}).when(adDao).saveAd(any(AdEntity.class));

        Ad actualReturnedAd = adService.createAd(adWithZeroId);

        assertThat(actualReturnedAd.getId()).isEqualTo(expectedAdId);
    }
}