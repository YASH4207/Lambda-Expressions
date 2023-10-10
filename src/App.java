
public class App {

	public static void main(String[] args) {
		Human tom = new Human();
		walker(tom);
		
		Robot Wale = new Robot();
		walker(Wale);
//		Lambda Expressions
		
		walker(() -> System.out.println("Custom object is walking.."));
		
		Walkable aBlockOfCode =() ->{
			System.out.println("Custom object is walking..");
			System.out.println("the object triped..");
		};	
		walker(aBlockOfCode);
	
		ALambdaInterface Hello = ()-> System.out.println("Hello");
		
		calculate  sum = (a,b) -> a+b;
			System.out.println(sum.Calculate(4 , 6));
			
			calculate NonZeroDevider = (a, b) -> {
			if(a == 0) {
				return 0;
			}
			return a / b;
		};
		System.out.println(NonZeroDevider.Calculate(10, 5));
		
		
		MyGenericInterface< String > reverser = (s) -> {
			String result = "";
			for(int i = s.length() - 1; i>=0; i--) {
				result += s.charAt(i);
			}
			return result;
		};
		System.out.println(reverser.work("Vehicle"));
		
		
		MyGenericInterface< Integer > Fact = (n) -> {
			int result = 1;
			for(int i = 1; i<= n ; i++) {
				result= i * result;
			}
			return result;
		};
		System.out.println(Fact.work(5));
			
	}
	
	
	// 
	
	public int factorial (int num) {
		int result = 1;
		for(int i = 1; i<= num ; i++) {
			result= i * result;
		}
		return result;
	}
	
	
	public int NonZeroDevide(int arg1, int arg2) {
		if(arg1==0) {
			return 0;
		}	
		return arg1/arg2 ;
	}
	
	
	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}
	
	public String reverse(String str) {
		String result = "";
		for(int i = str.length() - 1; i>= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}


//Functional Interfaces

interface calculate{ public int Calculate(int a, int b);}

interface MyGenericInterface< T > {	public T work(T t);;}

//interface Factorial{public int factorial(int n);}