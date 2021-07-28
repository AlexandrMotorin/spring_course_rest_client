package org.motorin.spring.rest;

import org.motorin.spring.rest.configuration.MyConfig;
import org.motorin.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",Communication.class);

        //List<Employee> employeeList = communication.getAllEmployees();
        //for(Employee employee: employeeList){
        //    System.out.println(employee);
        //}

        communication.deleteEmployee(10);
    }
}
