package org.example.shapes.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.example.shapes.model.Shape;

import static org.example.util.ShapeUniqueIdGenerator.generateUniqueId;

@JsonTypeName("triangle")
public class Triangle implements Shape {

    private final long id;
    @JsonProperty("a")
    private double a;
    @JsonProperty("b")
    private double b;
    @JsonProperty("c")
    private double c;

    public Triangle(@JsonProperty("a") double a,
                    @JsonProperty("b") double b,
                    @JsonProperty("c") double c) {
        this.id = generateUniqueId();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double evaluateSquare() {
        // Heron's formula
        double hp = evaluatePerimeter()/2.0;
        return 1.0/4.0 * Math.pow(hp * (hp - a) * (hp - b) * (hp -c), 1.0/2.0);
    }

    @Override
    public double evaluatePerimeter() {
        return a + b + c;
    }
}
