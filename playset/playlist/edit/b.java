package com.bilibili.playset.playlist.edit;

import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.studio.editor.moudle.home.ui.ExportConfigView;
import com.mall.ui.page.home.view.c3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/b.class */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f85301b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f85300a = i7;
        this.f85301b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f85300a) {
            case 0:
                BLRouter.routeTo(com.bilibili.playset.editor.utils.g.a(18), (FavoriteSingleBottomSheet) this.f85301b);
                break;
            case 1:
                ((c3) this.f85301b).f.setVisibility(8);
                break;
            default:
                ExportConfigView.c cVar = ((ExportConfigView) this.f85301b).f107262f;
                if (cVar != null) {
                    cVar.onClick();
                }
                break;
        }
    }
}
