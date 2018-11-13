package cn.edu.nchu.innovation.controller;

import cn.edu.nchu.innovation.entity.*;
import cn.edu.nchu.innovation.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 默认跳转
 **/
@Controller
//@RequestMapping("/pioneer")
public class IndexController {

    @Autowired
    private ShowArticleService showArticleService;

    @Autowired
    private IndexImagesService imagesService;

    @Autowired
    private CollegeService collegeService;

    @Autowired
    private ContactService contactService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private PracticeService practiceService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StructureService structureService;

    @Autowired
    private WorksService worksService;

    @Autowired
    private IntroductionService introductionService;

    @Autowired
    private TeamService teamService;

    @Autowired
    private EntrepreneurService entrepreneurService;

    @Autowired
    private ActivityService activityService;

    /*首页*/
    @RequestMapping({"/", "/index"})
    public String index(Model model) {
        List<Article> notices = showArticleService.showNotices();
        List<Article> news = showArticleService.showNews();
        List<IndexImages> indexImages = imagesService.showIndexImages();
        model.addAttribute("notices", notices);
        model.addAttribute("news", news);
        model.addAttribute("images", indexImages);
        return "index";
    }

    /*文章查看详细*/
    @GetMapping("/article/{id}")
    public String details(@PathVariable("id") Integer id, Model model) {
        Article article = showArticleService.showDetails(id);
        model.addAttribute("article", article);
        return "articleDetails";
    }

    /*通知公告*/
    @GetMapping("/notices")
    public String notices(Model model) {
        List<Article> notices = showArticleService.allNotices();
        model.addAttribute("notices", notices);
        return "noticesList";
    }

    /*新闻*/
    @GetMapping("/news")
    public String news(Model model) {
        List<Article> news = showArticleService.allNews();
        model.addAttribute("news", news);
        return "newsList";
    }

    /*学院简介*/
    @RequestMapping("/college")
    public String college(Model model) {
        College college = collegeService.getCollege();
        model.addAttribute("college", college);
        return "college";
    }

    /*人员结构*/
    @RequestMapping("/structure")
    public String structure(Model model) {
        Structure structure = structureService.getStructure();
        model.addAttribute("structure", structure);
        return "structure";
    }

    /*联系我们*/
    @RequestMapping("/contact")
    public String contact(Model model) {
        Contact contact = contactService.getContact();
        model.addAttribute("contact", contact);
        return "contact";
    }

    /*双创课程*/
    @RequestMapping("/course")
    public String course(Model model) {
        Course course = courseService.getCourse();
        model.addAttribute("course", course);
        return "course";
    }

    /*双创实践*/
    @RequestMapping("/practice")
    public String practice(Model model) {
        Practice practice = practiceService.getPractice();
        model.addAttribute("practice", practice);
        return "practice";
    }

    /*双创团队*/
    @RequestMapping("/team")
    public String team(Model model) {
        List<Team> teams = teamService.teamList();
        model.addAttribute("teams", teams);
        return "team";
    }

    /*根据id查看团队*/
    @GetMapping("/team/{id}")
    public String team(@PathVariable("id") Integer id, Model model) {
        Team teamById = teamService.getTeamById(id);
        model.addAttribute("team", teamById);
        return "teamDetails";
    }

    /*校内导师*/
    @RequestMapping("/onCampus")
    public String onCampus(Model model) {
        List<Teacher> onCampus = teacherService.onCampus();
        model.addAttribute("onCampus", onCampus);
        return "onCampus";
    }

    /*校外导师*/
    @RequestMapping("/offCampus")
    public String offCampus(Model model) {
        List<Teacher> offCampus = teacherService.offCampus();
        model.addAttribute("offCampus", offCampus);
        return "offCampus";
    }

    /*双创标兵*/
    @RequestMapping("/entrepreneur")
    public String entrepreneurs(Model model) {
        List<Entrepreneur> entrepreneurs = entrepreneurService.entrepreneurList();
        model.addAttribute("entrepreneurs", entrepreneurs);
        return "entrepreneur";
    }

    /*根据id查看标兵*/
    @GetMapping("/entrepreneur/{id}")
    public String entrepreneurs(@PathVariable("id") Integer id, Model model) {
        Entrepreneur entrepreneurById = entrepreneurService.getEntrepreneurById(id);
        model.addAttribute("entrepreneur", entrepreneurById);
        return "entrepreneurDetails";
    }

    /*双创作品*/
    @RequestMapping("/works")
    public String works(Model model) {
        List<Works> allWorks = worksService.getAllWorks();
        model.addAttribute("works", allWorks);
        return "works";
    }

    /*众创空间简介*/
    @GetMapping("/introduction")
    public String introduction(Model model) {
        Introduction introduction = introductionService.getIntroduction();
        model.addAttribute("introduction", introduction);
        return "introduction";
    }

    /*众创空间活动*/
    @RequestMapping("/activity")
    public String activities(Model model) {
        List<Activity> activities = activityService.activityList();
        model.addAttribute("activities", activities);
        return "activity";
    }

    /*根据id查看团队*/
    @GetMapping("/activity/{id}")
    public String activity(@PathVariable("id") Integer id, Model model) {
        Activity activityById = activityService.getActivityById(id);
        model.addAttribute("activity", activityById);
        return "activityDetails";
    }
}
