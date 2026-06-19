package com.bilibili.pegasus.components.interest.ui.common;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.P4;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import bC.y;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.widgets.Tintable;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.Q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/BaseBottomSheetInterestChooseDialog.class */
@StabilityInferred(parameters = 0)
public abstract class BaseBottomSheetInterestChooseDialog extends BottomSheetDialogFragment implements com.bilibili.pegasus.components.interest.ui.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public m f76383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterestChoose f76384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f76385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.components.interest.ui.common.a f76386e = new ThemeWatcher.Observer(this) { // from class: com.bilibili.pegasus.components.interest.ui.common.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseBottomSheetInterestChooseDialog f76391a;

        {
            this.f76391a = this;
        }

        @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
        public final void onThemeChanged() {
            View view = this.f76391a.getView();
            if (view != null) {
                BaseBottomSheetInterestChooseDialog.hf(view);
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/BaseBottomSheetInterestChooseDialog$a.class */
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseBottomSheetInterestChooseDialog f76387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BottomSheetDialog f76388b;

        public a(BaseBottomSheetInterestChooseDialog baseBottomSheetInterestChooseDialog, BottomSheetDialog bottomSheetDialog) {
            this.f76387a = baseBottomSheetInterestChooseDialog;
            this.f76388b = bottomSheetDialog;
        }

        public final void onSlide(View view, float f7) {
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 5) {
                this.f76387a.kf();
                this.f76388b.dismiss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void hf(View view) {
        RecyclerView.Adapter adapter;
        if (view instanceof Tintable) {
            ((Tintable) view).tint();
        }
        if (view instanceof ViewGroup) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                hf((View) it.next());
            }
            if (!(view instanceof RecyclerView) || (adapter = ((RecyclerView) view).getAdapter()) == null) {
                return;
            }
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void T8(@NotNull InterestChoose interestChoose, @NotNull Fragment fragment) {
        MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("pegasus_interest_chose", new LR0.m(fragment, this, interestChoose), 95, false), fragment.getContext());
        if (MainDialogManager.isDialogShowing("biz_block_dialog")) {
            MainDialogManager.showNextDialog("biz_block_dialog", false, fragment.getContext());
        }
        MainDialogManager.removeDialog("biz_block_dialog");
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void c1(@Nullable String str) {
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public abstract int mo8035if();

    public void jf() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void kc(@Nullable InterestPageCloseReason interestPageCloseReason) {
        InterestChoose interestChoose;
        if (interestPageCloseReason != null && (interestChoose = this.f76384c) != null && interestChoose.D() >= 35) {
            com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), interestPageCloseReason, InterestPageType.INFO, interestChoose.B());
        }
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    public void kf() {
    }

    public final void lf() {
        MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void o9(@Nullable m mVar) {
        this.f76383b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        Bundle arguments = getArguments();
        InterestChoose interestChoose = arguments != null ? (InterestChoose) arguments.getParcelable("key_interest_choose_data") : null;
        this.f76384c = interestChoose;
        boolean z6 = false;
        if (interestChoose != null && bundle == null) {
            setStyle(0, 2131888801);
            ThemeWatcher.getInstance().subscribe(this.f76386e);
            return;
        }
        boolean z7 = interestChoose == null;
        if (bundle != null) {
            z6 = true;
        }
        Q.a("onCreate, data invalid = ", ", from recover = ", "[InterestChoose]BaseInterestChooseDialog", z7, z6);
        dismissAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        ThemeWatcher.getInstance().unSubscribe(this.f76386e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        View viewFindViewById;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        c.a(this, mo8035if());
        final y yVar = new y(this, 2);
        Dialog dialog = getDialog();
        if (dialog == null || (viewFindViewById = dialog.findViewById(2131313772)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener(yVar) { // from class: com.bilibili.pegasus.components.interest.ui.common.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final y f76392a;

            {
                this.f76392a = yVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76392a.invoke();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View viewFindViewById;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        BottomSheetDialog bottomSheetDialog = null;
        if (fragmentActivityP3 != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new P4(this, 2), 1, (Object) null);
        }
        BottomSheetDialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            bottomSheetDialog = dialog;
        }
        if (bottomSheetDialog == null || (viewFindViewById = bottomSheetDialog.findViewById(2131299837)) == null) {
            return;
        }
        BottomSheetBehavior.from(viewFindViewById).addBottomSheetCallback(new a(this, bottomSheetDialog));
    }
}
