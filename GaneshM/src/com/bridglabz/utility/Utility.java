/********************************************************************************* 
 * Purpose =  It is Utility Class where logic of all other programs written.
 * 			  This is done so much of the code can be reused.
 * 	@author  Ganesh Mule
 * 	@version 1.0
 * 	@since   31-07-2019
 *********************************************************************************/

package com.bridglabz.utility;

import java.util.*;

public class Utility {

	public enum utility {}
	
/****************************Scanner*****************************/
	
	static Scanner scanner = new Scanner(System.in);
		
//integerInput//
		public static int integerInput()  
		{
			int input=scanner.nextInt();
			return input;
		}
//floatInput//
		public static float floatInput() {
			float input=scanner.nextFloat();
			return input;
		}
//stringInput//
		public static long longInput() {
			long input=scanner.nextLong();
			return input;
		}
//doubleInput//
		public static double doubleInput() {
			double input=scanner.nextDouble();
			return input;
		}
//char input		
		public static String StringInput() {
			String input=scanner.nextLine();
			return input;
		}
//Sort the given input String
		public static String sortInputString(String str) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			return new String(charArray);
		}
// This method basically converts String to all lower cases and remove spaces
		public static String convertInputInLowerCaseAndRemoveSpaces(String str) {
			return str.toLowerCase().replaceAll("\\s", "");
		}
/***************************************Quadratic****************************************
 * 
 * @param a: User input 1st
 * @param b: User input 2nd
 * @param c: User input 3rd
 * @return find the roots of the equation a*x*x + b*x + c.
 * Since the equation is x*x, hence there are 2 roots.
 ********************************************************************************************/

	public static void qudratic(double a, double b, double c) {
		
		double delta=(b*b)-(4*a*c);
		if (delta>0) {
		double root1=(-b + Math.sqrt(delta)/(2*a));		//Positive squreroot
		double root2=(-b - Math.sqrt(delta)/(2*a));		//Negative squreroot
		System.out.println("two destinct real root exists");
		System.out.println("root1="+root1);
		System.out.println("root2="+root2);
		
	}
		else if(delta==0){
		double root1=-b/(2*a);
		double root2=-b/(2*a);
		System.out.println("two equal real root exists");
		System.out.println("root1="+root1);
		System.out.println("root2="+root2);
	}
		else if(delta<0);
		double root1=-b/(2*a);
		double root2=-b/(2*a);
		double imaginary=Math.sqrt(-delta) / (2 * a);
		System.out.println("two destinct complex root exists");
		System.out.println("root1="+root1+"+"+imaginary);
		System.out.println("root2="+root2+"-"+imaginary);
		
	}
/***********************************Distance measurement*******************
 * 
 * @param x : user input value
 * @param y : user input value
 * @return that takes two integer command­line arguments x
 * and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
 * formulae to calculate distance = sqrt(x*x + y*y).
 *********************************************************************/

	public static void Distance(int x, int y) {
		double result;
		result=Math.sqrt(Math.pow(x, 2)+Math.pow(y,2 ));
		System.out.println(result);
	}

/************************sum of two random Dice numbers***************
 * 
 * @param randomupto Dice range 1 to 6
 * @param randomsum  Sum of random number
 * @return
 ***************************************************************/

	public static void Sumtwodice(int randomupto, int randomsum) {
	
		int a=1+(int)(Math.random()*randomupto);
		int b=1+(int)(Math.random()*randomupto);
		randomsum=a+b;
		System.out.println("Additon of two random dice number="+randomsum);
		}
	
/***************************Stats5***************************
 * 
 * @param random value	1 
 * @param random value	2
 * @param random value	3
 * @param random value	4
 * @param random value	5
 * @return that prints five uniform random values between 0 and 1,
 * their average value, and their minimum and maximum value.
 ************************************************************/
	
	public static void Stats5(double random1, double random2, double random3, double random4, double random5) {
	
		double max=Math.max(random1,Math.max(random2,Math.max(random3,Math.max(random4,random5) ) ) );
		double min=Math.min(random1,Math.min(random2,Math.min(random3,Math.min(random4,random5) ) ) );
		double average=(random1+random2+random3+random4+random5)/5;
		System.out.println("random values\n"+random1+"\n"+random2+"\n"+random3+"\n"+random4+"\n"+random5);	
		System.out.println("average value="+average);
		System.out.println("maximum value="+max);
		System.out.println("minimum value="+min);
		
	}

