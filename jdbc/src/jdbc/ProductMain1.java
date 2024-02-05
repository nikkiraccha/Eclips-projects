package jdbc;

public class ProductMain1 {
	
			public static void main(String[] args) {
				//data insertion
				ProductDao dao=new ProductDao();
				Product product1=new Product();
				product1.setProId("oo5656");
				product1.setProName("oppo1");
				product1.setProPrice(245.6);
				
				int result=dao.saveProduct(product1);
				if(result==0)
				{
					System.out.println("data inserted successfully");

				}
				else
				{
					System.out.println("data inserted fail..");

				}
				
			}

	}



