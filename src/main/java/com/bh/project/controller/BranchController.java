package com.bh.project.controller;
import com.bh.project.entity.Result;
import com.bh.project.entity.StautsCode;
import com.bh.project.pojo.Branch;
import com.bh.project.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

/**
 * @GetMapping
 *      用于将HTTP GET请求映射到特定处理程序方法的注释。
 *      具体来说，@GetMapping是一个作为快捷方式的组合注释
 *      @RequestMapping(method = RequestMethod.GET)。
 *
 * @PostMapping
 *      用于将HTTP POST请求映射到特定处理程序方法的注释。
 *      具体来说，@PostMapping是一个作为快捷方式的组合注释
 *      @RequestMapping(method = RequestMethod.POST)。
 *
 * @RequestMapping:
 *      一般情况下都是用@RequestMapping（method=RequestMethod.），
 *      因为@RequestMapping可以直接替代以上两个注解，
 *      但是以上两个注解并不能替代@RequestMapping，
 *      @RequestMapping相当于以上两个注解的父类！
 */

@RestController
@RequestMapping("/branch")
public class BranchController {
    /**
     * 导入bean 依赖serive完成功能调用
     * @return
     */
    @Autowired
    private BranchService branchService;

    /**
     * findById 根据id查询信息
     * @return
     */
    /*@GetMapping("/findById")
    public Object findById() {
        return branchService.findById(1);
    }*/

    /*@RequestMapping("/findById")
    public Result findById(Integer id) {
        Optional<Branch> branchOptional = branchService.findById(id);
        return new Result(200,"查询成功",branchOptional);
    }*/

    @RequestMapping("/findById")
    public Result findById(Integer id) {
        Optional<Branch> branchOptional = branchService.findById(id);
        if (branchOptional.isPresent()) {
            return new Result(StautsCode.SUCCESS,"查询成功",branchOptional);
        }
        return new Result(StautsCode.FAIL,"查询失败");
    }

    /**
     * findAll 获取所有信息
     * @return
     */
    /*@GetMapping("/findAll")
    public List<Branch> findAll() {
        return branchService.findAll();
    }*/

    /*@RequestMapping("/findAll")
    private Result findAll() {
       List<Branch> branchList= branchService.findAll();
       return new Result(200,"查询成功",branchList);
    }*/

    @RequestMapping("/findAll")
    private Result findAll() {
        List<Branch> branchList= branchService.findAll();
        return new Result(StautsCode.SUCCESS,"查询成功",branchList);
    }

    @GetMapping("/test")
    public String testBranch() {
        return "success";
    }
}
