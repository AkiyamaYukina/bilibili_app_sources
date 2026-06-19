package com.bilibili.lib.ui;

import Qf0.InterfaceC2826a;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.StringRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.view.AbstractC4557a;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseToolbarFragment.class */
public abstract class BaseToolbarFragment extends BaseFragment implements GarbWatcher.Observer {

    @NotNull
    private final Lazy mProps$delegate = LazyKt.lazy(new com.bilibili.ad.adview.liveroom.answer.fragment.vm.d(this, 1));
    private boolean mShowToolbar = true;

    @Nullable
    private TintToolbar mToolbar;

    private final AbstractC4557a createActionProvider(Context context, String str) {
        try {
            return (AbstractC4557a) context.getClassLoader().loadClass(str).getConstructor(Context.class).newInstance(context);
        } catch (Exception e7) {
            throw new IllegalArgumentException(C4496a.a("Cannot instantiate class: ", str), e7);
        }
    }

    public static /* synthetic */ Integer getToolbarBgColor$default(BaseToolbarFragment baseToolbarFragment, Garb garb, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToolbarBgColor");
        }
        if ((i7 & 1) != 0) {
            garb = null;
        }
        return baseToolbarFragment.getToolbarBgColor(garb);
    }

    public static /* synthetic */ Integer getToolbarTitleColor$default(BaseToolbarFragment baseToolbarFragment, Garb garb, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToolbarTitleColor");
        }
        if ((i7 & 1) != 0) {
            garb = null;
        }
        return baseToolbarFragment.getToolbarTitleColor(garb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.os.Bundle mProps_delegate$lambda$0(com.bilibili.lib.ui.BaseToolbarFragment r3) {
        /*
            r0 = r3
            android.os.Bundle r0 = r0.getArguments()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            java.lang.String r1 = "blrouter.props"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1e
        L16:
            android.os.Bundle r0 = new android.os.Bundle
            r1 = r0
            r1.<init>()
            r3 = r0
        L1e:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.BaseToolbarFragment.mProps_delegate$lambda$0(com.bilibili.lib.ui.BaseToolbarFragment):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateToolbarMenu$lambda$0$1$0(MenuInfo menuInfo, BaseToolbarFragment baseToolbarFragment, View view) {
        BLRouter.routeTo(RouteRequestKt.toRouteRequest(menuInfo.f64794c), baseToolbarFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(BaseToolbarFragment baseToolbarFragment, View view) {
        FragmentActivity fragmentActivityP3;
        if (baseToolbarFragment.activityDie() || (fragmentActivityP3 = baseToolbarFragment.p3()) == null) {
            return;
        }
        fragmentActivityP3.onBackPressed();
    }

    private final Drawable tintDrawable(Drawable drawable, int i7) {
        return com.bilibili.app.comment3.utils.r.a(i7, drawable);
    }

    private final void tintMenu(TintToolbar tintToolbar, @ColorInt int i7) {
        Menu menu = tintToolbar.getMenu();
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = menu.getItem(i8);
            Drawable icon = item.getIcon();
            if (icon != null) {
                item.setIcon(tintDrawable(icon, i7));
            }
            KeyEvent.Callback actionView = item.getActionView();
            if (actionView == null) {
                tintText(tintToolbar, i7);
            } else if (actionView instanceof InterfaceC2826a) {
                ((InterfaceC2826a) actionView).tint(i7);
            }
        }
    }

    private final void tintText(TintToolbar tintToolbar, int i7) {
        int childCount = tintToolbar.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = tintToolbar.getChildAt(i8);
            if (childAt instanceof ActionMenuView) {
                ActionMenuView actionMenuView = (ActionMenuView) childAt;
                int childCount2 = actionMenuView.getChildCount();
                for (int i9 = 0; i9 < childCount2; i9++) {
                    View childAt2 = actionMenuView.getChildAt(i9);
                    if (childAt2 instanceof ActionMenuItemView) {
                        ((ActionMenuItemView) childAt2).setTextColor(i7);
                    }
                }
            }
        }
    }

    private final void tintToolbarForGarb(Garb garb) {
        TintToolbar tintToolbar = this.mToolbar;
        tintToolbar.setBackgroundColorWithGarb(garb.getSecondaryPageColor());
        int colorById = garb.isPrimaryOnly() ? ThemeUtils.getColorById(getContext(), 2131103914) : garb.getFontColor();
        tintToolbar.setTitleColorWithGarb(colorById);
        tintToolbarIcon(tintToolbar, colorById);
    }

    private final void tintToolbarForPure() {
        TintToolbar tintToolbar = this.mToolbar;
        tintToolbar.setBackgroundResource(2131103971);
        tintToolbar.setTitleTintColorResource(2131103914);
        tintToolbarIcon(tintToolbar, ThemeUtils.getColorById(getContext(), 2131103911));
    }

    private final void tintToolbarIcon(TintToolbar tintToolbar, @ColorInt int i7) {
        tintToolbar.clearCustomValue();
        Drawable navigationIcon = tintToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            tintToolbar.setNavigationIcon(tintDrawable(navigationIcon, i7));
        }
        Drawable overflowIcon = tintToolbar.getOverflowIcon();
        if (overflowIcon != null) {
            tintToolbar.setOverflowIcon(tintDrawable(overflowIcon, i7));
        }
        tintMenu(tintToolbar, i7);
    }

    @NotNull
    public final Bundle getMProps() {
        return (Bundle) this.mProps$delegate.getValue();
    }

    public final boolean getMShowToolbar() {
        return this.mShowToolbar;
    }

    @Nullable
    public final TintToolbar getMToolbar() {
        return this.mToolbar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.bilibili.lib.ui.MenuInfo> getMenuInfo() {
        /*
            r3 = this;
            r0 = r3
            android.os.Bundle r0 = r0.getMProps()
            java.lang.String r1 = "ct.nav.menus"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1e
            r0 = r4
            java.lang.String r1 = "nav.menus"
            java.util.ArrayList r0 = r0.getParcelableArrayList(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1e
            goto L22
        L1e:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r4 = r0
        L22:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.BaseToolbarFragment.getMenuInfo():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer getToolbarBgColor(@org.jetbrains.annotations.Nullable com.bilibili.lib.ui.garb.Garb r4) {
        /*
            r3 = this;
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto La
            com.bilibili.lib.ui.garb.Garb r0 = com.bilibili.lib.ui.garb.GarbManager.getCurGarb()
            r5 = r0
        La:
            r0 = r3
            android.os.Bundle r0 = r0.getMProps()
            java.lang.String r1 = "ct.nav.bgcolor"
            java.lang.String r0 = r0.getString(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L25
            r0 = r3
            r1 = r4
            java.lang.Integer r0 = r0.parseColor(r1)
            r6 = r0
            r0 = r6
            r4 = r0
            r0 = r6
            if (r0 != 0) goto L43
        L25:
            r0 = r5
            boolean r0 = r0.isPure()
            if (r0 != 0) goto L3e
            r0 = r5
            boolean r0 = r0.isPrimaryOnly()
            if (r0 != 0) goto L3e
            r0 = r5
            int r0 = r0.getSecondaryPageColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = r0
        L3b:
            goto L43
        L3e:
            r0 = 0
            r4 = r0
            goto L3b
        L43:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.BaseToolbarFragment.getToolbarBgColor(com.bilibili.lib.ui.garb.Garb):java.lang.Integer");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer getToolbarTitleColor(@org.jetbrains.annotations.Nullable com.bilibili.lib.ui.garb.Garb r4) {
        /*
            r3 = this;
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto La
            com.bilibili.lib.ui.garb.Garb r0 = com.bilibili.lib.ui.garb.GarbManager.getCurGarb()
            r5 = r0
        La:
            r0 = r3
            android.os.Bundle r0 = r0.getMProps()
            java.lang.String r1 = "ct.nav.titlecolor"
            java.lang.String r0 = r0.getString(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L25
            r0 = r3
            r1 = r4
            java.lang.Integer r0 = r0.parseColor(r1)
            r6 = r0
            r0 = r6
            r4 = r0
            r0 = r6
            if (r0 != 0) goto L43
        L25:
            r0 = r5
            boolean r0 = r0.isPure()
            if (r0 != 0) goto L3e
            r0 = r5
            boolean r0 = r0.isPrimaryOnly()
            if (r0 != 0) goto L3e
            r0 = r5
            int r0 = r0.getFontColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = r0
        L3b:
            goto L43
        L3e:
            r0 = 0
            r4 = r0
            goto L3b
        L43:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.BaseToolbarFragment.getToolbarTitleColor(com.bilibili.lib.ui.garb.Garb):java.lang.Integer");
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        TintToolbar tintToolbar = this.mToolbar;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            onCreateToolbarMenu(tintToolbar.getMenu(), fragmentActivityP3.getMenuInflater());
        }
        if (this.mShowToolbar) {
            setToolbarStyle(GarbManager.getCurGarb());
        } else {
            tintToolbar.setVisibility(8);
        }
        GarbWatcher.INSTANCE.subscribe(this);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String string = getMProps().getString(RouteConstKt.PROPS_TOOLBAR_HIDE);
        boolean zAreEqual = true;
        if (string != null) {
            zAreEqual = true ^ Intrinsics.areEqual(string, "1");
        }
        this.mShowToolbar = zAreEqual;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreateToolbarMenu(@org.jetbrains.annotations.NotNull android.view.Menu r8, @org.jetbrains.annotations.NotNull android.view.MenuInflater r9) {
        /*
            r7 = this;
            r0 = r7
            android.content.Context r0 = r0.requireContext()
            r13 = r0
            r0 = r7
            java.util.List r0 = r0.getMenuInfo()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L14:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lbe
            r0 = r11
            java.lang.Object r0 = r0.next()
            com.bilibili.lib.ui.MenuInfo r0 = (com.bilibili.lib.ui.MenuInfo) r0
            r12 = r0
            r0 = r8
            r1 = r12
            java.lang.String r1 = r1.f64793b
            android.view.MenuItem r0 = r0.add(r1)
            r1 = 2
            android.view.MenuItem r0 = r0.setShowAsActionFlags(r1)
            r14 = r0
            r0 = r12
            java.lang.String r0 = r0.f64795d
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L55
            r0 = r7
            r1 = r13
            r2 = r9
            androidx.core.view.a r0 = r0.createActionProvider(r1, r2)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L64
        L55:
            com.bilibili.lib.ui.i$a r0 = new com.bilibili.lib.ui.i$a
            r1 = r0
            r2 = r13
            r3 = r12
            java.lang.String r3 = r3.f64792a
            r1.<init>(r2, r3)
            r9 = r0
        L64:
            r0 = r14
            boolean r0 = r0 instanceof T0.b
            if (r0 == 0) goto L7b
            r0 = r14
            T0.b r0 = (T0.b) r0
            r1 = r9
            T0.b r0 = r0.b(r1)
            goto L85
        L7b:
            java.lang.String r0 = "MenuItemCompat"
            java.lang.String r1 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            int r0 = android.util.Log.w(r0, r1)
        L85:
            r0 = r14
            android.view.View r0 = r0.getActionView()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L14
            r0 = r10
            boolean r0 = r0.hasOnClickListeners()
            if (r0 != 0) goto L14
            r0 = r12
            java.lang.String r0 = r0.f64794c
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L14
            r0 = r9
            int r0 = r0.length()
            if (r0 != 0) goto Lac
            goto L14
        Lac:
            r0 = r10
            Gd.p r1 = new Gd.p
            r2 = r1
            r3 = 2
            r4 = r12
            r5 = r7
            r2.<init>(r3, r4, r5)
            r0.setOnClickListener(r1)
            goto L14
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.BaseToolbarFragment.onCreateToolbarMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        GarbWatcher.INSTANCE.unSubscribe(this);
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public void onSkinChange(@NotNull Garb garb) {
        if (garb.isPure()) {
            tintToolbarForPure();
        } else {
            tintToolbarForGarb(garb);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        TintToolbar tintToolbar = (TintToolbar) view.findViewById(2131304944);
        TintToolbar tintToolbar2 = tintToolbar;
        if (tintToolbar == null) {
            tintToolbar2 = (TintToolbar) P.a(view, TintToolbar.class);
            if (tintToolbar2 == null) {
                throw new IllegalArgumentException("no toolbar in layout");
            }
        }
        this.mToolbar = tintToolbar2;
        tintToolbar2.setContentInsetsAbsolute(0, 0);
        tintToolbar2.setNavigationIcon(2131230780);
        tintToolbar2.setNavigationOnClickListener(new Gd.r(this, 3));
    }

    @Nullable
    public final Integer parseColor(@NotNull String str) {
        Integer numValueOf;
        try {
            numValueOf = Integer.valueOf(Color.parseColor("#" + str));
        } catch (Exception e7) {
            numValueOf = null;
        }
        return numValueOf;
    }

    public final void setMShowToolbar(boolean z6) {
        this.mShowToolbar = z6;
    }

    public final void setMToolbar(@Nullable TintToolbar tintToolbar) {
        this.mToolbar = tintToolbar;
    }

    public final void setTitle(@StringRes int i7) {
        TintToolbar tintToolbar = this.mToolbar;
        if (tintToolbar != null) {
            tintToolbar.setTitle(i7);
        }
    }

    public final void setTitle(@Nullable String str) {
        TintToolbar tintToolbar = this.mToolbar;
        if (tintToolbar != null) {
            if (str == null) {
                str = "";
            }
            tintToolbar.setTitle(str);
        }
    }

    public void setToolbarStyle(@NotNull Garb garb) {
        TintToolbar tintToolbar = this.mToolbar;
        Integer toolbarBgColor = getToolbarBgColor(garb);
        if (toolbarBgColor != null) {
            tintToolbar.setBackgroundColor(toolbarBgColor.intValue());
        }
        Integer toolbarTitleColor = getToolbarTitleColor(garb);
        if (toolbarTitleColor == null) {
            tintMenu(tintToolbar, ThemeUtils.getColorById(getContext(), 2131103911));
        } else {
            tintToolbar.setTitleTextColor(toolbarTitleColor.intValue());
            tintToolbarIcon(tintToolbar, toolbarTitleColor.intValue());
        }
    }
}
