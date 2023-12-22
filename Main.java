import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


class Circle {

    double radious;

    Circle(double rad){
        radious = rad;
    }

    double getArea() {
        return radious * radious * Math.PI ;
    }
    double getPerimeter(){
        return 2 * Math.PI * radious;
    }
}

class Rectangle {
    double width, hight;
    Rectangle(double width, double hight){
        this.width = width;
        this.hight = hight;
    }
    double getArea(){
        return width*hight;
    }
    double getPerimeter(){
        return 2 * (width +  hight);
    }
}

class Square extends Rectangle {
    Square(double side){
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {

        JFrame frame =new JFrame("Perim & area Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        JPanel panel= new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    static void placeComponents(JPanel panel){
        panel.setLayout(null);
        String [] shapes ={"Circle", "Rectangle", "Square"};
        JComboBox<String> shapeList = new JComboBox<>(shapes);
        shapeList.setBounds(100, 50, 160, 25);
        panel.add(shapeList);

        JLabel inputMessageLabel =new JLabel("Choose the shape");
        inputMessageLabel.setBounds(100, 100, 160, 25);
        panel.add(inputMessageLabel);

        shapeList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shape = (String) shapeList.getSelectedItem();
                String lableName = null;

                if ("Circle".equals(shape)) {
                    lableName = "Enter Radius :";
                } else if ("Rectangle".equals(shape)) {
                    lableName = "Enter Width & Height :";
                } else if ("Square".equals(shape)) {
                    lableName = "Enter Side :";
                }
                inputMessageLabel.setText(lableName);
            }
        });



        JTextField textField =new JTextField(20);
        textField.setBounds(100, 130, 160, 25);
        panel.add(textField);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(90, 230, 300, 100);
        resultLabel.setFont(new java.awt.Font("Segoe UI", 1, 14));
        panel.add(resultLabel);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(100, 200, 160, 25);
        panel.add(calculateButton);


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shape = (String)shapeList.getSelectedItem();
                String input = textField.getText();
                try{
                    if ("Circle".equals(shape)) {
                        double radius = Double.parseDouble(input);
                        if (radius < 0) {
                            throw new IllegalArgumentException("Invalid input");
                        }
                        Circle circle = new Circle(radius);
                        resultLabel.setText("Area: " + (float)circle.getArea() + "    " +  "Perimeter: " + (float)circle.getPerimeter());

                    } else if ("Rectangle".equals(shape)) {
                        String[] numbers = input.split(" ");
                        double width = Double.parseDouble(numbers[0]);
                        double height = Double.parseDouble(numbers[1]);
                        if (width < 0 || height < 0) {
                            throw new IllegalArgumentException("Invalid input");
                        }
                        Rectangle rectangle = new Rectangle(width, height);
                        resultLabel.setText("Area: " + (float)rectangle.getArea() + "    " +  "Perimeter: " + (float)rectangle.getPerimeter());

                    } else if ("Square".equals(shape)) {
                        double side = Double.parseDouble(input);
                        if (side < 0) {
                            throw new IllegalArgumentException("Invalid input");
                        }
                        Square square = new Square(side);
                        resultLabel.setText("Area: " + (float)square.getArea() + "    " + "Perimeter: " + (float)square.getPerimeter());
                    }

                }catch (Exception ex){
                    resultLabel.setText("Invalid input");
                    return;
                }
            }
        });

    }

}
