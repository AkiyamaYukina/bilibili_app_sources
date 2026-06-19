package com.bilibili.ogv.misc.roledetail;

import De0.C1566D;
import De0.C1567E;
import De0.P;
import Fc.j;
import Fc.k;
import Fc.p;
import Ny0.h;
import Pb.e;
import Ry.c;
import Wu0.g;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.preferences.fragment.f1;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ogv.misc.roledetail.BangumiRoleDetailActivity;
import com.bilibili.ogv.misc.roledetail.roledetailapi.PersonInfoVo;
import com.bilibili.ogv.misc.roledetail.roledetailapi.PersonRelateContentVo;
import com.bilibili.ogv.misc.roledetail.roledetailapi.RoleDetailVo;
import com.bilibili.ogv.misc.roledetail.roledetailapi.b;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.editor.moudle.musicv3.ui.u;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import vk0.C8820a;
import vk0.C8825f;
import vk0.C8826g;
import vk0.C8827h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/BangumiRoleDetailActivity.class */
@StabilityInferred(parameters = 0)
public final class BangumiRoleDetailActivity extends BaseToolbarActivity implements View.OnClickListener, IPvTracker {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f69206a0 = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public a f69208E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public GridLayoutManager f69210G;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public C8820a f69222S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f69223T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f69225V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f69226W;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f69229Z;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Lazy f69207D = LazyKt.lazy(new h(this, 7));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final RoleDetailVo f69209F = new RoleDetailVo();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final Lazy f69211H = LazyKt.lazy(new e(this, 5));

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final Lazy f69212I = LazyKt.lazy(new j(this, 6));

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final Lazy f69213J = LazyKt.lazy(new k(this, 9));

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final Lazy f69214K = LazyKt.lazy(new c21.h(this, 7));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final Lazy f69215L = LazyKt.lazy(new P(this, 6));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final Lazy f69216M = LazyKt.lazy(new p(this, 6));

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final Lazy f69217N = LazyKt.lazy(new Pb.j(this, 4));

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final Lazy f69218O = LazyKt.lazy(new g(this, 3));

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final Lazy f69219P = LazyKt.lazy(new c(this, 6));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final Lazy f69220Q = LazyKt.lazy(new C1566D(this, 9));

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final Lazy f69221R = LazyKt.lazy(new C1567E(this, 6));

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f69224U = 1;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final int f69227X = 21;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f69228Y = 1;

    public static void Q6(BangumiRoleDetailActivity bangumiRoleDetailActivity, int i7) {
        if (bangumiRoleDetailActivity.S6() == null && bangumiRoleDetailActivity.getToolbar() == null) {
            return;
        }
        if (bangumiRoleDetailActivity.S6().getHeight() + i7 <= (((double) bangumiRoleDetailActivity.mToolbar.getHeight()) * 1.2d) + ((double) StatusBarCompat.getStatusBarHeight(bangumiRoleDetailActivity))) {
            ((TextView) bangumiRoleDetailActivity.f69214K.getValue()).setVisibility(0);
            if (MultipleThemeUtils.isWhiteTheme(bangumiRoleDetailActivity)) {
                bangumiRoleDetailActivity.T6().setImageDrawable(AppCompatResources.getDrawable(bangumiRoleDetailActivity, 2131244155));
                StatusBarCompat.setStatusBarDarkMode(bangumiRoleDetailActivity);
                return;
            } else {
                bangumiRoleDetailActivity.T6().setImageDrawable(AppCompatResources.getDrawable(bangumiRoleDetailActivity, 2131244156));
                StatusBarCompat.setStatusBarLightMode(bangumiRoleDetailActivity);
                return;
            }
        }
        ((TextView) bangumiRoleDetailActivity.f69214K.getValue()).setVisibility(8);
        if (bangumiRoleDetailActivity.f69229Z) {
            bangumiRoleDetailActivity.T6().setImageDrawable(AppCompatResources.getDrawable(bangumiRoleDetailActivity, 2131244156));
            StatusBarCompat.setStatusBarLightMode(bangumiRoleDetailActivity);
        } else {
            bangumiRoleDetailActivity.T6().setImageDrawable(AppCompatResources.getDrawable(bangumiRoleDetailActivity, 2131244155));
            StatusBarCompat.setStatusBarDarkMode(bangumiRoleDetailActivity);
        }
    }

    public final AppBarLayout R6() {
        return (AppBarLayout) this.f69212I.getValue();
    }

    public final CollapsingToolbarLayout S6() {
        return (CollapsingToolbarLayout) this.f69213J.getValue();
    }

    public final ImageView T6() {
        return (ImageView) this.f69211H.getValue();
    }

