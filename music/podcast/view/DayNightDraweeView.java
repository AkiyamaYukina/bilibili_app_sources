package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.lib.image2.bean.ImageTintableCallback;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.util.NightTheme;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/DayNightDraweeView.class */
public class DayNightDraweeView extends BiliImageView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f67047m = 0;

    public DayNightDraweeView(Context context) {
        this(context, null);
    }

    public DayNightDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setTintableCallback(new ImageTintableCallback(this) { // from class: com.bilibili.music.podcast.view.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DayNightDraweeView f67188a;

            {
                this.f67188a = this;
            }

            public final void tint() {
                int i7 = DayNightDraweeView.f67047m;
                BiliImageView biliImageView = this.f67188a;
                if (NightTheme.isNightTheme(biliImageView.getContext())) {
                    if (biliImageView.getAlpha() == 0.7f) {
                        return;
                    }
                    biliImageView.setAlpha(0.7f);
                } else {
                    if (biliImageView.getAlpha() == 1.0f) {
                        return;
                    }
                    biliImageView.setAlpha(1.0f);
                }
            }
        });
        tint();
    }
}
