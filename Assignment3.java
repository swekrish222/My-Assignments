package Week4assignment;

public class Assignment3 implements DatabaseConvention {

	@Override
	public void connect()
	{
		// TODO Auto-generated method stub
		System.out.println("User is connected");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("User is disconnected");	
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("User has updated the execution");		
	}

	public static void main(String[] args) {
		Assignment3 a = new Assignment3();
		a.connect();
		a.disconnect();
		a.executeUpdate();
			

	}

}
