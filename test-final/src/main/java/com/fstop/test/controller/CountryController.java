package com.fstop.test.controller;

import com.fstop.test.entity.country;
import com.fstop.test.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * @author chen
 */

@Controller
@RequestMapping("/home")
@Slf4j
public class CountryController {

    @Autowired
    CountryService countryS;
    private String message = "Pages";

    //輸入頁
    @GetMapping("/test")
    public String index(Map<String, Object> model) {
        log.info("TEST controller");
        this.message = "首頁";
        model.put("message", this.message);
        return "home";
    }


    //新增資料
    @PostMapping("/add")
    public String addData(@RequestParam Map<String, Object> test, Map<String, Object> model) {
        log.info("Confirm To Add");
        this.message = "新增資料";
        model.put("message", this.message);
        model.put("id", test.get("id"));
        model.put("name", test.get("name"));
        return "add";
    }


    //確認頁面
    @PostMapping("/result")
    public String saveData(@RequestParam Map<String, Object> test, Map<String, Object> model) {
        log.info("USER DATA");
        this.message = "RESULTS";
        country saveCou = new country((String) test.get("id"), (String) test.get("name"));
        countryS.createCountry(saveCou);
        List<country> list = countryS.getCountryList();
        model.put("message", this.message);
        model.put("list", list);
        return "result";
    }


    //修改資料
    @PostMapping("/update/{id}")
    public String updateData(@PathVariable("id") String id, Map<String, Object> model) {
        log.info("Update Data");
        this.message = "修改資料";
        country updateCou = countryS.getCountryById(id);
        model.put("message", this.message);
        model.put("id", updateCou.getId());
        model.put("name", updateCou.getName());
        return "update";
    }


    @PostMapping("/renew")
    public String reData(@RequestParam Map<String, Object> test, Map<String, Object> model) {
        log.info("Renew Data");
        this.message = "所有資料";
        country renewD = new country((String) test.get("id"), (String) test.get("name"));
        countryS.upDateCountry(renewD);
        List<country> list = countryS.getCountryList();
        model.put("message", this.message);
        model.put("list", list);
        return "result";
    }


    //刪除資料
    @PostMapping("/delete/{id}")
    public String deleteData(@PathVariable("id") String id, Map<String, Object> model) {
        log.info("All Datas");
        this.message = "使用者資料";
        countryS.deleteById(id);
        List<country> list = countryS.getCountryList();
        model.put("message", this.message);
        model.put("list", list);
        return "result";
    }


    //查詢全部資料
    @PostMapping("/all")
    public String all(@RequestParam Map<String, Object> test, Map<String, Object> model) {
        log.info("result");
        this.message = "All Datas";
        List<country> list = countryS.getCountryList();
        model.put("message", this.message);
        model.put("list", list);
        return "result";
    }
}

