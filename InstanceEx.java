
public class InstanceEx {
	
	int x = 5;
	
	{
		
	System.out.println("It's a instance BLock");	// Instance blocks will get executed at the obj creation
		
	}

	public static void main(String[] args) {
		
		InstanceEx obj = new InstanceEx();
		
		System.out.println(obj.x);
		

	}

}
