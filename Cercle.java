
public class Cercle {
	double Rayon;
	double x,y;
	double aire;
	 double PI=3.14;
	 double perimetre;
	
	 public static void main(String[] args) {
		    Cercle c = new Cercle();
		    c.setRayon(2);
		    c.setCentre(1,3);
		   // System.out.println(+ c.getRayon());
		    //System.out.println(+ c.setCentre());
		    //System.out.println(+ c.perimetre());
		    //System.out.println(+ c.getaire());
		   System.out.println("Cercle : "+c.toString()+ "perimetre= " + c.perimetre()+",aire= "+c.aire());
		    c.zoomer(200); // 200%
		    System.out.println("Cercle : " + c.toString()
		        + ", périmètre = " + c.perimetre() + ", aire = " + c.aire());
		  }

	public void setCentre(double i,double j) {
		this.x=i;
		this.y=j;
							
	}
	public void setaire(double a) {
		this.aire=a;
		
	}
	public double aire() {
		return Rayon * Rayon * Math.PI;
	}
	public void setperimetre(double b) {
		this.perimetre=b;
		
	}
	public double perimetre() {
		return 2 * Math.PI * Rayon;
	}
	

	public void setRayon(int i) {
		this.Rayon=i;
		
			}
	public double getRayon() {
		return Rayon;
		
	}
	public void zoomer (double z) {
		this.Rayon=this.Rayon / 100;
	}
	public String toString () {
		return"";
		
	}
	

	
		
	


}
