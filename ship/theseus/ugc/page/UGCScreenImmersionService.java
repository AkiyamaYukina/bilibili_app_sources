package com.bilibili.ship.theseus.ugc.page;

import androidx.compose.foundation.gestures.o0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.PlayerSettingChangeObserver;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/page/UGCScreenImmersionService.class */
@StabilityInferred(parameters = 0)
public final class UGCScreenImmersionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f97988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f97989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f97990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f97991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public AspectRatio f97992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f97993g = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.page.UGCScreenImmersionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/page/UGCScreenImmersionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCScreenImmersionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCScreenImmersionService uGCScreenImmersionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCScreenImmersionService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UGCScreenImmersionService uGCScreenImmersionService = this.this$0;
                    uGCScreenImmersionService.f97990d.addPlayerSettingChangeObserver(uGCScreenImmersionService.f97993g, new String[]{"player_key_video_aspect"});
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
                UGCScreenImmersionService uGCScreenImmersionService2 = this.this$0;
                uGCScreenImmersionService2.f97990d.removePlayerSettingChangeObserver(uGCScreenImmersionService2.f97993g);
                UGCScreenImmersionService uGCScreenImmersionService3 = this.this$0;
                AspectRatio aspectRatio = uGCScreenImmersionService3.f97992f;
                if (aspectRatio != null) {
                    uGCScreenImmersionService3.f97989c.setAspectRatio(aspectRatio);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.page.UGCScreenImmersionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/page/UGCScreenImmersionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCScreenImmersionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.page.UGCScreenImmersionService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/page/UGCScreenImmersionService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCScreenImmersionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UGCScreenImmersionService uGCScreenImmersionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uGCScreenImmersionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                UGCScreenImmersionService uGCScreenImmersionService;
                AspectRatio aspectRatio;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!((c.a) this.L$0).f102988b && (aspectRatio = (uGCScreenImmersionService = this.this$0).f97992f) != null) {
                    uGCScreenImmersionService.f97989c.setAspectRatio(aspectRatio);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UGCScreenImmersionService uGCScreenImmersionService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uGCScreenImmersionService;
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
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.f97988b.c());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.page.UGCScreenImmersionService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/page/UGCScreenImmersionService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCScreenImmersionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.page.UGCScreenImmersionService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/page/UGCScreenImmersionService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            final Ref.LongRef $lastCid;
            Object L$0;
            int label;
            final UGCScreenImmersionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.LongRef longRef, UGCScreenImmersionService uGCScreenImmersionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$lastCid = longRef;
                this.this$0 = uGCScreenImmersionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lastCid, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                UGCScreenImmersionService uGCScreenImmersionService;
                AspectRatio aspectRatio;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                if (c1318a == null) {
                    return Unit.INSTANCE;
                }
                long j7 = this.$lastCid.element;
                long j8 = c1318a.f123395a.f123398b;
                if (j7 != j8 && (aspectRatio = (uGCScreenImmersionService = this.this$0).f97992f) != null) {
                    uGCScreenImmersionService.f97989c.setAspectRatio(aspectRatio);
                }
                this.$lastCid.element = j8;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UGCScreenImmersionService uGCScreenImmersionService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = uGCScreenImmersionService;
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
                Ref.LongRef longRefB = o0.b(obj);
                UGCScreenImmersionService uGCScreenImmersionService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = uGCScreenImmersionService.f97991e.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(longRefB, uGCScreenImmersionService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/page/UGCScreenImmersionService$a.class */
    public static final class a implements PlayerSettingChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCScreenImmersionService f97994a;

        public a(UGCScreenImmersionService uGCScreenImmersionService) {
            this.f97994a = uGCScreenImmersionService;
        }

        public final void onChange(String str) {
            this.f97994a.f97992f = null;
        }
    }

    @Inject
    public UGCScreenImmersionService(@NotNull CoroutineScope coroutineScope, @NotNull c cVar, @NotNull IRenderContainerService iRenderContainerService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull C7893a c7893a) {
        this.f97987a = coroutineScope;
        this.f97988b = cVar;
        this.f97989c = iRenderContainerService;
        this.f97990d = iPlayerSettingService;
        this.f97991e = c7893a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
