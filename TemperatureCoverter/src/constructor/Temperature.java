package constructor;

public class Temperature {
	
	public double Celsius;
	public double farenheit;
    public double kelvin;
    
    
	public Temperature(double celsius, double farenheit, double kelvin) {
		super();
		Celsius = celsius;
		this.farenheit = farenheit;
		this.kelvin = kelvin;
	}


	public double getCelsius() {
		return Celsius;
	}


	public void setCelsius(double celsius) {
		Celsius = celsius;
	}


	public double getFarenheit() {
		return farenheit;
	}


	public void setFarenheit(double farenheit) {
		this.farenheit = farenheit;
	}


	public double getKelvin() {
		return kelvin;
	}


	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}


	public static void main(String[] args) {
		System.out.println("\n");
	}
	
    
    
    

}
