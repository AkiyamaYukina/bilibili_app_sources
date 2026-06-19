package com.bilibili.upper.module.template.dialog;

import SD0.j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.bilibili.bililive.mixstream.view.RtcDeviceChoiceDialog;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.upper.module.contribute.picker.model.MaterialUGCTemplateVM;
import com.bilibili.upper.module.contribute.picker.ui.D;
import com.bilibili.upper.module.contribute.picker.ui.MaterialChooseActivity;
import com.bilibili.upper.module.template.dialog.UpperFullScreenLoadingDialog;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/dialog/UpperFullScreenLoadingDialog.class */
@StabilityInferred(parameters = 0)
public final class UpperFullScreenLoadingDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public D f113990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f113991c;

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return 2131888105;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494041, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i7 = 0;
        ((ImageView) view.findViewById(2131303543)).setOnClickListener(new View.OnClickListener(this, i7) { // from class: MI0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f16072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DialogFragment f16073b;

            {
                this.f16072a = i7;
                this.f16073b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (this.f16072a) {
                    case 0:
                        D d7 = ((UpperFullScreenLoadingDialog) this.f16073b).f113990b;
                        if (d7 != null) {
                            WeakReference weakReference = MaterialChooseActivity.V;
                            MaterialChooseActivity materialChooseActivity = d7.a;
                            UpperFullScreenLoadingDialog upperFullScreenLoadingDialog = materialChooseActivity.N;
                            if (upperFullScreenLoadingDialog != null) {
                                upperFullScreenLoadingDialog.f113990b = null;
                                upperFullScreenLoadingDialog.dismiss();
                            }
                            materialChooseActivity.N = null;
                            MaterialUGCTemplateVM materialUGCTemplateVMR6 = materialChooseActivity.R6();
                            materialUGCTemplateVMR6.d = 4;
                            BiliTemplateEngineManager biliTemplateEngineManager = materialUGCTemplateVMR6.f;
                            if (biliTemplateEngineManager != null) {
                                biliTemplateEngineManager.e(false, false, new j(biliTemplateEngineManager, 2));
                            }
                        }
                        break;
                    default:
                        RtcDeviceChoiceDialog rtcDeviceChoiceDialog = this.f16073b;
                        VC.b bVar = rtcDeviceChoiceDialog.c;
                        if (bVar != null) {
                            bVar.a(RtcDeviceChoiceDialog.DeviceType.HEADSET);
                        }
                        int i8 = rtcDeviceChoiceDialog.b;
                        String str = i8 != 1 ? i8 != 2 ? "" : "live.live-room-detail.audio-management.popup.click" : "live.my-live-room-show.audio-management.popup.click";
                        ArrayMap arrayMap = new ArrayMap();
                        arrayMap.put("button_type", "1");
                        Unit unit = Unit.INSTANCE;
                        Neurons.reportClick(false, str, arrayMap);
                        rtcDeviceChoiceDialog.dismissAllowingStateLoss();
                        break;
                }
            }
        });
        Integer num = this.f113991c;
        if (num != null && num.intValue() == 1) {
            ((ImageView) view.findViewById(2131303543)).setVisibility(8);
            ((TextView) view.findViewById(2131300259)).setVisibility(8);
            ((ConstraintLayout) view.findViewById(2131297483)).setBackgroundColor(0);
        }
    }
}
