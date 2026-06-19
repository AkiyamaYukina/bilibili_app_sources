package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/d.class */
@StabilityInferred(parameters = 1)
public abstract class AbstractC6342d {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/d$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends AbstractC6342d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f101651a = new AbstractC6342d();
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.d$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/d$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends AbstractC6342d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f101652a = new AbstractC6342d();
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.d$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/d$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends AbstractC6342d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f101653a;

        public c(long j7) {
            this.f101653a = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f101653a == ((c) obj).f101653a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f101653a);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.session.a.a(new StringBuilder("TAB_ONLY(sectionId="), this.f101653a, ")");
        }
    }
}
