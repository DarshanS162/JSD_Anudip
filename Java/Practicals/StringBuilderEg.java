package in.anudip.java_prac;

public class StringBuilderEg {

	public static void main(String[] args) {
		try {
		StringBuilder sb= new StringBuilder("I am a Java Developer");
		sb.append(" at Darshan Technology");
		System.out.println(sb);
		
		sb.insert(7," Jr.");
		System.out.println(sb);
		
		sb.replace(37,47,"TechFire");
		System.out.println(sb);
		
		sb.delete(34,44);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		}
		catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("Finally Finally Finally Finally");
			
		}

	}

}
