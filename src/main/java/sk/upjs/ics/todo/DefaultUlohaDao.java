/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.todo;

import java.util.List;

/**
 *
 * @author student
 */
class DefaultUlohaDao implements UlohaDao {

    private UlohaDao ulohaDao = UlohaDaoFactory.INSTANCE.getUlohaDao();
    
    public DefaultUlohaDao() {
    }

    @Override
    public void pridat(Uloha uloha) {
        ulohaDao.pridat(uloha);
    }

    @Override
    public List<Uloha> dajVsetky() {
       return ulohaDao.dajVsetky();    
    }

    @Override
    public void odstranit(Uloha uloha) {
        ulohaDao.odstranit(uloha);
    }

    @Override
    public void upravit(Uloha uloha) {
     ulohaDao.upravit(uloha);
    }
    
}
