package worksheet02.src;

import java.lang.reflect.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
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
    private static Field[] fields;
    private static Method[] methods;

    @org.junit.jupiter.api.BeforeAll
    static void setUp() {
        testObjClass = ReflectTest.class;
        fields = testObjClass.getDeclaredFields();
        methods = testObjClass.getDeclaredMethods();
    }

    @org.junit.jupiter.api.Test
    void noMoreThanFourFields() {
        assertTrue(testObjClass.getDeclaredFields().length <= 4);
    }

    @org.junit.jupiter.api.Test
    void noNonPrivateFields() {
       for(Field f : fields){
           assertTrue(Modifier.isPrivate(f.getModifiers()));
       }
    }

    @org.junit.jupiter.api.Test
    void noArrayListField() {
        for(Field f : fields){
            assertTrue(!(f.getType() == ArrayList.class));
        }
    }

    @org.junit.jupiter.api.Test
    void fewerThanTwoPrivateHelperMethods() {
        int helperCount = 0;

        for(Method m : methods){
            if(Modifier.isPrivate(m.getModifiers())){
                helperCount += 1;
            }
        }
        assertTrue(helperCount < 2);
    }

    @org.junit.jupiter.api.Test
    void noMethodsWithThrowsClause(){
        for(Method m : methods){
            assertEquals(0, m.getExceptionTypes().length);
        }
    }

    @org.junit.jupiter.api.Test
    void noMethodReturnsInt(){
        for(Method m : methods){
            assertFalse(m.getReturnType() == int.class);
        }
    }

    @org.junit.jupiter.api.Test
    void hasZeroArgConstructor(){
        try{
            Constructor zeroArgConst = testObjClass.getConstructor();
        }catch (NoSuchMethodException ex){
            Assert.fail("Exception thrown: " + ex.getMessage());
        }
    }
}