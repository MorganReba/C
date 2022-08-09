package com.gec.it.dao;

import com.gec.it.bean.TypeBean;
import com.gec.it.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:
 * Date: 2022-07-06
 * Time: 9:24
 */
public class TypeDao {
    public ArrayList<TypeBean> get_ListInfo() {

        ArrayList<TypeBean> tag_Array = new ArrayList<TypeBean>();
        Connection conn = DBUtil.getConnectDb();
        String sql="select * from booktype";//查询booktype整张表
        PreparedStatement stm = null;
        ResultSet rs = null;

        try{
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while(rs.next()) {
                TypeBean tag = new TypeBean();
                tag.setTid(rs.getInt("tid"));
                tag.setName(rs.getString("name"));

                tag_Array.add(tag);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            DBUtil.CloseDb(rs,stm,conn);
        }
        return tag_Array;
    }

    public void addBookType(String name) {
        Connection conn = DBUtil.getConnectDb();
        String sql = "insert into booktype(name) values(?)";
        int rs = 0;
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1, name);

            rs = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateTypeBook(int tid, String name) {
        Connection conn = DBUtil.getConnectDb();
        String sql = "update booktype set name=? where tid=?";
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sql);

            stm.setString(1, name);
            stm.setInt(2, tid);

            stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBookType(int tid) {
        Connection conn = DBUtil.getConnectDb();
        String sql = "delete from booktype where tid=?";

        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sql);
            stm.setInt(1,tid);
            stm.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
