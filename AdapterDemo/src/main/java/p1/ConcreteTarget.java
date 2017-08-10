package p1;


//具体目标类，只能提供普通的功能
public class ConcreteTarget  implements Target
{

	
	public void request() {
		System.out.println("普通类 具有普通的功能....");
		
	}
     
}
