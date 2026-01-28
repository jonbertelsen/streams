package app;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    public void runStreamExercise(){
        System.out.println("Velkommen til Firmaet");

        List<Employee> employees = List.of(
                new Employee("Benny Olsen",     LocalDate.of(1985, 2, 10), "Salg",        34000),
                new Employee("Anna Larsen",     LocalDate.of(1998, 7, 21), "Marketing",   31000),
                new Employee("Thomas Nielsen",  LocalDate.of(1975, 11, 3), "IT",          52000),
                new Employee("Sara Madsen",     LocalDate.of(1992, 4, 14), "HR",          38000),
                new Employee("Jonas Pedersen",  LocalDate.of(2001, 9, 30), "Support",     28000),
                new Employee("Lene Kristensen", LocalDate.of(1968, 1, 5),  "Ledelse",     65000),
                new Employee("Mikkel Hansen",   LocalDate.of(1989, 6, 18), "IT",          47000),
                new Employee("Fatima Ali",      LocalDate.of(1995, 12, 8), "Økonomi",     42000),
                new Employee("Peter Sørensen",  LocalDate.of(1983, 3, 25), "Produktion",  36000),
                new Employee("Emma Jensen",     LocalDate.of(2003, 5, 2),  "Student",     22000)
        );

        // Udskiv alle medarbejdere

        employees.forEach(employee -> System.out.println(employee));

        // Beregn gennemsnitsalder

        double avgAge = employees.stream()
                .collect(Collectors.averagingInt(e -> e.getAge()));

        System.out.println("Gennemsnitsalder på fabrikken: " + avgAge + " år");

        // Højeste månedsløn



    }
}
