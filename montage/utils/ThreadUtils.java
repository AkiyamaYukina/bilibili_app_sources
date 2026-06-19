package com.bilibili.montage.utils;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/utils/ThreadUtils.class */
public class ThreadUtils {
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j7) throws InterruptedException {
        boolean z6;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zAwait = false;
        long jElapsedRealtime2 = j7;
        boolean z7 = false;
        while (true) {
            try {
                z6 = z7;
                zAwait = countDownLatch.await(jElapsedRealtime2, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException e7) {
                jElapsedRealtime2 = j7 - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (jElapsedRealtime2 <= 0) {
                    z6 = true;
                    break;
                }
                z7 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return zAwait;
    }

    public static boolean runInWaitLimitTime(Runnable runnable, long j7) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable(runnable, countDownLatch) { // from class: com.bilibili.montage.utils.ThreadUtils.1
            final CountDownLatch val$countDownLatch;
            final Runnable val$runnable;

            {
                this.val$runnable = runnable;
                this.val$countDownLatch = countDownLatch;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.val$runnable.run();
                this.val$countDownLatch.countDown();
            }
        }).start();
        return awaitUninterruptibly(countDownLatch, j7);
    }
}
