package com.bilibili.studio.videoeditor.capturev3.music.dialog;

import BB0.a;
import BB0.b;
import BB0.c;
import BB0.d;
import TB0.N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/dialog/OldMusicOperationDialog.class */
public final class OldMusicOperationDialog extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d f109261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public N f109262c;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        setStyle(2, 2131886814);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        N nInflate = N.inflate(getLayoutInflater(), viewGroup, false);
        this.f109262c = nInflate;
        return nInflate != null ? nInflate.f23650a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroyView() {
        super/*androidx.fragment.app.DialogFragment*/.onDestroyView();
        this.f109262c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        N n7 = this.f109262c;
        if (n7 != null) {
            n7.f23653d.setOnClickListener(new a(this, 0));
        }
        N n8 = this.f109262c;
        if (n8 != null) {
            n8.f23652c.setOnClickListener(new b(this, 0));
        }
        N n9 = this.f109262c;
        if (n9 != null) {
            n9.f23651b.setOnClickListener(new c(this, 0));
        }
    }
}
