package com.bilibili.search2.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchPlayerContainerLayout.class */
@StabilityInferred(parameters = 0)
public final class SearchPlayerContainerLayout extends CardFragmentPlayerContainerLayout {
    @JvmOverloads
    public SearchPlayerContainerLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchPlayerContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public SearchPlayerContainerLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Nullable
    public String getEventId() {
        return null;
    }

    public int getPlayIconResId() {
        return 2131236726;
    }
}
