package QUEUE;
import java.util.LinkedList;

        class PrintJob {
            String docName;
            boolean isHighPriority;
            int pages;

            PrintJob(String docName, boolean isHighPriority, int pages) {
                this.docName = docName;
                this.isHighPriority = isHighPriority;
                this.pages = pages;
            }

            @Override
            public String toString() {
                return "[" + docName + " | Pages: " + pages + " | High: " + isHighPriority + "]";
            }
        }

        public class Q10_PrintJob {
            public static void main(String[] args) {

                LinkedList<PrintJob> printerQueue = new LinkedList<>();

                addJob(printerQueue, new PrintJob("Budget_2024.pdf", false, 10));
                addJob(printerQueue, new PrintJob("Photo.png", false, 1));

                addJob(printerQueue, new PrintJob("URGENT_Contract.docx", true, 2));

                System.out.println("\n--- Current Printer Queue ---");
                printerQueue.forEach(System.out::println);

                System.out.println("\n--- Processing Jobs ---");
                while (!printerQueue.isEmpty()) {
                    PrintJob current = printerQueue.poll();
                    System.out.println("Printing: " + current.docName + " (" + current.pages + " pages)");
                }
            }

            public static void addJob(LinkedList<PrintJob> queue, PrintJob job) {
                if (job.isHighPriority) {
                    System.out.println("High Priority detected! Moving to front: " + job.docName);
                    queue.addFirst(job);
                } else {
                    queue.addLast(job);
                }
            }
    }
