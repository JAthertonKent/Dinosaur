package com.springapp.mvc;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class DinoController {
    private DinoMapper dinoMapper;
    private SqlSession sqlSession;

    public DinoController() {
        this.sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        this.dinoMapper = sqlSession.getMapper(DinoMapper.class);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("dinoList", dinoMapper.findAll());
        return "dino";
    }

    @RequestMapping(value = {"/dino"}, method = RequestMethod.POST)
    public String insertDino(HttpServletRequest request, ModelMap model, @ModelAttribute Dinosaur dino) {

        model.addAttribute("dinoList", dinoMapper.findAll());
        return "dino";
    }
}