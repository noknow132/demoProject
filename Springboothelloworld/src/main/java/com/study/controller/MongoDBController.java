//package com.study.controller;
//
//import com.mongodb.BasicDBObject;
//import com.mongodb.DBObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// * @description 测试
// */
//@Controller
//@RequestMapping("/mongo")
//public class MongoDBController {
//    /**
//     * @description MongoDB的数据库操作工具类
//     * @date 2017/11/26
//     * @author Niemingming
//     */
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    /**
//     * @description 插入操作
//     * 我们创建一个mongotest集合并插入name和age两个field
//     * @date 2017/11/26
//     * @author Niemingming
//     */
//    @ResponseBody
//    @RequestMapping("/insert/{name}/{age}/{id}")
//    public String insert(@PathVariable String name,@PathVariable int age,@PathVariable String id){
//        //构建数据对象
//        DBObject data = new BasicDBObject("name",name);
//        data.put("age",age);
//        data.put("_id",id);
//        //改行代码，如果没有集合mongotest，会自动创建一个，然后插入数据,为了方便修改，我们将id设置为前台录入。
//        mongoTemplate.getCollection("mongotest").insert(data);
//        return "success";
//    }
//    /**
//     * @description 修改，根据id修改内容
//     * @date 2017/11/26
//     * @author Niemingming
//     */
//    @ResponseBody
//    @RequestMapping("/update/{id}/{name}/{age}")
//    public String update(@PathVariable String id,@PathVariable String name ,@PathVariable int age){
//        //构建查询条件
//        DBObject query = new BasicDBObject("_id",id);
//        //构建修改对象
//        DBObject data = new BasicDBObject("name",name);
//        data.put("age",age);
//        //这里获取集合执行更新操作，要特别说明的是第三个参数，表示是是否执行upsert操作，如果为true，表示会在更新时
//        //检查是否由记录，如果没有执行插入操作，否则执行更新操作。如果为false，则只做更新操作。
//        mongoTemplate.getCollection("mongotest").update(query,data,true,false);
//        return "success";
//    }
//
//    /**
//     * @description 执行删除操作。
//     * @date 2017/11/26
//     * @author Niemingming
//     */
//    @ResponseBody
//    @RequestMapping("/remove/{id}")
//    public String remove(@PathVariable String id ){
//        DBObject query = new BasicDBObject("_id",id);
//        mongoTemplate.getCollection("mongotest").remove(query);
//        return "success";
//    }
//
//    /**
//     * @description 查询所有记录
//     * @date 2017/11/26
//     * @author Niemingming
//     */
//    @ResponseBody
//    @RequestMapping("/findAll")
//    public String findAll(){
//        //返回所有的查询记录
//        return mongoTemplate.getCollection("mongotest").find().toArray().toString();
//    }
//}
