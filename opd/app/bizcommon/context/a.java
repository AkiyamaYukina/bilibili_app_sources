package com.bilibili.opd.app.bizcommon.context;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/a.class */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppLifecycleExtension f73529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AppLifecycleExtension appLifecycleExtension, Looper looper) {
        super(looper);
        this.f73529a = appLifecycleExtension;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AppLifecycleExtension.ExtLifecycleDelegate extLifecycleDelegate;
        AppLifecycleExtension.ExtLifecycleDelegate extLifecycleDelegate2;
        AppLifecycleExtension.ExtLifecycleDelegate extLifecycleDelegate3;
        AppLifecycleExtension.ExtLifecycleDelegate extLifecycleDelegate4;
        int i7 = message.what;
        if (i7 == 1) {
            AppLifecycleExtension appLifecycleExtension = this.f73529a;
            int i8 = appLifecycleExtension.f73498a - 1;
            appLifecycleExtension.f73498a = i8;
            if (i8 != 0 || (extLifecycleDelegate = appLifecycleExtension.f73502e) == null) {
                return;
            }
            extLifecycleDelegate.onLastActivityDestroy();
            synchronized (appLifecycleExtension.f73504g) {
                Iterator it = ((ArrayList) appLifecycleExtension.f73503f).iterator();
                while (it.hasNext()) {
                    ((AppLifecycleExtension.AppLifecycleListener) it.next()).onLastActivityDestroy();
                }
            }
            return;
        }
        if (i7 == 2) {
            AppLifecycleExtension appLifecycleExtension2 = this.f73529a;
            if (appLifecycleExtension2.f73498a <= 0 || appLifecycleExtension2.f73499b != 0 || (extLifecycleDelegate2 = appLifecycleExtension2.f73502e) == null) {
                sendEmptyMessageDelayed(3, 500L);
                return;
            }
            extLifecycleDelegate2.onApplicationPause();
            synchronized (this.f73529a.f73504g) {
                Iterator it2 = ((ArrayList) this.f73529a.f73503f).iterator();
                while (it2.hasNext()) {
                    ((AppLifecycleExtension.AppLifecycleListener) it2.next()).onApplicationPause();
                }
            }
            return;
        }
        if (i7 == 3) {
            AppLifecycleExtension appLifecycleExtension3 = this.f73529a;
            int i9 = appLifecycleExtension3.f73499b - 1;
            appLifecycleExtension3.f73499b = i9;
            if (i9 != 0 || (extLifecycleDelegate3 = appLifecycleExtension3.f73502e) == null) {
                return;
            }
            extLifecycleDelegate3.onApplicationPause();
            synchronized (appLifecycleExtension3.f73504g) {
                Iterator it3 = ((ArrayList) appLifecycleExtension3.f73503f).iterator();
                while (it3.hasNext()) {
                    ((AppLifecycleExtension.AppLifecycleListener) it3.next()).onApplicationPause();
                }
            }
            return;
        }
        if (i7 != 4) {
            return;
        }
        AppLifecycleExtension appLifecycleExtension4 = this.f73529a;
        int i10 = appLifecycleExtension4.f73500c - 1;
        appLifecycleExtension4.f73500c = i10;
        if (i10 != 0 || (extLifecycleDelegate4 = appLifecycleExtension4.f73502e) == null) {
            return;
        }
        extLifecycleDelegate4.onLastActivityStop();
        synchronized (appLifecycleExtension4.f73504g) {
            Iterator it4 = ((ArrayList) appLifecycleExtension4.f73503f).iterator();
            while (it4.hasNext()) {
                ((AppLifecycleExtension.AppLifecycleListener) it4.next()).onLastActivityStop();
            }
        }
    }
}
