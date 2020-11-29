package service;


import com.Dao.UserDao;
import domain.User;


public class UserService {


    private UserDao userDao = new UserDao();
    public boolean hasMatchUser(String userName, String password){
        int matchCount = userDao.getMatchCount(userName,password);
        return matchCount > 0;
    }
    public User login(String userName,String password) {
        return userDao.loginuser(userName,password);
    }

    public boolean register(String username,String password) {
        if(userDao.getNameCount(username) == 0){
            User user = new User();
            user.setUserName(username);
            user.setPassWord(password);
            user.setUserLevel(1);

            userDao.insertUser(user);
            return true;
        }else{
            return false;
        }

    }

    public boolean Atc(String key,String userName){
        return userDao.atc(key,userName);
    }

    public User getUser(String userName){
        return userDao.getUser(userName);
    }
}
