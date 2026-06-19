package com.bilibili.search2.widget;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.image.IUrlGetter;
import com.bilibili.app.comm.list.widget.tag.base.IImageTag;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.DayNightImageSpan;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpan;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchTagView.class */
@StabilityInferred(parameters = 0)
public final class SearchTagView extends TagSpanTextView {
    @JvmOverloads
    public SearchTagView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchTagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public SearchTagView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final DayNightImageSpan generateStartImageSpan(@NotNull IImageTag iImageTag, @Nullable IUrlGetter iUrlGetter, int i7, int i8, int i9) {
        String iconUrl = iImageTag.getIconUrl();
        String iconNightUrl = iImageTag.getIconNightUrl();
        if (iconUrl == null && iconNightUrl == null) {
            return null;
        }
        if (iconUrl == null) {
            iconUrl = "";
        }
        if (iconNightUrl == null) {
            iconNightUrl = "";
        }
        return new DayNightImageSpan(getContext(), iconUrl, iconNightUrl, i9, new Rect(i7, 0, i8, 0), new Point(ListExtentionsKt.toPx(iImageTag.getIconWidth()), ListExtentionsKt.toPx(iImageTag.getIconHeight())), iUrlGetter, "search-normal-fill-android");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final TagSpan generateTagSpan(@Nullable TagSpan.TagSpanParams tagSpanParams) {
        if (tagSpanParams == null) {
            return null;
        }
        tagSpanParams.setLineSpacing(getLineHeight() - getPaint().getFontMetricsInt(null));
        return new TagSpan(tagSpanParams);
    }
}
