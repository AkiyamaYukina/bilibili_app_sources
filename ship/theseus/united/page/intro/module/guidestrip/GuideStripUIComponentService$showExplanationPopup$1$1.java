package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$showExplanationPopup$1$1.class */
final class GuideStripUIComponentService$showExplanationPopup$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ProfessionPopup $popup;
    int label;
    final GuideStripUIComponentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStripUIComponentService$showExplanationPopup$1$1(GuideStripUIComponentService guideStripUIComponentService, ProfessionPopup professionPopup, Continuation<? super GuideStripUIComponentService$showExplanationPopup$1$1> continuation) {
        super(2, continuation);
        this.this$0 = guideStripUIComponentService;
        this.$popup = professionPopup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(GuideStripUIComponentService guideStripUIComponentService) {
        GuideStripUIComponentService.a(guideStripUIComponentService, "1", "1");
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GuideStripUIComponentService$showExplanationPopup$1$1(this.this$0, this.$popup, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f100073e;
            ProfessionPopup professionPopup = this.$popup;
            d.a aVar = new d.a(professionPopup.f100098a, professionPopup.f100099b, this.this$0.f100069a.getString(2131851570), "");
            final GuideStripUIComponentService guideStripUIComponentService = this.this$0;
            d dVar = new d(aVar, new Function0(guideStripUIComponentService) { // from class: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GuideStripUIComponentService f100147a;

                {
                    this.f100147a = guideStripUIComponentService;
                }

                public final Object invoke() {
                    return GuideStripUIComponentService$showExplanationPopup$1$1.invokeSuspend$lambda$0(this.f100147a);
                }
            }, null);
            this.label = 1;
            if (theseusFloatLayerService.f(dVar, null, this) == coroutine_suspended) {
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
