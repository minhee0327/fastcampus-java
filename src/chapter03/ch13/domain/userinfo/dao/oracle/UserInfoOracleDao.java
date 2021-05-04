package chapter03.ch13.domain.userinfo.dao.oracle;

import chapter03.ch13.domain.userinfo.dao.UserInfoDao;
import chapter03.ch13.domain.userinfo.UserInfo;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());

    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update set Oracle DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB userID = " + userInfo.getUserId());
    }
}
