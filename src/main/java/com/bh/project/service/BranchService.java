package com.bh.project.service;

import com.bh.project.pojo.Branch;

import java.util.List;
import java.util.Optional;

public interface BranchService {
    /**
     * 获取所有信息功能
     * @return
     */
    List<Branch> findAll();

    /**
     * 根据id查询功能
     * @return
     */
    Optional<Branch> findById(Integer id);
}
