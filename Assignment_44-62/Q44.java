// 44.	Create three classes
// -	Faculty with two data members facultyId and salary and two methods, one intput() method for 
// accepting facultyId as input and another printSalary() to print salary.

// -	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. 
// Override input() method in this class that calls super class inut() method and accepts basicSalary
//  and allowance as input. Salary should not be accepted as input but should be calculated using
//   formula (basicSalary + allowance)

// -	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour.
//  Override input() method in this class that calls super class inut() method and accepts workingHours
//   and ratePerHour as input. Salary should not be accepted as input but should be calculated using 
//   formula ( workingHour * ratePerHour )


class Faculty{
    
    int facultyId;
    int salary;

    Faculty(int facultyId){
        this.facultyId=facultyId;
    }

    void input(int facultyId){
        this.facultyId=facultyId;
    }

    void printSalary(){
         System.out.println("Salary : "+salary);
     }
}

class FullTimeFaculty extends Faculty{
    int basicSalary;
    int allowance;

    facultyId(){

    }

    void input(int basicSalary,int allowance){
        super.input(facultyId);
        this.basicSalary=basicSalary;
        this.allowance=allowance;
    }

    void printSalary(){
        int salary = basicSalary * allowance;
        System.out.println("Salary : "+salary);
    }

}


class FullTimeFaculty extends Faculty{
    

}