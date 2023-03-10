package com.fooddelivery;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FoodDeliverySystem extends JFrame {
  // The list of menu items available for order
  private List<String> menu = new ArrayList<>();

  // The list of orders placed by customers
  private List<Order> orders = new ArrayList<>();

  public static void main(String[] args) {
    new FoodDeliverySystem().setVisible(true);
  }

  public FoodDeliverySystem() {
    // Set up the layout for the main window
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Add a label and list view for the menu items
    JLabel menuLabel = new JLabel("Menu:");
    constraints.gridx = 0;
    constraints.gridy = 0;
    add(menuLabel, constraints);

    DefaultListModel<String> menuModel = new DefaultListModel<>();
    JList<String> menuList = new JList<>(menuModel);
    constraints.gridx = 0;
    constraints.gridy = 1;
    add(menuList, constraints);

    // Add a label and text field for the customer name
    JLabel nameLabel = new JLabel("Name:");
    constraints.gridx = 1;
    constraints.gridy = 0;
    add(nameLabel, constraints);

    JTextField nameField = new JTextField();
    constraints.gridx = 1;
    constraints.gridy = 1;
    add(nameField, constraints);

    // Add a label and text field for the delivery address
    JLabel addressLabel = new JLabel("Address:");
    constraints.gridx = 2;
    constraints.gridy = 0;
    add(addressLabel, constraints);

    JTextField addressField = new JTextField();
    constraints.gridx = 2;
    constraints.gridy = 1;
    add(addressField, constraints);

    // Add a button to place the order
    JButton orderButton = new JButton("Place Order");
    constraints.gridx = 3;
    constraints.gridy = 1;
    add(orderButton, constraints);

    // Set up the logic for the order button
    orderButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Get the selected menu item and customer information
        String menuItem = menuList.getSelectedValue();
        String name = nameField.getText();
        String address = addressField.getText();

        // Create a new order and add it to the list of orders
        Order order = new Order(menuItem, name, address);
        orders.add(order);

        // Clear the form fields
        nameField.setText("");
        addressField.setText("");
      }
    });

    // Add some test data to the menu and list view
    menu.add("Pizza");
    menu.add("Hamburger");
    menu.add("Salad");
    for (String item : menu) {
      menuModel.addElement(item);
    }

    // Set the size and location of the main window
    setSize(500, 250);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
