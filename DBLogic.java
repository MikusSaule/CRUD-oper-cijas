import java.sql.*;

public class DBLogic {


    String DB = "jdbc:mysql://localhost:3306/CRUD operācija";
    String USER = "root";
    String PASS = "Kjkszpj-1997";

    // insert
    public void insert(){
        try {
            // connections
            Connection conn = DriverManager.getConnection(DB,USER,PASS);

            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO users (ID, Name) VALUES ('1', 'Mikus')";

            stmt.executeUpdate(sql);

            System.out.println("Dati ievadīti!");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // update
    public void update(){
        try {
            // connections
            Connection conn = DriverManager.getConnection(DB,USER,PASS);

            Statement stmt = conn.createStatement();

            String sql = "UPDATE users SET Name = 'MikusSaule' WHERE ID = 1";

            stmt.executeUpdate(sql);

            System.out.println("Dati atjaunoti!");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // delete
    public void delete(){
        try {
            // connections
            Connection conn = DriverManager.getConnection(DB,USER,PASS);

            Statement stmt = conn.createStatement();

            String sql = "DELETE FROM users WHERE Name = 'MikusSaule'";

            stmt.executeUpdate(sql);

            System.out.println("Dati izdzēsti!");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // select
    public void select(){
        try {
            // connections
            Connection conn = DriverManager.getConnection(DB,USER,PASS);

            Statement stmt = conn.createStatement();

            String sql = "SELECT *  FROM users WHERE Name = 'Mikus' ";

            stmt.executeQuery(sql);

            ResultSet rs = stmt.getResultSet();
            System.out.println("Data beeing showed:");
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

