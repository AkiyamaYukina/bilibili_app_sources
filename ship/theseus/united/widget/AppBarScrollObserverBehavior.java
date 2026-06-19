package com.bilibili.ship.theseus.united.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/AppBarScrollObserverBehavior.class */
@StabilityInferred(parameters = 0)
public final class AppBarScrollObserverBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f104879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ValueAnimator f104880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f104882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f104883e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/AppBarScrollObserverBehavior$a.class */
    public interface a {
        void a();

        void onScrollStart();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/AppBarScrollObserverBehavior$b.class */
    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppBarScrollObserverBehavior f104884a;

        public b(AppBarScrollObserverBehavior appBarScrollObserverBehavior) {
            this.f104884a = appBarScrollObserverBehavior;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f104884a.f104882d = false;
            this.f104884a.notifyScrollStop();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f104884a.f104882d = false;
            this.f104884a.notifyScrollStop();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f104884a.f104882d = true;
            this.f104884a.notifyScrollStart();
        }
    }

    public AppBarScrollObserverBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f104883e = new b(this);
    }

    public /* synthetic */ AppBarScrollObserverBehavior(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void animateOffsetToByReflection$default(AppBarScrollObserverBehavior appBarScrollObserverBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, float f7, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            f7 = 0.0f;
        }
        appBarScrollObserverBehavior.animateOffsetToByReflection(coordinatorLayout, appBarLayout, i7, f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyScrollStart() {
        a aVar;
        if ((this.f104881c || this.f104882d) && (aVar = this.f104879a) != null) {
            aVar.onScrollStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyScrollStop() {
        a aVar;
        if (this.f104881c || this.f104882d || (aVar = this.f104879a) == null) {
            return;
        }
        aVar.a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:35:0x00f4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void animateOffsetToByReflection(@org.jetbrains.annotations.NotNull androidx.coordinatorlayout.widget.CoordinatorLayout r8, @org.jetbrains.annotations.NotNull com.google.android.material.appbar.AppBarLayout r9, int r10, float r11) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.widget.AppBarScrollObserverBehavior.animateOffsetToByReflection(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, float):void");
    }

    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull AppBarLayout appBarLayout, @NotNull View view, int i7, int i8, @NotNull int[] iArr, int i9) {
        if (!this.f104881c) {
            this.f104881c = true;
            notifyScrollStart();
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i7, i8, iArr, i9);
    }

    public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull AppBarLayout appBarLayout, @NotNull View view, int i7, int i8, int i9, int i10, int i11, @NotNull int[] iArr) {
        if (!this.f104881c) {
            this.f104881c = true;
            notifyScrollStart();
        }
        super.onNestedScroll(coordinatorLayout, appBarLayout, view, i7, i8, i9, i10, i11, iArr);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x00a2
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void onStopNestedScroll(@org.jetbrains.annotations.NotNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @org.jetbrains.annotations.NotNull com.google.android.material.appbar.AppBarLayout r8, @org.jetbrains.annotations.NotNull android.view.View r9, int r10) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.onStopNestedScroll(r1, r2, r3, r4)
            r0 = r6
            r1 = 0
            r0.f104881c = r1
            r0 = r6
            r0.notifyScrollStop()
            r0 = r6
            android.animation.ValueAnimator r0 = r0.f104880b
            if (r0 != 0) goto L8c
            java.lang.reflect.Field r0 = Cv0.a.f1802b
            r7 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            if (r0 != 0) goto L66
            java.lang.Class<?> r0 = Cv0.a.f1801a     // Catch: java.lang.NoSuchFieldException -> L9e
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L45
            java.lang.Class<com.google.android.material.appbar.AppBarLayout> r0 = com.google.android.material.appbar.AppBarLayout.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.NoSuchFieldException -> L9e java.lang.ClassNotFoundException -> La2
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L3f
            r0 = r7
            java.lang.String r1 = "com.google.android.material.appbar.AppBarLayout$BaseBehavior"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.NoSuchFieldException -> L9e java.lang.ClassNotFoundException -> La2
            r7 = r0
            goto L41
        L3f:
            r0 = 0
            r7 = r0
        L41:
            r0 = r7
            Cv0.a.f1801a = r0     // Catch: java.lang.NoSuchFieldException -> L9e java.lang.ClassNotFoundException -> La2
        L45:
            java.lang.Class<?> r0 = Cv0.a.f1801a     // Catch: java.lang.NoSuchFieldException -> L9e java.lang.NoSuchFieldException -> L9e java.lang.ClassNotFoundException -> La2
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L57
            r0 = r7
            java.lang.String r1 = "offsetAnimator"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L9e
            r7 = r0
            goto L59
        L57:
            r0 = 0
            r7 = r0
        L59:
            r0 = r7
            Cv0.a.f1802b = r0     // Catch: java.lang.NoSuchFieldException -> L9e
            r0 = r7
            if (r0 == 0) goto L66
            r0 = r7
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L9e
        L66:
            java.lang.reflect.Field r0 = Cv0.a.f1802b     // Catch: java.lang.NoSuchFieldException -> L9e java.lang.Exception -> La6
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L77
            r0 = r7
            r1 = r6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> La6
            r8 = r0
            goto L79
        L77:
            r0 = 0
            r8 = r0
        L79:
            r0 = r9
            r7 = r0
            r0 = r8
            boolean r0 = r0 instanceof android.animation.ValueAnimator     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L87
            r0 = r8
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0     // Catch: java.lang.Exception -> La6
            r7 = r0
        L87:
            r0 = r6
            r1 = r7
            r0.f104880b = r1
        L8c:
            r0 = r6
            android.animation.ValueAnimator r0 = r0.f104880b
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L9d
            r0 = r7
            r1 = r6
            com.bilibili.ship.theseus.united.widget.AppBarScrollObserverBehavior$b r1 = r1.f104883e
            r0.addListener(r1)
        L9d:
            return
        L9e:
            r7 = move-exception
            goto L66
        La2:
            r7 = move-exception
            goto L45
        La6:
            r7 = move-exception
            r0 = r9
            r7 = r0
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.widget.AppBarScrollObserverBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int):void");
    }

    public final void setScrollListener(@Nullable a aVar) {
        this.f104879a = aVar;
    }
}
