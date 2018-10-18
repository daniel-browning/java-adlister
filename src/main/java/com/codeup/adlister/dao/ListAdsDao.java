package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public Long insert(Ad ad) {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }

        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "Television for sale",
                "Somebody please buy this tv"
        ));
        ads.add(new Ad(
                2,
                1,
                "Lululemon Men\'s Apparel",
                "Old apparel from an ex I\'d rather sell than burn."
        ));
        ads.add(new Ad(
                3,
                2,
                "Personal Assistant needed",
                "Fix my life, I need help!"
        ));
        ads.add(new Ad(
                4,
                2,
                "Apartment for rent",
                "Great condition, only a few roaches."
        ));
        return ads;
    }
}