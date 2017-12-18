/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Controller_Login;
import Database.Database;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alifa Nur Azzami
 */
public class Aplikasi {
        private List<Jadwal> DaftarJadwal = new ArrayList<>();
        private List<UserMhs> DaftarMahasiswa = new ArrayList<>();
        private List<UserDsn> DaftarDosen  = new ArrayList<>();
        private Database data;
        
        public Aplikasi(){
            this.data = new Database();
        }
        
        public void showJadwal(){
            for (Object o : DaftarJadwal) {
                System.out.println(o);
            }
        }
        
        public UserMhs LoginMhs(String unamemhs, String pass){
            UserMhs m = data.getMhs(unamemhs, pass);
            if (m != null){
                return m;
            }else{
                return null;
            }
        }
        
        public UserDsn LoginDsn(String unamedsn, String pass){
           UserDsn d = data.getDsn(unamedsn, pass);
           if (d != null){
               return d;
           }else{
               return null;
           }
        }
        
        public static void main(String[] args) {
            Aplikasi a = new Aplikasi();
            //new Controller_Login(a);
    }
        
        
}
