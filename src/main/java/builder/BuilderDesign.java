package builder;

/**
 * Copyright (c) 2021, ustchcs and its affiliates. All rights reserved. More info see www.ustchcs.com
 *
 * @author cch
 * @package Thymeleaf1 com.example.demo.design.builder
 * @node
 */
public class BuilderDesign {
    public static void main(String[] args) {
        System.out.println("BuilderDesign demo!");
        CarBuilder builder = new CarBuilder();
        Car car = builder.addEngine("e").addChassis("c").addBody("b").build();
        car.print();
    }
}
