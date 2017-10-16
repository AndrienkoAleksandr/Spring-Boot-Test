package org.example.shapes.model.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.example.shapes.model.Shape;
import static org.example.util.ShapeUniqueIdGenerator.generateUniqueId;

@JsonTypeName("circle")
public class Circle implements Shape {

    private final long id;
    @JsonProperty("radius")
    private double radius;

    @JsonCreator
    public Circle(@JsonProperty("radius") double radius) {
        this.id = generateUniqueId();
        this.radius = radius;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double evaluateSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double evaluatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
