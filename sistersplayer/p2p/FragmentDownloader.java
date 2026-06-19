package com.bilibili.sistersplayer.p2p;

import android.os.SystemClock;
import androidx.compose.material.C3958x2;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.sistersplayer.hls.ErrorMsg;
import com.bilibili.sistersplayer.hls.FetchErrorCode;
import com.bilibili.sistersplayer.hls.FetchResult;
import com.bilibili.sistersplayer.hls.Fetcher;
import com.bilibili.sistersplayer.p2p.fragment.DataRoleType;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragmentSet;
import com.bilibili.sistersplayer.p2p.peer.NyaPeerManager;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader.class */
public final class FragmentDownloader {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int SEMAPHORE_PRE_SET = 12;

    @NotNull
    public static final String TAG = "FragmentDownloader";

    @NotNull
    private final Fetcher fetcher;

    @NotNull
    private LiveFragmentSet fragMan;

    @Nullable
    private Function0<Long> getPlayerBufferDuration;

    @NotNull
    private final CoroutineScope ioCoroutineScope;
    private int lastLackedMaxInstance;
    private int lastSeedAndLackedMaxInstance;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final P2PConfig p2pConfig;

    @NotNull
    private final P2PContext p2pContext;

    @NotNull
    private final Map<String, FragmentDownloadP2PRequestFactory2> downloaderMap = new LinkedHashMap();

    @NotNull
    private final Semaphore seedAndLackedSemaphore = SemaphoreKt.Semaphore$default(12, 0, 2, (Object) null);

