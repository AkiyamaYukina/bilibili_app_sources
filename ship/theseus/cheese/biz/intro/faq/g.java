package com.bilibili.ship.theseus.cheese.biz.intro.faq;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/g.class */
@StabilityInferred(parameters = 1)
public abstract class g {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/g$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f89437a;

        public a(int i7) {
            this.f89437a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f89437a == ((a) obj).f89437a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f89437a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f89437a, ")", new StringBuilder("ClickItemIntent(pos="));
        }
    }
}