/**************************************************Windchill********************
 * @param temp      : User input value(in Fahrenheit)
 * @param wind_speed: User input value(in miles per hour)
 * @return defines the effective temperature (the wind chill) 
 * @implNote Note : the formula is not valid if t is larger than 50 in 
 * absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).
 ********************************************************************************/

	public static void Windchill(double temp, double wind_speed) {
		double Wind_chill=35.74+0.6215*temp+((0.4275*temp)-35.75)*Math.pow(wind_speed, 0.16);
		System.out.println("windchill is="+Wind_chill);
	}

/********************************************IntegerInput**************************************
 * @param a: This is first number
 * @param b: This second number
 * @param c: This is third number
 * @return Math function
 ***********************************************************************************************/
	
	public static void IntOpt(int a, int b, int c) {
		int W = a + b *c;
		int X = a * b + c;
		int Y = c + a / b;
		int Z = a % b + c;
		
		System.out.println(a + "+" + b + "*" +c + "=" + W);
		System.out.println(a + "*" + b + "+"+ c +"=" + X);
		System.out.println(c + "+" + a + "/"+ b +"=" + Y);
		System.out.println(a + "%" + b + "+" +c + "=" +Z);
	}

/*******************************Leap year******************
 * @param year: User Input Year
 * @return : Input year leap or not
 ************************************************************/
	public static void LeapYear(int year) {
		
		boolean flag = false;
        if(year% 100 == 0)
        {
            flag = false;
        }
        else if (year % 400 == 0)
        {
            flag = true;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
}
	

/**************************************Spring Season********************
 * @param m: User Input Month
 * @param d: User Input day
 * @return : Given date come inSpring Season or Not
 *********************************************************************/
	public static void SpringSeason(int m, int d) {
		 boolean isSS =  (m == 3 && d >= 20 && d <= 31)
				 || (m == 4 && d >=  1 && d <= 30)
                 || (m == 5 && d >=  1 && d <= 31)
                 || (m == 6 && d >=  1 && d <= 20);
		 System.out.println(isSS);
		}
	
/***************************************Double opt*********************************
 * @param a: first user input
 * @param b: second user input
 * @param c: third user input
 * @return : math function
 *************************************************************************/

	public static void Double(Double a, Double b, Double c) {
		Double W = a + b *c;
		Double X = a * b + c;
		Double Y = c + a / b;
		Double Z = a % b + c;
			
		System.out.println(a + "+" + b + "*" +c + "=" + W);
		System.out.println(a + "*" + b + "+"+ c +"=" + X);
		System.out.println(c + "+" + a + "/"+ b +"=" + Y);
		System.out.println(a + "%" + b + "+" +c + "=" +Z);
			
		}

/********************************Day of Week***************************
 * @param d : User input  Day.
 * @param m : User input Month.
 * @param y	: User input Year.
 * @return  : that takes a date as input and prints the day of
 *	the week that date falls on.
 **********************************************************************/
			
 	public static void DayofWeek(int d, int m, int y) {
		int y0 = y-(14-m)/12;             
		int x = y0 + y0/4-y0/100 + y0/400;
		int m0 = m + 12 * ((14- m)/12)-2;
		int d0 =(d+x + 31*m0/12)%7;
		
		if (d0==0) {
			System.out.println("Sunday");
		}		
		if (d0==1) {
			System.out.println("Monday");
		}
		if (d0==2) {
			System.out.println("Tuesday");
		}
		if (d0==3) {
			System.out.println("Wensday");
		}
		if (d0==4) {
			System.out.println("Thursday");
			}
		if (d0==5) {
			System.out.println("Friday");
		}
		if (d0==6) {
			System.out.println("Saturday");
		}
}
 			
	

/******************************************CarLoan ************************
 * 
 * @param principal : Amount of the Car. 
 * @param year :  User input years that will be converted into months.
 * @param rate : Interest rate
 * @return Calculates the monthly payments you would have to make over Y years to
 *	pay off a P principal loan amount at R per cent interest
 *******************************************************************************/
	public static void CarLoan(double principal, double year, double rate) {
		double r = (rate/100)*12;   // monthly interest rate
		double n = year*12 ;        // months
			
		double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
	    double interest = payment * n - principal;

	    System.out.println("Monthly payments = " + payment);
	    System.out.println("Total interest   = " + interest);
	}
			
/*******************************************Trigonometry****************************
 * @param degrees: User input Angle
 * @return Firstly reads in an
 *	angle (in degrees), converts to radians, and then performs various trigonometric
 *	calculations.
 *********************************************************************/

	public static void Trigonometry(double degrees) {
		double radians = Math.toRadians(degrees);
		double s =Math.sin(radians);
		System.out.println("sine("+ degrees +")="+s);
				
		double c = Math.cos(radians);
		System.out.println("cos(" + degrees + ") = " + c);

		double t = Math.tan(radians);
		System.out.println("tan(" + degrees + ") = " + t);
		        
		System.out.println(s + " / " + c + " = " + s / c); //tangent
        double r = s*s + c*c;
        System.out.println(s*s + " + " + c*c + " = " + r);
				
		}
/*******************************Power of Twos***********************
 * @param n takes command line argument
 * @return prints a table of the powers of 2 that are less 
 * than or equal to 2^n.
 *********************************************************************/

	public static void PowerofTwos(int n) {
		int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
		
        }
	}

