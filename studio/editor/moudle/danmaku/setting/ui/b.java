package com.bilibili.studio.editor.moudle.danmaku.setting.ui;

import Bx0.o;
import Xz0.d;
import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuSettingFragment;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuItem;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuTypeItem;
import com.bilibili.studio.videoeditor.util.U;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/setting/ui/b.class */
public final class b implements BiliDanmakuEditorDialog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorDanmakuSettingFragment f106098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DanmakuTypeItem f106099b;

    public b(BiliEditorDanmakuSettingFragment biliEditorDanmakuSettingFragment, DanmakuTypeItem danmakuTypeItem) {
        this.f106098a = biliEditorDanmakuSettingFragment;
        this.f106099b = danmakuTypeItem;
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
        BiliEditorDanmakuSettingFragment.a aVar = this.f106098a.f106094e;
        DanmakuTypeItem danmakuTypeItem = this.f106099b;
        if (aVar != null) {
            aVar.a(danmakuTypeItem, danmakuTypeItem.type, danmakuTypeItem.name, str, strA, j7);
        }
        DanmakuItem danmakuItem = new DanmakuItem();
        danmakuItem.type = danmakuTypeItem.type;
        danmakuItem.title = str;
        danmakuItem.planStartTime = j7;
        d.f28458a.getClass();
        d.j(1, danmakuItem, 0);
    }

    @Override // com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog.a
    public final void onCancel() {
        BiliEditorDanmakuSettingFragment biliEditorDanmakuSettingFragment = this.f106098a;
        Ax0.b bVar = biliEditorDanmakuSettingFragment.f106095f;
        if (bVar != null) {
            bVar.f607b = null;
            bVar.f608c = null;
        }
        this.f106099b.setSelected(false);
        o oVar = biliEditorDanmakuSettingFragment.f106093d;
        if (oVar != null) {
            oVar.notifyDataSetChanged();
        }
        biliEditorDanmakuSettingFragment.mf();
    }
}
