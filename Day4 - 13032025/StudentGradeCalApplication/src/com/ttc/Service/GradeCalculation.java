package com.ttc.Service;

import com.ttc.model.Student;

public class GradeCalculation {
	
	public char grade(Student s)
	{
		switch(s.getPercentage()/10)
		{
		  case 9:
		  {
			  return 'A';
			  
		  }
		  case 8:
		  {
			  return 'B';
		  }
		  case 7:
		  {
			  return 'C';
		  }
		  default:
		  {
			  return 'D';
		  }
	      		
		}
		
	}

}
