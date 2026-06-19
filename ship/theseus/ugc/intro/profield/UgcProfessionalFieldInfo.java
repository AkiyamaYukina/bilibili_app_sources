package com.bilibili.ship.theseus.ugc.intro.profield;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldInfo.class */
@StabilityInferred(parameters = 1)
public final class UgcProfessionalFieldInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewType f97127c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldInfo$ViewType.class */
    public static final class ViewType {
        private static final EnumEntries $ENTRIES;
        private static final ViewType[] $VALUES;
        public static final ViewType COMPONENT_TYPE_STAGE1 = new ViewType("COMPONENT_TYPE_STAGE1", 0);
        public static final ViewType COMPONENT_TYPE_STAGE2 = new ViewType("COMPONENT_TYPE_STAGE2", 1);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{COMPONENT_TYPE_STAGE1, COMPONENT_TYPE_STAGE2};
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(viewTypeArr$values);
        }

        private ViewType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    public UgcProfessionalFieldInfo() {
        this("", "", ViewType.COMPONENT_TYPE_STAGE1);
    }

    public UgcProfessionalFieldInfo(@NotNull String str, @NotNull String str2, @NotNull ViewType viewType) {
        this.f97125a = str;
        this.f97126b = str2;
        this.f97127c = viewType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UgcProfessionalFieldInfo)) {
            return false;
        }
        UgcProfessionalFieldInfo ugcProfessionalFieldInfo = (UgcProfessionalFieldInfo) obj;
        return Intrinsics.areEqual(this.f97125a, ugcProfessionalFieldInfo.f97125a) && Intrinsics.areEqual(this.f97126b, ugcProfessionalFieldInfo.f97126b) && this.f97127c == ugcProfessionalFieldInfo.f97127c;
    }

    public final int hashCode() {
        return this.f97127c.hashCode() + E.a(this.f97125a.hashCode() * 31, 31, this.f97126b);
    }

    @NotNull
    public final String toString() {
        return "UgcProfessionalFieldInfo(title=" + this.f97125a + ", subtitle=" + this.f97126b + ", type=" + this.f97127c + ")";
    }
}
