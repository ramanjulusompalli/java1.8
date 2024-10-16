package leetCodeProblems;

 class Animal {
     String name;
     String gender;


     Animal(){
         System.out.println("Animal created");
     }

     void eat() {
         System.out.println("Animals eat food");
     }
 }

     class Dog extends Animal {
      int age;

      Dog(){
          super();
          System.out.println("Dog is created");
      }
         //         void eat(){
//             System.out.println("Animals eat food");
//         }
         void bark() {
             System.out.println("Dog is barking");
         }

     }


     public class Main{
         public static void main(String[] args) {

             Dog dog=new Dog();
             dog.bark();
             dog.eat();

         }
     }

