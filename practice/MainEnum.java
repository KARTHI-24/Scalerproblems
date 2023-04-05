package practice;

public class MainEnum {

	public static void main(String[] args) {
		
        Enum sEnum =Enum.Failed;
        sEnum.conversation(sEnum);
        System.out.println(sEnum);
        if(sEnum==Enum.Failed) 
        {
        	System.out.println("again have to run");
        }
        else if (sEnum==Enum.Pending) 
        {
			System.out.println("have to check the process");
		}
        else if (sEnum==Enum.Running) 
        {
			System.out.println("it is going properly");
		}
        else if (sEnum==Enum.Success) 
        {
        	System.out.println("done");			
		}
        sEnum=Enum.Success;
        System.out.println(sEnum);
        switch (sEnum) {
		case Failed:
        	System.out.println("again have to run");
        	break;
		case Pending:
			System.out.println("have to check the process");
			break;
		case Running:
			System.out.println("it is going properly");
			break;
		case Success:
        	System.out.println("done");		
        	break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + sEnum);
		}
	}

}
