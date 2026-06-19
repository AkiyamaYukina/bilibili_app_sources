package com.bilibili.ship.theseus.united.page.error;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/b.class */
public interface b {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/b$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f99590a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -404572481;
        }

        @NotNull
        public final String toString() {
            return "InformalMember";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/b$b.class */
    @StabilityInferred(parameters = 1)
    public static final class C0985b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0985b f99591a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C0985b);
        }

        public final int hashCode() {
            return -1661287204;
        }

        @NotNull
        public final String toString() {
            return "NetError";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/b$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f99592a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1375348000;
        }

        @NotNull
        public final String toString() {
            return "NotFound";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/b$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f99593a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1452701943;
        }

        @NotNull
        public final String toString() {
            return "OtherError";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/b$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f99594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final ExtraInfo.PlayLimit.PlayLimitButton f99595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99596c;

        public e(@Nullable String str, @Nullable ExtraInfo.PlayLimit.PlayLimitButton playLimitButton, int i7) {
            this.f99594a = str;
            this.f99595b = playLimitButton;
            this.f99596c = i7;
        }
    }
}