    @NotNull
    private final Semaphore lackedSemaphore = SemaphoreKt.Semaphore$default(12, 0, 2, (Object) null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$destroy$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$destroy$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final FragmentDownloader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FragmentDownloader fragmentDownloader, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = fragmentDownloader;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$initSeedAndLackedSemaphoreInstance$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$initSeedAndLackedSemaphoreInstance$1.class */
    public static final class C64681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int label;
        final FragmentDownloader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64681(FragmentDownloader fragmentDownloader, Continuation<? super C64681> continuation) {
            super(2, continuation);
            this.this$0 = fragmentDownloader;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64681(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007d -> B:19:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bc -> B:27:0x00c2). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.FragmentDownloader.C64681.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$pullFragmentData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$pullFragmentData$1.class */
    public static final class C64691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final int $blockEnd;
        final DataRoleType $blockRole;
        final int $blockStart;
        final long $fetchBegin;
        final LiveFragment $fragment;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final FragmentDownloader this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$pullFragmentData$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$pullFragmentData$1$1.class */
        public static final class C11761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final FetchResult<byte[]> $fetchResult;
            final LiveFragment $fragment;
            int label;
            final FragmentDownloader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11761(FragmentDownloader fragmentDownloader, LiveFragment liveFragment, FetchResult<byte[]> fetchResult, Continuation<? super C11761> continuation) {
                super(2, continuation);
                this.this$0 = fragmentDownloader;
                this.$fragment = liveFragment;
                this.$fetchResult = fetchResult;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11761(this.this$0, this.$fragment, this.$fetchResult, continuation);
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
                P2PLogger.logW$default(this.this$0.logger, FragmentDownloader.TAG, C4496a.a("[LiveP2PProblem][segment_error=seed_failed], download fragment for seed failed, ", this.$fragment.getUrl()), null, 4, null);
                LiveFragment liveFragment = this.$fragment;
                Integer resCode = this.$fetchResult.getResCode();
                liveFragment.setFragmentData(null, new ErrorMsg(resCode != null ? resCode.intValue() : FetchErrorCode.ERROR_FETCH_HTTP_ERROR.getEc(), this.$fragment.getUrl(), this.$fetchResult.getMsg(), null, 8, null));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64691(DataRoleType dataRoleType, FragmentDownloader fragmentDownloader, LiveFragment liveFragment, int i7, int i8, long j7, Continuation<? super C64691> continuation) {
            super(2, continuation);
            this.$blockRole = dataRoleType;
            this.this$0 = fragmentDownloader;
            this.$fragment = liveFragment;
            this.$blockStart = i7;
            this.$blockEnd = i8;
            this.$fetchBegin = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FragmentDownloader fragmentDownloader, int i7, int i8, LiveFragment liveFragment, DataRoleType dataRoleType, byte[] bArr, int i9, boolean z6) {
            P2PContext.launch$default(fragmentDownloader.p2pContext, null, new FragmentDownloader$pullFragmentData$1$blockCallback$1$1(i7, i9, i8, liveFragment, bArr, dataRoleType, fragmentDownloader, null), 1, null);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64691(this.$blockRole, this.this$0, this.$fragment, this.$blockStart, this.$blockEnd, this.$fetchBegin, continuation);
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

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$startDownload$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$startDownload$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $fetchBegin;
        final LiveFragment $fragment;
        final String $url;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final FragmentDownloader this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$startDownload$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$startDownload$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final long $fetchBegin;
            final FetchResult<byte[]> $fetchResult;
            final LiveFragment $fragment;
            final String $url;
            int label;
            final FragmentDownloader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FetchResult<byte[]> fetchResult, long j7, FragmentDownloader fragmentDownloader, String str, LiveFragment liveFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$fetchResult = fetchResult;
                this.$fetchBegin = j7;
                this.this$0 = fragmentDownloader;
                this.$url = str;
                this.$fragment = liveFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$fetchResult, this.$fetchBegin, this.this$0, this.$url, this.$fragment, continuation);
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
                if (this.$fetchResult.getOk()) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - this.$fetchBegin;
                    if (jUptimeMillis >= 1000) {
                        P2PLogger.logI$default(this.this$0.logger, P2P.FETCH, androidx.compose.ui.input.pointer.k.b(jUptimeMillis, "[LiveP2PProblem][loading_reason=fetch_slow], used ", " ms, ", this.$url), null, 4, null);
                    }
                    LiveFragment.setFragmentData$default(this.$fragment, this.$fetchResult.getData(), null, 2, null);
                } else {
                    P2PLogger.logW$default(this.this$0.logger, FragmentDownloader.TAG, C4496a.a("[LiveP2PProblem][segment_error=server_failed], download fragment from server failed, ", this.$url), null, 4, null);
                    LiveFragment liveFragment = this.$fragment;
                    Integer resCode = this.$fetchResult.getResCode();
                    liveFragment.setFragmentData(null, new ErrorMsg(resCode != null ? resCode.intValue() : FetchErrorCode.ERROR_FETCH_HTTP_ERROR.getEc(), this.$url, this.$fetchResult.getMsg(), null, 8, null));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FragmentDownloader fragmentDownloader, String str, long j7, LiveFragment liveFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = fragmentDownloader;
            this.$url = str;
            this.$fetchBegin = j7;
            this.$fragment = liveFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$url, this.$fetchBegin, this.$fragment, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: Type inference failed with stack overflow
            jadx.core.utils.exceptions.JadxOverflowException
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 2732
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.FragmentDownloader.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$startDownload$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$startDownload$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $fetchBegin;
        final LiveFragment $fragment;
        final String $url;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final FragmentDownloader this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$startDownload$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$startDownload$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final FetchResult<byte[]> $fetchResult;
            final LiveFragment $fragment;
            final String $url;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LiveFragment liveFragment, FetchResult<byte[]> fetchResult, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$fragment = liveFragment;
                this.$fetchResult = fetchResult;
                this.$url = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$fragment, this.$fetchResult, this.$url, continuation);
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
                LiveFragment liveFragment = this.$fragment;
                Integer resCode = this.$fetchResult.getResCode();
                liveFragment.setFragmentData(null, new ErrorMsg(resCode != null ? resCode.intValue() : FetchErrorCode.ERROR_FETCH_HTTP_ERROR.getEc(), this.$url, this.$fetchResult.getMsg(), null, 8, null));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FragmentDownloader fragmentDownloader, String str, LiveFragment liveFragment, long j7, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = fragmentDownloader;
            this.$url = str;
            this.$fragment = liveFragment;
            this.$fetchBegin = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FragmentDownloader fragmentDownloader, LiveFragment liveFragment, byte[] bArr, int i7, boolean z6) {
            P2PContext.launch$default(fragmentDownloader.p2pContext, null, new FragmentDownloader$startDownload$3$blockCallback$1$1(i7, liveFragment, bArr, fragmentDownloader, null), 1, null);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$url, this.$fragment, this.$fetchBegin, continuation);
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

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$stopDownload$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$stopDownload$1.class */
    public static final class C64701 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final FragmentDownloader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64701(FragmentDownloader fragmentDownloader, Continuation<? super C64701> continuation) {
            super(continuation);
            this.this$0 = fragmentDownloader;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.stopDownload(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.FragmentDownloader$updateSeedAndLackedSemaphoreInstance$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$updateSeedAndLackedSemaphoreInstance$1.class */
    public static final class C64711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int label;
        final FragmentDownloader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64711(FragmentDownloader fragmentDownloader, Continuation<? super C64711> continuation) {
            super(2, continuation);
            this.this$0 = fragmentDownloader;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64711(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:22:0x00bb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b5 -> B:22:0x00bb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00fe -> B:33:0x0139). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0133 -> B:33:0x0139). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 342
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.FragmentDownloader.C64711.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public FragmentDownloader(@NotNull P2PContext p2PContext, @NotNull LiveFragmentSet liveFragmentSet, @NotNull Fetcher fetcher, @NotNull P2PConfig p2PConfig, @NotNull P2PLogger p2PLogger) {
        this.p2pContext = p2PContext;
        this.fragMan = liveFragmentSet;
        this.fetcher = fetcher;
        this.p2pConfig = p2PConfig;
        this.logger = p2PLogger;
        this.ioCoroutineScope = CoroutineScopeKt.CoroutineScope(p2PContext.getIOCoroutineContext());
        this.lastSeedAndLackedMaxInstance = p2PContext.getSistersConfiguration().seedAndLackedMaxInstance;
        this.lastLackedMaxInstance = p2PContext.getSistersConfiguration().lackedMaxInstance;
    }

    public static final /* synthetic */ Fetcher access$getFetcher$p(FragmentDownloader fragmentDownloader) {
        return fragmentDownloader.fetcher;
    }

    public static final /* synthetic */ Semaphore access$getLackedSemaphore$p(FragmentDownloader fragmentDownloader) {
        return fragmentDownloader.lackedSemaphore;
    }

    public static final /* synthetic */ P2PLogger access$getLogger$p(FragmentDownloader fragmentDownloader) {
        return fragmentDownloader.logger;
    }

    public static final /* synthetic */ P2PConfig access$getP2pConfig$p(FragmentDownloader fragmentDownloader) {
        return fragmentDownloader.p2pConfig;
    }

    public static final /* synthetic */ P2PContext access$getP2pContext$p(FragmentDownloader fragmentDownloader) {
        return fragmentDownloader.p2pContext;
    }

    public static final /* synthetic */ Semaphore access$getSeedAndLackedSemaphore$p(FragmentDownloader fragmentDownloader) {
        return fragmentDownloader.seedAndLackedSemaphore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRetry() {
        Function0<Long> function0 = this.getPlayerBufferDuration;
        return (function0 != null ? ((Number) function0.invoke()).longValue() : 0L) > this.p2pConfig.getFetchTimeOut().getRetryBufferThreshold();
    }

    private final void checkFragmentData(LiveFragment liveFragment) {
        Integer num;
        Integer numValueOf;
        int blockCount = liveFragment.getBlockCount();
        int i7 = 0;
        Integer num2 = null;
        while (true) {
            num = num2;
            if (i7 >= blockCount) {
                break;
            }
            if (!liveFragment.isBlockFinished(i7) || num == null) {
                numValueOf = num;
                if (!liveFragment.isBlockFinished(i7)) {
                    numValueOf = num;
                    if (num == null) {
                        numValueOf = Integer.valueOf(i7);
                    }
                }
            } else {
                pullFragmentData(liveFragment, num.intValue(), i7 - 1, DataRoleType.LACKED);
                numValueOf = null;
            }
            i7++;
            num2 = numValueOf;
        }
        if (num != null) {
            pullFragmentData(liveFragment, num.intValue(), liveFragment.getBlockCount() - 1, DataRoleType.LACKED);
        }
    }

    private final void pullFragmentData(LiveFragment liveFragment, int i7, int i8, DataRoleType dataRoleType) {
        if (liveFragment.getUrl() == null) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][tracker=error_url], url is nil", null, 4, null);
        } else {
            if (((Number) liveFragment.getBlockByteRange(i7).getFirst()).intValue() == ((Number) liveFragment.getBlockByteRange(i8).getSecond()).intValue()) {
                return;
            }
            liveFragment.doOnceQueryServer();
            BuildersKt.launch$default(this.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C64691(dataRoleType, this, liveFragment, i7, i8, SystemClock.uptimeMillis(), null), 3, (Object) null);
        }
    }

    public static /* synthetic */ void startDownload$default(FragmentDownloader fragmentDownloader, NyaPeerManager nyaPeerManager, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            nyaPeerManager = null;
        }
        fragmentDownloader.startDownload(nyaPeerManager, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownload$lambda$0(FragmentDownloader fragmentDownloader, LiveFragment liveFragment) {
        fragmentDownloader.checkFragmentData(liveFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownload$lambda$3(FragmentDownloader fragmentDownloader, LiveFragment liveFragment, Set<Integer> set) {
        Integer num;
        if (set.size() > 1) {
            List listSorted = CollectionsKt.sorted(set);
            ArrayList arrayList = new ArrayList();
            Iterator it = listSorted.iterator();
            while (it.hasNext()) {
                Pair<Integer, Integer> sliceBlockRange = liveFragment.getSliceBlockRange(((Number) it.next()).intValue());
                arrayList.add(sliceBlockRange.getFirst());
                arrayList.add(sliceBlockRange.getSecond());
            }
            IntProgression intProgressionH = RangesKt.h(2, RangesKt.until(0, arrayList.size()));
            int first = intProgressionH.getFirst();
            int last = intProgressionH.getLast();
            int step = intProgressionH.getStep();
            Integer num2 = null;
            Integer num3 = null;
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                Integer num4 = null;
                while (true) {
                    if (num3 == null) {
                        num3 = (Integer) arrayList.get(first);
                        num4 = (Integer) arrayList.get(first + 1);
                    } else {
                        int iIntValue = ((Number) arrayList.get(first)).intValue();
                        if (num4 != null && num4.intValue() == iIntValue) {
                            num4 = (Integer) arrayList.get(first + 1);
                        } else {
                            if (num4 != null && !Intrinsics.areEqual(num3, num4) && num4.intValue() - 1 >= 0) {
                                fragmentDownloader.pullFragmentData(liveFragment, num3.intValue(), num4.intValue() - 1, DataRoleType.SEED);
                            }
                            num3 = (Integer) arrayList.get(first);
                            num4 = (Integer) arrayList.get(first + 1);
                        }
                    }
                    num2 = num3;
                    num = num4;
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            } else {
                num = null;
            }
            if (num2 != null && num != null && !Intrinsics.areEqual(num2, num) && num.intValue() - 1 >= 0) {
                fragmentDownloader.pullFragmentData(liveFragment, num2.intValue(), num.intValue() - 1, DataRoleType.SEED);
            }
        } else {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                Pair<Integer, Integer> sliceBlockRange2 = liveFragment.getSliceBlockRange(((Number) it2.next()).intValue());
                if (((Number) sliceBlockRange2.getFirst()).intValue() >= 0 && ((Number) sliceBlockRange2.getSecond()).intValue() > 0 && ((Number) sliceBlockRange2.getFirst()).intValue() != ((Number) sliceBlockRange2.getSecond()).intValue() && ((Number) sliceBlockRange2.getSecond()).intValue() - 1 >= 0) {
                    fragmentDownloader.pullFragmentData(liveFragment, ((Number) sliceBlockRange2.getFirst()).intValue(), ((Number) sliceBlockRange2.getSecond()).intValue() - 1, DataRoleType.SEED);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean addDownloadTask(@NotNull String str, int i7, @Nullable Long l7) {
        this.fragMan.addFragment(str, i7, l7);
        return this.fragMan.getFragment(str) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object destroy(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.FragmentDownloader.destroy(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Function0<Long> getGetPlayerBufferDuration() {
        return this.getPlayerBufferDuration;
    }

    public final void initSeedAndLackedSemaphoreInstance() {
        P2PContext.launch$default(this.p2pContext, null, new C64681(this, null), 1, null);
    }

    public final void setGetPlayerBufferDuration(@Nullable Function0<Long> function0) {
        this.getPlayerBufferDuration = function0;
    }

    public final void startDownload(@Nullable NyaPeerManager nyaPeerManager, @NotNull String str, @NotNull String str2) {
        final LiveFragment fragment = this.fragMan.getFragment(str2);
        if (fragment == null) {
            return;
        }
        fragment.setUrl(str);
        fragment.setCrcErrorCallback(new Function0(this, fragment) { // from class: com.bilibili.sistersplayer.p2p.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FragmentDownloader f104921a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LiveFragment f104922b;

            {
                this.f104921a = this;
                this.f104922b = fragment;
            }

            public final Object invoke() {
                return FragmentDownloader.startDownload$lambda$0(this.f104921a, this.f104922b);
            }
        });
        if (fragment.getFragmentSize() == 0) {
            fragment.doOnceQueryServer();
            BuildersKt.launch$default(this.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, str, SystemClock.uptimeMillis(), fragment, null), 3, (Object) null);
        } else if (nyaPeerManager == null || nyaPeerManager.getConnectedPeers().isEmpty()) {
            fragment.doOnceQueryServer();
            BuildersKt.launch$default(this.ioCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, str, fragment, SystemClock.uptimeMillis(), null), 3, (Object) null);
        } else {
            fragment.setSliceIds(nyaPeerManager.getSliceIds());
            C3958x2 c3958x2 = new C3958x2(2, this, fragment);
            FragmentDownloadP2PRequestFactory2 fragmentDownloadP2PRequestFactory2 = new FragmentDownloadP2PRequestFactory2(this.p2pContext, fragment);
            this.downloaderMap.put(str2, fragmentDownloadP2PRequestFactory2);
            fragmentDownloadP2PRequestFactory2.startDownload(nyaPeerManager, c3958x2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object stopDownload(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.FragmentDownloader.stopDownload(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void updateSeedAndLackedSemaphoreInstance() {
        P2PContext.launch$default(this.p2pContext, null, new C64711(this, null), 1, null);
    }
}
