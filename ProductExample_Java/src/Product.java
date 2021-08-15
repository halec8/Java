
public class Product {
	
	String stockNum;
	String myPrice;
	

	public Product(String stockNumber, String price) {
		// TODO Auto-generated constructor stub
		
		stockNum = stockNumber;
		myPrice = price;
	}
	
	public String getStockNumber()
	{
		return stockNum;
	}

	public void setStockNumber(String stockNum)
	{
		this.stockNum = stockNum;
		
	}
	
	public String getPrice()
	{
		return myPrice;
	}
	

	public void setPrice(String myPrice)
	{
		this.myPrice = myPrice;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product myProduct = new Product("123456", "$9.99");
		
		System.out.println("The product number is " + myProduct.stockNum + " and it cost " + myProduct.myPrice + " before taxes.");
	}

}
