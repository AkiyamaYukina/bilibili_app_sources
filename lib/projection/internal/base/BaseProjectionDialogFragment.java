package com.bilibili.lib.projection.internal.base;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.LayoutRes;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment;
import j5.C7642d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/base/BaseProjectionDialogFragment.class */
public abstract class BaseProjectionDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63011b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63012c = true;

    @LayoutRes
    public abstract int getDialogViewRes();

    public float hf() {
        return ResourcesCompat.getFloat(requireContext().getResources(), 2131165448);
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public boolean mo6609if(@NotNull KeyEvent keyEvent) {
        return false;
    }

    public void initSavedData() {
    }

    public abstract void initView(@NotNull View view);

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(getDialogViewRes(), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        initSavedData();
        initView(view);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                C7642d.a(window2, 0);
            }
            if (this.f63012c && (window = dialog.getWindow()) != null) {
                window.setDimAmount(hf());
            }
            dialog.setCancelable(isCancelable());
            dialog.setCanceledOnTouchOutside(this.f63011b);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: ke0.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BaseProjectionDialogFragment f122763a;

                {
                    this.f122763a = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                    BaseProjectionDialogFragment baseProjectionDialogFragment = this.f122763a;
                    return (i7 == 24 || i7 == 25 || i7 == 164) ? baseProjectionDialogFragment.mo6609if(keyEvent) : i7 == 4 && keyEvent.getAction() == 0 && !baseProjectionDialogFragment.isCancelable();
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException e7) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        try {
            super.showNow(fragmentManager, str);
        } catch (IllegalStateException e7) {
        }
    }
}
