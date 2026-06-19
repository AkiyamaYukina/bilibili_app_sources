package com.bilibili.upper.module.template.dialog;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import bF0.C5036q2;
import com.bilibili.bililive.mixstream.view.RtcDeviceChoiceDialog;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.upper.module.template.dialog.UpperDownloadProgressDialog;
import com.bilibili.upper.widget.UpperCircleProgressView;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/dialog/UpperDownloadProgressDialog.class */
@StabilityInferred(parameters = 0)
public final class UpperDownloadProgressDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f113986b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a f113988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C5036q2 f113989e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/dialog/UpperDownloadProgressDialog$a.class */
    public interface a {
        void onClick();
    }

    public final void hf() {
        UpperCircleProgressView upperCircleProgressView;
        C5036q2 c5036q2 = this.f113989e;
        if (c5036q2 == null || (upperCircleProgressView = c5036q2.f56007c) == null) {
            return;
        }
        upperCircleProgressView.setProgress(this.f113987c);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme.Translucent);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C5036q2 c5036q2Inflate = C5036q2.inflate(getLayoutInflater(), viewGroup, false);
        this.f113989e = c5036q2Inflate;
        return c5036q2Inflate != null ? c5036q2Inflate.f56005a : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            dismiss();
        }
        C5036q2 c5036q2 = this.f113989e;
        if (c5036q2 != null) {
            c5036q2.f56008d.setText(this.f113986b);
        }
        hf();
        C5036q2 c5036q22 = this.f113989e;
        if (c5036q22 != null) {
            final int i7 = 0;
            c5036q22.f56006b.setOnClickListener(new View.OnClickListener(this, i7) { // from class: MI0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f16070a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DialogFragment f16071b;

                {
                    this.f16070a = i7;
                    this.f16071b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f16070a) {
                        case 0:
                            UpperDownloadProgressDialog.a aVar = ((UpperDownloadProgressDialog) this.f16071b).f113988d;
                            if (aVar != null) {
                                aVar.onClick();
                            }
                            break;
                        default:
                            RtcDeviceChoiceDialog rtcDeviceChoiceDialog = this.f16071b;
                            VC.b bVar = rtcDeviceChoiceDialog.c;
                            if (bVar != null) {
                                bVar.a(RtcDeviceChoiceDialog.DeviceType.SOUND_CARD);
                            }
                            int i8 = rtcDeviceChoiceDialog.b;
                            String str = i8 != 1 ? i8 != 2 ? "" : "live.live-room-detail.audio-management.popup.click" : "live.my-live-room-show.audio-management.popup.click";
                            ArrayMap arrayMap = new ArrayMap();
                            arrayMap.put("button_type", "2");
                            Unit unit = Unit.INSTANCE;
                            Neurons.reportClick(false, str, arrayMap);
                            rtcDeviceChoiceDialog.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
    }
}
