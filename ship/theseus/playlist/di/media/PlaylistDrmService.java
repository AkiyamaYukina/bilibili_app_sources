package com.bilibili.ship.theseus.playlist.di.media;

import Ou0.c;
import X1.F;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.playlist.D;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.united.utils.q;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistDrmService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistDrmService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f95573c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistDrmService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistDrmService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistDrmService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistDrmService f95575a;

            public a(PlaylistDrmService playlistDrmService) {
                this.f95575a = playlistDrmService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objWithContext;
                PlayViewUniteReply playViewUniteReply = (PlayViewUniteReply) obj;
                PlaylistDrmService playlistDrmService = this.f95575a;
                MultiTypeMedia multiTypeMedia = playlistDrmService.f95572b.c().f95137a;
                c cVar = playlistDrmService.f95572b.c().f95138b;
                if (cVar == null) {
                    BLog.e("PlaylistDrmService$1$1-emit", "[theseus-playlist-PlaylistDrmService$1$1-emit] playingEpisode is null, cannot update drm credential", (Throwable) null);
                    objWithContext = Unit.INSTANCE;
                } else if (cVar.f18104r.length() == 0) {
                    BLog.i("PlaylistDrmService$1$1-emit", "[theseus-playlist-PlaylistDrmService$1$1-emit] drmKid is empty, no need to update drm credential");
                    objWithContext = Unit.INSTANCE;
                } else {
                    long cacheExpire = playViewUniteReply.getPlayArc().getCacheExpire();
                    objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new PlaylistDrmService$1$1$1(D.a(multiTypeMedia), cVar, cacheExpire, null), continuation);
                    if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objWithContext = Unit.INSTANCE;
                    }
                }
                return objWithContext;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistDrmService playlistDrmService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistDrmService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistDrmService playlistDrmService = this.this$0;
                if (!playlistDrmService.f95572b.f95092O) {
                    return Unit.INSTANCE;
                }
                Flow<PlayViewUniteReply> flowG = playlistDrmService.f95573c.g();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowG.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistDrmService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<A.b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(A.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            A.b bVar = (A.b) this.L$0;
            StringBuilder sbB = F.b(bVar.f79326a, "Received CoreError event: what=", ", extra=");
            int i7 = bVar.f79327b;
            sbB.append(i7);
            defpackage.a.b("[theseus-playlist-PlaylistDrmService$2-invokeSuspend] ", sbB.toString(), "PlaylistDrmService$2-invokeSuspend");
            if (i7 == 13001) {
                q.b(2131857653);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public PlaylistDrmService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistRepository playlistRepository, @NotNull j jVar) {
        this.f95571a = coroutineScope;
        this.f95572b = playlistRepository;
        this.f95573c = jVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        if (playlistRepository.f95092O) {
            final Flow<A> flowV = jVar.v();
            FlowKt.launchIn(FlowKt.onEach(new Flow<Object>(flowV) { // from class: com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f95576a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistDrmService$special$$inlined$filterIsInstance$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f95577a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistDrmService$special$$inlined$filterIsInstance$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        Object result;
                        final AnonymousClass2 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                            super(continuation);
                            this.this$0 = anonymousClass2;
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f95577a = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            r0 = r7
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1$2$1 r0 = (com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1$2$1 r0 = new com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r9 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r10 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L82
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.A.b
                            if (r0 == 0) goto L82
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f95577a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r10
                            if (r0 != r1) goto L82
                            r0 = r10
                            return r0
                        L82:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.media.PlaylistDrmService$special$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f95576a = flowV;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f95576a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, new AnonymousClass2(null)), coroutineScope);
        }
    }
}
