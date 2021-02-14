import java.util.*;

public class Controller {
	
	public static ArrayList<Product> productList = new ArrayList<Product>();
	
	
	
	public static void addProduct(String name,double price,int value) {
		
		if(productList.isEmpty())
		{
			productList.add(new Product(name, price, 0));
		}
		boolean found = false;
		
		for (Product p:productList)
		{
			if(p.getName().equals(name) )
			{
				System.out.println(p.getQuantity());
				p.setQuantity(p.getQuantity() + value);
				found = true;
			}
			
			if(!found)
				productList.add(new Product(name, price, value));
				break;
		}
		
		for(Product p :productList)
		{
			System.out.println(p.getQuantity());
		}
	}
	
	public static boolean removeProduct(String name) {
		for (Product p : productList) {
			if(p.getName().equals(name)) {
				productList.remove(p);
				return true;
			}
			
		}
		
		return false;
	}
}