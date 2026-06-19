package com.bilibili.playerbizcommon.utils;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.app.gemini.player.widget.online.GeminiPlayerOnlineWidget;
import com.bilibili.lib.image2.bean.DecodedImageHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;
import com.bilibili.lib.image2.bean.StaticBitmapImageHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/d.class */
public final class d implements ImageDataSubscriber<DecodedImageHolder<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.app.gemini.player.widget.online.b f80282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GeminiPlayerOnlineWidget f80283b;

    public d(com.bilibili.app.gemini.player.widget.online.b bVar, GeminiPlayerOnlineWidget geminiPlayerOnlineWidget) {
        this.f80282a = bVar;
        this.f80283b = geminiPlayerOnlineWidget;
    }

    public final void onCancellation(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
    }

    public final void onFailure(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
    }

    public final void onResult(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
        Bitmap bitmapCopy;
        StaticBitmapImageHolder staticBitmapImageHolder = (StaticBitmapImageHolder) (imageDataSource != null ? (DecodedImageHolder) imageDataSource.getResult() : null);
        Bitmap bitmap = staticBitmapImageHolder.get();
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = config;
            if (config == null) {
                config2 = Bitmap.Config.ARGB_8888;
            }
            bitmapCopy = bitmap.copy(config2, false);
        } else {
            bitmapCopy = null;
        }
        com.bilibili.app.gemini.player.widget.online.b bVar = this.f80282a;
        if (bitmapCopy != null && !bitmapCopy.isRecycled()) {
            GeminiPlayerOnlineWidget geminiPlayerOnlineWidget = this.f80283b;
            GeminiPlayerOnlineWidget geminiPlayerOnlineWidget2 = bVar.a;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(geminiPlayerOnlineWidget2.getContext().getResources(), bitmapCopy);
            int color = ContextCompat.getColor(geminiPlayerOnlineWidget2.getContext(), 2131100123);
            Drawable drawableWrap = DrawableCompat.wrap(bitmapDrawable.mutate());
            DrawableCompat.setTint(drawableWrap, color);
            DrawableCompat.setTintMode(bitmapDrawable, PorterDuff.Mode.SRC_IN);
            geminiPlayerOnlineWidget.setCompoundDrawablesWithIntrinsicBounds(drawableWrap, null, null, null);
        }
        staticBitmapImageHolder.close();
    }
}
