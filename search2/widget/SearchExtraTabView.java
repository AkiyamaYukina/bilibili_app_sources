package com.bilibili.search2.widget;

import Oh1.h;
import Yt0.C3164s;
import Yt0.C3166u;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C3237a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.recyclerview.InterceptHorizontalRecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.main.ogv.a;
import com.bilibili.search2.main.ogv.c;
import j4.t;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchExtraTabView.class */
@StabilityInferred(parameters = 0)
public final class SearchExtraTabView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterceptHorizontalRecyclerView f88930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f88931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Integer, Unit> f88932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AnonymousClass1 f88933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f88934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final View f88935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Boolean f88936g;

    @NotNull
    public com.bilibili.search2.main.ogv.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final c f88937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final View f88938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C3164s f88939k;

    /* JADX INFO: renamed from: com.bilibili.search2.widget.SearchExtraTabView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchExtraTabView$1.class */
    public static final class AnonymousClass1 extends LinearLayoutManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f88940a;

        /* JADX INFO: renamed from: com.bilibili.search2.widget.SearchExtraTabView$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchExtraTabView$1$a.class */
        public static final class a extends LinearSmoothScroller {
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final int calculateDtToFit(int i7, int i8, int i9, int i10, int i11) {
                return C3237a.a(i10, i9, 2, i9) - (((i8 - i7) / 2) + i7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(context, 0, false);
            this.f88940a = context;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this.f88940a);
            linearSmoothScroller.setTargetPosition(i7);
            startSmoothScroll(linearSmoothScroller);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchExtraTabView$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchExtraTabView f88941a;

        public a(SearchExtraTabView searchExtraTabView, SearchExtraTabView searchExtraTabView2) {
            this.f88941a = searchExtraTabView2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchExtraTabView searchExtraTabView = this.f88941a;
            com.bilibili.search2.main.ogv.a aVar = searchExtraTabView.h;
            if (aVar instanceof a.b) {
                searchExtraTabView.f88937i.setOverlay(aVar);
            }
        }
    }

    @JvmOverloads
    public SearchExtraTabView(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public SearchExtraTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a.C0582a c0582a = a.C0582a.f86856a;
        this.h = c0582a;
        C3164s c3164s = new C3164s(new C3166u(this, 0));
        this.f88939k = c3164s;
        InterceptHorizontalRecyclerView interceptHorizontalRecyclerView = new InterceptHorizontalRecyclerView(context, (AttributeSet) null);
        this.f88930a = interceptHorizontalRecyclerView;
        interceptHorizontalRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.f88933d = anonymousClass1;
        interceptHorizontalRecyclerView.setLayoutManager(anonymousClass1);
        interceptHorizontalRecyclerView.setAdapter(c3164s);
        if (interceptHorizontalRecyclerView.getItemAnimator() instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) interceptHorizontalRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        interceptHorizontalRecyclerView.setPadding(ListExtentionsKt.toPx(10), 0, 0, 0);
        interceptHorizontalRecyclerView.setClipToPadding(false);
        View view = new View(context);
        this.f88935f = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c cVar = new c(context, 0);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cVar.setOverlay(c0582a);
        this.f88937i = cVar;
        addView(view);
        addView(cVar);
        addView(interceptHorizontalRecyclerView);
        View view2 = new View(context);
        this.f88938j = view2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
        view2.setBackgroundColor(context.getResources().getColor(R$color.Ga3));
        view2.setAlpha(0.7f);
        layoutParams.gravity = 80;
        view2.setLayoutParams(layoutParams);
        addView(view2);
    }

    public final void a(boolean z6) {
        Boolean bool;
        t.a("bindOnPic ", "SearchExtraTabView", z6);
        if (this.f88939k.f29292b.isEmpty() || (bool = this.f88936g) == null || Intrinsics.areEqual(bool, Boolean.valueOf(z6))) {
            return;
        }
        this.f88936g = Boolean.valueOf(z6);
        if (z6) {
            this.f88935f.setBackground(null);
        } else {
            setBackgroundColor(ContextCompat.getColor(getContext(), R$color.f64616Wh0));
        }
        C3164s c3164s = this.f88939k;
        if (c3164s.f29293c != z6) {
            c3164s.f29293c = z6;
            c3164s.notifyItemRangeChanged(0, c3164s.f29292b.size());
        }
    }

    public final void b() {
        if (this.h instanceof a.b) {
            if (getVisibility() != 0 || getWidth() <= 0 || getHeight() <= 0 || !isShown()) {
                post(new h(this, 1));
            } else {
                OneShotPreDrawListener.add(this, new a(this, this));
            }
        }
    }

    @NotNull
    public final View getBottomLine() {
        return this.f88938j;
    }

    @Nullable
    public final Function1<String, Unit> getClickListener() {
        return this.f88931b;
    }

    @Nullable
    public final Function2<String, Integer, Unit> getIndexedClickListener() {
        return this.f88932c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (z6) {
            b();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NotNull View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (view == this && i7 == 0) {
            b();
        }
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable drawable) {
        this.f88935f.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        bilibili.live.app.service.resolver.c.a(i7, "setBgColor ", "SearchExtraTabView");
        this.f88935f.setBackgroundColor(i7);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        this.f88935f.setBackgroundResource(i7);
    }

    public final void setBrand155GradientOverlay(@NotNull com.bilibili.search2.main.ogv.a aVar) {
        this.h = aVar;
        this.f88937i.setOverlay(aVar);
        b();
    }

    public final void setClickListener(@Nullable Function1<? super String, Unit> function1) {
        this.f88931b = function1;
    }

    public final void setHorizontalPadding(@Nullable Integer num) {
        if (num == null) {
            this.f88930a.setPadding(ListExtentionsKt.toPx(10), 0, 0, 0);
        } else {
            this.f88930a.setPadding(ListExtentionsKt.toPx(num.intValue()), this.f88930a.getPaddingTop(), this.f88930a.getPaddingRight(), this.f88930a.getPaddingBottom());
        }
    }

    public final void setIndexedClickListener(@Nullable Function2<? super String, ? super Integer, Unit> function2) {
        this.f88932c = function2;
    }
}
