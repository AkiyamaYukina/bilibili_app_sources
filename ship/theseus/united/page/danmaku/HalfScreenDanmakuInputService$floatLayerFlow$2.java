package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$floatLayerFlow$2.class */
final class HalfScreenDanmakuInputService$floatLayerFlow$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final HalfScreenDanmakuInputService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfScreenDanmakuInputService$floatLayerFlow$2(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super HalfScreenDanmakuInputService$floatLayerFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = halfScreenDanmakuInputService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HalfScreenDanmakuInputService$floatLayerFlow$2 halfScreenDanmakuInputService$floatLayerFlow$2 = new HalfScreenDanmakuInputService$floatLayerFlow$2(this.this$0, continuation);
        halfScreenDanmakuInputService$floatLayerFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return halfScreenDanmakuInputService$floatLayerFlow$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        DanmakuInputRepository danmakuInputRepository;
        String str;
        String str2;
        DanmakuInputRepository danmakuInputRepository2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.Z$0) {
                return Unit.INSTANCE;
            }
            danmakuInputRepository = this.this$0.f99459j;
            danmakuInputRepository.f99410l.add("floatLayerFlow");
            danmakuInputRepository.f99409k.setValue(Boolean.valueOf(!danmakuInputRepository.f99410l.isEmpty()));
            try {
                this.L$0 = danmakuInputRepository;
                this.L$1 = "floatLayerFlow";
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = "floatLayerFlow";
            } catch (Throwable th) {
                th = th;
                str = "floatLayerFlow";
                danmakuInputRepository.f99410l.remove(str);
                danmakuInputRepository.f99409k.setValue(Boolean.valueOf(!danmakuInputRepository.f99410l.isEmpty()));
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            DanmakuInputRepository danmakuInputRepository3 = (DanmakuInputRepository) this.L$0;
            str = str2;
            danmakuInputRepository2 = danmakuInputRepository3;
            try {
                ResultKt.throwOnFailure(obj);
                danmakuInputRepository = danmakuInputRepository3;
            } catch (Throwable th2) {
                th = th2;
                danmakuInputRepository = danmakuInputRepository2;
                danmakuInputRepository.f99410l.remove(str);
                danmakuInputRepository.f99409k.setValue(Boolean.valueOf(!danmakuInputRepository.f99410l.isEmpty()));
                throw th;
            }
        }
        str = str2;
        danmakuInputRepository2 = danmakuInputRepository;
        throw new KotlinNothingValueException();
    }
}
