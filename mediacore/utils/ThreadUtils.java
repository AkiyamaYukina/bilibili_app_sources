package com.bilibili.mediacore.utils;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Keep;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/ThreadUtils.class */
@Keep
public class ThreadUtils {

    /* JADX INFO: renamed from: com.bilibili.mediacore.utils.ThreadUtils$1Result, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/ThreadUtils$1Result.class */
    @Keep
    public class C1Result {
        public V value;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/ThreadUtils$ThreadChecker.class */
    @Keep
    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/ThreadUtils$a.class */
    public final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Thread f65693a;

        public a(Thread thread) {
            this.f65693a = thread;
        }

        @Override // com.bilibili.mediacore.utils.ThreadUtils.e
        public final void run() throws InterruptedException {
            this.f65693a.join();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/ThreadUtils$b.class */
    public final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f65694a;

        public b(CountDownLatch countDownLatch) {
            this.f65694a = countDownLatch;
        }

        @Override // com.bilibili.mediacore.utils.ThreadUtils.e
        public final void run() throws InterruptedException {
            this.f65694a.await();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/ThreadUtils$c.class */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1Result f65695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callable f65696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CountDownLatch f65697c;

        public c(C1Result c1Result, Callable callable, CountDownLatch countDownLatch) {
            this.f65695a = c1Result;
            this.f65696b = callable;
            this.f65697c = countDownLatch;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [V, java.lang.Object] */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f65695a.value = this.f65696b.call();
                this.f65697c.countDown();
            } catch (Exception e7) {
                RuntimeException runtimeException = new RuntimeException(N4.a.a("Callable threw exception: ", e7));
                runtimeException.setStackTrace(e7.getStackTrace());
                throw runtimeException;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/ThreadUtils$d.class */
    public final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f65698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountDownLatch f65699b;

        public d(Runnable runnable, CountDownLatch countDownLatch) {
            this.f65698a = runnable;
            this.f65699b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f65698a.run();
            this.f65699b.countDown();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/utils/ThreadUtils$e.class */
    public interface e {
        void run() throws InterruptedException;
    }

    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        executeUninterruptibly(new b(countDownLatch));
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j7) {
        boolean z6;
        boolean zAwait;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
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
                    zAwait = false;
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

    public static void executeUninterruptibly(e eVar) {
        boolean z6;
        boolean z7 = false;
        while (true) {
            try {
                z6 = z7;
                eVar.run();
                break;
            } catch (InterruptedException e7) {
                z7 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeUninterruptibly(Handler handler, Callable<V> callable) {
        C1Result c1Result = new C1Result();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new c(c1Result, callable, countDownLatch));
        awaitUninterruptibly(countDownLatch);
        return c1Result.value;
    }

    public static void invokeUninterruptibly(Handler handler, Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new d(runnable, countDownLatch));
        awaitUninterruptibly(countDownLatch);
    }

    public static void joinUninterruptibly(Thread thread) {
        executeUninterruptibly(new a(thread));
    }

    public static boolean joinUninterruptibly(Thread thread, long j7) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = false;
        long jElapsedRealtime2 = j7;
        while (jElapsedRealtime2 > 0) {
            try {
                thread.join(jElapsedRealtime2);
                break;
            } catch (InterruptedException e7) {
                jElapsedRealtime2 = j7 - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }
}
