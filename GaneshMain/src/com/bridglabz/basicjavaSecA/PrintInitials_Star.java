package com.bridglabz.basicjavaSecA;

public class PrintInitials_Star {

	public static void main(String[] args) 
	{ 
        for (int i=1;i<=9;i++)
        {
        	for(int j=1;j<=9;j++)
        	{
        		if(j<3                  //j column
        			||i==1&&j>=7 		//1st
        			||i==2&&j>=6&&j<9	//2nd
        			||i==3&&j>=5&&j<8	//3rd
        			||i==4&&j>=4&&j<7	//4th
        			||i==5&&j<=5    	//5th center
        			||i==6&&j>=4&&j<7	//6th
        			||i==7&&j>=5&&j<8	//7th
        			||i==8&&j>=6&&j<9	//8th
        			||i==9&&j>=7)		//9th
        				
               {
        		System.out.print("* ");
               }
        		else
        		{
        			System.out.print("  ");
        		}
        	}
        	System.out.println();
        }
        System.out.println();
	
	for (int i=1;i<=9;i++)
    {
    	for(int j=1;j<=9;j++)
    	{
    		if(j<3                  //j column
    			||i==1&&j<=8 		//1st
    			||i==2&&j<=9&&j!=8	//2nd
    			||i==3&&j>=8&&j<10	//3rd
    			||i==4&&j>=8&&j<10	//4th
    			||i==5&&j>=8&&j<10    	//5th center
    			||i==6&&j>=8&&j<10	//6th
    			||i==7&&j>=8&&j<10	//7th
    			||i==8&&j<=9&&j!=8//8th
    			||i==9&&j<=8)		//9th
    				
           {
    		System.out.print("* ");
           }
    		else
    		{
    			System.out.print("  ");
    		}
    	}
    	System.out.println();
    }
    System.out.println();
	}
	}