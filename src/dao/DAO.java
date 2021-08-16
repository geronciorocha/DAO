/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Map;
import javax.persistence.Query;

/**
 *
 * @author Cliente<T> T find(Class<T> var1
 */
class  DAO {
    protected <T> T find(Class<T> _class, Object pk_codId) throws Exception{
        Object o = null;
        try {
            o = com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().find(_class, pk_codId);
        }finally{
            com.confiancasistemas.entity.EntityManager.getInstance().closeEntityManager();
        }
        return (T) o;
    }
    protected <T> T persistMerge(Class<T> _class, Object object)throws Exception{
        Object o = null;
        try{
            if(!com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().getTransaction().isActive()){
            com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().getTransaction().begin();}
            o = com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().merge(object);
            com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().getTransaction().commit();
        }finally{
            com.confiancasistemas.entity.EntityManager.getInstance().closeEntityManager();
        }
        return (T) o;
    }
    protected boolean remove(Object object)throws Exception{
        try{
            if(!com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().getTransaction().isActive()){
                com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().getTransaction().begin();}
            if(!com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().contains(object)){
                object = com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().merge(object);
            }
            com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().remove(object);
            return true;
        }finally{
            com.confiancasistemas.entity.EntityManager.getInstance().closeEntityManager();
        }
    }
    
    protected List<? extends Object> findByCodId(Class<?> _class, Map<String, Object> params) throws Exception {
        try {
            if(bd.DAO.Cliente.class==_class){
                Query q = com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().createNamedQuery("Cliente.findByCodigoCliente");
                params.entrySet().forEach((entry) -> {
                    q.setParameter(entry.getKey(), entry.getValue());
                });
                return q.getResultList();
            }
            
            else{
                throw new Exception("Método de pesquisa não foi implementado para classe: "+_class.toString());
            }
        } finally {
            com.confiancasistemas.entity.EntityManager.getInstance().closeEntityManager();
        }
    }
    protected List<? extends Object> findByValueMaximo(Class<?> _class, Map<String, Object> params) throws Exception {
        try {
            if(bd.DAO.GupoProduto.class==_class){
                Query q = com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().createNamedQuery("GupoProduto.findByDescontoMaximo");
                params.entrySet().forEach((entry) -> {
                    q.setParameter(entry.getKey(), entry.getValue());
                });
                return q.getResultList();
            }
            
            else{
                throw new Exception("Método de pesquisa não foi implementado para classe: "+_class.toString());
            }
        } finally {
            com.confiancasistemas.entity.EntityManager.getInstance().closeEntityManager();
        }
    }
    protected List<? extends Object> findAll(Class<?> _class) throws Exception {
        try {
            if(bd.DAO.AliquotaSimplesNacional.class==_class){
                Query q = com.confiancasistemas.entity.EntityManager.getInstance().currentEntityManager().createNamedQuery("AliquotaSimplesNacional.findAll");
                return q.getResultList();
            }
            
            else{
                throw new Exception("Método de pesquisa não foi implementado para classe: "+_class.toString());
            }
        } finally {
            com.confiancasistemas.entity.EntityManager.getInstance().closeEntityManager();
        }
    }
}
