package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBanner.class */
@StabilityInferred(parameters = 0)
@Bson
public final class InsertedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f100148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("item")
    @NotNull
    private final List<Item> f100149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("show_style")
    @NotNull
    private final Style f100150c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBanner$Item.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Item {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f100151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f100152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("jump_type")
        @NotNull
        private final NavigationType f100153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f100154d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBanner$Item$NavigationType.class */
        public static final class NavigationType implements com.bilibili.bson.adapter.a<Integer> {
            private static final EnumEntries $ENTRIES;
            private static final NavigationType[] $VALUES;
            private final int value;
            public static final NavigationType OPEN_URL = new NavigationType("OPEN_URL", 0, 1);
            public static final NavigationType HALF_SCREEN = new NavigationType("HALF_SCREEN", 1, 3);
            public static final NavigationType OPEN_URL_BY_EXTERNAL_BROWSER = new NavigationType("OPEN_URL_BY_EXTERNAL_BROWSER", 2, 4);

            private static final /* synthetic */ NavigationType[] $values() {
                return new NavigationType[]{OPEN_URL, HALF_SCREEN, OPEN_URL_BY_EXTERNAL_BROWSER};
            }

            static {
                NavigationType[] navigationTypeArr$values = $values();
                $VALUES = navigationTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(navigationTypeArr$values);
            }

            private NavigationType(String str, int i7, int i8) {
                this.value = i8;
            }

            @NotNull
            public static EnumEntries<NavigationType> getEntries() {
                return $ENTRIES;
            }

            public static NavigationType valueOf(String str) {
                return (NavigationType) Enum.valueOf(NavigationType.class, str);
            }

            public static NavigationType[] values() {
                return (NavigationType[]) $VALUES.clone();
            }

            @NotNull
            /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
            public Integer m9468getValue() {
                return Integer.valueOf(this.value);
            }
        }

        public Item() {
            throw null;
        }

        public Item(String str, String str2, NavigationType navigationType, Map map, int i7) {
            navigationType = (i7 & 4) != 0 ? NavigationType.OPEN_URL : navigationType;
            this.f100151a = str;
            this.f100152b = str2;
            this.f100153c = navigationType;
            this.f100154d = map;
        }

        @NotNull
        public final NavigationType a() {
            return this.f100153c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(this.f100151a, item.f100151a) && Intrinsics.areEqual(this.f100152b, item.f100152b) && this.f100153c == item.f100153c && Intrinsics.areEqual(this.f100154d, item.f100154d);
        }

        public final int hashCode() {
            int iA = E.a(this.f100151a.hashCode() * 31, 31, this.f100152b);
            return this.f100154d.hashCode() + ((this.f100153c.hashCode() + iA) * 31);
        }

        @NotNull
        public final String toString() {
            NavigationType navigationType = this.f100153c;
            Map<String, String> map = this.f100154d;
            StringBuilder sb = new StringBuilder("Item(cover=");
            sb.append(this.f100151a);
            sb.append(", url=");
            sb.append(this.f100152b);
            sb.append(", navigationType=");
            sb.append(navigationType);
            sb.append(", report=");
            return C8711a.a(sb, map, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBanner$Style.class */
    public static final class Style implements com.bilibili.bson.adapter.a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final Style[] $VALUES;
        private final int value;
        public static final Style SINGLE = new Style("SINGLE", 0, 1);
        public static final Style ROW = new Style("ROW", 1, 2);
        public static final Style COLUMN = new Style("COLUMN", 2, 3);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{SINGLE, ROW, COLUMN};
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(styleArr$values);
        }

        private Style(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m9470getValue() {
            return Integer.valueOf(this.value);
        }
    }

    public InsertedBanner() {
        throw null;
    }

    public InsertedBanner(String str, List list, Style style, int i7) {
        style = (i7 & 4) != 0 ? Style.SINGLE : style;
        this.f100148a = str;
        this.f100149b = list;
        this.f100150c = style;
    }

    @NotNull
    public final List<Item> a() {
        return this.f100149b;
    }

    @NotNull
    public final Style b() {
        return this.f100150c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertedBanner)) {
            return false;
        }
        InsertedBanner insertedBanner = (InsertedBanner) obj;
        return Intrinsics.areEqual(this.f100148a, insertedBanner.f100148a) && Intrinsics.areEqual(this.f100149b, insertedBanner.f100149b) && this.f100150c == insertedBanner.f100150c;
    }

    public final int hashCode() {
        return this.f100150c.hashCode() + e0.a(this.f100148a.hashCode() * 31, 31, this.f100149b);
    }

    @NotNull
    public final String toString() {
        List<Item> list = this.f100149b;
        Style style = this.f100150c;
        StringBuilder sb = new StringBuilder("InsertedBanner(title=");
        M6.f.a(this.f100148a, ", items=", ", style=", sb, list);
        sb.append(style);
        sb.append(")");
        return sb.toString();
    }
}
