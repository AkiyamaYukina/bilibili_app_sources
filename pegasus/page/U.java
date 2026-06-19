package com.bilibili.pegasus.page;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/U.class */
@StabilityInferred(parameters = 0)
public final class U extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<b> f78377b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/U$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f78379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f78380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f78381d;

        public a(int i7, int i8, int i9, int i10) {
            this.f78378a = i7;
            this.f78379b = i8;
            this.f78380c = i9;
            this.f78381d = i10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f78378a == aVar.f78378a && this.f78379b == aVar.f78379b && this.f78380c == aVar.f78380c && this.f78381d == aVar.f78381d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f78381d) + androidx.compose.animation.core.I.a(this.f78380c, androidx.compose.animation.core.I.a(this.f78379b, Integer.hashCode(this.f78378a) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickArea(x=");
            sb.append(this.f78378a);
            sb.append(", y=");
            sb.append(this.f78379b);
            sb.append(", width=");
            sb.append(this.f78380c);
            sb.append(", height=");
            return C4277b.a(this.f78381d, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/U$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function1<View, a> f78382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f78383b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function1<? super View, a> function1, @NotNull Function0<Unit> function0) {
            this.f78382a = function1;
            this.f78383b = function0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f78382a, bVar.f78382a) && Intrinsics.areEqual(this.f78383b, bVar.f78383b);
        }

        public final int hashCode() {
            return this.f78383b.hashCode() + (this.f78382a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ClickAreaSpec(provider=" + this.f78382a + ", onTap=" + this.f78383b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/U$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FrameLayout f78384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<View> f78385b;

        public c(@NotNull FrameLayout frameLayout) {
            super(frameLayout);
            this.f78384a = frameLayout;
            this.f78385b = new ArrayList();
        }
    }

    public U(int i7, @NotNull List<b> list) {
        this.f78376a = i7;
        this.f78377b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        c cVar = (c) viewHolder;
        int i8 = 0;
        for (Object obj : this.f78377b) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            b bVar = (b) obj;
            View view = (View) CollectionsKt.getOrNull(cVar.f78385b, i8);
            if (view != null) {
                a aVar = (a) bVar.f78382a.invoke(cVar.f78384a);
                if (aVar == null) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    int i9 = aVar.f78381d;
                    int i10 = aVar.f78380c;
                    FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                    if (layoutParams2 == null) {
                        layoutParams3 = new FrameLayout.LayoutParams(i10, i9);
                    }
                    layoutParams3.width = i10;
                    layoutParams3.height = i9;
                    layoutParams3.gravity = 8388659;
                    layoutParams3.leftMargin = aVar.f78378a;
                    layoutParams3.topMargin = aVar.f78379b;
                    view.setLayoutParams(layoutParams3);
                }
            }
            i8++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f78376a));
        c cVar = new c(frameLayout);
        for (b bVar : this.f78377b) {
            View view = new View(viewGroup.getContext());
            view.setClickable(true);
            view.setFocusable(true);
            view.setOnClickListener(new Ak.f(bVar, 2));
            ((ArrayList) cVar.f78385b).add(view);
            frameLayout.addView(view);
        }
        return cVar;
    }
}
