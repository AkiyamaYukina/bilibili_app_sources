package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import PX0.c0;
import androidx.compose.ui.graphics.e0;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/d.class */
public interface d {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/d$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Igv f107470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<MediaStrategyItem> f107471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f107472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f107473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Lazy f107474e;

        public /* synthetic */ a(Igv igv, List list) {
            this(igv, list, "");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Igv igv, @NotNull List<? extends MediaStrategyItem> list, @NotNull String str) {
            this.f107470a = igv;
            this.f107471b = list;
            this.f107472c = str;
            this.f107474e = LazyKt.lazy(new c0(this, 6));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f107470a, aVar.f107470a) && Intrinsics.areEqual(this.f107471b, aVar.f107471b) && Intrinsics.areEqual(this.f107472c, aVar.f107472c);
        }

        public final int hashCode() {
            return this.f107472c.hashCode() + e0.a(this.f107470a.hashCode() * 31, 31, this.f107471b);
        }

        @NotNull
        public final String toString() {
            List<MediaStrategyItem> list = this.f107471b;
            StringBuilder sb = new StringBuilder("StrategyWithItems(igvStrategy=");
            sb.append(this.f107470a);
            sb.append(", items=");
            sb.append(list);
            sb.append(", logString=");
            return C8770a.a(sb, this.f107472c, ")");
        }
    }

    @NotNull
    String a();

    void b(@NotNull String str);

    @Nullable
    Object c(@NotNull GenerateJob generateJob, @NotNull Continuation<? super List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a>> continuation);
}
