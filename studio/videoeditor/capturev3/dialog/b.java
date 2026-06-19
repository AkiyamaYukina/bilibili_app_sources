package com.bilibili.studio.videoeditor.capturev3.dialog;

import com.bilibili.studio.videoeditor.capturev3.dialog.OptionDialog;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/b.class */
public final class b implements OptionDialog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OB0.b f109151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OptionDialog f109152b;

    public b(OB0.b bVar, OptionDialog optionDialog) {
        this.f109151a = bVar;
        this.f109152b = optionDialog;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.dialog.OptionDialog.a
    public final void a(int i7, String str) {
        OptionDialog optionDialog = this.f109152b;
        this.f109151a.a(i7, (String) ((ArrayList) optionDialog.f109142c.f109144a).get(i7));
        optionDialog.dismiss();
    }
}
