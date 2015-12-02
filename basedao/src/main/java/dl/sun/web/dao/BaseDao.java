package dl.sun.web.dao;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by SDL on 2015/12/2.
 */
public interface BaseDao<T> {

    T find(Class<? extends T> clazz, int id);

    T find(Class<? extends T> clazz, String id);

    T persist(T t);

    T merge(T t);

    T remove(T t);

    T remove(Class<? extends T> clazz, int id);

    List<T> listAll(Class<? extends T> clazz);

    List<T> list(String jpql);

    long getTotalCount(Class<? extends T> clazz);

    List<T> list(Class<? extends T> clazz, int firstResult, int maxResult);

    int getTotalCount(String jpql);

    List<T> list(String jpql, int firstResult, int maxResult);

    Query createQuery(String jpql);
}
