package com.control;

import com.entity.User;
import com.fegin.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by mac on 2018/5/2
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserFeignClient userFeignClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping(value = "/list")
    public List<User> list(){
        return userFeignClient.list();
    }

    @GetMapping("/login")
    public User login(@RequestParam String name, @RequestParam String password){
        return userFeignClient.login(name,password);
    }

    @GetMapping("/getUserById")
    public User getUserById(@RequestParam Long id){
        return userFeignClient.getUserById(id);
    }

    /**
     * ribbon负载均衡测试方法
     * springcloud 将feign和ribbon以及eureka进行了集成
     */
    @PostMapping("/log-user-service-instance")
    public void loguserserviceinstance(){
        ServiceInstance serviceInstance=this.loadBalancerClient.choose("SPRINGCLOUD-PROVIDER");
        logger.info("serviceInstance info ---> serviceId is  "+serviceInstance.getServiceId()+" host is "+serviceInstance.getHost()+"port is "+serviceInstance.getPort() );
    }
}
