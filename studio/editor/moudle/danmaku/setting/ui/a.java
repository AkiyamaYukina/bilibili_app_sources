package com.bilibili.studio.editor.moudle.danmaku.setting.ui;

import Xz0.d;
import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuItem;
import com.bilibili.studio.videoeditor.util.U;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/setting/ui/a.class */
public final class a implements BiliDanmakuEditorDialog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorDanmakuListFragment f106097a;

    public a(BiliEditorDanmakuListFragment biliEditorDanmakuListFragment) {
        this.f106097a = biliEditorDanmakuListFragment;
    }

    @Override // com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog.a
    public final void a(long j7, String str) {
        String strA;
        if (str == null || str.length() == 0) {
            return;
        }
        BLog.e("BiliEditorDanmakuListFragment", "  创建的预约 time=" + j7 + ",");
        if (j7 > 0) {
            String strB = U.b(j7, U.f110219b);
            Application application = BiliContext.application();
            strA = B0.a.a(strB, " ", application != null ? application.getString(2131842311) : null);
        } else {
            strA = "";
        }
        BiliEditorDanmakuListFragment biliEditorDanmakuListFragment = this.f106097a;
        BiliEditorDanmakuListFragment.a aVar = biliEditorDanmakuListFragment.f106088m;
        if (aVar != null) {
            aVar.a(biliEditorDanmakuListFragment.f106086k, j7, str, strA);
        }
        DanmakuItem danmakuItem = new DanmakuItem();
        danmakuItem.type = biliEditorDanmakuListFragment.f106086k;
        danmakuItem.title = str;
        danmakuItem.planStartTime = j7;
        d.f28458a.getClass();
        d.j(1, danmakuItem, 0);
    }

    @Override // com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog.a
    public final void onCancel() {
    }
}
