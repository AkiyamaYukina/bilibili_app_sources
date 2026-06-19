package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.fasthybrid.game.scenarios.game.ui.widget.OnlineModalDialog;
import com.mall.ui.page.order.express.MallExpressDetailBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.radar.ui.coupon.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/e.class */
public final /* synthetic */ class C5573e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f74264b;

    public /* synthetic */ C5573e(DialogFragment dialogFragment, int i7) {
        this.f74263a = i7;
        this.f74264b = dialogFragment;
    }

    public /* synthetic */ C5573e(AlertDialogC5574f alertDialogC5574f) {
        this.f74263a = 0;
        this.f74264b = alertDialogC5574f;
    }

    public final Object invoke() {
        switch (this.f74263a) {
            case 0:
                return (TextView) ((AlertDialogC5574f) this.f74264b).findViewById(2131300179);
            case 1:
                View view = ((MallExpressDetailBottomSheet) this.f74264b).d;
                return view != null ? (RecyclerView) view.findViewById(2131299971) : null;
            default:
                OnlineModalDialog onlineModalDialog = (OnlineModalDialog) this.f74264b;
                onlineModalDialog.dismissAllowingStateLoss();
                Function0 function0 = onlineModalDialog.c;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
