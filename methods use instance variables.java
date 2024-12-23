class Dog{
int size;
    String name;
   
    void bark(){
    if(size>60){
        System.out.println("Woof!Woof!");
        }
        else if(size>14){
        System.out.println("Ruff!Ruff!");
        }
        else{
        System.out.println("Yip!Yip!");
        }
    }
}
class DogTestDrive{
Dog one = new Dog();
    one.size = 8;
    Dog two = new Dog();
    two.size = 17;
    Dog the = new Dog();
    the.size = 65;
   
    one.bark();
    two.bark();
    the.bark();
}
