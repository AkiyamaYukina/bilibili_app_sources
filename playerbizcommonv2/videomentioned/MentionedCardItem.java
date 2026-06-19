package com.bilibili.playerbizcommonv2.videomentioned;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedCardItem.class */
@StabilityInferred(parameters = 0)
public final class MentionedCardItem<E extends UIComponent.ViewEntry> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MentionedCardType f81987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f81988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final MutableStateFlow<MentionedCardState> f81989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f81991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final UIComponent<E> f81992g;

    public MentionedCardItem(long j7, @NotNull MentionedCardType mentionedCardType, @NotNull String str, @Nullable MutableStateFlow<MentionedCardState> mutableStateFlow, boolean z6, int i7, @NotNull UIComponent<E> uIComponent) {
        this.f81986a = j7;
        this.f81987b = mentionedCardType;
        this.f81988c = str;
        this.f81989d = mutableStateFlow;
        this.f81990e = z6;
        this.f81991f = i7;
        this.f81992g = uIComponent;
    }

    public /* synthetic */ MentionedCardItem(long j7, MentionedCardType mentionedCardType, String str, MutableStateFlow mutableStateFlow, boolean z6, int i7, UIComponent uIComponent, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, mentionedCardType, str, (i8 & 8) != 0 ? null : mutableStateFlow, z6, (i8 & 32) != 0 ? 0 : i7, uIComponent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MentionedCardItem copy$default(MentionedCardItem mentionedCardItem, long j7, MentionedCardType mentionedCardType, String str, MutableStateFlow mutableStateFlow, boolean z6, int i7, UIComponent uIComponent, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = mentionedCardItem.f81986a;
        }
        if ((i8 & 2) != 0) {
            mentionedCardType = mentionedCardItem.f81987b;
        }
        if ((i8 & 4) != 0) {
            str = mentionedCardItem.f81988c;
        }
        if ((i8 & 8) != 0) {
            mutableStateFlow = mentionedCardItem.f81989d;
        }
        if ((i8 & 16) != 0) {
            z6 = mentionedCardItem.f81990e;
        }
        if ((i8 & 32) != 0) {
            i7 = mentionedCardItem.f81991f;
        }
        if ((i8 & 64) != 0) {
            uIComponent = mentionedCardItem.f81992g;
        }
        return mentionedCardItem.copy(j7, mentionedCardType, str, mutableStateFlow, z6, i7, uIComponent);
    }

    public final long component1() {
        return this.f81986a;
    }

    @NotNull
    public final MentionedCardType component2() {
        return this.f81987b;
    }

    @NotNull
    public final String component3() {
        return this.f81988c;
    }

    @Nullable
    public final MutableStateFlow<MentionedCardState> component4() {
        return this.f81989d;
    }

    public final boolean component5() {
        return this.f81990e;
    }

    public final int component6() {
        return this.f81991f;
    }

    @NotNull
    public final UIComponent<E> component7() {
        return this.f81992g;
    }

    @NotNull
    public final MentionedCardItem<E> copy(long j7, @NotNull MentionedCardType mentionedCardType, @NotNull String str, @Nullable MutableStateFlow<MentionedCardState> mutableStateFlow, boolean z6, int i7, @NotNull UIComponent<E> uIComponent) {
        return new MentionedCardItem<>(j7, mentionedCardType, str, mutableStateFlow, z6, i7, uIComponent);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionedCardItem)) {
            return false;
        }
        MentionedCardItem mentionedCardItem = (MentionedCardItem) obj;
        return this.f81986a == mentionedCardItem.f81986a && this.f81987b == mentionedCardItem.f81987b && Intrinsics.areEqual(this.f81988c, mentionedCardItem.f81988c) && Intrinsics.areEqual(this.f81989d, mentionedCardItem.f81989d) && this.f81990e == mentionedCardItem.f81990e && this.f81991f == mentionedCardItem.f81991f && Intrinsics.areEqual(this.f81992g, mentionedCardItem.f81992g);
    }

    @NotNull
    public final UIComponent<E> getComponent() {
        return this.f81992g;
    }

    public final boolean getDidHidden() {
        return this.f81990e;
    }

    public final int getHeight() {
        return this.f81991f;
    }

    public final long getId() {
        return this.f81986a;
    }

    @Nullable
    public final MutableStateFlow<MentionedCardState> getStateFlow() {
        return this.f81989d;
    }

    @NotNull
    public final String getTitle() {
        return this.f81988c;
    }

    @NotNull
    public final MentionedCardType getType() {
        return this.f81987b;
    }

    public int hashCode() {
        int iA = E.a((this.f81987b.hashCode() + (Long.hashCode(this.f81986a) * 31)) * 31, 31, this.f81988c);
        MutableStateFlow<MentionedCardState> mutableStateFlow = this.f81989d;
        return this.f81992g.hashCode() + I.a(this.f81991f, androidx.compose.animation.z.a((iA + (mutableStateFlow == null ? 0 : mutableStateFlow.hashCode())) * 31, 31, this.f81990e), 31);
    }

    public final void setDidHidden(boolean z6) {
        this.f81990e = z6;
    }

    @NotNull
    public String toString() {
        return "MentionedCardItem(id=" + this.f81986a + ", type=" + this.f81987b + ", title=" + this.f81988c + ", stateFlow=" + this.f81989d + ", didHidden=" + this.f81990e + ", height=" + this.f81991f + ", component=" + this.f81992g + ")";
    }
}
