import java.util.Scanner;
interface Moveable{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}
class MoveableCircle implements Moveable{
	@Override
	public void moveUp(){
		System.out.println("Up");
	}
	public void moveDown(){
		System.out.println("Down");
	}
	public void moveLeft(){
		System.out.println("Left");
	}
	public void moveRight(){
		System.out.println("Right");
	}
}
public class QQ2{
	public static void main(String[] args){
		MoveableCircle m = new MoveableCircle();
		m.moveUp();
		m.moveDown();
		m.moveLeft();
		m.moveRight();
	}
}