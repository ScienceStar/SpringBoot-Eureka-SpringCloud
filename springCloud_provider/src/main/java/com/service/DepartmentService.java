package com.service;

import com.entity.Department;

/**
 * Create by mac on 2018/4/30
 */
public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long id);
}
