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
        System.out.println("Pizza :");
        Pizza pizza = new Pizza();
        pizza.pcs = 50; 
        Output.printTotal(Math.round(pizza.calcPizzaPerPcs()));
        Output.printButter(pizza.totalButter());
        Output.printEsBatu(pizza.totalEsBatu());
        Output.printGula(pizza.totalGula());
        Output.printRagi(pizza.totalRagi());
        Output.printSusuBubuk(pizza.totalSusuBubuk());
        Output.printSusuCair(pizza.totalSusuCair());
        Output.printTelur(pizza.totalTelur());
        Output.printTepung(pizza.totalTepung());
        Output.printKeju( pizza.totalKeju());
        Output.printSosis(pizza.totalSosis());
        Output.printSmokedBeef(pizza.totalSmokedbeef());
        Output.printBawangBombay(pizza.totalBawangbombay());
        
        System.out.println("====================================");
        
        System.out.println("Roti Manis :");
        RotiManis Rotimanis = new RotiManis();
        Rotimanis.Varian1pcs = 50; 
        Rotimanis.Varian2pcs = 100;
        Rotimanis.Varian3pcs = 70;
        Output.printTotal(Math.round(Rotimanis.calcRotiManisVar1PerPcs()));
        Output.printTotal2(Math.round(Rotimanis.calcRotiManisVar2PerPcs()));
        Output.printTotal3(Math.round(Rotimanis.calcRotiManisVar3PerPcs()));
        Output.printButter(Rotimanis.totalButter());
        Output.printEsBatu(Rotimanis.totalEsBatu());
        Output.printGula(Rotimanis.totalGula());
        Output.printRagi(Rotimanis.totalRagi());
        Output.printSusuBubuk(Rotimanis.totalSusuBubuk());
        Output.printSusuCair(Rotimanis.totalSusuCair());
        Output.printTelur(Rotimanis.totalTelur());
        Output.printTepung(Rotimanis.totalTepung());
        Output.printKeju(Rotimanis.totalKeju());
        Output.printVanilla(Rotimanis.totalVanilla());
        Output.printCoklat(Rotimanis.totalCoklat());
        Output.printSosis(Rotimanis.totalSosis());
        Output.printRedBean(Rotimanis.totalRedBean());
        
        
        System.out.println("====================================");
          
        System.out.println("Roti Tawar :");
        RotiTawar Rotitawar = new RotiTawar();
        Rotitawar.Varian1pcs = 20;
        Rotitawar.Varian2pcs = 15;
        Output.printTotal(Math.round(Rotitawar.calcRotiTawarVar1PerPcs()));
        Output.printTotal2(Math.round(Rotitawar.calcRotiTawarVar2PerPcs()));
        Output.printButter(Rotitawar.totalButter());
        Output.printEsBatu(Rotitawar.totalEsBatu());
        Output.printGula(Rotitawar.totalGula());
        Output.printRagi(Rotitawar.totalRagi());
        Output.printSusuBubuk(Rotitawar.totalSusuBubuk());
        Output.printSusuCair(Rotitawar.totalSusuCair());
        Output.printTelur(Rotitawar.totalTelur());
        Output.printTepung(Rotitawar.totalTepung());
        Output.printCoklat(Rotitawar.totalCoklat());
        Output.printKeju(Rotitawar.totalKeju());
    }
}
