package com.fstop.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fstop.test.dao.countryDao;
import com.fstop.test.entity.country;


@Service
public class CountryService {

    @Autowired
    private countryDao countryDao;

//    //查詢全部
//    public List<country> getUserList() {
//        List<country> alldata = countryDao.findAll();
//        return alldata;
//    }
//
//    //根據ID查詢
//    public country getDataById(int id) {
//        Optional<country> stu = countryDao.findById((long) id);
//        return stu.get();
//    }
//
//    //新增
//    public country createData(CreateRequest request) {
//        country stu = new country();
//        stu.setName(request.getName());
//        stu.setId(request.getId());
//        countryDao.save(stu);
//        return stu;
//    }
//
//    //根據ID刪除
//    public String deleteById(long id) {
//        countryDao.deleteById(id);
//        return "ok";
//    }
//
//    //根據ID更改
//    public String updateData(int id, country country) {
//        countryDao.save(country);
//        return "ok";
//    }


    //得到全部資料
    public List<country> getCountryList() {
        return countryDao.findAll();
    }

    //根據ID
    public country getCountryById(String id) {
        return countryDao.getById(id);
    }

    //新增資料
    public country createCountry(country country) {
        return countryDao.save(country);
    }

    //修改資料
    public String upDateCountry(country country) {
        countryDao.save(country);
        return "ok";
    }

    //刪除資料
    public String deleteById(String id) {
        countryDao.deleteById(id);
        return "ok";
    }

}
