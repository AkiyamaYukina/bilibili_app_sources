package com.bilibili.ship.theseus.cheese.biz.aioral;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/CheeseAiOralService$showPanel$2$1.class */
final class CheeseAiOralService$showPanel$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b $component;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final CheeseAiOralService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAiOralService$showPanel$2$1(CheeseAiOralService cheeseAiOralService, b bVar, Continuation<? super CheeseAiOralService$showPanel$2$1> continuation) {
        super(1, continuation);
        this.this$0 = cheeseAiOralService;
        this.$component = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseAiOralService$showPanel$2$1(this.this$0, this.$component, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
    /* JADX WARN: Type inference failed for: r0v60 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Object obj2;
        String str;
        String str2;
        g gVar;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        g gVar2;
        String str3;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
        String str4;
        String str5;
        g gVar3;
        String str6;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseAiOralService cheeseAiOralService = this.this$0;
                com.bilibili.ship.theseus.united.page.screenstate.c cVar4 = cheeseAiOralService.f89006g;
                UIComponent<?> uIComponent = this.$component;
                cVar4.j("CheeseAiOralService", true);
                try {
                    g gVar4 = cheeseAiOralService.f89003d;
                    TheseusFloatLayerService theseusFloatLayerService = cheeseAiOralService.f89002c;
                    gVar4.f("CheeseAiOralService");
                    try {
                        if (theseusFloatLayerService.b()) {
                            gVar2 = gVar4;
                            str3 = "CheeseAiOralService";
                            cVar2 = cVar4;
                            str4 = "CheeseAiOralService";
                        } else {
                            this.L$0 = cVar4;
                            this.L$1 = "CheeseAiOralService";
                            this.L$2 = gVar4;
                            this.L$3 = "CheeseAiOralService";
                            this.label = 1;
                            if (theseusFloatLayerService.f(uIComponent, null, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str5 = "CheeseAiOralService";
                            gVar3 = gVar4;
                            str6 = "CheeseAiOralService";
                            cVar3 = cVar4;
                            str3 = str5;
                            gVar2 = gVar3;
                            str4 = str6;
                            cVar2 = cVar3 == true ? 1 : 0;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = "CheeseAiOralService";
                        str2 = "CheeseAiOralService";
                        gVar = gVar4;
                        cVar = cVar4;
                        gVar.j(str);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj2 = cVar4;
                    obj2.j("CheeseAiOralService", false);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (String) this.L$3;
                gVar3 = (g) this.L$2;
                str6 = (String) this.L$1;
                com.bilibili.ship.theseus.united.page.screenstate.c cVar5 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    cVar3 = cVar5;
                    str3 = str5;
                    gVar2 = gVar3;
                    str4 = str6;
                    cVar2 = cVar3 == true ? 1 : 0;
                } catch (Throwable th4) {
                    str = str5;
                    gVar = gVar3;
                    str2 = str6;
                    cVar = cVar5;
                    th = th4;
                    gVar.j(str);
                    throw th;
                }
            }
            gVar2.j(str3);
            cVar2.j(str4, false);
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            th = th5;
            obj2 = obj;
        }
    }
}
