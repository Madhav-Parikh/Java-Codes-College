package Java_Assignment_3;

/*  Methods of Thread Class Used in this program:
    start() --> Method used to execute a thread.
    run() --> Method used to do an action when start() method is called.
    sleep() --> Method used to make a thread sleep for a particular milliseconds.
    setPriority() --> Method used to set the priority of the thread.
    getName() --> Method used to get the name of the thread.
    getId() --> Method used to get the ID of a thread.
    join() --> Method that waits for a running thread to terminate before starting next thread.
*/
class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
        System.out.println("Pandit Deendayal Energy University.");
        System.out.println("Computer Engineering.");
        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question12 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Harsh");
        MyThread1 t2 = new MyThread1("PDEU");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("The name of thread t1 is " + t1.getName());
        System.out.println("The ID of thread t1 is: " + t1.getId());
        System.out.println("The name of thread t2 is " + t2.getName());
        System.out.println("The ID of thread t2 is: " + t2.getId());
    }
}
