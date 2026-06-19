package com.bilibili.sistersplayer.p2p;

import I60.A;
import I60.y;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import androidx.appcompat.widget.C3259x;
import androidx.compose.animation.ContentTransform;
import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.D;
import androidx.fragment.app.z;
import com.alibaba.fastjson.JSON;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import com.bilibili.sistersplayer.hls.DNSCache;
import com.bilibili.sistersplayer.hls.ErrorMsg;
import com.bilibili.sistersplayer.hls.FetchErrorCode;
import com.bilibili.sistersplayer.hls.FetchResult;
import com.bilibili.sistersplayer.hls.Fetcher;
import com.bilibili.sistersplayer.hls.HLSMasterCode;
import com.bilibili.sistersplayer.hls.Hls7Player;
import com.bilibili.sistersplayer.hls.PlaylistItem;
import com.bilibili.sistersplayer.hls.StreamQueue;
import com.bilibili.sistersplayer.hls.model.HLSStreamInf;
import com.bilibili.sistersplayer.httpserver.LiveMiniServer;
import com.bilibili.sistersplayer.p2p.SistersPlayerLoader;
import com.bilibili.sistersplayer.p2p.fragment.DataSourceType;
import com.bilibili.sistersplayer.p2p.fragment.FragmentFinishedStat;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.peer.PeerRole;
import com.bilibili.sistersplayer.p2p.utils.P2PIO;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.bilibili.sistersplayer.p2p.utils.UrlUtils;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kntr.base.imageloader.ImageState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.khome.widget.topbar.r0;
import u1.C8707a;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader.class */
public final class SistersPlayerLoader {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "SistersPlayerLoader";
    private boolean canP2PUpload;

    @NotNull
    private AtomicBoolean canStartP2PTask;

    @Nullable
    private Context context;

    @NotNull
    private String currentCDNIP;
    private boolean enableReTryBackUrl;

    @NotNull
    private final Fetcher fetcher;
    private boolean firstHLSSuccess;

    @NotNull
    private final Function0<Long> getPlayerBufferDuration;

    @NotNull
    private final Hls7Player hls7Player;

    @NotNull
    private final Function0<Unit> hls7PlayerMinBufferLengthUpdate;

    @Nullable
    private IContentProvider iContentProvider;

    @NotNull
    private final P2PIO iOCoroutineContext;

    @NotNull
    private final CoroutineScope ioCoroutineScope;

    @NotNull
    private volatile AtomicBoolean isDestroyed;
    private boolean isUsedP2P;

    @Nullable
    private volatile PlaylistItem keyFrameFragment;

    @Nullable
    private String localAddress;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final Function2<PlaylistItem, Long, Unit> m4sFetchAsStream;

    @NotNull
    private final AtomicLong minPlayerBuffer;

    @Nullable
    private LiveMiniServer miniServer;
    private int miniServerPort;

    @NotNull
    private final Function1<ErrorMsg, Boolean> notifyError;

    @Nullable
    private Function1<? super String, Unit> notifyProxyUrl;

    @Nullable
    private IEvent onEvent;

    @NotNull
    private final Function1<byte[], Unit> onWriteBuffer;
    private boolean onlyAudio;

    @NotNull
    private String originQueryParams;

    @NotNull
    private P2P p2p;

    @NotNull
    private final P2PConfig p2pConfig;

    @NotNull
    private P2PContext p2pContext;

    @NotNull
    private String platform;

    @NotNull
    private final Function1<PlaylistItem, Unit> playListUpdate;

    @NotNull
    private final ConcurrentHashMap<String, Boolean> preloadStreamFetchList;

    @NotNull
    private String proxyQueryParams;

    @NotNull
    private String realUrl;

    @NotNull
    private List<Integer> retryErrorCodes;
    private long roomId;

    @Nullable
    private ILiveSourceListener sourceListener;
    private long streamFetchDurationMs;

    @NotNull
    private final Mutex streamFetchMutex;

    @NotNull
    private String streamName;

    @Nullable
    private Long switchEndP2pBufferLength;

    @NotNull
    private String trackerQueryParams;

    @NotNull
    private final UrlUtils urlUtils;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$IContentProvider.class */
    public interface IContentProvider {
        long cacheDuration();

        @Nullable
        HLSStreamInf currentStream();

        @Nullable
        Boolean currentStreamIsTop();

        @Nullable
        String getBandwidthUrl();

        long getDownloadByte();

        @Nullable
        Function3<String, Long, PlaylistItem, Unit> getFetchListener();

        long getMinCacheDuration();

        @Nullable
        HLSStreamInf nextUpStream();

        void setBufferListener(@NotNull Function1<? super Boolean, Unit> function1);

        void setFetchListener(@NotNull Function3<? super String, ? super Long, ? super PlaylistItem, Unit> function3);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$IEvent.class */
    public interface IEvent {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$IEvent$EventType.class */
        public static final class EventType {
            private static final EnumEntries $ENTRIES;
            private static final EventType[] $VALUES;
            private final int value;
            public static final EventType FirstCDNConnect = new EventType("FirstCDNConnect", 0, 0);
            public static final EventType FirstCDNConnectLoss = new EventType("FirstCDNConnectLoss", 1, 1);
            public static final EventType HTTP_ERROR = new EventType("HTTP_ERROR", 2, 2);
            public static final EventType ProxyServerReady = new EventType("ProxyServerReady", 3, 3);
            public static final EventType PeersInit = new EventType("PeersInit", 4, 4);
            public static final EventType PeersRelease = new EventType("PeersRelease", 5, 5);
            public static final EventType ProxyServerRelease = new EventType("ProxyServerRelease", 6, 6);
            public static final EventType SistersRelease = new EventType("SistersRelease", 7, 7);
            public static final EventType SWITCH_BACKUP_BEGIN = new EventType("SWITCH_BACKUP_BEGIN", 8, 8);
            public static final EventType SWITCH_BACKUP_SUCCESS = new EventType("SWITCH_BACKUP_SUCCESS", 9, 9);
            public static final EventType SWITCH_BACKUP_FAIL = new EventType("SWITCH_BACKUP_FAIL", 10, 10);

            private static final /* synthetic */ EventType[] $values() {
                return new EventType[]{FirstCDNConnect, FirstCDNConnectLoss, HTTP_ERROR, ProxyServerReady, PeersInit, PeersRelease, ProxyServerRelease, SistersRelease, SWITCH_BACKUP_BEGIN, SWITCH_BACKUP_SUCCESS, SWITCH_BACKUP_FAIL};
            }

            static {
                EventType[] eventTypeArr$values = $values();
                $VALUES = eventTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(eventTypeArr$values);
            }

            private EventType(String str, int i7, int i8) {
                this.value = i8;
            }

            @NotNull
            public static EnumEntries<EventType> getEntries() {
                return $ENTRIES;
            }

            public static EventType valueOf(String str) {
                return (EventType) Enum.valueOf(EventType.class, str);
            }

            public static EventType[] values() {
                return (EventType[]) $VALUES.clone();
            }

            public final int getValue() {
                return this.value;
            }
        }

