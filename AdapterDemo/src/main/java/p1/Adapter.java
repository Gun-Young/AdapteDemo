package p1;


//适配类，继承了被适配类，同时实现标准接口
public class Adapter extends Adaptee implements Target 
{
	public void request() {
		super.specificRequest();
		
	}
	
   public static void main(String[] args) 
   {
	 
	      //使用普通类的功能
	   Target concreteTarget=new ConcreteTarget();
	   concreteTarget.request();
	   
	   //使用特殊功能类，即适配类
	   Target adapter =new Adapter();
	   adapter.request();
	   
	   
   }

}
