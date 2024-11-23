package Lect11;

public class Launch {
//	public static void main(String[] args) {
//		
//		doSomething();
//	}
	
	int a=9;
	private   void doSomething() {
	
		Employee em=()-> {
		
		System.out.println(this.a);
			return "100";
		};
		
		Employee emp1=new Employee() {
			int x=12;
			@Override
			public String getSalary() {
				System.out.println(this.x);
				// TODO Auto-generated method stub
				return "121";
			}
		};
	}

}
