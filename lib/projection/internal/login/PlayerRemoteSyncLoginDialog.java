package com.bilibili.lib.projection.internal.login;

import Ns.b;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.search.ProjectionSearchFragment;
import com.bilibili.mobile.BLMobileHumanActionNative;
import j5.C7642d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/login/PlayerRemoteSyncLoginDialog.class */
public final class PlayerRemoteSyncLoginDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TextView f63211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Button f63212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Button f63213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ProjectionSearchFragment.b f63214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f63215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public SyncCheckResult f63216g;

    @Nullable
    public String h;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (getDialog() == null) {
            setShowsDialog(false);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
            Window window = dialog.getWindow();
            if (window != null) {
                C7642d.a(window, 0);
            }
        }
        return layoutInflater.inflate(2131494161, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = NewPlayerUtilsKt.toPx(280.0f);
        attributes.height = NewPlayerUtilsKt.toPx(224.0f);
        View view = getView();
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(attributes.width, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        window.setAttributes(attributes);
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        TextView textView;
        super.onViewCreated(view, bundle);
        this.f63211b = (TextView) view.findViewById(2131309494);
        if (!TextUtils.isEmpty(this.h) && (textView = this.f63211b) != null) {
            textView.setText(this.h);
        }
        View viewFindViewById = view.findViewById(2131297809);
        this.f63212c = (Button) viewFindViewById.findViewById(2131298185);
        this.f63213d = (Button) viewFindViewById.findViewById(2131298184);
        View.OnClickListener bVar = new b(this, 4);
        Button button = this.f63212c;
        if (button != null) {
            button.setOnClickListener(bVar);
        }
        Button button2 = this.f63213d;
        if (button2 != null) {
            button2.setOnClickListener(bVar);
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        if (fragmentManager.isStateSaved()) {
            return;
        }
        super.show(fragmentManager, str);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        if (fragmentManager.isStateSaved()) {
            return;
        }
        super.showNow(fragmentManager, str);
    }
}
