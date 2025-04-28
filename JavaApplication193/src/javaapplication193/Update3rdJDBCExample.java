package javaapplication193;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OracleConnection;
public class ListCars {
static final String QUERY = "SELECT Brand, Price FROM Cars";
public static void main(String[] args) {
try (Connection conn = OracleConnection.;
Statement stmt = conn.createStatement();
// Execute a query
ResultSet rs = stmt.executeQuery(QUERY);)
{//Begin of try-catch block/body.
// Extract data from result set
while (rs.next()) {
// Retrieve by column name
System.out.print("Brand: " + rs.getString("Brand"));
System.out.print(", Price: " + rs.getBigDecimal("price"));
System.out.println();
}
} catch (SQLException e) {
e.printStackTrace();
}
}
}
        }
 
    }
 
}