package com.bilibili.ogv.opbase;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/HistoryCard.class */
@StabilityInferred(parameters = 0)
@Keep
public final class HistoryCard {
    public static final int $stable = 8;

    @JSONField(name = "items")
    @Nullable
    private List<CommonCard> cards;
    private boolean isExpand;

    public HistoryCard() {
        this(null, false, 3, null);
    }

    public HistoryCard(@Nullable List<CommonCard> list, boolean z6) {
        this.cards = list;
        this.isExpand = z6;
    }

    public /* synthetic */ HistoryCard(List list, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? Collections.emptyList() : list, (i7 & 2) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryCard copy$default(HistoryCard historyCard, List list, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = historyCard.cards;
        }
        if ((i7 & 2) != 0) {
            z6 = historyCard.isExpand;
        }
        return historyCard.copy(list, z6);
    }

    @Nullable
    public final List<CommonCard> component1() {
        return this.cards;
    }

    public final boolean component2() {
        return this.isExpand;
    }

    @NotNull
    public final HistoryCard copy(@Nullable List<CommonCard> list, boolean z6) {
        return new HistoryCard(list, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryCard)) {
            return false;
        }
        HistoryCard historyCard = (HistoryCard) obj;
        return Intrinsics.areEqual(this.cards, historyCard.cards) && this.isExpand == historyCard.isExpand;
    }

    @Nullable
    public final List<CommonCard> getCards() {
        return this.cards;
    }

    public int hashCode() {
        List<CommonCard> list = this.cards;
        return Boolean.hashCode(this.isExpand) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final boolean isExpand() {
        return this.isExpand;
    }

    public final void setCards(@Nullable List<CommonCard> list) {
        this.cards = list;
    }

    public final void setExpand(boolean z6) {
        this.isExpand = z6;
    }

    @NotNull
    public String toString() {
        return "HistoryCard(cards=" + this.cards + ", isExpand=" + this.isExpand + ")";
    }
}
