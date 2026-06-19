package com.bilibili.opd.app.bizcommon.context.session;

import F3.I;
import android.app.Application;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.bilibili.base.BiliContext;
import com.bilibili.base.ipc.IPCAppStateManager;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/session/a.class */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy<a> f73555e = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new I(15));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MallSession f73556a = new MallSession(null, null, null, 0, null, 31, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f73557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f73558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f73559d;

    /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.context.session.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/session/a$a.class */
    public static final class C0466a extends IPCAppStateManager.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f73560b;

        public C0466a(a aVar) {
            this.f73560b = aVar;
        }

        public final void a() {
            this.f73560b.f73557b = true;
        }

        public final void b() {
            this.f73560b.f73557b = false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/session/a$b.class */
    public static final class b {
        @NotNull
        public static a a() {
            return (a) a.f73555e.getValue();
        }
    }

    public a() {
        IPCAppStateManager.getInstance().addIPCActivityStateCallback(new C0466a(this));
    }

    public static String a() {
        ContentResolver contentResolver;
        Cursor cursorQuery;
        Uri.Builder builderPath = MallProviderParamsHelper.access$getBaseUriBuilder(MallProviderParamsHelper.INSTANCE).path("/mall/config");
        builderPath.appendQueryParameter("configKey", "modPreloadRes");
        builderPath.appendQueryParameter("type", "obj");
        Application application = BiliContext.application();
        if (application == null || (contentResolver = application.getContentResolver()) == null || (cursorQuery = contentResolver.query(builderPath.build(), null, null, null, null)) == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            if (!cursor2.moveToFirst() || cursor2.isNull(0)) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, (Throwable) null);
                return null;
            }
            String string = cursor2.getString(0);
            CloseableKt.closeFinally(cursor, (Throwable) null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    public static void d(@NotNull String str) {
        ContentResolver contentResolver;
        MallSession mallSession = MallSessionHelper.INSTANCE.getMallSession();
        if (Intrinsics.areEqual(mallSession.getPrePageId(), str)) {
            return;
        }
        mallSession.setPrePageId(str);
        Uri uriBuild = MallProviderParamsHelper.access$getBaseUriBuilder(MallProviderParamsHelper.INSTANCE).path("/session/check").appendQueryParameter("notifytype", "prePageId").appendQueryParameter("prePageId", str).build();
        Application application = BiliContext.application();
        if (application == null || (contentResolver = application.getContentResolver()) == null) {
            return;
        }
        contentResolver.notifyChange(uriBuild, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.Nullable java.lang.Integer r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.context.session.a.b(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(@org.jetbrains.annotations.Nullable java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.context.session.a.c(java.lang.String, boolean):void");
    }

    public final void e(String str) {
        if (this.f73557b) {
            return;
        }
        boolean z6 = str.length() == 0;
        MallSession mallSession = this.f73556a;
        if (z6 || Intrinsics.areEqual(str, "bilibiliapp")) {
            Integer sourceType = mallSession.getSourceType();
            if (sourceType != null && sourceType.intValue() == 0) {
                return;
            }
            mallSession.setSourceType(0);
            b(mallSession.getSourceType(), mallSession.getSessionId(), mallSession.getSessionCreateTime(), "sessioninfo");
            return;
        }
        Integer sourceType2 = mallSession.getSourceType();
        if (sourceType2 != null && sourceType2.intValue() == 1) {
            return;
        }
        mallSession.setSourceType(1);
        b(mallSession.getSourceType(), mallSession.getSessionId(), mallSession.getSessionCreateTime(), "sessioninfo");
    }
}
