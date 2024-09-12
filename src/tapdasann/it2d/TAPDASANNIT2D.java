import java.util.Scanner;

class Application {
    int id;
    String name;
    int age;
    double bmi;
    String fitnessGoals;
    
   
    Application(int id, String name, int age, double bmi, String fitnessGoals) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bmi = bmi;
        this.fitnessGoals = fitnessGoals;
    }
    
    
    String getEligibilityStatus() {
        if (age > 60) {
            return "Not Eligible (Age too High)";
        } else {
            return "Eligible";
        }
    }
    
    void printDetails() {
        System.out.printf("%d  %-10s %d  %.1f  %-12s %s\n", id, name, age, bmi, fitnessGoals, getEligibilityStatus());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of applications: ");
        int numApplications = scanner.nextInt();
        scanner.nextLine();  
        
        Application[] applications = new Application[numApplications];
        
        for (int i = 0; i < numApplications; i++) {
            System.out.println("Enter details of application " + (i + 1) + ":");
            
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Age: ");
            int age = scanner.nextInt();
            
            System.out.print("BMI: ");
            double bmi = scanner.nextDouble();
            scanner.nextLine(); 
            
            System.out.print("Fitness Goals: ");
            String fitnessGoals = scanner.nextLine();
            
            applications[i] = new Application(id, name, age, bmi, fitnessGoals);
        }
        
        System.out.printf("\n%-5s %-10s %-3s %-4s %-15s %s\n", "ID", "Name", "Age", "BMI", "Fitness Goals", "Eligibility status");
        System.out.println("-----------------------------------------------------------");
        
        for (Application app : applications) {
            app.printDetails();
        }
        
        scanner.close();
    }
}

    
