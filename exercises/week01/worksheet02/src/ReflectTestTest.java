package worksheet02.src;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
/*
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
*/

/**
 * Created by Case on 19/02/2017.
 */
class ReflectTestTest {
    private static Class testObjClass;

    @org.junit.jupiter.api.BeforeAll
    static void setUp() {
        testObjClass = ReflectTest.class;
    }

    @org.junit.jupiter.api.Test
    void noMoreThanFourFields() {
        assertTrue(testObjClass.getDeclaredFields().length <= 4);
    }

    @org.junit.jupiter.api.Test
    void noNonPrivateFields() {
       // assertThat(testObjClass.getDeclaredFields(), contains(hasProperty));
    }

    @org.junit.jupiter.api.Test
    void getSecondField() {

    }

    @org.junit.jupiter.api.Test
    void setSecondField() {

    }



}