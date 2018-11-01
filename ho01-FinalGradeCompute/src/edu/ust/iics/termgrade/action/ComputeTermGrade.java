package edu.ust.iics.termgrade.action;

public class ComputeTermGrade implements DecimalEquivalentGrade, RemarksRate{
	private double prelimGrade;
	private double finalGrade;
	private double rawScore;
	private String equiGrade;
	private String remarks;
	private String greeting;

	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public double getPrelimGrade() {
		return prelimGrade;
	}

	public void setPrelimGrade(double prelimGrade) {
		this.prelimGrade = prelimGrade;
	}

	public double getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}

	public double getRawScore() {
		return rawScore;
	}

	public void setRawScore(double rawScore) {
		this.rawScore = rawScore;
	}

	public String getEquiGrade() {
		return equiGrade;
	}

	public void setEquiGrade(String equiGrade) {
		this.equiGrade = equiGrade;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String execute(){
		if (prelimGrade <= 0 || finalGrade <= 0){
			return "error";
			
		}else{
			rawScore = (prelimGrade * .50) + (finalGrade * .50);
			
			if (rawScore <= 59.99){
				setEquiGrade(LT59);
				setRemarks(FD);
				setGreeting(GREETINGF);
			}else if (rawScore >= 60 && rawScore <= 64.99){
				setEquiGrade(B6064);
				setRemarks(P);
				setGreeting(GREETINGP);
			}else if (rawScore >= 65 && rawScore <= 69.99){
				setEquiGrade(B6569);
				setRemarks(FR);
				setGreeting(GREETINGP);
			}else if (rawScore >= 70 && rawScore <= 72.99){
				setEquiGrade(B7072);
				setRemarks(FR);
				setGreeting(GREETINGP);
			}else if (rawScore >= 73 && rawScore <= 77.99){
				setEquiGrade(B7377);
				setRemarks(G);
				setGreeting(GREETINGP);
			}else if (rawScore >= 78 && rawScore <= 81.99){
				setEquiGrade(B7881);
				setRemarks(G);
				setGreeting(GREETINGP);
			}else if (rawScore >= 82 && rawScore <= 86.99){
				setEquiGrade(B8286);
				setRemarks(G);
				setGreeting(GREETINGP);
			}else if (rawScore >= 87 && rawScore <= 90.99){
				setEquiGrade(B8790);
				setRemarks(VG);
				setGreeting(GREETINGP);
			}else if (rawScore >= 91 && rawScore <= 93.99){
				setEquiGrade(B9193);
				setRemarks(VG);
				setGreeting(GREETINGP);
			}else if (rawScore >= 94 && rawScore <= 100){
				setEquiGrade(B94100);
				setRemarks(E);
				setGreeting(GREETINGP);
			}
			
			return "success";
		}
	}
}
