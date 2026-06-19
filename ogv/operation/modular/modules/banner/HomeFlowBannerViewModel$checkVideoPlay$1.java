package com.bilibili.ogv.operation.modular.modules.banner;

import android.content.Context;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/HomeFlowBannerViewModel$checkVideoPlay$1.class */
final class HomeFlowBannerViewModel$checkVideoPlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    private Object L$0;
    Object L$1;
    int label;
    final s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFlowBannerViewModel$checkVideoPlay$1(s sVar, Context context, Continuation<? super HomeFlowBannerViewModel$checkVideoPlay$1> continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0$0(s sVar, i iVar, CommonCard.VideoBannerInfo videoBannerInfo, View view) {
        String str = sVar.f70515l;
        CommonCard commonCard = iVar.f70438g;
        String strA = android.support.v4.media.a.a("pgc.", str, ".banner.button.click");
        Map<String, String> map = commonCard != null ? commonCard.f69701D0 : null;
        Map<String, String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Neurons.reportClick(false, strA, mapEmptyMap);
        sVar.f70505a.E6(videoBannerInfo.f69813c, new Pair[0]);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeFlowBannerViewModel$checkVideoPlay$1 homeFlowBannerViewModel$checkVideoPlay$1 = new HomeFlowBannerViewModel$checkVideoPlay$1(this.this$0, this.$context, continuation);
        homeFlowBannerViewModel$checkVideoPlay$1.L$0 = obj;
        return homeFlowBannerViewModel$checkVideoPlay$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Type inference failed for: r0v90, types: [com.bilibili.ogv.operation.modular.modules.banner.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.modular.modules.banner.HomeFlowBannerViewModel$checkVideoPlay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
