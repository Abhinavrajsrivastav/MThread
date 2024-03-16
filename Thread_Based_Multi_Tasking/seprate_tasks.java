package Thread_Based_Multi_Tasking;

class seprate_tasks {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Task 1");
        for(int i = 0;i<n;i++){
            System.out.println("*");
        }

        System.out.println("Task 2");
        for(int i = 0;i<n;i++){
            System.out.println("#");
        }

        System.out.println("Task 3");
        for(int i = 0;i<n;i++){
            System.out.println("$");
        }
    }
}