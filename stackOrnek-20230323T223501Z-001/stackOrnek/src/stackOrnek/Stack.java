package stackOrnek;

public class Stack 
{
	int size;
	int top;
	int [] veriler;
	
	Stack(int sizeParametresi) 
	{
		this.size=sizeParametresi;
		this.top=-1;
		veriler=new int[size];
	}
	
	void push(int data) 
	{
		if(isFull()) {
		System.out.println("Stack Dolu.");}
		else 
		{
			this.top++;
			this.veriler[this.top]=data;
		}
	}
	
	void eziciPush(int data) 
	{
		if(isFull() && this.veriler[this.top]>data) 
			System.out.println("Stack Dolu.");
		else 
		{
		//stack bo� olmad�k�a ve data stack'in
		//top de�erindeki eleman�ndan b�y�k olduk�a pop i�lemi yap
		while(!isEmpty()&& data>this.veriler[this.top])
				pop();
		
		push(data);
		}
		
	}
	
	int pop() 
	{
		if(isEmpty()) 
		{
			System.out.println("Stack Bo�.");
			return -1;
		}
		else 
		{	
			this.top=this.top-1;
			return this.veriler[this.top+1];
		}
		
	}
	
	
	void print() 
	{
		if(isEmpty()) 
			System.out.println("Stack Bo�.");
		else {
			for(int i=this.top;i>-1;i--)
				System.out.println(this.veriler[i]);
		}
	}
	
	void reset() 
	{
		this.top=-1;
	}
	
	
	boolean isFull() 
	{
		if(this.top==(this.size-1))
			return true;
		else
			return false;
	}
	
	boolean isEmpty() 
	{
		if(this.top==-1)
			return true;
		else 
			return false;
	}
	
	
}
