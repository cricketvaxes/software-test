package homework1;

public class Homework1 
{
    public static void main(String[] args)
    {
        int a[] = {3,2,10,1};
        int b[] = {4,2,9,2};
        int c[] = {4,2,7,3};
        for(int i=0; i<4; i++)
        {
            System.out.println(triangle(a[i],b[i],c[i]));
        }
    }

public static String triangle(int a,int b,int c)
	{
    if(a+b > c && a+c > b && b+c > a)
    	{
       
         if(a != b && b != c && a != c)
            return "scalene";
         else if(a==b && a==c)
            return "equilateral";
         else
            return "isosceles";
    	}
    else 
        return "can't be a triangle";
	}
}
