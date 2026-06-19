package com.bilibili.ship.theseus.united.page.charge;

import com.bilibili.app.comm.IJsBridgeBehavior;
import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ogv.infra.coroutine.c;
import com.bilibili.ogv.infra.jsb.d;
import com.bilibili.playerbizcommon.utils.l;
import com.bilibili.ship.theseus.united.page.charge.ChargeService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$showChargePayLayer$2.class */
final class ChargeService$showChargePayLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    Object L$0;
    int label;
    final ChargeService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$showChargePayLayer$2$a.class */
    public static final class a implements IJsBridgeBehavior {
        public final boolean isDestroyed() {
            return false;
        }

        public final void release() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$showChargePayLayer$2$b.class */
    public static final class b implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusWebUIComponent f99178a;

        public b(TheseusWebUIComponent theseusWebUIComponent) {
            this.f99178a = theseusWebUIComponent;
        }

        @Override // com.bilibili.playerbizcommon.utils.l.a
        public final void keyBoardHide() {
            this.f99178a.j(0);
        }

        @Override // com.bilibili.playerbizcommon.utils.l.a
        public final void keyBoardShow(int i7) {
            this.f99178a.j(i7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeService$showChargePayLayer$2(String str, ChargeService chargeService, Continuation<? super ChargeService$showChargePayLayer$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = chargeService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bilibili.ship.theseus.united.page.charge.ChargeService$showChargePayLayer$2$a, java.lang.Object] */
    public static final JsBridgeCallHandlerV2 invokeSuspend$lambda$0(ChargeService chargeService) {
        return new ChargeService.a(chargeService.h, new Object());
    }

    private static final Unit invokeSuspend$lambda$1(TheseusWebUIComponent theseusWebUIComponent, ChargeService chargeService, l lVar, c cVar) {
        cVar.b(new ChargeService$showChargePayLayer$2$1$1(chargeService, theseusWebUIComponent, null));
        cVar.b(new ChargeService$showChargePayLayer$2$1$2(chargeService, lVar, theseusWebUIComponent, null));
        cVar.a(theseusWebUIComponent.f104195o);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChargeService$showChargePayLayer$2(this.$url, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        l lVar;
        Throwable th;
        l lVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar2 = (l) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                lVar = lVar2;
                lVar.c();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                lVar2.c();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        d dVar = new d();
        final ChargeService chargeService = this.this$0;
        dVar.f67876b.put("earn", new JsBridgeCallHandlerFactoryV2(chargeService) { // from class: com.bilibili.ship.theseus.united.page.charge.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChargeService f99179a;

            {
                this.f99179a = chargeService;
            }

            public final JsBridgeCallHandlerV2 create() {
                return ChargeService$showChargePayLayer$2.invokeSuspend$lambda$0(this.f99179a);
            }
        });
        TheseusWebUIComponent theseusWebUIComponent = new TheseusWebUIComponent(this.$url, dVar, new TheseusWebUIComponent.a(false, "", 0, 0, 0, false, 0, false, 0, 0, false, true, this.this$0.f99172g.f102941e, 393148), null, null, null, null, 120);
        lVar = new l(this.this$0.f99167b, new b(theseusWebUIComponent), true);
        lVar.b(this.this$0.f99167b.getWindow());
        try {
            ChargeService chargeService2 = this.this$0;
            this.L$0 = lVar;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$1(theseusWebUIComponent, chargeService2, lVar, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lVar.c();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            lVar2 = lVar;
            lVar2.c();
            throw th;
        }
    }
}
