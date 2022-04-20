package interfaceEx.formasGeometricas;
public class Ponto implements PrimitivaGrafica
{
    private double x;
    private double y;
    private int espessura;
 
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX (double xVal) { 
        x = xVal; 
    }
 
    public void setY (double yVal) { 
        y = yVal; 
    }
 
    public double getX() { 
        return(x);
    }
 
    public double getY() { 
        return(y); 
    }
 
//    public String toString() {
//         String str = "(" + x + "," + y + ")";
//         return str;
//    }
    
     public double area() {
         return 0;
     }
     
     public void setEspessura(int e) {
         if (e>0)
            espessura = e;
     }
        
     public String getNome(){
         return ("Ponto");
     }
     
 	public String toString() {
		return "Chamou Ponto";
	}
}