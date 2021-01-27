package com.bh.project.dao;

import com.bh.project.pojo.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchDao extends JpaRepository<Branch, Integer> {
    //继承类--JpaRepository<实体类,类的主键>
}
