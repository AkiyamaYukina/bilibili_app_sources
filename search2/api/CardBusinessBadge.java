package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/CardBusinessBadge.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CardBusinessBadge {
    public static final int $stable = 8;

    @JSONField(name = "badge_style")
    @Nullable
    private Tag badgeStyle;

    @JSONField(name = "goto_icon")
    @Nullable
    private StoryCardIcon gotoIcon;

    public CardBusinessBadge() {
        this(null, null, 3, null);
    }

    public CardBusinessBadge(@NotNull com.bapis.bilibili.polymer.app.search.v1.CardBusinessBadge cardBusinessBadge) {
        this(null, null, 3, null);
        if (cardBusinessBadge.hasBadgeStyle()) {
            this.badgeStyle = new Tag(cardBusinessBadge.getBadgeStyle());
        }
        if (cardBusinessBadge.hasGotoIcon()) {
            this.gotoIcon = new StoryCardIcon(cardBusinessBadge.getGotoIcon());
        }
    }

    public CardBusinessBadge(@Nullable Tag tag, @Nullable StoryCardIcon storyCardIcon) {
        this.badgeStyle = tag;
        this.gotoIcon = storyCardIcon;
    }

    public /* synthetic */ CardBusinessBadge(Tag tag, StoryCardIcon storyCardIcon, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : tag, (i7 & 2) != 0 ? null : storyCardIcon);
    }

    public static /* synthetic */ CardBusinessBadge copy$default(CardBusinessBadge cardBusinessBadge, Tag tag, StoryCardIcon storyCardIcon, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            tag = cardBusinessBadge.badgeStyle;
        }
        if ((i7 & 2) != 0) {
            storyCardIcon = cardBusinessBadge.gotoIcon;
        }
        return cardBusinessBadge.copy(tag, storyCardIcon);
    }

    @Nullable
    public final Tag component1() {
        return this.badgeStyle;
    }

    @Nullable
    public final StoryCardIcon component2() {
        return this.gotoIcon;
    }

    @NotNull
    public final CardBusinessBadge copy(@Nullable Tag tag, @Nullable StoryCardIcon storyCardIcon) {
        return new CardBusinessBadge(tag, storyCardIcon);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBusinessBadge)) {
            return false;
        }
        CardBusinessBadge cardBusinessBadge = (CardBusinessBadge) obj;
        return Intrinsics.areEqual(this.badgeStyle, cardBusinessBadge.badgeStyle) && Intrinsics.areEqual(this.gotoIcon, cardBusinessBadge.gotoIcon);
    }

    @Nullable
    public final Tag getBadgeStyle() {
        return this.badgeStyle;
    }

    @Nullable
    public final StoryCardIcon getGotoIcon() {
        return this.gotoIcon;
    }

    public int hashCode() {
        Tag tag = this.badgeStyle;
        int iHashCode = 0;
        int iHashCode2 = tag == null ? 0 : tag.hashCode();
        StoryCardIcon storyCardIcon = this.gotoIcon;
        if (storyCardIcon != null) {
            iHashCode = storyCardIcon.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setBadgeStyle(@Nullable Tag tag) {
        this.badgeStyle = tag;
    }

    public final void setGotoIcon(@Nullable StoryCardIcon storyCardIcon) {
        this.gotoIcon = storyCardIcon;
    }

    @NotNull
    public String toString() {
        return "CardBusinessBadge(badgeStyle=" + this.badgeStyle + ", gotoIcon=" + this.gotoIcon + ")";
    }
}
