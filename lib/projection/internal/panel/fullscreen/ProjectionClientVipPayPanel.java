package com.bilibili.lib.projection.internal.panel.fullscreen;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.router.Router;
import com.bilibili.mobile.BLMobileHumanActionNative;
import le0.C7838f;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionClientVipPayPanel.class */
public final class ProjectionClientVipPayPanel extends ProjectionDialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Button f63346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f63347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ImageView f63348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f63349g = true;

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment
    public final boolean jf() {
        return this.f63349g;
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment
    public final void kf() {
        Button button = this.f63346d;
        if (button != null) {
            button.setOnClickListener(null);
        }
        TextView textView = this.f63347e;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        ImageView imageView = this.f63348f;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        InterfaceC7845m interfaceC7845mM6;
        C7838f.a aVarI;
        if (view == this.f63346d) {
            this.f63349g = false;
            dismiss();
            InterfaceC5317a interfaceC5317a = this.f63350b;
            ProjectionItemData projectionItemData = null;
            IProjectionItem iProjectionItem = (interfaceC5317a == null || (interfaceC7845mM6 = interfaceC5317a.M6()) == null || (aVarI = interfaceC7845mM6.i()) == null) ? null : aVarI.f123159a;
            if (iProjectionItem instanceof ProjectionItemData) {
                projectionItemData = (ProjectionItemData) iProjectionItem;
            }
            Router.Companion.global().with(BiliContext.application()).with("appId", "9").with("appSubId", String.valueOf(projectionItemData != null ? projectionItemData.f63475b : 0L)).open("activity://main/vip-buy");
        }
        if (view == this.f63347e) {
            this.f63349g = false;
            dismiss();
            Router.Companion.global().with(BiliContext.application()).forResult(2360).open("activity://main/vip-main/");
        }
        if (view == this.f63348f) {
            this.f63349g = false;
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(2131496570, viewGroup, false);
        this.f63347e = (TextView) viewInflate.findViewById(2131316364);
        this.f63346d = (Button) viewInflate.findViewById(2131308765);
        this.f63348f = (ImageView) viewInflate.findViewById(2131296853);
        this.f63351c = this.f63351c;
        return viewInflate;
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment
    public final void onShow() {
        super.onShow();
        Button button = this.f63346d;
        if (button != null) {
            button.setOnClickListener(this);
        }
        TextView textView = this.f63347e;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        ImageView imageView = this.f63348f;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        if (getDialog() == null || getView() == null) {
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        requireView().measure(View.MeasureSpec.makeMeasureSpec(attributes.width, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        window.setAttributes(attributes);
    }
}
