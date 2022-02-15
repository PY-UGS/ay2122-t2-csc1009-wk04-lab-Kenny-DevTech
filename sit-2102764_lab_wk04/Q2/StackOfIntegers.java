package Q2;

public class StackOfIntegers {

	private int element[];
	private int size = 0;

	public StackOfIntegers() {
		this.element = new int[16];
	}

	public StackOfIntegers(int capacity) {
		this.element = new int[capacity];
	}

	public boolean empty(){
		if(this.size <= 0)
			return true;
		else
			return false;
	}

	public int peek(){
		return this.element[this.size];

	}

	public void push(int value){
		this.element[this.size] = value;
		size++;
	}

	public int pop(){
		size--;
		return this.element[this.size];
	}

	public int getSize(){
		return this.size;
	}

}
