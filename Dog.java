class Dog{
         String breed="Bacchu";
         int age=5;
         String color="White";
         
         void bark(){
                    System.out.println(color+ "dog is barking and the age of this"+color+"dog is"+ age);
         }
         void type(){
                    System.out.println("The type of dog is: "+breed);
         }
         
         public static void main(String[] args){
                     Dog d1=new Dog();
                     Dog d2=new Dog();
                     Dog d3=new Dog();

                     d1.bark();
                     d2.type();
                     d3.bark();
                     d3.type();
         }
}
          