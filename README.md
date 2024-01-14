# Shape Calculator

## Overview

Welcome to the third-semester project – the Shape Calculator! This Java application, developed as part of our semester project, is a Graphical User Interface (GUI) program designed to calculate the area and perimeter of various shapes, including Circle, Rectangle, and Square. The application employs Java Swing for creating an interactive and user-friendly interface.

## Features

### 1. Shape Selection

Users can choose the shape they want to calculate the area and perimeter for from a drop-down list featuring Circle, Rectangle, and Square.

### 2. Dynamic Input Label

To enhance user experience, the input label dynamically changes based on the selected shape, providing clear guidance on the required input.

### 3. Input Field

A user-friendly text field allows users to input the necessary values such as radius, width, height, or side length.

### 4. Calculation Button

Clicking the "Calculate" button triggers the computation based on the selected shape and input values.

### 5. Error Handling

The application gracefully handles invalid inputs, displaying an error message if the input is not numeric or if it's a negative value.

### 6. Result Display

Upon calculation, the area and perimeter are displayed on the GUI, providing users with instant feedback.

## Project Structure

### - Circle Class

Represents a circle with methods to calculate its area and perimeter.

### - Rectangle Class

Represents a rectangle with methods to calculate its area and perimeter.

### - Square Class (extends Rectangle)

Represents a square, inheriting the properties and methods from the Rectangle class.

### - Main Class

Contains the main method for launching the GUI. It creates a JFrame and sets up the UI components.

### - GUI Components

The GUI includes a drop-down list, input label, input text field, result label, and a "Calculate" button.

### - Event Handling

Action listeners are employed to respond to events like selecting a shape or clicking the "Calculate" button.

## Dependencies

- **Java Swing Library**: Utilized for creating the graphical user interface.

## How to Run

1. Ensure you have Java installed on your system.
2. Clone the repository to your local machine.
3. Compile and run the `Main.java` file.
4. The GUI will open, providing an intuitive interface for interacting with the application.

## Contributors

- Abdulrahman Nasser.
- Hassan Khalaf.
- Youssef Mohammed.


