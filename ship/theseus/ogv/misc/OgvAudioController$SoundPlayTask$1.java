package com.bilibili.ship.theseus.ogv.misc;

import android.media.SoundPool;
import com.bilibili.ship.theseus.ogv.misc.OgvAudioController;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvAudioController$SoundPlayTask$1.class */
final class OgvAudioController$SoundPlayTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvAudioController this$0;
    final OgvAudioController.a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvAudioController$SoundPlayTask$1(OgvAudioController ogvAudioController, OgvAudioController.a aVar, Continuation<? super OgvAudioController$SoundPlayTask$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvAudioController;
        this.this$1 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvAudioController$SoundPlayTask$1(this.this$0, this.this$1, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ogv.infra.tempfile.e eVar = com.bilibili.ogv.infra.tempfile.a.f67935a;
            com.bilibili.ogv.infra.tempfile.d dVar = new com.bilibili.ogv.infra.tempfile.d(this.this$0.f94030a, this.this$1.f94035a);
            this.label = 1;
            Object objA = eVar.a(dVar, this);
            obj2 = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        if (Result.isSuccess-impl(obj2)) {
            OgvAudioController.a aVar = this.this$1;
            SoundPool soundPool = this.this$0.f94031b;
            ResultKt.throwOnFailure(obj2);
            aVar.f94037c = soundPool.load(((File) obj2).getAbsolutePath(), 1);
        } else {
            OgvAudioController.a aVar2 = this.this$1;
            aVar2.f94036b.invoke(aVar2.f94035a);
        }
        return Unit.INSTANCE;
    }
}
