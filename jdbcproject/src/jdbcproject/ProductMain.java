package jdbcproject;

public class ProductMain {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		int createResult = dao.createProducttable();
		System.out.println("Table creation status..."+createResult);
	}
}