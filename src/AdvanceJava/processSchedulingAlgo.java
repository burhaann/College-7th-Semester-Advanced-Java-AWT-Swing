package AdvanceJava;

public class processSchedulingAlgo {
    public static int process[] = {6, 1, 3};
    public static int seconds = 3, ms = 100, delay = ms * seconds;
    public static int count = 0, check = 0, totalWait = 0;

    public static void main(String[] args) {
        int sum = 0;
        for (int j = 0; j < process.length; j++) {
            sum += process[j];
        }
        System.out.println("Sum: " + sum);
        printQueue();
        processSwitch();
        for (int x = 0; x < process.length; x++) {
            if (process[x] == 0) {
                System.out.println("All Processes Done...");
                break;
            }
        }
    }

    public static void delayingFor(int delaySeconds) {
        try {
            Thread.sleep(delaySeconds);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void delayer(int i) {
        int pimp = delay, n = process[i];
        pimp -= (n * ms);
        if (n < seconds) {
            process[i] -= n;
            totalWait += n;
            delayingFor(delay - pimp);
        } else {
            process[i] -= seconds;
            totalWait += seconds;
            delayingFor(delay);
        }
    }

    public static void printQueue() {
        System.out.print("Process Queue: \n");
        for (int i = 0; i < process.length; i++) {
            System.out.print("id " + i + ": " + process[i] + " seconds\n");
        }
        System.out.print("");
    }

    public static void updateQueue() {
        for (int k : process) {
            if (k > 0) {
                System.out.print("\n\nUpdated ");
                printQueue();
                break;
            }
        }
    }

    public static void processSwitch() {
        System.out.print("\n");
        for (int i = 0; i < process.length; i++) {
            if (process[i] > 0) {
                count++;
                check++;
                System.out.print(
                        "ProcessID: " + i + "     Remaining: " + process[i] + " sec\nCount: " + count);

                delayer(i);


                System.out.print("         Total WaitTime: " + totalWait + " seconds");
                System.out.print("\nLeft: " + process[i] + " sec.\n");
            }
            if (i == process.length - 1) {

                for (int x = 0; x < process.length; x++) {
                    if (process[x] > 0) {
                        i = -1;
                    } else if (process[x] == 0 && x == process.length - 1) {
                        System.out.print("\n" + check);
                        if (check == 1) {
                            System.out.print(" Single Process ");
                        } else {
                            System.out.print(" Processes ");
                        }
                        System.out.print(
                                "batched\nTotal of "
                                        + count
                                        + " Batches done so far in "
                                        + totalWait
                                        + " seconds.\n\n");
                        updateQueue();
                        check = 0;
                        break;
                    }
                }
            }
        }
    }
}

