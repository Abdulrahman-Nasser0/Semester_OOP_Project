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

        JPanel panel= new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);

    }

    static void placeComponents(JPanel panel){
        panel.setLayout(null);
        String [] shapes ={"Circle", "Rectangle", "Square"};
        JComboBox<String> shapeList = new JComboBox<>(shapes);
        shapeList.setBounds(10, 10, 160, 25);

        panel.add(shapeList);

        JTextField textField =new JTextField(20);
        textField.setBounds(180, 10, 160, 25);
        panel.add(textField);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 80, 300, 100);
        panel.add(resultLabel);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 40, 160, 25);
        panel.add(calculateButton);
        //Action
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shape = (String)shapeList.getSelectedItem();
                String input = textField.getText();
                try{
                    if(shape == "Circle"){
                        double radius = Double.parseDouble(input);
                        Circle circle = new Circle(radius);
                        resultLabel.setText("Area: " + (float)circle.getArea() + "    " +  "Perimeter: " + (float)circle.getPerimeter());

                    }else if(shape == "Rectangle" ){
                        String[] numbers = input.split(" ");
                        double width = Double.parseDouble(numbers[0]);
                        double hight = Double.parseDouble(numbers[1]);

                        Rectangle rectangle = new Rectangle(width, hight);
                        resultLabel.setText("Area: " + (float)rectangle.getArea() + "    " +  "Perimeter: " + (float)rectangle.getPerimeter());

                    }else if(shape == "Square"){
                        double side = Double.parseDouble(input);
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
