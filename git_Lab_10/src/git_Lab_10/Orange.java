package git_Lab_10;

public class Orange {
String color;
Orange(String color)
{
this.color=color;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
	Orange greenApple = new Orange("Green");
	String color = greenApple.getColor();
	System.out.println("The color of apple is" + color);

}
	String getColor()
	{
		return color;
	}
}