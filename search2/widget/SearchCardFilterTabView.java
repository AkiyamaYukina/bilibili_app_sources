package com.bilibili.search2.widget;

import Yt0.C3150d;
import Yt0.C3160n;
import Yt0.C3162p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.C3237a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import bilibili.live.app.service.resolver.c;
import com.bilibili.app.comm.list.widget.recyclerview.InterceptHorizontalRecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchCardFilterTabView.class */
@StabilityInferred(parameters = 0)
public final class SearchCardFilterTabView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88919g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterceptHorizontalRecyclerView f88920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f88921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AnonymousClass1 f88922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f88923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final View f88924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C3160n f88925f;

    /* JADX INFO: renamed from: com.bilibili.search2.widget.SearchCardFilterTabView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchCardFilterTabView$1.class */
    public static final class AnonymousClass1 extends LinearLayoutManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f88926a;

        /* JADX INFO: renamed from: com.bilibili.search2.widget.SearchCardFilterTabView$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchCardFilterTabView$1$a.class */
        public static final class a extends LinearSmoothScroller {
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final int calculateDtToFit(int i7, int i8, int i9, int i10, int i11) {
                return C3237a.a(i10, i9, 2, i9) - (((i8 - i7) / 2) + i7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(context, 0, false);
            this.f88926a = context;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this.f88926a);
            linearSmoothScroller.setTargetPosition(i7);
            startSmoothScroll(linearSmoothScroller);
        }
    }

    @JvmOverloads
    public SearchCardFilterTabView(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public SearchCardFilterTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        C3160n c3160n = new C3160n(new C3162p(this));
        this.f88925f = c3160n;
        InterceptHorizontalRecyclerView interceptHorizontalRecyclerView = new InterceptHorizontalRecyclerView(context, (AttributeSet) null);
        this.f88920a = interceptHorizontalRecyclerView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        interceptHorizontalRecyclerView.setLayoutParams(layoutParams);
        interceptHorizontalRecyclerView.setOverScrollMode(2);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.f88922c = anonymousClass1;
        interceptHorizontalRecyclerView.setLayoutManager(anonymousClass1);
        interceptHorizontalRecyclerView.setAdapter(c3160n);
        if (interceptHorizontalRecyclerView.getItemAnimator() instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) interceptHorizontalRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        interceptHorizontalRecyclerView.setPadding(ListExtentionsKt.toPx(10), 0, ListExtentionsKt.toPx(10), 0);
        interceptHorizontalRecyclerView.setClipToPadding(false);
        View view = new View(context);
        this.f88923d = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(view);
        addView(interceptHorizontalRecyclerView);
        View view2 = new View(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 1);
        view2.setBackgroundColor(context.getResources().getColor(R$color.Ga3));
        view2.setAlpha(0.7f);
        layoutParams2.gravity = 80;
        view2.setLayoutParams(layoutParams2);
        addView(view2);
        ListExtentionsKt.gone(view2);
    }

    public final void a(@NotNull List<String> list, @Nullable String str, @ColorRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, @DrawableRes @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        C3160n c3160n = this.f88925f;
        c3160n.f29248c = num;
        c3160n.f29249d = num2;
        c3160n.f29250e = num3;
        if (num4 != null) {
            c3160n.f29251f = num4.intValue();
        }
        if (num5 != null) {
            c3160n.f29252g = num5.intValue();
        }
        if (str != null) {
            c3160n.N(0);
            List<String> list2 = list;
            List listFilterNotNull = CollectionsKt.filterNotNull(list2);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
            Iterator it = listFilterNotNull.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3150d((String) it.next()));
            }
            c3160n.f29247b = arrayList;
            int i7 = 0;
            for (Object obj : list2) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((String) obj, str)) {
                    c3160n.N(i7);
                }
                i7++;
            }
        } else {
            c3160n.N(0);
            List listFilterNotNull2 = CollectionsKt.filterNotNull(list);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull2, 10));
            Iterator it2 = listFilterNotNull2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C3150d((String) it2.next()));
            }
            c3160n.f29247b = arrayList2;
            c3160n.N(arrayList2.isEmpty() ? -1 : 0);
        }
        c3160n.notifyDataSetChanged();
    }

    @Nullable
    public final Function1<String, Unit> getClickListener() {
        return this.f88921b;
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable drawable) {
        this.f88923d.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        c.a(i7, "setBgColor ", "SearchCardFilterTabView");
        this.f88923d.setBackgroundColor(i7);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        this.f88923d.setBackgroundResource(i7);
    }

    public final void setClickListener(@Nullable Function1<? super String, Unit> function1) {
        this.f88921b = function1;
    }
}
