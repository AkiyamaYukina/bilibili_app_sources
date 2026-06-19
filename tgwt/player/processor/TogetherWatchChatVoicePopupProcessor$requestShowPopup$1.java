package com.bilibili.tgwt.player.processor;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.tgwt.player.FloatLayerManager;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatVoicePopupProcessor$requestShowPopup$1.class */
final class TogetherWatchChatVoicePopupProcessor$requestShowPopup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchChatVoicePopupProcessor$requestShowPopup$1(k kVar, Continuation<? super TogetherWatchChatVoicePopupProcessor$requestShowPopup$1> continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchChatVoicePopupProcessor$requestShowPopup$1(this.this$0, continuation);
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
            k kVar = this.this$0;
            com.bilibili.tgwt.player.h hVar = kVar.f111663e;
            UIComponent uIComponent = (UIComponent) kVar.f111662d.get();
            this.label = 1;
            KProperty<Object>[] kPropertyArr = FloatLayerManager.f111519f;
            hVar.getClass();
            if (hVar.b(uIComponent, this) == coroutine_suspended) {
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
