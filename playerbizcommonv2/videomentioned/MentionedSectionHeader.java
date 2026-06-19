package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/MentionedSectionHeader.class */
@StabilityInferred(parameters = 0)
public final class MentionedSectionHeader<E extends UIComponent.ViewEntry> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UIComponent<E> f81996b;

    public MentionedSectionHeader(int i7, @NotNull UIComponent<E> uIComponent) {
        this.f81995a = i7;
        this.f81996b = uIComponent;
    }

    public /* synthetic */ MentionedSectionHeader(int i7, UIComponent uIComponent, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, uIComponent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MentionedSectionHeader copy$default(MentionedSectionHeader mentionedSectionHeader, int i7, UIComponent uIComponent, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = mentionedSectionHeader.f81995a;
        }
        if ((i8 & 2) != 0) {
            uIComponent = mentionedSectionHeader.f81996b;
        }
        return mentionedSectionHeader.copy(i7, uIComponent);
    }

    public final int component1() {
        return this.f81995a;
    }

    @NotNull
    public final UIComponent<E> component2() {
        return this.f81996b;
    }

    @NotNull
    public final MentionedSectionHeader<E> copy(int i7, @NotNull UIComponent<E> uIComponent) {
        return new MentionedSectionHeader<>(i7, uIComponent);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionedSectionHeader)) {
            return false;
        }
        MentionedSectionHeader mentionedSectionHeader = (MentionedSectionHeader) obj;
        return this.f81995a == mentionedSectionHeader.f81995a && Intrinsics.areEqual(this.f81996b, mentionedSectionHeader.f81996b);
    }

    @NotNull
    public final UIComponent<E> getComponent() {
        return this.f81996b;
    }

    public final int getHeight() {
        return this.f81995a;
    }

    public int hashCode() {
        return this.f81996b.hashCode() + (Integer.hashCode(this.f81995a) * 31);
    }

    @NotNull
    public String toString() {
        return "MentionedSectionHeader(height=" + this.f81995a + ", component=" + this.f81996b + ")";
    }
}
