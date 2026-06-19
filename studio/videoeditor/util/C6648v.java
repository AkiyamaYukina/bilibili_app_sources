package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import android.widget.PopupWindow;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.studio.editor.moudle.home.presenter.a;
import kotlin.Lazy;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/v.class */
public final /* synthetic */ class C6648v implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PopupWindow f110255b;

    public /* synthetic */ C6648v(Context context, PopupWindow popupWindow) {
        this.f110254a = context;
        this.f110255b = popupWindow;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Context context = this.f110254a;
        PopupWindow popupWindow = this.f110255b;
        BiliGlobalPreferenceHelper.getInstance(context).setBoolean("key_publish_video_task_item", true);
        Lazy<com.bilibili.studio.editor.moudle.home.presenter.a> lazy = com.bilibili.studio.editor.moudle.home.presenter.a.f107228b;
        a.C1194a.a().f107229a.remove(popupWindow);
    }
}
