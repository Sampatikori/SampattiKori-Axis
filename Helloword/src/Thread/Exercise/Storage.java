package Thread.Exercise;

public class Storage {
    private int value;

        public synchronized void setValue(int value) {
            this.value = value;
        }

        public synchronized int getValue() {
            return value;
        }
    }

    class Counter implements Runnable {
        private Storage storage;

        public Counter(Storage storage) {
            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i=1; i<=20; i++){
                storage.setValue(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Printer implements Runnable {
        private Storage storage;

        public Printer(Storage storage) {
            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 20; i++) {
                int value = storage.getValue();
                System.out.println(value);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
