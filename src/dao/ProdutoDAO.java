/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Produto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author jhene
 */
public class ProdutoDAO  extends DAO_Abstract {

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
    Criteria criteria = session.createCriteria(Produto.class);
    criteria.add(Restrictions.eq("codigo",id));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista.get(0);
    }

    @Override
    public List listAll() {
       session.beginTransaction();
    Criteria criteria = session.createCriteria(Produto.class);
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
    }
    
    public List listProdutos(int codigo){
     session.beginTransaction();
    Criteria criteria = session.createCriteria(Produto.class);
    criteria.add(Restrictions.eq("idvendas",codigo));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;   
    }
    
    //consultas 
public List listNome(String nome) {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(Produto.class);
       criteria.add(Restrictions.like("nome", "%"+ nome + "%"));
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista;
    }

    public List listValor(double valor) {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(Produto.class);
       criteria.add(Restrictions.ge("valor", valor ));
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista;
    }
    public List listNomeValor(String nome, double valor) {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(Produto.class);
       criteria.add(Restrictions.like("nome", "%"+ nome + "%"));
        criteria.add(Restrictions.ge("valor", valor ));
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista;
    }

}
