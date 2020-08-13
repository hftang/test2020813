package com.example.demo.test;

import com.example.demo.bean.TestObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {

    public static void main(String[] args) {
        List<TestObject> list = Arrays.asList(
                new TestObject("Ron", "M", 10, "ron.zheng@tfschange.com", false),
                new TestObject("KDS", "W", 10, "kds@qq.com", false),
                new TestObject("BoDuo", "W", 30, "boduo@163.com", false),
                new TestObject("CangJin", "W", 10, "cangjin@gmail.com", false),
                new TestObject("XiaoZe", "W", 30, "xiaoze@hotmail.com", true),
                new TestObject("James", "M", 10, "leblonjames@hotmail.com", true),
                new TestObject("Allen", "M", 50, "allen.lei@tfschange.com", true),
                new TestObject("Smith", "M", 60, "jr.smith@cel.com", true),
                new TestObject("Wade", "M", 20, "dw.wade@cel.com", true),
                new TestObject("Wade", "M", 20, "dw.wade@cel.com", false)
        );

        //去除年纪相同的
        list.stream()
                .filter(i -> i.getAge() % 3 == 0 &&i.getSex().equalsIgnoreCase("m"))
                .collect(Collectors.toList()).forEach(ite -> System.out.println(ite));


        //选择isMng为true的
//        list.stream().filter(TestObject::isMng).forEach(e-> System.out.println(e));


    }
}
