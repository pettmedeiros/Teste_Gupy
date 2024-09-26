package model_entities;

public class Rectangle extends AbstractShape{
	private Double wight;
	private Double height;
	
	
	public Rectangle(Color color, Double wight, Double height) {
		super(color);
		this.wight = wight;
		this.height = height;
	}

	public Double getWight() {
		return wight;
	}
	public void setWight(Double wight) {
		this.wight = wight;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	} 
	
	@Override
	public double area() {
		return wight * height;
	}
	

}
