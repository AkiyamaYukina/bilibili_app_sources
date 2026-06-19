package com.bilibili.ship.theseus.cheese.player.layer;

import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$showPayLayer$3.class */
public final class CheeseLayerService$showPayLayer$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final CheeseLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseLayerService$showPayLayer$3(CheeseLayerService cheeseLayerService, Continuation<? super CheeseLayerService$showPayLayer$3> continuation) {
        super(2, continuation);
        this.this$0 = cheeseLayerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseLayerService$showPayLayer$3 cheeseLayerService$showPayLayer$3 = new CheeseLayerService$showPayLayer$3(this.this$0, continuation);
        cheeseLayerService$showPayLayer$3.L$0 = obj;
        return cheeseLayerService$showPayLayer$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        h hVar;
        CoroutineScope coroutineScope2;
        g gVar;
        String str;
        g gVar2;
        String str2;
        h hVar2;
        g gVar3;
        CoroutineScope coroutineScope3;
        String str3;
        com.bilibili.player.tangram.basic.d dVar;
        com.bilibili.player.tangram.basic.d dVar2;
        com.bilibili.player.tangram.basic.d dVar3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$3;
            g gVar4 = (g) this.L$2;
            coroutineScope = (CoroutineScope) this.L$1;
            com.bilibili.player.tangram.basic.d dVar4 = (com.bilibili.player.tangram.basic.d) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                str3 = str2;
                gVar = gVar4;
                dVar3 = dVar4;
                hVar2 = dVar3 == true ? 1 : 0;
                gVar3 = gVar;
                str = str3;
                coroutineScope3 = coroutineScope;
                gVar3.j(str);
                hVar = hVar2 == true ? 1 : 0;
                coroutineScope2 = coroutineScope3;
                Unit unit = Unit.INSTANCE;
                hVar2.i(coroutineScope3);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                gVar2 = gVar4;
                dVar = dVar4;
                th = th;
                try {
                    gVar2.j(str2);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    coroutineScope2 = coroutineScope;
                    dVar2 = dVar;
                    dVar2.i(coroutineScope2);
                    throw th;
                }
            }
        }
        ResultKt.throwOnFailure(obj);
        coroutineScope = (CoroutineScope) this.L$0;
        CheeseLayerService cheeseLayerService = this.this$0;
        h hVar3 = cheeseLayerService.f90594l;
        hVar3.h(coroutineScope);
        hVar = hVar3;
        coroutineScope2 = coroutineScope;
        try {
            gVar = cheeseLayerService.f90600r;
            str = "CHEESE_LAYER_SUPPRESSION";
            gVar.f("CHEESE_LAYER_SUPPRESSION");
            try {
                e eVar = cheeseLayerService.f90608z;
                hVar2 = hVar3;
                gVar3 = gVar;
                coroutineScope3 = coroutineScope;
                if (eVar != null) {
                    TheseusFloatLayerService theseusFloatLayerService = cheeseLayerService.f90601s;
                    b bVar = new b(eVar);
                    this.L$0 = hVar3;
                    this.L$1 = coroutineScope;
                    this.L$2 = gVar;
                    this.L$3 = "CHEESE_LAYER_SUPPRESSION";
                    this.label = 1;
                    if (theseusFloatLayerService.i(bVar, null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = "CHEESE_LAYER_SUPPRESSION";
                    dVar3 = hVar3;
                    hVar2 = dVar3 == true ? 1 : 0;
                    gVar3 = gVar;
                    str = str3;
                    coroutineScope3 = coroutineScope;
                }
                gVar3.j(str);
                hVar = hVar2 == true ? 1 : 0;
                coroutineScope2 = coroutineScope3;
                Unit unit2 = Unit.INSTANCE;
                hVar2.i(coroutineScope3);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                gVar2 = gVar;
                str2 = "CHEESE_LAYER_SUPPRESSION";
                dVar = hVar3;
                gVar2.j(str2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            dVar2 = hVar == true ? 1 : 0;
            dVar2.i(coroutineScope2);
            throw th;
        }
    }
}
