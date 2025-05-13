import java.util.Scanner;

public class Employee {
  private String name;
  private double salary;
  private int work_hours, hire_year;

  public Employee(String name, double salary, int work_hours, int hire_year ) {
      this.name = name;
      this.salary = salary;
      this.work_hours = work_hours;
      this.hire_year = hire_year;

  }
  public double tax () {
      if (salary >= 100000) {
          return salary * (0.3);
      } else {
          return 0.0;
      }
  }
  public double Bonus() {
      int extraHours;
      if (work_hours > 40) {
          extraHours = work_hours - 40;
      } else {
          extraHours = 0;
      }
      return extraHours * 30;
  }

  public double RaiseSalary(){
      int currentYear=2025;
      int yearsWorked = currentYear - hire_year;
      if (yearsWorked < 10) {
          return salary * 0.05;
      } else if (yearsWorked < 20 && yearsWorked >9) {
          return salary * 0.10;
      } else {
          return salary * 0.15;
      }
  }
    public String toString() {
        double taxAmount = tax();
        double bonusAmount = Bonus();
        double raiseAmount = RaiseSalary();
        double totalSalary = salary + raiseAmount+ bonusAmount - taxAmount;

        return "İsim: " + name +
                "\nMaaş: " + salary +
                "\nÇalışma Saati: " + work_hours +
                "\nİşe Başlama Yılı: " + hire_year +
                "\nVergi: " + tax() +
                "\nBonus: " + Bonus() +
                "\nMaaş Artışı: " + RaiseSalary() +
                "\nVergi ve Bonuslar ile Maaş: " + (salary - tax() + Bonus()) +
                "\nToplam Maaş (Zamlı): " + (totalSalary);
    }
}