package com.bilibili.module.vip.combine;

import android.net.Uri;
import android.view.ViewGroup;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.module.vip.combine.VipPaymentTipsDialogFragment;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/n.class */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f66190b;

    public /* synthetic */ n(Object obj, int i7) {
        this.f66189a = i7;
        this.f66190b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object obj3 = this.f66190b;
        switch (this.f66189a) {
            case 0:
                VipPrivilegeButton vipPrivilegeButton = (VipPrivilegeButton) obj;
                int iIntValue = ((Integer) obj2).intValue();
                VipPaymentTipsDialogFragment vipPaymentTipsDialogFragment = (VipPaymentTipsDialogFragment) obj3;
                vipPaymentTipsDialogFragment.dismiss();
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.putAll((Map) vipPaymentTipsDialogFragment.h.getValue());
                mapCreateMapBuilder.put("button", iIntValue == 0 ? "left" : "right");
                Unit unit = Unit.INSTANCE;
                Neurons.reportClick(false, "vip.membership-purchase.open-pop-up.0.click", MapsKt.build(mapCreateMapBuilder));
                int i7 = VipPaymentTipsDialogFragment.b.f66156a[vipPrivilegeButton.f66169b.ordinal()];
                if (i7 == 1) {
                    vipPaymentTipsDialogFragment.f66153e.invoke();
                } else if (i7 == 2) {
                    String str = vipPrivilegeButton.f66170c;
                    if (str != null && str.length() != 0) {
                        vipPaymentTipsDialogFragment.f66154f.invoke(Uri.parse(str));
                    }
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vipPaymentTipsDialogFragment.f66155g.invoke();
                }
                return Unit.INSTANCE;
            default:
                q9.n nVar = (q9.q) ((Function1) obj3).invoke((ViewGroup) obj);
                return nVar instanceof q9.n ? new G9.d(nVar) : new G9.b(nVar);
        }
    }
}
