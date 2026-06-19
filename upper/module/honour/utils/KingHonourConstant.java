package com.bilibili.upper.module.honour.utils;

import G3.C0;
import G3.D0;
import G3.E0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/KingHonourConstant.class */
@StabilityInferred(parameters = 0)
public final class KingHonourConstant {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f113324a = LazyKt.lazy(new C0(11));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f113325b = LazyKt.lazy(new D0(8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f113326c = LazyKt.lazy(new E0(9));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f113327d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/KingHonourConstant$KingHonourFrom.class */
    public static final class KingHonourFrom {
        private static final EnumEntries $ENTRIES;
        private static final KingHonourFrom[] $VALUES;
        public static final KingHonourFrom GAME_FACTORY = new KingHonourFrom("GAME_FACTORY", 0);
        public static final KingHonourFrom GAME_TEMPLATE = new KingHonourFrom("GAME_TEMPLATE", 1);

        private static final /* synthetic */ KingHonourFrom[] $values() {
            return new KingHonourFrom[]{GAME_FACTORY, GAME_TEMPLATE};
        }

        static {
            KingHonourFrom[] kingHonourFromArr$values = $values();
            $VALUES = kingHonourFromArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(kingHonourFromArr$values);
        }

        private KingHonourFrom(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<KingHonourFrom> getEntries() {
            return $ENTRIES;
        }

        public static KingHonourFrom valueOf(String str) {
            return (KingHonourFrom) Enum.valueOf(KingHonourFrom.class, str);
        }

        public static KingHonourFrom[] values() {
            return (KingHonourFrom[]) $VALUES.clone();
        }
    }
}
