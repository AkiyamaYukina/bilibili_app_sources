package com.bilibili.playerbizcommonv2.widget.share;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/share/ShareLoadingDialog.class */
@StabilityInferred(parameters = 0)
public final class ShareLoadingDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f83397b;

    public ShareLoadingDialog() {
        setStyle(1, 2131889093);
    }

    @Nullable
    public final <R> Object hf(@NotNull FragmentActivity fragmentActivity, @NotNull Function2<? super ShareLoadingDialog, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new ShareLoadingDialog$showWithBlocking$2(this, fragmentActivity, function2, null), continuation);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        a aVar = this.f83397b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131502592, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.getDecorView().setPadding(0, 0, 0, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }
}
