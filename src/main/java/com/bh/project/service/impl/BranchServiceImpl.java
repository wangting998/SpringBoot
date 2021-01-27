package com.bh.project.service.impl;

import com.bh.project.dao.BranchDao;
import com.bh.project.pojo.Branch;
import com.bh.project.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceImpl implements BranchService {
    /**
     * 实现接口  依赖dao
     */
    @Autowired
    //实现接口  依赖dao
    private BranchDao branchDao;

    /**
     * 查询所有信息
     * @return
     */
    @Override
    public List<Branch> findAll() {
        return branchDao.findAll();
    }

    /**
     * 根据id查询
     * @return
     */
    @Override
    public Optional<Branch> findById(Integer id) {
        return branchDao.findById(id);
    }
}
