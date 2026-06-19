package com.bilibili.pvtracker;

import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.lib.pageview.api.PageViews;
import com.bilibili.pvtracker.PageViewTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pvtracker/a.class */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f85855d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, C0573a> f85856a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0573a f85858c;

    /* JADX INFO: renamed from: com.bilibili.pvtracker.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pvtracker/a$a.class */
    public static final class C0573a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bundle f85860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f85862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f85863e = String.format("%08X", Integer.valueOf(UUID.randomUUID().toString().hashCode()));

        public C0573a(String str, String str2, int i7, Bundle bundle) {
            this.f85859a = str;
            this.f85860b = bundle;
            this.f85861c = i7;
            this.f85862d = str2;
        }

        public final Map<String, String> a() {
            HashMap map = new HashMap();
            Bundle bundle = this.f85860b;
            if (bundle == null) {
                return map;
            }
            for (String str : bundle.keySet()) {
                if (this.f85860b.get(str) != null) {
                    map.put(str, String.valueOf(this.f85860b.get(str)));
                }
            }
            return map;
        }
    }

    public static void a(C0573a c0573a) {
        if (c0573a == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("end report: eventId: ");
        String str = c0573a.f85859a;
        sb.append(str);
        sb.append(" loadType: ");
        int i7 = c0573a.f85861c;
        sb.append(i7);
        sb.append(" extra: ");
        sb.append(c0573a.a().toString());
        sb.append(" polarisActionId: ");
        sb.append(c0573a.f85863e);
        BLog.d("PageViewTracker", sb.toString());
        PageViews.end(str, i7, c0573a.f85862d, c0573a.a());
        PageViewTracker.getInstance().c("");
    }

    public static void b(C0573a c0573a) {
        StringBuilder sb = new StringBuilder("start report: eventId: ");
        String str = c0573a.f85859a;
        sb.append(str);
        sb.append(" loadType: ");
        int i7 = c0573a.f85861c;
        sb.append(i7);
        sb.append(" extra: ");
        sb.append(c0573a.a().toString());
        BLog.d("PageViewTracker", sb.toString());
        PageViewTracker pageViewTracker = PageViewTracker.getInstance();
        String eventIdFrom = PageViews.getEventIdFrom();
        pageViewTracker.getClass();
        BLog.d("PageViewTracker", "on receive event_id_from: " + eventIdFrom);
        for (PageViewTracker.OnReceiveEventIdFromListener onReceiveEventIdFromListener : (CopyOnWriteArrayList) pageViewTracker.f85851d) {
            if (onReceiveEventIdFromListener != null) {
                onReceiveEventIdFromListener.onReceive(eventIdFrom);
            }
        }
        PageViews.start(str, i7, c0573a.f85862d, c0573a.f85863e, c0573a.a());
        PageViewTracker.getInstance().c(str);
    }

    public static a c() {
        if (f85855d == null) {
            synchronized (a.class) {
                try {
                    if (f85855d == null) {
                        f85855d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f85855d;
    }

    public final void d(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str) || bundle == null || !this.f85856a.containsKey(str)) {
            return;
        }
        ((C0573a) ((LinkedHashMap) this.f85856a).get(str)).f85860b = bundle;
    }

    public final void e(Bundle bundle, String str) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str) || !this.f85856a.containsKey(str)) {
            return;
        }
        C0573a c0573a = (C0573a) ((LinkedHashMap) this.f85856a).get(str);
        if (c0573a != null && (bundle2 = c0573a.f85860b) != null && bundle != null) {
            bundle2.putAll(bundle);
        }
        a(c0573a);
        this.f85858c = this.f85856a.remove(str);
    }

    public final void f() {
        if (this.f85856a.isEmpty()) {
            return;
        }
        Iterator it = ((LinkedHashMap) this.f85856a).keySet().iterator();
        while (it.hasNext()) {
            C0573a c0573a = (C0573a) ((LinkedHashMap) this.f85856a).get((String) it.next());
            if (c0573a != null) {
                a(c0573a);
            }
        }
        ((LinkedHashMap) this.f85856a).clear();
    }

    public final void g(String str, String str2, int i7, Bundle bundle) {
        if (this.f85856a.containsKey(str)) {
            return;
        }
        this.f85857b = str;
        C0573a c0573a = new C0573a(str2, str, i7, bundle);
        this.f85856a.put(str, c0573a);
        b(c0573a);
    }

    public final void h(String str, String str2, Bundle bundle, int i7, boolean z6) {
        if (this.f85856a.containsKey(str)) {
            return;
        }
        if (z6) {
            f();
        }
        this.f85857b = str;
        C0573a c0573a = new C0573a(str2, str, i7, bundle);
        this.f85856a.put(str, c0573a);
        b(c0573a);
    }
}
