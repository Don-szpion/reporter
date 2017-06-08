package org.mkssu.controller;

import org.mkssu.dao.entity.Student;
import org.mkssu.dao.repository.StudentRepository;
import org.mkssu.service.ReporterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class SiteController {
    @Resource
        private ReporterService reporterService;

    @RequestMapping(path = "/home")

    public ModelAndView homePage(ModelAndView  model) {
        System.out.println("in method homePage");
        List<Student> all = reporterService.findAll();
        System.out.println(all);
        model.getModel().put("list", all);
        model.setViewName("home");
        return model;
    }

//    private List <Student> findAll(@RequestParam(required=false) String studentNumber){
//       List<Student> students = new ArrayList<>();
//        if(null==studentNumber){
//            Iterable<Student> results = this.studentRepository.findAll();
//            results.forEach(student-> {students.add(student);});
//        } else {
//            Student student = this.studentRepository.findByNumber(Integer.parseInt(studentNumber));
//            if (null!=student){
//                students.add(student);
//            }
//        }
//        return students;
//    }
}
