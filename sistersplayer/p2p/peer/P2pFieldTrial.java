package com.bilibili.sistersplayer.p2p.peer;

import androidx.fragment.app.z;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.webrtc.ext.FieldTrialInterface;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/P2pFieldTrial.class */
public final class P2pFieldTrial implements FieldTrialInterface {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "P2pFieldTrial";

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final Map<String, String> trialMap = new LinkedHashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/P2pFieldTrial$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public P2pFieldTrial(@NotNull P2PLogger p2PLogger) {
        this.logger = p2PLogger;
        PLog.INSTANCE.getTags().put(TAG, Boolean.FALSE);
    }

    @NotNull
    public String findName(@NotNull String str) {
        String str2 = this.trialMap.get(str);
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        P2PLogger.logI$default(this.logger, TAG, z.a("findName ", str, " = ", str3), null, 4, null);
        return str3;
    }

    @NotNull
    public String getFieldTrials() {
        return toRTCTrials();
    }

    @NotNull
    public final P2pFieldTrial setTrials(@NotNull String str, @NotNull String str2) {
        this.trialMap.put(str, str2);
        return this;
    }

    @NotNull
    public final String toRTCTrials() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.trialMap.entrySet()) {
            sb.append(((Object) entry.getKey()) + "/" + ((Object) entry.getValue()) + "/");
        }
        return sb.toString();
    }
}
