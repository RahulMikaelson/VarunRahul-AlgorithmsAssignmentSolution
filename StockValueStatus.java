package Companies_Operations;
public class StockValueStatus {
public void ValueRise(boolean ValueRD[]) {
	int y=0;
	for(int i=0; i<ValueRD.length;i++) {
		if(ValueRD[i]==true) {
			y=y+1;
		}
	}
	System.out.println("Total no of companies whose stock prices Rose today is :" +y);
}
public void ValueDecline(boolean ValueRD[]) {
	int x=0;
	for(int i=0; i<ValueRD.length;i++) {
		if(ValueRD[i]==false) {
			x=x+1;
		}
	}
	System.out.println("Total no of companies whose stock prices Declined today is :" +x);
}

}

