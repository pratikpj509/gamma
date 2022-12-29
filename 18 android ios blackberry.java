/*18) Create a class Android, iOS and BlackBerry which implements interface OS having method void spec(). Using factory design
pattern create a class which will create instances of above classes and based on nature of OS respective class method should get
called.*/

interface OS{
	void spec();
}

class Android implements OS{
	public void spec(){
		System.out.println("Android");
	}
}

class iOS implements OS{
	public void spec(){
			System.out.println("iOS");
	}
}

class BlackBerry implements OS{
	public void spec(){
			System.out.println("BlackBerry");
	}
}
class FactoryIos{
	public OS getios(String str){
		if(str=="most used")
		return  Android();
		else if(str=="most costly")
		return  iOS();
		else
		return  BlackBerry();
	}
}
class Prac18{
	public static void main(String []args){
		FactoryIos fi=new FactoryIos();
		OS s=fi.getios("most costly");
		s.spec();

	}
}