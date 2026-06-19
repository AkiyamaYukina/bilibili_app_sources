package com.bilibili.lib.projection.internal.panel.fullscreen;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import ke0.InterfaceC7754b;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionDialogFragment.class */
public class ProjectionDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC5317a f63350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f63351c;

    /* JADX WARN: Multi-variable type inference failed */
    public final void hf(View view) {
        InterfaceC7845m interfaceC7845mM6;
        InterfaceC7845m interfaceC7845mM62;
        if (view instanceof InterfaceC7754b) {
            InterfaceC5317a interfaceC5317a = this.f63350b;
            if (interfaceC5317a == null || (interfaceC7845mM62 = interfaceC5317a.M6()) == null) {
                return;
            }
            ((InterfaceC7754b) view).i(interfaceC7845mM62);
            return;
        }
        if (view instanceof InterfaceC7755c) {
            InterfaceC5317a interfaceC5317a2 = this.f63350b;
            if (interfaceC5317a2 == null || (interfaceC7845mM6 = interfaceC5317a2.M6()) == null) {
                return;
            }
            ((InterfaceC7755c) view).i(interfaceC7845mM6);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                hf(viewGroup.getChildAt(i7));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m6642if(View view) {
        InterfaceC7845m interfaceC7845mM6;
        InterfaceC7845m interfaceC7845mM62;
        if (view instanceof InterfaceC7754b) {
            InterfaceC5317a interfaceC5317a = this.f63350b;
            if (interfaceC5317a == null || (interfaceC7845mM62 = interfaceC5317a.M6()) == null) {
                return;
            }
            ((InterfaceC7754b) view).b(interfaceC7845mM62);
            return;
        }
        if (view instanceof InterfaceC7755c) {
            InterfaceC5317a interfaceC5317a2 = this.f63350b;
            if (interfaceC5317a2 == null || (interfaceC7845mM6 = interfaceC5317a2.M6()) == null) {
                return;
            }
            ((InterfaceC7755c) view).b(interfaceC7845mM6);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                m6642if(viewGroup.getChildAt(i7));
            }
        }
    }

    public boolean jf() {
        return false;
    }

    public void kf() {
        View view = this.f63351c;
        if (view != null) {
            m6642if(view);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (getDialog() == null) {
            setShowsDialog(false);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        InterfaceC5317a interfaceC5317a = this.f63350b;
        if (interfaceC5317a != null) {
            interfaceC5317a.Td(this);
        }
        kf();
        this.f63351c = null;
        super.onDismiss(dialogInterface);
    }

    public void onShow() {
        View view = this.f63351c;
        if (view != null) {
            hf(view);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        onShow();
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
