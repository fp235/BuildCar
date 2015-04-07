
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buildCar Acura = new buildCar("grey", 210, 2.0);
		System.out.println(Acura);
		buildCar a1 = new buildCar();
		System.out.println(a1);
		
		buildCar Doge = new buildCar("Blue", 300, 3.0);
		System.out.println(Doge);
		buildCar a2 = new buildCar();
		System.out.println(a2);
		
		buildCar Honda = new buildCar("Red", 260, 2.5);
		System.out.println(Honda);
		buildCar a3 = new buildCar();
		System.out.println(a3);
		
		Honda.setColor("Black");
		System.out.println(Honda.getColor());
		
		Honda.setHorsePower(280);
		System.out.println(Honda.getHorsePower());
		
		Honda.setEngineSize(3.0);
		System.out.println(Honda.getEngineSize());
		
	}

}
