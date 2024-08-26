/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tpdao.model;

import java.util.ArrayList;
import tpdao.model.Person;

public interface daoPersonInterface {
    
    public void create (Person p);
    public void update (Person p, int id);
    public void delete (Person p);
    public ArrayList<Person> readAll ();
    public Person readById (int id);
    
}
