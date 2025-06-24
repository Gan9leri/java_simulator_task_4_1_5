import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args){
        int x, y;
        String direction, result;
        String[] inputValues = readInput();
        x = parseInt(inputValues[0]);
        y = parseInt(inputValues[1]);
        direction = inputValues[2];
        switch (direction) {
            case "up" -> y = y - 1;
            case "down" -> y = y + 1;
            case "left" -> x = x - 1;
            case "right" -> x = x + 1;
        }
        result = "x: " + x + "," + " " + "y: " + y + "," + " " + "direction: " + direction;
        System.out.println(result);


    }

    public static String[] readInput(){
        String[] inputValues = new String[3];
        String input;
        String[] values;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            input = scanner.nextLine();
            values = input.split(" ");
            for (int i = 0; i < 3; i++){
                inputValues[i] = values[i];
            }
        }
        scanner.close();
        return inputValues;
    }
}
