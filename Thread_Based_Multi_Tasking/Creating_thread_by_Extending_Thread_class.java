package Thread_Based_Multi_Tasking;
//lies in java.lang pacakages

class Cat extends Thread{
    public void run(){
        System.out.println("Meow");
    }
}

class Dog extends Thread{
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Bark");
        }
        System.out.println("\n");
    }
}


public class Creating_thread_by_Extending_Thread_class {
    public static void main(String[] args) {
        //main thread started

        
        //thread -1
        Dog dog = new Dog();
        //registering thread to Thread Scheduler
        dog.start();
        
        //thread -2
        Cat cat = new Cat();
        cat.start();
        //if there is a delays, TS will switch to another thread(Line - 12 )


    }
}
