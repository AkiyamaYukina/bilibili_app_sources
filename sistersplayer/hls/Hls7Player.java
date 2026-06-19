package com.bilibili.sistersplayer.hls;

import G.f;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import androidx.appcompat.widget.C3259x;
import androidx.compose.ui.input.pointer.k;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.app.NotificationCompat;
import androidx.core.app.o;
import androidx.fragment.app.B;
import androidx.transition.x;
import c6.O;
import com.bilibili.app.comment3.ui.i;
import com.bilibili.sistersplayer.hls.model.HLSStreamInf;
import com.bilibili.sistersplayer.httpserver.StatusLine;
import com.bilibili.sistersplayer.p2p.P2PConfig;
import com.bilibili.sistersplayer.p2p.SistersPlayerLoader;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.bilibili.sistersplayer.p2p.utils.UrlUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player.class */
public final class Hls7Player {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "Hls7Player";
    public static final int TOTAL_MIN_DURATION_MS = 4000;

    @Nullable
    private final Context appContext;

    @NotNull
    private volatile List<String> blackHosts;
    private int fetchFragmentCount;

    @Nullable
    private Job fetchM3U8Job;
    private int fetchM3u8Count;

    @NotNull
    private final Fetcher fetcher;

    @Nullable
    private Function2<? super String, ? super String, Unit> firstFetchM3U8;

    @Nullable
    private Function0<Long> getPlayerBufferDuration;

    @NotNull
    private final CoroutineScope hls7CoroutineScope;

    @NotNull
    private final ExecutorCoroutineDispatcher hls7Ctx;

    @NotNull
    private final CoroutineDispatcher iOCoroutineContext;

    @NotNull
    private AtomicBoolean initDone;

    @NotNull
    private final CoroutineScope ioCoroutineScope;

    @NotNull
    private final AtomicBoolean isDestroyed;
    private long lastDuration;
    private long lastFetchM3u8Timestamp;
    private long lastM3u8Sequence;
    private long lastM3u8UpdatedTimestamp;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final M3u8ParserV2 m3u8Parser;

    @Nullable
    private Function2<? super PlaylistItem, ? super Long, Unit> m4sFetchAsStream;

    @Nullable
    private String mainUrl;
    private long minBufferLength;

    @Nullable
    private Function1<? super ErrorMsg, Boolean> notifyError;

    @Nullable
    private Function3<? super String, ? super Long, ? super PlaylistItem, Unit> onFileFetched;

    @Nullable
    private Function1<? super PlaylistItem, Unit> onPlaylistUpdate;

    @Nullable
    private Function0<Unit> onPushEnd;

    @Nullable
    private final Function1<byte[], Unit> onWriteBuffer;

    @NotNull
    private StreamQueue outQueue;

    @Nullable
    private OutputStream outputStream;

    @NotNull
    private final P2PConfig p2pConfig;

    @Nullable
    private Function4<? super String, ? super HLSStreamInf, ? super PlaylistItem, ? super HLSMasterCode, Unit> paddingSwitchPlayListResolve;

    @NotNull
    private final Buffer pendingBuffers;
    private boolean pickSeq;
    private long roomId;
    private boolean seekSwitch;

    @NotNull
    private final AtomicLong sequencer;

    @Nullable
    private HLSStreamInf targetSwitchPlaylist;
    private int timeoutMS;
    private long totalDuration;
    private int trySwitchPlaylistCount;

    @Nullable
    private Job updatePlayListJob;

    @NotNull
    private final UrlUtils urlUtils;