    public final LoadingImageView U6() {
        return (LoadingImageView) this.f69221R.getValue();
    }

    public final void V6() {
        if (U6() != null) {
            LoadingImageView loadingImageViewU6 = U6();
            if (loadingImageViewU6 != null) {
                loadingImageViewU6.setRefreshComplete();
            }
            LoadingImageView loadingImageViewU62 = U6();
            if (loadingImageViewU62 != null) {
                loadingImageViewU62.setVisibility(8);
            }
        }
    }

    public final void X6(final boolean z6) {
        List<PersonRelateContentVo.Season> list;
        if (this.f69225V || this.f69226W) {
            return;
        }
        this.f69225V = true;
        if (z6) {
            this.f69224U++;
            a aVar = this.f69208E;
            if (aVar != null) {
                aVar.showFooterLoading();
            }
        } else {
            a aVar2 = this.f69208E;
            if (aVar2 != null) {
                RoleDetailVo roleDetailVo = aVar2.f69251g;
                if (roleDetailVo.getPersonRelateContentVo() != null) {
                    PersonRelateContentVo personRelateContentVo = roleDetailVo.getPersonRelateContentVo();
                    if ((personRelateContentVo != null ? personRelateContentVo.f69280f : null) != null) {
                        PersonRelateContentVo personRelateContentVo2 = roleDetailVo.getPersonRelateContentVo();
                        if (personRelateContentVo2 != null && (list = personRelateContentVo2.f69280f) != null) {
                            list.clear();
                        }
                        aVar2.hideLoadMore();
                    }
                }
            }
            this.f69224U = 1;
        }
        com.bilibili.ogv.misc.roledetail.roledetailapi.a aVar3 = b.f69290a;
        Single singleB = b.b(this.f69223T, this.f69228Y, this.f69224U, this.f69227X);
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(singleB.subscribe(new Consumer(this, z6) { // from class: vk0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiRoleDetailActivity f128272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f128273b;

            {
                this.f128272a = this;
                this.f128273b = z6;
            }

            public final void accept(Object obj) {
                List<PersonRelateContentVo.Season> list2;
                int size;
                PersonRelateContentVo personRelateContentVo3 = (PersonRelateContentVo) obj;
                BangumiRoleDetailActivity bangumiRoleDetailActivity = this.f128272a;
                bangumiRoleDetailActivity.f69225V = false;
                List<PersonRelateContentVo.Season> list3 = personRelateContentVo3.f69280f;
                boolean z7 = this.f128273b;
                if (list3 == null || list3.isEmpty()) {
                    bangumiRoleDetailActivity.f69226W = true;
                    if (!z7) {
                        bangumiRoleDetailActivity.Y6(0);
                        com.bilibili.ogv.misc.roledetail.a aVar4 = bangumiRoleDetailActivity.f69208E;
                        if (aVar4 != null) {
                            aVar4.hideLoadMore();
                            return;
                        }
                        return;
                    }
                    bangumiRoleDetailActivity.Y6(3);
                    bangumiRoleDetailActivity.V6();
                    com.bilibili.ogv.misc.roledetail.a aVar5 = bangumiRoleDetailActivity.f69208E;
                    if (aVar5 != null) {
                        aVar5.showFooterEmpty();
                        return;
                    }
                    return;
                }
                if (z7) {
                    PersonRelateContentVo personRelateContentVo4 = bangumiRoleDetailActivity.f69209F.getPersonRelateContentVo();
                    if (personRelateContentVo4 != null && (list2 = personRelateContentVo4.f69280f) != null) {
                        list2.addAll(personRelateContentVo3.f69280f);
                    }
                } else {
                    bangumiRoleDetailActivity.f69209F.setPersonRelateContentVo(personRelateContentVo3);
                }
                com.bilibili.ogv.misc.roledetail.a aVar6 = bangumiRoleDetailActivity.f69208E;
                if (aVar6 != null) {
                    aVar6.notifySectionData();
                }
                if (!z7) {
                    com.bilibili.ogv.misc.roledetail.a aVar7 = bangumiRoleDetailActivity.f69208E;
                    boolean z8 = false;
                    if (aVar7 != null) {
                        RoleDetailVo roleDetailVo2 = aVar7.f69251g;
                        PersonRelateContentVo personRelateContentVo5 = roleDetailVo2.getPersonRelateContentVo();
                        if ((personRelateContentVo5 != null ? personRelateContentVo5.f69280f : null) != null) {
                            PersonRelateContentVo personRelateContentVo6 = roleDetailVo2.getPersonRelateContentVo();
                            List<PersonRelateContentVo.Season> list4 = null;
                            if (personRelateContentVo6 != null) {
                                list4 = personRelateContentVo6.f69280f;
                            }
                            size = list4.size();
                        } else {
                            size = 0;
                        }
                        z8 = false;
                        if (size == 0) {
                            z8 = true;
                        }
                    }
                    if (z8) {
                        com.bilibili.ogv.misc.roledetail.a aVar8 = bangumiRoleDetailActivity.f69208E;
                        if (aVar8 != null) {
                            aVar8.hideLoadMore();
                            return;
                        }
                        return;
                    }
                }
                bangumiRoleDetailActivity.V6();
            }
        }, new Consumer(this, z6) { // from class: vk0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiRoleDetailActivity f128274a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f128275b;

            {
                this.f128274a = this;
                this.f128275b = z6;
            }

            public final void accept(Object obj) {
                BangumiRoleDetailActivity bangumiRoleDetailActivity = this.f128274a;
                bangumiRoleDetailActivity.f69225V = false;
                bangumiRoleDetailActivity.Y6(0);
                if (this.f128275b) {
                    bangumiRoleDetailActivity.f69224U--;
                    com.bilibili.ogv.misc.roledetail.a aVar4 = bangumiRoleDetailActivity.f69208E;
                    if (aVar4 != null) {
                        aVar4.showLoadMoreError();
                    }
                }
            }
        }), getLifecycle());
    }

