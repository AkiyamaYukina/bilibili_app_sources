package com.bilibili.ship.theseus.ugc.interactivevideo;

import com.bilibili.app.gemini.ugc.feature.endpage.GeminiEndPageRelatedLayoutMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/interactivevideo/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GeminiEndPageRelatedLayoutMode f96927b;

    public a(boolean z6, @NotNull GeminiEndPageRelatedLayoutMode geminiEndPageRelatedLayoutMode) {
        this.f96926a = z6;
        this.f96927b = geminiEndPageRelatedLayoutMode;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f96926a == aVar.f96926a && this.f96927b == aVar.f96927b;
    }

    public final int hashCode() {
        return this.f96927b.hashCode() + (Boolean.hashCode(this.f96926a) * 31);
    }

    @NotNull
    public final String toString() {
        return "InteractEndPageLayoutConfig(useLandscapeWidget=" + this.f96926a + ", relatedLayoutMode=" + this.f96927b + ")";
    }
}
