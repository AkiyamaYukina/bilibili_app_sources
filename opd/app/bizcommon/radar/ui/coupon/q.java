package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.opd.app.bizcommon.radar.component.ReportClickData;
import com.bilibili.opd.app.bizcommon.radar.data.MaCouponVO;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/q.class */
public final /* synthetic */ class q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f74411a;

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        RadarTriggerContent radarTriggerContent;
        MaCouponVO maCouponVO;
        com.mall.logic.support.radar.e eVarA;
        t tVar = this.f74411a;
        Activity activity = tVar.f74417b.get();
        if (activity != 0 && (maCouponVO = (radarTriggerContent = tVar.f74416a).getMaCouponVO()) != null && maCouponVO.getCouponFloatStatus() == 1) {
            BLRouter bLRouter = BLRouter.INSTANCE;
            cn0.d dVar = (cn0.d) com.bilibili.ad.adview.story.c.a(bLRouter, cn0.d.class, (String) null, 1, (Object) null);
            if (dVar != null && (eVarA = dVar.a()) != null) {
                LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
                if (lifecycleOwner != null) {
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new RadarCouponView$handleCouponClick$1(maCouponVO, tVar, eVarA, activity, null), 3, (Object) null);
                    cn0.d dVar2 = (cn0.d) com.bilibili.ad.adview.story.c.a(bLRouter, cn0.d.class, (String) null, 1, (Object) null);
                    if (dVar2 != null) {
                        dVar2.k(new ReportClickData("itemsDetailCouponFloating", radarTriggerContent.getId(), "", "", radarTriggerContent.getGroup(), radarTriggerContent.getJumpAction(), radarTriggerContent.getConvertReportMap(), radarTriggerContent.getAttachInfo(), 0, ""), null);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
