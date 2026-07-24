import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListApplication {
    record Task(int id, String title, boolean completed) { Task complete() { return new Task(id, title, true); } }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n1 Add  2 Complete  3 Show  0 Exit");
                String choice = scanner.nextLine();
                if (choice.equals("0")) return;
                if (choice.equals("1")) { System.out.print("Task title: "); tasks.add(new Task(tasks.size() + 1, scanner.nextLine(), false)); }
                else if (choice.equals("2")) {
                    System.out.print("Task id: "); int id = Integer.parseInt(scanner.nextLine());
                    for (int index = 0; index < tasks.size(); index++) if (tasks.get(index).id() == id) tasks.set(index, tasks.get(index).complete());
                } else if (choice.equals("3")) tasks.forEach(task -> System.out.println(task.id() + ". [" + (task.completed() ? "x" : " ") + "] " + task.title()));
                else System.out.println("Choose 0, 1, 2, or 3.");
            }
        }
    }
}
