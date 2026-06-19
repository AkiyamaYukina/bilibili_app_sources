package com.bilibili.sistersplayer.hls;

import androidx.compose.foundation.lazy.staggeredgrid.Y;
import androidx.fragment.app.z;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/OkHttpDns.class */
public final class OkHttpDns implements Dns {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "OkHttpDns";

    @NotNull
    private final P2PLogger logger;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/OkHttpDns$Companion.class */
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

    public OkHttpDns(@NotNull P2PLogger p2PLogger) {
        this.logger = p2PLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence lookup$lambda$0(InetAddress inetAddress) {
        return String.valueOf(inetAddress.getHostAddress());
    }

    @NotNull
    public Dns.Record lookup(@NotNull String str) throws UnknownHostException {
        Dns.Record recordLookup = Dns.SYSTEM.lookup(str);
        final int i7 = 0;
        P2PLogger.logI$default(this.logger, TAG, z.a("hostname: ", str, ", ip list: ", CollectionsKt.p(recordLookup.addresses, (CharSequence) null, (CharSequence) null, (CharSequence) null, new Function1(i7) { // from class: com.bilibili.sistersplayer.hls.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f104917a;

            {
                this.f104917a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f104917a) {
                    case 0:
                        return OkHttpDns.lookup$lambda$0((InetAddress) obj);
                    default:
                        ((Integer) obj).getClass();
                        return Y.f35087a;
                }
            }
        }, 31)), null, 4, null);
        return recordLookup;
    }
}
