package com.bilibili.ship.theseus.united.page.toolbar.actionview.back;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.DimenUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/back/a.class */
@StabilityInferred(parameters = 0)
public final class a extends FrameLayout {
    public a(@NotNull Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(DimenUtilsKt.dpToPx(46), -1));
        int iDpToPx = DimenUtilsKt.dpToPx(24);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setImageDrawable(AppCompatResources.getDrawable(context, 2131238660));
        appCompatImageView.setContentDescription("返回按钮");
        addView(appCompatImageView);
    }
}
