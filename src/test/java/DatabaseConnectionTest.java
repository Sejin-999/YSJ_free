import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import static org.springframework.test.util.AssertionErrors.assertNotNull;
public class DatabaseConnectionTest {
    private static Connection connection;
    private static DataSource dataSource;

    @BeforeClass
    public static void setUp() {
        dataSource = DataSourceBuilder
                .create()
                .url("jdbc:mysql://localhost:3306/springdb")
                .username("root")
                .password("1234")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();

        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @AfterClass
    public static void tearDown() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testConnection() {
        assertNotNull("Database connection is null", connection);
    }
}
