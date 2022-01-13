package model;

import entity.Kw;
import java.util.ArrayList;

public class KwList {
    
    private ArrayList<Kw> listKw;
    
    public KwList() {
        listKw = new ArrayList<>();
    }
    
    public void add(Kw importBaru) {
        listKw.add(importBaru);
    }
    
    public int len() {
        return listKw.size();
    }
    
    public void update(int idx, Kw importBaru) {
        listKw.set(idx, importBaru);
    }
    
    public Kw delete(int idx) {
        Kw dataDihapus = listKw.get(idx);
        
        listKw.remove(idx);
        
        return dataDihapus;
    }
    
    public void clear() {
        listKw.clear();
    }
    
    public Kw get(int idx) {
        return listKw.get(idx);
    }
    
    public int cari(String idCari) {
        
        int len = len();
        
        for(int i = 0; i < len; i++) {
            if(get(i).getId().equals(idCari)) {
                return i;
            }
        }
        
        return -1;
    }
    
}
