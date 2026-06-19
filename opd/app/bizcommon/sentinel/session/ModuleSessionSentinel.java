package com.bilibili.opd.app.bizcommon.sentinel.session;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension;
import com.bilibili.opd.app.bizcommon.context.ModuleEnviroment;
import com.bilibili.opd.app.bizcommon.sentinel.session.ModuleSessionSentinel;
import com.bilibili.opd.app.sentinel.SentinelXXX;
import java.lang.Thread;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import tn0.C8672a;
import tn0.C8674c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/session/ModuleSessionSentinel.class */
public class ModuleSessionSentinel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map<String, SoftReference<C8672a>> f74522j = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleEnviroment f74523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8672a f74524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f74525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f74526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f74528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f74529g;
    public volatile boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f74530i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/session/ModuleSessionSentinel$a.class */
    public final class a implements AppLifecycleExtension.AppLifecycleListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ModuleSessionSentinel f74531a;

        public a(ModuleSessionSentinel moduleSessionSentinel) {
            this.f74531a = moduleSessionSentinel;
        }

        @Override // com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension.AppLifecycleListener
        public final void activityOnCreate(Activity activity) {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension.AppLifecycleListener
        public final void activityOnDestory(Activity activity) {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension.AppLifecycleListener
        public final void activityOnPause(Activity activity) {
            this.f74531a.h = false;
            ModuleSessionSentinel moduleSessionSentinel = this.f74531a;
            if (moduleSessionSentinel.f74527e) {
                moduleSessionSentinel.f74524b.b();
            } else {
                moduleSessionSentinel.a("pause");
            }
        }

        @Override // com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension.AppLifecycleListener
        public final void activityOnResume(Activity activity) {
            this.f74531a.h = true;
            ModuleSessionSentinel moduleSessionSentinel = this.f74531a;
            if (moduleSessionSentinel.f74527e) {
                moduleSessionSentinel.f74524b.d();
            } else {
                moduleSessionSentinel.a("resume");
            }
        }

        @Override // com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension.AppLifecycleListener
        public final void onApplicationPause() {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension.AppLifecycleListener
        public final void onApplicationResume() {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension.AppLifecycleListener
        public final void onFirstActivityCreate() {
        }

        @Override // com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension.AppLifecycleListener
        public final void onLastActivityStop() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, tn0.a] */
    public ModuleSessionSentinel(@NonNull ModuleEnviroment moduleEnviroment, String str, String... strArr) {
        if (moduleEnviroment.getModule() == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        SentinelXXX sentinelService = moduleEnviroment.getServiceManager().getSentinelService();
        this.f74530i = sentinelService.isEnabled();
        ?? obj = new Object();
        obj.f127561a = moduleEnviroment.getApplication().getSharedPreferences(moduleEnviroment.getModule().getClass().getName().concat("_app_sentinel"), 0);
        obj.f127562b = sentinelService;
        obj.f127568i = sentinelService.isEnabled();
        this.f74524b = obj;
        this.f74526d = str;
        this.f74523a = moduleEnviroment;
        this.f74528f = strArr;
        String name = moduleEnviroment.getModule().getClass().getName();
        this.f74529g = name;
        Map<String, SoftReference<C8672a>> map = f74522j;
        ((HashMap) map).put(name, new SoftReference(obj));
    }

    public static C8672a getSession(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SoftReference softReference = (SoftReference) ((HashMap) f74522j).get(str);
        return softReference == null ? null : (C8672a) softReference.get();
    }

    public final void a(String str) {
        Intent intent = new Intent("com.bilibili.opd.sentinel.module.session");
        intent.putExtra("action", str);
        intent.putExtra("moduleName", this.f74529g);
        this.f74523a.getApplication().sendBroadcast(intent);
    }

    public void init() {
        if (this.f74530i && !this.f74525c) {
            boolean z6 = true;
            this.f74525c = true;
            String str = this.f74526d;
            if (str == null || str.indexOf(58) != -1) {
                z6 = false;
            }
            this.f74527e = z6;
            a aVar = new a(this);
            ModuleEnviroment moduleEnviroment = this.f74523a;
            moduleEnviroment.registerAppLifeCycleListener(aVar);
            moduleEnviroment.getServiceManager().getSentinelService().addFilterLast(new C8674c(this));
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(this, defaultUncaughtExceptionHandler) { // from class: tn0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ModuleSessionSentinel f127569a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Thread.UncaughtExceptionHandler f127570b;

                {
                    this.f127569a = this;
                    this.f127570b = defaultUncaughtExceptionHandler;
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x00c7 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #0 {all -> 0x00f7, blocks: (B:3:0x001a, B:5:0x0022, B:9:0x0037, B:14:0x0047, B:19:0x005f, B:21:0x0069, B:25:0x007b, B:28:0x008c, B:32:0x009e, B:40:0x00c7, B:42:0x00cf, B:45:0x00e1, B:48:0x00fc), top: B:56:0x001a }] */
                @Override // java.lang.Thread.UncaughtExceptionHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
                    /*
                        Method dump skipped, instruction units count: 299
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tn0.C8673b.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
                }
            });
        }
    }
}
