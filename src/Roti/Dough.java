/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roti;


/**
 *
 * @author user
 */
public abstract class Dough {
    protected int Tepung = 40000;
    protected int Gula = 25000;
    protected int Butter = 23000;
    protected int Ragi = 5000;
    protected int SusuBubuk = 39000;
    protected int SusuCair = 24000;
    int Telur = 23000;
    int EsBatu = 2000;
    
    abstract int ragi();
    abstract int gula();
    abstract int tepung();
    abstract int butter();
    abstract int susuBubuk();
    abstract int susuCair();
    abstract int telur();
    abstract int esBatu();

    
}
