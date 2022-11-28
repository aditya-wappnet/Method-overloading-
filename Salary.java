public class Salary{
  
    // Overloaded sum(). This salary takes two int parameters
    public int salary(int DeveloperSalary, int TesterSalary) {
         return (DeveloperSalary + TesterSalary);
         }
  
    // Overloaded sum(). This sum takes three int parameters
    public int salary(int sonSalary, int daughterSalary, int wifeSalary)
    {
        return (sonSalary + daughterSalary + wifeSalary);
    }
  
    // Overloaded sum(). This sum takes two double
    // parameters
    public double salary(double ManagerSalary, double AccoutantSalary)
    {
        return (ManagerSalary -  AccoutantSalary);
    }
  
    // Driver code
    public static void main(String args[])
    {
        Salary s = new Salary();
        System.out.println(s.salary(10000, 5000));
        System.out.println(s.salary(8000, 2000, 3000));
        System.out.println(s.salary(10000.50, 2100.65));
    }
}