package Companies_Operations;

public class SearchingValue {
	public void SearchKey(double StockValue[] , double key, int length ) {
		int low =0;
		int high=length-1;
		int mid= (low +high)/2;
		while(low<=high) {
			if(key< StockValue[mid])
				high= mid-1;
			else if(key == StockValue[mid]) {
				System.out.println("Stock Value "+key+" is present");
				break;
			} else
				low =mid+1;
			mid=(low+high)/2;
			
		}
		if(low>high) { 
			System.out.println("Stock Value"+key+"is not present");
		}
		
		
	}


}