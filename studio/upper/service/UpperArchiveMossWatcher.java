package com.bilibili.studio.upper.service;

import R9.v;
import com.bapis.bilibili.broadcast.message.archive.VideoDataReply;
import com.bapis.bilibili.broadcast.message.archive.VideoUpMoss;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.studio.upper.service.UpperArchiveMossWatcher;
import com.google.protobuf.Empty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/service/UpperArchiveMossWatcher.class */
public final class UpperArchiveMossWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<Long, d> f108683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<d> f108684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Flow<VideoDataReply> f108685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Timer f108686d;

    /* JADX INFO: renamed from: com.bilibili.studio.upper.service.UpperArchiveMossWatcher$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/service/UpperArchiveMossWatcher$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super VideoDataReply>, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.studio.upper.service.UpperArchiveMossWatcher$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/service/UpperArchiveMossWatcher$1$a.class */
        public static final class a extends d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ProducerScope<VideoDataReply> f108687c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProducerScope<? super VideoDataReply> producerScope) {
                super(Long.MAX_VALUE);
                this.f108687c = producerScope;
            }

            @Override // com.bilibili.studio.upper.service.d
            public final void a() {
            }

            @Override // com.bilibili.studio.upper.service.d
            public final void b(VideoDataReply videoDataReply) {
                this.f108687c.trySend-JP2dKIU(videoDataReply);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(a aVar) {
            ((ArrayList) UpperArchiveMossWatcher.f108684b).remove(aVar);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ProducerScope<? super VideoDataReply> producerScope, Continuation<? super Unit> continuation) {
            return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.L$0;
                final a aVar = new a(producerScope);
                ((ArrayList) UpperArchiveMossWatcher.f108684b).add(aVar);
                Function0 function0 = new Function0(aVar) { // from class: com.bilibili.studio.upper.service.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UpperArchiveMossWatcher.AnonymousClass1.a f108688a;

                    {
                        this.f108688a = aVar;
                    }

                    public final Object invoke() {
                        return UpperArchiveMossWatcher.AnonymousClass1.invokeSuspend$lambda$0(this.f108688a);
                    }
                };
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/service/UpperArchiveMossWatcher$a.class */
    public static final class a extends d {
        @Override // com.bilibili.studio.upper.service.d
        public final void a() {
        }

        @Override // com.bilibili.studio.upper.service.d
        public final void b(VideoDataReply videoDataReply) {
            BLog.w("UpperArchiveWatcher", "onNext " + videoDataReply);
            long type = videoDataReply.getType();
            if (type == 1) {
                v.a("data = ", videoDataReply.getData(), "UpperArchiveWatcher");
            } else {
                if (type != 2) {
                    throw new IllegalStateException("unsupported type yet");
                }
                v.a("data = ", videoDataReply.getData(), "UpperArchiveWatcher");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.bilibili.lib.moss.api.MossResponseHandler, java.lang.Object] */
    static {
        VideoUpMoss videoUpMoss = new VideoUpMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
        f108683a = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        f108684b = arrayList;
        f108686d = new Timer();
        Empty emptyBuild = Empty.newBuilder().build();
        BLog.w("UpperArchiveWatcher", "videoData method calling");
        videoUpMoss.videoData(emptyBuild, (MossResponseHandler) new Object());
        f108685c = FlowKt.callbackFlow(new AnonymousClass1(null));
        arrayList.add(new d(Long.MAX_VALUE));
    }

    public static void a(@NotNull d dVar) {
        c cVar;
        try {
            Timer timer = f108686d;
            synchronized (dVar) {
                c cVar2 = dVar.f108691b;
                if (cVar2 != null) {
                    cVar2.cancel();
                }
                cVar = new c(dVar);
                dVar.f108691b = cVar;
            }
            timer.schedule(cVar, dVar.f108690a);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
