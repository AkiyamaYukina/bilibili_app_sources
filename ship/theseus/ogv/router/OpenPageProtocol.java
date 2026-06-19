package com.bilibili.ship.theseus.ogv.router;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import kntr.base.router.Router;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/router/OpenPageProtocol.class */
@StabilityInferred(parameters = 1)
public final class OpenPageProtocol {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/router/OpenPageProtocol$FillType.class */
    public static final class FillType {
        private static final EnumEntries $ENTRIES;
        private static final FillType[] $VALUES;
        public static final FillType Half = new FillType("Half", 0, "half");
        public static final FillType Landscape = new FillType("Landscape", 1, "fillLandscape");

        @NotNull
        private final String value;

        private static final /* synthetic */ FillType[] $values() {
            return new FillType[]{Half, Landscape};
        }

        static {
            FillType[] fillTypeArr$values = $values();
            $VALUES = fillTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(fillTypeArr$values);
        }

        private FillType(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<FillType> getEntries() {
            return $ENTRIES;
        }

        public static FillType valueOf(String str) {
            return (FillType) Enum.valueOf(FillType.class, str);
        }

        public static FillType[] values() {
            return (FillType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public static boolean a(@NotNull Uri uri) {
        return uri.isHierarchical() && Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/open_page");
    }

    public static Router b(Router router) {
        FillType fillType = FillType.Half;
        Router.a aVarNewBuilder = router.newBuilder();
        aVarNewBuilder.b(new a(fillType, false));
        return aVarNewBuilder.c();
    }
}
