package Comprehensive_Assignment.Comprehensive_Assignment;

public class Account {
	protected double interest;

    public void calculateInterest() {
        // Calculate interest logic
        // This is a placeholder implementation
        interest = 0.05; // 5% interest
    }

    public void addToAccount() {
        // Add interest to the account balance
        // This is a placeholder implementation
        // You can add the interest to a variable representing the account balance
        // For simplicity, we'll just print the interest here
        System.out.println("Interest added: " + interest);
    }
}

// SavingsAccount (Derived Class)
class SavingsAccount extends Account {
    @Override
    public void calculateInterest() {
        // Calculate interest specific to savings account
        // This is a placeholder implementation
        interest = 0.08; // 8% interest for savings account
    }
}

// CurrentAccount (Derived Class)
class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        // Calculate interest specific to current account
        // This is a placeholder implementation
        interest = 0.03; // 3% interest for current account
    }
}


}
