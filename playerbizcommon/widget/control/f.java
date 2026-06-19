package com.bilibili.playerbizcommon.widget.control;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.BiliAnimatedDrawable;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget;
import java.io.File;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/f.class */
public final class f extends BaseImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerSeekWidget f80577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f80578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f80579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f80580d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/f$a.class */
    public static final class a extends BaseImageDataSubscriber<DrawableHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget f80581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliAnimatedDrawable f80582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f80583c;

        public a(PlayerSeekWidget playerSeekWidget, BiliAnimatedDrawable biliAnimatedDrawable, f fVar) {
            this.f80581a = playerSeekWidget;
            this.f80582b = biliAnimatedDrawable;
            this.f80583c = fVar;
        }

        public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            this.f80583c.a("sprite-image: get finish sprite failed");
        }

        public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            DrawableHolder drawableHolder;
            if (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) {
                return;
            }
            PlayerSeekWidget playerSeekWidget = this.f80581a;
            playerSeekWidget.f80541w = drawableHolder;
            BiliAnimatedDrawable biliAnimatedDrawable = drawableHolder.get();
            BiliAnimatedDrawable biliAnimatedDrawable2 = biliAnimatedDrawable instanceof BiliAnimatedDrawable ? biliAnimatedDrawable : null;
            if (biliAnimatedDrawable2 == null) {
                this.f80583c.a("sprite-image: finishDrawable is null");
                return;
            }
            playerSeekWidget.f80538t = new PlayerSeekWidget.d(playerSeekWidget, this.f80582b, biliAnimatedDrawable2);
            playerSeekWidget.f80539u = false;
            playerSeekWidget.f80527i = false;
            playerSeekWidget.f80526g = null;
            playerSeekWidget.h = null;
        }
    }

    public f(PlayerSeekWidget playerSeekWidget, FragmentActivity fragmentActivity, File file, File file2) {
        this.f80577a = playerSeekWidget;
        this.f80578b = fragmentActivity;
        this.f80579c = file;
        this.f80580d = file2;
    }

    public final void a(String str) {
        PlayerSeekWidget playerSeekWidget = this.f80577a;
        DrawableHolder drawableHolder = playerSeekWidget.f80540v;
        if (drawableHolder != null) {
            drawableHolder.close();
        }
        playerSeekWidget.f80540v = null;
        DrawableHolder drawableHolder2 = playerSeekWidget.f80541w;
        if (drawableHolder2 != null) {
            drawableHolder2.close();
        }
        playerSeekWidget.f80541w = null;
        playerSeekWidget.f80538t = null;
        playerSeekWidget.f80532n = false;
        playerSeekWidget.f80539u = true;
        this.f80580d.delete();
        this.f80579c.delete();
        playerSeekWidget.v();
        BLog.e("PlayerSeekWidget", str);
    }

    public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        a("sprite-image: get drag sprite failed");
    }

    public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder;
        if (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) {
            return;
        }
        File file = this.f80579c;
        PlayerSeekWidget playerSeekWidget = this.f80577a;
        playerSeekWidget.f80540v = drawableHolder;
        BiliAnimatedDrawable biliAnimatedDrawable = drawableHolder.get();
        BiliAnimatedDrawable biliAnimatedDrawable2 = biliAnimatedDrawable instanceof BiliAnimatedDrawable ? biliAnimatedDrawable : null;
        if (biliAnimatedDrawable2 != null) {
            BiliImageLoader.INSTANCE.acquire(this.f80578b).useOrigin().asDrawable().enableAnimatable(1, Boolean.FALSE).url(BiliImageLoaderHelper.fileToUri(file)).submit().subscribe(new a(playerSeekWidget, biliAnimatedDrawable2, this));
        } else {
            a("sprite-image: dragDrawable is null");
        }
    }
}
