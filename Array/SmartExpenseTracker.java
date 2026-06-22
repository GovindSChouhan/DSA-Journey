import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Class representing a User
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Class representing an Expense
class Expense {
    private String category;
    private double amount;
    private String date;

    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Category: " + category + ", Amount: $" + amount + ", Date: " + date;
    }
}

// Class managing expenses
class ExpenseManager {
    private ArrayList<Expense> expenses;
    private HashMap<String, Double> categoryTotals;

    public ExpenseManager() {
        expenses = new ArrayList<>();
        categoryTotals = new HashMap<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        // Update the total for this category
        categoryTotals.put(expense.getCategory(), categoryTotals.getOrDefault(expense.getCategory(), 0.0) + expense.getAmount());
    }

    public void viewExpenses() {
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    public HashMap<String, Double> getCategoryTotals() {
        return categoryTotals;
    }
}

// Class for predicting future expenses
class ExpensePredictor {
    private ExpenseManager manager;

    // Constructor for ExpensePredictor
    ExpensePredictor(ExpenseManager manager) {
        this.manager = manager;
    }

    public void predictFutureExpenses() {
        HashMap<String, Double> categoryTotals = manager.getCategoryTotals();
        System.out.println("Predicted Expenses for Next Month:");
        for (String category : categoryTotals.keySet()) {
            double predictedAmount = categoryTotals.get(category) / 30 * 30; // Simple average prediction for next month
            System.out.println("Category: " + category + ", Predicted Amount: $" + predictedAmount);
        }
    }
}

public class SmartExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();
        ExpensePredictor expensePredictor = new ExpensePredictor(expenseManager);

        System.out.println("Welcome to the Smart Expense Tracker!");

        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Predict Future Expenses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    Expense expense = new Expense(category, amount, date);
                    expenseManager.addExpense(expense);
                    break;
                case 2:
                    expenseManager.viewExpenses();
                    break;
                case 3:
                    expensePredictor.predictFutureExpenses();
                    break;
                case 4:
                    System.out.println("Exiting... Have a nice day!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
