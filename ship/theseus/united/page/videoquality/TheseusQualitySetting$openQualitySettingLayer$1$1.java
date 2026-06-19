package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.basic.c;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusQualitySetting$openQualitySettingLayer$1$1.class */
final class TheseusQualitySetting$openQualitySettingLayer$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusQualitySetting$openQualitySettingLayer$1$1(y0 y0Var, Continuation<? super TheseusQualitySetting$openQualitySettingLayer$1$1> continuation) {
        super(2, continuation);
        this.this$0 = y0Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusQualitySetting$openQualitySettingLayer$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MediaResource mediaResource = this.this$0.f103985a.getMediaResource();
        if (mediaResource == null) {
            return Unit.INSTANCE;
        }
        com.bilibili.playerbizcommon.utils.e eVar = com.bilibili.playerbizcommon.utils.e.f80284a;
        Iterator it = ((List) com.bilibili.playerbizcommon.utils.e.f80286c.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (com.bilibili.player.tangram.playercore.y.b(((com.bilibili.player.tangram.basic.a) next).f79320a, mediaResource)) {
                break;
            }
        }
        com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) next;
        if (aVar == null) {
            return Unit.INSTANCE;
        }
        int i7 = aVar.f79320a;
        if (!com.bilibili.player.tangram.basic.a.a(i7, this.this$0.f103990f.f91109c.a())) {
            this.this$0.f103991g.e(new c.b(i7));
            if (!com.bilibili.ship.theseus.keel.player.p.o()) {
                this.this$0.f103990f.b(new c.b(i7), null);
            }
        }
        return Unit.INSTANCE;
    }
}
