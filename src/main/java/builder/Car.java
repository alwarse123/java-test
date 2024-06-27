package builder;

import tool.StrUtils;

/**
 * Copyright (c) 2023, ustchcs and its affiliates. All rights reserved. More info see www.ustchcs.com
 *
 * @author cch
 * @package java-test builder
 * @node
 */
public class Car {
    private String engine;
    private String chassis;
    private String body;

    public Car(String engineInput, String chassisInput, String bodyInput) {
        this.engine = engineInput;
        this.chassis = chassisInput;
        this.body = bodyInput;
    }

    public void print() {
        System.out.println(StrUtils.concatNullToEmpty(engine, chassis, body));
    }
}
