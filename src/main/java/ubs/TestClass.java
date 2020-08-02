package ubs;

import java.util.Scanner;

public class TestClass {
	
	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
         
        String a1="abc";
        a1.concat("aa");
        System.out.println(a1);
        
       int t=Integer.parseInt(s.nextLine());
        
        if(t<1 || t>10)
        {
            System.out.println("invalid input");
            System.exit(0);
        }
        
        int n[]=new int[t];
        String[] input =s.nextLine().split(" ");
        
        int inputLength=input.length;
        
        for(int i=0;i<inputLength;i++)
        {
            n[i]=Integer.parseInt(input[i]);
        }
        
        for(int i=0;i<inputLength;i++)
        {
        	int a =n[i];
        	for(int j=1;j<=a;j++)
        	{
        		if(j%3==0 && j%5==0)
        			System.out.println("FizzBuzz");
        		else if(j%3==0)
        			System.out.println("Fizz");
        		else if(j%5==0)
        			System.out.println("Buzz");
        		else
        			System.out.println(j);
        	}
        	
        }
        
        

    }
}

