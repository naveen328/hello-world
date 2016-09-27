package in.ac.kletech.Marks;

public class Marks {
	int marksBest(int Marks1,int Marks2,int Marks3)
	{
		if(Marks1>Marks2 && Marks1>Marks3)
		{
				if(Marks2>Marks3)
					return (Marks1+Marks2);
				else
					return (Marks1+Marks3);
			}
		
			else if(Marks2>Marks1 && Marks2>Marks3)
			  {
					if(Marks1>Marks3)
						return (Marks1+Marks2);
					else
						return (Marks3+Marks2);
				}
				
				
				else
					{
						if(Marks1>Marks2)
							return (Marks3+Marks1);
						else
							return (Marks2+Marks3);
					}
	}

}
