package CollegeProjects;

class java_14 implements Runnable {
    static int i, j = 0;

    @Override
    public void run() {
        while (i < 100) {
            System.out.println("I'm also running...Thread 1");
            i++;
        }
    }

    public static void main(String[] args) {
        CollegeProjects.java_23 obj = new CollegeProjects.java_23();
        Thread t1 = new Thread((Runnable) obj);
        t1.start();

        while (j < 100) {
            System.out.println("I'm running...Default Thread");
            j++;
        }
    }
}