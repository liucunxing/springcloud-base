package com.base.controller;

import com.base.mapper.paymentMapper;
import com.common.ResponseResult;
import com.pojos.Payment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/payment")
@Api(value = "payment",tags = "payment")
public class paymentController {
    @Autowired
    private paymentMapper mapper;

    @GetMapping("/getList")
    @ApiOperation("payment测试")
    public ResponseResult<List<Payment>> getList(){
        return ResponseResult.success("payment列表",mapper.selectList(null));
    }

}