/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roti;

import Interfaces.interfaces;

/**
 *
 * @author user
 */
public class Pizza extends Dough implements interfaces{
    int pcs;
    private final int Keju = 30;
    private final int Sosis = 50;
    private final int SmokedBeef = 50;
    private final int BawangBombay = 30;
    
    // Bahan yang digunakan
    @Override
    int ragi(){
        return 20;
    }

    @Override
    int gula() {
        return 100;
    }

    @Override
    int tepung() {
        return 1000;
    }

    @Override
    int butter() {
        return 100;
    }

    @Override
    int susuBubuk() {
        return 200;
    }

    @Override
    int susuCair() {
        return 180;
    }

    @Override
    int telur() {
        return 50;
    }

    @Override
    int esBatu() {
        return 300;
    }
    
    
    // Kalkulasi modal dari setiap bahan/dough
    @Override
    public int calcGula() {
        return this.gula() * this.Gula / 1000 ;
    }
    @Override
    public int calcTepung() {
        return this.tepung() * this.Tepung / 1000;
    }

    @Override
    public int calcButter() {
        return this.butter() * this.Butter / 500;
    }

    @Override
    public int calcRagi() {
        return this.ragi() * this.Ragi / 11;
    }

    @Override
    public int calcSusububuk() {
        return this.susuBubuk() * this.SusuBubuk / 1000;
    }

    @Override
    public int calcSusucair() {
        return this.susuCair() * this.SusuCair / 1000;
    }

    @Override
    public int calcTelur() {
        return this.telur() * this.Telur / 1000;
    }

    @Override
    public int calcEsbatu() {
        return this.esBatu() * this.EsBatu / 1000;
    }
    
    //Kalkulasi modal dari setiap topping 
    public int calckeju() {
        return this.Keju * 31000 / 250;
    }
    public int calcsmokedBeef() {
        return this.SmokedBeef * 90000 / 1000;
    }
    public int calcbawangBombay() {
        return this.BawangBombay * 40000 / 500;
    }
    public int calcsosis() {
        return this.Sosis * 80000 / 1000;
    }
    
    
    //Kalkulasi modal yang digunakan
    private int calcPizza() {
        return calcEsbatu() + this.calcButter() + this.calcGula() + this.calcRagi() + this.calcSusububuk() + this.calcSusucair() + this.calcTelur() +this.calcTepung() ;
    }
    //Kalkulasi berat seluruh bahan yang digunakan
    public int calcPizzaWeight(){
        return this.butter() + this.esBatu() + this.gula() + this.telur() + this.tepung() + this.susuBubuk() + this.susuCair() + this.ragi() ;
    }
    // Kalkulasi modal Topping
    public int calcTopping(){
        return (this.calckeju() + this.calcsmokedBeef() + this.calcsosis() + this.calcbawangBombay()) * this.pcs;
    }
    //Kalkulasi profit yang diinginkan
    public double profit() {
        return this.calcPizzaPcs() + this.calcTopping()* 1.4;
    }
    //Kalkulasi jumlah pembuatan adonan
    public int totalPizza(){
        return this.pcs / this.totalWeightpcs() ;
    }
    //Kalkulasi jumlah pcs yang didapatkan setiap pembuatan adonan
    public int totalWeightpcs(){
        return Math.round(this.calcPizzaWeight() / 190);
    }
    //Kalkulasi seluruh modal pizza yang digunakan untuk memenuhi orderan
    public int calcPizzaPcs(){
        return this.calcPizza() * this.totalPizza();
    }
    //Kalkulasi per pcs yang seharusnya digunakan untuk memenuhi margin profit 40%
    public double calcPizzaPerPcs(){
        return this.profit() / this.pcs;
    }
    
    
        //Kalkulasi berat setiap bahan yang digunakan untuk memenuhi orderan
    public int totalAdonan(){
        return this.totalPizza() ;
    }
    public int totalButter(){
        return this.butter() * this.totalAdonan();
    }
    public int totalGula(){
        return this.gula()* this.totalAdonan();
    }
    public int totalTepung(){
        return this.tepung()* this.totalAdonan();
    }
    public int totalTelur(){
        return this.telur()* this.totalAdonan();
    }
    public int totalRagi(){
        return this.ragi()* this.totalAdonan();
    }
    public int totalSusuBubuk(){
        return this.susuBubuk()* this.totalAdonan();
    }
    public int totalSusuCair(){
        return this.susuCair() * this.totalAdonan();
    }
    public int totalEsBatu(){
        return this.esBatu()* this.totalAdonan();
    }
    public int totalKeju(){
        return this.Keju * this.pcs;
    }
    public int totalBawangbombay(){
        return this.BawangBombay * this.pcs;
    }
    public int totalSmokedbeef(){
        return this.SmokedBeef * this.pcs;
    }
    public int totalSosis(){
        return this.Sosis * this.pcs;
    }
}
