package entities;

public class RectangleEx1 {
	public double height; // altura
	public double width; // largura
	
public double area() {
	return height * width;
}

public double perimeter() {
	return 2 * (height + width);
}

public double diagonal() {
	return Math.sqrt(width * width + height * height);
}


}
