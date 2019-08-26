package com.example.pdfdemo;

/**
 * @author fanminfeng
 * @version 1.0
 * _                 __      __   _ _
 * | |                \ \    / /  | | |
 * | | ___  ___ ___  __\ \  / /__ | | | ____ _
 * _   | |/ _ \/ __/ __|/ _ \ \/ / _ \| | |/ / _` |
 * | |__| |  __/\__ \__ \  __/\  / (_) | |   < (_| |
 * \____/ \___||___/___/\___| \/ \___/|_|_|\_\__,_|
 * @date 2019/8/23 上午10:21
 */

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
