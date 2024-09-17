class Hi implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //
     // Here Thread call its on Run Method, For call our run we have to pass Our Runnable object reference in Thread constructor
        t1.start();
        t2.start();



    }
}