        void onEvent(long j7, @NotNull EventType eventType, @NotNull Map<String, String> map);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$ILiveSourceListener.class */
    public interface ILiveSourceListener {
        void onError(int i7, @NotNull String str, @NotNull String str2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$ReleaseFrom.class */
    public static final class ReleaseFrom {
        private static final EnumEntries $ENTRIES;
        private static final ReleaseFrom[] $VALUES;
        public static final ReleaseFrom BIZ = new ReleaseFrom("BIZ", 0);
        public static final ReleaseFrom ON_ERROR = new ReleaseFrom("ON_ERROR", 1);
        public static final ReleaseFrom SET_URL = new ReleaseFrom("SET_URL", 2);

        private static final /* synthetic */ ReleaseFrom[] $values() {
            return new ReleaseFrom[]{BIZ, ON_ERROR, SET_URL};
        }

        static {
            ReleaseFrom[] releaseFromArr$values = $values();
            $VALUES = releaseFromArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(releaseFromArr$values);
        }

        private ReleaseFrom(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ReleaseFrom> getEntries() {
            return $ENTRIES;
        }

        public static ReleaseFrom valueOf(String str) {
            return (ReleaseFrom) Enum.valueOf(ReleaseFrom.class, str);
        }

        public static ReleaseFrom[] values() {
            return (ReleaseFrom[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FragmentFinishedStat.values().length];
            try {
                iArr[FragmentFinishedStat.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FragmentFinishedStat.NOTFOUND.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[FragmentFinishedStat.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$cdnM4sFetch$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$cdnM4sFetch$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        Object result;
        final SistersPlayerLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SistersPlayerLoader sistersPlayerLoader, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = sistersPlayerLoader;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.cdnM4sFetch(null, 0L, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$cdnM4sFetch$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$cdnM4sFetch$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $fetchBegin;
        final String $fragName;
        final Buffer $mergedResultData;
        final String $url;
        int label;
        final SistersPlayerLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SistersPlayerLoader sistersPlayerLoader, String str, long j7, String str2, Buffer buffer, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = sistersPlayerLoader;
            this.$fragName = str;
            this.$fetchBegin = j7;
            this.$url = str2;
            this.$mergedResultData = buffer;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$fragName, this.$fetchBegin, this.$url, this.$mergedResultData, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LiveFragment fragment = this.this$0.p2pContext.getFragMan().getFragment(this.$fragName);
            if (fragment != null) {
                fragment.doOnceQueryServer();
                long jUptimeMillis = SystemClock.uptimeMillis() - this.$fetchBegin;
                if (jUptimeMillis >= 1000) {
                    P2PLogger.logI$default(this.this$0.getLogger(), P2P.FETCH, androidx.compose.ui.input.pointer.k.b(jUptimeMillis, "fetch slow, used ", " ms, ", this.$url), null, 4, null);
                }
                LiveFragment.setFragmentData$default(fragment, this.$mergedResultData.readByteArray(), null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$cdnM4sFetch$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$cdnM4sFetch$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $fragName;
        final FetchResult<byte[]> $result;
        final String $url;
        int label;
        final SistersPlayerLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SistersPlayerLoader sistersPlayerLoader, String str, String str2, FetchResult<byte[]> fetchResult, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = sistersPlayerLoader;
            this.$fragName = str;
            this.$url = str2;
            this.$result = fetchResult;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$fragName, this.$url, this.$result, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LiveFragment fragment = this.this$0.p2pContext.getFragMan().getFragment(this.$fragName);
            P2PLogger.logW$default(this.this$0.getLogger(), FragmentDownloader.TAG, C4496a.a("[LiveP2PProblem][segment_error=cdn_failed] download fragment from cdn failed, ", this.$url), null, 4, null);
            if (fragment != null) {
                fragment.setFragmentData(null, new ErrorMsg(FetchErrorCode.ERROR_NETWORK_FETCH.getEc(), this.$url, this.$result.getMsg(), null, 8, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$connectTracker$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$connectTracker$1.class */
    public static final class C64881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $rspParams;
        final List<String> $trackerServers;
        int label;
        final SistersPlayerLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64881(List<String> list, SistersPlayerLoader sistersPlayerLoader, String str, Continuation<? super C64881> continuation) {
            super(2, continuation);
            this.$trackerServers = list;
            this.this$0 = sistersPlayerLoader;
            this.$rspParams = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64881(this.$trackerServers, this.this$0, this.$rspParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("trackerServers", this.$trackerServers);
                P2PContext p2PContext = this.this$0.p2pContext;
                String jSONString = JSON.toJSONString(linkedHashMap);
                this.label = 1;
                if (p2PContext.setConfiguration(jSONString, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SistersPlayerLoader sistersPlayerLoader = this.this$0;
                    IEvent.EventType eventType = IEvent.EventType.PeersInit;
                    HashMap map = new HashMap();
                    List<String> list = this.$trackerServers;
                    SistersPlayerLoader sistersPlayerLoader2 = this.this$0;
                    map.put("trackerServers", list);
                    map.put("params", sistersPlayerLoader2.trackerQueryParams);
                    Unit unit = Unit.INSTANCE;
                    sistersPlayerLoader.innerEvent(eventType, map);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = this.$rspParams;
            if (str != null && str.length() != 0) {
                P2PLogger.logI$default(this.this$0.getLogger(), SistersPlayerLoader.TAG, z.a("connectTracker old ", this.this$0.trackerQueryParams, " new ", this.$rspParams), null, 4, null);
                if (StringsKt.Z(this.$rspParams, "?")) {
                    this.this$0.trackerQueryParams = this.$rspParams.substring(1);
                }
            }
            P2P p2p = this.this$0.p2p;
            String str2 = this.this$0.trackerQueryParams;
            this.label = 2;
            if (p2p.initPeers(str2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            SistersPlayerLoader sistersPlayerLoader3 = this.this$0;
            IEvent.EventType eventType2 = IEvent.EventType.PeersInit;
            HashMap map2 = new HashMap();
            List<String> list2 = this.$trackerServers;
            SistersPlayerLoader sistersPlayerLoader22 = this.this$0;
            map2.put("trackerServers", list2);
            map2.put("params", sistersPlayerLoader22.trackerQueryParams);
            Unit unit2 = Unit.INSTANCE;
            sistersPlayerLoader3.innerEvent(eventType2, map2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$release$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$release$2.class */
    public static final class C64892 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final SistersPlayerLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64892(SistersPlayerLoader sistersPlayerLoader, Continuation<? super C64892> continuation) {
            super(2, continuation);
            this.this$0 = sistersPlayerLoader;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C64892 c64892 = new C64892(this.this$0, continuation);
            c64892.L$0 = obj;
            return c64892;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    long delayCloseProxy = this.this$0.p2pConfig.getDelayCloseProxy();
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(delayCloseProxy, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope;
                } catch (Exception e7) {
                    e = e7;
                    P2PLogger logger = this.this$0.getLogger();
                    StringBuilder sbB = O4.c.b(coroutineScope.hashCode(), this.this$0.roomId, " ", "-");
                    sbB.append(" miniServer stop error");
                    logger.logE(SistersPlayerLoader.TAG, sbB.toString(), e);
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                coroutineScope = coroutineScope3;
                try {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope2 = coroutineScope3;
                } catch (Exception e8) {
                    e = e8;
                    P2PLogger logger2 = this.this$0.getLogger();
                    StringBuilder sbB2 = O4.c.b(coroutineScope.hashCode(), this.this$0.roomId, " ", "-");
                    sbB2.append(" miniServer stop error");
                    logger2.logE(SistersPlayerLoader.TAG, sbB2.toString(), e);
                }
            }
            LiveMiniServer liveMiniServer = this.this$0.miniServer;
            if (liveMiniServer != null) {
                liveMiniServer.stop();
            }
            P2PLogger logger3 = this.this$0.getLogger();
            long j7 = this.this$0.roomId;
            int iHashCode = coroutineScope2.hashCode();
            StringBuilder sb = new StringBuilder(" ");
            sb.append(j7);
            sb.append("-");
            sb.append(iHashCode);
            sb.append(" miniServer stop by delay success");
            coroutineScope = coroutineScope2;
            P2PLogger.logI$default(logger3, SistersPlayerLoader.TAG, sb.toString(), null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$requestSegment$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$requestSegment$1.class */
    public static final class C64901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function4<Boolean, byte[], Integer, String, Unit> $callback;
        final String $fileName;
        final int $fileSize;
        final String $fileUrl;
        final long $p2pMaxTimeMs;
        final long $trustedCrc;
        int label;
        final SistersPlayerLoader this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$requestSegment$1$WhenMappings */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$requestSegment$1$WhenMappings.class */
        public final /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FragmentFinishedStat.values().length];
                try {
                    iArr[FragmentFinishedStat.DONE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[FragmentFinishedStat.NOTFOUND.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[FragmentFinishedStat.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C64901(SistersPlayerLoader sistersPlayerLoader, String str, String str2, int i7, long j7, Function4<? super Boolean, ? super byte[], ? super Integer, ? super String, Unit> function4, long j8, Continuation<? super C64901> continuation) {
            super(2, continuation);
            this.this$0 = sistersPlayerLoader;
            this.$fileName = str;
            this.$fileUrl = str2;
            this.$fileSize = i7;
            this.$trustedCrc = j7;
            this.$callback = function4;
            this.$p2pMaxTimeMs = j8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final Unit invokeSuspend$lambda$0(Function4<? super Boolean, ? super byte[], ? super Integer, ? super String, Unit> function4, LiveFragment liveFragment, FragmentFinishedStat fragmentFinishedStat, byte[] bArr, String str) throws NoWhenBranchMatchedException {
            int i7 = WhenMappings.$EnumSwitchMapping$0[fragmentFinishedStat.ordinal()];
            if (i7 == 1) {
                Boolean bool = Boolean.TRUE;
                Integer num = null;
                if (liveFragment != null) {
                    List<Integer> statArray = liveFragment.getStatArray();
                    num = null;
                    if (statArray != null) {
                        num = statArray.get(DataSourceType.SERVER.ordinal());
                    }
                }
                function4.invoke(bool, bArr, num, "segment is ok");
            } else if (i7 == 2) {
                function4.invoke(Boolean.FALSE, (Object) null, (Object) null, "segment is not_found");
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                function4.invoke(Boolean.FALSE, (Object) null, (Object) null, C4496a.a("segment is error. ", liveFragment != null ? liveFragment.getFragEndErrorMsg() : null));
            }
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64901(this.this$0, this.$fileName, this.$fileUrl, this.$fileSize, this.$trustedCrc, this.$callback, this.$p2pMaxTimeMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.p2p.createDownloadFragment(this.$fileName, this.$fileUrl, Boxing.boxInt(this.$fileSize), Boxing.boxLong(this.$trustedCrc));
                final LiveFragment fragment = this.this$0.p2pContext.getFragMan().getFragment(this.$fileName);
                if (fragment == null) {
                    this.$callback.invoke(Boxing.boxBoolean(false), (Object) null, (Object) null, "segment is null");
                }
                if (fragment != null) {
                    fragment.setRequestDownloadToSeedbox(false);
                }
                this.this$0.p2p.startDownloadFragment(this.$fileName, this.$fileUrl, Boxing.boxInt(this.$fileSize), Boxing.boxLong(this.$trustedCrc));
                P2P p2p = this.this$0.p2p;
                String str = this.$fileName;
                final Function4<Boolean, byte[], Integer, String, Unit> function4 = this.$callback;
                p2p.onFragmentFinished(str, new Function3(function4, fragment) { // from class: com.bilibili.sistersplayer.p2p.n

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function4 f104947a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final LiveFragment f104948b;

                    {
                        this.f104947a = function4;
                        this.f104948b = fragment;
                    }

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return SistersPlayerLoader.C64901.invokeSuspend$lambda$0(this.f104947a, this.f104948b, (FragmentFinishedStat) obj2, (byte[]) obj3, (String) obj4);
                    }
                });
                long j7 = this.$p2pMaxTimeMs;
                this.label = 1;
                if (DelayKt.delay(j7, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            P2P p2p2 = this.this$0.p2p;
            String str2 = this.$fileName;
            this.label = 2;
            if (p2p2.stopDownloadFragment(str2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$shareSegment$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$shareSegment$1.class */
    public static final class C64911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function2<Boolean, String, Unit> $callback;
        final byte[] $content;
        final String $fileName;
        final long $trustedCrc;
        int label;
        final SistersPlayerLoader this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$shareSegment$1$WhenMappings */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$shareSegment$1$WhenMappings.class */
        public final /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FragmentFinishedStat.values().length];
                try {
                    iArr[FragmentFinishedStat.DONE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[FragmentFinishedStat.NOTFOUND.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[FragmentFinishedStat.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C64911(SistersPlayerLoader sistersPlayerLoader, String str, long j7, Function2<? super Boolean, ? super String, Unit> function2, byte[] bArr, Continuation<? super C64911> continuation) {
            super(2, continuation);
            this.this$0 = sistersPlayerLoader;
            this.$fileName = str;
            this.$trustedCrc = j7;
            this.$callback = function2;
            this.$content = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Function2 function2) {
            function2.invoke(Boolean.FALSE, "crc32 is error");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final Unit invokeSuspend$lambda$1(Function2<? super Boolean, ? super String, Unit> function2, FragmentFinishedStat fragmentFinishedStat, byte[] bArr, String str) throws NoWhenBranchMatchedException {
            int i7 = WhenMappings.$EnumSwitchMapping$0[fragmentFinishedStat.ordinal()];
            if (i7 == 1) {
                function2.invoke(Boolean.TRUE, "segment is ok");
            } else if (i7 == 2) {
                function2.invoke(Boolean.FALSE, "segment is not_found");
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                function2.invoke(Boolean.FALSE, "segment is error");
            }
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64911(this.this$0, this.$fileName, this.$trustedCrc, this.$callback, this.$content, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.p2p.createDownloadFragment(this.$fileName, "", Boxing.boxInt(0), Boxing.boxLong(this.$trustedCrc));
            LiveFragment fragment = this.this$0.p2pContext.getFragMan().getFragment(this.$fileName);
            if (fragment == null) {
                this.$callback.invoke(Boxing.boxBoolean(false), "segment is null");
            }
            if (fragment != null) {
                final Function2<Boolean, String, Unit> function2 = this.$callback;
                fragment.setCrcErrorCallback(new Function0(function2) { // from class: com.bilibili.sistersplayer.p2p.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function2 f104949a;

                    {
                        this.f104949a = function2;
                    }

                    public final Object invoke() {
                        return SistersPlayerLoader.C64911.invokeSuspend$lambda$0(this.f104949a);
                    }
                });
            }
            if (fragment != null) {
                LiveFragment.setFragmentData$default(fragment, this.$content, null, 2, null);
            }
            P2P p2p = this.this$0.p2p;
            String str = this.$fileName;
            final Function2<Boolean, String, Unit> function22 = this.$callback;
            p2p.onFragmentFinished(str, new Function3(function22) { // from class: com.bilibili.sistersplayer.p2p.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function2 f104950a;

                {
                    this.f104950a = function22;
                }

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return SistersPlayerLoader.C64911.invokeSuspend$lambda$1(this.f104950a, (FragmentFinishedStat) obj2, (byte[]) obj3, (String) obj4);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$startP2PDownloadFragment$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$startP2PDownloadFragment$1.class */
    public static final class C64921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Long $crc;
        final PlaylistItem $entry;
        final Integer $size;
        final String $uri;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final SistersPlayerLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64921(SistersPlayerLoader sistersPlayerLoader, String str, PlaylistItem playlistItem, Integer num, Long l7, Continuation<? super C64921> continuation) {
            super(2, continuation);
            this.this$0 = sistersPlayerLoader;
            this.$uri = str;
            this.$entry = playlistItem;
            this.$size = num;
            this.$crc = l7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64921(this.this$0, this.$uri, this.$entry, this.$size, this.$crc, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            SistersPlayerLoader sistersPlayerLoader;
            String str;
            PlaylistItem playlistItem;
            Integer num;
            Long l7;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.p2p.createDownloadFragment(this.$uri, this.$entry.getUri(), this.$size, this.$crc);
                    if (this.this$0.canStartP2PTask.get()) {
                        this.this$0.p2p.startDownloadFragment(this.$uri, this.$entry.getUri(), this.$size, this.$crc);
                    } else if (!this.this$0.preloadStreamFetchList.containsKey(this.$entry.getUri())) {
                        P2PLogger.logW$default(this.this$0.getLogger(), SistersPlayerLoader.TAG, C4496a.a("lock with ", this.$entry.getName()), null, 4, null);
                        mutex = this.this$0.streamFetchMutex;
                        sistersPlayerLoader = this.this$0;
                        str = this.$uri;
                        playlistItem = this.$entry;
                        num = this.$size;
                        l7 = this.$crc;
                        this.L$0 = mutex;
                        this.L$1 = sistersPlayerLoader;
                        this.L$2 = str;
                        this.L$3 = playlistItem;
                        this.L$4 = num;
                        this.L$5 = l7;
                        this.label = 1;
                        if (mutex.lock((Object) null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l7 = (Long) this.L$5;
                num = (Integer) this.L$4;
                playlistItem = (PlaylistItem) this.L$3;
                str = (String) this.L$2;
                sistersPlayerLoader = (SistersPlayerLoader) this.L$1;
                Mutex mutex2 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex2;
                sistersPlayerLoader.p2p.startDownloadFragment(str, playlistItem.getUri(), num, l7);
                Unit unit = Unit.INSTANCE;
                mutex.unlock((Object) null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock((Object) null);
                throw th;
            }
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public SistersPlayerLoader(@Nullable Context context, boolean z6, @NotNull Fetcher fetcher, @NotNull P2PConfig p2PConfig, @NotNull P2PLogger p2PLogger) {
        this.context = context;
        this.isUsedP2P = z6;
        this.fetcher = fetcher;
        this.p2pConfig = p2PConfig;
        this.logger = p2PLogger;
        this.urlUtils = new UrlUtils(p2PLogger);
        P2PIO p2pio = new P2PIO(p2PConfig.getInternalIOThread());
        this.iOCoroutineContext = p2pio;
        P2P p2p = new P2P(this.context, p2pio.getIOContext(), fetcher, p2PConfig, p2PLogger);
        this.p2p = p2p;
        this.p2pContext = p2p.getP2pContext();
        this.currentCDNIP = "";
        this.isDestroyed = new AtomicBoolean(false);
        this.minPlayerBuffer = new AtomicLong(0L);
        LD.g gVar = new LD.g(this, 4);
        this.onWriteBuffer = gVar;
        this.hls7Player = new Hls7Player(this.context, this.p2pContext.getIOCoroutineContext(), fetcher, gVar, p2PConfig, p2PLogger);
        this.ioCoroutineScope = CoroutineScopeKt.CoroutineScope(this.p2pContext.getIOCoroutineContext());
        this.preloadStreamFetchList = new ConcurrentHashMap<>();
        this.canStartP2PTask = new AtomicBoolean(false);
        this.streamFetchMutex = MutexKt.Mutex(true);
        this.retryErrorCodes = new ArrayList();
        this.realUrl = "";
        this.streamName = "";
        this.platform = Constant.SDK_OS;
        this.originQueryParams = "";
        this.proxyQueryParams = "";
        this.trackerQueryParams = "";
        this.getPlayerBufferDuration = new A(this, 7);
        try {
            for (String str : StringsKt.R(p2PConfig.getDebug().getLogTags(), new String[]{","}, 0, 6)) {
                if (str.length() > 0) {
                    PLog.INSTANCE.getDynamicTags().put(str, Boolean.TRUE);
                }
            }
        } catch (Exception e7) {
        }
        this.hls7Player.setGetPlayerBufferDuration(this.getPlayerBufferDuration);
        this.p2pContext.getDataFetch().setGetPlayerBufferDuration(this.getPlayerBufferDuration);
        this.hls7PlayerMinBufferLengthUpdate = new ZV.i(this, 5);
        com.bilibili.biligame.ui.comment.add.b bVar = new com.bilibili.biligame.ui.comment.add.b(this, 2);
        this.playListUpdate = bVar;
        Function2<PlaylistItem, Long, Unit> function2 = new Function2(this) { // from class: com.bilibili.sistersplayer.p2p.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SistersPlayerLoader f104937a;

            {
                this.f104937a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                long jLongValue = ((Long) obj2).longValue();
                return SistersPlayerLoader.m4sFetchAsStream$lambda$6(this.f104937a, (PlaylistItem) obj, jLongValue);
            }
        };
        this.m4sFetchAsStream = function2;
        final int i7 = 0;
        this.notifyError = new Function1(this, i7) { // from class: com.bilibili.sistersplayer.p2p.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f104938a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f104939b;

            {
                this.f104938a = i7;
                this.f104939b = this;
            }

            public final Object invoke(Object obj) {
                switch (this.f104938a) {
                    case 0:
                        return Boolean.valueOf(SistersPlayerLoader.notifyError$lambda$12((SistersPlayerLoader) this.f104939b, (ErrorMsg) obj));
                    case 1:
                        return (ContentTransform) this.f104939b;
                    default:
                        if (((ImageState) obj) instanceof ImageState.Error) {
                            r0 r0Var = (r0) this.f104939b;
                            r0Var.d.setValue(Boolean.TRUE);
                            r0Var.c.setValue(Boolean.FALSE);
                        }
                        return Unit.INSTANCE;
                }
            }
        };
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> SistersPlayerLoader init "), null, 4, null);
        this.hls7Player.setHls7Method(bVar, function2);
        initP2PContext();
        this.fetcher.setMaxHistorySize(this.p2pConfig.getFetcherMaxHistorySize());
    }

    public /* synthetic */ SistersPlayerLoader(Context context, boolean z6, Fetcher fetcher, P2PConfig p2PConfig, P2PLogger p2PLogger, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : context, (i7 & 2) != 0 ? true : z6, fetcher, p2PConfig, p2PLogger);
    }

    public static final /* synthetic */ Hls7Player access$getHls7Player$p(SistersPlayerLoader sistersPlayerLoader) {
        return sistersPlayerLoader.hls7Player;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRetry() {
        return ((Number) this.getPlayerBufferDuration.invoke()).longValue() > this.p2pConfig.getFetchTimeOut().getRetryBufferThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final java.lang.Object cdnM4sFetch(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX INFO: Access modifiers changed from: private */
    public final Function3<FragmentFinishedStat, byte[], String, Unit> fragmentFinished(final PlaylistItem playlistItem, final long j7, final String str) {
        return new Function3(this, playlistItem, j7, str) { // from class: com.bilibili.sistersplayer.p2p.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SistersPlayerLoader f104942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PlaylistItem f104943b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f104944c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f104945d;

            {
                this.f104942a = this;
                this.f104943b = playlistItem;
                this.f104944c = j7;
                this.f104945d = str;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                long j8 = this.f104944c;
                String str2 = this.f104945d;
                return SistersPlayerLoader.fragmentFinished$lambda$9(this.f104942a, this.f104943b, j8, str2, (FragmentFinishedStat) obj, (byte[]) obj2, (String) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit fragmentFinished$lambda$9(SistersPlayerLoader sistersPlayerLoader, PlaylistItem playlistItem, long j7, String str, FragmentFinishedStat fragmentFinishedStat, byte[] bArr, String str2) throws NoWhenBranchMatchedException {
        int i7 = WhenMappings.$EnumSwitchMapping$0[fragmentFinishedStat.ordinal()];
        if (i7 == 1) {
            sistersPlayerLoader.hls7Player.onM4sFetched(playlistItem, j7, new FetchResult<>(true, "ok", 200, bArr, null, false, null, 112, null), "fragmentFinished DONE");
            Unit unit = Unit.INSTANCE;
        } else if (i7 == 2) {
            BuildersKt.launch$default(sistersPlayerLoader.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SistersPlayerLoader$fragmentFinished$1$1(sistersPlayerLoader, str, playlistItem, j7, null), 3, (Object) null);
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (sistersPlayerLoader.p2pContext.isDestroyed()) {
                return Unit.INSTANCE;
            }
            P2PLogger.logE$default(sistersPlayerLoader.logger, TAG, z.a("[LiveP2PProblem][segment_error=download_failed] has error, but to retry - ", str, " , ", str2), null, 4, null);
            BuildersKt.launch$default(sistersPlayerLoader.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SistersPlayerLoader$fragmentFinished$1$2(sistersPlayerLoader, str, playlistItem, j7, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final String generateTrackerParams(String str) {
        String str2 = this.streamName;
        int i7 = this.p2pContext.getSistersConfiguration().ProtocolVersion;
        long j7 = this.roomId;
        String str3 = this.platform;
        int timeShift = this.p2pContext.getTimeShift();
        int value = (isOnlyAudioStream() ? MediaType.Fmp4Audio : MediaType.Default).getValue();
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "protocol=", "&stream=", str2, "&roomid=");
        G0.d.a(j7, "&platform=", str3, sbB);
        cf.l.a(timeShift, "&timeshift=", "&role=", str, sbB);
        return C8707a.a(value, "&media_type=", sbB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getPlayerBufferDuration$lambda$1(SistersPlayerLoader sistersPlayerLoader) {
        IContentProvider iContentProvider = sistersPlayerLoader.iContentProvider;
        return iContentProvider != null ? iContentProvider.cacheDuration() : 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hls7PlayerMinBufferLengthUpdate$lambda$4(SistersPlayerLoader sistersPlayerLoader) {
        Long p2pBufferLength = sistersPlayerLoader.p2pContext.getP2pBufferLength();
        if (p2pBufferLength != null) {
            sistersPlayerLoader.hls7Player.updateMinBufferLength(p2pBufferLength.longValue());
        }
        return Unit.INSTANCE;
    }

    private final void initP2PContext() {
        P2PContext p2PContext = this.p2pContext;
        p2PContext.setP2pBufferLength(Long.valueOf((long) (p2PContext.getSistersConfiguration().p2pBufferLengthSec * 1000)));
        this.p2pContext.setP2pBufferLengthUpdateListener(this.hls7PlayerMinBufferLengthUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void innerEvent(com.bilibili.sistersplayer.p2p.SistersPlayerLoader.IEvent.EventType r8, java.util.HashMap<java.lang.String, java.lang.Object> r9) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.SistersPlayerLoader.innerEvent(com.bilibili.sistersplayer.p2p.SistersPlayerLoader$IEvent$EventType, java.util.HashMap):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void innerEvent$default(SistersPlayerLoader sistersPlayerLoader, IEvent.EventType eventType, HashMap map, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            map = null;
        }
        sistersPlayerLoader.innerEvent(eventType, map);
    }

    private final Long keepMorePlayBuffer() {
        Long p2pBufferLength = this.p2pContext.getP2pBufferLength();
        long switchKeepBuffer = this.p2pConfig.getHlsMasterConfig().getSwitchKeepBuffer();
        IContentProvider iContentProvider = this.iContentProvider;
        Long lValueOf = iContentProvider != null ? Long.valueOf(iContentProvider.cacheDuration()) : null;
        boolean z6 = false;
        boolean z7 = (lValueOf != null ? lValueOf.longValue() : 0L) >= 500 + switchKeepBuffer;
        if ((p2pBufferLength != null ? p2pBufferLength.longValue() : 1000L) < switchKeepBuffer) {
            z6 = true;
        }
        if (z7 && z6) {
            this.p2pContext.setP2pBufferLength(Long.valueOf(switchKeepBuffer));
            Function0<Unit> p2pBufferLengthUpdateListener = this.p2pContext.getP2pBufferLengthUpdateListener();
            if (p2pBufferLengthUpdateListener != null) {
                p2pBufferLengthUpdateListener.invoke();
            }
        }
        P2PLogger.logI$default(this.logger, TAG, com.bilibili.bplus.im.protobuf.b.b(Mj.b.a("keepMorePlayBuffer ", p2pBufferLength, lValueOf, " ", " "), z7, " ", z6), null, 4, null);
        return p2pBufferLength;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m4sFetchAsStream$lambda$6(SistersPlayerLoader sistersPlayerLoader, PlaylistItem playlistItem, long j7) {
        P2PLogger.logD$default(sistersPlayerLoader.logger, TAG, C4496a.a("m4sFetchAsStream ", playlistItem.getUri()), null, 4, null);
        String domain = sistersPlayerLoader.urlUtils.parseDomain(playlistItem.getUri());
        String str = DNSCache.INSTANCE.getDnsMap().get(domain);
        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, sistersPlayerLoader.currentCDNIP)) {
            P2PLogger p2PLogger = sistersPlayerLoader.logger;
            StringBuilder sbA = G0.b.a("m4sFetchAsStream change ", domain, " CDN IP from ", sistersPlayerLoader.currentCDNIP, " to ");
            sbA.append(str);
            P2PLogger.logI$default(p2PLogger, TAG, sbA.toString(), null, 4, null);
            sistersPlayerLoader.currentCDNIP = str;
            Function1<? super String, Unit> function1 = sistersPlayerLoader.notifyProxyUrl;
            if (function1 != null) {
                function1.invoke(sistersPlayerLoader.getReportProxyUrl());
            }
        }
        if (Intrinsics.areEqual(playlistItem.getAux().getKeyframe(), "K")) {
            sistersPlayerLoader.keyFrameFragment = playlistItem;
        }
        BuildersKt.launch$default(sistersPlayerLoader.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SistersPlayerLoader$m4sFetchAsStream$1$1(playlistItem, sistersPlayerLoader, j7, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean notifyError$lambda$12(SistersPlayerLoader sistersPlayerLoader, ErrorMsg errorMsg) {
        P2PLogger.logI$default(sistersPlayerLoader.logger, TAG, "process error,isDestroyed = " + sistersPlayerLoader.isDestroyed + " " + errorMsg, null, 4, null);
        if (sistersPlayerLoader.isDestroyed.get()) {
            return false;
        }
        try {
            ILiveSourceListener iLiveSourceListener = sistersPlayerLoader.sourceListener;
            boolean z6 = (errorMsg.getErrorCode() == FetchErrorCode.ERROR_IO_TIMEOUT.getEc() || errorMsg.getErrorCode() == FetchErrorCode.ERROR_CDN_SOCKET_CLOSED.getEc() || errorMsg.getErrorCode() == FetchErrorCode.ERROR_CDN_SOCKET_ERROR.getEc() || errorMsg.getErrorCode() == FetchErrorCode.ERROR_UNKNOWN_HOST.getEc()) && sistersPlayerLoader.retryErrorCodes.contains(Integer.valueOf(FetchErrorCode.ERROR_CONNECT_FAIL.getEc()));
            boolean z7 = sistersPlayerLoader.enableReTryBackUrl && (z6 || sistersPlayerLoader.retryErrorCodes.contains(Integer.valueOf(errorMsg.getErrorCode())) || CollectionsKt.contains(sistersPlayerLoader.retryErrorCodes, errorMsg.getHttpCode())) && sistersPlayerLoader.hls7Player.hasBackUrl();
            P2PLogger.logI$default(sistersPlayerLoader.logger, TAG, "preTryBack tryBack=" + z7 + " enableReTryBackUrl=" + sistersPlayerLoader.enableReTryBackUrl + " netError=" + z6 + " errorCode=" + errorMsg.getErrorCode() + " httpCode = " + errorMsg.getHttpCode() + " hasBackUrl=" + sistersPlayerLoader.hls7Player.hasBackUrl(), null, 4, null);
            if (z7) {
                sistersPlayerLoader.hls7Player.competitionM3U8(new SistersPlayerLoader$notifyError$1$1(sistersPlayerLoader));
                return true;
            }
            if (!sistersPlayerLoader.firstHLSSuccess) {
                innerEvent$default(sistersPlayerLoader, IEvent.EventType.FirstCDNConnectLoss, null, 2, null);
            }
            Integer httpCode = errorMsg.getHttpCode();
            if ((httpCode != null ? httpCode.intValue() : 0) > 200) {
                IEvent.EventType eventType = IEvent.EventType.HTTP_ERROR;
                HashMap<String, Object> map = new HashMap<>();
                map.put("room_id", Long.valueOf(sistersPlayerLoader.roomId));
                map.put("play_url", sistersPlayerLoader.getUrl());
                map.put("stream_name", sistersPlayerLoader.streamName);
                Integer httpCode2 = errorMsg.getHttpCode();
                map.put("http_code", Integer.valueOf(httpCode2 != null ? httpCode2.intValue() : 0));
                map.put("p2p_code", Integer.valueOf(errorMsg.getErrorCode()));
                map.put("message", errorMsg.getMsg());
                Unit unit = Unit.INSTANCE;
                sistersPlayerLoader.innerEvent(eventType, map);
            }
            if (iLiveSourceListener != null) {
                iLiveSourceListener.onError(errorMsg.getErrorCode(), errorMsg.getMsg(), errorMsg.getUrl());
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (!(stackTrace.length == 0)) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (StringsKt.n(stackTraceElement.getClassName(), "sistersplayer")) {
                        sb.append(stackTraceElement);
                        sb.append("\n");
                    }
                }
                P2PLogger.logI$default(sistersPlayerLoader.logger, TAG, "onError Biz Stack: \n " + ((Object) sb), null, 4, null);
            }
            P2PLogger p2PLogger = sistersPlayerLoader.logger;
            ILiveSourceListener iLiveSourceListener2 = sistersPlayerLoader.sourceListener;
            P2PLogger.logI$default(p2PLogger, TAG, "[LiveP2PProblem]notify error: sourceListener:" + Integer.toHexString(iLiveSourceListener2 != null ? iLiveSourceListener2.hashCode() : 0) + " --- " + errorMsg.getErrorCode() + " " + errorMsg.getMsg(), null, 4, null);
            sistersPlayerLoader.release(errorMsg, ReleaseFrom.ON_ERROR);
            return false;
        } catch (Exception e7) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWriteBuffer$lambda$0(SistersPlayerLoader sistersPlayerLoader, byte[] bArr) {
        AtomicLong atomicLong = sistersPlayerLoader.minPlayerBuffer;
        IContentProvider iContentProvider = sistersPlayerLoader.iContentProvider;
        atomicLong.set(iContentProvider != null ? iContentProvider.cacheDuration() : 0L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2pM4sFetch(PlaylistItem playlistItem, long j7, String str, String str2) {
        IContentProvider iContentProvider = this.iContentProvider;
        long jCacheDuration = (iContentProvider == null || iContentProvider == null) ? 0L : iContentProvider.cacheDuration();
        Ref.LongRef longRef = new Ref.LongRef();
        long j8 = jCacheDuration - ((long) this.p2pContext.getSistersConfiguration().p2pSafeBufferDurationForDelayStopMs);
        longRef.element = j8;
        if (j8 > 0) {
            longRef.element = Math.min(j8, this.p2pContext.getSistersConfiguration().p2pDelayStopMaxMs);
        }
        if (P2PContext.launch$default(this.p2pContext, null, new SistersPlayerLoader$p2pM4sFetch$resultJob$1(this, str2, playlistItem, j7, str, longRef, null), 1, null) == null) {
            this.hls7Player.onM4sFetched(playlistItem, j7, new FetchResult<>(false, "p2pCtx is destroy", -1, null, null, false, null, 120, null), "p2pCtx is destroy");
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=p2p_context] p2pContext is destroy, set future fail", null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playListUpdate$lambda$5(SistersPlayerLoader sistersPlayerLoader, PlaylistItem playlistItem) {
        String streamName = sistersPlayerLoader.urlUtils.parseStreamName(playlistItem.getSrc());
        if (sistersPlayerLoader.p2pConfig.getCheckFragmentStreamName() && !Intrinsics.areEqual(streamName, sistersPlayerLoader.streamName)) {
            P2PLogger.logW$default(sistersPlayerLoader.logger, TAG, z.a("playListUpdate no match Stream ", streamName, " ! = ", sistersPlayerLoader.streamName), null, 4, null);
            return Unit.INSTANCE;
        }
        if (!playlistItem.isInit()) {
            if (sistersPlayerLoader.streamFetchDurationMs < 4000) {
                sistersPlayerLoader.preloadStreamFetchList.put(playlistItem.getUri(), Boolean.FALSE);
            }
            long j7 = sistersPlayerLoader.streamFetchDurationMs;
            Long duration = playlistItem.getDuration();
            sistersPlayerLoader.streamFetchDurationMs = j7 + (duration != null ? duration.longValue() : 0L);
            if (sistersPlayerLoader.isUsedP2P) {
                sistersPlayerLoader.startP2PDownloadFragment(playlistItem);
            }
        }
        return Unit.INSTANCE;
    }

    private final void preloadFull() {
        Iterator<Map.Entry<String, Boolean>> it = this.preloadStreamFetchList.entrySet().iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                z6 = false;
            }
        }
        if (z6) {
            P2PLogger.logE$default(this.logger, TAG, "canStartP2PTask = true, unlock to fetch other", null, 4, null);
            this.canStartP2PTask.set(true);
            Mutex.DefaultImpls.unlock$default(this.streamFetchMutex, (Object) null, 1, (Object) null);
        }
    }

    public static /* synthetic */ void release$default(SistersPlayerLoader sistersPlayerLoader, ErrorMsg errorMsg, ReleaseFrom releaseFrom, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            errorMsg = null;
        }
        if ((i7 & 2) != 0) {
            releaseFrom = ReleaseFrom.BIZ;
        }
        sistersPlayerLoader.release(errorMsg, releaseFrom);
    }

    private final void resetNormalPlayBuffer() {
        Long l7 = this.switchEndP2pBufferLength;
        if (l7 != null) {
            this.p2pContext.setP2pBufferLength(l7);
            Function0<Unit> p2pBufferLengthUpdateListener = this.p2pContext.getP2pBufferLengthUpdateListener();
            if (p2pBufferLengthUpdateListener != null) {
                p2pBufferLengthUpdateListener.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPendingSwitchPlayList$lambda$18(SistersPlayerLoader sistersPlayerLoader, Function4 function4, String str, HLSStreamInf hLSStreamInf, PlaylistItem playlistItem, HLSMasterCode hLSMasterCode) {
        P2PLogger p2PLogger = sistersPlayerLoader.logger;
        StringBuilder sbA = G0.b.a("currentName $", sistersPlayerLoader.urlUtils.parseStreamName(str), "  switch -> ", sistersPlayerLoader.urlUtils.parseStreamName(hLSStreamInf.getUrl()), " ");
        sbA.append(hLSMasterCode);
        sbA.append(ReporterMap.RIGHT_BRACES);
        P2PLogger.logI$default(p2PLogger, TAG, sbA.toString(), null, 4, null);
        sistersPlayerLoader.resetNormalPlayBuffer();
        if (hLSMasterCode == HLSMasterCode.OK) {
            sistersPlayerLoader.setSubUrl(hLSStreamInf.getUrl());
        }
        function4.invoke(str, hLSStreamInf, playlistItem, hLSMasterCode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSwitchBack$lambda$19(SistersPlayerLoader sistersPlayerLoader, Function3 function3, boolean z6, String str, String str2) {
        String reportProxyUrl = sistersPlayerLoader.getReportProxyUrl();
        if (z6 && str2 != null) {
            sistersPlayerLoader.setSubUrl(str2);
        }
        function3.invoke(Boolean.valueOf(z6), reportProxyUrl, sistersPlayerLoader.getReportProxyUrl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUrl$lambda$14(SistersPlayerLoader sistersPlayerLoader, String str, String str2) {
        if (!sistersPlayerLoader.firstHLSSuccess) {
            sistersPlayerLoader.firstHLSSuccess = true;
            innerEvent$default(sistersPlayerLoader, IEvent.EventType.FirstCDNConnect, null, 2, null);
        }
        String domain = sistersPlayerLoader.urlUtils.parseDomain(str2);
        P2PLogger.logI$default(sistersPlayerLoader.logger, TAG, D.a(DNSCache.INSTANCE.getDnsMap().get(domain), "\n", str, G0.b.a("firstM3U8 url: ", str2, "\nhost: ", domain, " dnsIP: ")), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreamQueue setUrl$lambda$15(SistersPlayerLoader sistersPlayerLoader) {
        return sistersPlayerLoader.hls7Player.getOutQueue();
    }

    private final void startP2PDownloadFragment(PlaylistItem playlistItem) {
        int iA = StringsKt.A(playlistItem.getUri(), "?", 0, false, 6);
        int length = iA;
        if (iA < 0) {
            length = playlistItem.getUri().length();
        }
        P2PContext.launch$default(this.p2pContext, null, new C64921(this, playlistItem.getUri().substring(StringsKt.D(playlistItem.getUri(), "/", 0, 6) + 1, length), playlistItem, playlistItem.getAux().getSize() != null ? playlistItem.getAux().getSize() : playlistItem.getTitle().getSize(), playlistItem.getAux().getCrc() != null ? playlistItem.getAux().getCrc() : playlistItem.getTitle().getCrc(), null), 1, null);
    }

    public static /* synthetic */ void switchPlaylist$default(SistersPlayerLoader sistersPlayerLoader, HLSStreamInf hLSStreamInf, boolean z6, boolean z7, boolean z8, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        if ((i7 & 8) != 0) {
            z8 = false;
        }
        sistersPlayerLoader.switchPlaylist(hLSStreamInf, z6, z7, z8);
    }

    public final void addP2PDataCollectionUpdateListener(@NotNull IP2PDataCollectionListener iP2PDataCollectionListener, long j7, boolean z6) {
        this.p2pContext.addP2PDataCollectionUpdateListener(iP2PDataCollectionListener, j7, z6);
    }

    public final void addP2PEventReport(@NotNull IP2PEventReport iP2PEventReport) {
        this.p2pContext.addP2PEventReport(iP2PEventReport);
    }

    public final void cancelSwitchPlaylist() {
        this.hls7Player.cancelSwitchPlaylist();
    }

    public final void connectTracker(@NotNull List<String> list, @Nullable String str) {
        P2PContext.launch$default(this.p2pContext, null, new C64881(list, this, str, null), 1, null);
    }

    public final void destroyP2P() {
        this.p2p.destroy();
    }

    @NotNull
    public final String getCDNIP() {
        try {
            String str = DNSCache.INSTANCE.getDnsMap().get(this.urlUtils.parseDomain(this.realUrl));
            return str != null ? str : "";
        } catch (Exception e7) {
            this.logger.logE(TAG, "getCDNIP error", e7);
            return "";
        }
    }

    @Nullable
    public final PlaylistItem getKeyFrameFragment() {
        return this.keyFrameFragment;
    }

    @NotNull
    public final P2PLogger getLogger() {
        return this.logger;
    }

    public final long getMinPlayerBuffer() {
        return this.minPlayerBuffer.get();
    }

    @NotNull
    public final P2PContext getP2PContext() {
        return this.p2pContext;
    }

    @NotNull
    public final String getProxyUrl() {
        return C3392f.a(this.miniServerPort, "http://127.0.0.1:", this.localAddress);
    }

    @NotNull
    public final String getReportJson() {
        try {
            HashMap map = new HashMap();
            map.put("cdn_ip", getCDNIP());
            return JSON.toJSONString(map);
        } catch (Exception e7) {
            this.logger.logE(TAG, "getReportIJKJson error", e7);
            return "{}";
        }
    }

    @NotNull
    public final String getReportProxyUrl() {
        if (!this.p2pConfig.getProxyUrlAddDns()) {
            return getProxyUrl();
        }
        String domain = this.urlUtils.parseDomain(this.realUrl);
        return getProxyUrl() + "&cdn_ip=" + ((Object) DNSCache.INSTANCE.getDnsMap().get(domain));
    }

    @NotNull
    public final String getStreamName() {
        return this.streamName;
    }

    @NotNull
    public final String getTrackerQueryParams() {
        return this.trackerQueryParams;
    }

    @NotNull
    public final String getUrl() {
        return this.realUrl;
    }

    @NotNull
    public final UrlUtils getUrlUtils() {
        return this.urlUtils;
    }

    public final boolean isOnlyAudioStream() {
        return this.onlyAudio;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void release(@org.jetbrains.annotations.Nullable com.bilibili.sistersplayer.hls.ErrorMsg r9, @org.jetbrains.annotations.NotNull com.bilibili.sistersplayer.p2p.SistersPlayerLoader.ReleaseFrom r10) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.SistersPlayerLoader.release(com.bilibili.sistersplayer.hls.ErrorMsg, com.bilibili.sistersplayer.p2p.SistersPlayerLoader$ReleaseFrom):void");
    }

    public final void reloadP2P() {
        IP2PEventReport p2pEventReportCallback = this.p2pContext.getP2pEventReportCallback();
        List<P2PDataCollectionRefresh> p2pDataListener = this.p2pContext.getP2pDataListener();
        int timeShift = this.p2p.getP2pContext().getTimeShift();
        this.p2p.destroy();
        P2P p2p = new P2P(this.context, this.iOCoroutineContext.getIOContext(), this.fetcher, this.p2pConfig, this.logger);
        this.p2p = p2p;
        P2PContext p2pContext = p2p.getP2pContext();
        this.p2pContext = p2pContext;
        p2pContext.setTimeShift(timeShift);
        if (this.canP2PUpload) {
            this.p2pContext.setPeerRole(PeerRole.PEER);
        } else {
            this.p2pContext.setPeerRole(PeerRole.LEECH);
        }
        for (P2PDataCollectionRefresh p2PDataCollectionRefresh : p2pDataListener) {
            this.p2pContext.addP2PDataCollectionUpdateListener(p2PDataCollectionRefresh.getListener(), p2PDataCollectionRefresh.getCallbackIntervalMs(), p2PDataCollectionRefresh.isClearData());
        }
        if (p2pEventReportCallback != null) {
            this.p2pContext.addP2PEventReport(p2pEventReportCallback);
        }
    }

    public final void requestSegment(@NotNull String str, @NotNull String str2, int i7, long j7, long j8, @NotNull Function4<? super Boolean, ? super byte[], ? super Integer, ? super String, Unit> function4) {
        if (this.p2pContext.isDestroyed()) {
            function4.invoke(Boolean.FALSE, (Object) null, (Object) null, "p2p destroyed.");
        } else {
            P2PContext.launch$default(this.p2pContext, null, new C64901(this, str, str2, i7, j7, function4, j8, null), 1, null);
        }
    }

    public final void setBackUrls(@NotNull List<String> list) {
        this.hls7Player.setBackUrls(list);
    }

    public final void setCanP2PUpload(boolean z6) {
        P2PLogger.logI$default(this.logger, TAG, com.bilibili.app.comm.bh.x5.b.a("setCanP2PUpload ", this.canP2PUpload), null, 4, null);
        this.canP2PUpload = z6;
    }

    public final void setContentProvider(@NotNull IContentProvider iContentProvider) {
        this.iContentProvider = iContentProvider;
        this.hls7Player.setOnFileFetched(iContentProvider.getFetchListener());
    }

    public final void setEnableReTryBackUrl(boolean z6) {
        this.enableReTryBackUrl = z6;
    }

    public final void setIEvent(@NotNull IEvent iEvent) {
        this.onEvent = iEvent;
    }

    public final void setLiveSourceListener(@NotNull ILiveSourceListener iLiveSourceListener) {
        this.sourceListener = iLiveSourceListener;
    }

    public final void setNotifyProxyUrlLister(@NotNull Function1<? super String, Unit> function1) {
        this.notifyProxyUrl = function1;
    }

    public final void setPendingSwitchPlayList(@NotNull final Function4<? super String, ? super HLSStreamInf, ? super PlaylistItem, ? super HLSMasterCode, Unit> function4) {
        this.hls7Player.setPendingSwitchPlayList(new Function4(this, function4) { // from class: com.bilibili.sistersplayer.p2p.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SistersPlayerLoader f104935a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function4 f104936b;

            {
                this.f104935a = this;
                this.f104936b = function4;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SistersPlayerLoader.setPendingSwitchPlayList$lambda$18(this.f104935a, this.f104936b, (String) obj, (HLSStreamInf) obj2, (PlaylistItem) obj3, (HLSMasterCode) obj4);
            }
        });
    }

    public final void setPlatform(@NotNull String str) {
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("setPlatform ", this.platform), null, 4, null);
        this.platform = str;
    }

    public final void setReRryErrorCodes(@NotNull List<Integer> list) {
        this.retryErrorCodes.clear();
        this.retryErrorCodes.addAll(list);
    }

    public final void setSubUrl(@NotNull String str) {
        String str2;
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("setSubUrl url ", str), null, 4, null);
        this.realUrl = str;
        UrlUtils.UrlParseResult url = this.urlUtils.parseUrl(str);
        if (url.getOk()) {
            this.streamName = url.getStreamName();
            this.originQueryParams = url.getQueryParams();
            String httpType = url.getHttpType();
            String domain = url.getDomain();
            boolean z6 = this.canP2PUpload;
            StringBuilder sbA = G0.b.a("sister_http_type=", httpType, "&sister_domain=", domain, "&sister_upload=");
            sbA.append(z6);
            this.proxyQueryParams = sbA.toString();
            String strA = this.originQueryParams.length() == 0 ? C4496a.a("?", this.proxyQueryParams) : B0.a.a(this.originQueryParams, "&", this.proxyQueryParams);
            boolean zN = StringsKt.n(str, "a_index.m3u8");
            this.onlyAudio = zN;
            this.localAddress = zN ? C8770a.a(com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(this.roomId, "/", "/", this.streamName), ".m4a", strA) : C8770a.a(com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(this.roomId, "/", "/", this.streamName), ".mp4", strA);
        }
        if (this.canP2PUpload) {
            this.p2pContext.setPeerRole(PeerRole.PEER);
            str2 = KE0.b.f12724c;
        } else {
            this.p2pContext.setPeerRole(PeerRole.LEECH);
            str2 = "leech";
        }
        this.trackerQueryParams = generateTrackerParams(str2);
    }

    public final void setSwitchBack(@NotNull final Function3<? super Boolean, ? super String, ? super String, Unit> function3) {
        this.hls7Player.setSwitchBack(new Function3(this, function3) { // from class: com.bilibili.sistersplayer.p2p.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SistersPlayerLoader f104940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function3 f104941b;

            {
                this.f104940a = this;
                this.f104941b = function3;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SistersPlayerLoader.setSwitchBack$lambda$19(this.f104940a, this.f104941b, ((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
            }
        });
    }

    @NotNull
    public final Pair<Boolean, String> setUrl(@NotNull String str, long j7) throws FileNotFoundException {
        int i7;
        String str2;
        int i8;
        this.realUrl = str;
        this.roomId = j7;
        P2PLogger.logI$default(this.logger, TAG, androidx.compose.ui.input.pointer.k.b(j7, "setUrl roomId", " url ", str), null, 4, null);
        UrlUtils.UrlParseResult url = this.urlUtils.parseUrl(str);
        if (!url.getOk()) {
            return new Pair<>(Boolean.valueOf(url.getOk()), url.getParseMsg());
        }
        this.streamName = url.getStreamName();
        this.originQueryParams = url.getQueryParams();
        String httpType = url.getHttpType();
        String domain = url.getDomain();
        boolean z6 = this.canP2PUpload;
        StringBuilder sbA = G0.b.a("sister_http_type=", httpType, "&sister_domain=", domain, "&sister_upload=");
        sbA.append(z6);
        this.proxyQueryParams = sbA.toString();
        if (this.isUsedP2P) {
            this.hls7PlayerMinBufferLengthUpdate.invoke();
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("tmshift");
            i8 = queryParameter != null ? Integer.parseInt(queryParameter) : 0;
            i7 = i8;
        } catch (Exception e7) {
            this.logger.logE(TAG, "[LiveP2PProblem][m3u8_error=m3u8_parse] tmshift find error, url: " + str, e7);
        }
        if (i8 < 0) {
            P2PLogger.logI$default(this.logger, TAG, "timeShift is " + i8 + ", error!! change to 0!!!", null, 4, null);
            i7 = 0;
        }
        this.p2pContext.setTimeShift(i7);
        this.hls7Player.setRoomId(this.roomId);
        this.hls7Player.setUrl(this.realUrl);
        this.hls7Player.setNotifyError(this.notifyError);
        this.hls7Player.setFirstM3U8(new Function2(this) { // from class: com.bilibili.sistersplayer.p2p.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SistersPlayerLoader f104946a;

            {
                this.f104946a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                return SistersPlayerLoader.setUrl$lambda$14(this.f104946a, (String) obj, (String) obj2);
            }
        });
        this.miniServer = new LiveMiniServer(0, this.logger);
        String strA = this.originQueryParams.length() == 0 ? C4496a.a("?", this.proxyQueryParams) : B0.a.a(this.originQueryParams, "&", this.proxyQueryParams);
        boolean zN = StringsKt.n(str, "a_index.m3u8");
        this.onlyAudio = zN;
        String strA2 = zN ? C8770a.a(com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(this.roomId, "/", "/", this.streamName), ".m4a", strA) : C8770a.a(com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(this.roomId, "/", "/", this.streamName), ".mp4", strA);
        this.localAddress = strA2;
        LiveMiniServer liveMiniServer = this.miniServer;
        if (liveMiniServer != null) {
            liveMiniServer.get(strA2, new y(this, 1));
        }
        LiveMiniServer liveMiniServer2 = this.miniServer;
        int port = 0;
        if (liveMiniServer2 != null) {
            port = liveMiniServer2.getPort();
        }
        this.miniServerPort = port;
        if (port <= 0) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=proxy_error]http proxy failed, because of port is not useful", null, 4, null);
            release(null, ReleaseFrom.SET_URL);
            return new Pair<>(Boolean.FALSE, "http proxy failed, because of port is not useful");
        }
        String strA3 = C3392f.a(port, "http://127.0.0.1:", this.localAddress);
        IEvent.EventType eventType = IEvent.EventType.ProxyServerReady;
        HashMap<String, Object> mapC = O4.b.c("proxyUrl", strA3);
        Unit unit = Unit.INSTANCE;
        innerEvent(eventType, mapC);
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("proxyUrl is ", strA3), null, 4, null);
        if (this.canP2PUpload) {
            this.p2pContext.setPeerRole(PeerRole.PEER);
            str2 = KE0.b.f12724c;
        } else {
            this.p2pContext.setPeerRole(PeerRole.LEECH);
            str2 = "leech";
        }
        this.trackerQueryParams = generateTrackerParams(str2);
        return new Pair<>(Boolean.TRUE, strA3);
    }

    public final void shareSegment(@NotNull String str, @NotNull byte[] bArr, long j7, @NotNull Function2<? super Boolean, ? super String, Unit> function2) {
        if (this.p2pContext.isDestroyed()) {
            function2.invoke(Boolean.FALSE, "p2p destroyed.");
        } else {
            P2PContext.launch$default(this.p2pContext, null, new C64911(this, str, j7, function2, bArr, null), 1, null);
        }
    }

    public final void switchPlaylist(@NotNull HLSStreamInf hLSStreamInf, boolean z6, boolean z7, boolean z8) {
        P2PLogger.logI$default(this.logger, TAG, com.bilibili.bplus.im.protobuf.b.b(G0.b.a("switchPlaylist current ", this.streamName, " == switch to ", hLSStreamInf.getUrlStreamName(), " "), z6, " ", z7), null, 4, null);
        hLSStreamInf.setSwitchStartTime(Long.valueOf(System.currentTimeMillis()));
        Long lValueOf = null;
        if (Intrinsics.areEqual(this.streamName, hLSStreamInf.getUrlStreamName()) && !hLSStreamInf.isOnyAudio()) {
            Function4<String, HLSStreamInf, PlaylistItem, HLSMasterCode, Unit> pendSwitchPlayListResolve = this.hls7Player.getPendSwitchPlayListResolve();
            if (pendSwitchPlayListResolve != null) {
                pendSwitchPlayListResolve.invoke(getUrl(), hLSStreamInf, (Object) null, HLSMasterCode.KEEP);
                return;
            }
            return;
        }
        if (!z7) {
            this.switchEndP2pBufferLength = keepMorePlayBuffer();
        }
        IContentProvider iContentProvider = this.iContentProvider;
        if (iContentProvider != null) {
            lValueOf = Long.valueOf(iContentProvider.cacheDuration());
        }
        P2PLogger.logI$default(this.logger, TAG, "switchPlaylist pre " + hLSStreamInf + ",playerCache " + lValueOf, null, 4, null);
        this.hls7Player.switchPlaylistUrl(hLSStreamInf, lValueOf != null ? lValueOf.longValue() : 0L, z6, z7, z8);
    }

    public final void usedP2P(boolean z6) {
        if (z6 == this.isUsedP2P) {
            return;
        }
        if (z6) {
            this.canStartP2PTask.set(false);
            this.hls7PlayerMinBufferLengthUpdate.invoke();
            this.isUsedP2P = true;
        } else {
            this.p2pContext.setP2pBufferLength(0L);
            this.hls7PlayerMinBufferLengthUpdate.invoke();
            this.isUsedP2P = false;
        }
    }
}
