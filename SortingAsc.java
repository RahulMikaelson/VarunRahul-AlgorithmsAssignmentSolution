package Companies_Operations;

public class SortingAsc {
	//  Arranging IN Ascending Order
	public void  AscendingOrder(double[] StockValue, int left, int right ){
		if (left<right) {
			int mid = (left +right)/2;
			AscendingOrder(StockValue , left, mid);
			AscendingOrder (StockValue ,mid+1 , right );
			
			merge(StockValue,left,mid,right);
			
		}
	}




	public void merge(double[] StockValue, int left, int mid, int right) {
		int len1 =mid-left+1;
		int len2 = right -mid;
		
	    double leftArr[]= new double [len1];
		double rightArr[]= new double[len2];
		
		for(int i=0;i<len1;i++)
		leftArr[i]=StockValue[left+i];
		
		for(int j=0;j<len2;j++)
		rightArr[j]=StockValue[mid+1+j];
		
		int i=0, j=0;
		int k =left;
		while ( i<len1 && j <len2) {
			if(leftArr[i]<=rightArr[j]) {
				StockValue[k]=leftArr[i];
				i++;
			}else {
				StockValue[k]=rightArr[j];
				j++;
				}
			k++;
			
		}
		while(i<len1){
		StockValue[k]=leftArr[i];
		i++;
		k++;
		}
		while (j<len2) {
		StockValue[k]=rightArr[j];
			j++;
			k++;
		}
	}

}
