package com.bilibili.ogv.filmlist;

import android.view.View;
import com.bigkoo.pickerview.TimePickerView;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog;
import java.util.Date;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/f.class */
public final /* synthetic */ class f implements TimePickerView.OnTimeSelectListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f67696a;

    public /* synthetic */ f(Object obj) {
        this.f67696a = obj;
    }

    public void onTimeSelect(Date date, View view) {
        int i7 = BiliDanmakuEditorDialog.f106065o;
        BiliDanmakuEditorDialog biliDanmakuEditorDialog = (BiliDanmakuEditorDialog) this.f67696a;
        biliDanmakuEditorDialog.getClass();
        if (date == null) {
            return;
        }
        if (date.getTime() - System.currentTimeMillis() < 300000) {
            ToastHelper.showToast(biliDanmakuEditorDialog.getContext(), 2131842450, 1);
            return;
        }
        long time = date.getTime() / 1000;
        biliDanmakuEditorDialog.f106074k = time - (time % 60);
        biliDanmakuEditorDialog.jf(date);
        biliDanmakuEditorDialog.f106073j.dismiss();
        biliDanmakuEditorDialog.kf();
    }
}
