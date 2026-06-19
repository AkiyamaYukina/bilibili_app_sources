package com.bilibili.studio.videoeditor.util;

import android.widget.PopupWindow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/w.class */
public final class C6649w extends PopupWindow {
    @Override // android.widget.PopupWindow
    public final void update(int i7, int i8, int i9, int i10, boolean z6) {
        try {
            super.update(i7, i8, i9, i10, z6);
        } catch (Exception e7) {
            BLog.efmt("EditorGuideUtil", "handleShowGuide...e = %s", new Object[]{e7.fillInStackTrace()});
        }
    }
}
