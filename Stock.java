class Stock{
	public static void main(String[] args){
		int[] price={7,1,5,3,6,4,7};
		System.out.println(profit(price));
	}
	static int profit(int[] price){
		int maxProfit=0;
		int min=price[0];
		for(int i : price){
			if(i<min){
				min=i;
			}
			else{
				int myProfit=i-min;
				if(maxProfit<myProfit) maxProfit=myProfit;
			}
		}
		return maxProfit;
	}
}