package com.databases.D02_SQL;

import com.databases.D01_JDBC.MysqlUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class D01_SqlInject {
  public static void main(String[] args) throws SQLException {
    //sqlע��:���û��������а���һЩSQL�ķ��ţ�������ǲ����жϾ�ֱ�ӷ�װ��sql����У��Ӷ���ı���������sql
    //�ĺ��壬��������ͽ���SQLע��.
    /*
    Connection con = MysqlUtils.getConnection();
    Statement stm = con.createStatement();
    stm.close();
    con.close();
    */

    //����취��ps�ڲ�ת�������sqlע������,w��ȫ����Statement
    String name = "lyy";
    String passwd = "passok";
    Connection con = MysqlUtils.getConnection();
    String sql = "select * from  user where userName=?and userPwd=?";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, name);
    ps.setString(2, passwd);
    ps.executeQuery();

    ps.close();
    con.close();

  }
}
