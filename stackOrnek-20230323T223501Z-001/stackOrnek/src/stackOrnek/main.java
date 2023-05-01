package stackOrnek;

public class main {

	public static void main(String[] args) {
		
			Stack stackOrnek=new Stack(4);
			stackOrnek.push(39);
			stackOrnek.push(30);
			stackOrnek.push(25);
			stackOrnek.push(10);
			stackOrnek.print();		
			System.out.println("---");
			stackOrnek.eziciPush(11);
			System.out.println("---");
			stackOrnek.print();		
			System.out.println("---");
			
			/*
			stackOrnek.reset();
			stackOrnek.push(29);
			stackOrnek.push(100);
			stackOrnek.push(12);
			stackOrnek.print();
			System.out.println("---");
			
			int cikanEleman=stackOrnek.pop();
			System.out.println("Çýkan Eleman:"+cikanEleman);
			
			cikanEleman=stackOrnek.pop();
			System.out.println("Çýkan Eleman:"+cikanEleman);
			
			cikanEleman=stackOrnek.pop();
			System.out.println("Çýkan Eleman:"+cikanEleman);
			
			stackOrnek.print();*/
	}

}
