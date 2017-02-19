package worksheet02.src;

/**
 * Created by Case on 19/02/2017.
 */
public class ReflectTest {
    private String firstField;
    private String secondField;

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
}
