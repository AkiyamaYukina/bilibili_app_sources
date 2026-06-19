package com.bilibili.search2.result.holder.author;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/SearchAuthorShareGuide.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchAuthorShareGuide {
    public static final int $stable = 8;

    @JSONField(name = "search_author_share_guide_content")
    @Nullable
    private String authorShareGuideContent;

    @JSONField(name = "search_author_share_guide_show")
    private int authorShareGuideShow = 1;

    @JSONField(name = "search_author_share_guide_times")
    private int authorShareGuideTime = 3;

    public final boolean canAuthorShareGuideShow() {
        boolean z6 = true;
        if (this.authorShareGuideShow != 1) {
            z6 = false;
        }
        return z6;
    }

    @Nullable
    public final String getAuthorShareGuideContent() {
        return this.authorShareGuideContent;
    }

    @Nullable
    public final String getAuthorShareGuideContent(@NotNull Context context) {
        String str = this.authorShareGuideContent;
        return (str == null || StringsKt.isBlank(str)) ? context.getString(2131847758) : this.authorShareGuideContent;
    }

    public final int getAuthorShareGuideShow() {
        return this.authorShareGuideShow;
    }

    public final int getAuthorShareGuideTime() {
        return this.authorShareGuideTime;
    }

    public final void setAuthorShareGuideContent(@Nullable String str) {
        this.authorShareGuideContent = str;
    }

    public final void setAuthorShareGuideShow(int i7) {
        this.authorShareGuideShow = i7;
    }

    public final void setAuthorShareGuideTime(int i7) {
        this.authorShareGuideTime = i7;
    }
}
