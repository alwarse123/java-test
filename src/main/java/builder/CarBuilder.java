package builder;

/**
 * Copyright (c) 2023, ustchcs and its affiliates. All rights reserved. More info see www.ustchcs.com
 *
 * @author cch
 * @package java-test builder
 * @node
 */
public class CarBuilder {
    private String engine;
    private String chassis;
    private String body;

    public CarBuilder addEngine(String engineInput) {
        this.engine = engineInput;
        return this;
    }

    public CarBuilder addChassis(String chassisInput) {
        this.chassis = chassisInput;
        return this;
    }

    public CarBuilder addBody(String bodyInput) {
        this.body = bodyInput;
        return this;
    }

    public Car build() {
        return new Car(this.engine, this.chassis, this.body);
    }
}
