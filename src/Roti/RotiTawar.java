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
public class RotiTawar extends Dough implement interfaces {
    int Varian1pcs;
    int Varian2pcs;
    private int Coklat;
    private int Keju;
    
    //Bahan yang digunakan
    @Override
    int ragi(){
        return 20;
    }
    @Override
    int tepung (){
        return 1000;
    }
    @Override
    int gula(){
        return 125;
    }
    @Override 
    int butter(){
        return 100;
    }
    @Override
    int susuBubuk(){
        return 250;
    }
    @Override
    int susuCair(){
        return 200;
    }
    @Override
    int telur(){
        return 70;
    }
    @Override
    int esBatu(){
        return 300;
    }
    //kalkulasi modal dari setiap dough
    @Override 
    public int calcGula(){
        return this.gula()*this.Gula / 1000;
    }
    @Override
    public int calcTepung(){
        return this.tepung()*this.Tepung / 1000;
    }
    @Override
    public int calcButter(){
        return this.butter()*this.Butter / 500;
    }
    @Override
    public int calcRagi(){
        return this.ragi()*this.Ragi / 11;
    }
    @Override
    public int calcSusububuk(){
        return this.susuBubuk()*this.SusuBubuk / 1000;
    }
    @Override
    public int calcSusucair(){
        return this.susuCair()*this.SusuCair / 1000;
    }
    @Override
    public int calcTelur(){
        return this.telur()*this.Telur / 1000;
    }
    @Override
    public int calcEsbatu(){
        return this.esBatu()*this.EsBatu / 1000;
    }
    
    //kalkulasi modal dari setiap filling
    public int calccoklat(int x){
        this.Coklat = x;
        return this.Coklat * 29000 / 500;
    }
    public int calckeju(int x){
        this.Keju = x;
        return this.Keju * 31000 / 250;
    }
    
    //kalkulasi berat dari setiap filling
    public int calcWeightCoklat(int x){
        return this.Coklat = x;
    }
    public int calcWightKeju(int x){
        return this.Keju = x;
    }
    
    //kalkulasi modal yang digunakan
    private int calcRotiTawar(){
        return this.calcEsbatu() + this.calcButter() + this.calcGula() + this.calcRagi() + this.calcTepung() + this.calcSusububuk() + this.calcSusucair() + this.calcTelur();
    }
    
    //kalkulasi berat seluruh bahan yang digunakan
    public int calcRotiTawarWeight(){
        return this.calcEsbatu() + this.calcButter() + this.calcGula() + this.calcRagi() + this.calcSusububuk() + this.calcSusucair() + this.calcTepung() + this.calcTelur();
    }
    //kalkulasi jumlah pcs
}
