package com.bilibili.ship.theseus.ugc.play.schedule;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoNextInfo.class */
@StabilityInferred(parameters = 1)
public final class AutoNextInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f98157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AutoNextFrom f98158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f98159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f98161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f98162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f98163g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f98164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f98165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f98166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f98167l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoNextInfo$AutoNextFrom.class */
    public static final class AutoNextFrom {
        private static final EnumEntries $ENTRIES;
        private static final AutoNextFrom[] $VALUES;
        private final int value;
        public static final AutoNextFrom PLAYLIST = new AutoNextFrom("PLAYLIST", 0, 1);
        public static final AutoNextFrom COLLECTION = new AutoNextFrom("COLLECTION", 1, 2);
        public static final AutoNextFrom PAGES = new AutoNextFrom("PAGES", 2, 3);
        public static final AutoNextFrom RECOMMEND = new AutoNextFrom("RECOMMEND", 3, 4);

        private static final /* synthetic */ AutoNextFrom[] $values() {
            return new AutoNextFrom[]{PLAYLIST, COLLECTION, PAGES, RECOMMEND};
        }

        static {
            AutoNextFrom[] autoNextFromArr$values = $values();
            $VALUES = autoNextFromArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(autoNextFromArr$values);
        }

        private AutoNextFrom(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<AutoNextFrom> getEntries() {
            return $ENTRIES;
        }

        public static AutoNextFrom valueOf(String str) {
            return (AutoNextFrom) Enum.valueOf(AutoNextFrom.class, str);
        }

        public static AutoNextFrom[] values() {
            return (AutoNextFrom[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        @NotNull
        public final String reportValue() {
            return String.valueOf(this.value);
        }
    }

    public AutoNextInfo(@NotNull String str, @NotNull AutoNextFrom autoNextFrom, @NotNull String str2, int i7, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable String str8, long j7, long j8) {
        this.f98157a = str;
        this.f98158b = autoNextFrom;
        this.f98159c = str2;
        this.f98160d = i7;
        this.f98161e = str3;
        this.f98162f = str4;
        this.f98163g = str5;
        this.h = str6;
        this.f98164i = str7;
        this.f98165j = str8;
        this.f98166k = j7;
        this.f98167l = j8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoNextInfo)) {
            return false;
        }
        AutoNextInfo autoNextInfo = (AutoNextInfo) obj;
        return Intrinsics.areEqual(this.f98157a, autoNextInfo.f98157a) && this.f98158b == autoNextInfo.f98158b && Intrinsics.areEqual(this.f98159c, autoNextInfo.f98159c) && this.f98160d == autoNextInfo.f98160d && Intrinsics.areEqual(this.f98161e, autoNextInfo.f98161e) && Intrinsics.areEqual(this.f98162f, autoNextInfo.f98162f) && Intrinsics.areEqual(this.f98163g, autoNextInfo.f98163g) && Intrinsics.areEqual(this.h, autoNextInfo.h) && Intrinsics.areEqual(this.f98164i, autoNextInfo.f98164i) && Intrinsics.areEqual(this.f98165j, autoNextInfo.f98165j) && this.f98166k == autoNextInfo.f98166k && this.f98167l == autoNextInfo.f98167l;
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(E.a(E.a(I.a(this.f98160d, E.a((this.f98158b.hashCode() + (this.f98157a.hashCode() * 31)) * 31, 31, this.f98159c), 31), 31, this.f98161e), 31, this.f98162f), 31, this.f98163g), 31, this.h), 31, this.f98164i);
        String str = this.f98165j;
        return Long.hashCode(this.f98167l) + C3554n0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f98166k);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoNextInfo(headline=");
        sb.append(this.f98157a);
        sb.append(", from=");
        sb.append(this.f98158b);
        sb.append(", title=");
        sb.append(this.f98159c);
        sb.append(", viewVtIcon=");
        sb.append(this.f98160d);
        sb.append(", plays=");
        sb.append(this.f98161e);
        sb.append(", cover=");
        sb.append(this.f98162f);
        sb.append(", author=");
        sb.append(this.f98163g);
        sb.append(", duration=");
        sb.append(this.h);
        sb.append(", spmid=");
        sb.append(this.f98164i);
        sb.append(", trackId=");
        sb.append(this.f98165j);
        sb.append(", avid=");
        sb.append(this.f98166k);
        sb.append(", cid=");
        return android.support.v4.media.session.a.a(sb, this.f98167l, ")");
    }
}
