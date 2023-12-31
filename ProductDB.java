import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDB {

    Connection conn = null;
    public ProductDB(){
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","8520");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void save(Product p) {
        String query = "insert into product(name, type, place, warranty) values (?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, p.getName());
            st.setString(2,p.getType());
            st.setString(3,p.getPlace());
            st.setInt(4,p.getWarranty());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}