/*********************************Addition of  Harmonic Numbers************
 * @param n : that takes a command­line argument n
 * @return : prints the nth harmonic number.
 *******************************************************************/
	
	public static void HarmonicNumbers(int n) {
		//compute 1/1 + 1/2 +1/3 ....+ 1/n
		double sum = 0.0;
		for(int i=2; i<=n; i++)
		{
			sum =sum+ (1.0 / i);
		}
		//print the Harmonic number
		System.out.println(sum);
	}

/***************************EpsilonSqrt******************** 
 * @return compute the square root of a nonnegative number 
 * @param c given in the input using Newton's method:
­ * initialize t = c ­ 
 * replace t with the average of c/t and t
­ * repeat until desired accuracy reached using condition Math.abs(t ­ c/t) > epsilon*t
 * where epsilon = 1e­15;
 ***********************************************************/
	
	public static void EpsilonSqrt(double c) {
		double epsilon = 1e-15;    	// relative error tolerance
			
		double t = c;              	// estimate of the square root of c
									// repeatedly apply Newton update step until desired precision is achieved
		while (Math.abs(t - c/t) > epsilon*t) {
			t = (c/t + t) / 2.0;
			
			System.out.println(t);
		}
	}
	
/*****************************GamblerSimulator*********************
 * @param stake in INR and places fair Re 1 bet 
 * @param goal set as input
 * @param trails
 * @return  Keeps track of the number of times won and number of bets made. Run the
 * simulation N times.
 ****************************************************/
	
	public static void GamblerSimulator(int stake, int goal, int trails) {

	   
        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trails times
        for (int t = 0; t < trails; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win R1
                else                     cash--;     // lose 1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }

        // print results
        System.out.println(wins + " wins of " + trails);
        System.out.println("Percent of games won = " + 100.0 * wins / trails);
        System.out.println("Avg # bets           = " + 1.0 * bets / trails);

	}

/********************************Prime Number********************
 * @param n : a range of number as input
 * @return  : outputs the Prime Numbers in that range.
 ***************************************************************/
	public static void Prime_Number(long n) {
		boolean isPrime= true;
		if (n < 2) isPrime = false;
		
		for(long factor=2;factor*factor<=n;factor++) {
		if (n% factor == 0) {
			isPrime= false;
			break;
			}
		}
		if(isPrime)System.out.println(n+" "+"is prime");
		else	System.out.println(n+" "+"is not prime");
	}
/*****************Integer To Binary********************
 * @param n: Input integer value from user
 * @return : Output is binary
 *******************************************************/
	
public static void IntegerToBinary(int n) {
	int power =1;
	while(power<=n/2) {
	power =power* 2;
    }

    // check for presence of powers of 2 in n, from largest to smallest
    while (power > 0) {

        // power is not present in n 
        if (n < power) {
            System.out.print(0);
        }

        // power is present in n, so subtract power from n
        else {
            System.out.print(1);
            n = n-power;
        }

        // next smallest power of 2
        power = power/ 2;
    }
    System.out.println();
}

/*****************************IntegerToBinaryAndNibbelSwap************
 *  @param n
 *  @return Swapping of nibbles
 **********************************************************************/
public static int IntegerToBinaryAndNibbleSwap(int x) {
	return((x & 0x0F)<<4|(x & 0xF0)>>4);
	}

/************************************Sin**************************************
 * @param x User input
 **********************************************************************/
public static void Sin(double x) {
	
	x = x % (2*Math.PI);
	float value = 1;
	float sum = 0;
	
	for (int i = 1; value!=0.0; i++) {
		value*=(x/i); 
		if(i%4==1)sum+=value;
		if(i%4==3)sum-=value;
	}
	System.out.println(sum);
	}
/*******************************Cos*************************
 * @param x user input
 ***********************************************************/
public static void Cos(double x) {
	x =x%(2*Math.PI);
	double value = 1;
	double sum = 0;
	
	for (int i= 2; value!=0; i++) {
		value=value*(x/i);
		if (i%4==0)sum+=value;
		if (i%4==2)sum-=value;
}
	System.out.println(sum);
}
/******************************RollDie************************************
 * @param Die Side
 **********************************************************************/
public static void RollDie(int times) {
	
int die=6;
int a=1,b=2,c=3,d=4,e=5;
int count_1=0,count_2=0,count_3=0,count_4=0,count_5=0,count_6=0;
for(int i=0;i<times;i++)
{
	int number= 1+(int)(Math.random()*6);
	if(a==number)count_1++;
	else if(b==number)count_2++;
	else if(c==number)count_3++;
	else if(d==number)count_4++;
    else if(e==number)count_5++;
	else if(die==number)count_6++;
}
int max=Math.max(count_1, Math.max(count_2, Math.max(count_3, Math.max(count_4, Math.max(count_5, count_6)))));
if(max==count_1)System.out.println(" fall maximum number of times is.="+1);
else if(max==count_2)System.out.println(" fall maximum number of times is.="+2);
else if(max==count_3)System.out.println(" fall maximum number of times is.="+3);
else if(max==count_4)System.out.println(" fall maximum number of times is.="+4);
else if(max==count_5)System.out.println(" fall maximum number of times is.="+5);
else if(max==count_6)System.out.println(" fall maximum number of times is.="+6);

}
	
/*******************Second Largest*************************************
 * @param arr
 ******************************************************************/
public static void SecondLargest(int[] arr) {
	int first,second;
	first=second=Integer.MIN_VALUE;
	for (int i=0; i<arr.length; i++){
		if (arr[i] > first) {
			second = first;
			first=arr[i];
			}
		else if (arr [i]>second && arr[i] != first)
			second = arr[i];
	}	
	System.out.println("The second largest element is ="+ second);
}
/********************************Second Smallest*****************
 * @param arr
 ***************************************************************/
public static void SecondSmallest(int[] arr) {
	int first,second;
	first=second=Integer.MAX_VALUE;
	for(int i=0; i<arr.length;i++)
	if(arr[i]< first) {
		second =first;
		first=arr[i];}
	else if(arr[i]<second && arr[i]!= first) {
		second=arr[i];
	}
	System.out.println("the second smallest element is="+ second);
	
	
}
/*********************************Prime_no_Factorization**************
 * 
 * @param number
 **********************************************************************/
public static void Prime_no_Factorization(long number) {
	for (int i=2; i*i<=Long.MAX_VALUE; i++) 
		{
		while (number%i ==0) 
		{
			System.out.println(i +"");
			number/=i;
		}
	}
	
	if(number>2)
		System.out.println(number);
	}
/************************************Repeat element****************************
 * 
 * @param arr
 * @param size
 ************************************************************************/
public static void Repeat_element(int arr[], int size) 
{
	int i, j; 
    System.out.println("Repeated Elements are :"); 
    for (i = 0; i < size; i++)  
    { 
        for (j = i + 1; j < size; j++)  
        { 
            if (arr[i] == arr[j])  
                System.out.print(arr[i] + " "); 
        }
    }
}



/************************************Factorial*************************************
 * @param num
 **********************************************************************************/
public static void Factorial(int num) {
	long factorial=1;
	
	for(int i=1; i<=num;i++) 
	{
		factorial = factorial*i;
		
	}
	System.out.printf("factorial of %d = %d",num,factorial);
	
}
/********************************Largest**************
 * 
 * @param arr
 ****************************************************/

public static void Largest(int[] arr) {
	int first;
	first=Integer.MIN_VALUE;
	for (int i=0; i<arr.length; i++){
		if (arr[i] > first) {
			first=arr[i];
			}
		else if (arr [i]>= first)
			first = arr[i];
	}	
	System.out.println("The largest element is ="+ first);
}
/******************************Smallest*********************
 * @param arr
 **********************************************************/
public static void Smallest(int[] arr) {
	int first;
	first=Integer.MAX_VALUE;
	for(int i=0; i<arr.length;i++)
	if(arr[i]< first) {
		first=arr[i];}
	else if(arr[i]<= first) {
		first=arr[i];
	}
	System.out.println("The smallest element is="+ first);
	
}
/***************************************FutureValues****************
 * 
 * @param investC
 * @param year
 * @param rate
 ****************************************************************/
public static void FutureValues(double investC, double year, double rate) {
					
		double futurevalue = investC*  Math.pow(1+(rate/100), year);
	    
	    System.out.println("Future Value payments = " + futurevalue);
	    
	}
/************************************PresentValues******************************
 * @param investC
 * @param year
 * @param rate
 ********************************************************************************/
public static void PresentValues(double investC, double year, double rate) {
	double PresentValues = investC/  Math.pow(1+(rate/100), year);
    
    System.out.println("Present Values payments = " + PresentValues);
    }
/*************************************Anagram************************
 * @param str1 user input
 * @param str2 user input
 * @return   true or false
 *****************************************************************/

public static void Anagram(String String1, String String2) {
	
	char[] ch1=String1.toLowerCase().toCharArray(); 
	char[] ch2=String2.toLowerCase().toCharArray(); 
	
	boolean anagram =true; 
	//sort the elements 
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	//compare elements
	anagram=Arrays.equals(ch1, ch2); 
	
	if(anagram)
	{
		System.out.println("String is anagrams");
	}
	else
	{
		System.out.println("String is not anagrams");
	}
}
/******************BinarySearchForIntger****************** 
 * @param element
 * @param arr
 ***************************************************/
public static void BinarySearchForIntger(int element, int[] arr) {
	
	int li= 0;
	int hi=arr.length;
	int mi=(li+hi)/2;
	
	while(li<=hi)
	{
		if (arr[mi]==element)
		{
			System.out.println("Element present at index position "+mi);
			break;
		}
		else if(arr[mi]< element)
		{  
			li=mi+1;
		}
		else
		{
			hi=mi-1;
		}
		mi=(li+hi)/2;
	}
	if(li>hi)
	{
		System.out.println("Element is not present ");

	}
}
/*************************Vender Machine*****************
 * @param Change
 * @return Note
 ********************************************************/
public static void Vender_machine_10(int change, int[] note) {
	
	for(int i=0;i<note.length;i++) {
		int count=0;
		
		while(change>=note[i])
		{
			change = change -note[i];
			count++;
		}
		
		System.out.println("The "+note[i]+"-note    :"+count+"*"+note[i]+" = "+count*note[i]);
		}
	
	}
/*******************Coupon***********
 * Coupon Numbers
 * Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to 
 * generate distinct coupon number? This program simulates this random process.
 * I/P -> N Distinct Coupon Number
 * Logic -> repeatedly choose a random number and check whether it's a new one.
 * O/P -> total random number needed to have all distinct numbers.
 * Functions => Write Class Static Functions to generate random number and to process distinct coupons.

 * @param range
 * @param n
 ******************************/
public static void Coupon_8(int range, int n) {
	if(n>range) {
		System.out.print("Please Enter less than "+range+" and try again");
	}else {
	
	int count=0; 
	int ch[] = new int[range]; 
	int check=1;
	
	int fcoupon = 0,c=0;
	
	while(c<range)
	{
		
		int collected = collect(n,range);
		for(int k=0;k<range;k++)
		{
			if(ch[k] == collected)
			{
				check = 0;			
			}
		}	
		
		if(check != 0)
		{
			System.out.print(collected+" ");
			ch[count] = collected;
			count++;
			fcoupon++;
			c++;
			
		}
		if(collected == n) {
			System.out.print(collected+" ");
			fcoupon++;
			System.out.println(" ");
			System.out.println("Value is find at "+fcoupon);
			break;
		}
	}
	
	}
}


	static int collect(int n,int range){
		
		Random rand = new Random();
	
		int ramdom_number = rand.nextInt(range);

	return ramdom_number;
 	}
}
