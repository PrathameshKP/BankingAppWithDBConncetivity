import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionClass {
    public Connection connectionMeathod() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "root", "4050");
        return con;
    }


}
