package com.bilibili.ship.theseus.united.player.charge;

import android.content.Context;
import android.util.Range;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.j;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeThumbnailService.class */
@StabilityInferred(parameters = 0)
public final class TheseusChargeThumbnailService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f104391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f104392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f104393d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeThumbnailService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeThumbnailService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusChargeThumbnailService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeThumbnailService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeThumbnailService$1$1.class */
        public static final class C11611 extends SuspendLambda implements Function2<sb0.c, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusChargeThumbnailService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11611(TheseusChargeThumbnailService theseusChargeThumbnailService, Continuation<? super C11611> continuation) {
                super(2, continuation);
                this.this$0 = theseusChargeThumbnailService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11611 c11611 = new C11611(this.this$0, continuation);
                c11611.L$0 = obj;
                return c11611;
            }

            public final Object invoke(sb0.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Range range = ((sb0.c) this.L$0).c;
                if (range == null) {
                    return Unit.INSTANCE;
                }
                this.this$0.f104392c.setThumbnailConfig(new tv.danmaku.biliplayerv2.service.interact.helper.b(new tv.danmaku.biliplayerv2.service.interact.helper.a(range.getUpper().unbox-impl()), this.this$0.f104393d));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusChargeThumbnailService theseusChargeThumbnailService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusChargeThumbnailService;
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
                Flow flowS = this.this$0.f104391b.s();
                C11611 c11611 = new C11611(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowS, c11611, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeThumbnailService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeThumbnailService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusChargeThumbnailService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusChargeThumbnailService theseusChargeThumbnailService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusChargeThumbnailService;
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
                this.this$0.f104392c.setThumbnailConfig((tv.danmaku.biliplayerv2.service.interact.helper.b) null);
                throw th;
            }
        }
    }

    @Inject
    public TheseusChargeThumbnailService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull j jVar, @NotNull IInteractLayerService iInteractLayerService) {
        this.f104390a = coroutineScope;
        this.f104391b = jVar;
        this.f104392c = iInteractLayerService;
        this.f104393d = context.getString(2131855380);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
