package com.bilibili.ship.theseus.playlist.di.biz;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistBizMediaActionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RelationRepository f95345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f95347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f95348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f95349f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistBizMediaActionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistBizMediaActionService f95350a;

            public a(PlaylistBizMediaActionService playlistBizMediaActionService) {
                this.f95350a = playlistBizMediaActionService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                PlaylistRepository.c cVar = (PlaylistRepository.c) obj;
                boolean z6 = cVar instanceof PlaylistRepository.c.b;
                PlaylistBizMediaActionService playlistBizMediaActionService = this.f95350a;
                if (z6) {
                    PlaylistRepository.c.b bVar = (PlaylistRepository.c.b) cVar;
                    if (bVar.f95134a.d() == playlistBizMediaActionService.f95347d.a()) {
                        playlistBizMediaActionService.f95345b.o(bVar.f95135b);
                    }
                } else {
                    if (!(cVar instanceof PlaylistRepository.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PlaylistRepository.c.a aVar = (PlaylistRepository.c.a) cVar;
                    if (aVar.f95132a.d() == playlistBizMediaActionService.f95347d.a()) {
                        playlistBizMediaActionService.f95345b.n(aVar.f95133b);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistBizMediaActionService playlistBizMediaActionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistBizMediaActionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistBizMediaActionService playlistBizMediaActionService = this.this$0;
                SharedFlow<PlaylistRepository.c> sharedFlow = playlistBizMediaActionService.f95346c.f95115w;
                a aVar = new a(playlistBizMediaActionService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistBizMediaActionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final PlaylistBizMediaActionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistBizMediaActionService playlistBizMediaActionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistBizMediaActionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                defpackage.a.b("[theseus-playlist-PlaylistBizMediaActionService$2$1-invokeSuspend] ", this.this$0.f95347d.a() + " like:" + z6, "PlaylistBizMediaActionService$2$1-invokeSuspend");
                MultiTypeMedia multiTypeMedia = this.this$0.f95346c.c().f95137a;
                PlaylistBizMediaActionService playlistBizMediaActionService = this.this$0;
                if (z6 == playlistBizMediaActionService.f95348e) {
                    return Unit.INSTANCE;
                }
                playlistBizMediaActionService.f95348e = z6;
                playlistBizMediaActionService.f95346c.f95114v.tryEmit(new PlaylistRepository.c.b(multiTypeMedia, z6));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistBizMediaActionService playlistBizMediaActionService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistBizMediaActionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(this.this$0.f95345b.f103999g, 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDrop, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistBizMediaActionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final PlaylistBizMediaActionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistBizMediaActionService playlistBizMediaActionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistBizMediaActionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                MultiTypeMedia multiTypeMedia = this.this$0.f95346c.c().f95137a;
                PlaylistBizMediaActionService playlistBizMediaActionService = this.this$0;
                if (z6 == playlistBizMediaActionService.f95349f) {
                    return Unit.INSTANCE;
                }
                playlistBizMediaActionService.f95349f = z6;
                playlistBizMediaActionService.f95346c.f95114v.tryEmit(new PlaylistRepository.c.a(multiTypeMedia, z6));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlaylistBizMediaActionService playlistBizMediaActionService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playlistBizMediaActionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(this.this$0.f95345b.f103998f, 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDrop, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistBizMediaActionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final PlaylistBizMediaActionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistBizMediaActionService playlistBizMediaActionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistBizMediaActionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f95346c.f95118z.setValue(Boolean.valueOf(this.Z$0));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PlaylistBizMediaActionService playlistBizMediaActionService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playlistBizMediaActionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistBizMediaActionService playlistBizMediaActionService = this.this$0;
                StateFlow<Boolean> stateFlow = playlistBizMediaActionService.f95345b.f103998f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistBizMediaActionService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistBizMediaActionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistBizMediaActionService$5$1.class */
        public static final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistBizMediaActionService f95351a;

            public AnonymousClass1(PlaylistBizMediaActionService playlistBizMediaActionService) {
                this.f95351a = playlistBizMediaActionService;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(kotlin.Unit r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    r0 = r7
                    boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$5$1$emit$1
                    if (r0 == 0) goto L23
                    r0 = r7
                    com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$5$1$emit$1 r0 = (com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$5$1$emit$1) r0
                    r6 = r0
                    r0 = r6
                    int r0 = r0.label
                    r8 = r0
                    r0 = r8
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L23
                    r0 = r6
                    r1 = r8
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.label = r1
                    goto L2d
                L23:
                    com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$5$1$emit$1 r0 = new com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService$5$1$emit$1
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r2, r3)
                    r6 = r0
                L2d:
                    r0 = r6
                    java.lang.Object r0 = r0.result
                    r10 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r7 = r0
                    r0 = r6
                    int r0 = r0.label
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto L60
                    r0 = r8
                    r1 = 1
                    if (r0 != r1) goto L56
                    r0 = r10
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r10
                    kotlin.Result r0 = (kotlin.Result) r0
                    java.lang.Object r0 = r0.unbox-impl()
                    goto L8d
                L56:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L60:
                    r0 = r10
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService r0 = r0.f95351a
                    r10 = r0
                    r0 = r10
                    com.bilibili.ship.theseus.united.page.view.RelationRepository r0 = r0.f95345b
                    boolean r0 = r0.i()
                    r9 = r0
                    r0 = r6
                    r1 = 1
                    r0.label = r1
                    r0 = r10
                    com.bilibili.ship.theseus.united.page.view.RelationRepository r0 = r0.f95345b
                    r1 = r9
                    r2 = 1
                    r1 = r1 ^ r2
                    r2 = r6
                    java.lang.Object r0 = r0.r(r1, r2)
                    r1 = r7
                    if (r0 != r1) goto L8d
                    r0 = r7
                    return r0
                L8d:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.biz.PlaylistBizMediaActionService.AnonymousClass5.AnonymousClass1.emit(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(PlaylistBizMediaActionService playlistBizMediaActionService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = playlistBizMediaActionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistBizMediaActionService playlistBizMediaActionService = this.this$0;
                SharedFlow<Unit> sharedFlow = playlistBizMediaActionService.f95346c.f95117y;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistBizMediaActionService);
                this.label = 1;
                if (sharedFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public PlaylistBizMediaActionService(@NotNull CoroutineScope coroutineScope, @NotNull RelationRepository relationRepository, @NotNull PlaylistRepository playlistRepository, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar) {
        this.f95344a = coroutineScope;
        this.f95345b = relationRepository;
        this.f95346c = playlistRepository;
        this.f95347d = aVar;
        this.f95348e = relationRepository.j();
        this.f95349f = relationRepository.i();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }
}
