package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseService$showMerchandisePanel$2$1.class */
final class MerchandiseService$showMerchandisePanel$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final MerchandiseService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchandiseService$showMerchandisePanel$2$1(MerchandiseService merchandiseService, Continuation<? super MerchandiseService$showMerchandisePanel$2$1> continuation) {
        super(1, continuation);
        this.this$0 = merchandiseService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0$0(MerchandiseService merchandiseService) {
        return merchandiseService.h.f() ? 3 : 1;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MerchandiseService$showMerchandisePanel$2$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        String str2;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar3;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final MerchandiseService merchandiseService = this.this$0;
            gVar = merchandiseService.f100553c;
            TheseusFloatLayerService theseusFloatLayerService = merchandiseService.f100554d;
            str = "MerchandiseFloatLayer";
            gVar.f("MerchandiseFloatLayer");
            Lazy lazy = merchandiseService.f100565p;
            gVar2 = gVar;
            try {
                if (!theseusFloatLayerService.b()) {
                    ((f) lazy.getValue()).j(!merchandiseService.h.f());
                    f fVar = (f) lazy.getValue();
                    TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, new Function0(merchandiseService) { // from class: com.bilibili.ship.theseus.united.page.intro.module.merchandise.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final MerchandiseService f100590a;

                        {
                            this.f100590a = merchandiseService;
                        }

                        public final Object invoke() {
                            return Integer.valueOf(MerchandiseService$showMerchandisePanel$2$1.invokeSuspend$lambda$0$0(this.f100590a));
                        }
                    }, 12);
                    this.L$0 = gVar;
                    this.L$1 = "MerchandiseFloatLayer";
                    this.label = 1;
                    if (theseusFloatLayerService.e(fVar, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = "MerchandiseFloatLayer";
                    str = str2;
                    gVar2 = gVar;
                }
            } catch (Throwable th2) {
                str2 = "MerchandiseFloatLayer";
                gVar3 = gVar;
                th = th2;
                gVar3.j(str2);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            gVar3 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar3;
                str = str2;
                gVar2 = gVar;
            } catch (Throwable th3) {
                th = th3;
                gVar3.j(str2);
                throw th;
            }
        }
        gVar2.j(str);
        return Unit.INSTANCE;
    }
}
