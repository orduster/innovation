package cn.edu.nchu.innovation.controller;

import cn.edu.nchu.innovation.entity.File;
import cn.edu.nchu.innovation.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
//@RequestMapping("/pioneer")
public class FileController {

    @Autowired
    private FileService service;

    /*存储文件目录*/
    @Value("${file.path}")
    private String filePath;

    @GetMapping("/province")
    public String provinceFile(Model model) {
        List<File> files = service.provinceFile();
        model.addAttribute("files", files);
        return "province";
    }

    @GetMapping("/school")
    public String schoolFile(Model model) {
        List<File> files = service.schoolFile();
        model.addAttribute("files", files);
        return "school";
    }

    @GetMapping("/resource")
    public String resourceFile(Model model) {
        List<File> files = service.resourceFile();
        model.addAttribute("files", files);
        return "resource";
    }

    @GetMapping("/file/{id}")
    @ResponseBody
    public String download(@PathVariable("id") Integer id, HttpServletResponse response) {
        File serviceFile = service.getFile(id);
        Path path = Paths.get(filePath + serviceFile.getUrl());
        String fileName = null;
        try {
            fileName = URLEncoder.encode(serviceFile.getUrl(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setContentType("application/force-download");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        OutputStream stream = null;
        try {
            stream = response.getOutputStream();
            Files.copy(path, stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "下载完成";
    }
}
