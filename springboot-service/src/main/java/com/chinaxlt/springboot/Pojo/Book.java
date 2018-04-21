package com.chinaxlt.springboot.Pojo;

import java.io.Serializable;

public class Book implements Serializable {
    // 图书ID
    private Integer id;
    // 图书名
    private String name;
    // 图书简介
    private String summary;
    // 图书库存
    private Integer stock;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
