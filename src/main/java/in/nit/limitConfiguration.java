package in.nit;

public class limitConfiguration {
	
	private int maximum;
	private int minimum;
	
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	protected limitConfiguration() {
		
	}
   limitConfiguration(int maximum,int minimum){
	   
	   super();
	   this.maximum=maximum;
	   this.minimum=minimum;
   }
}
   