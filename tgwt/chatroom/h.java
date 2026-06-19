package com.bilibili.tgwt.chatroom;

import android.net.NetworkInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.fragment.app.C;
import com.bilibili.ad.core.click.K;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.ogvvega.tunnel.VegaManager;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.h;
import com.google.gson.JsonParseException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f110987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final k f110988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f110989c = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MsgRetrieveConfig f110990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<a, Job> f110991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f110992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f110993g;

    @NotNull
    public final CoroutineScope h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final g f110994i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/h$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f110995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f110996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<Long, Boolean> f110997c = new LinkedHashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f110998d;

        public a(long j7, long j8) {
            this.f110995a = j7;
            this.f110996b = j8;
            if (j7 > j8) {
                com.bilibili.ogv.infra.util.e.b(new InvalidParameterException("start seq can`t greater than end seq"));
            }
            if (j7 > j8) {
                return;
            }
            while (true) {
                this.f110997c.put(Long.valueOf(j7), Boolean.FALSE);
                if (j7 == j8) {
                    return;
                } else {
                    j7++;
                }
            }
        }

        @NotNull
        public final String toString() {
            Map<Long, Boolean> map = this.f110997c;
            int i7 = this.f110998d;
            StringBuilder sb = new StringBuilder("Range(startSeq=");
            sb.append(this.f110995a);
            sb.append(", endSeq=");
            f6.a.a(sb, this.f110996b, ", seqIds=", map);
            return cf.i.a(i7, ", retryTimes=", ")", sb);
        }
    }

    public h(long j7, long j8, @NotNull k kVar) {
        MsgRetrieveConfig msgRetrieveConfig;
        this.f110987a = j7;
        this.f110988b = kVar;
        try {
            msgRetrieveConfig = (MsgRetrieveConfig) JsonUtilKt.parseJson(Hj0.a.c("ogv.msg_retrive_config"), new l().getType());
        } catch (JsonParseException e7) {
            msgRetrieveConfig = new MsgRetrieveConfig(false, 0L, 0, 0L, 0, 0L, 63);
        }
        defpackage.a.b("[together-watch-RoomConfigKt-msgRetrieveConfig] ", "msg retrieve config " + msgRetrieveConfig + UtilsKt.DOT, "RoomConfigKt-msgRetrieveConfig");
        this.f110990d = msgRetrieveConfig;
        this.f110991e = new LinkedHashMap();
        this.f110993g = j8;
        this.h = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
        ConnectivityMonitor.OnNetworkChangedListener onNetworkChangedListener = new ConnectivityMonitor.c(this) { // from class: com.bilibili.tgwt.chatroom.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f110986a;

            {
                this.f110986a = this;
            }

            public final void onChanged(int i7, int i8, NetworkInfo networkInfo) {
                h hVar = this.f110986a;
                if (i8 != 3 || i7 == 3) {
                    if (i7 == 3) {
                        hVar.getClass();
                        BLog.i("MsgRetrieval-pause", "[together-watch-MsgRetrieval-pause] pause");
                        Iterator it = ((LinkedHashMap) hVar.f110991e).entrySet().iterator();
                        while (it.hasNext()) {
                            Job.DefaultImpls.cancel$default((Job) ((Map.Entry) it.next()).getValue(), (CancellationException) null, 1, (Object) null);
                        }
                        return;
                    }
                    return;
                }
                hVar.getClass();
                BLog.i("MsgRetrieval-resume", "[together-watch-MsgRetrieval-resume] resume");
                Iterator it2 = ((LinkedHashMap) hVar.f110991e).entrySet().iterator();
                while (it2.hasNext()) {
                    h.a aVar = (h.a) ((Map.Entry) it2.next()).getKey();
                    hVar.f110991e.put(aVar, BuildersKt.launch$default(hVar.h, (CoroutineContext) null, (CoroutineStart) null, new MsgRetrieval$startDelayRetrieval$job$1(0L, hVar, aVar, null), 3, (Object) null));
                }
                Job job = hVar.f110992f;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                hVar.f110992f = BuildersKt.launch$default(hVar.h, (CoroutineContext) null, (CoroutineStart) null, new MsgRetrieval$updateLatestSeqId$1(hVar, null), 3, (Object) null);
            }
        };
        this.f110994i = onNetworkChangedListener;
        if (!msgRetrieveConfig.f110958a || VegaManager.Companion.vegaOptEnabled()) {
            return;
        }
        ConnectivityMonitor.getInstance().register(onNetworkChangedListener);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011b A[PHI: r10 r11 r13 r17 r18
  0x011b: PHI (r10v1 com.bilibili.tgwt.chatroom.h$a) = (r10v8 com.bilibili.tgwt.chatroom.h$a), (r10v10 com.bilibili.tgwt.chatroom.h$a) binds: [B:21:0x0112, B:18:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r11v1 long) = (r11v2 long), (r11v4 long) binds: [B:21:0x0112, B:18:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r13v3 com.bilibili.tgwt.chatroom.MsgRetrieval$retrieveMsgs$1) = 
  (r13v11 com.bilibili.tgwt.chatroom.MsgRetrieval$retrieveMsgs$1)
  (r13v2 com.bilibili.tgwt.chatroom.MsgRetrieval$retrieveMsgs$1)
 binds: [B:21:0x0112, B:18:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r17v1 java.lang.String) = (r17v4 java.lang.String), (r17v7 java.lang.String) binds: [B:21:0x0112, B:18:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r18v2 java.lang.Object) = (r18v8 java.lang.Object), (r18v0 java.lang.Object) binds: [B:21:0x0112, B:18:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0411 -> B:69:0x041a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.tgwt.chatroom.h r9, com.bilibili.tgwt.chatroom.h.a r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.chatroom.h.a(com.bilibili.tgwt.chatroom.h, com.bilibili.tgwt.chatroom.h$a, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(long j7, long j8) {
        long j9;
        long j10 = this.f110993g;
        StringBuilder sbA = z.a(j7, "checkAndRetrive, seqId = ", ", roomId = ");
        sbA.append(j8);
        defpackage.a.b("[together-watch-MsgRetrieval-checkAndRetrieve] ", Ld.c.a(sbA, j10, ", seqIdReceived = false, latestMsgSeqId = "), "MsgRetrieval-checkAndRetrieve");
        long j11 = this.f110993g;
        if (j7 <= j11) {
            return;
        }
        long j12 = 0;
        if (j7 > j11 + j12) {
            long j13 = j11 + 1;
            long j14 = j7 - j12;
            MsgRetrieveConfig msgRetrieveConfig = this.f110990d;
            int i7 = msgRetrieveConfig.f110962e;
            ArrayList arrayList = new ArrayList();
            long j15 = j13;
            while (true) {
                j9 = j15;
                long j16 = i7;
                if (j14 - j9 < j16) {
                    break;
                }
                long j17 = j16 + j9;
                arrayList.add(new a(j9, j17 - 1));
                j15 = j17;
            }
            arrayList.add(new a(j9, j14));
            int size = arrayList.size();
            StringBuilder sbA2 = z.a(j13, "splitIntoRanges, startSeqId = ", ", endSeqId = ");
            sbA2.append(j14);
            sbA2.append(", pageSize = ");
            BLog.i("MsgRetrieval-checkAndRetrieve", "[together-watch-MsgRetrieval-checkAndRetrieve] " + C.a(msgRetrieveConfig.f110962e, size, ", rangeCount = ", sbA2));
            int i8 = 0;
            for (Object obj : arrayList) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                a aVar = (a) obj;
                this.f110991e.put(aVar, BuildersKt.launch$default(this.h, (CoroutineContext) null, (CoroutineStart) null, new MsgRetrieval$startDelayRetrieval$job$1((((long) i8) * msgRetrieveConfig.f110963f) + msgRetrieveConfig.f110959b, this, aVar, null), 3, (Object) null));
                i8++;
            }
        }
        this.f110993g = j7;
    }

    public final void c() {
        CoroutineScopeKt.cancel$default(this.h, (CancellationException) null, 1, (Object) null);
        if (!this.f110990d.f110958a) {
            BLog.i("MsgRetrieval-finish", "[together-watch-MsgRetrieval-finish] retrieval disabled");
            return;
        }
        BLog.i("MsgRetrieval-finish", "[together-watch-MsgRetrieval-finish] finish");
        Iterator it = ((LinkedHashMap) this.f110991e).entrySet().iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) ((Map.Entry) it.next()).getValue(), (CancellationException) null, 1, (Object) null);
        }
        ((LinkedHashMap) this.f110991e).clear();
        Job job = this.f110992f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f110992f = null;
        ConnectivityMonitor.getInstance().unregister(this.f110994i);
    }
}
