package com.example.projectmunka.service;

import com.example.projectmunka.model.ProjectModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ProjectService {
    @PersistenceContext
    EntityManager en;
    @Transactional
    public boolean manager (ProjectModel projectModel) {
        en.persist(projectModel);
        return true;
    }
    public List<ProjectModel> List() {
      return en.createQuery("SELECT p from ProjectModel p", ProjectModel.class).getResultList(); //Listat keszit
    }
}
