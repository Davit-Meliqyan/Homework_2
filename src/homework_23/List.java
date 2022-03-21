package homework_23;

public interface List<T> {

    int size();

    boolean isEmpty() ;

    T get(int index);

    void add(T val);

    void add(int index, T val);

    void delete(int index);
}
