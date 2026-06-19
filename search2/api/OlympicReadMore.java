package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.MatchItem;
import com.bapis.bilibili.polymer.app.search.v1.NavigationButton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/OlympicReadMore.class */
@StabilityInferred(parameters = 0)
@Keep
public final class OlympicReadMore {
    public static final int $stable = 8;
    private boolean hasClick;

    @Nullable
    private String text;

    @Nullable
    private String uri;

    public OlympicReadMore() {
        this(null, null, false, 7, null);
    }

    public OlympicReadMore(@NotNull MatchItem matchItem) {
        this(matchItem.getText(), matchItem.getUri(), false, 4, null);
    }

    public OlympicReadMore(@NotNull NavigationButton navigationButton) {
        this(navigationButton.getText(), navigationButton.getUri(), false, 4, null);
    }

    public OlympicReadMore(@Nullable String str, @Nullable String str2, @JSONField(deserialize = false, serialize = false) boolean z6) {
        this.text = str;
        this.uri = str2;
        this.hasClick = z6;
    }

    public /* synthetic */ OlympicReadMore(String str, String str2, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? false : z6);
    }

    public static /* synthetic */ OlympicReadMore copy$default(OlympicReadMore olympicReadMore, String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = olympicReadMore.text;
        }
        if ((i7 & 2) != 0) {
            str2 = olympicReadMore.uri;
        }
        if ((i7 & 4) != 0) {
            z6 = olympicReadMore.hasClick;
        }
        return olympicReadMore.copy(str, str2, z6);
    }

    @Nullable
    public final String component1() {
        return this.text;
    }

    @Nullable
    public final String component2() {
        return this.uri;
    }

    public final boolean component3() {
        return this.hasClick;
    }

    @NotNull
    public final OlympicReadMore copy(@Nullable String str, @Nullable String str2, @JSONField(deserialize = false, serialize = false) boolean z6) {
        return new OlympicReadMore(str, str2, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OlympicReadMore)) {
            return false;
        }
        OlympicReadMore olympicReadMore = (OlympicReadMore) obj;
        return Intrinsics.areEqual(this.text, olympicReadMore.text) && Intrinsics.areEqual(this.uri, olympicReadMore.uri) && this.hasClick == olympicReadMore.hasClick;
    }

    public final boolean getHasClick() {
        return this.hasClick;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.uri;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Boolean.hashCode(this.hasClick) + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isValid() {
        /*
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.text
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2d
            r0 = r6
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            r5 = r0
            r0 = 1
            r4 = r0
            r0 = r5
            r1 = 1
            r0 = r0 ^ r1
            r1 = 1
            if (r0 != r1) goto L2d
            r0 = r3
            java.lang.String r0 = r0.uri
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2d
            r0 = r6
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            r1 = 1
            r0 = r0 ^ r1
            r1 = 1
            if (r0 != r1) goto L2d
            goto L2f
        L2d:
            r0 = 0
            r4 = r0
        L2f:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.OlympicReadMore.isValid():boolean");
    }

    public final void setHasClick(boolean z6) {
        this.hasClick = z6;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.uri;
        return i.a(G0.b.a("OlympicReadMore(text=", str, ", uri=", str2, ", hasClick="), this.hasClick, ")");
    }
}
