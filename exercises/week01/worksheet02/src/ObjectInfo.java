package worksheet02.src;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *  This class uses reflection to provide a general toString() method for any class
 * Created by Case on 20/02/2017.
 */
public class ObjectInfo<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public ObjectInfo(T obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectInfo)) return false;

        ObjectInfo<?> toString = (ObjectInfo<?>) o;

        return getObj().equals(toString.getObj());
    }

    @Override
    public int hashCode() {
        return getObj().hashCode();
    }

    @Override
    public String toString() {
        Class cls = getObj().getClass();
        StringBuilder sb = new StringBuilder(128-16);

        sb.append("{ Class: " + cls.getName() + ", Fields: ");

        Field[] fs = cls.getDeclaredFields();
        for(Field f : fs){
            f.setAccessible(true);
            try {
                Object value = f.get(obj);
                sb.append(f.getName() + " - " + f.getType().getName() + " - value: " + value.toString() + ", ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        return sb.toString();
    }

    public static void main(String[] args){
        ReflectTestClass rt = new ReflectTestClass("input01", "input02");
        ObjectInfo oi = new ObjectInfo(rt);
        System.out.println(oi.toString());

        String str = new String("HelloWorld");
        ObjectInfo oi2 = new ObjectInfo(str);
        System.out.println(oi2.toString());
    }
}
