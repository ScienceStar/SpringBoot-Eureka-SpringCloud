package com.dao;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Create by mac on 2018/4/30
 */
@Repository
@Component
public interface UserRepository  extends JpaRepository<User,Long>{
    /**
     *  and
     * @param id
     * @param name
     * @return
     */
    User findByIdAndName(Long id, String name);


    User findByNameAndPassword(String name, String password);

    /**
     *  or
     * @param id
     * @param name
     * @return
     */
    User findByIdOrName(Long id, String name);


    /**
     * between
     * @param start
     * @param end
     * @return
     */
    List<User> findByCreateDateBetween(Date start, Date end);


    /**
     * lessThan
     * @param start
     * @return
     */
    List<User> getByCreateDateLessThan(Date start);

    /**
     * Greater Than
     * @param start
     * @return
     */
    List<User> findByCreateDateGreaterThan(Date start);


    /**
     * is null
     * @return
     */
    List<User> findByNameIsNull();


    /**
     * in
     * @param nameList
     * @return
     */
    List<User> findByNameIn(Collection<String> nameList);
}