    public final void Y6(int i7) {
        AppBarLayout.LayoutParams layoutParams = S6().getLayoutParams();
        layoutParams.setScrollFlags(i7);
        S6().setLayoutParams(layoutParams);
    }

    public final void a7() {
        if (U6() != null) {
            LoadingImageView loadingImageViewU6 = U6();
            if (loadingImageViewU6 != null) {
                loadingImageViewU6.setVisibility(0);
            }
            LoadingImageView loadingImageViewU62 = U6();
            if (loadingImageViewU62 != null) {
                loadingImageViewU62.setRefreshError();
            }
        }
        if (R6() == null || ((RelativeLayout) this.f69220Q.getValue()) == null) {
            return;
        }
        R6().setVisibility(8);
        ((RelativeLayout) this.f69220Q.getValue()).setVisibility(8);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.character-details.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131302849) {
            getOnBackPressedDispatcher().onBackPressed();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131304944) {
            ((RecyclerView) this.f69207D.getValue()).scrollToPosition(0);
            if (R6() != null) {
                R6().post(new u(this, 2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, tv.danmaku.bili.widget.section.adapter.BaseAdapter$HandleClickListener] */
    /* JADX WARN: Type inference failed for: r1v6, types: [vk0.a] */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        Long longOrNull;
        super.onCreate(bundle);
        setContentView(2131502277);
        Intent intent = getIntent();
        this.f69223T = (intent == null || (stringExtra = intent.getStringExtra("role_id")) == null || (longOrNull = StringsKt.toLongOrNull(stringExtra)) == null) ? 0L : longOrNull.longValue();
        ensureToolbar();
        this.mToolbar.getBackground().mutate().setAlpha(0);
        T6().setOnClickListener(this);
        getToolbar().setOnClickListener(this);
        this.f69222S = new AppBarLayout.OnOffsetChangedListener(this) { // from class: vk0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiRoleDetailActivity f128270a;

            {
                this.f128270a = this;
            }

            public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                BangumiRoleDetailActivity.Q6(this.f128270a, i7);
            }
        };
        R6().addOnOffsetChangedListener(this.f69222S);
        this.f69208E = new a(this, this.f69209F);
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 3, 1, false);
        this.f69210G = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new C8825f(this));
        int iB = Uj0.c.b(8, this);
        int iB2 = Uj0.c.b(12, this);
        RecyclerView recyclerView = (RecyclerView) this.f69207D.getValue();
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C8826g(iB2, iB));
        }
        RecyclerView recyclerView2 = (RecyclerView) this.f69207D.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(this.f69210G);
        }
        ((RecyclerView) this.f69207D.getValue()).setAdapter(this.f69208E);
        RecyclerView recyclerView3 = (RecyclerView) this.f69207D.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new C8827h(this));
        }
        a aVar = this.f69208E;
        if (aVar != null) {
            aVar.setHandleClickListener((BaseAdapter.HandleClickListener) new Object());
        }
        a aVar2 = this.f69208E;
        if (aVar2 != null) {
            aVar2.f69252i = new to.c(this);
        }
        if (U6() != null) {
            LoadingImageView loadingImageViewU6 = U6();
            if (loadingImageViewU6 != null) {
                loadingImageViewU6.setVisibility(0);
            }
            LoadingImageView loadingImageViewU62 = U6();
            if (loadingImageViewU62 != null) {
                loadingImageViewU62.setRefreshing();
            }
        }
        com.bilibili.ogv.misc.roledetail.roledetailapi.a aVar3 = b.f69290a;
        Single singleA = b.a(this.f69223T);
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(singleA.subscribe(new Consumer(this) { // from class: vk0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiRoleDetailActivity f128271a;

            {
                this.f128271a = this;
            }

            public final void accept(Object obj) {
                PersonInfoVo personInfoVo = (PersonInfoVo) obj;
                int i7 = BangumiRoleDetailActivity.f69206a0;
                BangumiRoleDetailActivity bangumiRoleDetailActivity = this.f128271a;
                if (personInfoVo == null) {
                    bangumiRoleDetailActivity.a7();
                    return;
                }
                bangumiRoleDetailActivity.getClass();
                Nl0.f.d((BiliImageView) bangumiRoleDetailActivity.f69215L.getValue(), personInfoVo.f69264a);
                String strA = personInfoVo.a();
                if (strA == null || strA.length() == 0) {
                    bangumiRoleDetailActivity.f69229Z = false;
                    ((BiliImageView) bangumiRoleDetailActivity.f69218O.getValue()).setVisibility(8);
                    ((BiliImageView) bangumiRoleDetailActivity.f69215L.getValue()).setBackground((Drawable) null);
                    ((BiliImageView) bangumiRoleDetailActivity.f69215L.getValue()).setPadding(0, 0, 0, 0);
                    bangumiRoleDetailActivity.T6().setImageDrawable(AppCompatResources.getDrawable(bangumiRoleDetailActivity, 2131244155));
                } else {
                    bangumiRoleDetailActivity.f69229Z = true;
                    ((BiliImageView) bangumiRoleDetailActivity.f69218O.getValue()).setVisibility(0);
                    ((TextView) bangumiRoleDetailActivity.f69216M.getValue()).setTextColor(ContextCompat.getColor(bangumiRoleDetailActivity, R$color.Wh0_u));
                    ((TextView) bangumiRoleDetailActivity.f69217N.getValue()).setTextColor(ContextCompat.getColor(bangumiRoleDetailActivity, R$color.Wh0_u));
                    bangumiRoleDetailActivity.T6().setImageDrawable(AppCompatResources.getDrawable(bangumiRoleDetailActivity, 2131244156));
                    StatusBarCompat.setStatusBarLightMode(bangumiRoleDetailActivity);
                    ((BiliImageView) bangumiRoleDetailActivity.f69215L.getValue()).setBackground(AppCompatResources.getDrawable(bangumiRoleDetailActivity, 2131231249));
                    ((BiliImageView) bangumiRoleDetailActivity.f69215L.getValue()).setPadding(2, 2, 2, 2);
                    Nl0.f.d((BiliImageView) bangumiRoleDetailActivity.f69218O.getValue(), personInfoVo.a());
                }
                ((TextView) bangumiRoleDetailActivity.f69214K.getValue()).setText(personInfoVo.f69268e);
                ((TextView) bangumiRoleDetailActivity.f69216M.getValue()).setText(personInfoVo.f69268e);
                ((TextView) bangumiRoleDetailActivity.f69217N.getValue()).setVisibility(0);
                ((TextView) bangumiRoleDetailActivity.f69217N.getValue()).setText(personInfoVo.b());
                bangumiRoleDetailActivity.f69209F.setPersonInfoVo(personInfoVo);
                com.bilibili.ogv.misc.roledetail.a aVar4 = bangumiRoleDetailActivity.f69208E;
                if (aVar4 != null) {
                    aVar4.notifySectionData();
                }
                bangumiRoleDetailActivity.V6();
                bangumiRoleDetailActivity.f69226W = false;
                bangumiRoleDetailActivity.X6(false);
            }
        }, new f1(this, 3)), getLifecycle());
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        if (R6() != null && this.f69222S != null) {
            R6().removeOnOffsetChangedListener(this.f69222S);
        }
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void tintSystemBar() {
        Window window = getWindow();
        window.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        int colorById = ThemeUtils.getColorById(this, 2131103971);
        ((CoordinatorLayout) this.f69219P.getValue()).setStatusBarBackgroundColor(0);
        S6().setStatusBarScrimColor(colorById);
        S6().setContentScrimColor(colorById);
        if (MultipleThemeUtils.isWhiteTheme(this)) {
            StatusBarCompat.setStatusBarDarkMode(this);
        } else {
            StatusBarCompat.setStatusBarLightMode(this);
        }
        StatusBarCompat.setHeightAndPadding(this, getToolbar());
    }
}
