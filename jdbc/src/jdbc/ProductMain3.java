package jdbc;

import java.util.List;

public class ProductMain3{
	 public static void main(String[] args) {
			ProductDao dao=new ProductDao();
			int count=dao.updateProduct(200, 10);
			System.out.println("updated records.."+count);
	 
     }
}
 class ProductMain4{
	 public static void main(String[] args) {
			ProductDao dao=new ProductDao();
			int count=dao.deleteById("23wr456");
			System.out.println("deleted records.."+count);
	 
    }
}
 class ProductMain5{
	 public static void main(String[] args) {
			ProductDao dao=new ProductDao();
			int count=dao.deleteByPrice(200);
			System.out.println("deleted records.."+count);
	 
    }
}
 /*class ProductMain6{
	 public static void main(String[] args) {
			ProductDao dao=new ProductDao();
			int count=dao.dropProduct();
			System.out.println("table droped."+count);
	 
    }
}*/
 
 class ProductMain7{
	 public static void main(String[] args) {
			ProductDao dao=new ProductDao();
			int count=dao.updateProductid("vv5656","tae143");
			System.out.println("table updated by id"+count);
	 
    }
}
 class ProductMain8{   
	 public static void main(String[] args) {
			ProductDao dao=new ProductDao();
			List<Product> products=dao.findAll();
			products.forEach(product -> System.out.println(product));
	 
    }
}
 
 
 