/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpdao.model;

import java.util.ArrayList;
import tpdao.model.Person;

public class daoPerson implements daoPersonInterface{

    private ArrayList<Person> p = new ArrayList();
    private static int nextId = 1;
    
    
    public void create(Person p) {
                       
        if(p.getId() != 0){
            p.setId(nextId++);
            this.p.add(p);
        }
    }

    @Override
    public void update(Person p, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Person> readAll() {
                
        return p;
    }

    @Override
    public Person readById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
    
    
    
//    public void create (Person p){
//        
//        if(p.getId() != 0){
//            p.setId(nextId++);
//            this.p.add(p);
//        }
//    }   

    
}
