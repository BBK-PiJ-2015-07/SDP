package worksheet02.src;

import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Case on 18/02/2017.
 */
public class ObjectFactory {

    public static void main(String[] args){
        String[] input = getInput();

    }


    private static String[] getInput(){
        System.out.println("Enter classname and args as a single comma separated list:");

        //Using Scanner class for allowing input in IDE's console. For command line: String className = System.console().readLine();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strs = input.split("\\s*,\\s*");
        return  strs;
    }
}
