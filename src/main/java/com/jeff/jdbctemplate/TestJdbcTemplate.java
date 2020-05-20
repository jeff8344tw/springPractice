package com.jeff.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestJdbcTemplate {

    ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc.xml");
    JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);

    @Test
    public void test() {
        String sql = "insert into emp values(null, ?, ?, ?)";
        jdbcTemplate.update(sql, "jeff1", 24, "male");
    }

    @Test
    public void testBatchUpdate() {
        String sql = "insert into emp values(null, ?, ?, ?)";
        List<Object[]> list = new ArrayList();
        list.add(new Object[]{"a1", 1, "male"});
        list.add(new Object[]{"a2", 2, "male"});
        list.add(new Object[]{"a3", 3, "male"});
        jdbcTemplate.batchUpdate(sql, list);
    }

    @Test
    public void testQueryForObject() {
//        String sql = "select eid,ename,age,sex from emp where eid = ?";
//        RowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
//        Emp emp = jdbcTemplate.queryForObject(sql, new Object[]{1}, rowMapper); // 將列名(字段名或字段名的別名)與屬性名進行映射
//        System.out.println(emp);
        String sql = "select count(*) from emp";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("count = " + count);

    }

    @Test
    public void testQuery() {
        String sql = "select eid,ename,age,sex from emp";
        RowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
        List<Emp> empList = jdbcTemplate.query(sql, rowMapper);
        for (Emp emp : empList) {
            System.out.println(emp);
        }

    }

}
