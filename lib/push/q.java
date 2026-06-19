package com.bilibili.lib.push;

import com.bilibili.opd.app.bizcommon.ui.widget.MallDialog;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.mall.data.page.create.submit.OrderInfoBean;
import com.mall.logic.page.create.OrderSubmitViewModel;
import com.mall.ui.page.create2.OrderSubmitFragmentV3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/q.class */
public final /* synthetic */ class q implements OnCompleteListener, MallDialog.DialogOkClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f64257a;

    public /* synthetic */ q(Object obj) {
        this.f64257a = obj;
    }

    public void onComplete(Task task) {
        HuaweiNewPushRegistry.init$lambda$0((HuaweiNewPushRegistry) this.f64257a, task);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.widget.MallDialog.DialogOkClickListener
    public void onDialogClick(int i7) {
        OrderInfoBean orderInfoBean;
        if (i7 == 1) {
            OrderSubmitFragmentV3 orderSubmitFragmentV3 = (OrderSubmitFragmentV3) this.f64257a;
            UO0.a aVar = orderSubmitFragmentV3.b;
            if (aVar != null) {
                OrderSubmitViewModel orderSubmitViewModel = orderSubmitFragmentV3.a1;
                aVar.e((orderSubmitViewModel == null || (orderInfoBean = orderSubmitViewModel.x) == null) ? null : orderInfoBean.virtualDto);
            }
            OrderSubmitViewModel orderSubmitViewModel2 = orderSubmitFragmentV3.a1;
            if (orderSubmitViewModel2 != null) {
                orderSubmitViewModel2.P0();
            }
        }
    }
}
