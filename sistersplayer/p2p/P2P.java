package com.bilibili.sistersplayer.p2p;

import android.content.Context;
import androidx.appcompat.widget.C3259x;
import com.bilibili.sistersplayer.hls.Fetcher;
import com.bilibili.sistersplayer.p2p.controller.SliceIdController;
import com.bilibili.sistersplayer.p2p.fragment.FragmentDataStat;
import com.bilibili.sistersplayer.p2p.fragment.FragmentFinishedStat;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2P.class */
public final class P2P {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String FETCH = "FETCH";

    @NotNull
    public static final String TAG = "P2P";

    @NotNull
    private final P2PConfig config;

    @Nullable
    private Context context;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private P2PContext p2pContext;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2P$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2P$initPeers$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2P$initPeers$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final P2P this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(P2P p2p, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = p2p;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initPeers(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.P2P$stopDownloadFragment$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2P$stopDownloadFragment$1.class */
    public static final class C64721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final P2P this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64721(P2P p2p, Continuation<? super C64721> continuation) {
            super(continuation);
            this.this$0 = p2p;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.stopDownloadFragment(null, this);
        }
    }

    static {
        PLog pLog = PLog.INSTANCE;
        Map<String, Boolean> tags = pLog.getTags();
        Boolean bool = Boolean.TRUE;
        tags.put(TAG, bool);
        pLog.getTags().put(FETCH, bool);
    }

    public P2P(@Nullable Context context, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Fetcher fetcher, @NotNull P2PConfig p2PConfig, @NotNull P2PLogger p2PLogger) {
        this.context = context;
        this.config = p2PConfig;
        this.logger = p2PLogger;
        this.p2pContext = new P2PContext(coroutineDispatcher, fetcher, p2PConfig, p2PLogger);
        P2PLogger.logI$default(p2PLogger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> P2P init "), null, 4, null);
    }

    public /* synthetic */ P2P(Context context, CoroutineDispatcher coroutineDispatcher, Fetcher fetcher, P2PConfig p2PConfig, P2PLogger p2PLogger, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : context, coroutineDispatcher, fetcher, p2PConfig, p2PLogger);
    }

    public static /* synthetic */ void createDownloadFragment$default(P2P p2p, String str, String str2, Integer num, Long l7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            l7 = null;
        }
        p2p.createDownloadFragment(str, str2, num, l7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFragmentFinished$lambda$0(Function3 function3, P2P p2p, LiveFragment liveFragment, LiveFragment liveFragment2) {
        if (liveFragment2 == null || liveFragment2.getFragStat() != FragmentDataStat.END_SUCCESS) {
            function3.invoke(FragmentFinishedStat.ERROR, (Object) null, liveFragment.getFragEndErrorMsg());
        } else {
            function3.invoke(FragmentFinishedStat.DONE, liveFragment2.getFragmentData(), (Object) null);
            p2p.p2pContext.getP2pDataCollection().addLastestFragmentDataCollection(liveFragment);
            SliceIdController sliceIdController = p2p.p2pContext.getSliceIdController();
            if (sliceIdController != null) {
                sliceIdController.addFragmentFetchData(liveFragment);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void startDownloadFragment$default(P2P p2p, String str, String str2, Integer num, Long l7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            l7 = null;
        }
        p2p.startDownloadFragment(str, str2, num, l7);
    }

    public final void createDownloadFragment(@NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable Long l7) {
        if (this.p2pContext.getFragMan().getFragment(str) != null) {
            this.p2pContext.getFragMan().deleteFragment(str);
        }
        this.p2pContext.getP2pDataCollection().setNewestFragName(str);
        this.p2pContext.getDataFetch().addDownloadTask(str, num != null ? num.intValue() : 0, l7);
    }

    public final void destroy() {
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> P2P destroy "), null, 4, null);
        P2PLogger.logI$default(this.logger, TAG, "--destroy--", null, 4, null);
        this.p2pContext.destroy();
        this.context = null;
    }

    @NotNull
    public final P2PContext getP2pContext() {
        return this.p2pContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initPeers(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.P2P.initPeers(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void onFragmentFinished(@NotNull String str, @NotNull final Function3<? super FragmentFinishedStat, ? super byte[], ? super String, Unit> function3) {
        final LiveFragment fragment = this.p2pContext.getFragMan().getFragment(str);
        if (fragment == null) {
            function3.invoke(FragmentFinishedStat.NOTFOUND, (Object) null, (Object) null);
        } else {
            fragment.onFinished(new Function1(function3, this, fragment) { // from class: com.bilibili.sistersplayer.p2p.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function3 f104930a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final P2P f104931b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final LiveFragment f104932c;

                {
                    this.f104930a = function3;
                    this.f104931b = this;
                    this.f104932c = fragment;
                }

                public final Object invoke(Object obj) {
                    return P2P.onFragmentFinished$lambda$0(this.f104930a, this.f104931b, this.f104932c, (LiveFragment) obj);
                }
            });
        }
    }

    public final void setP2pContext(@NotNull P2PContext p2PContext) {
        this.p2pContext = p2PContext;
    }

    public final void startDownloadFragment(@NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable Long l7) {
        this.p2pContext.getDataFetch().startDownload(this.p2pContext.getRtcManager(), str2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object stopDownloadFragment(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.sistersplayer.p2p.P2P.C64721
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.sistersplayer.p2p.P2P$stopDownloadFragment$1 r0 = (com.bilibili.sistersplayer.p2p.P2P.C64721) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.sistersplayer.p2p.P2P$stopDownloadFragment$1 r0 = new com.bilibili.sistersplayer.p2p.P2P$stopDownloadFragment$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6f
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L65
            r0 = r7
            java.lang.Object r0 = r0.L$1
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r7
            java.lang.Object r0 = r0.L$0
            com.bilibili.sistersplayer.p2p.P2P r0 = (com.bilibili.sistersplayer.p2p.P2P) r0
            r6 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto La2
        L65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6f:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.sistersplayer.p2p.P2PContext r0 = r0.p2pContext
            com.bilibili.sistersplayer.p2p.FragmentDownloader r0 = r0.getDataFetch()
            r10 = r0
            r0 = r7
            r1 = r5
            r0.L$0 = r1
            r0 = r7
            r1 = r6
            r0.L$1 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.stopDownload(r1, r2)
            r1 = r9
            if (r0 != r1) goto L9b
            r0 = r9
            return r0
        L9b:
            r0 = r5
            r7 = r0
            r0 = r6
            r9 = r0
            r0 = r7
            r6 = r0
        La2:
            r0 = r6
            com.bilibili.sistersplayer.p2p.P2PContext r0 = r0.p2pContext
            com.bilibili.sistersplayer.p2p.fragment.LiveFragmentSet r0 = r0.getFragMan()
            r1 = r9
            r0.deleteFragmentUntil(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.P2P.stopDownloadFragment(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
