package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"67676788991","John","Smith"},
            {"56565656789", "Ivone", "Nowak"},
            {"75757575987", "Jesie", "Pinkman"},
            {"45454545654","Walter","White"},
            {"32323232654","Clara","Lanson"}};
    private double [] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00 };
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }
    public String[][] getWorkers() {
        return workers;
    }
    public double[] getSalaries() {
        return salaries;
    }
}
