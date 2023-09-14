/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author jhene
 */
public class UsuarioDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
             session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();   
    }

    @Override
    public void delete(Object object) {
             session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();  
    }

    @Override
    public Object list(int id) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Usuario.class);
    criteria.add(Restrictions.eq("idusuario",id));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista.get(0);
    }

    @Override
public List listAll() {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Usuario.class);
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
    
    }
public List listApelido(String apelido) {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("apelido", "%"+ apelido + "%"));
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista;
       
    }
    public List listAtivo(boolean ativo) {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(Usuario.class);
      if (ativo == true){
          criteria.add(Restrictions.eq("ativo", "S" ));
      } else {
          criteria.add(Restrictions.eq("ativo", "N" ));
      }
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista;
       
    }
    public List listApelidoAtivo(String apelido, boolean ativo) {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("apelido", "%"+ apelido + "%"));
        if (ativo == true){
          criteria.add(Restrictions.eq("ativo", "S" ));
      } else {
          criteria.add(Restrictions.eq("ativo", "N" ));
      }
       List lista = criteria.list();
       session.getTransaction().commit();

       return lista;
       
    }

    
     public boolean EntrarPrograma(String apelido, String senha) {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("apelido",  apelido ));
        criteria.add(Restrictions.like("senha",  senha  ));
       List lista = criteria.list();
       session.getTransaction().commit();
       if(lista.size() == 1){
           return true; 
       }
        return false;
     }
}
