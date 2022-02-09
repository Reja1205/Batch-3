package myFirstJava;

public class HumanBeing {
// A class contains Variables(state) and methods(behavior)
    /* Variable is a container. A Variale has three parts
1. Declare a variable
2.define a variable
3.Use the variable
 */

    String name;// Here String is a Daa type, name is a variable, "Rejaur" is a value of the variable
    int age;
    float height;
    char firstletter;

    String name2 ;
    int age2 ;
    float height2 ;

    public void Hello (){
       // System.out.println("Hello World");
        name = "Rejaur";
        age = 31;
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        HumanBeing Rejaur = new HumanBeing(); // creating an object of the class
        Rejaur.height = 5.75f; // define the variable
        Rejaur.firstletter = 'R';
        System.out.println(Rejaur.height); // use/execute the varialbe
        System.out.println(Rejaur.firstletter);// use/execute the varialbe

        Rejaur.Hello(); // Call the method


    }

}
