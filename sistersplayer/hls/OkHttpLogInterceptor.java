package com.bilibili.sistersplayer.hls;

import android.os.SystemClock;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/OkHttpLogInterceptor.class */
public final class OkHttpLogInterceptor implements Interceptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "OkHttpLogInterceptor";

    @Nullable
    private String lastConnectionString;

    @NotNull
    private final P2PLogger logger;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/OkHttpLogInterceptor$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public OkHttpLogInterceptor(@NotNull P2PLogger p2PLogger) {
        this.logger = p2PLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void log(okhttp3.Interceptor.Chain r8, long r9) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.OkHttpLogInterceptor.log(okhttp3.Interceptor$Chain, long):void");
    }

    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Response responseProceed = chain.proceed(chain.request());
        log(chain, SystemClock.uptimeMillis() - jUptimeMillis);
        return responseProceed;
    }
}
