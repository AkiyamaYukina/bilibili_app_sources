package com.bilibili.opd.app.bizcommon.context.session;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemClock;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.opd.app.bizcommon.biliapm.MallTaskRunner;
import com.bilibili.opd.app.bizcommon.context.download.KtExtensionKt;
import com.bilibili.opd.app.bizcommon.context.session.a;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/session/MallSessionHelper.class */
public final class MallSessionHelper {

    @NotNull
    public static final MallSessionHelper INSTANCE = new MallSessionHelper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MallSession f73552a = new MallSession(null, null, null, 0, null, 31, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f73553b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f73554c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/session/MallSessionHelper$a.class */
    public static final class a extends ContentObserver {
        public static void a(Uri uri) {
            MallSession mallSession = MallSessionHelper.f73552a;
            String queryParameter = uri.getQueryParameter("sessionid");
            String str = queryParameter;
            if (queryParameter == null) {
                str = "";
            }
            mallSession.setSessionId(str);
            MallSession mallSession2 = MallSessionHelper.f73552a;
            String queryParameter2 = uri.getQueryParameter("sourcetype");
            mallSession2.setSourceType(queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null);
            MallSession mallSession3 = MallSessionHelper.f73552a;
            String queryParameter3 = uri.getQueryParameter("sessioncreatetime");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            mallSession3.setSessionCreateTime(queryParameter3);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.database.ContentObserver
        public final void onChange(boolean z6, Uri uri) {
            String queryParameter;
            Long longOrNull;
            if (uri == null || (queryParameter = uri.getQueryParameter("notifytype")) == null) {
                return;
            }
            switch (queryParameter.hashCode()) {
                case -2121990094:
                    if (queryParameter.equals("exitmall")) {
                        MallSessionHelper.f73553b = true;
                        String queryParameter2 = uri.getQueryParameter("exittime");
                        MallSessionHelper.f73554c = (queryParameter2 == null || (longOrNull = StringsKt.toLongOrNull(queryParameter2)) == null) ? 0L : longOrNull.longValue();
                        MallSessionHelper.f73552a.setPrePageId(null);
                        break;
                    }
                    break;
                case -1927881587:
                    if (queryParameter.equals("prePageId")) {
                        MallSessionHelper.f73552a.setPrePageId(uri.getQueryParameter("prePageId"));
                        break;
                    }
                    break;
                case -1111431691:
                    if (queryParameter.equals("sourceType")) {
                        MallSession mallSession = MallSessionHelper.f73552a;
                        String queryParameter3 = uri.getQueryParameter("sourcetype");
                        Integer intOrNull = null;
                        if (queryParameter3 != null) {
                            intOrNull = StringsKt.toIntOrNull(queryParameter3);
                        }
                        mallSession.setSourceType(intOrNull);
                        break;
                    }
                    break;
                case -21844924:
                    if (queryParameter.equals("sessioninfo")) {
                        MallSessionHelper.f73553b = false;
                        a(uri);
                        break;
                    }
                    break;
                case 328296382:
                    if (queryParameter.equals("sessioninfoadvance")) {
                        a(uri);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a() {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.context.session.MallSessionHelper.a():void");
    }

    @NotNull
    public final MallSession getMallSession() {
        MallSession mallSession = f73552a;
        String sessionId = mallSession.getSessionId();
        if ((sessionId == null || sessionId.length() == 0) && f73553b) {
            mallSession.setSessionId(UUID.randomUUID().toString());
            mallSession.setSessionCreateTime(String.valueOf(System.currentTimeMillis()));
            Lazy<com.bilibili.opd.app.bizcommon.context.session.a> lazy = com.bilibili.opd.app.bizcommon.context.session.a.f73555e;
            a.b.a().b(mallSession.getSourceType(), mallSession.getSessionId(), mallSession.getSessionCreateTime(), "sessioninfoadvance");
        } else if (KtExtensionKt.isNotNullAndNotEmpty(mallSession.getSessionId()) && f73553b && f73554c > 0 && SystemClock.elapsedRealtime() - f73554c > mallSession.getExpireTime()) {
            f73554c = 0L;
            mallSession.setSessionId(UUID.randomUUID().toString());
            mallSession.setSessionCreateTime(String.valueOf(System.currentTimeMillis()));
            Lazy<com.bilibili.opd.app.bizcommon.context.session.a> lazy2 = com.bilibili.opd.app.bizcommon.context.session.a.f73555e;
            a.b.a().b(mallSession.getSourceType(), mallSession.getSessionId(), mallSession.getSessionCreateTime(), "sessioninfoadvance");
        }
        return mallSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void init() {
        Boolean bool = (Boolean) ConfigManager.Companion.ab().get("mall_support_session_report", Boolean.FALSE);
        if (bool != null ? bool.booleanValue() : false) {
            MallTaskRunner.getInstance().submit(new Object());
        }
    }

    public final boolean isSessionNeedInit() {
        return f73553b;
    }

    public final void resetHomePageSourceType() {
        MallSession mallSession = f73552a;
        mallSession.setSourceType(0);
        Lazy<com.bilibili.opd.app.bizcommon.context.session.a> lazy = com.bilibili.opd.app.bizcommon.context.session.a.f73555e;
        a.b.a().b(mallSession.getSourceType(), mallSession.getSessionId(), mallSession.getSessionCreateTime(), "sourceType");
    }
}
