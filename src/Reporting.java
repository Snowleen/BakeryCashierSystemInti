/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

    
     import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class Reporting {

    public static void main(String[] args) {
        generateSalesReport();
    }

    public static void generateSalesReport() {
        try {
            // Get the database connection
            Connection conn = DBConnection.getConnection();

            // SQL query to get sales data (total sales per product)
            String sql = "SELECT product_name, SUM(quantity) AS total_quantity_sold, SUM(total_price) AS total_sales FROM receipt_items GROUP BY product_name";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            // Create a CSV file to store the report
            FileWriter csvWriter = new FileWriter("sales_report.csv");

            // Write CSV header
            csvWriter.append("Product Name, Total Quantity Sold, Total Sales\n");

            // Process each record in the result set
            while (resultSet.next()) {
                String productName = resultSet.getString("product_name");
                int totalQuantitySold = resultSet.getInt("total_quantity_sold");
                double totalSales = resultSet.getDouble("total_sales");

                // Write data to the CSV file
                csvWriter.append(productName)
                        .append(",")
                        .append(String.valueOf(totalQuantitySold))
                        .append(",")
                        .append(String.valueOf(totalSales))
                        .append("\n");
            }

            // Close the CSV writer and database resources
            csvWriter.flush();
            csvWriter.close();
            resultSet.close();
            stmt.close();
            conn.close();

            System.out.println("Sales report generated successfully!");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
    

