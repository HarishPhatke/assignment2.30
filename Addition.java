1.	Input two numbers from the command prompt. Add them & show the result on the screen.

public class Addition{
public static void main (String [] args){
int a, b, c;

a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);

c = a + b;

System.out.println("The addition of two given numbers is: "+c);
}
}
