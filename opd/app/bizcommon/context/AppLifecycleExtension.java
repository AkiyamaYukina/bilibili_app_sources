package com.bilibili.opd.app.bizcommon.context;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/AppLifecycleExtension.class */
public class AppLifecycleExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference<Activity> f73501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExtLifecycleDelegate f73502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<AppLifecycleListener> f73503f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f73504g = new Object();
    protected Handler mHandler;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/AppLifecycleExtension$AppLifecycleListener.class */
    public interface AppLifecycleListener {
        void activityOnCreate(Activity activity);

        void activityOnDestory(Activity activity);

        void activityOnPause(Activity activity);

        void activityOnResume(Activity activity);

        default void activityOnStop(Activity activity) {
        }

        void onApplicationPause();

        void onApplicationResume();

        void onFirstActivityCreate();

        default void onFirstActivityStart() {
        }

        default void onLastActivityDestroy() {
        }

        void onLastActivityStop();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/AppLifecycleExtension$ExtLifecycleDelegate.class */
    public interface ExtLifecycleDelegate {
        void onApplicationPause();

        void onApplicationResume();

        void onFirstActivityCreate();

        default void onFirstActivityStart() {
        }

        default void onLastActivityDestroy() {
        }

        void onLastActivityStop();
    }

    public AppLifecycleExtension(ExtLifecycleDelegate extLifecycleDelegate) {
        this.f73502e = extLifecycleDelegate;
    }

    public void activityOnCreate(Activity activity) {
        ExtLifecycleDelegate extLifecycleDelegate;
        int i7 = this.f73498a;
        this.f73498a = i7 + 1;
        if (i7 == 0 && (extLifecycleDelegate = this.f73502e) != null) {
            extLifecycleDelegate.onFirstActivityCreate();
            synchronized (this.f73504g) {
                Iterator it = ((ArrayList) this.f73503f).iterator();
                while (it.hasNext()) {
                    ((AppLifecycleListener) it.next()).onFirstActivityCreate();
                }
            }
        }
        this.f73501d = new WeakReference<>(activity);
        synchronized (this.f73504g) {
            Iterator it2 = ((ArrayList) this.f73503f).iterator();
            while (it2.hasNext()) {
                ((AppLifecycleListener) it2.next()).activityOnCreate(activity);
            }
        }
    }

    public void activityOnDestory(Activity activity) {
        if (this.mHandler == null) {
            this.mHandler = new a(this, Looper.getMainLooper());
        }
        this.mHandler.sendEmptyMessage(1);
        synchronized (this.f73504g) {
            Iterator it = ((ArrayList) this.f73503f).iterator();
            while (it.hasNext()) {
                ((AppLifecycleListener) it.next()).activityOnDestory(activity);
            }
        }
    }

    public void activityOnPause(Activity activity) {
        if (this.mHandler == null) {
            this.mHandler = new a(this, Looper.getMainLooper());
        }
        this.mHandler.sendEmptyMessage(2);
        synchronized (this.f73504g) {
            Iterator it = ((ArrayList) this.f73503f).iterator();
            while (it.hasNext()) {
                ((AppLifecycleListener) it.next()).activityOnPause(activity);
            }
        }
    }

    public void activityOnResume(Activity activity) {
        ExtLifecycleDelegate extLifecycleDelegate;
        int i7 = this.f73499b;
        this.f73499b = i7 + 1;
        if (i7 == 0 && (extLifecycleDelegate = this.f73502e) != null) {
            extLifecycleDelegate.onApplicationResume();
            synchronized (this.f73504g) {
                Iterator it = ((ArrayList) this.f73503f).iterator();
                while (it.hasNext()) {
                    ((AppLifecycleListener) it.next()).onApplicationResume();
                }
            }
        }
        this.f73501d = new WeakReference<>(activity);
        synchronized (this.f73504g) {
            Iterator it2 = ((ArrayList) this.f73503f).iterator();
            while (it2.hasNext()) {
                ((AppLifecycleListener) it2.next()).activityOnResume(activity);
            }
        }
    }

    public void activityOnStart(Activity activity) {
        ExtLifecycleDelegate extLifecycleDelegate;
        int i7 = this.f73500c;
        this.f73500c = i7 + 1;
        if (i7 == 0 && (extLifecycleDelegate = this.f73502e) != null) {
            extLifecycleDelegate.onFirstActivityStart();
            synchronized (this.f73504g) {
                Iterator it = ((ArrayList) this.f73503f).iterator();
                while (it.hasNext()) {
                    ((AppLifecycleListener) it.next()).onFirstActivityStart();
                }
            }
        }
        this.f73501d = new WeakReference<>(activity);
        synchronized (this.f73504g) {
            Iterator it2 = ((ArrayList) this.f73503f).iterator();
            while (it2.hasNext()) {
                ((AppLifecycleListener) it2.next()).onFirstActivityStart();
            }
        }
    }

    public void activityOnStop(Activity activity) {
        if (this.mHandler == null) {
            this.mHandler = new a(this, Looper.getMainLooper());
        }
        this.mHandler.sendEmptyMessage(4);
        synchronized (this.f73504g) {
            Iterator it = ((ArrayList) this.f73503f).iterator();
            while (it.hasNext()) {
                ((AppLifecycleListener) it.next()).activityOnStop(activity);
            }
        }
    }

    @Nullable
    public Activity currentActivity() {
        WeakReference<Activity> weakReference = this.f73501d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int getActiveCounter() {
        return this.f73499b;
    }

    public int getLiveCounter() {
        return this.f73498a;
    }

    public void registerAppLifeCycleListener(AppLifecycleListener appLifecycleListener) {
        synchronized (this.f73504g) {
            ArrayList arrayList = new ArrayList(this.f73503f);
            arrayList.add(appLifecycleListener);
            this.f73503f = arrayList;
        }
    }
}
