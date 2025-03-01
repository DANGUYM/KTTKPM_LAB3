package vn.edu.iuh.fit.singleton;

public class ThreadSafeSingletonDoubleCheckedLocking {
        private static volatile ThreadSafeSingletonDoubleCheckedLocking instance;

        private ThreadSafeSingletonDoubleCheckedLocking() {}

        public static ThreadSafeSingletonDoubleCheckedLocking getInstance() {
            if (instance == null) {
                synchronized (ThreadSafeSingletonDoubleCheckedLocking.class) {
                    if (instance == null) {
                        instance = new ThreadSafeSingletonDoubleCheckedLocking();
                    }
                }
            }
            return instance;
        }

    public static void main(String[] args) {
        ThreadSafeSingletonDoubleCheckedLocking instance1 = ThreadSafeSingletonDoubleCheckedLocking.getInstance();
        ThreadSafeSingletonDoubleCheckedLocking instance2 = ThreadSafeSingletonDoubleCheckedLocking.getInstance();

        System.out.println("Double-Checked Locking:");
        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
    }

    }
