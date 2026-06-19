package com.bilibili.sistersplayer.net;

import android.support.v4.media.session.a;
import android.util.Log;
import androidx.compose.runtime.snapshots.z;
import androidx.media3.common.PlaybackException;
import com.bilibili.bplus.followinglist.opus.manager.L;
import com.bilibili.sistersplayer.httpserver.SimpleBaseClient;
import com.bilibili.sistersplayer.p2p.QOEConfig;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/net/TestBandwidth.class */
public final class TestBandwidth {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int NUM_COROUTINES = 3;

    @NotNull
    public static final String TAG = "BandwidthTest";
    public static final long TEST_DURATION_MS = 5000;

    @NotNull
    private final OkHttpClient client;

    @Nullable
    private final QOEConfig config;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final CoroutineScope testCoroutineScope;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/net/TestBandwidth$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/net/TestBandwidth$Result.class */
    public static final class Result {
        private final long bandwidth;
        private final long download;
        private final long duration;
        private final long fileSize;

        public Result(long j7, long j8, long j9, long j10) {
            this.bandwidth = j7;
            this.duration = j8;
            this.fileSize = j9;
            this.download = j10;
        }

        public final long getBandwidth() {
            return this.bandwidth;
        }

        public final long getDownload() {
            return this.download;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        @NotNull
        public String toString() {
            long j7 = this.bandwidth;
            long j8 = this.duration;
            long j9 = this.fileSize;
            long j10 = this.download;
            StringBuilder sbA = z.a(j7, "Result(", "kbps, duration=");
            sbA.append(j8);
            J1.z.a(j9, ", file=", "B, download=", sbA);
            return a.a(sbA, j10, "B)");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.net.TestBandwidth$getFileSize$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/net/TestBandwidth$getFileSize$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
        final String $url;
        int label;
        final TestBandwidth this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, TestBandwidth testBandwidth, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = str;
            this.this$0 = testBandwidth;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$url, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Response responseExecute = this.this$0.client.newCall(new Request.Builder().url(this.$url).head().build()).execute();
            try {
                long jLongValue = -1;
                if (responseExecute.isSuccessful()) {
                    String strHeader = responseExecute.header(SimpleBaseClient.CONTENT_LENGTH);
                    jLongValue = -1;
                    if (strHeader != null) {
                        Long longOrNull = StringsKt.toLongOrNull(strHeader);
                        jLongValue = -1;
                        if (longOrNull != null) {
                            jLongValue = longOrNull.longValue();
                        }
                    }
                }
                Long lBoxLong = Boxing.boxLong(jLongValue);
                CloseableKt.closeFinally(responseExecute, (Throwable) null);
                return lBoxLong;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.net.TestBandwidth$safeLaunch$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/net/TestBandwidth$safeLaunch$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function2<CoroutineScope, Continuation<? super Unit>, Object> $action;
        private Object L$0;
        int label;
        final TestBandwidth this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, TestBandwidth testBandwidth, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$action = function2;
            this.this$0 = testBandwidth;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$action, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                this.this$0.logger.logE(TestBandwidth.TAG, "launch error ", e7);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.net.TestBandwidth$test$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/net/TestBandwidth$test$1.class */
    public static final class C64661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function1<Result, Unit> $callback;
        final Function0<Boolean> $keepTest;
        final Long $targetByteCount;
        final String $url;
        int I$0;
        long J$0;
        long J$1;
        long J$2;
        long J$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final TestBandwidth this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C64661(TestBandwidth testBandwidth, String str, Long l7, Function1<? super Result, Unit> function1, Function0<Boolean> function0, Continuation<? super C64661> continuation) {
            super(2, continuation);
            this.this$0 = testBandwidth;
            this.$url = str;
            this.$targetByteCount = l7;
            this.$callback = function1;
            this.$keepTest = function0;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64661(this.this$0, this.$url, this.$targetByteCount, this.$callback, this.$keepTest, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|146|(2:4|(2:6|(15:8|9|10|136|93|94|95|(5:99|(1:152)(3:149|103|153)|150|96|97)|147|106|62|(20:138|64|65|66|67|(6:70|(2:131|72)(1:77)|73|78|79|68)|154|80|144|81|82|127|83|84|85|86|140|87|88|(2:90|91)(10:92|136|93|94|95|(2:96|97)|147|106|62|(8:116|134|117|118|129|119|125|126)(0)))(0)|124|125|126)(2:14|15))(4:16|142|17|18))(18:21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|(2:39|40)(1:41))|133|42|(2:44|45)(12:49|(1:51)(1:52)|53|(1:55)(1:56)|57|(1:59)(1:60)|61|62|(0)(0)|124|125|126)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0238, code lost:
        
            r35 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x023a, code lost:
        
            r36 = r33;
            r33 = r35;
         */
        /* JADX WARN: Not initialized variable reg: 35, insn: 0x00b3: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r35 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:12:0x00b3 */
        /* JADX WARN: Removed duplicated region for block: B:116:0x04c3  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0431 A[Catch: Exception -> 0x0458, TRY_LEAVE, TryCatch #5 {Exception -> 0x0458, blocks: (B:93:0x040a, B:95:0x041b, B:97:0x0429, B:99:0x0431, B:101:0x0442, B:103:0x044d), top: B:136:0x040a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x03dc -> B:136:0x040a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 1392
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.net.TestBandwidth.C64661.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TestBandwidth(@Nullable QOEConfig qOEConfig, @NotNull P2PLogger p2PLogger) {
        this.config = qOEConfig;
        this.logger = p2PLogger;
        this.testCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
        this.client = new OkHttpClient();
    }

    public /* synthetic */ TestBandwidth(QOEConfig qOEConfig, P2PLogger p2PLogger, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : qOEConfig, p2PLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadRange(String str, long j7, long j8, AtomicLong atomicLong, CancellableContinuation<? super Void> cancellableContinuation, long j9, Long l7, Function0<Boolean> function0) {
        Request.Builder builderUrl = new Request.Builder().url(str);
        StringBuilder sbA = z.a(j7, "bytes=", "-");
        sbA.append(j8);
        Request requestBuild = builderUrl.addHeader("Range", sbA.toString()).addHeader("Cache-Control", "no-cache").build();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            cancellableContinuation.invokeOnCancellation(new L(objectRef, 1));
            while (cancellableContinuation.isActive()) {
                if (l7 != null && atomicLong.get() > l7.longValue()) {
                    return;
                }
                if (function0 != null && !((Boolean) function0.invoke()).booleanValue()) {
                    return;
                }
                try {
                    Call callNewCall = this.client.newCall(requestBuild);
                    objectRef.element = callNewCall;
                    Response responseExecute = callNewCall.execute();
                    try {
                        if (!responseExecute.isSuccessful() && responseExecute.code() != 206) {
                            Log.e(TAG, "fail range: " + j7 + "-" + j8 + ", code: " + responseExecute.code());
                            CloseableKt.closeFinally(responseExecute, (Throwable) null);
                            return;
                        }
                        ResponseBody responseBodyBody = responseExecute.body();
                        if (responseBodyBody != null) {
                            byte[] bArr = new byte[4096];
                            InputStream inputStreamByteStream = responseBodyBody.byteStream();
                            long j10 = 0;
                            while (true) {
                                int i7 = inputStreamByteStream.read(bArr);
                                if (i7 == -1) {
                                    break;
                                }
                                long j11 = i7;
                                j10 += j11;
                                atomicLong.addAndGet(j11);
                                if (j10 < j8 - j7) {
                                    if ((l7 != null && atomicLong.get() >= l7.longValue()) || (function0 != null && !((Boolean) function0.invoke()).booleanValue())) {
                                        break;
                                    } else if (cancellableContinuation.isCancelled()) {
                                        inputStreamByteStream.close();
                                        break;
                                    }
                                } else {
                                    inputStreamByteStream.close();
                                    break;
                                }
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(responseExecute, (Throwable) null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(responseExecute, th);
                            throw th2;
                        }
                    }
                } catch (SocketException | SocketTimeoutException | StreamResetException | IOException | Exception e7) {
                    return;
                }
            }
        } catch (SocketException | SocketTimeoutException | StreamResetException | IOException | Exception e8) {
        }
    }

    public static /* synthetic */ void downloadRange$default(TestBandwidth testBandwidth, String str, long j7, long j8, AtomicLong atomicLong, CancellableContinuation cancellableContinuation, long j9, Long l7, Function0 function0, int i7, Object obj) {
        if ((i7 & 64) != 0) {
            l7 = null;
        }
        testBandwidth.downloadRange(str, j7, j8, atomicLong, cancellableContinuation, j9, l7, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadRange$lambda$0(Ref.ObjectRef objectRef, Throwable th) {
        Call call = (Call) objectRef.element;
        if (call != null) {
            call.cancel();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getCurrentSPeed(long j7, AtomicLong atomicLong) {
        double dCurrentTimeMillis = (System.currentTimeMillis() - j7) / 1000.0d;
        double d7 = (((long) 8) * r0) / (((double) 1000) * dCurrentTimeMillis);
        double d8 = atomicLong.get() / (dCurrentTimeMillis * ((double) PlaybackException.CUSTOM_ERROR_CODE_BASE));
        String.format("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((r0 / ((long) 1024)) / 1024.0d)}, 1));
        String.format("%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d7)}, 1));
        String.format("%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d8)}, 1));
        return d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileSize(String str, Continuation<? super Long> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, this, null), continuation);
    }

    private final Job safeLaunch(CoroutineScope coroutineScope, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (CoroutineScopeKt.isActive(this.testCoroutineScope)) {
            return BuildersKt.launch(coroutineScope, Dispatchers.getIO(), coroutineStart, new AnonymousClass1(function2, this, null));
        }
        this.logger.logE(TAG, "!!!!! is destroy !!!!!", new Throwable());
        return null;
    }

    public static /* synthetic */ Job safeLaunch$default(TestBandwidth testBandwidth, CoroutineScope coroutineScope, CoroutineStart coroutineStart, Function2 function2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return testBandwidth.safeLaunch(coroutineScope, coroutineStart, function2);
    }

    private final void test(String str, Long l7, Function0<Boolean> function0, Function1<? super Result, Unit> function1) {
        safeLaunch$default(this, this.testCoroutineScope, null, new C64661(this, str, l7, function1, function0, null), 1, null);
    }

    @Nullable
    public final QOEConfig getConfig() {
        return this.config;
    }

    public final void release() {
        CoroutineScopeKt.cancel$default(this.testCoroutineScope, (CancellationException) null, 1, (Object) null);
    }

    public final void startTest(@NotNull String str, long j7, @NotNull Function0<Boolean> function0, @NotNull Function1<? super Result, Unit> function1) {
        test(str, Long.valueOf((j7 * 5000) / ((long) 1000)), function0, function1);
    }

    public final void startTest(@NotNull String str, @NotNull Function1<? super Result, Unit> function1) {
        test(str, null, null, function1);
    }
}
