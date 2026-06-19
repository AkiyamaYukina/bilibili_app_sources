package com.bilibili.music.podcast.view;

import android.view.View;
import androidx.annotation.ColorInt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/c.class */
public interface c {
    @NotNull
    View getView();

    void setRefreshState(boolean z6);

    void setThemeColor(@ColorInt int i7);
}
