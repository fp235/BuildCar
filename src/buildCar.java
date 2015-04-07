
public class buildCar {

	private String color;
	private double horsePower;
	private double engineSize;
public buildCar() {
	this.color = "white" ;
	this.horsePower = 0;
	this. engineSize = 0;
}
public buildCar(String color, double horsePower, double engineSize) {
	this.color = color ;
	this.horsePower = horsePower;
	this. engineSize = engineSize;
}

public void setColor(String color){
	this.color = color;
}
public String getColor(){
	return color;
}
public double getHorsePower() {
	return horsePower;
}
public void setHorsePower(double horsePower) {
	this.horsePower = horsePower;
}
public double getEngineSize() {
	return engineSize;
}
public void setEngineSize(double engineSize) {
	this.engineSize = engineSize;
}
public String toString(){
	return "[Color:" + this.color + ", Horse Power:" + this.horsePower + ", Engine Size:" + this.engineSize +"]";
}
}