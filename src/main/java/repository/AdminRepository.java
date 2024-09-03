package repository;

import base.BaseRepository;
import jakarta.persistence.TypedQuery;
import model.Admin;

public class AdminRepository extends BaseRepository<Admin, Long> {
    public AdminRepository() {
        super(Admin.class);
    }

    public Admin findByEmail(String email) {
        String jpql = "SELECT admin FROM Admin admin WHERE admin.account.email = :email";
        TypedQuery<Admin> query = entityManager.createQuery(jpql, Admin.class);
        query.setParameter("email", email);
        return query.getSingleResult();
    }
}