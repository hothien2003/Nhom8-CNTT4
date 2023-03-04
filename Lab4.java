import java.util.Scanner;
public class Lab4{
	public class Circle{
		private double raDius;
		private String coLor;
		private Double aRea;

		public Circle(){
			super();
		}
		public Circle(double radius,String color){
			super();
			this.raDius=raDius;
			this.coLor=coLor;
		}
		public double getRaDius(){
			return raDius;
		}
		public void setRaDius(double raDius){
			this.raDius=raDius;
		}
		public String getCoLor(){
			return coLor;
		}
		public void setCoLor(String coLor){
			this.coLor=coLor;
		}
		public double getARea(){
			return aRea;
		}
		public String toString(){
			return raDius+","+coLor+","+aRea;
		}
	}
	public class Cylinder extends Circle{
		private long heiGht;
		public double volume;

		public Cylinder(double raDius,String coLor,long heiGht){
			super(raDius,coLor);
			this.heiGht=heiGht;
		}
		public long getHeiGht(){
			return heiGht;
		}
		public void setHeiGht(long heiGht){
			this.heiGht=heiGht;
		}
		public double getVolume(){
			return getARea()*heiGht;
		}
	}
	public class main{
		public static void main(String[] args){
			Cylinder c1 = new Cylinder(2.3,"Red",4.2,7.6);
			System.out.println(c1.toString()+","+c1.setHeiGht());
			System.out.println(c1.getVolume());
		}
	}
}