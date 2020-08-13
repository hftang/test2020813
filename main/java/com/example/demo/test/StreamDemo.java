package com.example.demo.test;

import com.example.demo.bean.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

//        List<String> strings = Arrays.asList("Aaaaa", "bbbbb", "qqqqq","ccc");
//        strings.stream().map(String::toUpperCase).forEach(item-> System.out.println(item));
//
//        Stream<String> stringStream = strings.stream().flatMap(l -> {
//            String[] split = l.split("");
//            return Arrays.stream(split);
//        });
//        stringStream.forEach(System.out::println);

//        strings.stream().sorted().forEach(i-> System.out.println(i));

//        List<Integer> list = Arrays.asList(2, 4, 3, 6, 7, 9);
////        list.stream().sorted(Integer::compareTo).forEach(i-> System.out.println(i));
//
//        Integer reduce = list.stream().reduce(0, (x, y) -> x + y);
//        System.out.println(reduce);


        List<User> list = Arrays.asList(
                new User("张三",12,1000.00),
                new User ("李四",32,4000.00),
                new User ("王五",40,5000.00),
                new User ("王五",40,3000.00));

        //分组
//        Map<Double, List<User>> collect = list.stream().collect(Collectors.groupingBy(User::getSalary));
//        System.out.println(collect);

//        Optional<User> collect = list.stream().collect(Collectors.minBy(Comparator.comparing(User::getSalary)));
//        User user = collect.get();
//        System.out.println(user);
//
//        Optional<User> optional = list.stream().collect(Collectors.maxBy(Comparator.comparing(User::getSalary)));
//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }

//        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(User::getSalary));
//        System.out.println(collect);

        //获取他们的平均工资
//        Double aDouble = list.stream().collect(Collectors.averagingDouble(User::getSalary));
//        System.out.println(aDouble);


        //获取个数
//        Long collect = list.stream().map(User::getName).collect(Collectors.counting());
//        System.out.println(collect);


//        HashSet<String> hashset = list.stream().map(User::getName).collect(Collectors.toCollection(HashSet::new));
//        hashset.forEach(i-> System.out.println(i));




//
//        List<String> collect = list.stream().map(User::getName).collect(Collectors.toList());
//        collect.forEach(i-> System.out.println(i));

//        Set<String> collect = list.stream().map(User::getName).collect(Collectors.toSet());
//        collect.forEach(i-> System.out.println(i));


    }
}
