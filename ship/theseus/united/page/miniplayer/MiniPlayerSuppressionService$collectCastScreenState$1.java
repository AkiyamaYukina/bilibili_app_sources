package com.bilibili.ship.theseus.united.page.miniplayer;

import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository$special$$inlined$map$1;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$collectCastScreenState$1.class */
final class MiniPlayerSuppressionService$collectCastScreenState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MiniPlayerSuppressionService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService$collectCastScreenState$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$collectCastScreenState$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        final MiniPlayerSuppressionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = miniPlayerSuppressionService;
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

        public final Object invokeSuspend(Object obj) throws Throwable {
            yv0.a aVar;
            String str;
            String str2;
            yv0.a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.Z$0) {
                    return Unit.INSTANCE;
                }
                MiniPlayerSuppressionService miniPlayerSuppressionService = this.this$0;
                aVar = miniPlayerSuppressionService.f102035c;
                miniPlayerSuppressionService.getClass();
                aVar.a("castScreenSuppressor");
                try {
                    this.L$0 = aVar;
                    this.L$1 = "castScreenSuppressor";
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = "castScreenSuppressor";
                } catch (Throwable th) {
                    th = th;
                    str = "castScreenSuppressor";
                    aVar.b(str);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$1;
                yv0.a aVar3 = (yv0.a) this.L$0;
                str = str2;
                aVar2 = aVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar2;
                    aVar.b(str);
                    throw th;
                }
            }
            str = str2;
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerSuppressionService$collectCastScreenState$1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super MiniPlayerSuppressionService$collectCastScreenState$1> continuation) {
        super(2, continuation);
        this.this$0 = miniPlayerSuppressionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiniPlayerSuppressionService$collectCastScreenState$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new TheseusCastScreenRepository$special$$inlined$map$1(this.this$0.f102034b.f99126c));
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
