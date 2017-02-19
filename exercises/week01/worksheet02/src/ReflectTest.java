package worksheet02.src;

import java.util.ArrayList;

/**
 * Created by Case on 19/02/2017.
 */
public class ReflectTest {
    private String firstField;
    private String secondField;

    //uncomment public field below for testing JUnit test.
    //public String field;

    //uncomment field of type ArrayList for testing JUnit test.
    //private ArrayList<String> arrayListField;


    public String getFirstField() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField = firstField;
    }

    public String getSecondField() {
        return secondField;
    }

    public void setSecondField(String secondField) {
        this.secondField = secondField;
    }

    public ReflectTest() {
        this.firstField =  "Zero args passed. Default firstField value";
        this.secondField =  "Zero args passed. Default secondField value";
    }

    public ReflectTest(String firstField) {
        this.firstField = firstField;
        this.secondField =  "One arg passed. Default secondField value";
    }

    public ReflectTest(String firstField, String secondField) {
        this.firstField = "Two args passed. " + firstField;
        this.secondField = "Two args passed. " + secondField;
    }

    @Override
    public String toString() {
        return "ReflectTest{" +
                "firstField='" + firstField + '\'' +
                ", secondField='" + secondField + '\'' +
                '}';
    }

    //uncomment private helper methods below for testing JUnit test.
    //private void helper1() { System.out.println("I'm helper1."); }
    //private void helper2() { System.out.println("I'm helper2."); }

    //uncomment method with Throws clause below for testing JUnit test.
    //private void thrower() throws NullPointerException { throw new NullPointerException("That's a null!!!"); }

    //uncomment method with return type int for testing JUnit test.
    //private int returnInt(){ return 1;}
}
