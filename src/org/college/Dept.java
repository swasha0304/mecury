package org.college;

public class Dept {


private void deptName() {

System.out.println("DEPT NAME:MARKETING MANAGEMENT");	
	
}

public static void main(String[] args) {
	
Dept d = new Dept();
d.deptName();
	
Hostel h = new Hostel();
h.hostelName();
	
Student s = new Student();
s.studentName();
s.studentDept();
s.studentId();

College c = new College();
c.collegeName();
c.collegeCode();
c.collegeRank();

}





























}
