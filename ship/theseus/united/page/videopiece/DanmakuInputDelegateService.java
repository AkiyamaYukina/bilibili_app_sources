package com.bilibili.ship.theseus.united.page.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.keel.player.q;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuInputDelegateService.class */
@StabilityInferred(parameters = 0)
public final class DanmakuInputDelegateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f103667a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.DanmakuInputDelegateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuInputDelegateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final DanmakuInputWindowService $danmakuInputWindowService;
        final IInteractLayerService $interactLayerService;
        final b $pieceRepository;
        final List<Hr0.b> $videoPieceList;
        int label;
        final DanmakuInputDelegateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.DanmakuInputDelegateService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuInputDelegateService$1$1.class */
        public static final class C11501 extends SuspendLambda implements Function2<q<?>, Continuation<? super Unit>, Object> {
            final DanmakuInputWindowService $danmakuInputWindowService;
            final IInteractLayerService $interactLayerService;
            final List<Hr0.b> $videoPieceList;
            Object L$0;
            int label;
            final DanmakuInputDelegateService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.DanmakuInputDelegateService$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuInputDelegateService$1$1$a.class */
            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final q<?> f103668a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DanmakuInputDelegateService f103669b;

                public a(q<?> qVar, DanmakuInputDelegateService danmakuInputDelegateService) {
                    this.f103668a = qVar;
                    this.f103669b = danmakuInputDelegateService;
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.DanmakuInputDelegateService$1$1$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuInputDelegateService$1$1$b.class */
            public static final class b implements tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List<Hr0.b> f103670a;

                public b(List<Hr0.b> list) {
                    this.f103670a = list;
                }

                public final boolean a(Long l7) {
                    Object obj;
                    boolean z6 = false;
                    if (l7 != null) {
                        Iterator<T> it = this.f103670a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            Object next = it.next();
                            if (((Hr0.b) next).f8747b == l7.longValue()) {
                                obj = next;
                                break;
                            }
                        }
                        z6 = false;
                        if (((Hr0.b) obj) != null) {
                            z6 = true;
                        }
                    }
                    return z6;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11501(DanmakuInputWindowService danmakuInputWindowService, IInteractLayerService iInteractLayerService, DanmakuInputDelegateService danmakuInputDelegateService, List<Hr0.b> list, Continuation<? super C11501> continuation) {
                super(2, continuation);
                this.$danmakuInputWindowService = danmakuInputWindowService;
                this.$interactLayerService = iInteractLayerService;
                this.this$0 = danmakuInputDelegateService;
                this.$videoPieceList = list;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11501 c11501 = new C11501(this.$danmakuInputWindowService, this.$interactLayerService, this.this$0, this.$videoPieceList, continuation);
                c11501.L$0 = obj;
                return c11501;
            }

            public final Object invoke(q<?> qVar, Continuation<? super Unit> continuation) {
                return create(qVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                q qVar = (q) this.L$0;
                if (qVar != null) {
                    this.$danmakuInputWindowService.f81804o = new a(qVar, this.this$0);
                    IRemoteHandler remoteHandler = this.$interactLayerService.getRemoteHandler();
                    if (remoteHandler != null) {
                        remoteHandler.setCidCheckIntercept(new b(this.$videoPieceList));
                    }
                } else {
                    this.$danmakuInputWindowService.f81804o = null;
                    IRemoteHandler remoteHandler2 = this.$interactLayerService.getRemoteHandler();
                    if (remoteHandler2 != null) {
                        remoteHandler2.setCidCheckIntercept((tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.a) null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, DanmakuInputWindowService danmakuInputWindowService, IInteractLayerService iInteractLayerService, DanmakuInputDelegateService danmakuInputDelegateService, List<Hr0.b> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pieceRepository = bVar;
            this.$danmakuInputWindowService = danmakuInputWindowService;
            this.$interactLayerService = iInteractLayerService;
            this.this$0 = danmakuInputDelegateService;
            this.$videoPieceList = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$pieceRepository, this.$danmakuInputWindowService, this.$interactLayerService, this.this$0, this.$videoPieceList, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<q<?>> mutableStateFlow = this.$pieceRepository.f103682a;
                C11501 c11501 = new C11501(this.$danmakuInputWindowService, this.$interactLayerService, this.this$0, this.$videoPieceList, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c11501, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.DanmakuInputDelegateService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/DanmakuInputDelegateService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final DanmakuInputWindowService $danmakuInputWindowService;
        final IInteractLayerService $interactLayerService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DanmakuInputWindowService danmakuInputWindowService, IInteractLayerService iInteractLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$danmakuInputWindowService = danmakuInputWindowService;
            this.$interactLayerService = iInteractLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$danmakuInputWindowService, this.$interactLayerService, continuation);
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
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.$danmakuInputWindowService.f81804o = null;
                IRemoteHandler remoteHandler = this.$interactLayerService.getRemoteHandler();
                if (remoteHandler != null) {
                    remoteHandler.setCidCheckIntercept((tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.a) null);
                }
                throw th;
            }
        }
    }

    @Inject
    public DanmakuInputDelegateService(@NotNull CoroutineScope coroutineScope, @NotNull b bVar, @NotNull IInteractLayerService iInteractLayerService, @NotNull DanmakuInputWindowService danmakuInputWindowService, @NotNull j jVar, @NotNull List<Hr0.b> list) {
        this.f103667a = jVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(bVar, danmakuInputWindowService, iInteractLayerService, this, list, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(danmakuInputWindowService, iInteractLayerService, null), 3, (Object) null);
    }
}
