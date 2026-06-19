package com.bilibili.pegasus.components.interest.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.Tintable;
import com.bilibili.pegasus.components.interest.InterestChainErrorCode;
import com.bilibili.pegasus.components.interest.InterestChainProcess;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.Iterator;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.Q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/BaseInterestChooseDialog.class */
@StabilityInferred(parameters = 0)
public class BaseInterestChooseDialog extends DialogFragment implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public m f76372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f76373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterestChoose f76374d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76376f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76375e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f76377g = new ThemeWatcher.Observer(this) { // from class: com.bilibili.pegasus.components.interest.ui.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseInterestChooseDialog f76379a;

        {
            this.f76379a = this;
        }

        @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
        public final void onThemeChanged() {
            View view = this.f76379a.getView();
            if (view != null) {
                BaseInterestChooseDialog.hf(view);
            }
        }
    };

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
    public final void T8(@NotNull final InterestChoose interestChoose, @NotNull final Fragment fragment) {
        MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("pegasus_interest_chose", new MainDialogManager.IDialogInterface(fragment, this, interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Fragment f76380a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BaseInterestChooseDialog f76381b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final InterestChoose f76382c;

            {
                this.f76380a = fragment;
                this.f76381b = this;
                this.f76382c = interestChoose;
            }

            public final void onShow() {
                InterestChoose interestChoose2 = this.f76382c;
                Fragment fragment2 = this.f76380a;
                boolean zIsDestroyed = fragment2.getChildFragmentManager().isDestroyed();
                BaseInterestChooseDialog baseInterestChooseDialog = this.f76381b;
                if (zIsDestroyed) {
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.PAGE_INVISIBLE, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.PAGE_INVISIBLE, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "page_destroy")), null, 8);
                    m mVar = baseInterestChooseDialog.f76372b;
                    if (mVar != null) {
                        mVar.a(false, null);
                    }
                    baseInterestChooseDialog.m8033if();
                    return;
                }
                try {
                    FragmentManager childFragmentManager = fragment2.getChildFragmentManager();
                    baseInterestChooseDialog.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("key_interest_choose_data", interestChoose2);
                    baseInterestChooseDialog.setArguments(bundle);
                    baseInterestChooseDialog.show(childFragmentManager, "SubCategoryInterestChooseDialog");
                } catch (Exception e7) {
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.EXCEPTION, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "after_dialog")), null, 8);
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.DIALOG_CRASH, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    BLog.i("[InterestChoose]BaseInterestChooseDialog", "show dialog failed", e7);
                    m mVar2 = baseInterestChooseDialog.f76372b;
                    if (mVar2 != null) {
                        mVar2.a(false, null);
                    }
                    baseInterestChooseDialog.m8033if();
                }
            }
        }, 95, false), fragment.getContext());
        if (MainDialogManager.isDialogShowing("biz_block_dialog")) {
            MainDialogManager.showNextDialog("biz_block_dialog", false, fragment.getContext());
        }
        MainDialogManager.removeDialog("biz_block_dialog");
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void c1(@Nullable String str) {
        this.f76373c = str;
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m8033if() {
        MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void kc(@Nullable InterestPageCloseReason interestPageCloseReason) {
        if (interestPageCloseReason != null) {
            this.f76373c = interestPageCloseReason.getReason();
            InterestChoose interestChoose = this.f76374d;
            if (interestChoose != null && interestChoose.D() >= 35) {
                com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), interestPageCloseReason, InterestPageType.INFO, interestChoose.B());
                this.f76375e = false;
            }
        }
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void o9(@Nullable m mVar) {
        this.f76372b = mVar;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        InterestChoose interestChoose = arguments != null ? (InterestChoose) arguments.getParcelable("key_interest_choose_data") : null;
        this.f76374d = interestChoose;
        if (interestChoose != null && bundle == null) {
            ThemeWatcher.getInstance().subscribe(this.f76377g);
            return;
        }
        boolean z6 = false;
        boolean z7 = interestChoose == null;
        if (bundle != null) {
            z6 = true;
        }
        Q.a("onCreate, data invalid = ", ", from recover = ", "[InterestChoose]BaseInterestChooseDialog", z7, z6);
        dismissAllowingStateLoss();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ThemeWatcher.getInstance().unSubscribe(this.f76377g);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setDimAmount(0.0f);
        StatusBarCompat.tintStatusBar(window, ContextCompat.getColor(requireContext(), R$color.f64616Wh0));
    }
}
