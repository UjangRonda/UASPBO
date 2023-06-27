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
public class RotiTawar extends Dough implements interfaces {
    int Varian1pcs;
    int Varian2pcs;
    private int Keju;
    private int Coklat;
    
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
    
    
    
    //Kalkulasi modal dari setiap topping dan filling
    public int calckeju( int x) {
        this.Keju = x;
        return this.Keju * 31000 / 250;
    }
    public int calccoklat( int x){
        this.Coklat = x;
        return this.Coklat * 29000 / 500;
    }
    
    
    
    //Kalkulasi berat dari setiap topping dan filling
    public int calcWeightKeju (int x){
        return this.Keju = x;
    }
    public int calcWeightCoklat (int x){
        return this.Coklat = x;
    }

    
    
    //Kalkulasi modal yang digunakan
    private int calcRotiTawar() {
        return calcEsbatu() + this.calcButter() + this.calcGula() + this.calcRagi() + this.calcSusububuk() + this.calcSusucair() + this.calcTelur() +this.calcTepung() ;
    }
    //Kalkulasi berat seluruh bahan yang digunakan
    public int calcRotiTawarWeight(){
        return this.butter() + this.esBatu() + this.gula() + this.telur() + this.tepung() + this.susuBubuk() + this.susuCair() + this.ragi() ;
    }
    //Kalkulasi jumlah pcs yang didapatkan setiap pembuatan adonan
    public int totalWeightpcs(){
        return Math.round(this.calcRotiTawarWeight() / 400);
    }
    
    
    //VARIAN 1
    //Kalkulasi jumlah pembuatan adonan
    public int totalRotiTawarpcsVar1(){
        return Math.round(this.Varian1pcs / this.totalWeightpcs()) ;
    }
    //Kalkulasi seluruh modal Roti Manis yang digunakan untuk memenuhi orderan varian 1
    public int calcRotiTawarVar1Pcs(){
        return this.calcRotiTawar() * this.totalRotiTawarpcsVar1();
    }
     //Kalkulasi profit yang diinginkan
    public double profitVar1() {
        return this.calcRotiTawarVar1Pcs() + this.calcFillingVar1() * 1.4;
    }
    //Kalkulasi modal filling varian 1
    public int calcFillingVar1(){
        return this.calccoklat(80) * this.Varian1pcs;
    }
    //Kalkulasi per pcs yang seharusnya digunakan untuk memenuhi margin profit 40%
    public double calcRotiTawarVar1PerPcs(){
        return this.profitVar1() / this.Varian1pcs;
    }
    
        //VARIAN 2
    //Kalkulasi jumlah pembuatan adonan
    public int totalRotiTawarpcsVar2(){
        return Math.round(this.Varian2pcs / this.totalWeightpcs()) ;
    }
    //Kalkulasi seluruh modal Roti Manis yang digunakan untuk memenuhi orderan varian 1
    public int calcRotiTawarVar2Pcs(){
        return this.calcRotiTawar() * this.totalRotiTawarpcsVar2();
    }
     //Kalkulasi profit yang diinginkan
    public double profitVar2() {
        return this.calcRotiTawarVar2Pcs() + this.calcFillingVar2() * 1.4;
    }
    // Kalkulasi modal filling varian 2
    public int calcFillingVar2(){
        return this.calckeju(80) * this.Varian2pcs;
    }
    //Kalkulasi per pcs yang seharusnya digunakan untuk memenuhi margin profit 40%
    public double calcRotiTawarVar2PerPcs(){
        return this.profitVar2() / this.Varian2pcs;
    }
    
    //Kalkulasi berat setiap bahan yang digunakan untuk memenuhi orderan
    @Override
    protected int totalAdonan(){
        return this.totalRotiTawarpcsVar1() + this.totalRotiTawarpcsVar2() ;
    }
    @Override
    protected int totalButter(){
        return this.butter() * this.totalAdonan();
    }
    @Override
    protected int totalGula(){
        return this.gula()* this.totalAdonan();
    }
    @Override
    protected int totalTepung(){
        return this.tepung()* this.totalAdonan();
    }
    @Override
    protected int totalTelur(){
        return this.telur()* this.totalAdonan();
    }
    @Override
    protected int totalRagi(){
        return this.ragi()* this.totalAdonan();
    }
    @Override
    protected int totalSusuBubuk(){
        return this.susuBubuk()* this.totalAdonan();
    }
    @Override
    protected int totalSusuCair(){
        return this.susuCair() * this.totalAdonan();
    }
    @Override
    protected int totalEsBatu(){
        return this.esBatu()* this.totalAdonan();
    }
    @Override
    protected int totalKeju(){
        return this.calcWeightKeju(80) * this.totalRotiTawarpcsVar2();
    }
    @Override
    protected int totalCoklat(){
        return this.calcWeightCoklat(5) * this.totalRotiTawarpcsVar1();
    }
    @Override
    protected int totalRedBean(){
        return 0;
    }
    @Override
    protected int totalVanilla(){
        return 0;
    }
    @Override
    protected int totalSosis(){
        return 0;
    }

    @Override
    protected int totalBawangbombay() {
        return 0;
    }

    @Override
    protected int totalSmokedbeef() {
        return 0;
    }
}
