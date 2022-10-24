package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public MyOperations beanOperationOper(){
        return new MyOperationsImpl();
    }

    @Bean
    public MyBeanDepend beanOperationBean(MyOperations myOperations){
        return new MyBeanDependImple(myOperations);
    }

}
