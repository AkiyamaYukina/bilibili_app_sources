package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicViewPager2LoadViewHeader.class */
public final class MusicViewPager2LoadViewHeader extends FrameLayout implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f67155a;

    public MusicViewPager2LoadViewHeader(@NotNull Context context) {
        this(context, null);
    }

    public MusicViewPager2LoadViewHeader(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, 2131499558, this);
        this.f67155a = (TextView) findViewById(2131302649);
    }

    @Override // com.bilibili.music.podcast.view.c
    @NotNull
    public View getView() {
        return this;
    }

    @Override // com.bilibili.music.podcast.view.c
    public void setRefreshState(boolean z6) {
    }

    @Override // com.bilibili.music.podcast.view.c
    public void setThemeColor(@ColorInt int i7) {
        TextView textView = this.f67155a;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHeaderText");
            textView2 = null;
        }
        textView2.setTextColor(i7);
    }
}
