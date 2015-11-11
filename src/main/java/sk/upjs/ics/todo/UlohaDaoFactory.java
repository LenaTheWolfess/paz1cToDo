/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.todo;

/**
 *
 * @author student
 */
public enum UlohaDaoFactory {
    INSTANCE;
    public UlohaDao getUlohaDao()
    {
        String profil = System.getProperty("profil");
        if("db".equals(profil))
        {
        return new MySqlUlohaDao();
        }
        else
        {
            return new PamatovyUlohaDao();
        }
    }
}
