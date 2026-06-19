package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.biligame.ui.image.GameImageViewFragment;
import com.bilibili.biligame.ui.image.bean.ImageViewInfoBean;
import com.bilibili.ogv.misc.roledetail.BangumiRoleDetailActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/u.class */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f108060b;

    public /* synthetic */ u(Object obj, int i7) {
        this.f108059a = i7;
        this.f108060b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f108059a) {
            case 0:
                ((BiliEditorMusicTabListFragment) this.f108060b).kf(true);
                break;
            case 1:
                GameImageViewFragment gameImageViewFragment = (GameImageViewFragment) this.f108060b;
                ImageViewInfoBean imageViewInfoBean = gameImageViewFragment.b;
                gameImageViewFragment.lf(imageViewInfoBean != null ? imageViewInfoBean.getUri() : null);
                break;
            default:
                BangumiRoleDetailActivity bangumiRoleDetailActivity = (BangumiRoleDetailActivity) this.f108060b;
                int i7 = BangumiRoleDetailActivity.f69206a0;
                bangumiRoleDetailActivity.R6().setExpanded(true, true);
                break;
        }
    }
}
