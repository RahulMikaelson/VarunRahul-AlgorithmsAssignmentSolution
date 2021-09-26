package Services;

import java.util.Scanner;

import Companies_Operations.SearchingValue;
import Companies_Operations.SortingAsc;
import Companies_Operations.SortingDes;
import Companies_Operations.StockPrice;
public class DriverClass {
public static void main(String[] args) {
	
	///Creating Objects
	
	Scanner scan = new Scanner(System.in);
	SortingDes obj= new SortingDes();
	SortingAsc obj1 = new SortingAsc();
	StockPrice rd= new StockPrice();
	SearchingValue sv= new SearchingValue();
	//
	// NOC= Number of companies 
	// double[]StockValue is Value of each stock of each company 
	// boolean[] ValueRd is array store no of trues or false
	//
	System.out.println("Enter Total Number Of Companies");
	int NOC= scan.nextInt();
	double[] StockValue = new double[NOC];
	boolean[] ValueRd = new boolean[NOC];
	System.out.println();
	
	//
	//Assigning VALUES
	//
	
	for(int i=0;i<NOC; i++) {
		int num=i+1;
		System.out.println("Enter the Stock Value of Company "+num);
		StockValue[i]=scan.nextDouble();
		System.out.println("Enter Whether company's stock price rose today compare to yesterday?(Enter Either TRUE OR FALSE)");
		ValueRd[i]=scan.nextBoolean();			
		}
	int option =0;
do {	
	System.out.println("+++++++++++++++++++++++++++++++++");
	System.out.println();
	System.out.println("Enter the operation that you want to perform");
	System.out.println("1. Display the companies stock prices in ascending order");
	System.out.println("2. Display the companies stock prices in descending order");
	System.out.println("3. Display the total no of companies for which stock prices rose today");
	System.out.println("4. Display the total no of companies for which stock prices declined today");
	System.out.println("5. Search a specific stock price");
	System.out.println("0. EXIT");
	System.out.println();
	System.out.println("+++++++++++++++++++++++++++++++++");

    option=scan.nextInt();
    switch (option) {
	case 0:
		option=0;
		break;
		// For Values in Ascending Order
	case 1 :
		System.out.println("Stock Values in Ascending order are :");
		obj1.AscendingOrder(StockValue, 0, StockValue.length-1);
		for(int i=0; i<StockValue.length;i++) 
    	{
		System.out.println(StockValue[i]);	}
		
	    break;
	   // For Values in Descending Order
	case 2 :
		System.out.println("Stock Values in Descending order are :");
		obj.DescendingOrder(StockValue,0,StockValue.length-1);
		for(int i=0; i<StockValue.length;i++) 
		{
		System.out.println(StockValue[i]);	}
	    break;
	    // To Find Stocks who's value is Rose
	case 3 :
		rd.ValueRise(ValueRd);
	    break;
	    // To Find Stocks Who's Value is Declined
	case 4 :
		rd.ValueDecline(ValueRd);
        break;
        // TO Find a Particular  Stock Value is present in given List
	case 5 :
		System.out.println("Enter the Value of Stock to Find");
		double key = scan.nextDouble();
		obj1.AscendingOrder(StockValue, 0, StockValue.length-1);
		int length= StockValue.length;
		sv.SearchKey(StockValue, key, length);
		break;
		
	
	default:
		System.out.println("Enter Valid options");
		break;
	}
}while(option!=0);
System.out.println("Exited Successfully");
scan.close();
}
}
