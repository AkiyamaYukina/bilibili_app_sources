package com.bilibili.studio.videoeditor.capturev3.music;

import HG0.C2098n0;
import TB0.L;
import android.app.Application;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.videoeditor.capturev3.dialog.OptionDialog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/a.class */
public final class a extends f {
    @Override // com.bilibili.studio.videoeditor.capturev3.music.f
    public final void b(@Nullable ViewBinding viewBinding) {
        if (viewBinding instanceof L) {
            L l7 = (L) viewBinding;
            c(l7.f23556V, l7.f23582r0, l7.f23566c0, l7.f23559X0, l7.f23542H, l7.f23579p0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.DialogFragment, com.bilibili.studio.videoeditor.capturev3.dialog.OptionDialog] */
    @Override // com.bilibili.studio.videoeditor.capturev3.music.f
    public final void e(@NotNull FragmentManager fragmentManager) {
        ?? optionDialog = new OptionDialog();
        Application application = BiliContext.application();
        String string = application == null ? "" : application.getString(2131841794);
        Application application2 = BiliContext.application();
        optionDialog.hf(new String[]{string, application2 != null ? application2.getString(2131841870) : ""});
        optionDialog.f109142c.f109145b = new com.bilibili.studio.videoeditor.capturev3.dialog.a(new C2098n0(this, 2), optionDialog);
        optionDialog.show(fragmentManager, "MusicOperationDialog");
    }
}
