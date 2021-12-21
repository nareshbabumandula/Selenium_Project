package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlJdbcTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establish the Connection b/w JavaPgm to MySql
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","root");

        //Create the Statement Object to Pass Sqlquery to db server
        Statement st=con.createStatement();
        int a = st.executeUpdate("drop table Customers");
        System.out.println(a);
        //Process or execute the sql query which is passing to db
        int i=st.executeUpdate("create table Customers(id int,name char(10), address varchar(50))");
        System.out.println(i);
        int j = st.executeUpdate("insert into Customers values(111, 'Naresh', 'Kphb')");
        System.out.println(j);
        int k=st.executeUpdate("update Customers set id=222 where id=111");
        System.out.println(k);
        int l=st.executeUpdate("delete from Customers where id=222");
        System.out.println(l);

        //Close the Connections
        st.close();
        con.close();

    }

}

