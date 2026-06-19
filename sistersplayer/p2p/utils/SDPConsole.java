package com.bilibili.sistersplayer.p2p.utils;

import Cp.b;
import androidx.fragment.app.z;
import com.bilibili.sistersplayer.httpserver.SimpleBaseClient;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/SDPConsole.class */
public final class SDPConsole {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "SDPConsole";

    @NotNull
    private final P2PLogger logger;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/SDPConsole$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.FALSE);
    }

    public SDPConsole(@NotNull P2PLogger p2PLogger) {
        this.logger = p2PLogger;
    }

    public static /* synthetic */ String removeBrowserLocalCandidate$default(SDPConsole sDPConsole, String str, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        return sDPConsole.removeBrowserLocalCandidate(str, str2);
    }

    @NotNull
    public final String removeBrowserLocalCandidate(@NotNull String str, @Nullable String str2) {
        List<String> listR = StringsKt.R(sdpFormat(str), new String[]{SimpleBaseClient.CRLF}, 0, 6);
        StringBuilder sb = new StringBuilder();
        for (String str3 : listR) {
            if (StringsKt.Z(str3, "a=candidate:") && StringsKt.n(str3, ".local")) {
                P2PLogger.logI$default(this.logger, TAG, z.a("peerId ", str2, " remove local candidate: ", str3), null, 4, null);
            } else if (str3.length() > 0) {
                sb.append(str3);
                sb.append(SimpleBaseClient.CRLF);
            }
        }
        return sb.toString();
    }

    @NotNull
    public final String sdpFormat(@NotNull String str) {
        return b.a("\\r\\n|\\r|\\n", str, SimpleBaseClient.CRLF);
    }
}
