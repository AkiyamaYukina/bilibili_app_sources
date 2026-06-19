package com.bilibili.search2.main.ogv;

import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/OgvThemeState.class */
@StabilityInferred(parameters = 0)
public final class OgvThemeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InputBarStyle f86849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Drawable f86851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f86852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f86853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final d f86854g;

    @NotNull
    public final f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f86855i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/OgvThemeState$InputBarStyle.class */
    public static final class InputBarStyle {
        private static final EnumEntries $ENTRIES;
        private static final InputBarStyle[] $VALUES;
        public static final InputBarStyle INIT = new InputBarStyle("INIT", 0);
        public static final InputBarStyle OGV = new InputBarStyle("OGV", 1);

        private static final /* synthetic */ InputBarStyle[] $values() {
            return new InputBarStyle[]{INIT, OGV};
        }

        static {
            InputBarStyle[] inputBarStyleArr$values = $values();
            $VALUES = inputBarStyleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(inputBarStyleArr$values);
        }

        private InputBarStyle(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<InputBarStyle> getEntries() {
            return $ENTRIES;
        }

        public static InputBarStyle valueOf(String str) {
            return (InputBarStyle) Enum.valueOf(InputBarStyle.class, str);
        }

        public static InputBarStyle[] values() {
            return (InputBarStyle[]) $VALUES.clone();
        }
    }

    public OgvThemeState(@ColorInt int i7, @NotNull InputBarStyle inputBarStyle, @ColorInt int i8, @Nullable Drawable drawable, boolean z6, boolean z7, @NotNull d dVar, @NotNull f fVar, @NotNull a aVar) {
        this.f86848a = i7;
        this.f86849b = inputBarStyle;
        this.f86850c = i8;
        this.f86851d = drawable;
        this.f86852e = z6;
        this.f86853f = z7;
        this.f86854g = dVar;
        this.h = fVar;
        this.f86855i = aVar;
    }

    public static OgvThemeState a(OgvThemeState ogvThemeState, int i7, InputBarStyle inputBarStyle, int i8, Drawable drawable, boolean z6, boolean z7, d dVar, f fVar, a aVar, int i9) {
        if ((i9 & 1) != 0) {
            i7 = ogvThemeState.f86848a;
        }
        if ((i9 & 2) != 0) {
            inputBarStyle = ogvThemeState.f86849b;
        }
        if ((i9 & 4) != 0) {
            i8 = ogvThemeState.f86850c;
        }
        if ((i9 & 8) != 0) {
            drawable = ogvThemeState.f86851d;
        }
        if ((i9 & 16) != 0) {
            z6 = ogvThemeState.f86852e;
        }
        if ((i9 & 32) != 0) {
            z7 = ogvThemeState.f86853f;
        }
        if ((i9 & 64) != 0) {
            dVar = ogvThemeState.f86854g;
        }
        if ((i9 & 128) != 0) {
            fVar = ogvThemeState.h;
        }
        if ((i9 & 256) != 0) {
            aVar = ogvThemeState.f86855i;
        }
        ogvThemeState.getClass();
        return new OgvThemeState(i7, inputBarStyle, i8, drawable, z6, z7, dVar, fVar, aVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvThemeState)) {
            return false;
        }
        OgvThemeState ogvThemeState = (OgvThemeState) obj;
        return this.f86848a == ogvThemeState.f86848a && this.f86849b == ogvThemeState.f86849b && this.f86850c == ogvThemeState.f86850c && Intrinsics.areEqual(this.f86851d, ogvThemeState.f86851d) && this.f86852e == ogvThemeState.f86852e && this.f86853f == ogvThemeState.f86853f && Intrinsics.areEqual(this.f86854g, ogvThemeState.f86854g) && Intrinsics.areEqual(this.h, ogvThemeState.h) && Intrinsics.areEqual(this.f86855i, ogvThemeState.f86855i);
    }

    public final int hashCode() {
        int iA = I.a(this.f86850c, (this.f86849b.hashCode() + (Integer.hashCode(this.f86848a) * 31)) * 31, 31);
        Drawable drawable = this.f86851d;
        int iA2 = z.a(z.a((iA + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.f86852e), 31, this.f86853f);
        return this.f86855i.hashCode() + ((this.h.hashCode() + ((this.f86854g.hashCode() + iA2) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "OgvThemeState(searchLayoutColor=" + this.f86848a + ", inputBarStyle=" + this.f86849b + ", searchTextColor=" + this.f86850c + ", cancelDrawable=" + this.f86851d + ", aiIconDay=" + this.f86852e + ", tintOgv=" + this.f86853f + ", ogvBackground=" + this.f86854g + ", ogvMaskOverlay=" + this.h + ", brandAdGradientOverlay=" + this.f86855i + ")";
    }
}
