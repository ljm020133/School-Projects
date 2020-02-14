// 1. class name
public class example {
 
	
// 2. instance variables
private int a;
private int b;

// 3. constructor
public example(int givenA, int givenB)
{
	a = givenA;
	b = givenB;
//givenA = 2; givenB = 5;
}
public example()
{
	a = 2; b = 5;
}
// 4. methods
public int getA() //accessor
{
	return a;
}

public int sum(int c)
{
int tot = a+b+c;
//System.out.println(a+b);
return tot;
}

public static void main(String[] args)
{
	
	
	//class variable = new Constructor(
	example c = new example();
	example c1 = new example(10, 20);
	int s = c.sum(30);
	System.out.println(c1.sum(30));
	
	
}
//access returnType name
//public int sum()
//public void sum(int c)


}

