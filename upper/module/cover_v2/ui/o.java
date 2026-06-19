package com.bilibili.upper.module.cover_v2.ui;

import Ax.s;
import android.app.Dialog;
import android.view.View;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.mall.ui.page.ip.view.j1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/o.class */
public final /* synthetic */ class o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112971b;

    public /* synthetic */ o(Dialog dialog) {
        this.f112970a = 1;
        this.f112971b = dialog;
    }

    public /* synthetic */ o(Object obj, int i7) {
        this.f112970a = i7;
        this.f112971b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.DialogFragment, com.bilibili.upper.module.cover_v2.ui.MultiCoverSyncCaptionDialog] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f112970a) {
            case 0:
                ?? r02 = (MultiCoverSyncCaptionDialog) this.f112971b;
                h hVar = r02.f112927e;
                if (hVar != null) {
                    hVar.f112962b.invoke();
                }
                r02.dismiss();
                break;
            case 1:
                j1.a((Dialog) this.f112971b);
                break;
            default:
                s sVar = (s) this.f112971b;
                Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                Xz0.j.c("router_topic_id", Xz0.g.f28463b);
                Map<String, String> mapB = Xz0.j.b(Xz0.k.f28474a);
                ((HashMap) mapB).put("from", "1");
                tw0.f.f127691a.d(false, "creation.new-video-editor.chapter.add.click", mapB);
                sVar.invoke();
                break;
        }
    }
}
