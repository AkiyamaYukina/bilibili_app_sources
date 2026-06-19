package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.jsbridge.common.ContainerStatusWatcher;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.BgmFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.BgmFloatLayerService$showSlangPediaPanel$2;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$showSlangPediaPanel$2.class */
final class BgmFloatLayerService$showSlangPediaPanel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    int label;
    final BgmFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.BgmFloatLayerService$showSlangPediaPanel$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/BgmFloatLayerService$showSlangPediaPanel$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final TheseusWebUIComponent $uiComponent;
        int label;
        final BgmFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusWebUIComponent theseusWebUIComponent, BgmFloatLayerService bgmFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$uiComponent = theseusWebUIComponent;
            this.this$0 = bgmFloatLayerService;
        }

        private static final Unit invokeSuspend$lambda$0(TheseusWebUIComponent theseusWebUIComponent, final BgmFloatLayerService bgmFloatLayerService, com.bilibili.ogv.infra.coroutine.c cVar) {
            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, 0, 0, new Function0(bgmFloatLayerService) { // from class: com.bilibili.ship.theseus.united.page.weblayer.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BgmFloatLayerService f104248a;

                {
                    this.f104248a = bgmFloatLayerService;
                }

                public final Object invoke() {
                    return Integer.valueOf(BgmFloatLayerService$showSlangPediaPanel$2.AnonymousClass1.invokeSuspend$lambda$0$0(this.f104248a));
                }
            });
            cVar.b(new BgmFloatLayerService$showSlangPediaPanel$2$1$1$1(bgmFloatLayerService, theseusWebUIComponent, aVar, null));
            cVar.b(new BgmFloatLayerService$showSlangPediaPanel$2$1$1$2(bgmFloatLayerService, theseusWebUIComponent, aVar, null));
            cVar.a(theseusWebUIComponent.f104195o);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0$0(BgmFloatLayerService bgmFloatLayerService) {
            return (bgmFloatLayerService.f104140k.i() || bgmFloatLayerService.f104140k.f()) ? 3 : 1;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$uiComponent, this.this$0, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusWebUIComponent theseusWebUIComponent = this.$uiComponent;
                BgmFloatLayerService bgmFloatLayerService = this.this$0;
                this.label = 1;
                ArrayList arrayList = new ArrayList();
                invokeSuspend$lambda$0(theseusWebUIComponent, bgmFloatLayerService, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
                if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BgmFloatLayerService$showSlangPediaPanel$2(BgmFloatLayerService bgmFloatLayerService, String str, Continuation<? super BgmFloatLayerService$showSlangPediaPanel$2> continuation) {
        super(2, continuation);
        this.this$0 = bgmFloatLayerService;
        this.$url = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BgmFloatLayerService$showSlangPediaPanel$2(this.this$0, this.$url, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BgmFloatLayerService bgmFloatLayerService = this.this$0;
            bgmFloatLayerService.f104148s = false;
            bgmFloatLayerService.f104149t = 1;
            boolean zH = bgmFloatLayerService.f104140k.h();
            String strA = com.bilibili.playerbizcommonv2.utils.p.a(this.$url, "native.theme", Cj0.a.a(this.this$0.f104144o) ? "2" : "1");
            final BgmFloatLayerService bgmFloatLayerService2 = this.this$0;
            bgmFloatLayerService2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ugcvideo", new JsBridgeCallHandlerFactoryV2(bgmFloatLayerService2) { // from class: com.bilibili.ship.theseus.united.page.weblayer.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BgmFloatLayerService f104246a;

                {
                    this.f104246a = bgmFloatLayerService2;
                }

                public final JsBridgeCallHandlerV2 create() {
                    BgmFloatLayerService bgmFloatLayerService3 = this.f104246a;
                    return new BgmFloatLayerService.b(bgmFloatLayerService3, new c(bgmFloatLayerService3));
                }
            });
            com.bilibili.ogv.infra.jsb.d dVar = new com.bilibili.ogv.infra.jsb.d();
            dVar.f67876b.putAll(linkedHashMap);
            TheseusWebUIComponent theseusWebUIComponent = new TheseusWebUIComponent(strA, dVar, new TheseusWebUIComponent.a(false, "", 0, 0, 0, false, 0, false, 0, DimenUtilsKt.dpToPx(com.bilibili.ship.theseus.united.page.intro.a.b(this.this$0.f104140k.b())), zH, true, this.this$0.f104140k.f102941e, 294908), null, new BgmFloatLayerService.a(this.this$0), null, null, 104);
            BgmFloatLayerService bgmFloatLayerService3 = this.this$0;
            com.bilibili.ship.theseus.united.page.activitywindow.m mVar = bgmFloatLayerService3.f104146q;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusWebUIComponent, bgmFloatLayerService3, null);
            this.label = 1;
            if (mVar.a(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BgmFloatLayerService bgmFloatLayerService4 = this.this$0;
        bgmFloatLayerService4.f104149t = 2;
        bgmFloatLayerService4.f104148s = true;
        if (bgmFloatLayerService4.f104147r) {
            ContainerStatusWatcher.INSTANCE.onChanged(2);
        }
        return Unit.INSTANCE;
    }
}
