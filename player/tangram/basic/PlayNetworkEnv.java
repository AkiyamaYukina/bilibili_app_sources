package com.bilibili.player.tangram.basic;

import com.bilibili.live.streaming.source.TextSource;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlayNetworkEnv.class */
public interface PlayNetworkEnv {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlayNetworkEnv$Info.class */
    public static final class Info {
        private static final EnumEntries $ENTRIES;
        private static final Info[] $VALUES;
        public static final Info Cellular = new Info("Cellular", 0);
        public static final Info OnFreeDataSuccessful = new Info("OnFreeDataSuccessful", 1);
        public static final Info OnFreeDataFailed = new Info("OnFreeDataFailed", 2);
        public static final Info OnFreeDataFailedAndDowngradeMobile = new Info("OnFreeDataFailedAndDowngradeMobile", 3);
        public static final Info UnKnow = new Info("UnKnow", 4);

        private static final /* synthetic */ Info[] $values() {
            return new Info[]{Cellular, OnFreeDataSuccessful, OnFreeDataFailed, OnFreeDataFailedAndDowngradeMobile, UnKnow};
        }

        static {
            Info[] infoArr$values = $values();
            $VALUES = infoArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(infoArr$values);
        }

        private Info(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Info> getEntries() {
            return $ENTRIES;
        }

        public static Info valueOf(String str) {
            return (Info) Enum.valueOf(Info.class, str);
        }

        public static Info[] values() {
            return (Info[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlayNetworkEnv$a.class */
    public static final class a implements PlayNetworkEnv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Info f79288a;

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i7) {
            this(Info.UnKnow);
        }

        public a(@NotNull Info info) {
            this.f79288a = info;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f79288a == ((a) obj).f79288a;
        }

        public final int hashCode() {
            return this.f79288a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Mobile(info=" + this.f79288a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlayNetworkEnv$b.class */
    public static final class b implements PlayNetworkEnv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f79289a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1849539977;
        }

        @NotNull
        public final String toString() {
            return TextSource.STR_SCROLL_NONE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlayNetworkEnv$c.class */
    public static final class c implements PlayNetworkEnv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f79290a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1849802086;
        }

        @NotNull
        public final String toString() {
            return "Wifi";
        }
    }
}
