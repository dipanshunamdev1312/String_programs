package String;

public class Reverse {

	public static void main(String[] args) {
		
		String s1 = "Dipanshu Namdev" , rs1 = "";
		char ch ;
		
		System.out.print("Original word : ");
		System.out.println(s1);
		
		for(int i=0; i < s1.length(); i++) {
			ch = s1.charAt(i);
			rs1 = ch + rs1;
		}
		System.out.println("Reversed word : "+rs1);
	}

}
