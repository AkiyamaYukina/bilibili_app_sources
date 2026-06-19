package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiArticle.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiArticle {
    public static final int $stable = 8;

    @Nullable
    private String link;

    @Nullable
    private String title;

    public WikiArticle() {
        this(null, null, 3, null);
    }

    public WikiArticle(@JSONField(name = "title") @Nullable String str, @JSONField(name = "link") @Nullable String str2) {
        this.title = str;
        this.link = str2;
    }

    public /* synthetic */ WikiArticle(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ WikiArticle copy$default(WikiArticle wikiArticle, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = wikiArticle.title;
        }
        if ((i7 & 2) != 0) {
            str2 = wikiArticle.link;
        }
        return wikiArticle.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.link;
    }

    @NotNull
    public final WikiArticle copy(@JSONField(name = "title") @Nullable String str, @JSONField(name = "link") @Nullable String str2) {
        return new WikiArticle(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WikiArticle)) {
            return false;
        }
        WikiArticle wikiArticle = (WikiArticle) obj;
        return Intrinsics.areEqual(this.title, wikiArticle.title) && Intrinsics.areEqual(this.link, wikiArticle.link);
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.link;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return p.a("WikiArticle(title=", this.title, ", link=", this.link, ")");
    }
}
