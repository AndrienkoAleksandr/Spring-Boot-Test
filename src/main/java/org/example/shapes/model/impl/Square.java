package org.example.shapes.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.example.shapes.model.Shape;

import static org.example.util.ShapeUniqueIdGenerator.generateUniqueId;

@JsonTypeName("square")
public class Square implements Shape {

    private final long id;
    @JsonProperty("side")
    private double side;

    public Square(@JsonProperty("side") double side) {
        this.id = generateUniqueId();
        this.side = side;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double evaluateSquare() {
        return Math.pow(side, 2);
    }

    @Override
    public double evaluatePerimeter() {
        return 4 * side;
    }
}
