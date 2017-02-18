package worksheet02.src;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Case on 18/02/2017.
 */
public class ObjectFactory {

    public static void main(String[] args){
        List<String> input = getInput();
        List<Constructor> cs = getMatchingConstructors(input);
        for(Constructor c : cs){

            System.out.println("-- " + c);
            Object o = getObject(c, input);

        }


    }

    /**
     * Gets user input, which should be a comma separated list of the class name and constructor args.
     * @return returns the input as a String[]. The first element is the class name, the rest are args.
     */
    private static List<String> getInput(){
        System.out.println("Enter classname and args as a single comma separated list:");

        //Using Scanner class for allowing input in IDE's console. For command line: String className = System.console().readLine();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> strs = Arrays.asList(input.split("\\s*,\\s*"));
        return  strs;
    }

    /**
     *  Returns a list of constructors of a class that match the parameter count.
     * @param input The first element in the input String[] is the name of the class, the rest are arguments to the constructor.
     */
    private static List<Constructor> getMatchingConstructors(List<String> input){

        Class cls = null;
        try {
            cls = Class.forName(input.get(0));
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
                .filter(c -> c.getParameterCount() == input.size() - 1)
                .collect(Collectors.toList());

        return cs2;
    }


    private static Object getObject(Constructor c, List<String> input){

        input.remove(0); //keep arg strings only

        Class[] paramTypes = c.getParameterTypes();
        Object arguments[] = new Object[input.size()];

            for (int i = 0; i < input.size(); i++){
                
                try {
                    arguments[i] = paramTypes[i].getConstructor(String.class).newInstance(input.get(i));
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }

        Object o = null;
        try {
            o = c.newInstance(arguments);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return o;
    }

}
