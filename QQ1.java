import java.util.Scanner;
interface shape {
	void draw ();
}
class rectangle implements shape {
	@Override
	public void draw (){
		System.out.println(" draw ");
	}
}
class cricle implements shape {
	@Override
	public void draw (){
		System.out.println(" draw ");
	}
}
public class QQ1 {
	public static void main ( String[] args) {
		rectangle r = new rectangle ();
		cricle c = new cricle ();
		r.draw();
		c.draw();
	}
}