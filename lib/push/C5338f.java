package com.bilibili.lib.push;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bilibili.gripper.container.bpush.d;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;

/* JADX INFO: renamed from: com.bilibili.lib.push.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/f.class */
public final class C5338f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Application f64240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final t f64241b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d.a.a f64244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ClickInfo f64245f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f64243d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f64246g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public IPushRegistry f64242c = new EmptyPushRegistry();

    /* JADX INFO: renamed from: com.bilibili.lib.push.f$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/f$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5338f f64247a;

        public a(C5338f c5338f) {
            this.f64247a = c5338f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f64247a.d();
            this.f64247a.f64246g++;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.lib.push.f$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/f$b.class */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5338f f64248a;

        public b(C5338f c5338f) {
            this.f64248a = c5338f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5338f c5338f = this.f64248a;
            if (!TextUtils.isEmpty(c5338f.f64242c.getToken(c5338f.f64240a)) || !Utils.isActiveNetwork(this.f64248a.f64240a)) {
                BPushLog.w("BPushManager", "has been register success");
            } else {
                BPushLog.e("BPushManager", "auto degrade to default push type");
                this.f64248a.a();
            }
        }
    }

    public C5338f(@NonNull Application application, @NonNull t tVar) {
        this.f64240a = application;
        this.f64241b = tVar;
    }

    public final void a() {
        synchronized (this) {
            IPushRegistry defaultType = D.c().getDefaultType();
            if (defaultType != null && defaultType.getPushType() != this.f64242c.getPushType() && C5334b.c().enableDowngrade()) {
                this.f64242c.unregisterPushService(this.f64240a);
                IPushRegistry iPushRegistryA = D.a(this, defaultType);
                this.f64242c = iPushRegistryA;
                iPushRegistryA.init();
                this.f64242c.registerPushService(this.f64240a);
                BPushLog.w("BPushManager", "degradeToDefaultPush");
            }
        }
    }

    public final void b() {
        synchronized (this) {
            IPushSwitchStrategy iPushSwitchStrategyC = D.c();
            if (this.f64242c instanceof EmptyPushRegistry) {
                this.f64242c = D.a(this, iPushSwitchStrategyC.switchPushType(this.f64240a));
            }
            D.b(this.f64240a, this.f64242c, iPushSwitchStrategyC.getDefaultType(), false);
            this.f64242c.setAbTestGroup(iPushSwitchStrategyC.getAbTestGroup());
            this.f64242c.init();
            this.f64242c.registerPushService(this.f64240a);
            e();
        }
    }

    @NonNull
    public final IPushRegistry c() {
        IPushRegistry iPushRegistry;
        synchronized (this) {
            if (this.f64242c instanceof EmptyPushRegistry) {
                b();
            }
            iPushRegistry = this.f64242c;
        }
        return iPushRegistry;
    }

    public final void d() {
        synchronized (this) {
            if (this.f64246g > 3) {
                return;
            }
            IPushRegistry iPushRegistryC = c();
            if (TextUtils.isEmpty(iPushRegistryC.getToken(this.f64240a))) {
                C5334b.c().getExecutor().schedule(new a(this), 1L, TimeUnit.SECONDS);
            } else {
                Application application = this.f64240a;
                EventInfo eventInfo = new EventInfo(iPushRegistryC.getToken(application), iPushRegistryC.getPushType());
                Lazy lazy = i.f64252a;
                i.c(application, 7, eventInfo.mPushType, eventInfo.mExtra, "device_token", eventInfo.mPushToken);
            }
        }
    }

    public final void e() {
        synchronized (this) {
            IPushRegistry defaultType = D.c().getDefaultType();
            if (!this.f64243d) {
                IPushRegistry iPushRegistry = this.f64242c;
                if (!(iPushRegistry instanceof EmptyPushRegistry) && defaultType != null && iPushRegistry.getPushType() != defaultType.getPushType()) {
                    this.f64243d = true;
                    new Handler(Looper.getMainLooper()).postDelayed(new b(this), 60000L);
                }
            }
        }
    }
}
