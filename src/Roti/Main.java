/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roti;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Pizza a = new Pizza();
        a.pcs = 50; 
        Output.printTotal(a.calcPizzaPerPcs());
    }
}
