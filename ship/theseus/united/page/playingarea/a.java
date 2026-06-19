package com.bilibili.ship.theseus.united.page.playingarea;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.infra.widget.RatioLayout;
import kotlin.Pair;
import kotlin.jvm.JvmInline;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/a.class */
public interface a {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/a$a.class */
    @StabilityInferred(parameters = 1)
    public static final class C1102a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f102351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f102352b;

        public C1102a(int i7, int i8) {
            this.f102351a = i7;
            this.f102352b = i8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1102a)) {
                return false;
            }
            C1102a c1102a = (C1102a) obj;
            return this.f102351a == c1102a.f102351a && this.f102352b == c1102a.f102352b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f102352b) + (Integer.hashCode(this.f102351a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayingSize(width=");
            sb.append(this.f102351a);
            sb.append(", height=");
            return C4277b.a(this.f102352b, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/a$b.class */
    @JvmInline
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f102353a;

        public final boolean equals(Object obj) {
            boolean z6 = false;
            if (obj instanceof b) {
                if (Float.compare(this.f102353a, ((b) obj).f102353a) == 0) {
                    z6 = true;
                }
            }
            return z6;
        }

        public final int hashCode() {
            return Float.hashCode(this.f102353a);
        }

        public final String toString() {
            return C.d.a(this.f102353a, ")", new StringBuilder("SpecifiedRatio(ratio="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/a$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewGroup f102354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final FrameLayout f102355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final RatioLayout f102356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final RatioLayout f102357d;

        public c(@NotNull ViewGroup viewGroup, @NotNull FrameLayout frameLayout, @NotNull RatioLayout ratioLayout, @NotNull RatioLayout ratioLayout2) {
            this.f102354a = viewGroup;
            this.f102355b = frameLayout;
            this.f102356c = ratioLayout;
            this.f102357d = ratioLayout2;
        }
    }

    int a();

    @NotNull
    StateFlow<Pair<Integer, Integer>> b();

    @NotNull
    C1102a c();

    @NotNull
    Pair<Integer, Integer> d();

    float e(@NotNull PlayingAreaDescription playingAreaDescription);

    int f();

    @NotNull
    StateFlow<C1102a> g();

    int h();

    int i();
}
