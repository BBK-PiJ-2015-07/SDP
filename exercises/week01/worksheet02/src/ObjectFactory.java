package worksheet02.src;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import scala.xml.Null;

import java.lang.reflect.Constructor;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Case on 18/02/2017.
 */
public class ObjectFactory {

    public static void main(String[] args){
        String[] input = getInput();
        List<Constructor> cs = getMatchingConstructors(input);
        /*for(Constructor c : cs){

            System.out.println("-- " + c);
        }*/
    }

    /**
     * Gets user input, which should be a comma separated list of the class name and constructor args.
     * @return returns the input as a String[]. The first element is the class name, the rest are args.
     */
    private static String[] getInput(){
        System.out.println("Enter classname and args as a single comma separated list:");

        //Using Scanner class for allowing input in IDE's console. For command line: String className = System.console().readLine();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strs = input.split("\\s*,\\s*");
        return  strs;
    }

    /**
     *  Returns a list of constructors of a class that match the parameter count.
     * @param input The first element in the input String[] is the name of the class, the rest are arguments to the constructor.
     */
    private static List<Constructor> getMatchingConstructors(String[] input){

        Class cls = null;
        try {
            cls = Class.forName(input[0]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<Constructor> cs  = null;
        try {
             cs = Arrays.asList(cls.getConstructors());
        }catch(NullPointerException e){
            e.printStackTrace();
        }

        List<Constructor> cs2 = cs.stream()
                .filter(c -> c.getParameterCount() == input.length - 1)
                .collect(Collectors.toList());

        return cs2;
    }

}
