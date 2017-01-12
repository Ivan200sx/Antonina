import java.util.Scanner;

public class Dist
{
    public static void main (String [] args)
    {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();

	int e, f, g, h;

	e = a - b;
	f = b - c;
	g = c - d;
	h = d - a;

	if(e < 0) e = e * -1;
	if(f < 0) f = f * -1;
	if(g < 0) g = g * -1;
	if(h < 0) h = h * -1;

	int min = e;

	if(min > f) min = f;
	if(min > g) min = g;
	if(min > h) min = h;

	System.out.println(min);
    }
}