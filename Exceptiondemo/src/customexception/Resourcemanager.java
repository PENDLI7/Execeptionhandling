package customexception;

public class Resourcemanager {
	public static void main(String[] args) throws Resource {
		
	
		int a=0;
	
	if (a==10) {
		System.out.println(a);
	}else {
		throw new Resource("eneter a valid number");
	}
	

}
}
