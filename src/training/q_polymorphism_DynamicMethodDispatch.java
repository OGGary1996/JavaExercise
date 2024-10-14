package training;
// 多态有两种表现形式 1:method overloading(compile-time polymorphism),2:method overriding(run-time polymorphism)
// method overriding 
//  在java中每一个child class都可以作为parent class的一个object实例，可以在引用parent class是指向其中一个Child class
//  通过这个方式，可以使用同一个parent class指向任意一个child class被overriding的method来实现不同的行为。
//  (无论这个object前面的类型是parent class还是child class，最终创建的new object本身是最重要的关键，这个object决定了要调用哪个class的method)

import training.exampleclass.Animal;
import training.exampleclass.Cat;
import training.exampleclass.Dog;

public class q_polymorphism_DynamicMethodDispatch {

    public static void makesund(Animal animals){ // 创建一个static method来展示多态，
        animals.sund();                          // 这个方法会根据传递进来的值Animal（固定的种类即父类） animals来自动判断应该调用哪个child class中的sund()方法
    }
    public static void main(String[] args){
        Animal animalDefault = new Animal(); // 引用父类 指向这个父类
        Animal animalCat = new Cat(); // 引用父类 指向其中一个子类Cat()
        Animal animalDog = new Dog(); // 引用父类 指向其中一个子类Dog()
        
        makesund(animalDefault); // 调用之前的static method，因为在同一个class内 方法前面不用写class name
        makesund(animalCat);    // 可以通过集合批量处理多个子类对象
        makesund(animalDog);

        // static method不是必须的操作，可以直接调用方法，只是需要给每个子类对象单独调用方法
        animalDefault.sund();
        animalCat.sund();
        animalDog.sund();
    }
}
