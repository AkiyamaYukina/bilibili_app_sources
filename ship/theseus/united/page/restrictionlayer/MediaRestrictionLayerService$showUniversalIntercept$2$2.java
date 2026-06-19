package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.B;
import com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.Z;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/MediaRestrictionLayerService$showUniversalIntercept$2$2.class */
final class MediaRestrictionLayerService$showUniversalIntercept$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Z $component;
    final B.a.C1106a $extraInfo;
    Object L$0;
    Object L$1;
    int label;
    final MediaRestrictionLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaRestrictionLayerService$showUniversalIntercept$2$2(B.a.C1106a c1106a, MediaRestrictionLayerService mediaRestrictionLayerService, Z z6, Continuation<? super MediaRestrictionLayerService$showUniversalIntercept$2$2> continuation) {
        super(1, continuation);
        this.$extraInfo = c1106a;
        this.this$0 = mediaRestrictionLayerService;
        this.$component = z6;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MediaRestrictionLayerService$showUniversalIntercept$2$2(this.$extraInfo, this.this$0, this.$component, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        MediaRestrictionLayerService mediaRestrictionLayerService;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaRestrictionLayerService = (MediaRestrictionLayerService) this.L$1;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar3;
                gVar.j(mediaRestrictionLayerService);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2 = gVar3;
                gVar2.j(mediaRestrictionLayerService);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        B.a.C1106a c1106a = this.$extraInfo;
        if (c1106a != null) {
            c1106a.f102504b.invoke();
        }
        MediaRestrictionLayerService mediaRestrictionLayerService2 = this.this$0;
        gVar = mediaRestrictionLayerService2.f102601c;
        Z z6 = this.$component;
        gVar.f(mediaRestrictionLayerService2);
        try {
            TheseusFloatLayerService theseusFloatLayerService = mediaRestrictionLayerService2.f102602d;
            this.L$0 = gVar;
            this.L$1 = mediaRestrictionLayerService2;
            this.label = 1;
            if (theseusFloatLayerService.i(z6, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mediaRestrictionLayerService = mediaRestrictionLayerService2;
            gVar.j(mediaRestrictionLayerService);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            mediaRestrictionLayerService = mediaRestrictionLayerService2;
            gVar2 = gVar;
            th = th3;
            gVar2.j(mediaRestrictionLayerService);
            throw th;
        }
    }
}
