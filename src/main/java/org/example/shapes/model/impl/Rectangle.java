package org.example.shapes.model.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.example.shapes.model.Shape;

import static org.example.util.ShapeUniqueIdGenerator.generateUniqueId;

@JsonTypeName("rectangle")
public class Rectangle implements Shape {

    private final long id;
    @JsonProperty("width")
    private double width;
    @JsonProperty("height")
    private double height;

    @JsonCreator
    public Rectangle(@JsonProperty("width") double width,
                     @JsonProperty("height") double height) {
        this.id = generateUniqueId();
        this.width = width;
        this.height = height;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double evaluateSquare() {
        return width * height;
    }

    @Override
    public double evaluatePerimeter() {
        return (width + height) * 2;
    }
}
