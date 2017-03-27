package com.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape  circle =  shapeFactory.create("circle");
		circle.draw();
		
		Shape  rectangle =  shapeFactory.create("Rectangle");
		rectangle.draw();
		
		Shape  square =  shapeFactory.create("Square");
		square.draw();
		
	}

}
