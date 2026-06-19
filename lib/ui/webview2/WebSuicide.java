package com.bilibili.lib.ui.webview2;

import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bilibili.commons.StringUtils;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.droid.thread.HandlerThreads;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/WebSuicide.class */
public class WebSuicide {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f64978a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<String> f64979b = Collections.emptyList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/WebSuicide$a.class */
    public final class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            BLog.dfmt("WebSuicide", "suicide.. pid=%d", new Object[]{Integer.valueOf(Process.myPid())});
            Process.killProcess(Process.myPid());
        }
    }

    public static void dump() {
        StringBuilder sb = new StringBuilder("counter = " + f64978a.get());
        sb.append(", entries record = [ ");
        Iterator<String> it = f64979b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        sb.append(" ]");
        BLog.i("WebSuicide", "WebSuicide : " + ((Object) sb));
    }

    public static void enter(@NonNull String str) {
        BLog.d("WebSuicide", "Web activity start, entry = " + str);
        if ((StringUtils.indexOf(ProcessUtils.myProcName(), 58) < 0 ? Boolean.TRUE : Boolean.FALSE).booleanValue()) {
            BLog.e("WebSuicide", "WebSuicide can not be applied within main process.");
            return;
        }
        HandlerThreads.getHandler(2).removeCallbacksAndMessages("suicide");
        if (f64979b.equals(Collections.emptyList())) {
            synchronized (WebSuicide.class) {
                try {
                    f64979b = new LinkedList();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f64978a.incrementAndGet();
        f64979b.add("Entries << " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.lang.Runnable] */
    public static void leave(@NonNull String str) {
        BLog.d("WebSuicide", "Web activity finished, entry = " + str);
        if ((StringUtils.indexOf(ProcessUtils.myProcName(), 58) < 0 ? Boolean.TRUE : Boolean.FALSE).booleanValue()) {
            BLog.e("WebSuicide", "WebSuicide can not be applied within main process.");
            return;
        }
        if (f64979b.equals(Collections.emptyList())) {
            synchronized (WebSuicide.class) {
                try {
                    f64979b = new LinkedList();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f64979b.add("Entries >> " + str);
        if (f64978a.decrementAndGet() <= 0) {
            BLog.i("WebSuicide", "process will suicide after 60 seconds...");
            HandlerThreads.getHandler(2).postAtTime(new Object(), "suicide", SystemClock.uptimeMillis() + 1800000);
        }
    }
}
