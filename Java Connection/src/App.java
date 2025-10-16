import java.sql.*;
import java.util.Scanner;

public class App {

    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/java_avengers";
        String username = "root";
        String password = "root";

        con = DriverManager.getConnection(url, username, password);
        System.out.println("Connetion Established Successfully !");
        
        while (true) {
            System.out.println("Welcome To Avenger Database:");
            System.out.println("1. View Avengers");
            System.out.println("2. Add Avenger");
            System.out.println("3. Update Avenger");
            System.out.println("4. Delete Avenger");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":viewAvengers();
                    break;
                case "2":
                    addAvenger();
                    break;
                case "3":
                    updateAvenger();
                    break;
                case "4":
                    deleteAvenger();
                    break;
                case "5":
                    sc.close();
                    con.close();
                    System.out.println("Exiting...");
                    return;
                default: System.out.println("Invalid Input");
                    break;
            }
            

        }
    }

    public static void viewAvengers() throws SQLException{
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("SELECT * FROM avengers");

        while (rs.next()) {
            int ar_id = rs.getInt("ar_id");
            String f_name = rs.getString("f_name");
            String l_name = rs.getString("l_name");
            String heroic_name = rs.getString("heroic_name");
            String city = rs.getString("city");
            System.out.println(ar_id+"| "+f_name+"| "+l_name+"| "+heroic_name+"| "+city);
        } 

    }
    
    public static void addAvenger() throws SQLException {
        String insQuery ="INSERT INTO avengers(f_name,l_name,heroic_name,city) VALUES(?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(insQuery);
        System.out.println("Enter First Name: ");
        String f_name = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String l_name = sc.nextLine();
        System.out.println("Enter Heroic Name: ");
        String heroic_name = sc.nextLine();
        System.out.println("Enter City: ");
        String city = sc.nextLine();
        pst.setString(1, f_name);
        pst.setString(2, l_name);
        pst.setString(3, heroic_name);
        pst.setString(4, city);
        pst.executeUpdate();
        
    }
    
    public static void updateAvenger() throws SQLException {
        String updQuery = "UPDATE avengers SET heroic_name=? WHERE f_name=?";
        PreparedStatement pst = con.prepareStatement(updQuery);

        System.out.println("Enter the First name of the Hero:");
        String f_name = sc.nextLine();
        System.out.println("Enter the Heroic Name:");
        String heroic_name = sc.nextLine();

        pst.setString(1, heroic_name);
        pst.setString(2, f_name);
        pst.executeUpdate();

        int rows = pst.executeUpdate();
        if (rows > 0) {
            System.out.println("Operation successful!");
        } else {
            System.out.println("No matching record found.");
        }
    }
    
    public static void deleteAvenger() throws SQLException{
        String delQuery = "DELETE FROM avengers WHERE ar_id=?";
        PreparedStatement pst = con.prepareStatement(delQuery);
        System.out.println("Enter ar_id of avengers: ");
        int ar_id = sc.nextInt();
        pst.setInt(1, ar_id);
        pst.executeUpdate();

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Avenger deleted successfully.");
        } else {
            System.out.println("Avenger with given ID not found.");
        }
    }
}

