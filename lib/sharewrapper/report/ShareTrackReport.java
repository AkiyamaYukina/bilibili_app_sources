package com.bilibili.lib.sharewrapper.report;

import AT0.c;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.sharewrapper.Bshare.GShare;
import com.bilibili.lib.sharewrapper.Bshare.b;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/report/ShareTrackReport.class */
public final class ShareTrackReport {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f64438a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static String f64439b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f64440c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/report/ShareTrackReport$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getMLastTime() {
            return ShareTrackReport.f64440c;
        }

        @NotNull
        public final String getMSession() {
            return ShareTrackReport.f64439b;
        }

        @NotNull
        public final String getMTarget() {
            return ShareTrackReport.f64438a;
        }

        @JvmStatic
        public final void reportShareTrack(@NotNull String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("target", getMTarget());
            SessionManager sessionManager = SessionManager.INSTANCE;
            linkedHashMap.put(Constant.IN_KEY_SESSION_ID, sessionManager.getSessionId());
            linkedHashMap.put("position", str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            linkedHashMap.put("time", String.valueOf(jCurrentTimeMillis));
            String sessionId = sessionManager.getSessionId();
            String strValueOf = (!getMSession().equals(sessionId) || Long.valueOf(jCurrentTimeMillis).equals("")) ? "" : String.valueOf(jCurrentTimeMillis - getMLastTime());
            setMSession(sessionId);
            setMLastTime(jCurrentTimeMillis);
            if (strValueOf == null) {
                strValueOf = "";
            }
            linkedHashMap.put(EditCustomizeSticker.TAG_DURATION, strValueOf);
            Function0<Boolean> cVar = new c<>(8);
            GShare.Neurons neurons = b.f64412a;
            if (neurons != null) {
                neurons.trackT(true, "app.bshare.track", linkedHashMap, cVar);
            }
        }

        public final void setMLastTime(long j7) {
            ShareTrackReport.f64440c = j7;
        }

        public final void setMSession(@NotNull String str) {
            ShareTrackReport.f64439b = str;
        }

        public final void setMTarget(@NotNull String str) {
            ShareTrackReport.f64438a = str;
        }

        public final void setShareTarget(@NotNull String str) {
            setMTarget(str);
        }
    }

    @JvmStatic
    public static final void reportShareTrack(@NotNull String str) {
        Companion.reportShareTrack(str);
    }
}
