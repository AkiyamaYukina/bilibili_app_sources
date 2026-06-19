package com.bilibili.lib.simpleshare;

import android.app.Activity;
import android.content.BroadcastReceiver;
import com.bilibili.lib.sharewrapper.Bshare.BShareFoudation;
import com.bilibili.lib.simpleshare.WxHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/simpleshare/a.class */
public final class a implements WxHelper.WxHelperDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64463a;

    /* JADX INFO: renamed from: com.bilibili.lib.simpleshare.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/simpleshare/a$a.class */
    public static final class C0357a extends WxHelper.SimpleActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f64464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f64465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f64466c;

        public C0357a(Activity activity, a aVar, b bVar) {
            this.f64464a = activity;
            this.f64465b = aVar;
            this.f64466c = bVar;
        }

        @Override // com.bilibili.lib.simpleshare.WxHelper.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            try {
                if (Intrinsics.areEqual(activity, this.f64464a)) {
                    if (this.f64465b.f64463a) {
                        this.f64464a.unregisterReceiver(this.f64466c);
                    }
                    BShareFoudation.INSTANCE.getFapp().unregisterActivityLifecycleCallbacks(this);
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/simpleshare/a$b.class */
    public static final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f64467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f64468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function1<String, Unit> f64469c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Activity activity, a aVar, Function1<? super String, Unit> function1) {
            this.f64467a = activity;
            this.f64468b = aVar;
            this.f64469c = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                r0 = r4
                android.app.Activity r0 = r0.f64467a
                r1 = r4
                r0.unregisterReceiver(r1)
                r0 = r4
                com.bilibili.lib.simpleshare.a r0 = r0.f64468b
                r5 = r0
                r0 = r5
                r1 = 0
                r0.f64463a = r1
                r0 = r6
                if (r0 == 0) goto L30
                r0 = r5
                java.lang.Class r0 = r0.getClass()
                r0 = r6
                java.lang.String r1 = "program_extra"
                android.os.Bundle r0 = r0.getBundleExtra(r1)
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L30
                r0 = r5
                java.lang.String r1 = "_launch_wxminiprogram_ext_msg"
                java.lang.String r0 = r0.getString(r1)
                r5 = r0
                goto L32
            L30:
                r0 = 0
                r5 = r0
            L32:
                r0 = r5
                if (r0 == 0) goto L6c
                r0 = r5
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L40
                goto L6c
            L40:
                r0 = r4
                com.bilibili.lib.simpleshare.a r0 = r0.f64468b
                java.lang.Class r0 = r0.getClass()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "wx receive msg::"
                r1.<init>(r2)
                r6 = r0
                r0 = r6
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = "client.wxhelper"
                r1 = r6
                java.lang.String r1 = r1.toString()
                com.bilibili.lib.sharewrapper.Bshare.ShareBLog.i(r0, r1)
                r0 = r4
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r0 = r0.f64469c
                r1 = r5
                java.lang.Object r0 = r0.invoke(r1)
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.simpleshare.a.b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    @Override // com.bilibili.lib.simpleshare.WxHelper.WxHelperDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void openWXMiniProgram(@org.jetbrains.annotations.NotNull android.app.Activity r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, int r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r13, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.simpleshare.a.openWXMiniProgram(android.app.Activity, java.lang.String, java.lang.String, int, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }
}
