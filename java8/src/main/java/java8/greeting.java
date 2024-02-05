package java8;

@FunctionalInterface
public interface greeting {
	void greet();

}
@FunctionalInterface
interface Addition{
	 void add(int n1,int n2);
 }

interface LoginEx{
	String login(String username,String Password);
}

interface VoteCheck{
	String vote(String name,int age,String location);
}
