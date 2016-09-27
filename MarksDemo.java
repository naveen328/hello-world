package in.ac.kletech.Marks;

public class MarksDemo {

	
	public static void main(String[] args) {
	int i;
		Marks Khadeer[] = new Marks[10];
	for(i=0;i<10;i++)
		Khadeer[i]=new Marks();
	
	System.out.println(Khadeer[0].marksBest(10,20,30));
	System.out.println(Khadeer[1].marksBest(30, 40, 50));
	System.out.println(Khadeer[2].marksBest(50, 70, 90));

	}

}
