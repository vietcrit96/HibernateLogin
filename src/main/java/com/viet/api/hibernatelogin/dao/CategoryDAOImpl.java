package com.viet.api.hibernatelogin.dao;

import com.viet.api.hibernatelogin.Entities.Category;
import com.viet.api.hibernatelogin.util.HibernateUtil;
import org.hibernate.*;

import java.util.List;

public class CategoryDAOImpl implements CategoryDAO {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void insertCategory(Category category) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(category);
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null) {
                transaction.rollback();
            }
            he.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Category> getCateByParent() {

        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<Category> categoryList = null;
        try {
            transaction = session.beginTransaction();
            categoryList = session.createQuery("'From category where parent =0'").list();

        } catch (HibernateException he) {
            if (transaction != null) {
                transaction.rollback();
            }
            he.printStackTrace();
        } finally {
            session.close();
        }
        return categoryList;
    }
}
