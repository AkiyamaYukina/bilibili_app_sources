package com.bilibili.upper.module.tempalte.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.adcommon.data.model.AdIMaxBean;
import com.bilibili.adcommon.data.model.ConfigBean;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.GAdReport;
import com.bilibili.gripper.api.ad.core.report.IReportPreset;
import com.bilibili.gripper.api.ad.core.report.ReportPresetKt;
import com.bilibili.gripper.api.ad.core.report.UIExtraParams;
import com.bilibili.upper.module.tempalte.dialog.UpperDownloadProgressDialog;
import com.bilibili.upper.module.tempalte.dialog.UpperDownloadProgressDialogV2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import ue.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/dialog/UpperDownloadProgressDialogV2.class */
@StabilityInferred(parameters = 0)
public final class UpperDownloadProgressDialogV2 extends UpperDownloadProgressDialog {

    @Nullable
    public TextView h;

    @Override // com.bilibili.upper.module.tempalte.dialog.UpperDownloadProgressDialog, androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f113944c = 2131495385;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.bilibili.upper.module.tempalte.dialog.UpperDownloadProgressDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Resources resources;
        TextView textView = (TextView) view.findViewById(2131298369);
        this.h = textView;
        if (textView != null) {
            Context context = getContext();
            textView.setText((context == null || (resources = context.getResources()) == null) ? null : resources.getString(2131850740, 0));
        }
        final int i7 = 0;
        ((TextView) view.findViewById(2131298368)).setOnClickListener(new View.OnClickListener(i7, this) { // from class: HI0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8648a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LifecycleOwner f8649b;

            {
                this.f8648a = i7;
                this.f8649b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfigBean firstConfigBean;
                switch (this.f8648a) {
                    case 0:
                        UpperDownloadProgressDialogV2 upperDownloadProgressDialogV2 = (UpperDownloadProgressDialogV2) this.f8649b;
                        UpperDownloadProgressDialog.b bVar = upperDownloadProgressDialogV2.f113945d;
                        if (bVar != null) {
                            bVar.a(upperDownloadProgressDialogV2);
                        }
                        break;
                    default:
                        c cVar = this.f8649b;
                        IPlayerContainer iPlayerContainer = cVar.e;
                        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                        if (iPlayerContainer == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("playerContainer");
                            iPlayerContainer2 = null;
                        }
                        iPlayerContainer2.getVideoPlayDirectorService().replayCurrentVideoItem();
                        GAdReport gAdReport = GAdCoreKt.getGAdReport();
                        IReportPreset iReportPreset = (IReportPreset) cVar.l.getValue();
                        AdIMaxBean adIMaxBeanI = cVar.i();
                        gAdReport.uiEvent("imax_video_endpage_replay_click", ReportPresetKt.addUrl(iReportPreset, (adIMaxBeanI == null || (firstConfigBean = adIMaxBeanI.getFirstConfigBean()) == null) ? null : firstConfigBean.weburl), new UIExtraParams((Bundle) null, 1, (DefaultConstructorMarker) null).GAME_ID(String.valueOf(cVar.k())));
                        break;
                }
            }
        });
    }
}
