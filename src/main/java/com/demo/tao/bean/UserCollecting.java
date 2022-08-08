package com.demo.tao.bean;

import java.io.Serializable;

public class UserCollecting implements Serializable
{

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    // 用户Id
    int                       userId;

    // 用户姓名
    String                    userName;

    // 用户工资
    Double                    salary;

    
    
    public UserCollecting(int userId, String userName, Double salary)
    {
        super();
        this.userId = userId;
        this.userName = userName;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "UserCollecting [userId=" + userId + ", userName=" + userName + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        result = prime * result + userId;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserCollecting other = (UserCollecting) obj;
        if (salary == null)
        {
            if (other.salary != null)
                return false;
        }
        else if (!salary.equals(other.salary))
            return false;
        if (userId != other.userId)
            return false;
        if (userName == null)
        {
            if (other.userName != null)
                return false;
        }
        else if (!userName.equals(other.userName))
            return false;
        return true;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public Double getSalary()
    {
        return salary;
    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

}
