package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.ui.graphics.painter.Painter;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/ShowQualityVisionInfo$invoke$1$1$1.class */
public final class ShowQualityVisionInfo$invoke$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Function0<Unit> $dismiss;
    final int $targetQuality;
    int label;
    final T this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowQualityVisionInfo$invoke$1$1$1(T t7, Function0<Unit> function0, int i7, Continuation<? super ShowQualityVisionInfo$invoke$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = t7;
        this.$dismiss = function0;
        this.$targetQuality = i7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ShowQualityVisionInfo$invoke$1$1$1(this.this$0, this.$dismiss, this.$targetQuality, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            T t7 = this.this$0;
            TheseusFloatLayerService theseusFloatLayerService = t7.f103760c;
            Function0<Unit> function0 = this.$dismiss;
            int i8 = this.$targetQuality;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (Intrinsics.areEqual(t7.f103764g.f(), Boolean.FALSE)) {
                Map<String, ? extends Painter> map = K.f103728c;
                objectRef.element = map != null ? map.get("player_vip_vision_demo.svga") : null;
                str = "https://i0.hdslb.com/bfs/bangumi/image/4c82716ffd9946f36194f698b50edfb5cc3a5029.png";
            } else {
                str = "https://i0.hdslb.com/bfs/bangumi/image/302fcfe3d37acbdd8a3c27a59c40933d495596e8.png";
            }
            Q q7 = new Q(ThemeStrategy.ForceDay, objectRef, str, t7, function0, i8, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Ex.f(t7, 4)));
            this.label = 1;
            if (theseusFloatLayerService.i(q7, null, this) == coroutine_suspended) {
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
