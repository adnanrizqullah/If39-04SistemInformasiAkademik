/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Alifa Nur Azzami
 */
public class Pembayaran {
    public UserMhs user;
    public Bayar bayar;
    
    
    public boolean isBayar(java.util.List<Bayar> r, Bayar r1) {
        boolean isfound = false;
        for (Bayar o : r) {
            if (o.getKodeBayar() == r1.getKodeBayar()) {
                isfound = true;
                break;
            }
        }
        return isfound;
    }
}
