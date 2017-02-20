package worksheet02.src;

/**
 *  This class uses reflection to provide a general toString() method for any class
 * Created by Case on 20/02/2017.
 */
public class ToString <T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public ToString(T obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToString)) return false;

        ToString<?> toString = (ToString<?>) o;

        return getObj().equals(toString.getObj());
    }

    @Override
    public int hashCode() {
        return getObj().hashCode();
    }
}
