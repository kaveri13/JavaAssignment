class Familyinformation{
	  String firstname;
	  String middlename;
	  String lastname;
	  String occupation;
	  String mobileno;
	  int age;
	  
Familyinformation(String firstname,String middlename,String lastname,String occupation,String mobileno){
	  this.firstname=firstname;
	  this.middlename=middlename;
	  this.lastname=lastname;
	  this.occupation=occupation;
	  this.mobileno=mobileno;
}
Familyinformation(int age){
	  this.age=age;
}
/*void display() {
System.out.println(firstname+middlename+lastname+occupation+mobileno+age);
}
*/
}
class Family {
       public static void main(String[] args){
              Familyinformation k1=new Familyinformation("kaveri","anil","supekar","student","7864686479");
              Familyinformation k2=new Familyinformation(22); 
              System.out.println(k1.firstname+k1.middlename+k1.lastname+k1.occupation+k1.mobileno+k2.age);
       }       
}