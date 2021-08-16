/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Cliente
 */
public class Controller extends DAO{
   
    public List<? extends Object> ControllerFindByCodId(Class<?> _class, Map<String, Object> filtro) throws Exception {
        if (com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().isOpen()) {
            return findByCodId(_class, filtro);
        }
        return null;
    }
    
    public List<? extends Object> ControllerFindByValueMaximo(Class<?> _class, Map<String, Object> filtro) throws Exception {
        if (com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().isOpen()) {
            return findByValueMaximo(_class, filtro);
        }
        return null;
    }
   
    
    public Controller(){
    }
    
}
