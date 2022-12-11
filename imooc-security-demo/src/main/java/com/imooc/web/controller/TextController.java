package com.imooc.web.controller;

import com.caixia.sensitive.annotation.SensitiveEntity;
import com.caixia.sensitive.core.util.SensitiveUtil;
import com.imooc.dto.FileInfo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.util.*;

@RestController
@RequestMapping("/test")
public class TextController {

    @GetMapping
    public void test(String str) {


    }

//    public void download(HttpServletResponse response){
//        Map<String, Object> data = buildData();
//        try(BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream())) {
//            response.setContentType(MediaType.APPLICATION_PDF_VALUE);
//            response.setCharacterEncoding(PDFUtils.ENCODING);
//            String fileName = URLEncoder.encode("访问记录.pdf", PDFUtils.ENCODING);
//            response.setHeader("Content-Disposition", "attachment;filename="+fileName);
//            PDFUtils.createPDF("pdfDemo.ftl", data, out);
//        }catch (Exception e){
//            e.printStackTrace();
//            throw new RuntimeException("下载PDF方法异常");
//        }
//    }

    /**
     * 生成数据
     * @return
     */
    private Map<String, Object> buildData(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        List<Map<String, Object>> detailList = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("date", "2020-11-14");
        map1.put("reason", "吃饭");
        map1.put("approver", "李四");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("date", "2020-11-13");
        map2.put("reason", "睡觉");
        map2.put("approver", "李四");
        Map<String, Object> map3 = new HashMap<>();
        map3.put("date", "2020-11-12");
        map3.put("reason", "打豆豆");
        map3.put("approver", "李四");
        Map<String, Object> map4 = new HashMap<>();
        map4.put("date", "2020-11-11");
        map4.put("reason", "工作");
        map4.put("approver", "麻子");
        detailList.add(map1);
        detailList.add(map2);
        detailList.add(map3);
        detailList.add(map4);
        map.put("detailList", detailList);
        return map;
    }
}
