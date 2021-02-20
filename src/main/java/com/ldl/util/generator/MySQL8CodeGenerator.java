package com.ldl.util.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.ldl.util.generator.util.CommonUtils;


/**
 * MySQL 数据库代码生成类
 * @author Erwin Feng
 * @since 2019-04-17 10:33
 */
public class MySQL8CodeGenerator {

    public static void main(String[] args) {
        DbType dbType = DbType.MYSQL;
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/saomaji?serverTimezone=UTC";
        String username = "root";
        String password = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        // 表前缀，生成的实体类，不含前缀
        String [] tablePrefixes = {};
        // 表名，为空，生成所有的表
        String [] tableNames = {"test"};
        // 字段前缀
        String [] fieldPrefixes = {};
        // 基础包名
        String packageName = "com.ldl";
        CommonUtils.execute(dbType, dbUrl, username, password, driver, tablePrefixes, tableNames, packageName, fieldPrefixes);
    }

}
