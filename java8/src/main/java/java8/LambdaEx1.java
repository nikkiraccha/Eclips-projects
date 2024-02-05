package java8;

public class LambdaEx1 {
	public static void main(String[] args) {
		greeting g= ()->System.out.println("welcome to my world");
		g.greet();
	}

}
class Add{
	public static void main(String[] args) {
		Addition a=(n1,n2)->System.out.println(n1+n2);
		a.add(23, 12);
		
		System.out.println("******");
		
		Addition ad=(int n1,int n2)->System.out.println(n1+n2);
		ad.add(10, 39);
	}
}

class Login{
	public static void main(String[] args) {
		LoginEx l= (username,password)->  username.equals("victoria")&&password.equals("victoria@12")?"success":"fail";
		String n=l.login("victoria", "victoria@123");
		System.out.println(n);
	}
	
}

class VoteCheckEx{
	public static void main(String[] args) {
		VoteCheck v=(name,age,location)->age>21&&location.equals("hyderabad")?"eligible":"not eligible";
		String status=v.vote("tae", 23, "hyderabad");
		System.out.println(status);
	}
}


