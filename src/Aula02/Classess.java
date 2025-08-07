package Aula02;

public class Classess {
   int age;
   String name;
   float  height;


   public int eating(int eat, int it){
       int eating = eat - it;
       return eating;
   }
    /*
    * A class is a collection of data members ad methods
    *
    * class person{
    * int age;
    * String name;
    * float height;
    * //Methods
    * eat(...)
    * walk(..)
    * }
    *
    * age = 20;//
    *
    * The menbers (data menbers/methods) of the class are accessed using objects with dot(.) operator
    *
    * creating objects
    * ----------------
    * sysntax
    * -------
    * ClssPersson objPersson = new classPerson();
    *
    * p = objPerson.age = 20;
    * p = objPerson.name = "Junior";
    *
    * Identifying Objects and Classes
    * ---------------------------------
    * Mr.xxx teaches Java at RRR Technologies. PPP attends Java sessions.
    * Mrs.xxx teaches testing at same company. QQQ attends testing sessions.
    *
    * Objects (Nouns) that belongs to a Class
    * Mr.xxx
    * java
    * RRR
    * PPP
    * Mrs.xxx
    * testing
    *
    * Class(A class is a collection of related objects)
    * ---------
    * Faculty (Mr.xxx and Mrs.xxx)
    * Course (Java and Testing)
    * company (RRR)
    * student(PPP and QQQ)
    *
    * */


}
