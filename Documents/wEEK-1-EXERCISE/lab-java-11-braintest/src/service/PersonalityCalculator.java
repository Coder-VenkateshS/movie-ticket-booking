package service;



public class PersonalityCalculator {

	int i;
	public int[] findPersonality(String options) {
		String[] selectedAnswers=options.split(",");
		int[] answers=new int[selectedAnswers.length];
		for(i=0;i<selectedAnswers.length;i++) {
			answers[i]=Integer.parseInt(selectedAnswers[i]);
		}
		for(i=0;i<answers.length;i++) {
			System.out.println(answers[i]);
		}
	return answers;
	}
	
	/*
A = __ + __ + __ + __ + __ + __ + __ + __ + __ + __ + __ = _____ 
      (Q1) (Q2) (Q3) (Q5) (Q8) (Q10) (Q11) (Q12) (Q14) (Q18) (Q20) 

B = __ + __ + __ + __ + __ + __ + __ + __ + __ = _____ 
     (Q4) (Q6) (Q7) (Q9) (Q13) (Q15) (Q16) (Q17) (Q19) 

* X = 66 - _____ + _______ =
                 (A)           (B) 
*/
	
	
	
	public String findYourBrainType(String options) {
		int[] answers=findPersonality(options);
		int q=5;
		int A=0,B=0;
		A=answers[0]+answers[1]+answers[2]+answers[5]+answers[7]+answers[9]+answers[10]+answers[11]+answers[13]+answers[17]+answers[19];
		B=answers[3]+answers[5]+answers[6]+answers[9]+answers[12]+answers[14]+answers[15]+answers[16]+answers[18];
		int braintype=66-(A+B);
		if(braintype>=20 && braintype<=55)
		{
			return "leftbrained";
		}
		else if(braintype>=56 && braintype<=64)
		{
			return "noclearpreference";
		}
		else
		{
			return "rightbrained";
		}
		
	}

	
	
	
	
	
	
	
	
}
