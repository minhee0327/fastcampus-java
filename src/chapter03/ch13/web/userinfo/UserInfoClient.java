package chapter03.ch13.web.userinfo;

import chapter03.ch13.domain.userinfo.UserInfo;
import chapter03.ch13.domain.userinfo.dao.UserInfoDao;
import chapter03.ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import chapter03.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/minhee/IdeaProjects/fastcampus/src/chapter03/ch13/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("TYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setUserName("홍길동");
        userInfo.setPassword("0000");
        UserInfoDao userInfoDao;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMysqlDao();
        }else{
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
