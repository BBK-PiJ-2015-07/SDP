package worksheet02.src; /**
 * Created by Case on 17/02/2017.
 * SDP week01 worksheet02 exercises - Reflection in Java
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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

        //Modifiers
        printModifiers(cls);




    }

    /**
     * Prints class modifiers
     * @param cls Type Class whose modifiers are printed
     */
    public static void printModifiers(Class cls){

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





}
