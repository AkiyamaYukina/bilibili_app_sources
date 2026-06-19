package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/QualityVisionKt$QualityVisionImage$1$1.class */
public final class QualityVisionKt$QualityVisionImage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $loop;
    final Painter $painter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityVisionKt$QualityVisionImage$1$1(Painter painter, boolean z6, Continuation<? super QualityVisionKt$QualityVisionImage$1$1> continuation) {
        super(2, continuation);
        this.$painter = painter;
        this.$loop = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QualityVisionKt$QualityVisionImage$1$1(this.$painter, this.$loop, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0096 -> B:21:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r9
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L2f
            r0 = r11
            r1 = 1
            if (r0 == r1) goto L28
            r0 = r11
            r1 = 2
            if (r0 != r1) goto L1e
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9b
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L28:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L58
        L2f:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
        L33:
            r0 = r9
            androidx.compose.ui.graphics.painter.Painter r0 = r0.$painter
            com.bilibili.ship.theseus.united.page.videoquality.K$a r0 = (com.bilibili.ship.theseus.united.page.videoquality.K.a) r0
            androidx.compose.animation.core.Animatable r0 = r0.getAnimatable()
            r10 = r0
            r0 = 0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            r13 = r0
            r0 = r9
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r13
            r2 = r9
            java.lang.Object r0 = r0.snapTo(r1, r2)
            r1 = r12
            if (r0 != r1) goto L58
            r0 = r12
            return r0
        L58:
            r0 = r9
            androidx.compose.ui.graphics.painter.Painter r0 = r0.$painter
            com.bilibili.ship.theseus.united.page.videoquality.K$a r0 = (com.bilibili.ship.theseus.united.page.videoquality.K.a) r0
            androidx.compose.animation.core.Animatable r0 = r0.getAnimatable()
            r13 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            r14 = r0
            r0 = r9
            androidx.compose.ui.graphics.painter.Painter r0 = r0.$painter
            com.bilibili.ship.theseus.united.page.videoquality.K$a r0 = (com.bilibili.ship.theseus.united.page.videoquality.K.a) r0
            int r0 = r0.a()
            r1 = 0
            androidx.compose.animation.core.Easing r2 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            r3 = 2
            r4 = 0
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r0, r1, r2, r3, r4)
            r10 = r0
            r0 = r9
            r1 = 2
            r0.label = r1
            r0 = r13
            r1 = r14
            r2 = r10
            r3 = 0
            r4 = 0
            r5 = r9
            r6 = 12
            r7 = 0
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r12
            if (r0 != r1) goto L9b
            r0 = r12
            return r0
        L9b:
            r0 = r9
            boolean r0 = r0.$loop
            if (r0 != 0) goto L33
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.QualityVisionKt$QualityVisionImage$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
