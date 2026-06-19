package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchNoResultSuggestWordCard;
import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchNoResultSuggestWord.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchNoResultSuggestWord extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = TextSource.CFG_CONTENT)
    @Nullable
    private String content;

    @JSONField(name = "prefix")
    @Nullable
    private String prefix;

    @JSONField(name = "suffix")
    @Nullable
    private String suffix;

    @JSONField(name = "sugKeyWord_type")
    private int sugKeyWordType;

    public SearchNoResultSuggestWord() {
    }

    public SearchNoResultSuggestWord(@NotNull SearchNoResultSuggestWordCard searchNoResultSuggestWordCard) {
        this.sugKeyWordType = searchNoResultSuggestWordCard.getSugKeyWordType();
        setTitle(searchNoResultSuggestWordCard.getTitle());
        setCover(searchNoResultSuggestWordCard.getCover());
        this.prefix = searchNoResultSuggestWordCard.getPrefix();
        this.content = searchNoResultSuggestWordCard.getContent();
        this.suffix = searchNoResultSuggestWordCard.getSuffix();
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getPrefix() {
        return this.prefix;
    }

    @Nullable
    public final String getSuffix() {
        return this.suffix;
    }

    public final int getSugKeyWordType() {
        return this.sugKeyWordType;
    }

    public final boolean isNormal() {
        boolean z6 = true;
        if (this.sugKeyWordType != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isQueryCorrect() {
        return this.sugKeyWordType == 2;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setPrefix(@Nullable String str) {
        this.prefix = str;
    }

    public final void setSuffix(@Nullable String str) {
        this.suffix = str;
    }

    public final void setSugKeyWordType(int i7) {
        this.sugKeyWordType = i7;
    }
}
