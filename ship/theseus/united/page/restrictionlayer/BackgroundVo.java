package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/BackgroundVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class BackgroundVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("drawable_bitmap_url")
    @Nullable
    private final String f102505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final BackgroundEffect f102506b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/BackgroundVo$BackgroundEffect.class */
    public static final class BackgroundEffect implements com.bilibili.bson.adapter.a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final BackgroundEffect[] $VALUES;
        public static final BackgroundEffect Blur = new BackgroundEffect(UpperTimeline.VALUE_BLUR_BACKGROUND_MODE, 0, 1);
        public static final BackgroundEffect Translucent = new BackgroundEffect("Translucent", 1, 2);
        private final int value;

        private static final /* synthetic */ BackgroundEffect[] $values() {
            return new BackgroundEffect[]{Blur, Translucent};
        }

        static {
            BackgroundEffect[] backgroundEffectArr$values = $values();
            $VALUES = backgroundEffectArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(backgroundEffectArr$values);
        }

        private BackgroundEffect(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<BackgroundEffect> getEntries() {
            return $ENTRIES;
        }

        public static BackgroundEffect valueOf(String str) {
            return (BackgroundEffect) Enum.valueOf(BackgroundEffect.class, str);
        }

        public static BackgroundEffect[] values() {
            return (BackgroundEffect[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m9574getValue() {
            return Integer.valueOf(this.value);
        }
    }

    public BackgroundVo(String str, BackgroundEffect backgroundEffect, int i7) {
        backgroundEffect = (i7 & 2) != 0 ? null : backgroundEffect;
        this.f102505a = str;
        this.f102506b = backgroundEffect;
    }

    @Nullable
    public final String a() {
        return this.f102505a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundVo)) {
            return false;
        }
        BackgroundVo backgroundVo = (BackgroundVo) obj;
        return Intrinsics.areEqual(this.f102505a, backgroundVo.f102505a) && this.f102506b == backgroundVo.f102506b;
    }

    public final int hashCode() {
        String str = this.f102505a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        BackgroundEffect backgroundEffect = this.f102506b;
        if (backgroundEffect != null) {
            iHashCode = backgroundEffect.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "BackgroundVo(url=" + this.f102505a + ", effects=" + this.f102506b + ")";
    }
}
