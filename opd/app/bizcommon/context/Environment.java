package com.bilibili.opd.app.bizcommon.context;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.base.BiliContext;
import com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import qm0.C8454a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/Environment.class */
public abstract class Environment {
    public static final String ROUTER_INTERCEPTED_INTENT = "outer_intercept_intent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f73505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppLifecycleExtension f73506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<PageRouterInterceptor> f73507c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C8454a f73508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f73509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppLifecycleExtension.ExtLifecycleDelegate f73510f;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qm0.a] */
    public Environment(Application application, AppLifecycleExtension.ExtLifecycleDelegate extLifecycleDelegate, String str) {
        this.f73510f = extLifecycleDelegate;
        this.f73505a = application;
        ?? obj = new Object();
        new HashMap(16);
        new ArrayList(16);
        new AtomicInteger(0);
        obj.f126176a = str;
        this.f73508d = obj;
    }

    public final void a() {
        if (this.f73506b == null) {
            this.f73506b = new AppLifecycleExtension(this.f73510f);
        }
    }

    public void activityOnCreate(Activity activity) {
        a();
        this.f73506b.activityOnCreate(activity);
    }

    public void activityOnDestory(Activity activity) {
        a();
        this.f73506b.activityOnDestory(activity);
    }

    public void activityOnPause(Activity activity) {
        a();
        this.f73506b.activityOnPause(activity);
    }

    public void activityOnResume(Activity activity) {
        a();
        this.f73506b.activityOnResume(activity);
    }

    public void activityOnStart(Activity activity) {
        a();
        this.f73506b.activityOnStart(activity);
    }

    public void activityOnStop(Activity activity) {
        a();
        this.f73506b.activityOnStop(activity);
    }

    @Nullable
    public Activity currentActivity() {
        a();
        return this.f73506b.currentActivity();
    }

    public int getActiveActCounter() {
        int activeCounter;
        synchronized (this) {
            a();
            activeCounter = this.f73506b.getActiveCounter();
        }
        return activeCounter;
    }

    public AppLifecycleExtension getAppLifecycleExtension() {
        a();
        return this.f73506b;
    }

    public Application getApplication() {
        Application application = this.f73505a;
        Application application2 = application;
        if (application == null) {
            application2 = BiliContext.application();
        }
        return application2;
    }

    public int getLiveActCounter() {
        a();
        return this.f73506b.getLiveCounter();
    }

    public C8454a getSchemaRegistry() {
        return this.f73508d;
    }

    @NonNull
    public abstract ServiceManager getServiceManager();

    public boolean interceptRouter(Intent intent, int i7, Context context) throws ActivityNotFoundException {
        Iterator it = ((ArrayList) this.f73507c).iterator();
        while (it.hasNext()) {
            if (((PageRouterInterceptor) it.next()).preHandle(intent, i7, context)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDebug() {
        return this.f73509e;
    }

    public void registerAppLifeCycleListener(AppLifecycleExtension.AppLifecycleListener appLifecycleListener) {
        a();
        this.f73506b.registerAppLifeCycleListener(appLifecycleListener);
    }

    public void registerPageRouterInterceptor(PageRouterInterceptor pageRouterInterceptor) {
        if (pageRouterInterceptor == null || ((ArrayList) this.f73507c).contains(pageRouterInterceptor)) {
            return;
        }
        ((ArrayList) this.f73507c).add(pageRouterInterceptor);
    }

    public void setDebug(boolean z6) {
        this.f73509e = z6;
    }
}
