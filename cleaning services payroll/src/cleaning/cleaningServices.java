package cleaning;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class cleaningServices extends JFrame {
    public cleaningServices() {
        setTitle("Georgetown Cleaning Services - Employee Payroll");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLayout(new BorderLayout());

        // Employee Identification Panel
        JPanel employeeIdentificationPanel = new JPanel();
        TitledBorder title = BorderFactory.createTitledBorder(BorderFactory.createDashedBorder(Color.BLACK), "Employee Identification");
        employeeIdentificationPanel.setLayout(new GridLayout(1, 4));
        employeeIdentificationPanel.add(new JLabel("Employee Name:")); // Column 1: Row 1
        employeeIdentificationPanel.add(new JTextField()); // Column 2: Row 1
        employeeIdentificationPanel.add(new JLabel("Hourly Salary:")); // Column 3: Row 1
        employeeIdentificationPanel.add(new JTextField()); // Column 4: Row 1
        employeeIdentificationPanel.setBorder(title);

        // Time Sheet Panel
        JPanel timeSheetPanel = new JPanel();
        timeSheetPanel.setBorder(new DottedBorder(Color.BLACK, 1, 5, true)); // Custom dotted border
        timeSheetPanel.setLayout(new BorderLayout());
        timeSheetPanel.setBackground(Color.decode("#F5F2EA")); // Set background color
        String[] columnNames = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Object[][] data = {
                {"Week 1", "", "", "", "", "", "", ""},
                {"Week 2", "", "", "", "", "", "", ""}
        };
        JTable timeSheetTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(timeSheetTable);
        timeSheetPanel.add(scrollPane, BorderLayout.CENTER);
        timeSheetPanel.setPreferredSize(new Dimension(timeSheetPanel.getPreferredSize().width, 120)); // Reduce panel height

        // Payroll Processing Panel
        JPanel payrollProcessingPanel = new JPanel();
        TitledBorder border1 = BorderFactory.createTitledBorder(BorderFactory.createDashedBorder(Color.BLACK), "Payroll Processing");
        payrollProcessingPanel.setBorder(border1);
        payrollProcessingPanel.setLayout(new GridLayout(3, 9));

        // Column 1: Row 1-3
        JButton b = new JButton("Process It");
        payrollProcessingPanel.add(b);
        payrollProcessingPanel.add(new JLabel(""));
        payrollProcessingPanel.add(new JLabel("Hours:"));

        payrollProcessingPanel.add(new JLabel("Amount:"));

        payrollProcessingPanel.add(new JLabel(""));

        payrollProcessingPanel.add(new JLabel(""));

        payrollProcessingPanel.add(new JLabel("Regular:"));

        payrollProcessingPanel.add(new JTextField());
        payrollProcessingPanel.add(new JTextField());

        payrollProcessingPanel.add(new JLabel(""));

        payrollProcessingPanel.add(new JLabel(""));
        payrollProcessingPanel.add(new JLabel("Overtime"));

        payrollProcessingPanel.add(new JTextField());

        payrollProcessingPanel.add(new JTextField());

        payrollProcessingPanel.add(new JButton("Close"));

        add(employeeIdentificationPanel, BorderLayout.NORTH);
        add(timeSheetPanel, BorderLayout.CENTER);
        add(payrollProcessingPanel, BorderLayout.SOUTH);

        // Set Frame Visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        new cleaningServices();
    }

    // Custom DottedBorder class
    public static class DottedBorder extends LineBorder {
        private int dash;
		private Insets insets;

		public DottedBorder(Color color, int thickness, int length, boolean roundedCorners) {
            super(color, thickness, roundedCorners);
            this.insets = new Insets(0, 0, 0, 0);
            this.dash = length;
        }
    }
}
