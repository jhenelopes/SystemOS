/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Vendas;
import java.util.List;
import org.hibernate.Criteria;
import bean.VendasProdutos;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author jhene
 */
public class  VendasProdutosDAO extends DAO_Abstract {

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
    Criteria criteria = session.createCriteria(VendasProdutos.class);
    criteria.add(Restrictions.eq("idvendas_produtos",id));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista.get(0);
           
    }

    @Override
    public List listAll() {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(VendasProdutos.class);
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
    }
    
     public Object listVP(Vendas vendas) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(VendasProdutos.class);
    criteria.add(Restrictions.eq("vendas",vendas));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
    }  
    
}
