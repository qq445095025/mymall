package com.example.mymalltest.controller;


import com.example.mymalltest.entity.PmsBrand;
import com.example.mymalltest.service.IPmsBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 品牌表; InnoDB free: 15360 kB 前端控制器
 * </p>
 *
 * @author pipidan
 * @since 2021-07-12
 */
@RestController
@RequestMapping("/pms-brand")
public class PmsBrandController {

    @Autowired
    private IPmsBrandService iPmsBrandService;


    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getBrandList() {

        return ResponseEntity.ok(iPmsBrandService.list());
    }


}

