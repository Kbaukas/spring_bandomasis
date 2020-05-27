package lt.kb.bandomasis.egzaminas.controller;

import lt.kb.bandomasis.egzaminas.dao.StudentasDao;
import lt.kb.bandomasis.egzaminas.services.StudentasService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class StudentasController {
    private final StudentasService studentasService;
    private final StudentasDao studentasDao;
      public StudentasController(StudentasService studentasService, StudentasDao studentasDao) {
          this.studentasService = studentasService;
          this.studentasDao = studentasDao;
      }
    @GetMapping
    String getallStores (Model model) {
        model.addAttribute("studentai", studentasService.getAllStudents());
        return "lentele";

    }



}
