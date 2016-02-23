package io.github.fullstack.concurrent.intro;

import net.jcip.annotations.NotThreadSafe;

/**
 * Summary: 线程不安全的序列号生成器
 * Author : anduo@qq.com
 * Version: 1.0
 * Date   : 16/2/23
 * Time   : 下午3:27
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value;

    /**
     * Returns a unique value.
     */
    public int getNext() {
        return value++;
    }
}
