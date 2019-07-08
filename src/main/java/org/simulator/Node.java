package org.simulator;

import java.awt.Color;

public class Node
{
    private int angka;
    private int posAngkaX;
    private int posAngkaY;
    private int posKotakX;
    private int posKotakY;
    private Color warna;
    
    public Node()
    {
        this(0,10,20,0,0,Color.YELLOW);
    }
    
    public Node(int angka,int posAngkaX, int posAngkaY, int posKotakX, int posKotakY, Color warna)
    {
        this.angka=angka;
        this.posAngkaX=posAngkaX;
        this.posAngkaY=posAngkaY;
        this.posKotakX=posKotakX;
        this.posKotakY=posKotakY;
        this.warna=warna;
    }
    
    public void setAngka(int angka)
    {
        this.angka=angka;
    }
    
    public void setPosAngkaX(int posAngkaX)
    {
        this.posAngkaX=posAngkaX;
    }
    
    public void setPosAngkaY(int posAngkaY)
    {
        this.posAngkaY=posAngkaY;
    }
    
    public void setPosKotakX(int posKotakX)
    {
        this.posKotakX=posKotakX;
    }
    
    
    public void setPosKotakY(int posKotakY)
    {
        this.posKotakY=posKotakY;
    }
    
    public void setWarna(Color warna)
    {
        this.warna=warna;
    }
    
    public int getAngka()
    {
        return angka;
    }
    
    public int getPosAngkaX()
    {
        return posAngkaX;
    }
    
    public int getPosAngkaY()
    {
        return posAngkaY;
    }
    
    public int getPosKotakX()
    {
        return posKotakX;
    }
    
    public int getPosKotakY()
    {
        return posKotakY;
    }
    
    public Color getWarna()
    {
        return warna;
    }
}
