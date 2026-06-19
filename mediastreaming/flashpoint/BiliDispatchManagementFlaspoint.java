package com.bilibili.mediastreaming.flashpoint;

import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.C4277b;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.A;
import androidx.fragment.app.D;
import androidx.media3.exoplayer.C4690e;
import cf.p;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import com.bilibili.live.streaming.LivePush;
import com.bilibili.mediastreaming.data.BiliProtocol;
import com.bilibili.mediastreaming.data.BiliStatus;
import com.bilibili.mediastreaming.enums.BiliAudioCodec;
import com.bilibili.mediastreaming.enums.BiliFlashpointErrorType;
import com.bilibili.mediastreaming.enums.BiliFlashpointPacketType;
import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import com.bilibili.mediastreaming.enums.ConnectedStatusCode;
import com.bilibili.mediastreaming.enums.ConnectingStatusCode;
import com.bilibili.mediastreaming.enums.DisConnectStatusCode;
import com.bilibili.mediastreaming.enums.ErrorCode;
import com.bilibili.mediastreaming.enums.FirstPacketStatusCode;
import com.bilibili.mediastreaming.enums.SendPacketStatusCode;
import com.bilibili.mediastreaming.enums.StartStatusCode;
import com.bilibili.mediastreaming.enums.StoppedStatusCode;
import com.bilibili.mediastreaming.enums.StoppingStatusCode;
import com.bilibili.mediastreaming.flashpoint.h;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint.class */
public final class BiliDispatchManagementFlaspoint implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f65981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public LivePush f65982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65983d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f65989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f65990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f65991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f65992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f65993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f65994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f65995q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f65980a = new g("BiliDispatchManagementFlaspoint");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public BiliAudioCodec f65984e = BiliAudioCodec.AAC;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public BiliVideoCodec f65985f = BiliVideoCodec.AVC;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, h> f65986g = new ConcurrentHashMap<>();

    @NotNull
    public final ConcurrentHashMap<String, h.a> h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65987i = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault().limitedParallelism(1)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65988j = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(ThreadPoolDispatcherKt.newSingleThreadContext("PushStatsThreadCtx")));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f65996r = 1000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f65997s = 200;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f65998t = 60000;

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onConnectStats$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onConnectStats$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $connectStatsJsonArray;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, long j7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$connectStatsJsonArray = str;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$connectStatsJsonArray, this.$timestampMs, continuation);
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
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onConnectStats(this.$connectStatsJsonArray, this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onConnected$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onConnected$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $errorMessage;
        final String $protocolType;
        final String $pushUri;
        final int $retryCount;
        final int $socketFd;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i7, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, String str3, int i8, long j7, int i9, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$statusCode = i7;
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$protocolType = str2;
            this.$errorMessage = str3;
            this.$retryCount = i8;
            this.$timestampMs = j7;
            this.$socketFd = i9;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$statusCode, this.this$0, this.$pushUri, this.$protocolType, this.$errorMessage, this.$retryCount, this.$timestampMs, this.$socketFd, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ConnectedStatusCode connectedStatusCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConnectedStatusCode.a aVar = ConnectedStatusCode.Companion;
            int i7 = this.$statusCode;
            aVar.getClass();
            if (i7 < 0 || i7 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i7, "Invalid status code range: ").toString());
            }
            ConnectedStatusCode[] connectedStatusCodeArrValues = ConnectedStatusCode.values();
            int length = connectedStatusCodeArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    connectedStatusCode = null;
                    break;
                }
                connectedStatusCode = connectedStatusCodeArrValues[i8];
                if ((connectedStatusCode.mo7062getValuew2LRezQ() & 255) == i7) {
                    break;
                }
                i8++;
            }
            ConnectedStatusCode connectedStatusCode2 = connectedStatusCode;
            if (connectedStatusCode == null) {
                connectedStatusCode2 = ConnectedStatusCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            String str3 = this.$errorMessage;
            int i9 = this.$retryCount;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onConnected, pushUri:", str, ", protocolType:", str2, ", errorCode:");
            sbA.append(connectedStatusCode2);
            sbA.append(", errorMessage:");
            sbA.append(str3);
            sbA.append(", retryCount:");
            sbA.append(i9);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onConnected(new BiliProtocol(this.$pushUri, this.$protocolType), this.$socketFd, new BiliStatus<>(connectedStatusCode2, this.$errorMessage), this.$retryCount, this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onConnectedFirstPacket$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onConnectedFirstPacket$1.class */
    public static final class C54081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $message;
        final int $packetType;
        final String $protocolType;
        final String $pushUri;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54081(int i7, int i8, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, String str3, long j7, Continuation<? super C54081> continuation) {
            super(2, continuation);
            this.$packetType = i7;
            this.$statusCode = i8;
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$protocolType = str2;
            this.$message = str3;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54081(this.$packetType, this.$statusCode, this.this$0, this.$pushUri, this.$protocolType, this.$message, this.$timestampMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            FirstPacketStatusCode firstPacketStatusCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BiliFlashpointPacketType.a aVar = BiliFlashpointPacketType.Companion;
            int i7 = this.$packetType;
            aVar.getClass();
            BiliFlashpointPacketType biliFlashpointPacketType = (BiliFlashpointPacketType) BiliFlashpointPacketType.map.get(Integer.valueOf(i7));
            BiliFlashpointPacketType biliFlashpointPacketType2 = biliFlashpointPacketType;
            if (biliFlashpointPacketType == null) {
                biliFlashpointPacketType2 = BiliFlashpointPacketType.UN_DEFINE;
            }
            FirstPacketStatusCode.a aVar2 = FirstPacketStatusCode.Companion;
            int i8 = this.$statusCode;
            aVar2.getClass();
            if (i8 < 0 || i8 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i8, "Invalid status code range: ").toString());
            }
            FirstPacketStatusCode[] firstPacketStatusCodeArrValues = FirstPacketStatusCode.values();
            int length = firstPacketStatusCodeArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    firstPacketStatusCode = null;
                    break;
                }
                firstPacketStatusCode = firstPacketStatusCodeArrValues[i9];
                if ((firstPacketStatusCode.mo7062getValuew2LRezQ() & 255) == i8) {
                    break;
                }
                i9++;
            }
            FirstPacketStatusCode firstPacketStatusCode2 = firstPacketStatusCode;
            if (firstPacketStatusCode == null) {
                firstPacketStatusCode2 = FirstPacketStatusCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            String str3 = this.$message;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onConnectedFirstPacket, pushUri:", str, ", protocolType:", str2, ", packetType:");
            sbA.append(biliFlashpointPacketType2);
            sbA.append(", errorCode:");
            sbA.append(firstPacketStatusCode2);
            sbA.append(", message:");
            sbA.append(str3);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onConnectedFirstPacket(new BiliProtocol(this.$pushUri, this.$protocolType), biliFlashpointPacketType2, new BiliStatus<>(firstPacketStatusCode2, this.$message), this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onConnecting$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onConnecting$1.class */
    public static final class C54091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $errorMessage;
        final String $protocolType;
        final String $pushUri;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54091(int i7, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, String str3, long j7, Continuation<? super C54091> continuation) {
            super(2, continuation);
            this.$statusCode = i7;
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$protocolType = str2;
            this.$errorMessage = str3;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54091(this.$statusCode, this.this$0, this.$pushUri, this.$protocolType, this.$errorMessage, this.$timestampMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ConnectingStatusCode connectingStatusCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConnectingStatusCode.a aVar = ConnectingStatusCode.Companion;
            int i7 = this.$statusCode;
            aVar.getClass();
            if (i7 < 0 || i7 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i7, "Invalid status code range: ").toString());
            }
            ConnectingStatusCode[] connectingStatusCodeArrValues = ConnectingStatusCode.values();
            int length = connectingStatusCodeArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    connectingStatusCode = null;
                    break;
                }
                connectingStatusCode = connectingStatusCodeArrValues[i8];
                if ((connectingStatusCode.mo7062getValuew2LRezQ() & 255) == i7) {
                    break;
                }
                i8++;
            }
            ConnectingStatusCode connectingStatusCode2 = connectingStatusCode;
            if (connectingStatusCode == null) {
                connectingStatusCode2 = ConnectingStatusCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            String str3 = this.$errorMessage;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onConnecting, pushUri:", str, ", protocolType:", str2, ", errorCode:");
            sbA.append(connectingStatusCode2);
            sbA.append(", errorMessage:");
            sbA.append(str3);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onConnecting(new BiliProtocol(this.$pushUri, this.$protocolType), new BiliStatus<>(connectingStatusCode2, this.$errorMessage), this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onDisconnect$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onDisconnect$1.class */
    public static final class C54101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $message;
        final String $protocolType;
        final String $pushUri;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54101(int i7, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, String str3, long j7, Continuation<? super C54101> continuation) {
            super(2, continuation);
            this.$statusCode = i7;
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$protocolType = str2;
            this.$message = str3;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54101(this.$statusCode, this.this$0, this.$pushUri, this.$protocolType, this.$message, this.$timestampMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            DisConnectStatusCode disConnectStatusCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DisConnectStatusCode.a aVar = DisConnectStatusCode.Companion;
            int i7 = this.$statusCode;
            aVar.getClass();
            if (i7 < 0 || i7 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i7, "Invalid status code range: ").toString());
            }
            DisConnectStatusCode[] disConnectStatusCodeArrValues = DisConnectStatusCode.values();
            int length = disConnectStatusCodeArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    disConnectStatusCode = null;
                    break;
                }
                disConnectStatusCode = disConnectStatusCodeArrValues[i8];
                if ((disConnectStatusCode.mo7062getValuew2LRezQ() & 255) == i7) {
                    break;
                }
                i8++;
            }
            DisConnectStatusCode disConnectStatusCode2 = disConnectStatusCode;
            if (disConnectStatusCode == null) {
                disConnectStatusCode2 = DisConnectStatusCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            String str3 = this.$message;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onDisconnect, pushUri:", str, ", protocolType:", str2, ", errorCode:");
            sbA.append(disConnectStatusCode2);
            sbA.append(", message:");
            sbA.append(str3);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onDisconnect(new BiliProtocol(this.$pushUri, this.$protocolType), new BiliStatus<>(disConnectStatusCode2, this.$message), this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onError$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onError$1.class */
    public static final class C54111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final int $errorType;
        final String $message;
        final String $protocolType;
        final String $pushUri;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54111(int i7, int i8, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, String str3, long j7, Continuation<? super C54111> continuation) {
            super(2, continuation);
            this.$errorType = i7;
            this.$statusCode = i8;
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$protocolType = str2;
            this.$message = str3;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54111(this.$errorType, this.$statusCode, this.this$0, this.$pushUri, this.$protocolType, this.$message, this.$timestampMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ErrorCode errorCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BiliFlashpointErrorType.a aVar = BiliFlashpointErrorType.Companion;
            int i7 = this.$errorType;
            aVar.getClass();
            BiliFlashpointErrorType biliFlashpointErrorType = (BiliFlashpointErrorType) BiliFlashpointErrorType.map.get(Integer.valueOf(i7));
            BiliFlashpointErrorType biliFlashpointErrorType2 = biliFlashpointErrorType;
            if (biliFlashpointErrorType == null) {
                biliFlashpointErrorType2 = BiliFlashpointErrorType.UN_DEFINE;
            }
            ErrorCode.a aVar2 = ErrorCode.Companion;
            int i8 = this.$statusCode;
            aVar2.getClass();
            if (i8 < 0 || i8 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i8, "Invalid status code range: ").toString());
            }
            ErrorCode[] errorCodeArrValues = ErrorCode.values();
            int length = errorCodeArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    errorCode = null;
                    break;
                }
                errorCode = errorCodeArrValues[i9];
                if ((errorCode.mo7062getValuew2LRezQ() & 255) == i8) {
                    break;
                }
                i9++;
            }
            ErrorCode errorCode2 = errorCode;
            if (errorCode == null) {
                errorCode2 = ErrorCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            String str3 = this.$message;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onError, pushUri:", str, ", protocolType:", str2, ", errorType:");
            sbA.append(biliFlashpointErrorType2);
            sbA.append(", errorCode:");
            sbA.append(errorCode2);
            sbA.append(", message:");
            sbA.append(str3);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onError(new BiliProtocol(this.$pushUri, this.$protocolType), biliFlashpointErrorType2, new BiliStatus<>(errorCode2, this.$message), this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onEvent$1.class */
    public static final class C54121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $eventId;
        final String $eventMessage;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54121(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, long j7, Continuation<? super C54121> continuation) {
            super(2, continuation);
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$eventId = str;
            this.$eventMessage = str2;
            this.$timestampMs = j7;
        }

        private static final String invokeSuspend$lambda$0(String str, String str2, long j7) {
            StringBuilder sbA = G0.b.a("onEvent, eventId:", str, ", eventMessage:", str2, ", timestampMs:");
            sbA.append(j7);
            return sbA.toString();
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54121(this.this$0, this.$eventId, this.$eventMessage, this.$timestampMs, continuation);
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
            g gVar = this.this$0.f65980a;
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onEvent(this.$eventId, this.$eventMessage, this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onNetStats$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onNetStats$2.class */
    public static final class C54132 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $netStatsJsonArray;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54132(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, long j7, Continuation<? super C54132> continuation) {
            super(2, continuation);
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$netStatsJsonArray = str;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54132(this.this$0, this.$netStatsJsonArray, this.$timestampMs, continuation);
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
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onNetStats(this.$netStatsJsonArray, this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onSendPacketFail$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onSendPacketFail$1.class */
    public static final class C54141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $message;
        final int $packetType;
        final String $protocolType;
        final String $pushUri;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54141(int i7, int i8, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, String str3, long j7, Continuation<? super C54141> continuation) {
            super(2, continuation);
            this.$packetType = i7;
            this.$statusCode = i8;
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$protocolType = str2;
            this.$message = str3;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54141(this.$packetType, this.$statusCode, this.this$0, this.$pushUri, this.$protocolType, this.$message, this.$timestampMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            SendPacketStatusCode sendPacketStatusCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BiliFlashpointPacketType.a aVar = BiliFlashpointPacketType.Companion;
            int i7 = this.$packetType;
            aVar.getClass();
            BiliFlashpointPacketType biliFlashpointPacketType = (BiliFlashpointPacketType) BiliFlashpointPacketType.map.get(Integer.valueOf(i7));
            BiliFlashpointPacketType biliFlashpointPacketType2 = biliFlashpointPacketType;
            if (biliFlashpointPacketType == null) {
                biliFlashpointPacketType2 = BiliFlashpointPacketType.UN_DEFINE;
            }
            SendPacketStatusCode.a aVar2 = SendPacketStatusCode.Companion;
            int i8 = this.$statusCode;
            aVar2.getClass();
            if (i8 < 0 || i8 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i8, "Invalid status code range: ").toString());
            }
            SendPacketStatusCode[] sendPacketStatusCodeArrValues = SendPacketStatusCode.values();
            int length = sendPacketStatusCodeArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    sendPacketStatusCode = null;
                    break;
                }
                sendPacketStatusCode = sendPacketStatusCodeArrValues[i9];
                if ((sendPacketStatusCode.mo7062getValuew2LRezQ() & 255) == i8) {
                    break;
                }
                i9++;
            }
            SendPacketStatusCode sendPacketStatusCode2 = sendPacketStatusCode;
            if (sendPacketStatusCode == null) {
                sendPacketStatusCode2 = SendPacketStatusCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            String str3 = this.$message;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onSendPacketFail, pushUri:", str, ", protocolType:", str2, ", packetType:");
            sbA.append(biliFlashpointPacketType2);
            sbA.append(", errorCode:");
            sbA.append(sendPacketStatusCode2);
            sbA.append(", message:");
            sbA.append(str3);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onSendPacketFail(new BiliProtocol(this.$pushUri, this.$protocolType), biliFlashpointPacketType2, new BiliStatus<>(sendPacketStatusCode2, this.$message), this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onStart$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onStart$1.class */
    public static final class C54151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $errorMessage;
        final String $protocolType;
        final String $pushUri;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54151(int i7, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, String str3, long j7, Continuation<? super C54151> continuation) {
            super(2, continuation);
            this.$statusCode = i7;
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$protocolType = str2;
            this.$errorMessage = str3;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54151(this.$statusCode, this.this$0, this.$pushUri, this.$protocolType, this.$errorMessage, this.$timestampMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StartStatusCode startStatusCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StartStatusCode.a aVar = StartStatusCode.Companion;
            int i7 = this.$statusCode;
            aVar.getClass();
            if (i7 < 0 || i7 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i7, "Invalid status code range: ").toString());
            }
            StartStatusCode[] startStatusCodeArrValues = StartStatusCode.values();
            int length = startStatusCodeArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    startStatusCode = null;
                    break;
                }
                startStatusCode = startStatusCodeArrValues[i8];
                if ((startStatusCode.mo7062getValuew2LRezQ() & 255) == i7) {
                    break;
                }
                i8++;
            }
            StartStatusCode startStatusCode2 = startStatusCode;
            if (startStatusCode == null) {
                startStatusCode2 = StartStatusCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            String str3 = this.$errorMessage;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onStart, pushUri:", str, ", protocolType:", str2, ", errorCode:");
            sbA.append(startStatusCode2);
            sbA.append(", errorMessage:");
            sbA.append(str3);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onStart(new BiliProtocol(this.$pushUri, this.$protocolType), new BiliStatus<>(startStatusCode2, this.$errorMessage), this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onStopped$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onStopped$1.class */
    public static final class C54161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $message;
        final String $protocolType;
        final String $pushUri;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54161(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, int i7, String str2, String str3, long j7, Continuation<? super C54161> continuation) {
            super(2, continuation);
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$statusCode = i7;
            this.$protocolType = str2;
            this.$message = str3;
            this.$timestampMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54161(this.this$0, this.$pushUri, this.$statusCode, this.$protocolType, this.$message, this.$timestampMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StoppedStatusCode stoppedStatusCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.this$0.h.containsKey(this.$pushUri)) {
                h.a aVar = this.this$0.h.get(this.$pushUri);
                if (aVar != null) {
                    aVar.destroy();
                }
                this.this$0.h.remove(this.$pushUri);
            }
            StoppedStatusCode.a aVar2 = StoppedStatusCode.Companion;
            int i7 = this.$statusCode;
            aVar2.getClass();
            if (i7 < 0 || i7 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i7, "Invalid status code range: ").toString());
            }
            StoppedStatusCode[] stoppedStatusCodeArrValues = StoppedStatusCode.values();
            int length = stoppedStatusCodeArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    stoppedStatusCode = null;
                    break;
                }
                stoppedStatusCode = stoppedStatusCodeArrValues[i8];
                if ((stoppedStatusCode.mo7062getValuew2LRezQ() & 255) == i7) {
                    break;
                }
                i8++;
            }
            StoppedStatusCode stoppedStatusCode2 = stoppedStatusCode;
            if (stoppedStatusCode == null) {
                stoppedStatusCode2 = StoppedStatusCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            String str3 = this.$message;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onStopped, pushUri:", str, ", protocolType:", str2, ", errorCode:");
            sbA.append(stoppedStatusCode2);
            sbA.append(", message:");
            sbA.append(str3);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onStopped(new BiliProtocol(this.$pushUri, this.$protocolType), new BiliStatus<>(stoppedStatusCode2, this.$message), this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint$onStopping$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$onStopping$1.class */
    public static final class C54171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $message;
        final String $protocolType;
        final String $pushUri;
        final int $statusCode;
        final long $timestampMs;
        int label;
        final BiliDispatchManagementFlaspoint this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54171(int i7, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, String str2, long j7, String str3, Continuation<? super C54171> continuation) {
            super(2, continuation);
            this.$statusCode = i7;
            this.this$0 = biliDispatchManagementFlaspoint;
            this.$pushUri = str;
            this.$protocolType = str2;
            this.$timestampMs = j7;
            this.$message = str3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C54171(this.$statusCode, this.this$0, this.$pushUri, this.$protocolType, this.$timestampMs, this.$message, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StoppingStatusCode stoppingStatusCode;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StoppingStatusCode.a aVar = StoppingStatusCode.Companion;
            int i7 = this.$statusCode;
            aVar.getClass();
            if (i7 < 0 || i7 >= 256) {
                throw new IllegalArgumentException(C3259x.a(i7, "Invalid status code range: ").toString());
            }
            StoppingStatusCode[] stoppingStatusCodeArrValues = StoppingStatusCode.values();
            int length = stoppingStatusCodeArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    stoppingStatusCode = null;
                    break;
                }
                stoppingStatusCode = stoppingStatusCodeArrValues[i8];
                if ((stoppingStatusCode.mo7062getValuew2LRezQ() & 255) == i7) {
                    break;
                }
                i8++;
            }
            StoppingStatusCode stoppingStatusCode2 = stoppingStatusCode;
            if (stoppingStatusCode == null) {
                stoppingStatusCode2 = StoppingStatusCode.UN_DEFINE;
            }
            BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
            String str = this.$pushUri;
            String str2 = this.$protocolType;
            long j7 = this.$timestampMs;
            StringBuilder sbA = G0.b.a("onStopping, pushUri:", str, ", protocolType:", str2, ", stoppingStatus:");
            sbA.append(stoppingStatusCode2);
            sbA.append(", timestampMs:");
            sbA.append(j7);
            biliDispatchManagementFlaspoint.logInfo(sbA.toString(), null, null, null);
            LivePush livePush = this.this$0.f65982c;
            if (livePush != null) {
                livePush.onStopping(new BiliProtocol(this.$pushUri, this.$protocolType), new BiliStatus<>(stoppingStatusCode2, this.$message), this.$timestampMs);
            }
            return Unit.INSTANCE;
        }
    }

    public BiliDispatchManagementFlaspoint(@NotNull String str) {
        this.f65981b = nativeCreate(str, this);
    }

    public static void C(final BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, String str2, int i7) {
        if ((i7 & 1) != 0) {
            num = null;
        }
        if ((i7 & 2) != 0) {
            num2 = null;
        }
        if ((i7 & 4) != 0) {
            num3 = null;
        }
        if ((i7 & 8) != 0) {
            num4 = null;
        }
        if ((i7 & 16) != 0) {
            str = null;
        }
        if ((i7 & 32) != 0) {
            num5 = null;
        }
        if ((i7 & 64) != 0) {
            num6 = null;
        }
        if ((i7 & 128) != 0) {
            num7 = null;
        }
        if ((i7 & 256) != 0) {
            str2 = null;
        }
        synchronized (biliDispatchManagementFlaspoint) {
            final Integer num8 = num;
            final Integer num9 = num2;
            final Integer num10 = num3;
            final Integer num11 = num4;
            final String str3 = str;
            final Integer num12 = num5;
            final Integer num13 = num6;
            final Integer num14 = num7;
            final String str4 = str2;
            final String str5 = null;
        }
    }

    public static Integer a(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, byte[] bArr, String str, int i7, int i8, int i9, int i10) {
        return Integer.valueOf(biliDispatchManagementFlaspoint.nativeSendAudioConfig(biliDispatchManagementFlaspoint.f65981b, bArr, str, i7, i8, i9, i10));
    }

    public static Unit d(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint) {
        biliDispatchManagementFlaspoint.logInfo("destroy----->", null, null, null);
        biliDispatchManagementFlaspoint.nativeDetach(biliDispatchManagementFlaspoint.f65981b);
        biliDispatchManagementFlaspoint.nativeDestroy(biliDispatchManagementFlaspoint.f65981b);
        biliDispatchManagementFlaspoint.f65981b = 0L;
        biliDispatchManagementFlaspoint.f65982c = null;
        biliDispatchManagementFlaspoint.logInfo(C3259x.a(biliDispatchManagementFlaspoint.f65986g.size(), "flashpointFactoryMap size:"), null, null, null);
        biliDispatchManagementFlaspoint.f65986g.clear();
        try {
            CoroutineScopeKt.cancel$default(biliDispatchManagementFlaspoint.f65987i, (CancellationException) null, 1, (Object) null);
        } catch (Exception e7) {
            i.c(biliDispatchManagementFlaspoint, "defaultCoroutineScope.cancel(), exception, msg:" + e7.getMessage(), e7, 6);
        }
        biliDispatchManagementFlaspoint.logInfo("<-----destroy done!", null, null, null);
        return Unit.INSTANCE;
    }

    public static String e(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint) {
        return biliDispatchManagementFlaspoint.nativeDumpAllReports(biliDispatchManagementFlaspoint.f65981b);
    }

    public static Integer f(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, byte[] bArr, long j7, long j8, String str, int i7, int i8, int i9, int i10) {
        return Integer.valueOf(biliDispatchManagementFlaspoint.nativeSendAudioPacket(biliDispatchManagementFlaspoint.f65981b, bArr, j7, j8, str, i7, i8, i9, i10));
    }

    public static Integer g(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, String str2, String str3) {
        StringBuilder sbB = A.b("updateMetadata, vw:", num, ", vh:", num2, ", vframerate:");
        Ul.a.a(sbB, num3, ", vbitrate:", num4, ", vCodecName:");
        p.a(num5, str, ", achannel:", ", asamplerate:", sbB);
        Ul.a.a(sbB, num6, ", abitrate:", num7, ", aCodecName:");
        biliDispatchManagementFlaspoint.logInfo(D.a(str2, ", encoderName:", str3, sbB), null, null, null);
        return Integer.valueOf(biliDispatchManagementFlaspoint.nativeSendMetadata(biliDispatchManagementFlaspoint.f65981b, num, num2, num3, num4, str, num5, num6, num7, str2, str3, false));
    }

    public static Integer h(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, byte[] bArr, String str, int i7, int i8, int i9, int i10, boolean z6) {
        return Integer.valueOf(biliDispatchManagementFlaspoint.nativeSendVideoConfig(biliDispatchManagementFlaspoint.f65981b, bArr, str, i7, i8, i9, i10, z6));
    }

    public static void i(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, int i7, int i8, int i9, int i10, String str, int i11, int i12, int i13, String str2) {
        if (biliDispatchManagementFlaspoint.f65983d) {
            return;
        }
        StringBuilder sbB = Vn.A.b(i7, i8, "initMetadata, vw:", ", vh:", ", vframerate:");
        C4690e.a(i9, i10, ", vbitrate:", ", vCodecName:", sbB);
        H0.e.b(i11, str, ", achannel:", ", asamplerate:", sbB);
        C4690e.a(i12, i13, ", abitrate:", ", aCodecName:audio/mp4a-latm, encoderName:", sbB);
        sbB.append(str2);
        biliDispatchManagementFlaspoint.logInfo(sbB.toString(), null, null, null);
        biliDispatchManagementFlaspoint.nativeSendMetadata(biliDispatchManagementFlaspoint.f65981b, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), "audio/mp4a-latm", str2, true);
        biliDispatchManagementFlaspoint.f65983d = true;
    }

    @Keep
    private final boolean isAudioPacketAAC() {
        boolean z6 = this.f65984e == BiliAudioCodec.AAC;
        logInfo(com.bilibili.app.comm.bh.x5.b.a("isAudioPacketAAC:", z6), null, null, null);
        return z6;
    }

    @Keep
    private final boolean isVideoPacketAV1() {
        boolean z6 = this.f65985f == BiliVideoCodec.AV1;
        logInfo(com.bilibili.app.comm.bh.x5.b.a("isVideoPacketAV1:", z6), null, null, null);
        return z6;
    }

    @Keep
    private final boolean isVideoPacketAVC() {
        boolean z6 = this.f65985f == BiliVideoCodec.AVC;
        logInfo(com.bilibili.app.comm.bh.x5.b.a("isVideoPacketAVC:", z6), null, null, null);
        return z6;
    }

    @Keep
    private final boolean isVideoPacketBILIHEVC() {
        boolean z6 = this.f65985f == BiliVideoCodec.BILI_HEVC;
        logInfo(com.bilibili.app.comm.bh.x5.b.a("isVideoPacketBILIHEVC:", z6), null, null, null);
        return z6;
    }

    @Keep
    private final boolean isVideoPacketHEVC() {
        boolean z6 = this.f65985f == BiliVideoCodec.HEVC;
        logInfo(com.bilibili.app.comm.bh.x5.b.a("isVideoPacketHEVC:", z6), null, null, null);
        return z6;
    }

    public static Integer j(String str, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint) {
        biliDispatchManagementFlaspoint.logInfo(C4496a.a("stopPush, uri:", str), null, null, null);
        if (str.length() == 0 || StringsKt.isBlank(str)) {
            biliDispatchManagementFlaspoint.z();
            biliDispatchManagementFlaspoint.A();
            try {
                Job job = biliDispatchManagementFlaspoint.f65989k;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                biliDispatchManagementFlaspoint.f65989k = null;
            } catch (Exception e7) {
                i.c(biliDispatchManagementFlaspoint, "job or scope cancel exception, msg:" + e7.getMessage(), e7, 6);
            }
        }
        return Integer.valueOf(biliDispatchManagementFlaspoint.nativeStopPush(biliDispatchManagementFlaspoint.f65981b, str));
    }

    public static final Boolean k(final BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, final int i7) {
        biliDispatchManagementFlaspoint.getClass();
        biliDispatchManagementFlaspoint.logInfo("innerChangeGetConnectInfoLoopTime, intervalTimeS:" + i7, null, null, null);
        return (Boolean) biliDispatchManagementFlaspoint.p("innerChangeGetConnectInfoLoopTime", new Function0(biliDispatchManagementFlaspoint, i7) { // from class: com.bilibili.mediastreaming.flashpoint.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliDispatchManagementFlaspoint f66022a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f66023b;

            {
                this.f66022a = biliDispatchManagementFlaspoint;
                this.f66023b = i7;
            }

            public final Object invoke() {
                Boolean bool;
                StringBuilder sb = new StringBuilder("innerChangeGetConnectInfoLoopTime, intervalTime ");
                int i8 = this.f66023b;
                String strA = C4277b.a(i8, DynamicModel.KEY_ABBR_ADYNAMIC_SWI, sb);
                BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint2 = this.f66022a;
                biliDispatchManagementFlaspoint2.logInfo(strA, null, null, null);
                if (i8 < 1) {
                    bool = Boolean.FALSE;
                } else {
                    biliDispatchManagementFlaspoint2.f65996r = i8 * 1000;
                    biliDispatchManagementFlaspoint2.f65993o = 0L;
                    bool = Boolean.TRUE;
                }
                return bool;
            }
        });
    }

    public static final Boolean l(final BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, final int i7) {
        biliDispatchManagementFlaspoint.getClass();
        biliDispatchManagementFlaspoint.logInfo("innerChangeGetNetInfoLoopTime, intervalTimeMs:" + i7, null, null, null);
        return (Boolean) biliDispatchManagementFlaspoint.p("innerChangeGetNetInfoLoopTime", new Function0(biliDispatchManagementFlaspoint, i7) { // from class: com.bilibili.mediastreaming.flashpoint.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliDispatchManagementFlaspoint f66009a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f66010b;

            {
                this.f66009a = biliDispatchManagementFlaspoint;
                this.f66010b = i7;
            }

            public final Object invoke() {
                Boolean bool;
                StringBuilder sb = new StringBuilder("innerChangeGetNetInfoLoopTime, intervalTime ");
                int i8 = this.f66010b;
                String strA = C4277b.a(i8, "ms", sb);
                BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint2 = this.f66009a;
                biliDispatchManagementFlaspoint2.logInfo(strA, null, null, null);
                if (i8 < 200) {
                    bool = Boolean.FALSE;
                } else {
                    biliDispatchManagementFlaspoint2.f65997s = i8;
                    biliDispatchManagementFlaspoint2.f65994p = 0L;
                    bool = Boolean.TRUE;
                }
                return bool;
            }
        });
    }

    public static final void m(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint) {
        if (biliDispatchManagementFlaspoint.f65989k != null) {
            return;
        }
        biliDispatchManagementFlaspoint.f65989k = BuildersKt.launch$default(biliDispatchManagementFlaspoint.f65988j, (CoroutineContext) null, (CoroutineStart) null, new BiliDispatchManagementFlaspoint$innerStartStatsDeliverLoop$1(biliDispatchManagementFlaspoint, null), 3, (Object) null);
    }

    private final native boolean nativeChangeDumpReportIntervalTime(long j7, int i7);

    private final native boolean nativeChangeGetConnectIntervalTime(long j7, long j8);

    private final native boolean nativeChangeGetNetStatsIntervalTime(long j7, long j8);

    private final native long nativeCreate(String str, BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint);

    private final native void nativeDestroy(long j7);

    private final native void nativeDetach(long j7);

    private final native String nativeDumpAllReports(long j7);

    private final native String nativeGetAllConnectStats(long j7);

    private final native String nativeGetAllNetLayersStats(long j7);

    private final native int nativeGetConnectSuccessNum(long j7, String str);

    private final native int nativeInitTimestampBeginPointMs(long j7, long j8);

    private final native int nativeSendAudioConfig(long j7, byte[] bArr, String str, int i7, int i8, int i9, int i10);

    private final native int nativeSendAudioPacket(long j7, byte[] bArr, long j8, long j9, String str, int i7, int i8, int i9, int i10);

    private final native int nativeSendMetadata(long j7, Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, String str2, String str3, boolean z6);

    private final native int nativeSendVideoConfig(long j7, byte[] bArr, String str, int i7, int i8, int i9, int i10, boolean z6);

    private final native int nativeSendVideoPacket(long j7, byte[] bArr, boolean z6, long j8, long j9, String str, int i7, int i8, int i9, int i10, boolean z7);

    private final native boolean nativeStartDumpReportCallback(long j7, int i7);

    private final native boolean nativeStartGetConnectInfoCallback(long j7, long j8);

    private final native boolean nativeStartGetNetStatsCallback(long j7, long j8);

    private final native int nativeStartPush(long j7, String str, String str2);

    private final native void nativeStopDumpReportCallback(long j7);

    private final native void nativeStopGetConnectInfoCallback(long j7);

    private final native void nativeStopGetNetStatsCallback(long j7);

    private final native int nativeStopPush(long j7, String str);

    @Keep
    private final void onConnectStats(String str, long j7) {
        s(this, "onConnectStats", new AnonymousClass2(this, str, j7, null));
    }

    @Keep
    private final void onConnected(String str, String str2, int i7, int i8, String str3, int i9, long j7) {
        s(this, "onConnected", new AnonymousClass1(i8, this, str, str2, str3, i9, j7, i7, null));
    }

    @Keep
    private final void onConnectedFirstPacket(String str, String str2, int i7, int i8, String str3, long j7) {
        s(this, "onConnectedFirstPacket", new C54081(i7, i8, this, str, str2, str3, j7, null));
    }

    @Keep
    private final void onConnecting(String str, String str2, int i7, String str3, long j7) {
        s(this, "onConnecting", new C54091(i7, this, str, str2, str3, j7, null));
    }

    @Keep
    private final void onDisconnect(String str, String str2, int i7, String str3, long j7) {
        s(this, "onDisconnect", new C54101(i7, this, str, str2, str3, j7, null));
    }

    @Keep
    private final void onError(String str, String str2, int i7, int i8, String str3, long j7) {
        s(this, "onError", new C54111(i7, i8, this, str, str2, str3, j7, null));
    }

    @Keep
    private final void onEvent(String str, String str2, long j7) {
        s(this, "onEvent", new C54121(this, str, str2, j7, null));
    }

    @Keep
    private final void onNetStats(String str, long j7) {
        s(this, "onNetStats", new C54132(this, str, j7, null));
    }

    @Keep
    private final void onSendPacketFail(String str, String str2, int i7, int i8, String str3, long j7) {
        s(this, "onSendPacketFail", new C54141(i7, i8, this, str, str2, str3, j7, null));
    }

    @Keep
    private final void onStart(String str, String str2, int i7, String str3, long j7) {
        s(this, "onStart", new C54151(i7, this, str, str2, str3, j7, null));
    }

    @Keep
    private final void onStopped(String str, String str2, int i7, String str3, long j7) {
        s(this, "onStopped", new C54161(this, str, i7, str2, str3, j7, null));
    }

    @Keep
    private final void onStopping(String str, String str2, int i7, String str3, long j7) {
        s(this, "onStopping", new C54171(i7, this, str, str2, j7, str3, null));
    }

    public static Job s(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, Function2 function2) {
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        CoroutineScope coroutineScope = biliDispatchManagementFlaspoint.f65987i;
        return BuildersKt.launch(coroutineScope, coroutineScope.getCoroutineContext(), coroutineStart, new BiliDispatchManagementFlaspoint$runOnDefaultCoroutine$1(function2, biliDispatchManagementFlaspoint, str, null));
    }

    public final void A() {
        if (this.f65981b != 0) {
            s(this, "stopGetNetStatsInfo", new BiliDispatchManagementFlaspoint$stopGetNetStatsInfo$1$1(this, null));
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:stopGetNetStatsInfo, fail!", null, 14);
        }
    }

    @Nullable
    public final void B(@NotNull String str) {
        synchronized (this) {
            if (this.f65981b != 0) {
                j(str, this);
            } else {
                i.c(this, "nativeHandle is zero!!!!, run func:stopPush, fail!", null, 14);
            }
        }
    }

    @Keep
    public final long createFlashpoint(@NotNull String str, @NotNull String str2) {
        h.a aVar;
        if (this.h.containsKey(str2)) {
            onError(str2, "", BiliFlashpointErrorType.DISPATCH_MANAGEMENT.ordinal(), ErrorCode.REPEAT.ordinal(), android.support.v4.media.a.a("uri:", str2, ", repeat!!!"), SystemClock.uptimeMillis());
            aVar = null;
        } else {
            h.a aVarCreateFlashpoint = null;
            for (Map.Entry<String, h> entry : this.f65986g.entrySet()) {
                aVarCreateFlashpoint = entry.getValue().createFlashpoint(str, str2);
                if (aVarCreateFlashpoint != null) {
                    logInfo(Fp.c.b(entry.getKey(), "createFlashpoint by name is:"), null, null, null);
                }
            }
            aVar = aVarCreateFlashpoint;
            if (aVarCreateFlashpoint != null) {
                this.h.put(str2, aVarCreateFlashpoint);
                aVar = aVarCreateFlashpoint;
            }
        }
        logInfo(C4496a.a("uri:", str2), null, null, null);
        return aVar != null ? aVar.create(str2) : 0L;
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65980a.logError(str, str2, str3, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65980a.logInfo(str, str2, str3, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65980a.logWarning(str, str2, str3, th);
    }

    public final void n(int i7) {
        if (this.f65981b != 0) {
            s(this, "startGetConnectInfo", new BiliDispatchManagementFlaspoint$changeGetConnectInfoInterval$1$1(this, i7, null));
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:startGetConnectInfo, fail!", null, 14);
        }
    }

    public final void o(int i7) {
        if (this.f65981b != 0) {
            s(this, "changeGetNetStatsInfo", new BiliDispatchManagementFlaspoint$changeGetNetStatsInfoInterval$1$1(this, i7, null));
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:changeGetNetStatsInfo, fail!", null, 14);
        }
    }

    public final <T> T p(String str, Function0<? extends T> function0) {
        Object objInvoke;
        if (this.f65981b != 0) {
            objInvoke = function0.invoke();
        } else {
            i.c(this, android.support.v4.media.a.a("nativeHandle is zero!!!!, run func:", str, ", fail!"), null, 14);
            objInvoke = null;
        }
        return (T) objInvoke;
    }

    @Nullable
    public final String q() {
        String strNativeGetAllConnectStats;
        long j7 = this.f65981b;
        if (j7 != 0) {
            strNativeGetAllConnectStats = nativeGetAllConnectStats(j7);
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:getAllConnectStats, fail!", null, 14);
            strNativeGetAllConnectStats = null;
        }
        return strNativeGetAllConnectStats;
    }

    @Nullable
    public final String r() {
        String strNativeGetAllNetLayersStats;
        long j7 = this.f65981b;
        if (j7 != 0) {
            strNativeGetAllNetLayersStats = nativeGetAllNetLayersStats(j7);
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:getAllNetLaysStats, fail!", null, 14);
            strNativeGetAllNetLayersStats = null;
        }
        return strNativeGetAllNetLayersStats;
    }

    @Nullable
    public final void t(@NotNull byte[] bArr, boolean z6, long j7, long j8, @NotNull String str, int i7, int i8, int i9, int i10, boolean z7) {
        synchronized (this) {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (this.f65981b != 0) {
                        nativeSendVideoPacket(this.f65981b, bArr, z6, j7, j8, str, i7, i8, i9, i10, z7);
                    } else {
                        i.c(this, "nativeHandle is zero!!!!, run func:sendVideoPacket, fail!", null, 14);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void u(@NotNull BiliVideoCodec biliVideoCodec) {
        this.f65985f = biliVideoCodec;
        logInfo("videoCodecType:" + biliVideoCodec, null, null, null);
    }

    @Nullable
    public final void v(int i7) {
        if (this.f65981b != 0) {
            s(this, "startDumpReport", new BiliDispatchManagementFlaspoint$startDumpReport$1$1(this, i7, null));
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:startDumpReport, fail!", null, 14);
        }
    }

    @Nullable
    public final void w(int i7) {
        if (this.f65981b != 0) {
            s(this, "startGetConnectInfo", new BiliDispatchManagementFlaspoint$startGetConnectInfo$1$1(this, i7, null));
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:startGetConnectInfo, fail!", null, 14);
        }
    }

    @Nullable
    public final void x(int i7) {
        if (this.f65981b != 0) {
            s(this, "startGetConnectInfo", new BiliDispatchManagementFlaspoint$startGetNetStatsInfo$1$1(this, i7, null));
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:startGetConnectInfo, fail!", null, 14);
        }
    }

    @Nullable
    public final void y(@NotNull String str, @NotNull String str2) {
        synchronized (this) {
            long j7 = this.f65981b;
            if (j7 != 0) {
                nativeStartPush(j7, str, str2);
            } else {
                i.c(this, "nativeHandle is zero!!!!, run func:startPush, fail!", null, 14);
            }
        }
    }

    public final void z() {
        if (this.f65981b != 0) {
            s(this, "stopGetConnectInfo", new BiliDispatchManagementFlaspoint$stopGetConnectInfo$1$1(this, null));
        } else {
            i.c(this, "nativeHandle is zero!!!!, run func:stopGetConnectInfo, fail!", null, 14);
        }
    }
}
