package com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/swipedismiss/a.class */
public final class a<E extends UIComponent.ViewEntry> implements UIComponent<UIComponent.ViewEntry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UIComponent<E> f99852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<SwipeToDismissFrameLayout.Direction> f99853b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/swipedismiss/a$a.class */
    public static final class C0993a<E extends UIComponent.ViewEntry> implements UIComponent.ViewEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SwipeToDismissFrameLayout f99854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final E f99855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final SwipeToDismissFrameLayout f99856c;

        public C0993a(@NotNull SwipeToDismissFrameLayout swipeToDismissFrameLayout, @NotNull E e7) {
            this.f99854a = swipeToDismissFrameLayout;
            this.f99855b = e7;
            this.f99856c = swipeToDismissFrameLayout;
        }

        @NotNull
        public final View getRoot() {
            return this.f99856c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull UIComponent<E> uIComponent, @NotNull Function0<? extends SwipeToDismissFrameLayout.Direction> function0) {
        this.f99852a = uIComponent;
        this.f99853b = function0;
    }

    @Nullable
    public final Object bindToView(@NotNull UIComponent.ViewEntry viewEntry, @NotNull Continuation<? super Unit> continuation) {
        C0993a c0993a = (C0993a) viewEntry;
        SwipeToDismissFrameLayout swipeToDismissFrameLayout = c0993a.f99854a;
        Function0<SwipeToDismissFrameLayout.Direction> function0 = this.f99853b;
        swipeToDismissFrameLayout.setDirectionProvider(function0);
        SwipeToDismissFrameLayout.Direction direction = (SwipeToDismissFrameLayout.Direction) function0.invoke();
        SwipeToDismissFrameLayout swipeToDismissFrameLayout2 = c0993a.f99854a;
        if (swipeToDismissFrameLayout2.f99832c != direction) {
            swipeToDismissFrameLayout2.f99832c = direction;
            swipeToDismissFrameLayout2.p(true);
        }
        Object objBindToView = this.f99852a.bindToView(c0993a.f99855b, continuation);
        return objBindToView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBindToView : Unit.INSTANCE;
    }

    @NotNull
    public final Object contentEqualityKey() {
        return new Pair("swipeDismiss", this.f99852a.contentEqualityKey());
    }

    @NotNull
    public final UIComponent.ViewEntry createViewEntry(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        UIComponent.ViewEntry viewEntryCreateViewEntry = this.f99852a.createViewEntry(context, viewGroup);
        View root = viewEntryCreateViewEntry.getRoot();
        ViewParent parent = root.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(root);
        }
        SwipeToDismissFrameLayout swipeToDismissFrameLayout = new SwipeToDismissFrameLayout(context, 0);
        if (swipeToDismissFrameLayout.getLayoutParams() == null && root.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            swipeToDismissFrameLayout.setLayoutParams(layoutParams instanceof FrameLayout.LayoutParams ? new FrameLayout.LayoutParams((FrameLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height));
        }
        ViewGroup.LayoutParams layoutParams2 = root.getLayoutParams();
        swipeToDismissFrameLayout.addView(root, layoutParams2 instanceof FrameLayout.LayoutParams ? new FrameLayout.LayoutParams((FrameLayout.LayoutParams) layoutParams2) : layoutParams2 instanceof ViewGroup.MarginLayoutParams ? new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams2) : layoutParams2 == null ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height));
        return new C0993a(swipeToDismissFrameLayout, viewEntryCreateViewEntry);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return new Pair("swipeDismiss", this.f99852a.identityEqualityKey());
    }

    @NotNull
    public final Object viewReusingKey() {
        return new Pair("swipeDismiss", this.f99852a.viewReusingKey());
    }
}
