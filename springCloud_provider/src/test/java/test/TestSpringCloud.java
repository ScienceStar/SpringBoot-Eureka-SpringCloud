package test;

import com.entity.Department;
import com.service.DepartmentService;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create by mac on 2018/5/1
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestSpringCloud.class)
@ComponentScan("com")
public class TestSpringCloud {

    private static Logger logger = LoggerFactory.getLogger(TestSpringCloud.class);

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private UserService userService;

    @Test
    public void testDepartmentService(){
        Department department=new Department();
        department.setId(1L);
        department.setName("Jack");
        Department result =departmentService.saveDepartment(department);

        logger.info("add result "+result);
    }
}
