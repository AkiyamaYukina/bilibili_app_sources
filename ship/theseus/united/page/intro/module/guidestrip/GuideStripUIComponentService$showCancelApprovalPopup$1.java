package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$showCancelApprovalPopup$1.class */
final class GuideStripUIComponentService$showCancelApprovalPopup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final GuideStripUIComponentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStripUIComponentService$showCancelApprovalPopup$1(GuideStripUIComponentService guideStripUIComponentService, Continuation<? super GuideStripUIComponentService$showCancelApprovalPopup$1> continuation) {
        super(2, continuation);
        this.this$0 = guideStripUIComponentService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(GuideStripUIComponentService guideStripUIComponentService, CoroutineScope coroutineScope) {
        GuideStripUIComponentService.a(guideStripUIComponentService, "2", "2");
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new GuideStripUIComponentService$showCancelApprovalPopup$1$1$1(guideStripUIComponentService, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(GuideStripUIComponentService guideStripUIComponentService) {
        GuideStripUIComponentService.a(guideStripUIComponentService, "2", "1");
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuideStripUIComponentService$showCancelApprovalPopup$1 guideStripUIComponentService$showCancelApprovalPopup$1 = new GuideStripUIComponentService$showCancelApprovalPopup$1(this.this$0, continuation);
        guideStripUIComponentService$showCancelApprovalPopup$1.L$0 = obj;
        return guideStripUIComponentService$showCancelApprovalPopup$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f100073e;
            d.a aVar = new d.a(this.this$0.f100069a.getString(2131851633), this.this$0.f100069a.getString(2131851595), this.this$0.f100069a.getString(2131851585), this.this$0.f100069a.getString(2131851570));
            final GuideStripUIComponentService guideStripUIComponentService = this.this$0;
            d dVar = new d(aVar, new Function0(guideStripUIComponentService, coroutineScope) { // from class: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GuideStripUIComponentService f100144a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CoroutineScope f100145b;

                {
                    this.f100144a = guideStripUIComponentService;
                    this.f100145b = coroutineScope;
                }

                public final Object invoke() {
                    return GuideStripUIComponentService$showCancelApprovalPopup$1.invokeSuspend$lambda$0(this.f100144a, this.f100145b);
                }
            }, new Function0(guideStripUIComponentService) { // from class: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GuideStripUIComponentService f100146a;

                {
                    this.f100146a = guideStripUIComponentService;
                }

                public final Object invoke() {
                    return GuideStripUIComponentService$showCancelApprovalPopup$1.invokeSuspend$lambda$1(this.f100146a);
                }
            });
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
