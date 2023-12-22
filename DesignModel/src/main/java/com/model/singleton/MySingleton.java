package com.model.singleton;

public class MySingleton {
    //double-check
    private volatile static MySingleton uniqueInstance;

    private MySingleton() {
    }

    public static synchronized MySingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (MySingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new MySingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
