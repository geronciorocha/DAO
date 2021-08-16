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
   
    public <T> T ControllerFind(Class<T> _class, Object pk_codId) throws Exception{
        if (com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().isOpen()) {
            return find(_class, pk_codId);
        }
        return null;
    }
    
    public List<? extends Object> ControllerFindAll(Class<?> _class) throws Exception {
        if (com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().isOpen()) {
            return findAll(_class);
        }
        return null;
    }
    
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
    
    public List<? extends Object> ControllerFindByNameDesc(Class<?> _class, Map<String, Object> filtro) throws Exception {
        if (com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().isOpen()) {
            return findByNameDesc(_class, filtro);
        }
        return null;
    }
    
    public <T> T ControllerPersistMerge(Class<T> _class, Object object)throws Exception{
        if (com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().isOpen()) {
            return persistMerge(_class, object);
        }
        return null;
    }
    
    public boolean ControllerRemove(Object object)throws Exception{
        return remove(object);
    }
    
   
    
    public Controller(){
    }
    
}
