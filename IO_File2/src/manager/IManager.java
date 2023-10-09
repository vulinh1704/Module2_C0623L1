package manager;

import java.util.List;

public interface IManager<E> {
    boolean add(E e);

    boolean edit(int id, E e);

    boolean delete(int id);

    int findById(int id);

    List<E> findAll();
}
