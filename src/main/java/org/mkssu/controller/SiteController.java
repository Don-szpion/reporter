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
    //    private ReporterService reporterService;

    @Resource
    private StudentRepository studentRepository;
//
//    @RequestMapping(path = "/home")
//    @ResponseBody
//    public String test() {
//      Student student = new Student();
//      student.setName("First");
//      student.setEmail("Test");
//      studentRepository.save(student);
//        return "hello";
//}

    @RequestMapping(path = "/home")
//    @ResponseBody
//    public ModelAndView homePage(ModelAndView model) {
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView();
//        model.setViewName("mod");
        List<Student> list = new ArrayList<>();
        ReporterService reporterService = new ReporterService();
        Student byName = reporterService.findByName("12");
        list.add(byName);

        model.getModel().put("list", list);
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
