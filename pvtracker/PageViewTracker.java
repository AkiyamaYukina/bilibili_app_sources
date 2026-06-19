package com.bilibili.pvtracker;

import Bs0.c;
import Bs0.d;
import G.p;
import Xi1.b;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C3246j;
import androidx.constraintlayout.widget.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.lib.pageview.api.IPVInterceptor;
import com.bilibili.lib.pageview.api.PageViews;
import com.bilibili.lib.pageview.model.PageViewsEvent;
import com.bilibili.pvtracker.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pvtracker/PageViewTracker.class */
public class PageViewTracker {

    @Nullable
    public static volatile PageViewTracker h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bs0.a f85848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a.C0573a f85849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<OnSwitchToBackgroundListener> f85850c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<OnReceiveEventIdFromListener> f85851d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<OnReceiveCurrentEventIdListener> f85852e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f85853f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PageViewsEvent f85854g = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pvtracker/PageViewTracker$OnReceiveCurrentEventIdListener.class */
    public interface OnReceiveCurrentEventIdListener {
        void onGetCurrentId(@Nullable String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pvtracker/PageViewTracker$OnReceiveEventIdFromListener.class */
    public interface OnReceiveEventIdFromListener {
        void onReceive(String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pvtracker/PageViewTracker$OnSwitchToBackgroundListener.class */
    public interface OnSwitchToBackgroundListener {
        void switchToBackground();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Bs0.a, java.lang.Object] */
    public PageViewTracker() {
        ?? obj = new Object();
        obj.f887b = new HashMap();
        obj.f886a = new d();
        this.f85848a = obj;
    }

    public static Bundle a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.Object r3, java.lang.String r4) {
        /*
            r0 = r3
            if (r0 != 0) goto L6
            r0 = r4
            return r0
        L6:
            r0 = r3
            boolean r0 = r0 instanceof com.bilibili.pvtracker.IPvTracker
            if (r0 == 0) goto L25
            r0 = r3
            com.bilibili.pvtracker.IPvTracker r0 = (com.bilibili.pvtracker.IPvTracker) r0
            r5 = r0
            r0 = r5
            java.lang.String r0 = r0.getUniqueKey()
            if (r0 == 0) goto L25
            r0 = r5
            java.lang.String r0 = r0.getUniqueKey()
            r3 = r0
            goto L2d
        L25:
            r0 = r3
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3 = r0
        L2d:
            r0 = r4
            r1 = r3
            java.lang.String r0 = G.p.a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pvtracker.PageViewTracker.b(java.lang.Object, java.lang.String):java.lang.String");
    }

    public static void end(@NonNull IPvTracker iPvTracker) {
        end(iPvTracker, null);
    }

    public static void end(@NonNull IPvTracker iPvTracker, Map<String, String> map) {
        if (iPvTracker == null || TextUtils.isEmpty(iPvTracker.getPvEventId())) {
            return;
        }
        a.c().e(a(map), b(iPvTracker, iPvTracker.getPvEventId()));
    }

    public static void end(@NonNull String str, int i7, String str2, Map<String, String> map) {
        if (map == null) {
            PageViews.end(str, i7, str2, new HashMap());
        } else {
            PageViews.end(str, i7, str2, map);
        }
        b.a(e.a(i7, "end report: eventId:", str, " loadType: ", " extra："), map == null ? "" : map.toString(), "PageViewTracker");
    }

    public static void endInH5(@NonNull String str, int i7, long j7, Map<String, String> map) {
        if (map == null) {
            PageViews.endInH5(str, i7, j7);
        } else {
            PageViews.endInH5(str, i7, j7, map);
        }
        b.a(e.a(i7, "end h5: eventId:", str, " loadType: ", " extra: "), map == null ? "" : map.toString(), "PageViewTracker");
    }

    public static PageViewTracker getInstance() {
        if (h == null) {
            synchronized (PageViewTracker.class) {
                try {
                    if (h == null) {
                        h = new PageViewTracker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public static void start(@NonNull IPvTracker iPvTracker, Map<String, String> map) {
        if (iPvTracker == null || TextUtils.isEmpty(iPvTracker.getPvEventId())) {
            return;
        }
        String strB = b(iPvTracker, iPvTracker.getPvEventId());
        a aVarC = a.c();
        aVarC.getClass();
        int i7 = 0;
        if (!TextUtils.isEmpty(strB)) {
            if (aVarC.f85856a.containsKey(strB)) {
                a.C0573a c0573a = (a.C0573a) ((LinkedHashMap) aVarC.f85856a).get(strB);
                i7 = 0;
                if (c0573a != null) {
                    i7 = c0573a.f85861c;
                }
            } else {
                i7 = 0;
            }
        }
        a.c().g(strB, iPvTracker.getPvEventId(), i7, a(map));
    }

    public static void start(@NonNull String str, int i7, String str2, Map<String, String> map) {
        if (map == null) {
            PageViews.start(str, i7, str2, (String) null, new HashMap());
        } else {
            PageViews.start(str, i7, str2, (String) null, map);
        }
        b.a(e.a(i7, "start report: eventId:", str, " loadType: ", " extra："), map == null ? "" : map.toString(), "PageViewTracker");
    }

    public static void startInH5(@NonNull String str, int i7, long j7, Map<String, String> map) {
        if (map == null) {
            PageViews.startInH5(str, i7, j7);
        } else {
            PageViews.startInH5(str, i7, j7, map);
        }
        b.a(e.a(i7, "start h5 report: eventId:", str, " loadType: ", " extra: "), map == null ? "" : map.toString(), "PageViewTracker");
    }

    public final void c(@Nullable String str) {
        C3246j.b("on receive current event_id: ", str, "PageViewTracker");
        this.f85853f = str;
        for (OnReceiveCurrentEventIdListener onReceiveCurrentEventIdListener : (CopyOnWriteArrayList) this.f85852e) {
            if (onReceiveCurrentEventIdListener != null) {
                onReceiveCurrentEventIdListener.onGetCurrentId(str);
            }
        }
    }

    @Nullable
    public String currentPolarisActionId() {
        String str;
        a aVarC = a.c();
        if (TextUtils.isEmpty(aVarC.f85857b)) {
            str = null;
        } else {
            a.C0573a c0573a = (a.C0573a) ((LinkedHashMap) aVarC.f85856a).get(aVarC.f85857b);
            a.C0573a c0573a2 = c0573a;
            if (c0573a == null) {
                a.C0573a c0573a3 = aVarC.f85858c;
                c0573a2 = c0573a;
                if (c0573a3 != null) {
                    c0573a2 = c0573a;
                    if (c0573a3.f85862d.equals(aVarC.f85857b)) {
                        c0573a2 = aVarC.f85858c;
                    }
                }
            }
            str = c0573a2 == null ? null : c0573a2.f85863e;
        }
        return str;
    }

    public String getCurrentPageViewId() {
        return this.f85853f;
    }

    public PageViewsEvent getLastEndPv() {
        return this.f85854g;
    }

    public void init(Application application, IPVInterceptor iPVInterceptor) {
        application.registerActivityLifecycleCallbacks(this.f85848a);
        PageViews.init(iPVInterceptor);
    }

    public boolean isInterceptFragmentReport() {
        d dVar;
        Bs0.a aVar = this.f85848a;
        if (aVar == null || (dVar = aVar.f886a) == null) {
            return false;
        }
        return dVar.f896c;
    }

    public void observeCurPageChange(ViewPager viewPager, boolean z6) {
        d dVar = this.f85848a.f886a;
        if (dVar == null || viewPager == null) {
            return;
        }
        dVar.d(d.b(viewPager.getAdapter(), viewPager.getCurrentItem()), z6, true);
    }

    public void observeCurPageChange(ViewPager2 viewPager2, FragmentManager fragmentManager, boolean z6) {
        Fragment fragmentFindFragmentByTag;
        d dVar = this.f85848a.f886a;
        if (dVar == null || viewPager2 == null) {
            return;
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        int currentItem = viewPager2.getCurrentItem();
        if (adapter instanceof FragmentStateAdapter) {
            fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("f" + adapter.getItemId(currentItem));
        } else {
            fragmentFindFragmentByTag = null;
        }
        dVar.d(fragmentFindFragmentByTag, z6, true);
    }

    public void observePageChange(ViewPager viewPager) {
        d dVar = this.f85848a.f886a;
        if (dVar == null || viewPager == null) {
            return;
        }
        dVar.f897d = true;
        viewPager.addOnPageChangeListener(new Bs0.b(dVar, viewPager));
    }

    public void observePageChange(ViewPager2 viewPager2, FragmentManager fragmentManager) {
        d dVar = this.f85848a.f886a;
        if (dVar == null || viewPager2 == null || fragmentManager == null) {
            return;
        }
        viewPager2.registerOnPageChangeCallback(new c(dVar, viewPager2, fragmentManager));
    }

    public void onInterceptFragmentReport(boolean z6) {
        d dVar;
        Bs0.a aVar = this.f85848a;
        if (aVar == null || (dVar = aVar.f886a) == null) {
            return;
        }
        dVar.f896c = z6;
    }

    public void onPageVisibleChange(String str, String str2, int i7, Bundle bundle, boolean z6) {
        if (z6) {
            a.c().g(p.a(str, str2), str, i7, bundle);
            return;
        }
        a.c().e(null, str + str2);
    }

    public void registerReceiveCurrentEventIdListener(OnReceiveCurrentEventIdListener onReceiveCurrentEventIdListener) {
        if (onReceiveCurrentEventIdListener == null || ((CopyOnWriteArrayList) this.f85852e).contains(onReceiveCurrentEventIdListener)) {
            return;
        }
        ((CopyOnWriteArrayList) this.f85852e).add(onReceiveCurrentEventIdListener);
    }

    public void registerReceiveEventIdFromListener(OnReceiveEventIdFromListener onReceiveEventIdFromListener) {
        if (onReceiveEventIdFromListener == null || ((CopyOnWriteArrayList) this.f85851d).contains(onReceiveEventIdFromListener)) {
            return;
        }
        ((CopyOnWriteArrayList) this.f85851d).add(onReceiveEventIdFromListener);
    }

    public void registerSwitchToBackgroundListener(OnSwitchToBackgroundListener onSwitchToBackgroundListener) {
        List<OnSwitchToBackgroundListener> list = this.f85850c;
        if (list == null || onSwitchToBackgroundListener == null || ((CopyOnWriteArrayList) list).contains(onSwitchToBackgroundListener)) {
            return;
        }
        ((CopyOnWriteArrayList) this.f85850c).add(onSwitchToBackgroundListener);
    }

    public void setExtra(Activity activity, String str, Bundle bundle) {
        a.c().d(b(activity, str), bundle);
    }

    public void setExtra(Fragment fragment, String str, Bundle bundle) {
        a.c().d(b(fragment, str), bundle);
    }

    public void setExtra(String str, Bundle bundle) {
        a.c().d(str, bundle);
    }

    public void setFragmentVisibility(Fragment fragment, boolean z6) {
        d dVar = this.f85848a.f886a;
        if (dVar != null) {
            dVar.d(fragment, z6, true);
        }
    }

    public void setLastEndPv(PageViewsEvent pageViewsEvent) {
        this.f85854g = pageViewsEvent;
    }

    public void switchToBackground() {
        Bs0.a aVar = this.f85848a;
        if (aVar == null) {
            return;
        }
        BLog.d("PageViewTracker", "switch to background");
        String str = a.c().f85857b;
        if (!TextUtils.isEmpty(str) && ((HashMap) aVar.f887b).containsKey(str)) {
            ((HashMap) aVar.f887b).put(str, 0);
        }
        d dVar = aVar.f886a;
        if (dVar != null) {
            String str2 = a.c().f85857b;
            if (!TextUtils.isEmpty(str2) && ((HashMap) dVar.f894a).containsKey(str2)) {
                ((HashMap) dVar.f894a).put(str2, 0);
            }
        }
        if (((CopyOnWriteArrayList) this.f85850c).isEmpty()) {
            return;
        }
        for (OnSwitchToBackgroundListener onSwitchToBackgroundListener : (CopyOnWriteArrayList) this.f85850c) {
            if (onSwitchToBackgroundListener != null) {
                onSwitchToBackgroundListener.switchToBackground();
            }
        }
    }

    public void triggerLastPageVisible(boolean z6) {
        d dVar;
        Bs0.a aVar = this.f85848a;
        if (aVar == null || (dVar = aVar.f886a) == null) {
            return;
        }
        dVar.f896c = !z6;
        if (z6) {
            if (this.f85849b == null) {
                return;
            }
            a aVarC = a.c();
            a.C0573a c0573a = this.f85849b;
            aVarC.g(c0573a.f85862d, c0573a.f85859a, 1, c0573a.f85860b);
            aVar.f886a.f895b = this.f85849b.f85862d;
            return;
        }
        String str = dVar.f895b;
        a aVarC2 = a.c();
        aVarC2.getClass();
        this.f85849b = (TextUtils.isEmpty(str) || !aVarC2.f85856a.containsKey(str)) ? null : (a.C0573a) ((LinkedHashMap) aVarC2.f85856a).get(str);
        a.c().f();
        aVar.f886a.f895b = "";
    }

    public void unregisterReceiveCurrentEventIdListener(OnReceiveCurrentEventIdListener onReceiveCurrentEventIdListener) {
        if (onReceiveCurrentEventIdListener == null) {
            return;
        }
        ((CopyOnWriteArrayList) this.f85852e).remove(onReceiveCurrentEventIdListener);
    }

    public void unregisterReceiveEventIdFromListener(OnReceiveEventIdFromListener onReceiveEventIdFromListener) {
        if (onReceiveEventIdFromListener == null) {
            return;
        }
        ((CopyOnWriteArrayList) this.f85851d).remove(onReceiveEventIdFromListener);
    }

    public void unregisterSwitchToBackgroundListener(OnSwitchToBackgroundListener onSwitchToBackgroundListener) {
        if (onSwitchToBackgroundListener == null) {
            return;
        }
        ((CopyOnWriteArrayList) this.f85850c).remove(onSwitchToBackgroundListener);
    }
}
