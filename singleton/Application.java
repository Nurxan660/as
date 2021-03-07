package com.Singleton;

public class Application {

    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("INSERT INTO test VALUES('1', 'test')");
    }

}
