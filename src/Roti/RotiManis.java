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
public class RotiManis extends Dough implements interfaces {
    int Varian1pcs;
    int Varian2pcs;
    int Varian3pcs;
    private int Keju;
    private int Sosis;
    private int Coklat;
    private int RedBean;
    private int Vanilla;
    
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
    public int calcsosis( int x) {
        this.Sosis = x;
        return this.Sosis * 80000 / 1000;
    }
    public int calccoklat( int x){
        this.Coklat = x;
        return this.Coklat * 29000 / 500;
    }
    public int calcredBean( int x){
        this.RedBean = x;
        return this.RedBean * 25000 / 500;
    }
    public int calcvanilla( int x){
        this.Vanilla = x;
        return this.Vanilla * 30000 / 500;
    }
    
    
    
    //Kalkulasi berat dari setiap topping dan filling
    public int calcWeightKeju (int x){
        return this.Keju = x;
    }
    public int calcWeightCoklat (int x){
        return this.Coklat = x;
    }
    public int calcWeightRedBean (int x){
        return this.RedBean = x;
    }
    public int calcweightVanilla (int x){
        return this.Vanilla = x;
    }
    public int calcweightSosis (int x){
        return this.Sosis = x;
    }
    
    
    //Kalkulasi modal yang digunakan
    private int calcRotiManis() {
        return calcEsbatu() + this.calcButter() + this.calcGula() + this.calcRagi() + this.calcSusububuk() + this.calcSusucair() + this.calcTelur() +this.calcTepung() ;
    }
    //Kalkulasi berat seluruh bahan yang digunakan
    public int calcRotiManisWeight(){
        return this.butter() + this.esBatu() + this.gula() + this.telur() + this.tepung() + this.susuBubuk() + this.susuCair() + this.ragi() ;
    }
    //Kalkulasi jumlah pcs yang didapatkan setiap pembuatan adonan
    public int totalWeightpcs(){
        return Math.round(this.calcRotiManisWeight() / 50);
    }
    
    
    //VARIAN 1
    //Kalkulasi jumlah pembuatan adonan
    public int totalRotiManispcsVar1(){
        return Math.round(this.Varian1pcs / this.totalWeightpcs()) ;
    }
    //Kalkulasi seluruh modal Roti Manis yang digunakan untuk memenuhi orderan varian 1
    public int calcRotiManisVar1Pcs(){
        return this.calcRotiManis() * this.totalRotiManispcsVar1();
    }
     //Kalkulasi profit yang diinginkan
    public double profitVar1() {
        return this.calcRotiManisVar1Pcs() + this.calcFillingVar1() * 1.4;
    }
    //Kalkulasi modal filling varian 1
    public int calcFillingVar1(){
        return (this.calccoklat(5) + this.calckeju(5) + this.calccoklat(5)) * this.Varian1pcs;
    }
    //Kalkulasi per pcs yang seharusnya digunakan untuk memenuhi margin profit 40%
    public double calcRotiManisVar1PerPcs(){
        return this.profitVar1() / this.Varian1pcs;
    }
    
        //VARIAN 2
    //Kalkulasi jumlah pembuatan adonan
    public int totalRotiManispcsVar2(){
        return Math.round(this.Varian2pcs / this.totalWeightpcs()) ;
    }
    //Kalkulasi seluruh modal Roti Manis yang digunakan untuk memenuhi orderan varian 1
    public int calcRotiManisVar2Pcs(){
        return this.calcRotiManis() * this.totalRotiManispcsVar2();
    }
     //Kalkulasi profit yang diinginkan
    public double profitVar2() {
        return this.calcRotiManisVar2Pcs() + this.calcFillingVar2() * 1.4;
    }
    // Kalkulasi modal filling varian 2
    public int calcFillingVar2(){
        return (this.calcredBean(10) + this.calcvanilla(5)) * this.Varian2pcs;
    }
    //Kalkulasi per pcs yang seharusnya digunakan untuk memenuhi margin profit 40%
    public double calcRotiManisVar2PerPcs(){
        return this.profitVar2() / this.Varian2pcs;
    }
    
        //VARIAN 3
    //Kalkulasi jumlah pembuatan adonan
    public int totalRotiManispcsVar3(){
        return Math.round(this.Varian3pcs / this.totalWeightpcs()) ;
    }
    //Kalkulasi seluruh modal Roti Manis yang digunakan untuk memenuhi orderan varian 1
    public int calcRotiManisVar3Pcs(){
        return this.calcRotiManis() * this.totalRotiManispcsVar3();
    }
    //Kalkulasi profit yang diinginkan
    public double profitVar3() {
        return this.calcRotiManisVar3Pcs() + this.calcFillingVar3() * 1.4;
    }
    // Kalkulasi modal filling varian 3
    public int calcFillingVar3(){
        return (this.calckeju(10) + this.calcsosis(10)) * this.Varian3pcs;
    }
    //Kalkulasi per pcs yang seharusnya digunakan untuk memenuhi margin profit 40%
    public double calcRotiManisVar3PerPcs(){
        return this.profitVar3() / this.Varian3pcs;
    }
    
    
    //Kalkulasi berat setiap bahan yang digunakan untuk memenuhi orderan
    @Override
    protected int totalAdonan(){
        return this.totalRotiManispcsVar1() + this.totalRotiManispcsVar2() + this.totalRotiManispcsVar3();
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
        return this.calcWeightKeju(5) * this.totalRotiManispcsVar1() + this.calcWeightKeju(10) * this.totalRotiManispcsVar3();
    }
    @Override
    protected int totalCoklat(){
        return this.calcWeightCoklat(5) * this.totalRotiManispcsVar1();
    }
    @Override
    protected int totalRedBean(){
        return this.calcWeightRedBean(10) * this.totalRotiManispcsVar2();
    }
    @Override
    protected int totalVanilla(){
        return this.calcweightVanilla(5) * this.totalRotiManispcsVar2();
    }
    @Override
    protected int totalSosis(){
        return this.calcweightSosis(10) * this.totalRotiManispcsVar3();
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
