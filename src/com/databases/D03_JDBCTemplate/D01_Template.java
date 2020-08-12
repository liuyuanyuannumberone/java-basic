package com.databases.D03_JDBCTemplate;

import com.databases.D03_JDBCTemplate.utils.DataSourceUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class D01_Template {
  public static void main(String[] args) throws SQLException {
    //DataSource ds = DataSourceUtils.getDataSource();
    //Connection con = ds.getConnection();
    //con.close();
    JdbcTemplate jt = new JdbcTemplate(DataSourceUtils.getDataSource());
    int row = jt.update("insert into student values (null,?,?)", "范冰冰", 18);//影响的行数


  }
}
