package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedSectionItem.class */
@StabilityInferred(parameters = 0)
public final class MentionedSectionItem<E extends UIComponent.ViewEntry, F extends UIComponent.ViewEntry> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final MentionedSectionHeader<F> f81998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<MentionedCardItem<E>> f81999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f82001e;

    public MentionedSectionItem() {
        this(0, null, null, 0, false, 31, null);
    }

    public MentionedSectionItem(int i7, @Nullable MentionedSectionHeader<F> mentionedSectionHeader, @NotNull List<MentionedCardItem<E>> list, int i8, boolean z6) {
        this.f81997a = i7;
        this.f81998b = mentionedSectionHeader;
        this.f81999c = list;
        this.f82000d = i8;
        this.f82001e = z6;
    }

    public /* synthetic */ MentionedSectionItem(int i7, MentionedSectionHeader mentionedSectionHeader, List list, int i8, boolean z6, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? null : mentionedSectionHeader, (i9 & 4) != 0 ? CollectionsKt.emptyList() : list, (i9 & 8) != 0 ? 0 : i8, (i9 & 16) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MentionedSectionItem copy$default(MentionedSectionItem mentionedSectionItem, int i7, MentionedSectionHeader mentionedSectionHeader, List list, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = mentionedSectionItem.f81997a;
        }
        if ((i9 & 2) != 0) {
            mentionedSectionHeader = mentionedSectionItem.f81998b;
        }
        if ((i9 & 4) != 0) {
            list = mentionedSectionItem.f81999c;
        }
        if ((i9 & 8) != 0) {
            i8 = mentionedSectionItem.f82000d;
        }
        if ((i9 & 16) != 0) {
            z6 = mentionedSectionItem.f82001e;
        }
        return mentionedSectionItem.copy(i7, mentionedSectionHeader, list, i8, z6);
    }

    public final int component1() {
        return this.f81997a;
    }

    @Nullable
    public final MentionedSectionHeader<F> component2() {
        return this.f81998b;
    }

    @NotNull
    public final List<MentionedCardItem<E>> component3() {
        return this.f81999c;
    }

    public final int component4() {
        return this.f82000d;
    }

    public final boolean component5() {
        return this.f82001e;
    }

    @NotNull
    public final MentionedSectionItem<E, F> copy(int i7, @Nullable MentionedSectionHeader<F> mentionedSectionHeader, @NotNull List<MentionedCardItem<E>> list, int i8, boolean z6) {
        return new MentionedSectionItem<>(i7, mentionedSectionHeader, list, i8, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionedSectionItem)) {
            return false;
        }
        MentionedSectionItem mentionedSectionItem = (MentionedSectionItem) obj;
        return this.f81997a == mentionedSectionItem.f81997a && Intrinsics.areEqual(this.f81998b, mentionedSectionItem.f81998b) && Intrinsics.areEqual(this.f81999c, mentionedSectionItem.f81999c) && this.f82000d == mentionedSectionItem.f82000d && this.f82001e == mentionedSectionItem.f82001e;
    }

    @NotNull
    public final List<MentionedCardItem<E>> getCards() {
        return this.f81999c;
    }

    public final boolean getExpend() {
        return this.f82001e;
    }

    public final int getFoldCount() {
        return this.f82000d;
    }

    @Nullable
    public final MentionedSectionHeader<F> getHeader() {
        return this.f81998b;
    }

    public final int getHeight() {
        return this.f81997a;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f81997a);
        MentionedSectionHeader<F> mentionedSectionHeader = this.f81998b;
        return Boolean.hashCode(this.f82001e) + I.a(this.f82000d, e0.a(((iHashCode * 31) + (mentionedSectionHeader == null ? 0 : mentionedSectionHeader.hashCode())) * 31, 31, this.f81999c), 31);
    }

    @NotNull
    public String toString() {
        List<MentionedCardItem<E>> list = this.f81999c;
        StringBuilder sb = new StringBuilder("MentionedSectionItem(height=");
        sb.append(this.f81997a);
        sb.append(", header=");
        sb.append(this.f81998b);
        sb.append(", cards=");
        sb.append(list);
        sb.append(", foldCount=");
        sb.append(this.f82000d);
        sb.append(", expend=");
        return androidx.appcompat.app.i.a(sb, this.f82001e, ")");
    }
}
