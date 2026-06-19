package com.bilibili.opd.app.bizcommon.radar.startail;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.base.Config;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.ServicesProvider;
import defpackage.a;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/startail/StarTail.class */
@StabilityInferred(parameters = 1)
public final class StarTail {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "StarTail";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/startail/StarTail$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void monitor$default(Companion companion, String str, String str2, Map map, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = null;
            }
            if ((i7 & 2) != 0) {
                str2 = null;
            }
            if ((i7 & 4) != 0) {
                map = null;
            }
            companion.monitor(str, str2, map);
        }

        public static /* synthetic */ void monitorH5$default(Companion companion, String str, String str2, Activity activity, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str2 = null;
            }
            companion.monitorH5(str, str2, activity);
        }

        @JvmStatic
        public final void monitor(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
            if (Config.isDebuggable()) {
                a.b("monitor-eventId: ", str, StarTail.TAG);
                try {
                    BLRouter bLRouter = BLRouter.INSTANCE;
                    o00.a.a();
                    hn0.a aVar = (hn0.a) ServicesProvider.get$default(bLRouter.getServices(hn0.a.class), (String) null, 1, (Object) null);
                    if (aVar == null) {
                        return;
                    }
                    aVar.monitor();
                } catch (Exception e7) {
                    BLog.e(StarTail.TAG, e7.getMessage());
                }
            }
        }

        @JvmStatic
        public final void monitorH5(@Nullable String str, @Nullable String str2, @Nullable Activity activity) {
            if (Config.isDebuggable()) {
                a.b("monitor-eventId: ", str, StarTail.TAG);
                try {
                    BLRouter bLRouter = BLRouter.INSTANCE;
                    o00.a.a();
                    hn0.a aVar = (hn0.a) ServicesProvider.get$default(bLRouter.getServices(hn0.a.class), (String) null, 1, (Object) null);
                    if (aVar == null) {
                        return;
                    }
                    aVar.a();
                } catch (Exception e7) {
                    BLog.e(StarTail.TAG, e7.getMessage());
                }
            }
        }
    }

    @JvmStatic
    public static final void monitor(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
        Companion.monitor(str, str2, map);
    }

    @JvmStatic
    public static final void monitorH5(@Nullable String str, @Nullable String str2, @Nullable Activity activity) {
        Companion.monitorH5(str, str2, activity);
    }
}
