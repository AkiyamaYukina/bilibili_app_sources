package com.bilibili.ship.theseus.united.page.charge;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$showChargePayLayer$2$1$1.class */
public final class ChargeService$showChargePayLayer$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusWebUIComponent $uiComponent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final ChargeService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeService$showChargePayLayer$2$1$1(ChargeService chargeService, TheseusWebUIComponent theseusWebUIComponent, Continuation<? super ChargeService$showChargePayLayer$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = chargeService;
        this.$uiComponent = theseusWebUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChargeService$showChargePayLayer$2$1$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.bilibili.ship.theseus.united.page.screenstate.c, java.lang.Object] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        ?? r11;
        g gVar;
        String str3;
        String str4;
        ?? r10;
        g gVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) this.L$3;
                g gVar3 = (g) this.L$2;
                str2 = (String) this.L$1;
                c cVar = (c) this.L$0;
                try {
                    ResultKt.throwOnFailure((Object) obj);
                    gVar2 = gVar3;
                    str4 = str2;
                    r10 = cVar;
                    gVar2.j(str3);
                    r10.j(str4, false);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                    gVar = gVar3;
                    r11 = cVar;
                    gVar.j(str);
                    throw th;
                }
            }
            ResultKt.throwOnFailure((Object) obj);
            ChargeService chargeService = this.this$0;
            obj = chargeService.f99171f;
            UIComponent<?> uIComponent = this.$uiComponent;
            obj.j("[ChargeBloc]", true);
            try {
                g gVar4 = chargeService.f99169d;
                gVar4.f("[ChargeBloc]");
                try {
                    TheseusFloatLayerService theseusFloatLayerService = chargeService.f99168c;
                    TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, null, 16);
                    this.L$0 = obj;
                    this.L$1 = "[ChargeBloc]";
                    this.L$2 = gVar4;
                    this.L$3 = "[ChargeBloc]";
                    this.label = 1;
                    if (theseusFloatLayerService.h(uIComponent, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = "[ChargeBloc]";
                    str4 = "[ChargeBloc]";
                    r10 = obj;
                    gVar2 = gVar4;
                    gVar2.j(str3);
                    r10.j(str4, false);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    str = "[ChargeBloc]";
                    str2 = "[ChargeBloc]";
                    r11 = obj;
                    gVar = gVar4;
                    gVar.j(str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj.j("[ChargeBloc]", false);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
