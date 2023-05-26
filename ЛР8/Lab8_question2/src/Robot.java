public class Robot {
    private Thread leftLegThread;
    private Thread rightLegThread;

    public Robot() {
        leftLegThread = new Thread(() -> {
            while (true) {
                System.out.println("LEFT");
                try {
                    Thread.sleep(1000); // Пауза 1 секунда
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        rightLegThread = new Thread(() -> {
            while (true) {
                System.out.println("RIGHT");
                try {
                    Thread.sleep(1000); // Пауза 1 секунда
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void startWalking() {
        leftLegThread.start();
        rightLegThread.start();
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.startWalking();
    }
}
