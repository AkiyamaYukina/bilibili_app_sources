package com.bilibili.studio.editor.musictpl;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/musictpl/UpperBaseDialogFragment.class */
public abstract class UpperBaseDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f108205b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/musictpl/UpperBaseDialogFragment$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f108206a;
    }

    @NotNull
    public void hf(@NotNull a aVar) {
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog;
        if (getRetainInstance() && (dialog = getDialog()) != null) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStart() {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.musictpl.UpperBaseDialogFragment.onStart():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.studio.editor.musictpl.UpperBaseDialogFragment$a, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ?? obj = new Object();
        this.f108205b = obj;
        hf(obj);
        a aVar = this.f108205b;
        a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuilder");
            aVar2 = null;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            aVar2.getClass();
            dialog.setCanceledOnTouchOutside(false);
            dialog.getWindow();
        }
    }
}
