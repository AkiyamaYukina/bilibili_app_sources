package com.bilibili.ship.theseus.united.page.screenstate;

import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/c.class */
public interface c {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/c$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f102989c;

        public /* synthetic */ a() {
            this(true, false, false);
        }

        public a(boolean z6, boolean z7, boolean z8) {
            this.f102987a = z6;
            this.f102988b = z7;
            this.f102989c = z8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f102987a == aVar.f102987a && this.f102988b == aVar.f102988b && this.f102989c == aVar.f102989c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102989c) + z.a(Boolean.hashCode(this.f102987a) * 31, 31, this.f102988b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ScreenState(isPortrait=");
            sb.append(this.f102987a);
            sb.append(", isFullscreen=");
            sb.append(this.f102988b);
            sb.append(", isReversed=");
            return i.a(sb, this.f102989c, ")");
        }
    }

    void a(@Nullable Boolean bool);

    void b(@NotNull Object obj, boolean z6);

    @NotNull
    StateFlow c();

    void d();

    void e();

    @Nullable
    Boolean f();

    void g();

    @NotNull
    a h();

    void i(boolean z6);

    void j(@NotNull Object obj, boolean z6);

    boolean k();

    void l(@Nullable Boolean bool);

    boolean m();

    void n(int i7);
}
