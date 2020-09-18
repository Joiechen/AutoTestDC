package com.vcautotest.datacenter.controller;

import com.devskiller.jfairy.Fairy;
import com.vcautotest.datacenter.utils.StringUtils;
import io.swagger.annotations.ApiOperation;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/faker")
public class FakerController {

    DataFactory df = new DataFactory();
    Fairy fairy = Fairy.create();

    @ApiOperation(value = "获取用户名",notes = "获取用户名类型数据")
    @RequestMapping(value = "/getUsername",method = RequestMethod.GET)
    public String getUsername(@RequestParam(value = "length",required = false) Integer length) {
        if(length != null) {
            return df.getRandomChars(length);
        } else {
            return df.getFirstName();
        }

    }


    @ApiOperation(value = "获取邮箱",notes = "获取邮箱类型数据")
    @RequestMapping(value = "/getEmail",method = RequestMethod.GET)
    public String getEmail(@RequestParam(value = "length",required = false) Integer length) {
        String email = "";
        if(length != null) {
            email = df.getRandomChars(length) + "@autotest.com";
            return email;
        } else {
            return df.getEmailAddress();
        }
    }


    @ApiOperation(value = "获取URL",notes = "获取URL数据类型")
    @RequestMapping(value = "/getUrl",method = RequestMethod.GET)
    public String getUrl(@RequestParam(value = "isHttps") Boolean isHttps) {
            return fairy.networkProducer().url(isHttps);
    }


    @ApiOperation(value = "获取字符串",notes = "获取普通字符串类型")
    @RequestMapping(value = "/getRandomChars",method = RequestMethod.GET)
    public String getRandomChars(@RequestParam(value = "length",required = false) Integer length) {
        if(length != null) {
            return df.getRandomChars(length);
        } else {
            return fairy.textProducer().text();
        }
    }


    @ApiOperation(value = "获取布尔",notes = "获取布尔类型数据")
    @RequestMapping(value = "/getBoolean",method = RequestMethod.GET)
    public Boolean getBoolean() {
        return fairy.baseProducer().trueOrFalse();
    }


    @ApiOperation(value = "获取数组",notes = "获取一维数组类型数据")
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public List<String> getList(@RequestParam(value = "length",required = false) Integer length) {
        List<String> templist;
        if(length != null) {
            templist = new ArrayList<String>(Arrays.asList(df.getRandomChars(length), df.getRandomChars(length+1), df.getRandomChars(length+2)));
            return fairy.baseProducer().randomElements(templist, length);
        } else{
            templist = new ArrayList<String>(Arrays.asList(df.getRandomChars(3),df.getRandomChars(4)));
            return fairy.baseProducer().randomElements(templist, fairy.baseProducer().randomInt(4)+1);
        }
    }


    @ApiOperation(value = "获取正整数",notes = "获取正整数类型数据")
    @RequestMapping(value = "/getPositiveInt",method = RequestMethod.GET)
    public Integer getPositiveInt(@RequestParam(value = "min",required = false) Integer min,@RequestParam(value = "max",required = false) Integer max) {
        if(max !=null && min == null){
            return  df.getNumberUpTo(max);
        }else if(min !=null && max !=null){
            return df.getNumberBetween(min,max);
        }else{
            return df.getNumber();
        }
    }


    @ApiOperation(value = "获取负数",notes = "获取负数类型数据")
    @RequestMapping(value = "/getNegativeInt",method = RequestMethod.GET)
    public int getNegativeInt() {
        int nInt = df.getNumberUpTo(10000);
        return (nInt > 0) ? -nInt : nInt;
    }


    @ApiOperation(value = "获取时间戳",notes = "获取秒级或者毫秒级时间戳数据类型")
    @RequestMapping(value = "/getTimestamp",method = RequestMethod.GET)
    public long getTimestamp(@RequestParam(value = "scale") String scale) {
        if(scale.equalsIgnoreCase("ms")){
            return System.currentTimeMillis();
        }else{
            return Instant.now().getEpochSecond();
        }
    }


    @ApiOperation(value = "获取密码",notes = "获取指定长度的密码串")
    @RequestMapping(value = "/getPwd",method = RequestMethod.GET)
    public String getTimestamp(@RequestParam(value = "length") Integer length) {
        return StringUtils.RandomString(length);
    }


    @ApiOperation(value = "获取16进制字符",notes = "获取16进制字符数据类型")
    @RequestMapping(value = "/getHexString",method = RequestMethod.GET)
    public String getHexString(@RequestParam(value = "length",required = false) Integer length,@RequestParam(value = "prefix") Boolean prefix) {
        if(length != null){
            if(prefix.booleanValue()==Boolean.TRUE) {
                return "0x" + StringUtils.RandomHexString(length);
            } else{
                return StringUtils.RandomHexString(length);
            }
        } else {
            if(prefix.booleanValue()==Boolean.TRUE) {
                return "0x" + StringUtils.RandomHexString(8);
            } else{
                return StringUtils.RandomHexString(8);
            }
        }

    }


    @ApiOperation(value = "获取SHA256加密结果",notes = "获取指定字符串的SHA256加密数据结果")
    @RequestMapping(value = "/getSHA256",method = RequestMethod.GET)
    public String getSha256(@RequestParam(value = "input") String input) {
        return StringUtils.GetSHA256Str(input);
    }



}
