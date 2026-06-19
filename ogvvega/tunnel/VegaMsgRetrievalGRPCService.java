package com.bilibili.ogvvega.tunnel;

import com.bapis.bilibili.vega.deneb.v1.MessagePullsReply;
import com.bapis.bilibili.vega.deneb.v1.MessagePullsReq;
import com.bapis.bilibili.vega.deneb.v1.VegaDenebRPCMoss;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaMsgRetrievalGRPCService.class */
public final class VegaMsgRetrievalGRPCService {
    public static final int DEFAULT_PAGE_SIZE = 100;

    @NotNull
    public static final VegaMsgRetrievalGRPCService INSTANCE = new VegaMsgRetrievalGRPCService();

    private VegaMsgRetrievalGRPCService() {
    }

    public static /* synthetic */ MessagePullsReply retrieveVegaMessages$default(VegaMsgRetrievalGRPCService vegaMsgRetrievalGRPCService, long j7, long j8, int i7, int i8, int i9, Object obj) throws MossException {
        if ((i9 & 4) != 0) {
            i7 = 100;
        }
        if ((i9 & 8) != 0) {
            i8 = 1;
        }
        return vegaMsgRetrievalGRPCService.retrieveVegaMessages(j7, j8, i7, i8);
    }

    @Nullable
    public final MessagePullsReply retrieveVegaMessages(long j7, long j8, int i7, int i8) throws MossException {
        return new VegaDenebRPCMoss("IGNORED IN 5.46 AS PLACEHOLDER", 443, (CallOptions) null, 4, (DefaultConstructorMarker) null).executeMessagePulls(MessagePullsReq.newBuilder().setStartSeqId(j7).setEndSeqId(j8).setPs(i7).setPn(i8).build());
    }
}
