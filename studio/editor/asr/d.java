package com.bilibili.studio.editor.asr;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/d.class */
public final class d implements Ew0.c {
    @Override // Ew0.c
    public final void d(@NotNull String str, @Nullable String str2) {
        BLog.d(str, str2);
    }

    @Override // Ew0.c
    public final void e(@NotNull String str, @Nullable String str2) {
        BLog.e(str, str2);
    }

    @Override // Ew0.c
    public final void i(@Nullable String str) {
        BLog.i("BiliEditorMultiAsrManager", str);
    }
}
