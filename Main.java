package estudoDeCaso;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Employee employee;
        String output = "";

        Boss boss = new Boss("John", "Smith", 800.0);

        CommissionWorker commissionWorker = new CommissionWorker("Sue", "Jones", 400.0, 3.0, 150);

        PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", 2.5, 200);

        HourlyWorker hourlyWorker = new HourlyWorker("Karen", "Price", 13.75, 40.0);

        DecimalFormat precision2 = new DecimalFormat("0.00");

        employee = boss;

        output += employee.toString() + " earned $" +
                precision2.format(employee.earning()) + "\n";

        employee = commissionWorker;

        output += employee.toString() + " earned $" +
                precision2.format(employee.earning()) + "\n" ;

        employee = pieceWorker;

        output += employee.toString() + " earned $" +
                precision2.format(employee.earning()) + "\n" ;


        employee = hourlyWorker;

        output += employee.toString() + " earned $" +
                precision2.format(employee.earning()) + "\n" ;

        JOptionPane.showMessageDialog(null, output, "Demonstrating Polymorphism", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}
