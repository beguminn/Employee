import java.util.Scanner;

public class EmpDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İsminizi giriniz: ");
        String name = sc.nextLine();

        System.out.print("Maaşınızı giriniz: ");
        double salary = sc.nextDouble();

        System.out.print("Haftalık çalışma saatinizi giriniz: ");
        int work_hours = sc.nextInt();

        System.out.print("İşe başlama yılınızı giriniz: ");
        int hire_year = sc.nextInt();

        Employee emp = new Employee(name, salary, work_hours, hire_year);
        System.out.println("\nÇALIŞAN BİLGİLERİ\n-----------------");
        System.out.println(emp);
    }
}

