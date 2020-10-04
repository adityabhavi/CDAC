//59.	Create a class Voter(voterId, name, age) with parameterized constructor.  
//The parameterized constructor should throw a checked exception if age is less than 18. 
//The message of exception is “invalid age for voter ”

package Q59;

class Voter{
	int voterId;
	String vName;
	int age;
	
	Voter(int voterId, String vName,int age ){
		if(age<18) {
			//System.out.println("Hello");
			try {
				throw new Exception("invalid age for voter");
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println(e);
			}
		}
		else {
			//System.out.println("QQQQ");
			this.age=age;
			this.voterId=voterId;
			this.vName=vName;
		}
		
		
			
	}

	
	public String display() {
		return "Voter [voterId=" + voterId + ", vName=" + vName + ", age=" + age + "]";
	}
	
	
}

public class Q59 {

	public static void main(String[] args) {
		Voter a = new Voter(1,"Aditya",12);
		System.out.println(a.display());
		Voter a1 = new Voter(1,"Aditya",22);
		System.out.println(a.display());
	}
	
}
