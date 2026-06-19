package com.bilibili.pegasus.holders;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.moduleservice.fasthybrid.BWAppletReportSceneType;
import com.bilibili.moduleservice.fasthybrid.BWAppletReportService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/R0.class */
@StabilityInferred(parameters = 0)
public final class R0 extends C5670m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final aq0.O0 f77628k;

    public R0(@NotNull aq0.O0 o02) {
        super(o02);
        this.f77628k = o02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: y0 */
    public final void u0(@NotNull fp0.u uVar) {
        BWAppletReportService bWAppletReportService;
        super.u0(uVar);
        String subtitle = uVar.getSubtitle();
        aq0.O0 o02 = this.f77628k;
        if (subtitle == null || subtitle.length() == 0) {
            o02.f53801q.setMaxLines(2);
            o02.f53796l.setVisibility(8);
        } else {
            o02.f53801q.setMaxLines(1);
            TintTextView tintTextView = o02.f53796l;
            tintTextView.setVisibility(0);
            tintTextView.setText(uVar.getSubtitle());
        }
        View view = this.itemView;
        String talkBack = uVar.getTalkBack();
        if (talkBack == null) {
            talkBack = uVar.getTitle();
        }
        view.setContentDescription(talkBack);
        if (!Intrinsics.areEqual(uVar.getGoTo(), "comic") || (bWAppletReportService = (BWAppletReportService) BLRouter.get$default(BLRouter.INSTANCE, BWAppletReportService.class, (String) null, 2, (Object) null)) == null) {
            return;
        }
        Context context = this.itemView.getContext();
        String uri = uVar.getUri();
        String str = uri;
        if (uri == null) {
            str = "";
        }
        bWAppletReportService.onShow(context, str, BWAppletReportSceneType.TM_GAME);
    }
}
