package application;


import java.util.Locale;

import model_entities.AbstractShape;
import model_entities.Circle;
import model_entities.Color;
import model_entities.Rectangle;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		AbstractShape s1 = new Circle(Color.Black, 2.0);
		AbstractShape s2 = new Rectangle(Color.White, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.2f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
		
	}

}
