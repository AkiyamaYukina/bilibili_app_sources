package com.bilibili.ship.theseus.united.page.tab;

import android.content.res.ColorStateList;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TabPage.class */
public interface TabPage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TabPage$LocatableTag.class */
    public static final class LocatableTag {
        private static final EnumEntries $ENTRIES;
        private static final LocatableTag[] $VALUES;

        @NotNull
        public static final a Companion;

        @NotNull
        private final String value;
        public static final LocatableTag Introduction = new LocatableTag("Introduction", 0, "introduction");
        public static final LocatableTag Comment = new LocatableTag("Comment", 1, "comment");
        public static final LocatableTag Third = new LocatableTag("Third", 2, GameCenterBottomTabConfig.TAB_TYPE_ACT);
        public static final LocatableTag Catalog = new LocatableTag("Catalog", 3, "catalog");

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TabPage$LocatableTag$a.class */
        public static final class a {
            @Nullable
            public static LocatableTag a(@NotNull String str) {
                Object obj;
                Iterator it = LocatableTag.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((LocatableTag) next).getValue(), str)) {
                        obj = next;
                        break;
                    }
                }
                return (LocatableTag) obj;
            }
        }

        private static final /* synthetic */ LocatableTag[] $values() {
            return new LocatableTag[]{Introduction, Comment, Third, Catalog};
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.ship.theseus.united.page.tab.TabPage$LocatableTag$a, java.lang.Object] */
        static {
            LocatableTag[] locatableTagArr$values = $values();
            $VALUES = locatableTagArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(locatableTagArr$values);
            Companion = new Object();
        }

        private LocatableTag(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<LocatableTag> getEntries() {
            return $ENTRIES;
        }

        public static LocatableTag valueOf(String str) {
            return (LocatableTag) Enum.valueOf(LocatableTag.class, str);
        }

        public static LocatableTag[] values() {
            return (LocatableTag[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @NotNull
    Qj0.d a();

    @Nullable
    default LocatableTag b() {
        return null;
    }

    @NotNull
    RunningUIComponent c(@NotNull TheseusTabPagerService$_init_$lambda$1$$inlined$map$1 theseusTabPagerService$_init_$lambda$1$$inlined$map$1, @Nullable ColorStateList colorStateList, boolean z6);

    @Nullable
    default TabControl d() {
        return null;
    }

    @NotNull
    default Map<String, String> e() {
        return MapsKt.emptyMap();
    }
}
