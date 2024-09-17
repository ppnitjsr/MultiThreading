class Hi extends Thread{
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

class Hello extends Thread{
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

        //this start()  Start Thread and internally call run()(start always call run)
        //start is method of Thread.class
        obj1.start();
        obj2.start();



    }
}
