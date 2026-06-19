package com.bilibili.studio.editor.musictpl;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bilibili.studio.editor.musictpl.UpperBaseDialogFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/musictpl/UpperLoadingDialogFragment.class */
public final class UpperLoadingDialogFragment extends UpperBaseDialogFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ProgressBar f108207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f108208d;

    @Override // com.bilibili.studio.editor.musictpl.UpperBaseDialogFragment
    @NotNull
    public final void hf(@NotNull UpperBaseDialogFragment.a aVar) {
        aVar.f108206a = 0.3f;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493920, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ProgressBar progressBar = this.f108207c;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.bilibili.studio.editor.musictpl.UpperBaseDialogFragment, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ProgressBar progressBar = this.f108207c;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // com.bilibili.studio.editor.musictpl.UpperBaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f108207c = (ProgressBar) view.findViewById(2131306078);
        if (this.f108208d != null) {
            ((TextView) view.findViewById(2131305845)).setText(this.f108208d);
        }
    }
}
