// 43.	Create a class OneBHK with instance variables roomArea, hallArea and price.
//Then create default constructor that initializes instance variables with some values and a parameterized
//constructor that takes values for all instance variables and stores them in instance variables.
//  Now create a method named show()  to print OneBHK’s instance variable values.
// Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK 
// and a new instance variable room2Area. Then create default constructor to initialize all 4 
// instance variables and a parameterized constructor to take the values for initialization of
//  all instance variables. Override show() method to print all data member information.
// Write main method in another class (Say Demo) and store three TwoBHK flat’s information and
//  print information using show method. Also print total amount of all flats. 

class OneBHK{
     double roomArea;
     double hallArea;
     int price;

    OneBHK(){
        roomArea=100;
        hallArea=144;
        price=300000;
    }

    OneBHK(double roomArea,double hallArea,int price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show(){
        System.out.println("Room Area : "+roomArea+" Hall Area : "+hallArea+" price : "+price);
    }
}

class TwoBHK extends OneBHK {
    private double room2Area;

    TwoBHK(){
        room2Area=150;
    }

    TwoBHK(double roomArea,double hallArea,int price,double room2Area){
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }

    void show(){
        super.show();
        System.out.println(" room 2 area "+room2Area);
    }
}

class Demo {
    public static void main(String[] args) {
        TwoBHK t1 = new TwoBHK();
        t1.show();
        TwoBHK t2 = new TwoBHK(100,150,500000,130);
        TwoBHK t3 = new TwoBHK(200,188,700000,190);
        TwoBHK t4 = new TwoBHK(130,160,900000,150);
        t2.show();
        t3.show();
        t4.show();   
    }
}