    @NotNull
    private volatile List<String> whiteUrls;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$competitionBackUp$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$competitionBackUp$1.class */
    public static final class C64551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FetchResult<String> $back;
        final String $backM3U8;
        final Function2<SistersPlayerLoader.IEvent.EventType, HashMap<String, Object>, Unit> $onEvent;
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C64551(Hls7Player hls7Player, FetchResult<String> fetchResult, String str, Function2<? super SistersPlayerLoader.IEvent.EventType, ? super HashMap<String, Object>, Unit> function2, Continuation<? super C64551> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
            this.$back = fetchResult;
            this.$backM3U8 = str;
            this.$onEvent = function2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64551(this.this$0, this.$back, this.$backM3U8, this.$onEvent, continuation);
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
            try {
            } catch (Exception e7) {
                Function2<SistersPlayerLoader.IEvent.EventType, HashMap<String, Object>, Unit> function2 = this.$onEvent;
                SistersPlayerLoader.IEvent.EventType eventType = SistersPlayerLoader.IEvent.EventType.SWITCH_BACKUP_FAIL;
                HashMap map = new HashMap();
                Hls7Player hls7Player = this.this$0;
                String str = this.$backM3U8;
                FetchResult<String> fetchResult = this.$back;
                String str2 = hls7Player.mainUrl;
                if (str2 == null) {
                    str2 = "";
                }
                map.put("current_url", str2);
                map.put("backup_url", str);
                map.put(NotificationCompat.CATEGORY_MESSAGE, fetchResult.getMsg());
                FetchErrorCode fetchErrorCode = FetchErrorCode.ERROR_BACKUP_SWITCH_EXCEPTION;
                map.put("p2p_code", Boxing.boxInt(fetchErrorCode.getEc()));
                map.put("http_code", Boxing.boxInt(fetchResult.getHttpCode()));
                Unit unit = Unit.INSTANCE;
                function2.invoke(eventType, map);
                Function1<ErrorMsg, Boolean> notifyError = this.this$0.getNotifyError();
                if (notifyError != null) {
                }
            }
            if (this.this$0.isDestroyed.get()) {
                return Unit.INSTANCE;
            }
            BasicM3u8Parser basicM3u8Parser = new BasicM3u8Parser(this.this$0.logger);
            int i7 = basicM3u8Parser.parse(this.$back.getData(), this.$backM3U8);
            if (basicM3u8Parser.getStreams().size() > 0) {
                this.this$0.whiteUrls.add(0, basicM3u8Parser.getStreams().get(0));
                this.this$0.competitionM3U8(this.$onEvent);
            } else if (i7 == 0) {
                if (this.this$0.m3u8Parser.replaceM3u8(this.$backM3U8, basicM3u8Parser)) {
                    Function2<SistersPlayerLoader.IEvent.EventType, HashMap<String, Object>, Unit> function22 = this.$onEvent;
                    SistersPlayerLoader.IEvent.EventType eventType2 = SistersPlayerLoader.IEvent.EventType.SWITCH_BACKUP_SUCCESS;
                    HashMap map2 = new HashMap();
                    Hls7Player hls7Player2 = this.this$0;
                    String str3 = this.$backM3U8;
                    FetchResult<String> fetchResult2 = this.$back;
                    String str4 = hls7Player2.mainUrl;
                    String str5 = str4;
                    if (str4 == null) {
                        str5 = "";
                    }
                    map2.put("current_url", str5);
                    map2.put("backup_url", str3);
                    map2.put(NotificationCompat.CATEGORY_MESSAGE, fetchResult2.getMsg());
                    map2.put("http_code", Boxing.boxInt(fetchResult2.getHttpCode()));
                    Unit unit2 = Unit.INSTANCE;
                    function22.invoke(eventType2, map2);
                    this.this$0.mainUrl = this.$backM3U8;
                    if (!this.this$0.fetchInitM4s(this.$backM3U8, this.$back)) {
                        return Unit.INSTANCE;
                    }
                    this.this$0.doNextFetch();
                } else {
                    Function2<SistersPlayerLoader.IEvent.EventType, HashMap<String, Object>, Unit> function23 = this.$onEvent;
                    SistersPlayerLoader.IEvent.EventType eventType3 = SistersPlayerLoader.IEvent.EventType.SWITCH_BACKUP_FAIL;
                    HashMap map3 = new HashMap();
                    Hls7Player hls7Player3 = this.this$0;
                    String str6 = this.$backM3U8;
                    FetchResult<String> fetchResult3 = this.$back;
                    String str7 = hls7Player3.mainUrl;
                    String str8 = str7;
                    if (str7 == null) {
                        str8 = "";
                    }
                    map3.put("current_url", str8);
                    map3.put("backup_url", str6);
                    map3.put(NotificationCompat.CATEGORY_MESSAGE, fetchResult3.getMsg());
                    FetchErrorCode fetchErrorCode2 = FetchErrorCode.ERROR_BACKUP_SWITCH_NO_MATCH;
                    map3.put("p2p_code", Boxing.boxInt(fetchErrorCode2.getEc()));
                    map3.put("http_code", Boxing.boxInt(fetchResult3.getHttpCode()));
                    Unit unit3 = Unit.INSTANCE;
                    function23.invoke(eventType3, map3);
                    Function1<ErrorMsg, Boolean> notifyError2 = this.this$0.getNotifyError();
                    if (notifyError2 != null) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$competitionM3U8$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$competitionM3U8$1.class */
    public static final class C64561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $backM3U8;
        final String $mainM3U8;
        final Function2<SistersPlayerLoader.IEvent.EventType, HashMap<String, Object>, Unit> $onEvent;
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C64561(Hls7Player hls7Player, Function2<? super SistersPlayerLoader.IEvent.EventType, ? super HashMap<String, Object>, Unit> function2, String str, String str2, Continuation<? super C64561> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
            this.$onEvent = function2;
            this.$backM3U8 = str;
            this.$mainM3U8 = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64561(this.this$0, this.$onEvent, this.$backM3U8, this.$mainM3U8, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.isDestroyed.get()) {
                    return Unit.INSTANCE;
                }
                Function2<SistersPlayerLoader.IEvent.EventType, HashMap<String, Object>, Unit> function2 = this.$onEvent;
                SistersPlayerLoader.IEvent.EventType eventType = SistersPlayerLoader.IEvent.EventType.SWITCH_BACKUP_BEGIN;
                HashMap map = new HashMap();
                String str = this.$mainM3U8;
                String str2 = this.$backM3U8;
                map.put("current_url", str);
                map.put("backup_url", str2);
                Unit unit = Unit.INSTANCE;
                function2.invoke(eventType, map);
                Deferred deferredAsync$default = this.this$0.p2pConfig.getFetchTimeOut().getEnable() ? BuildersKt.async$default(this.this$0.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Hls7Player$competitionM3U8$1$fetchBack$1(this.this$0, this.$backM3U8, null), 3, (Object) null) : BuildersKt.async$default(this.this$0.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Hls7Player$competitionM3U8$1$fetchBack$2(this.this$0, this.$backM3U8, null), 3, (Object) null);
                this.label = 1;
                Object objAwait = deferredAsync$default.await(this);
                obj = objAwait;
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FetchResult fetchResult = (FetchResult) obj;
            if (!fetchResult.getOk()) {
                P2PLogger.logI$default(this.this$0.logger, Hls7Player.TAG, C4496a.a("back fail, black ", this.$backM3U8), null, 4, null);
                this.this$0.blackHosts.add(URI.create(this.$backM3U8).getHost());
            }
            if (fetchResult.getOk() && fetchResult.getData() != null) {
                P2PLogger.logI$default(this.this$0.logger, Hls7Player.TAG, C4496a.a("competitionBackUp ", this.$backM3U8), null, 4, null);
                Boxing.boxBoolean(this.this$0.competitionBackUp(this.$backM3U8, fetchResult, this.$onEvent));
            } else if (this.this$0.whiteUrls.size() > 0) {
                P2PLogger.logI$default(this.this$0.logger, Hls7Player.TAG, "competitionM3U8 next", null, 4, null);
                this.this$0.competitionM3U8(this.$onEvent);
            } else {
                P2PLogger.logI$default(this.this$0.logger, Hls7Player.TAG, "competitionM3U8 error", null, 4, null);
                Function2<SistersPlayerLoader.IEvent.EventType, HashMap<String, Object>, Unit> function22 = this.$onEvent;
                SistersPlayerLoader.IEvent.EventType eventType2 = SistersPlayerLoader.IEvent.EventType.SWITCH_BACKUP_FAIL;
                HashMap map2 = new HashMap();
                String str3 = this.$mainM3U8;
                String str4 = this.$backM3U8;
                map2.put("current_url", str3);
                map2.put("backup_url", str4);
                map2.put(NotificationCompat.CATEGORY_MESSAGE, fetchResult.getMsg());
                FetchErrorCode fetchErrorCode = FetchErrorCode.ERROR_BACKUP_SWITCH_NO_BACKUP;
                map2.put("p2p_code", Boxing.boxInt(fetchErrorCode.getEc()));
                map2.put("http_code", Boxing.boxInt(fetchResult.getHttpCode()));
                Unit unit2 = Unit.INSTANCE;
                function22.invoke(eventType2, map2);
                Function1<ErrorMsg, Boolean> notifyError = this.this$0.getNotifyError();
                if (notifyError != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$doNextFetch$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$doNextFetch$1.class */
    public static final class C64571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64571(Hls7Player hls7Player, Continuation<? super C64571> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64571(this.this$0, continuation);
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
            this.this$0.fetchNextM4s();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$doNextFetch$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$doNextFetch$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $delayMs;
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Hls7Player hls7Player, long j7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
            this.$delayMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$delayMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.fetchTargetM3u8(this.$delayMs);
                long j7 = this.$delayMs;
                if (j7 >= 100) {
                    this.label = 1;
                    if (DelayKt.delay(j7, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.fetchM3u8();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$fetchInitM4s$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$fetchInitM4s$1.class */
    public static final class C64581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $fetchBegin;
        final FetchResult<String> $fetchResult;
        final PlaylistItem $item;
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64581(PlaylistItem playlistItem, Hls7Player hls7Player, FetchResult<String> fetchResult, long j7, Continuation<? super C64581> continuation) {
            super(2, continuation);
            this.$item = playlistItem;
            this.this$0 = hls7Player;
            this.$fetchResult = fetchResult;
            this.$fetchBegin = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64581(this.$item, this.this$0, this.$fetchResult, this.$fetchBegin, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        public final java.lang.Object invokeSuspend(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ??
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
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
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
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$fetchM3u8$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$fetchM3u8$1.class */
    public static final class C64591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final long $fetchingBegin;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final Hls7Player this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$fetchM3u8$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$fetchM3u8$1$1.class */
        public static final class C11731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final FetchResult<String> $fetchResult;
            final String $fetchUrl;
            final long $fetchingBegin;
            int label;
            final Hls7Player this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11731(Hls7Player hls7Player, String str, long j7, FetchResult<String> fetchResult, Continuation<? super C11731> continuation) {
                super(2, continuation);
                this.this$0 = hls7Player;
                this.$fetchUrl = str;
                this.$fetchingBegin = j7;
                this.$fetchResult = fetchResult;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11731(this.this$0, this.$fetchUrl, this.$fetchingBegin, this.$fetchResult, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.onM3u8Fetched(this.$fetchUrl, this.$fetchingBegin, this.$fetchResult);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64591(Hls7Player hls7Player, long j7, Continuation<? super C64591> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
            this.$fetchingBegin = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64591(this.this$0, this.$fetchingBegin, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        public final java.lang.Object invokeSuspend(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ??
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
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
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
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$fetchTargetM3u8$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$fetchTargetM3u8$1.class */
    public static final class C64601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $delayMs;
        Object L$0;
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64601(Hls7Player hls7Player, long j7, Continuation<? super C64601> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
            this.$delayMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64601(this.this$0, this.$delayMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            HLSStreamInf hLSStreamInf;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                HLSStreamInf hLSStreamInf2 = this.this$0.targetSwitchPlaylist;
                if (hLSStreamInf2 == null) {
                    return Unit.INSTANCE;
                }
                long j7 = this.$delayMs;
                hLSStreamInf = hLSStreamInf2;
                if (j7 >= 100) {
                    this.L$0 = hLSStreamInf2;
                    this.label = 1;
                    if (DelayKt.delay(j7 / ((long) 2), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    hLSStreamInf = hLSStreamInf2;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                HLSStreamInf hLSStreamInf3 = (HLSStreamInf) this.L$0;
                ResultKt.throwOnFailure(obj);
                hLSStreamInf = hLSStreamInf3;
            }
            this.this$0.updateTargetPlaylist(hLSStreamInf, 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$onM3u8Fetched$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$onM3u8Fetched$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Hls7Player hls7Player, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
            this.this$0.fetchM3u8();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$onM4sFetched$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$onM4sFetched$1.class */
    public static final class C64611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FetchResult<byte[]> $fetchResult;
        final String $from;
        final PlaylistItem $item;
        final long $startTime;
        private Object L$0;
        int label;
        final Hls7Player this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$onM4sFetched$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$onM4sFetched$1$1.class */
        public static final class C11741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final Hls7Player this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11741(Hls7Player hls7Player, Continuation<? super C11741> continuation) {
                super(2, continuation);
                this.this$0 = hls7Player;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11741(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws IOException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.doNextFetch();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64611(PlaylistItem playlistItem, FetchResult<byte[]> fetchResult, Hls7Player hls7Player, long j7, String str, Continuation<? super C64611> continuation) {
            super(2, continuation);
            this.$item = playlistItem;
            this.$fetchResult = fetchResult;
            this.this$0 = hls7Player;
            this.$startTime = j7;
            this.$from = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C64611 c64611 = new C64611(this.$item, this.$fetchResult, this.this$0, this.$startTime, this.$from, continuation);
            c64611.L$0 = obj;
            return c64611;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            String uri = this.$item.getUri();
            if (!this.$fetchResult.getOk()) {
                P2PLogger p2PLogger = this.this$0.logger;
                Integer resCode = this.$fetchResult.getResCode();
                int iIntValue = resCode != null ? resCode.intValue() : FetchErrorCode.ERROR_FETCH_M4S_ERROR.getEc();
                String msg = this.$fetchResult.getMsg();
                String uri2 = this.$item.getUri();
                StringBuilder sbB = bilibili.live.app.service.resolver.a.b(iIntValue, "[LiveP2PProblem][p2p_error=fetch_error] fetch failed, code: ", ", msg: ", msg, ", ");
                sbB.append(uri2);
                P2PLogger.logE$default(p2PLogger, Hls7Player.TAG, sbB.toString(), null, 4, null);
                Function1<ErrorMsg, Boolean> notifyError = this.this$0.getNotifyError();
                if (notifyError != null) {
                    Integer resCode2 = this.$fetchResult.getResCode();
                }
                return Unit.INSTANCE;
            }
            if (this.$fetchResult.getDone()) {
                this.this$0.onUrlFetchDone(uri, this.$item, SystemClock.uptimeMillis() - this.$startTime, this.$from);
                Hls7Player hls7Player = this.this$0;
                hls7Player.totalDuration = this.this$0.lastDuration + hls7Player.totalDuration;
                Hls7Player hls7Player2 = this.this$0;
                Hls7Player.safeLaunch$default(hls7Player2, coroutineScope, null, new C11741(hls7Player2, null), 1, null);
            }
            byte[] data = this.$fetchResult.getData();
            if (data == null) {
                return Unit.INSTANCE;
            }
            this.this$0.saveToFile(uri, data);
            if (this.this$0.initDone.get()) {
                try {
                    this.this$0.writeStreamBuffer(data);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    Function1<ErrorMsg, Boolean> notifyError2 = this.this$0.getNotifyError();
                    if (notifyError2 != null) {
                    }
                }
            } else {
                P2PLogger.logI$default(this.this$0.logger, Hls7Player.TAG, o.a(data.length, "no init.m4s, put to pendingBuffers. size: ", ", url: ", uri), null, 4, null);
                this.this$0.pendingBuffers.write(data);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$safeLaunch$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$safeLaunch$1.class */
    public static final class C64621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function2<CoroutineScope, Continuation<? super Unit>, Object> $action;
        private Object L$0;
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64621(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Hls7Player hls7Player, Continuation<? super C64621> continuation) {
            super(2, continuation);
            this.$action = function2;
            this.this$0 = hls7Player;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C64621 c64621 = new C64621(this.$action, this.this$0, continuation);
            c64621.L$0 = obj;
            return c64621;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$action;
                    this.label = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e7) {
                if (e7 instanceof CancellationException) {
                    return Unit.INSTANCE;
                }
                this.this$0.logger.logE(Hls7Player.TAG, "hls7ctx launch error ", e7);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$setUrl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$setUrl$1.class */
    public static final class C64631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $url;
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64631(Hls7Player hls7Player, String str, Continuation<? super C64631> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
            this.$url = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64631(this.this$0, this.$url, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                P2PLogger.logI$default(this.this$0.logger, Hls7Player.TAG, C4496a.a("current thread is ", Thread.currentThread().getName()), null, 4, null);
                if (this.$url.length() == 0) {
                    P2PLogger.logE$default(this.this$0.logger, Hls7Player.TAG, "[LiveP2PProblem][m3u8_error=segment_uri] url is empty", null, 4, null);
                    Function1<ErrorMsg, Boolean> notifyError = this.this$0.getNotifyError();
                    if (notifyError != null) {
                    }
                    return Unit.INSTANCE;
                }
                this.this$0.m3u8Parser.setUrl(this.$url);
                Deferred deferredFetchM3u8 = this.this$0.fetchM3u8();
                this.label = 1;
                Object objAwait = deferredFetchM3u8.await(this);
                obj = objAwait;
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            if (str != null) {
                this.this$0.notifyFirstFetchM3U8(str, this.$url);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$updateMinBufferLength$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$updateMinBufferLength$1.class */
    public static final class C64641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $newMinBufferLength;
        int label;
        final Hls7Player this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64641(Hls7Player hls7Player, long j7, Continuation<? super C64641> continuation) {
            super(2, continuation);
            this.this$0 = hls7Player;
            this.$newMinBufferLength = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64641(this.this$0, this.$newMinBufferLength, continuation);
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
            this.this$0.minBufferLength = this.$newMinBufferLength;
            P2PLogger.logI$default(this.this$0.logger, Hls7Player.TAG, k.a(this.this$0.minBufferLength, "updateMinBufferLength to ", " ms"), null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$updateTargetPlaylist$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$updateTargetPlaylist$1.class */
    public static final class C64651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final int $currentLayer;
        final HLSStreamInf $streamInf;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final Hls7Player this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$updateTargetPlaylist$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$updateTargetPlaylist$1$1.class */
        public static final class C11751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final int $currentLayer;
            final FetchResult<String> $fetch;
            final HLSStreamInf $streamInf;
            int label;
            final Hls7Player this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11751(Hls7Player hls7Player, FetchResult<String> fetchResult, HLSStreamInf hLSStreamInf, int i7, Continuation<? super C11751> continuation) {
                super(2, continuation);
                this.this$0 = hls7Player;
                this.$fetch = fetchResult;
                this.$streamInf = hLSStreamInf;
                this.$currentLayer = i7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11751(this.this$0, this.$fetch, this.$streamInf, this.$currentLayer, continuation);
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
                if (this.this$0.targetSwitchPlaylist == null || this.this$0.updatePlayListJob == null) {
                    return Unit.INSTANCE;
                }
                String data = this.$fetch.getData();
                if (data != null) {
                    Hls7Player hls7Player = this.this$0;
                    HLSStreamInf hLSStreamInf = this.$streamInf;
                    int i7 = this.$currentLayer;
                    BasicM3u8Parser basicM3u8Parser = new BasicM3u8Parser(hls7Player.logger);
                    int i8 = basicM3u8Parser.parse(data, hLSStreamInf.getUrl());
                    if (basicM3u8Parser.getStreams().size() > 0) {
                        P2PLogger p2PLogger = hls7Player.logger;
                        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "updateTargetPlaylist ", " switch to next hls ", hLSStreamInf.getUrl(), "\n \n ");
                        sbB.append(data);
                        P2PLogger.logI$default(p2PLogger, Hls7Player.TAG, sbB.toString(), null, 4, null);
                        hLSStreamInf.setUrl(basicM3u8Parser.getStreams().get(0));
                        hls7Player.updateTargetPlaylist(hLSStreamInf, i7 + 1);
                    } else if (i8 == 0) {
                        Hls7Player.safeLaunch$default(hls7Player, hls7Player.hls7CoroutineScope, null, new Hls7Player$updateTargetPlaylist$1$1$1$1(hls7Player, hLSStreamInf, basicM3u8Parser, null), 1, null);
                    } else {
                        P2PLogger p2PLogger2 = hls7Player.logger;
                        StringBuilder sbB2 = bilibili.live.app.service.resolver.a.b(i7, "updateTargetPlaylist failed !!!! ", " switch to next hls ", hLSStreamInf.getUrl(), "\n \n ");
                        sbB2.append(data);
                        P2PLogger.logI$default(p2PLogger2, Hls7Player.TAG, sbB2.toString(), null, 4, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64651(int i7, Hls7Player hls7Player, HLSStreamInf hLSStreamInf, Continuation<? super C64651> continuation) {
            super(2, continuation);
            this.$currentLayer = i7;
            this.this$0 = hls7Player;
            this.$streamInf = hLSStreamInf;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64651(this.$currentLayer, this.this$0, this.$streamInf, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        public final java.lang.Object invokeSuspend(
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
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
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
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Hls7Player(@Nullable Context context, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Fetcher fetcher, @Nullable Function1<? super byte[], Unit> function1, @NotNull P2PConfig p2PConfig, @NotNull P2PLogger p2PLogger) {
        this.appContext = context;
        this.iOCoroutineContext = coroutineDispatcher;
        this.fetcher = fetcher;
        this.onWriteBuffer = function1;
        this.p2pConfig = p2PConfig;
        this.logger = p2PLogger;
        ExecutorCoroutineDispatcher executorCoroutineDispatcherNewSingleThreadContext = ThreadPoolDispatcherKt.newSingleThreadContext(TAG);
        this.hls7Ctx = executorCoroutineDispatcherNewSingleThreadContext;
        this.hls7CoroutineScope = CoroutineScopeKt.CoroutineScope(executorCoroutineDispatcherNewSingleThreadContext);
        this.ioCoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.whiteUrls = new ArrayList();
        this.blackHosts = new ArrayList();
        M3u8ParserV2 m3u8ParserV2 = new M3u8ParserV2(p2PConfig.getKeepFirstGopMs(), p2PLogger);
        this.m3u8Parser = m3u8ParserV2;
        this.urlUtils = new UrlUtils(p2PLogger);
        this.timeoutMS = 4000;
        this.pendingBuffers = new Buffer();
        this.isDestroyed = new AtomicBoolean(false);
        this.initDone = new AtomicBoolean(false);
        this.outQueue = new StreamQueue(3145728, p2PLogger);
        P2PLogger.logI$default(p2PLogger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> Hls7Player init "), null, 4, null);
        m3u8ParserV2.setOnSwitchToNextPlaylist(new Function4<Boolean, String, HLSStreamInf, PlaylistItem, Unit>(this) { // from class: com.bilibili.sistersplayer.hls.Hls7Player.1
            final Hls7Player this$0;

            {
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Boolean) obj).booleanValue(), (String) obj2, (HLSStreamInf) obj3, (PlaylistItem) obj4);
                return Unit.INSTANCE;
            }

            public void invoke(boolean z6, String str, HLSStreamInf hLSStreamInf, PlaylistItem playlistItem) {
                if (z6) {
                    this.this$0.mainUrl = hLSStreamInf.getUrl();
                    P2PLogger.logI$default(this.this$0.logger, Hls7Player.TAG, C4496a.a("setUrl onSwitchToNextPlaylist ", hLSStreamInf.getUrl()), null, 4, null);
                    Function4 function4 = this.this$0.paddingSwitchPlayListResolve;
                    if (function4 != null) {
                        function4.invoke(str, hLSStreamInf, playlistItem, HLSMasterCode.OK);
                    }
                } else {
                    Function4 function42 = this.this$0.paddingSwitchPlayListResolve;
                    if (function42 != null) {
                        function42.invoke(str, hLSStreamInf, (Object) null, HLSMasterCode.ERROR_SWITCH_CRASH);
                    }
                }
                this.this$0.innerCancelSwitchPlaylist();
            }
        });
        this.sequencer = new AtomicLong(0L);
    }

    public /* synthetic */ Hls7Player(Context context, CoroutineDispatcher coroutineDispatcher, Fetcher fetcher, Function1 function1, P2PConfig p2PConfig, P2PLogger p2PLogger, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : context, coroutineDispatcher, fetcher, function1, p2PConfig, p2PLogger);
    }

    public static final /* synthetic */ Fetcher access$getFetcher$p(Hls7Player hls7Player) {
        return hls7Player.fetcher;
    }

    public static final /* synthetic */ CoroutineScope access$getHls7CoroutineScope$p(Hls7Player hls7Player) {
        return hls7Player.hls7CoroutineScope;
    }

    public static final /* synthetic */ P2PLogger access$getLogger$p(Hls7Player hls7Player) {
        return hls7Player.logger;
    }

    public static final /* synthetic */ String access$getMainUrl$p(Hls7Player hls7Player) {
        return hls7Player.mainUrl;
    }

    public static final /* synthetic */ P2PConfig access$getP2pConfig$p(Hls7Player hls7Player) {
        return hls7Player.p2pConfig;
    }

    public static final /* synthetic */ AtomicBoolean access$isDestroyed$p(Hls7Player hls7Player) {
        return hls7Player.isDestroyed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRetry() {
        Function0<Long> function0 = this.getPlayerBufferDuration;
        return (function0 != null ? ((Number) function0.invoke()).longValue() : 0L) > this.p2pConfig.getFetchTimeOut().getRetryBufferThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean competitionBackUp(String str, FetchResult<String> fetchResult, Function2<? super SistersPlayerLoader.IEvent.EventType, ? super HashMap<String, Object>, Unit> function2) {
        if (!fetchResult.getOk() || fetchResult.getData() == null) {
            return false;
        }
        safeLaunch$default(this, this.hls7CoroutineScope, null, new C64551(this, fetchResult, str, function2, null), 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doNextFetch() throws IOException {
        if (this.isDestroyed.get()) {
            return;
        }
        if (this.m3u8Parser.getCount() == 0 && this.m3u8Parser.getEndOfStream()) {
            pushEnd();
            return;
        }
        if (this.m3u8Parser.getCount() > 0 && (this.m3u8Parser.getEndOfStream() || this.totalDuration < 4000 || this.m3u8Parser.getRemainDuration() > this.minBufferLength)) {
            safeLaunch$default(this, this.hls7CoroutineScope, null, new C64571(this, null), 1, null);
            return;
        }
        Job job = this.fetchM3U8Job;
        if (job != null && job.isActive()) {
            Job job2 = this.fetchM3U8Job;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.fetchM3U8Job = null;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j7 = this.lastFetchM3u8Timestamp;
        this.fetchM3U8Job = safeLaunch$default(this, this.hls7CoroutineScope, null, new AnonymousClass2(this, this.lastDuration - (jUptimeMillis - j7), null), 1, null);
    }

    private final void endOfStream() {
        this.outQueue.endOfStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fetchInitM4s(String str, FetchResult<String> fetchResult) {
        this.fetchFragmentCount++;
        if (this.m3u8Parser.getCount() <= 0 || this.initDone.get() || this.isDestroyed.get()) {
            return true;
        }
        PlaylistItem playlistItemShift = this.m3u8Parser.shift();
        String uri = playlistItemShift != null ? playlistItemShift.getUri() : null;
        if (uri == null || uri.length() == 0) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][m3u8_error=segment_uri] lost init.m4s", null, 4, null);
            Function1<? super ErrorMsg, Boolean> function1 = this.notifyError;
            if (function1 == null) {
                return false;
            }
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        P2PLogger p2PLogger = this.logger;
        String name = null;
        if (playlistItemShift != null) {
            name = playlistItemShift.getName();
        }
        P2PLogger.logI$default(p2PLogger, TAG, C4496a.a("fetch    ", name), null, 4, null);
        safeLaunch$default(this, this.ioCoroutineScope, null, new C64581(playlistItemShift, this, fetchResult, jUptimeMillis, null), 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Deferred<String> fetchM3u8() {
        this.fetchM3u8Count++;
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.lastFetchM3u8Timestamp = jUptimeMillis;
        return BuildersKt.async$default(this.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C64591(this, jUptimeMillis, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchNextM4s() {
        this.fetchFragmentCount++;
        PlaylistItem playlistItemShift = this.m3u8Parser.shift();
        if (playlistItemShift == null) {
            P2PLogger.logI$default(this.logger, TAG, "item == null", null, 4, null);
        }
        if (playlistItemShift != null) {
            if (playlistItemShift.getUri().length() == 0) {
                return;
            }
            Long duration = playlistItemShift.getDuration();
            this.lastDuration = duration != null ? duration.longValue() : 0L;
            long jUptimeMillis = SystemClock.uptimeMillis();
            Function2<? super PlaylistItem, ? super Long, Unit> function2 = this.m4sFetchAsStream;
            if (function2 != null) {
                function2.invoke(playlistItemShift, Long.valueOf(jUptimeMillis));
            }
        }
        removeOutdated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fetchTargetM3u8(long j7) {
        if (this.targetSwitchPlaylist == null) {
            return false;
        }
        P2PLogger.logI$default(this.logger, TAG, B.b(this.trySwitchPlaylistCount, j7, "fetchTargetM3u8 trySwitchPlaylistCount = ", " , delayMs = "), null, 4, null);
        if (this.trySwitchPlaylistCount < this.p2pConfig.getHlsMasterConfig().getTrySwitchMaxCount()) {
            this.trySwitchPlaylistCount++;
            Job job = this.updatePlayListJob;
            if (job != null && job.isActive()) {
                innerCancelSwitchPlaylist();
            }
            this.updatePlayListJob = safeLaunch$default(this, this.hls7CoroutineScope, null, new C64601(this, j7, null), 1, null);
            return false;
        }
        String str = this.mainUrl;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        HLSStreamInf hLSStreamInf = this.targetSwitchPlaylist;
        if (hLSStreamInf == null) {
            return true;
        }
        Function4<? super String, ? super HLSStreamInf, ? super PlaylistItem, ? super HLSMasterCode, Unit> function4 = this.paddingSwitchPlayListResolve;
        if (function4 != null) {
            function4.invoke(str2, hLSStreamInf, (Object) null, HLSMasterCode.ERROR_SWITCH_TIME_NOT_MATCH);
        }
        innerCancelSwitchPlaylist();
        return false;
    }

    private final void initSaveStream() throws FileNotFoundException {
        ContentResolver contentResolver;
        if (this.p2pConfig.getDebug().getSaveStream()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", this.roomId + "-" + hashCode() + ".mp4");
            contentValues.put("mime_type", "application/octet-stream");
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/BiliLiveP2P");
            Context context = this.appContext;
            Uri uriInsert = (context == null || (contentResolver = context.getContentResolver()) == null) ? null : contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
            if (uriInsert != null) {
                Context context2 = this.appContext;
                OutputStream outputStreamOpenOutputStream = null;
                if (context2 != null) {
                    ContentResolver contentResolver2 = context2.getContentResolver();
                    outputStreamOpenOutputStream = null;
                    if (contentResolver2 != null) {
                        outputStreamOpenOutputStream = contentResolver2.openOutputStream(uriInsert);
                    }
                }
                this.outputStream = outputStreamOpenOutputStream;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void innerCancelSwitchPlaylist() {
        Job job = this.updatePlayListJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.updatePlayListJob = null;
        this.targetSwitchPlaylist = null;
        this.seekSwitch = false;
        this.pickSeq = false;
        this.trySwitchPlaylistCount = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyFirstFetchM3U8(String str, String str2) {
        Function2<? super String, ? super String, Unit> function2 = this.firstFetchM3U8;
        if (function2 != null) {
            function2.invoke(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitM4sFetched(String str, PlaylistItem playlistItem, long j7, FetchResult<byte[]> fetchResult) {
        onUrlFetchDone(str, playlistItem, SystemClock.uptimeMillis() - j7, "onInitM4s");
        if (!fetchResult.getOk()) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=fetch_error] fetch network error", null, 4, null);
            Function1<? super ErrorMsg, Boolean> function1 = this.notifyError;
            if (function1 != null) {
                return;
            }
            return;
        }
        byte[] data = fetchResult.getData();
        if (data == null) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=fetch_error] init.m4s is empty", null, 4, null);
            Function1<? super ErrorMsg, Boolean> function12 = this.notifyError;
            if (function12 != null) {
                return;
            }
            return;
        }
        try {
            writeStreamBuffer(data);
        } catch (Exception e7) {
            e7.printStackTrace();
            Function1<? super ErrorMsg, Boolean> function13 = this.notifyError;
            if (function13 != null) {
            }
        }
        saveToFile(str, data);
        if (this.pendingBuffers.size() > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            byte[] byteArray = this.pendingBuffers.readByteArray();
            try {
                writeStreamBuffer(byteArray);
            } catch (Exception e8) {
                e8.printStackTrace();
                Function1<? super ErrorMsg, Boolean> function14 = this.notifyError;
                if (function14 != null) {
                }
            }
            P2PLogger p2PLogger = this.logger;
            Integer numValueOf = byteArray != null ? Integer.valueOf(byteArray.length) : null;
            P2PLogger.logI$default(p2PLogger, TAG, "pendingBuffers write size: " + numValueOf + " used: " + (SystemClock.uptimeMillis() - jUptimeMillis), null, 4, null);
        }
        this.initDone.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onM3u8Fetched(String str, long j7, FetchResult<String> fetchResult) throws IOException {
        Integer resCode = fetchResult.getResCode();
        int i7 = StatusLine.NOT_MODIFIED.code;
        if (resCode != null && resCode.intValue() == i7) {
            if (this.isDestroyed.get()) {
                return;
            }
            doNextFetch();
            return;
        }
        if (!fetchResult.getOk()) {
            this.m3u8Parser.setEndOfStream(true);
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][m3u8_error=request_failed] request M3U8 failed", null, 4, null);
            Function1<? super ErrorMsg, Boolean> function1 = this.notifyError;
            if (function1 != null) {
                Integer resCode2 = fetchResult.getResCode();
                return;
            }
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        onUrlFetchDone(str, null, jUptimeMillis - j7, "onM3u8");
        String data = fetchResult.getData();
        if (data == null || data.length() == 0) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][m3u8_error=content] M3U8 content is empty", null, 4, null);
            Function1<? super ErrorMsg, Boolean> function12 = this.notifyError;
            if (function12 != null) {
                Integer resCode3 = fetchResult.getResCode();
                return;
            }
            return;
        }
        int i8 = this.m3u8Parser.parse(data);
        if (i8 == 1) {
            try {
                int i9 = 0;
                this.mainUrl = this.m3u8Parser.getStreamUrls().get(0);
                List<String> streamUrls = this.m3u8Parser.getStreamUrls();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(streamUrls, 10));
                for (Object obj : streamUrls) {
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(HLSStreamInf.Companion.map2StreamInfo((String) obj, this.m3u8Parser.getStreamInfMaps().get(i9), this.urlUtils));
                    i9++;
                }
                HLSStreamInf hLSStreamInf = (HLSStreamInf) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.bilibili.sistersplayer.hls.Hls7Player$onM3u8Fetched$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t7, T t8) {
                        return ComparisonsKt.compareValues(((HLSStreamInf) t7).getOrder(), ((HLSStreamInf) t8).getOrder());
                    }
                }));
                this.mainUrl = hLSStreamInf != null ? hLSStreamInf.getUrl() : null;
            } catch (Exception e7) {
                P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][m3u8_error=master_list] M3U8 parse fail ".concat(data), null, 4, null);
            }
            P2PLogger.logI$default(this.logger, TAG, C4496a.a("setUrl is master ", this.mainUrl), null, 4, null);
            String str2 = this.mainUrl;
            if (str2 != null) {
                this.m3u8Parser.setUrl(str2);
            }
            safeLaunch$default(this, this.hls7CoroutineScope, null, new AnonymousClass3(this, null), 1, null);
            return;
        }
        if (i8 < 0 && this.m3u8Parser.getCount() == 0) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][m3u8_error=m3u8_parse] M3U8 parse fail", null, 4, null);
            Function1<? super ErrorMsg, Boolean> function13 = this.notifyError;
            if (function13 != null) {
                return;
            }
            return;
        }
        if (this.lastM3u8Sequence != this.m3u8Parser.getLastSequence()) {
            this.lastM3u8Sequence = this.m3u8Parser.getLastSequence();
            this.lastM3u8UpdatedTimestamp = jUptimeMillis;
        } else if (jUptimeMillis >= this.lastM3u8UpdatedTimestamp + ((long) this.timeoutMS)) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][m3u8_error=m3u8_timeout] M3U8 not update", null, 4, null);
            Function1<? super ErrorMsg, Boolean> function14 = this.notifyError;
            if (function14 != null) {
                return;
            }
            return;
        }
        if (fetchInitM4s(str, fetchResult)) {
            doNextFetch();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUrlFetchDone(String str, PlaylistItem playlistItem, long j7, String str2) {
        Function3<? super String, ? super Long, ? super PlaylistItem, Unit> function3 = this.onFileFetched;
        if (function3 != null) {
            function3.invoke(str, Long.valueOf(j7), playlistItem);
        }
        Matcher matcher = PLog.INSTANCE.getREGEX_FILENAME().matcher(str);
        String strGroup = matcher.find() ? matcher.group() : "";
        if (Intrinsics.areEqual(str2, "onM3u8")) {
            P2PLogger.logI$default(this.logger, TAG, O.a(j7, " ms from: ", str2, x.a(strGroup, " ", this.urlUtils.parseStreamName(str), " ")), null, 4, null);
            return;
        }
        P2PLogger p2PLogger = this.logger;
        String strA = playlistItem != null ? i.a(playlistItem.getDuration(), "duration: ") : "";
        StringBuilder sbA = G8.b.a(j7, strGroup, " ", " ms ");
        androidx.room.B.a(strA, " from: ", str2, " ", sbA);
        sbA.append(str);
        P2PLogger.logI$default(p2PLogger, TAG, sbA.toString(), null, 4, null);
    }

    private final void pushEnd() throws IOException {
        P2PLogger.logI$default(this.logger, TAG, "push end", null, 4, null);
        Function0<Unit> function0 = this.onPushEnd;
        if (function0 != null) {
            function0.invoke();
        }
        endOfStream();
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            outputStream.flush();
        }
        OutputStream outputStream2 = this.outputStream;
        if (outputStream2 != null) {
            outputStream2.close();
        }
        P2PLogger.logI$default(this.logger, TAG, k.a(this.roomId, "[LiveP2PProblem][p2p_cid=", "] push end"), null, 4, null);
        Function1<? super ErrorMsg, Boolean> function1 = this.notifyError;
        if (function1 != null) {
            int ec = FetchErrorCode.NORMAL_PUSH_END.getEc();
            String str = this.mainUrl;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
        }
    }

    private final void removeOutdated() {
    }

    private final Job safeLaunch(CoroutineScope coroutineScope, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (!this.isDestroyed.get()) {
            return BuildersKt.launch(coroutineScope, this.hls7Ctx, coroutineStart, new C64621(function2, this, null));
        }
        this.logger.logE(TAG, "!!!!! hls7ctx is destroy !!!!!", new Throwable());
        return null;
    }

    public static /* synthetic */ Job safeLaunch$default(Hls7Player hls7Player, CoroutineScope coroutineScope, CoroutineStart coroutineStart, Function2 function2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return hls7Player.safeLaunch(coroutineScope, coroutineStart, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveToFile(String str, byte[] bArr) {
        try {
            if (this.p2pConfig.getDebug().getSaveStream()) {
                long jIncrementAndGet = this.sequencer.incrementAndGet();
                if (this.appContext == null) {
                    return;
                }
                MatchResult matchResultFind$default = Regex.find$default(new Regex("[^/]+(?=\\?)"), str, 0, 2, (Object) null);
                String value = null;
                if (matchResultFind$default != null) {
                    value = matchResultFind$default.getValue();
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", jIncrementAndGet + "_" + value);
                contentValues.put("mime_type", "application/octet-stream");
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/BiliLiveP2P/" + this.roomId + "-" + hashCode());
                Uri uriInsert = this.appContext.getContentResolver().insert(MediaStore.Files.getContentUri("external"), contentValues);
                if (uriInsert != null) {
                    OutputStream outputStreamOpenOutputStream = this.appContext.getContentResolver().openOutputStream(uriInsert, "w");
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.write(bArr);
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.flush();
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                }
            }
        } catch (Exception e7) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTargetPlaylist(HLSStreamInf hLSStreamInf, int i7) {
        BuildersKt.launch$default(this.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C64651(i7, this, hLSStreamInf, null), 3, (Object) null);
    }

    public static /* synthetic */ void updateTargetPlaylist$default(Hls7Player hls7Player, HLSStreamInf hLSStreamInf, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        hls7Player.updateTargetPlaylist(hLSStreamInf, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeStreamBuffer(byte[] bArr) throws Exception {
        Function1<byte[], Unit> function1 = this.onWriteBuffer;
        if (function1 != null) {
            function1.invoke(bArr);
        }
        this.outQueue.put(bArr);
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            outputStream.write(bArr);
        }
    }

    public final void cancelSwitchPlaylist() {
        Function4<? super String, ? super HLSStreamInf, ? super PlaylistItem, ? super HLSMasterCode, Unit> function4;
        String str = this.mainUrl;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        HLSStreamInf hLSStreamInf = this.targetSwitchPlaylist;
        if (hLSStreamInf != null && (function4 = this.paddingSwitchPlayListResolve) != null) {
            function4.invoke(str2, hLSStreamInf, (Object) null, HLSMasterCode.SWITCH_CANCEL);
        }
        innerCancelSwitchPlaylist();
        this.m3u8Parser.cancelSwitchToNextPlaylist();
    }

    public final void competitionM3U8(@NotNull Function2<? super SistersPlayerLoader.IEvent.EventType, ? super HashMap<String, Object>, Unit> function2) {
        P2PLogger.logI$default(this.logger, TAG, f.a(this.blackHosts.size(), this.whiteUrls.size(), "competitionM3U8 blackSize=", " whiteSize="), null, 4, null);
        if (this.isDestroyed.get()) {
            return;
        }
        this.lastFetchM3u8Timestamp = SystemClock.uptimeMillis();
        String str = this.mainUrl;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            P2PLogger.logI$default(this.logger, TAG, "black mainUrl ".concat(str), null, 4, null);
            this.blackHosts.add(URI.create(str).getHost());
        }
        String str2 = (String) CollectionsKt.firstOrNull(this.whiteUrls);
        if (str2 == null) {
            str2 = "";
        }
        this.whiteUrls.remove(str2);
        safeLaunch$default(this, this.ioCoroutineScope, null, new C64561(this, function2, str2, str, null), 1, null);
    }

    public final void destroy() {
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> Hls7Player destroy "), null, 4, null);
        if (this.isDestroyed.get()) {
            P2PLogger.logW$default(this.logger, TAG, "--had destroy--", null, 4, null);
            return;
        }
        this.isDestroyed.set(true);
        P2PLogger.logW$default(this.logger, TAG, "--begin to destroy--", null, 4, null);
        this.initDone.set(false);
        innerCancelSwitchPlaylist();
        Job job = this.fetchM3U8Job;
        if (job != null && job.isActive()) {
            Job job2 = this.fetchM3U8Job;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.fetchM3U8Job = null;
        }
        try {
            CoroutineScopeKt.cancel$default(this.hls7CoroutineScope, (CancellationException) null, 1, (Object) null);
        } catch (Exception e7) {
            this.logger.logE(TAG, "--hls coroutine destroy-- error", e7);
        }
        try {
            CoroutineScopeKt.cancel$default(this.ioCoroutineScope, (CancellationException) null, 1, (Object) null);
        } catch (Exception e8) {
            this.logger.logE(TAG, "--io coroutine destroy-- error", e8);
        }
        try {
            this.hls7Ctx.close();
        } catch (Exception e9) {
            this.logger.logE(TAG, "--hls7Ctx close error", e9);
        }
        endOfStream();
        this.outQueue.clear();
        innerCancelSwitchPlaylist();
        this.firstFetchM3U8 = null;
        this.paddingSwitchPlayListResolve = null;
        this.getPlayerBufferDuration = null;
        P2PLogger.logI$default(this.logger, TAG, "--destroy-- OK", null, 4, null);
    }

    @NotNull
    public final List<String> getBlackHosts() {
        return this.blackHosts;
    }

    public final long getDuration() {
        return this.totalDuration;
    }

    public final int getFetchFragmentCount() {
        return this.fetchFragmentCount;
    }

    public final int getFetchM3u8Count() {
        return this.fetchM3u8Count;
    }

    @Nullable
    public final Function0<Long> getGetPlayerBufferDuration() {
        return this.getPlayerBufferDuration;
    }

    @Nullable
    public final Function1<ErrorMsg, Boolean> getNotifyError() {
        return this.notifyError;
    }

    @Nullable
    public final Function3<String, Long, PlaylistItem, Unit> getOnFileFetched() {
        return this.onFileFetched;
    }

    @Nullable
    public final Function0<Unit> getOnPushEnd() {
        return this.onPushEnd;
    }

    @NotNull
    public final StreamQueue getOutQueue() {
        return this.outQueue;
    }

    @Nullable
    public final Function4<String, HLSStreamInf, PlaylistItem, HLSMasterCode, Unit> getPendSwitchPlayListResolve() {
        return this.paddingSwitchPlayListResolve;
    }

    public final boolean hasBackUrl() {
        return this.whiteUrls.size() > 0;
    }

    public final void onM4sFetched(@NotNull PlaylistItem playlistItem, long j7, @NotNull FetchResult<byte[]> fetchResult, @NotNull String str) {
        if (this.isDestroyed.get()) {
            return;
        }
        safeLaunch$default(this, this.hls7CoroutineScope, null, new C64611(playlistItem, fetchResult, this, j7, str, null), 1, null);
    }

    public final void setBackUrls(@NotNull List<String> list) {
        try {
            this.whiteUrls.clear();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.blackHosts.contains(URI.create((String) obj).getHost())) {
                    arrayList.add(obj);
                }
            }
            this.whiteUrls.addAll(arrayList);
        } catch (Exception e7) {
            this.logger.logE(TAG, "setBackUrls error", e7);
        }
    }

    public final void setFirstM3U8(@NotNull Function2<? super String, ? super String, Unit> function2) {
        this.firstFetchM3U8 = function2;
    }

    public final void setGetPlayerBufferDuration(@Nullable Function0<Long> function0) {
        this.getPlayerBufferDuration = function0;
    }

    public final void setHls7Method(@NotNull Function1<? super PlaylistItem, Unit> function1, @NotNull Function2<? super PlaylistItem, ? super Long, Unit> function2) {
        this.onPlaylistUpdate = function1;
        this.m4sFetchAsStream = function2;
    }

    public final void setNotifyError(@Nullable Function1<? super ErrorMsg, Boolean> function1) {
        this.notifyError = function1;
    }

    public final void setOnFileFetched(@Nullable Function3<? super String, ? super Long, ? super PlaylistItem, Unit> function3) {
        this.onFileFetched = function3;
    }

    public final void setOnPushEnd(@Nullable Function0<Unit> function0) {
        this.onPushEnd = function0;
    }

    public final void setOutQueue(@NotNull StreamQueue streamQueue) {
        this.outQueue = streamQueue;
    }

    public final void setPendingSwitchPlayList(@NotNull Function4<? super String, ? super HLSStreamInf, ? super PlaylistItem, ? super HLSMasterCode, Unit> function4) {
        this.paddingSwitchPlayListResolve = function4;
    }

    public final void setRoomId(long j7) {
        this.roomId = j7;
        this.outQueue.setRoomId(j7);
    }

    public final void setSwitchBack(@NotNull Function3<? super Boolean, ? super String, ? super String, Unit> function3) {
        this.m3u8Parser.setOnSwitchBack(function3);
    }

    public final void setUrl(@NotNull String str) throws FileNotFoundException {
        this.mainUrl = str;
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("setUrl ", str), null, 4, null);
        this.m3u8Parser.setOnPlaylistUpdate(this.onPlaylistUpdate);
        initSaveStream();
        safeLaunch$default(this, this.hls7CoroutineScope, null, new C64631(this, str, null), 1, null);
    }

    public final void switchPlaylistUrl(@NotNull HLSStreamInf hLSStreamInf, long j7, boolean z6, boolean z7, boolean z8) {
        innerCancelSwitchPlaylist();
        if (!z6 || j7 >= this.p2pConfig.getHlsMasterConfig().getMinPlayLittleDuration()) {
            this.seekSwitch = z7;
            this.pickSeq = z8;
            this.targetSwitchPlaylist = hLSStreamInf;
            return;
        }
        String str = this.mainUrl;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        Function4<? super String, ? super HLSStreamInf, ? super PlaylistItem, ? super HLSMasterCode, Unit> function4 = this.paddingSwitchPlayListResolve;
        if (function4 != null) {
            function4.invoke(str2, hLSStreamInf, (Object) null, HLSMasterCode.PLAYER_BUFFER_LITTLE);
        }
    }

    public final void updateMinBufferLength(long j7) {
        if (j7 < 0) {
            return;
        }
        safeLaunch$default(this, this.hls7CoroutineScope, null, new C64641(this, j7, null), 1, null);
    }
}
