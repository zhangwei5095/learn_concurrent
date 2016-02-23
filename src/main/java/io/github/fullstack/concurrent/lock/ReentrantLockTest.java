package io.github.fullstack.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Summary: TODO
 * Author : anduo@qq.com
 * Version: 1.0
 * Date   : 16/2/23
 * Time   : 下午3:19
 */
public class ReentrantLockTest implements Runnable {

    ReentrantLock lock = new ReentrantLock();

    public void get() {
        lock.lock();
        System.out.println(Thread.currentThread().getId());
        set();
        lock.unlock();
    }

    public void set() {
        lock.lock();
        System.out.println(Thread.currentThread().getId());
        lock.unlock();
    }

    @Override
    public void run() {
        get();
    }

    public static void main(String[] args) {
        ReentrantLockTest ss = new ReentrantLockTest();
        new Thread(ss).start();
        new Thread(ss).start();
        new Thread(ss).start();
    }

}
