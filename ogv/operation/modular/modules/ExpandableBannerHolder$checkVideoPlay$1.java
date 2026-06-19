package com.bilibili.ogv.operation.modular.modules;

import android.view.View;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/ExpandableBannerHolder$checkVideoPlay$1.class */
final class ExpandableBannerHolder$checkVideoPlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final C5477h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableBannerHolder$checkVideoPlay$1(C5477h c5477h, Continuation<? super ExpandableBannerHolder$checkVideoPlay$1> continuation) {
        super(2, continuation);
        this.this$0 = c5477h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0$0(C5477h c5477h, C5488t c5488t, CommonCard.VideoBannerInfo videoBannerInfo, View view) {
        String str = c5477h.f70623g;
        CommonCard commonCard = c5488t.f70757r;
        String strA = android.support.v4.media.a.a("pgc.", str, ".banner.button.click");
        Map<String, String> map = commonCard != null ? commonCard.f69701D0 : null;
        Map<String, String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Neurons.reportClick(false, strA, mapEmptyMap);
        c5477h.f70621e.E6(videoBannerInfo.f69813c, new Pair[0]);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ExpandableBannerHolder$checkVideoPlay$1 expandableBannerHolder$checkVideoPlay$1 = new ExpandableBannerHolder$checkVideoPlay$1(this.this$0, continuation);
        expandableBannerHolder$checkVideoPlay$1.L$0 = obj;
        return expandableBannerHolder$checkVideoPlay$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.modular.modules.ExpandableBannerHolder$checkVideoPlay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
