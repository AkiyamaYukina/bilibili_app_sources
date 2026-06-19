package com.bilibili.ship.theseus.ugc.intro.ai;

import android.view.Window;
import com.bilibili.app.comm.IJsBridgeBehavior;
import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.ArrayList;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$showFeedbackLayer$1.class */
final class UgcAiFeedbackService$showFeedbackLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    int label;
    final UgcAiFeedbackService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$showFeedbackLayer$1$a.class */
    public static final class a implements IJsBridgeBehavior {
        public final boolean isDestroyed() {
            return false;
        }

        public final void release() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcAiFeedbackService$showFeedbackLayer$1(UgcAiFeedbackService ugcAiFeedbackService, String str, Continuation<? super UgcAiFeedbackService$showFeedbackLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = ugcAiFeedbackService;
        this.$url = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$showFeedbackLayer$1$a, java.lang.Object] */
    public static final JsBridgeCallHandlerV2 invokeSuspend$lambda$0(UgcAiFeedbackService ugcAiFeedbackService) {
        return new UgcAiFeedbackService.a(ugcAiFeedbackService, new Object());
    }

    private static final Unit invokeSuspend$lambda$1(TheseusWebUIComponent theseusWebUIComponent, final UgcAiFeedbackService ugcAiFeedbackService, com.bilibili.ogv.infra.coroutine.c cVar) {
        TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, 0, 0, new Function0(ugcAiFeedbackService) { // from class: com.bilibili.ship.theseus.ugc.intro.ai.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcAiFeedbackService f96978a;

            {
                this.f96978a = ugcAiFeedbackService;
            }

            public final Object invoke() {
                return Integer.valueOf(UgcAiFeedbackService$showFeedbackLayer$1.invokeSuspend$lambda$1$0(this.f96978a));
            }
        });
        cVar.b(new UgcAiFeedbackService$showFeedbackLayer$1$1$1(ugcAiFeedbackService, theseusWebUIComponent, aVar, null));
        cVar.a(theseusWebUIComponent.f104195o);
        cVar.b(new UgcAiFeedbackService$showFeedbackLayer$1$1$2(ugcAiFeedbackService, null));
        cVar.b(new UgcAiFeedbackService$showFeedbackLayer$1$1$3(ugcAiFeedbackService, theseusWebUIComponent, aVar, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$1$0(UgcAiFeedbackService ugcAiFeedbackService) {
        return (ugcAiFeedbackService.f96947k.i() || ugcAiFeedbackService.f96947k.f()) ? 3 : 1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcAiFeedbackService$showFeedbackLayer$1(this.this$0, this.$url, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        UgcAiFeedbackService ugcAiFeedbackService;
        Integer num;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f96944g.g();
                com.bilibili.ogv.infra.jsb.d dVar = new com.bilibili.ogv.infra.jsb.d();
                final UgcAiFeedbackService ugcAiFeedbackService2 = this.this$0;
                dVar.f67876b.put("ugcvideo", new JsBridgeCallHandlerFactoryV2(ugcAiFeedbackService2) { // from class: com.bilibili.ship.theseus.ugc.intro.ai.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UgcAiFeedbackService f96977a;

                    {
                        this.f96977a = ugcAiFeedbackService2;
                    }

                    public final JsBridgeCallHandlerV2 create() {
                        return UgcAiFeedbackService$showFeedbackLayer$1.invokeSuspend$lambda$0(this.f96977a);
                    }
                });
                TheseusWebUIComponent theseusWebUIComponent = new TheseusWebUIComponent(this.$url, dVar, new TheseusWebUIComponent.a(false, "", 0, 0, 0, false, 0, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(this.this$0.f96947k.b(), 0, 1, (Object) null)), false, true, this.this$0.f96947k.f102941e, 360380), null, null, null, null, 120);
                UgcAiFeedbackService ugcAiFeedbackService3 = this.this$0;
                Window window = ugcAiFeedbackService3.f96939b.getWindow();
                if (window != null) {
                    ugcAiFeedbackService3.f96960x = Integer.valueOf(window.getAttributes().softInputMode);
                    window.setSoftInputMode(48);
                }
                UgcAiFeedbackService ugcAiFeedbackService4 = this.this$0;
                this.label = 1;
                ArrayList arrayList = new ArrayList();
                invokeSuspend$lambda$1(theseusWebUIComponent, ugcAiFeedbackService4, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
                if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (num != null) {
                int iIntValue = num.intValue();
                Window window2 = ugcAiFeedbackService.f96939b.getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(iIntValue);
                }
            }
            return Unit.INSTANCE;
        } finally {
            ugcAiFeedbackService = this.this$0;
            ugcAiFeedbackService.f96954r = true;
            num = ugcAiFeedbackService.f96960x;
            if (num != null) {
                int iIntValue2 = num.intValue();
                Window window3 = ugcAiFeedbackService.f96939b.getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(iIntValue2);
                }
            }
        }
    }
}
