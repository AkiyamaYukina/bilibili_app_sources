package com.bilibili.lib.projection.internal.widget;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.mall.ui.page.create2.OrderSubmitFragmentV2;
import kc1.i;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/y.class */
public final /* synthetic */ class y implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64152b;

    public /* synthetic */ y(Object obj, int i7) {
        this.f64151a = i7;
        this.f64152b = obj;
    }

    public /* synthetic */ y(mc1.d dVar) {
        this.f64151a = 1;
        this.f64152b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        switch (this.f64151a) {
            case 0:
                ProjectionTitleWidget projectionTitleWidget = (ProjectionTitleWidget) this.f64152b;
                x xVar = projectionTitleWidget.f63856j;
                if (xVar != null) {
                    xVar.a();
                }
                InterfaceC7845m interfaceC7845m = projectionTitleWidget.f63858l;
                if (interfaceC7845m != null && (reporter = interfaceC7845m.getReporter()) != null) {
                    ProjectionReporter.PanelMode panelMode = projectionTitleWidget.f63860n ? ProjectionReporter.PanelMode.Half : ProjectionReporter.PanelMode.Full;
                    ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.LeftTopBackButton;
                    InterfaceC7845m interfaceC7845m2 = projectionTitleWidget.f63858l;
                    IProjectionItem iProjectionItemN = null;
                    ProjectionDeviceInternal device = (interfaceC7845m2 == null || (aVarS = interfaceC7845m2.s()) == null) ? null : aVarS.getDevice();
                    InterfaceC7845m interfaceC7845m3 = projectionTitleWidget.f63858l;
                    if (interfaceC7845m3 != null) {
                        iProjectionItemN = interfaceC7845m3.n(true);
                    }
                    reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN);
                    break;
                }
                break;
            case 1:
                mc1.d dVar = (mc1.d) this.f64152b;
                i.a aVar = dVar.c;
                if (aVar != null) {
                    aVar.a();
                }
                dVar.dismiss();
                dVar.a = null;
                dVar.c = null;
                dVar.b = 0L;
                break;
            default:
                OrderSubmitFragmentV2 orderSubmitFragmentV2 = (OrderSubmitFragmentV2) this.f64152b;
                Uri uriBuild = Uri.parse(com.mall.logic.page.create.c.l).buildUpon().appendQueryParameter("title", orderSubmitFragmentV2.J).build();
                TextView textView = orderSubmitFragmentV2.I;
                TextView textView2 = textView;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLeaveMsgContent");
                    textView2 = null;
                }
                String string = textView2.getText().toString();
                orderSubmitFragmentV2.startPageBySchemaForResult(TextUtils.isEmpty(string) ? uriBuild.toString() : uriBuild.buildUpon().appendQueryParameter(NotificationCompat.CATEGORY_MESSAGE, string).toString(), com.mall.logic.page.create.c.m);
                break;
        }
    }
}
