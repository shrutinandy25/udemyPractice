import java.sql.SQLOutput;

//public class myClass {
//    //Static Method
//    static void myStaticMethod() {
//        System.out.println("Static methods can be called without creating the objects");
//    }
//
//
//    //Public Method
//    public void myPublicMethod() {
//        System.out.println("Public methods must be called by creating objects");
//    }
//
//    //Main Method
//    public static void main(String[] args) {
//        myStaticMethod();
//        myClass myObj = new myClass();
//        myObj.myPublicMethod();
//    }
//}

public class myClass
{
   final int x = 10;
     int y = 30;

    public static void main(String[] args) {
        myClass obj = new myClass();

        obj.y = 60;
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}

//---------Methods with objects-------------
//public class myClass
//{
//    public void fullThrottle()
//    {
//        System.out.println("The car is going at a high speed !");
//    }
//
//    public void speed (int maxSpeed)
//    {
//        System.out.println("Max speed is " +  maxSpeed);
//    }
//
//    public static void main(String[] args)
//    {
//        myClass myCar = new myClass();
//        myCar.fullThrottle();
//        myCar.speed(200);
//    }
//}
//-------------Methods-----------

//public class myClass
//{
//    public void myScore()
//    {
//        System.out.println("My score is 90%");
//    }
//
//    public void score(int maxScore)
//    {
//        System.out.println("Max Score is " + maxScore);
//    }
//
//    public static void main(String[] args)
//    {
//        myClass fScore = new myClass();
//        fScore.myScore();
//        fScore.score(100);
//
//    }
//
//}
//-------------Constructor-------------------
//public class myClass
//{
//    int x;//create an attribute
//
//    public myClass() { //assigning the values to
//        x = 5;
//    }
//
//    public static void main(String[] args) {
//        myClass objX = new myClass();
//        System.out.println(objX.x);
//    }
//}
//---------Example of Constructor-----------

//public class myClass {
//    int x; int y; int z;
//
//    public myClass() {
//        x = 10;
//        y = 120;
//        z= x +y;
//        System.out.println(z);
//    }
//
//    public static void main(String[] args) {
//        myClass obj1 = new myClass();
//        myClass obj2 = new myClass();
//        System.out.println(obj1.x);
//        System.out.println(obj2.y);
//    }
//
//}










//-----------------------------------------
//public class myClass
//{    //static
//    static void myMethodStatic()
//    {
//        System.out.println("This is static method and called without any object");
//    }
//    //public
//    public void myMethodPublic()
//    {
//        System.out.println("This is the public method and called with an object");
//    }
//    //main method
//    public static void main(String[] args)
//    {
//        myMethodStatic(); //calling the static without object
//
//        myClass myObj = new myClass(); //calling the public with the object
//        myObj.myMethodPublic();
//
//    }
//}



//-------------------------------------------------------------
//    int x = 5;
//    int y = 10;
//
//    public static void main(String [] args)
//
//    {
//        myClass myObj1= new myClass();
//        myClass myObj2= new myClass();
//        System.out.println(myObj1.y);
//        System.out.println(myObj2.x);
//    }
//}
//    public static void main(String[] args)
//    {

//        //------For break statement--------
//    {
//    int i = 0;
//    for(i=0;i<10;i++)
//
//    {
//        if (i <= 5)
//        {
//            break;
//        }
//        System.out.println("Wow we got out of break");
//    }
        //---for loop-----
//        int i=0;
//        for(i=0;i<10;i=i+2)
//        {
//            System.out.println("I will get placed in two months");
//        }
    //-----do while loop-----
//            int i=0;
//    do
//    {
//        System.out.print("Where are you");
//        i++;
//    }
//    while (i< 10);

        //--------While loop----------
//       int i = 0;
//       do
//       {
//           System.out.print("Hello World");
//           System.out.print("Whats Up");
//
//           i++;
//       }
//        while(i<=10);
//

        //-----switch--------
//        int day = 7 ;
//        switch (day)
//        {
//            case 1:
//                System.out.println("Its Saturday");
//                break;
//
//                case 2:
//                    System.out.println("Yay !! Its Sunday");
//                    break;
//            default:
//                System.out.println("Arrhh Weekend is over");
//                break;
//
//        }








     // -------if else Statement------------------------------
//        int marks = 16;
//        if(marks<10)
//        {
//            System.out.println("Morning");
//        }
//            else if(marks<=15)
//            {
//                System.out.println("Afternoon");
//            }
//            else
//        {
//            System.out.println("Evening");
//        }


        //-----Experimenting with if else-----------
//        int score = 23;
//        if(score<=60)
//        {
//            System.out.println("Need to retake");
//        }
//        else if(score<=70)
//        {
//            System.out.println("Work Harder");
//        }
//        else if(score<=80)
//        {
//            System.out.println("Could have been better");
//        }
//        else
//        {
//            System.out.println("Good Work");
//        }
        //---------------------------------------
        //----string /Uppercase diplay/ lowecase Display------
//        String greetings = "Hi there";
//        String firstName = "Shruti";
//        String lastName = "Nandy";
//        String fullName = firstName +' '+ lastName;
//        System.out.println("My full name is " + fullName);
//        System.out.println(greetings + ' ' + fullName);
//        System.out.println("The length of the fullName " + fullName.length());
//        System.out.println(fullName.toUpperCase());
//        System.out.println(fullName.toLowerCase());
//        System.out.println(firstName.toUpperCase());
//        System.out.println(lastName.toLowerCase());

        //------------------String Concatenation-----------------------------
//       String firstName = "John";
//        String LastName = "Cena";
//        String fullName = firstName +' '+ LastName;
//        int age = 45;
//        int x= 5, y= 7, z= 8;
//        int result = x+y+z;
//    System.out.println("My name is " + fullName +" I am " + age );
//    System.out.println(fullName);
//    System.out.println(result);

        //----Int Double Print/ Automatic conversation of double to Int------

//        int myInt = 9;
//        double myDouble = myInt;
//        System.out.println(myInt);
//        System.out.println(myDouble);

//---------Conversation of Double to Int----------------------
//        String firstName = "Shruti";
//        String lastName = "Nandy" ;
//        String fullName = firstName + lastName;
//        System.out.println("My fullname name is " + fullName);

//-----------Experimenting with the double and int-----------
//        int age = 27;
//        double myAgeInDouble = 27.6;
//        int myAgeInInt = (int) myAgeInDouble;
//        System.out.println("and my age is " + age);
//        System.out.println("and my age in decimal is " + myAgeInDouble);
//        System.out.println("and my age in int is " + myAgeInInt);
//---------------------------------------------------------------------------
   // }
///}
