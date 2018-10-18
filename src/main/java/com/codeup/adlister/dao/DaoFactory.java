package com.codeup.adlister.dao;
import com.codeup.adlister.models.Config;

import java.io.ObjectInputFilter;

public class DaoFactory {
    private static Ads adsDao;
    private static ObjectInputFilter.Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
