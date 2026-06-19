package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$showLoadingAnimation$5.class */
final class TheseusPlayerQualityService$showLoadingAnimation$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CompletableDeferred<Unit> $dismissRequest;
    final int $quality;
    final Ref.ObjectRef<UIComponent<?>> $uiComponent;
    final Ref.BooleanRef $visionAnimation;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$showLoadingAnimation$5(Ref.BooleanRef booleanRef, TheseusPlayerQualityService theseusPlayerQualityService, Ref.ObjectRef<UIComponent<?>> objectRef, int i7, CompletableDeferred<Unit> completableDeferred, Continuation<? super TheseusPlayerQualityService$showLoadingAnimation$5> continuation) {
        super(2, continuation);
        this.$visionAnimation = booleanRef;
        this.this$0 = theseusPlayerQualityService;
        this.$uiComponent = objectRef;
        this.$quality = i7;
        this.$dismissRequest = completableDeferred;
    }

    private static final Unit invokeSuspend$lambda$0(Ref.BooleanRef booleanRef, TheseusPlayerQualityService theseusPlayerQualityService, Ref.ObjectRef objectRef, int i7, CompletableDeferred completableDeferred, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new TheseusPlayerQualityService$showLoadingAnimation$5$1$1(theseusPlayerQualityService, objectRef, null));
        if (!booleanRef.element) {
            cVar.b(new TheseusPlayerQualityService$showLoadingAnimation$5$1$2(theseusPlayerQualityService, i7, null));
        }
        cVar.b(new TheseusPlayerQualityService$showLoadingAnimation$5$1$3(null));
        cVar.b(new TheseusPlayerQualityService$showLoadingAnimation$5$1$4(completableDeferred, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayerQualityService$showLoadingAnimation$5(this.$visionAnimation, this.this$0, this.$uiComponent, this.$quality, this.$dismissRequest, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.BooleanRef booleanRef = this.$visionAnimation;
            TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
            Ref.ObjectRef<UIComponent<?>> objectRef = this.$uiComponent;
            int i8 = this.$quality;
            CompletableDeferred<Unit> completableDeferred = this.$dismissRequest;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(booleanRef, theseusPlayerQualityService, objectRef, i8, completableDeferred, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
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
