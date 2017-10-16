package org.example.shapes.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.shapes.model.impl.Circle;
import org.example.shapes.model.impl.Rectangle;
import org.example.shapes.model.impl.Square;
import org.example.shapes.model.impl.Triangle;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = Circle.class, name = "circle"),
               @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle"),
               @JsonSubTypes.Type(value = Square.class, name = "square"),
               @JsonSubTypes.Type(value = Triangle.class, name = "triangle")})
public interface Shape {
    long getId();

    double evaluateSquare();

    double evaluatePerimeter();
}
