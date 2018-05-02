package com.dao;

import com.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Create by mac on 2018/4/30
 */
@Repository
@Component
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
