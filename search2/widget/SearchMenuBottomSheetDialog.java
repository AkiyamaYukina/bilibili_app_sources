package com.bilibili.search2.widget;

import Bl.n1;
import Yt0.InterfaceC3155i;
import Yt0.W;
import Yt0.X;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.lib.ui.menu.IFloatMenuItem;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchMenuBottomSheetDialog.class */
@StabilityInferred(parameters = 0)
public final class SearchMenuBottomSheetDialog extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n1 f88943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<? extends IFloatMenuItem> f88944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f88945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f88946e;

    public final void dismissAllowingStateLoss() {
        try {
            super.dismissAllowingStateLoss();
        } catch (Exception e7) {
            M.b("dismissAllowingStateLoss error ", e7.getMessage(), "SearchMenuBottomSheetDialog");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        } else {
            setStyle(0, 2131888957);
        }
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        n1 n1VarInflate = n1.inflate(layoutInflater, viewGroup, false);
        this.f88943b = n1VarInflate;
        n1 n1Var = n1VarInflate;
        if (n1VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n1Var = null;
        }
        return n1Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        try {
            super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        } catch (Exception e7) {
            M.b("onDismiss error: ", e7.getMessage(), "SearchMenuBottomSheetDialog");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        Window window;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(AdExtensions.getToPx(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND), -2);
        window.setGravity(81);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View viewFindViewById;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        BottomSheetDialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? dialog : null;
        if (bottomSheetDialog != null) {
            Window window = bottomSheetDialog.getWindow();
            if (window != null) {
                window.setDimAmount(0.5f);
            }
            View viewFindViewById2 = bottomSheetDialog.findViewById(2131299837);
            if (viewFindViewById2 != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById2);
                bottomSheetBehaviorFrom.setState(3);
                bottomSheetBehaviorFrom.setPeekHeight(0);
            }
        }
        n1 n1Var = this.f88943b;
        n1 n1Var2 = n1Var;
        if (n1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n1Var2 = null;
        }
        n1Var2.b.setOnClickListener(new W(this, 0));
        List<? extends IFloatMenuItem> list = this.f88944c;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                int i7 = 0;
                for (Object obj : list) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    IFloatMenuItem iFloatMenuItem = (IFloatMenuItem) obj;
                    n1 n1Var3 = this.f88943b;
                    n1 n1Var4 = n1Var3;
                    if (n1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        n1Var4 = null;
                    }
                    View view2 = iFloatMenuItem.getView(null, n1Var4.c);
                    if (i7 <= 0 || i7 >= list.size()) {
                        iFloatMenuItem.toggleDivider(8);
                    } else {
                        iFloatMenuItem.toggleDivider(0);
                    }
                    n1 n1Var5 = this.f88943b;
                    n1 n1Var6 = n1Var5;
                    if (n1Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        n1Var6 = null;
                    }
                    n1Var6.c.addView(view2, i7);
                    InterfaceC3155i interfaceC3155i = iFloatMenuItem instanceof InterfaceC3155i ? (InterfaceC3155i) iFloatMenuItem : null;
                    if (interfaceC3155i != null) {
                        interfaceC3155i.a(this);
                    }
                    i7++;
                }
            }
        }
        BottomSheetDialog dialog2 = getDialog();
        BottomSheetDialog bottomSheetDialog2 = dialog2 instanceof BottomSheetDialog ? dialog2 : null;
        if (bottomSheetDialog2 == null || (viewFindViewById = bottomSheetDialog2.findViewById(2131299837)) == null) {
            return;
        }
        BottomSheetBehavior.from(viewFindViewById).addBottomSheetCallback(new X(this, bottomSheetDialog2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        try {
            super/*androidx.fragment.app.DialogFragment*/.show(fragmentManager, str);
        } catch (Exception e7) {
            M.b("show error: ", e7.getMessage(), "SearchMenuBottomSheetDialog");
        }
    }
}
