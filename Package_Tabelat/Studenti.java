/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelat;

/**
 *
 * @author taula
 */
public class Studenti {

    private int id;
    private String name;
    private String lastName;

    public Studenti(int id, String emri, String mbiemri) {
        this.id = id;
        this.name = emri;
        this.lastName = mbiemri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }
}
