package com.fegin;

import com.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Create by mac on 2018/5/2
 */
@FeignClient(value = "springCloud-provider")
public interface UserFeignClient {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    List<User> list();

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    User login(@RequestParam("name")  String name, @RequestParam("password") String password);

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    User getUserById (@PathVariable("id") Long id);

}
