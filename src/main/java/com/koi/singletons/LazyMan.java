package com.koi.singletons;

/**
 * @author koi
 * @date 2022/7/13 11:42
 */
public class LazyMan {
    // 确保代码按照顺序执行
    private volatile static LazyMan lazyMan;

    //
    private static boolean key = false;

    private LazyMan(){
        // 加锁
        synchronized (LazyMan.class){
            if(key==false){
                key = true;
            }else{
                throw new RuntimeException("禁止使用反射创建该对象");
            }
        }
    }

    public static LazyMan getInstance(){
        // 多线程并发保证只有一个对象
        if (lazyMan==null){
            synchronized (LazyMan.class){
                if (lazyMan==null){
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }

}

