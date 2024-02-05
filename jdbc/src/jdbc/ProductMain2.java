package jdbc;

public class ProductMain2 {
	public static void main(String[] args) {
		ProductDao dao=new ProductDao();
		Product product=dao.findById("23wr456");
		if(product!=null)
		{
			System.out.println("product available");
			System.out.println(product.getProId()+" "+product.getProName()+" "+product.getProPrice());
			
		}
		else
		{
			System.out.println("product is not available");
		}
	}

}

 
