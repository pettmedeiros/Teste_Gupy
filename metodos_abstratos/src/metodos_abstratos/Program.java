package metodos_abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.enums.Color;
import entities.rectangle;
import entities.circule;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Shape #" + i + " data:" );
			System.out.print( "Rectangle or circule: (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK, BLUE OR RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.print("widht: ");
				double widht = sc.nextDouble();
				System.out.print("height: ");
				double heigh = sc.nextDouble();
				list.add(new rectangle(color, widht, heigh));
			}
			else {
				System.out.print("radius: ");
				double radius = sc.nextDouble();
				list.add(new circule(color, radius));	
			}
	}

		System.out.println();
		System.out.println("Shape Areas:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
}
}