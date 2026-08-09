class Foo {
    private int status = 0;
    public Foo() {
        
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        status = 1;
        notifyAll();

    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        while(status < 1){
            wait();
        }
        printSecond.run();
        status = 2;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        while(status < 2){
            wait();
        }
        printThird.run();
        status = 3;
        notifyAll();
    }
}