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
                "Lululemon Men''s Apparel",
                "Old apparel from an ex I''d rather sell than burn"
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