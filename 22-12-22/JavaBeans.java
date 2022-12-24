package oops;

class College{
private int CollegeId;
private String CollegeName;

public College() {
	super();
}
public College(int CollegeId, String CollegeName) {
	this.CollegeId=CollegeId;
	this.CollegeName=CollegeName;
}
public void setCollegeId(int CollegeId) {
	this.CollegeId=CollegeId;
}
public int getCollegeId() {
	return CollegeId;
}
public void setCollegeName(String CollegeName) {
	this.CollegeName=CollegeName;
}
public String getCollegeName() {
	return CollegeName;
}


	@Override
	public String toString() {
		return "College[collegeId=" +CollegeId+ ",collegeName=" +CollegeName+ "]";
		
	}
}
public class javaBean {

	public static void main(String[]args) {
		College college1=new College();
		college1.setCollegeId(111);
		college1.setCollegeName("Kalyani University");
	    System.out.println(college1);
	    
	    System.out.println("College Name:" +college1.getCollegeName());
	}
	
}
