package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$showSlangPediaPanel$2$1$1$1.class */
public final class BgmFloatLayerService$showSlangPediaPanel$2$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusFloatLayerService.a $layerConfig;
    final TheseusWebUIComponent $uiComponent;
    int label;
    final BgmFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.BgmFloatLayerService$showSlangPediaPanel$2$1$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$showSlangPediaPanel$2$1$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final TheseusFloatLayerService.a $layerConfig;
        final TheseusWebUIComponent $uiComponent;
        Object L$0;
        Object L$1;
        int label;
        final BgmFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BgmFloatLayerService bgmFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = bgmFloatLayerService;
            this.$uiComponent = theseusWebUIComponent;
            this.$layerConfig = aVar;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.ship.theseus.united.page.screenstate.c cVar;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                com.bilibili.ship.theseus.united.page.screenstate.c cVar2 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    cVar = cVar2;
                    cVar.j(str, false);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    cVar = cVar2;
                    th = th;
                    cVar.j(str, false);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            BgmFloatLayerService bgmFloatLayerService = this.this$0;
            cVar = bgmFloatLayerService.f104141l;
            UIComponent<?> uIComponent = this.$uiComponent;
            TheseusFloatLayerService.a aVar = this.$layerConfig;
            cVar.j("BgmFloatLayerService", true);
            try {
                TheseusFloatLayerService theseusFloatLayerService = bgmFloatLayerService.f104132b;
                this.L$0 = cVar;
                this.L$1 = "BgmFloatLayerService";
                this.label = 1;
                if (theseusFloatLayerService.e(uIComponent, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = "BgmFloatLayerService";
                cVar.j(str, false);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                str = "BgmFloatLayerService";
                cVar.j(str, false);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BgmFloatLayerService$showSlangPediaPanel$2$1$1$1(BgmFloatLayerService bgmFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar, Continuation<? super BgmFloatLayerService$showSlangPediaPanel$2$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = bgmFloatLayerService;
        this.$uiComponent = theseusWebUIComponent;
        this.$layerConfig = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BgmFloatLayerService$showSlangPediaPanel$2$1$1$1(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BgmFloatLayerService bgmFloatLayerService = this.this$0;
            BackActionRepository backActionRepository = bgmFloatLayerService.f104142m;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bgmFloatLayerService, this.$uiComponent, this.$layerConfig, null);
            this.label = 1;
            if (backActionRepository.a(anonymousClass1, this) == coroutine_suspended) {
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
