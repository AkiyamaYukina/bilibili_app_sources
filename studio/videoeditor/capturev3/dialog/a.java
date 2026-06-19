package com.bilibili.studio.videoeditor.capturev3.dialog;

import HG0.C2098n0;
import com.bilibili.studio.videoeditor.capturev3.dialog.OptionDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/a.class */
public final class a implements OptionDialog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2098n0 f109149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OptionDialog f109150b;

    public a(C2098n0 c2098n0, OptionDialog optionDialog) {
        this.f109149a = c2098n0;
        this.f109150b = optionDialog;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.dialog.OptionDialog.a
    public final void a(int i7, String str) {
        this.f109149a.invoke(Integer.valueOf(i7), str);
        this.f109150b.dismiss();
    }
}
