/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arya
 */
public class TiketKonser {
    public String np, ae, nt, em, tgl, wkt, lks, kat;
    public int jml;
    public double hrg, sub, ppn, tot, ub;


    public void setNp(String val) {
        np = val;
    }

    public String getNp() {
        return np;
    }
    

    public void setAe(String val) {
        ae = val;
    }

    public String getAe() {
        return ae;
    }
    

    public void setNt(String val) {
        nt = val;
    }
    
    public String getNt() {
        return nt;
    }

    public void setEm(String val) {
        em = val;
    }
    
    public String getEm() {
        return em;
    }

    public void setTgl(String val) {
        tgl = val;
    }
    
    public String getTgl() {
        return tgl;
    }

    public void setWkt(String val) {
        wkt = val;
    }
    
    public String getWkt() {
        return wkt;
    }

    public void setLks(String val) {
        lks = val;
    }
    
    public String getLks() {
        return lks;
    }

 
    public void setKat(String val) {
        kat = val;
    }
    
    public String getKat() {
        return kat;
    }

    public void setJml(int val) {
        jml = val;
    }
    
    public int getJml() {
        return jml;
    }
    
    public double getHrg() {
        return hrg;
    }
    
    public void setSeleksiEm(){
        if(em.equalsIgnoreCase("BLANKPUNK")){
            tgl = "03 Oktober 2023";
            wkt = "19.00 WIB";
            lks = "SKY STADION";
        }else if(em.equalsIgnoreCase("COS PLY")){
            tgl = "11 Maret 2024";
            wkt = "17.00 WIB";
            lks = "CENTRAL STADION";
        }else{
            tgl = "";
            wkt = "";
            lks = "";
        }
    }
    
    public void setSeleksiKat(){
        if(em.equalsIgnoreCase("BLANKPUNK")){
            if(kat.equalsIgnoreCase("KATEGORI I")){
                hrg = 1200000;
            }else if(kat.equalsIgnoreCase("KATEGORI II")){
                hrg = 900000;
            }else if(kat.equalsIgnoreCase("KATEGORI III")){
                hrg = 700000;
            }else if(kat.equalsIgnoreCase("VIP")){
                hrg = 1950000;
            }else{
                hrg = 0;
            }
        }else if(em.equalsIgnoreCase("COS PLY")){
            if(kat.equalsIgnoreCase("KATEGORI I")){
                hrg = 1000000;
            }else if(kat.equalsIgnoreCase("KATEGORI II")){
                hrg = 750000;
            }else if(kat.equalsIgnoreCase("KATEGORI III")){
                hrg = 500000;
            }else if(kat.equalsIgnoreCase("VIP")){
                hrg = 1800000;
            }else{
                hrg = 0;
            }
        }
    }
    
    public double getSub() {
        sub = hrg * jml;
        return (sub);
    }

    public double getPpn() {
        ppn = sub * 0.10;
        return (ppn);
    }

    public double getTot() {
        tot = sub + ppn;
        return (tot);
    }
    
    
}
