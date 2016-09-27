package in.ac.kletech;

public class UniversityDemo {

	public static void main(String[] args) {
		
	
	University KLETECH = new University();
	
	KLETECH.createSchools();
	KLETECH.cal_stud();
	System.out.println("------------\n");
	for(int i=0;i<KLETECH.noofStud.length;i++)
	{
		if(KLETECH.noofStud[i]!=0)
			System.out.println("No Students in "+KLETECH.s[i].getProgcode()+" are  "+KLETECH.noofStud[i]);
	}
	
	
}
}