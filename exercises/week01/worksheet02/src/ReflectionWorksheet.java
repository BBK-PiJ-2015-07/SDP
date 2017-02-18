package worksheet02.src; /**
 * Created by Case on 17/02/2017.
 * SDP week01 worksheet02 exercises - Reflection in Java
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;


public class ReflectionWorksheet {
    public static void main(String[] args) {

        System.out.println("Pls enter a valid classname!");
        //Using Scanner class for allowing input in IDE's console.
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();

        //ReflectionWorksheet r = new ReflectionWorksheet();
        //String className = r.getClass().getName();

        System.out.println(className);

        Class cls = null;
        try {
            cls = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //Class name
        System.out.println("\n ----\nClass name: " + cls.getName());
        System.out.println("Class simple name: " + cls.getSimpleName() + "\n ----\n");

        //Modifiers
        printModifiers(cls);

        //Constructors
        printConstructorInfo(cls);

        //Methods
        printMethodInfo(cls);

        //Field
        printFieldInfo(cls);
    }

    /**
     * Prints class modifiers
     * @param cls the method prints the modifiers of this class
     */
    private static void printModifiers(Class cls){
        System.out.println("Class modifiers: \n");
        int modifiers = cls.getModifiers();

        System.out.println("isAbstract: " + Modifier.isAbstract(modifiers));
        System.out.println("isFinal: " + Modifier.isFinal(modifiers));
        System.out.println("isInterface: " + Modifier.isInterface(modifiers));
        System.out.println("isNative: " + Modifier.isNative(modifiers));
        System.out.println("isPrivate: " + Modifier.isPrivate(modifiers));
        System.out.println("isProtected: " + Modifier.isProtected(modifiers));
        System.out.println("isPublic: " + Modifier.isPublic(modifiers));
        System.out.println("isStatic: " + Modifier.isStatic(modifiers));
        System.out.println("isStrict: " + Modifier.isStrict(modifiers));
        System.out.println("isSynchronized: " + Modifier.isSynchronized(modifiers));
        System.out.println("isTransient: " + Modifier.isTransient(modifiers));
        System.out.println("isVolatile: " + Modifier.isVolatile(modifiers));
    }

    /**
     * Prints constructor parameter info
     * @param cls the method prints out the constructor parameters for each constructor of this class
     */
    private static void printConstructorInfo(Class cls){
        Constructor[] cs = cls.getConstructors();
        for(Constructor c : cs){
            System.out.println("\n -- Constructor parameter types: ");
            Class[] paramTypes = c.getParameterTypes();
            for(Class param : paramTypes){
                System.out.println(param.getName());
            }
        }
    }

    /**
     * Prints method info
     * @param cls the method prints out the method info for this class
     */
    private static void printMethodInfo(Class cls){
        System.out.println("\n -- \nMethod info: ");
        Method[] ms = cls.getDeclaredMethods();
        for(Method m : ms){
            System.out.println("\nMethod name: " + m.getName());
            System.out.print("Parameter types: ");
            Class[] ps = m.getParameterTypes();
            if(ps.length == 0){
                System.out.println("no parameters.");
            }else {
                for (Class p : ps) {
                    System.out.println("\n- " + p.getName());
                }
            }
            System.out.println("Return type: " + m.getReturnType().getName());
        }
    }

    /**
     * Prints field info
     * @param cls the method prints out the field info for this class
     */
    private  static void printFieldInfo(Class cls){
        System.out.println("\n --- \nFields:");
        Field[] fs = cls.getDeclaredFields();
        for(Field f : fs){
            System.out.println("\nField name:" + f.getName());
            System.out.println("Field Type: " + f.getType().getName());
        }
    }
}
