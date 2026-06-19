package com.bilibili.module.vip.mall;

import Gh0.C1976b;
import android.content.Context;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.module.vip.mall.VipBuyResultDialogViewModel;
import com.bilibili.module.vip.mall.VipPayResultInfo;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.relation.api.RelationService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPaymentResultDialog.class */
@StabilityInferred(parameters = 0)
public final class VipPaymentResultDialog extends ComponentDialog {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66243e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final VipPayResultInfo.VipPayResultDialogContentInfo f66245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f66246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final VipBuyResultDialogViewModel f66247d;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.module.vip.mall.d] */
    public VipPaymentResultDialog(@NotNull final Context context, boolean z6, @NotNull VipPayResultInfo.VipPayResultDialogContentInfo vipPayResultDialogContentInfo, @NotNull Map<String, String> map) {
        super(context, 0, 2, null);
        this.f66244a = z6;
        this.f66245b = vipPayResultDialogContentInfo;
        this.f66246c = map;
        this.f66247d = new VipBuyResultDialogViewModel(new Function2(context, this) { // from class: com.bilibili.module.vip.mall.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f66251a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VipPaymentResultDialog f66252b;

            {
                this.f66251a = context;
                this.f66252b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object invoke(Object obj, Object obj2) {
                Context context2 = this.f66251a;
                VipBuyResultDialogViewModel vipBuyResultDialogViewModel = (VipBuyResultDialogViewModel) obj;
                VipBuyResultDialogViewModel.Button button = (VipBuyResultDialogViewModel.Button) obj2;
                if (button.f66222d == (vipBuyResultDialogViewModel.a() == null ? VipBuyResultDialogViewModel.Button.ButtonIndex.FIRST : VipBuyResultDialogViewModel.Button.ButtonIndex.LAST) && ((Boolean) vipBuyResultDialogViewModel.f66209d.getValue()).booleanValue() && ((Boolean) vipBuyResultDialogViewModel.f66208c.getValue()).booleanValue()) {
                    ((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelation(BiliAccounts.get(context2).getAccessKey(), 321173469L, 1, 190).enqueue(new C5419b(vipBuyResultDialogViewModel));
                }
                String str = button.f66220b;
                if (str != null && str.length() != 0) {
                    C1976b.a(context2, str);
                }
                VipPaymentResultDialog vipPaymentResultDialog = this.f66252b;
                vipPaymentResultDialog.f66247d.f66207b.setValue(Boolean.FALSE);
                vipPaymentResultDialog.dismiss();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f66244a) {
            Neurons.reportExposure$default(false, "vip.membership-purchase.dialog.big-success.show", this.f66246c, (List) null, 8, (Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004e  */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.module.vip.mall.VipPaymentResultDialog.onCreate(android.os.Bundle):void");
    }
}
