package com.bilibili.studio.editor.moudle.home.ui;

import TB0.C2888u;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.bilibili.app.authorspace.ui.J1;
import com.bilibili.biligame.ui.home.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/InfoDialogV2.class */
public final class InfoDialogV2 extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public CharSequence f107264b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public CharSequence f107265c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C2888u f107266d;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2888u c2888uInflate = C2888u.inflate(getLayoutInflater(), viewGroup, false);
        this.f107266d = c2888uInflate;
        return c2888uInflate != null ? c2888uInflate.f23998a : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        C2888u c2888u;
        C2888u c2888u2;
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams layoutParamsA = J1.a(window, 0);
            layoutParamsA.dimAmount = 0.0f;
            layoutParamsA.width = -1;
            layoutParamsA.height = -1;
            window.setAttributes(layoutParamsA);
        }
        if (((String) this.f107264b).length() == 0 && (c2888u2 = this.f107266d) != null) {
            c2888u2.f24001d.setVisibility(8);
        }
        if (((String) this.f107265c).length() == 0 && (c2888u = this.f107266d) != null) {
            c2888u.f24000c.setVisibility(8);
        }
        setCancelable(false);
        C2888u c2888u3 = this.f107266d;
        if (c2888u3 != null) {
            c2888u3.f24001d.setText(this.f107264b);
        }
        C2888u c2888u4 = this.f107266d;
        if (c2888u4 != null) {
            c2888u4.f24000c.setText(this.f107265c);
        }
        C2888u c2888u5 = this.f107266d;
        if (c2888u5 != null) {
            c2888u5.f23999b.setOnClickListener(new o(this, 2));
        }
    }
}
