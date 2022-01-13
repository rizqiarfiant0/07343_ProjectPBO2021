package model;

import entity.Original;
import java.util.ArrayList;

public class OriginalList {
    
    private ArrayList<Original> listOriginal;
    
    public OriginalList() {
        listOriginal = new ArrayList<>();
    }
    
    public void add(Original importBaru) {
        listOriginal.add(importBaru);
    }
    
    public int len() {
        return listOriginal.size();
    }
    
    public void update(int idx, Original importBaru) {
        listOriginal.set(idx, importBaru);
    }
    
    public Original delete(int idx) {
        Original dataDihapus = listOriginal.get(idx);
        
        listOriginal.remove(idx);
        
        return dataDihapus;
    }
    
    public void clear() {
        listOriginal.clear();
    }
    
    public Original get(int idx) {
        return listOriginal.get(idx);
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
