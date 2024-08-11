package methodTasks;

 


class TestGeoCalculator implements GeometryCalculator{
    Double lside, sside;
    Double radius;
	@Override
	public void Rectangle() {
		this.lside=5.4;
		this.sside=2.5;
		System.out.println(lside*sside);
		
	}

	@Override
	public void Circle() {
		this.radius=6.31;
		System.out.println(radius*radius*Math.PI);
		
	}
	public static void main(String[] args) {
		TestGeoCalculator a=new TestGeoCalculator();
		a.Rectangle();
		a.Circle();
		
	}
	
}

