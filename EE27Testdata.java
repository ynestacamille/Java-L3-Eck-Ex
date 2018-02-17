public class EE27Testdata {
	public static void main(String[] args) {
		
		String name;
		int note1;
		int note2;
		int note3;
		int average;
		
		TextIO.readFile("/users/ynesca17/Documents/testdata.txt");
		
		name = TextIO.getln();
		note1= TextIO.getlnInt();
		note2= TextIO.getlnInt();
		note3= TextIO.getlnInt();
		average= (note1 + note2 + note3)/3;
		
		System.out.println("name of a student: " + name);
		
		System.out.println("scores of student: ");
		System.out.println(note1);
		System.out.println(note2);
		System.out.println(note3);
		
		System.out.println("average : ");
		System.out.println(average);
	}

}
