import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;


public class MySQLAdsDao implements Ads {

    Connection connection;

    public MySQLAdsDao(Config config) {
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        String query = "SELECT * FROM ads";
        List<Ad> ads = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                ads.add(createAdFromResults(rs));
            }

            return ads;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Ad createAdFromResults(ResultSet rs){
        try {

            return new Ad(
                    rs.getLong("id"),
                    rs.getLong("userId"),
                    rs.getString("title"),
                    rs.getString("description")
            );

        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Long insert(Ad ad) {
        String query = String.format("INSERT INTO ads (user_id, title, description) VALUES(%d,'%s','%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong("id");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}