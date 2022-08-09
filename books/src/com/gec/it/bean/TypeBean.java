package com.gec.it.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MZJ
 * Date: 2022-07-03
 * Time: 17:18
 */
public class TypeBean {
    private int tid;//分类的id
    private String name;//分类的名称

    public TypeBean(int tid, String name) {
        this.tid = tid;
        this.name = name;
    }

    public TypeBean() {
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TypeBean{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                '}';
    }
}
