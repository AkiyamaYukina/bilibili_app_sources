package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.playerbizcommonv2.danmaku.view.PlayerPagerSlidingTabStrip;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.jvm.internal.Intrinsics;
import lr0.C7887d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.LifecycleState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.function.danmaku.filter.BaseKeywordItem;
import tv.danmaku.biliplayerv2.widget.function.danmaku.filter.PlayerKeywordsSyncView;
import tv.danmaku.biliplayerv2.widget.function.danmaku.filter.UserKeywordItem;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/e.class */
@StabilityInferred(parameters = 0)
public final class e extends AbsFunctionWidget implements View.OnClickListener, C7887d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f81630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IReporterService f81631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f81632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public EditText f81633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewGroup f81634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public View f81635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public PlayerKeywordsSyncView f81636g;

    @Nullable
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public PlayerPagerSlidingTabStrip f81637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ViewPager f81638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public h f81639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public i f81640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public j f81641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public C7887d f81642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public C7887d f81643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public C7887d f81644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<UserKeywordItem> f81645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public List<UserKeywordItem> f81646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public List<UserKeywordItem> f81647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public tv.danmaku.biliplayerv2.widget.function.danmaku.filter.l f81648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f81649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final d f81650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final b f81651w;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/e$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends PagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<Cr0.f> f81652a = new ArrayList<>();

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(@NotNull ViewGroup viewGroup, int i7, @NotNull Object obj) {
            viewGroup.removeView(this.f81652a.get(i7).getView());
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f81652a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public final CharSequence getPageTitle(int i7) {
            return this.f81652a.get(i7).getTitle();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        public final Object instantiateItem(@NotNull ViewGroup viewGroup, int i7) {
            View view = this.f81652a.get(i7).getView();
            viewGroup.addView(view);
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/e$b.class */
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f81653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f81654b;

        public b(e eVar, Context context) {
            this.f81653a = eVar;
            this.f81654b = context;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            if (charSequence == null || charSequence.length() != 0) {
                View view = this.f81653a.f81635f;
                if (view != null) {
                    view.setBackgroundTintList(ColorStateList.valueOf(ThemeUtils.getColorById(this.f81654b, R$color.Brand_pink)));
                    return;
                }
                return;
            }
            View view2 = this.f81653a.f81635f;
            if (view2 != null) {
                view2.setBackgroundTintList(ColorStateList.valueOf(ThemeUtils.getColorById(this.f81654b, 2131100084)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.playerbizcommonv2.danmaku.widget.d] */
    public e(@NotNull Context context) {
        super(context);
        this.f81650v = new View.OnTouchListener(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.widget.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f81629a;

            {
                this.f81629a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                e eVar = this.f81629a;
                if (motionEvent.getAction() == 1 && !(view instanceof EditText)) {
                    InputMethodManagerHelper.hideSoftInput(eVar.getMContext(), eVar.f81633d, 0);
                }
                return view.performClick();
            }
        };
        this.f81651w = new b(this, context);
    }

    public static final void g(e eVar) {
        IPlayerContainer iPlayerContainer = eVar.f81630a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        IRemoteHandler remoteHandler = iPlayerContainer2.getInteractLayerService().getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.filtersChanged();
        }
    }

    public static final void h(e eVar, String str) {
        eVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        IPlayerContainer iPlayerContainer = eVar.f81630a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        PlayerToast playerToastBuild = iPlayerContainer2.getControlContainerService().getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN ? qb.g.a(33, 17, "extra_title", str).duration(2000L).build() : qb.g.a(32, 17, "extra_title", str).duration(2000L).build();
        IPlayerContainer iPlayerContainer3 = eVar.f81630a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        iPlayerContainer3.getToastService().showToast(playerToastBuild);
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f81630a = playerContainer;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        this.f81631b = playerContainer2.getReporterService();
    }

    @Override // lr0.C7887d.b
    public final void c() {
        InputMethodManagerHelper.hideSoftInput(getMContext(), this.f81633d, 0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, tv.danmaku.biliplayerv2.widget.function.danmaku.filter.l] */
    @NotNull
    public final View createContentView(@NotNull Context context) {
        ViewGroup viewGroup;
        IPlayerContainer iPlayerContainer = this.f81630a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        ViewGroup viewGroup2 = iPlayerContainer2.getControlContainerService().getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN ? (ViewGroup) LayoutInflater.from(context).inflate(2131496614, (ViewGroup) null, false) : (ViewGroup) LayoutInflater.from(context).inflate(2131496616, (ViewGroup) null, false);
        this.f81648t = new Object();
        this.f81645q = new ArrayList();
        this.f81646r = new ArrayList();
        this.f81647s = new ArrayList(2);
        Context context2 = viewGroup2.getContext();
        if (this.f81632c == null) {
            this.f81632c = viewGroup2.findViewById(2131298371);
        }
        if (this.f81633d == null) {
            this.f81633d = (EditText) viewGroup2.findViewById(2131303711);
            PlayerContainer playerContainer = this.f81630a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            int theme = playerContainer2.getPlayerParams().getConfig().getTheme();
            try {
                if (theme == 2) {
                    EditText editText = this.f81633d;
                    if (editText != null) {
                        if (Build.VERSION.SDK_INT <= 28) {
                            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                            declaredField.setAccessible(true);
                            declaredField.set(editText, 2131233561);
                        } else {
                            editText.setTextCursorDrawable(AppCompatResources.getDrawable(editText.getContext(), 2131233561));
                        }
                    }
                } else if (theme != 3) {
                    EditText editText2 = this.f81633d;
                    if (editText2 != null) {
                        if (Build.VERSION.SDK_INT <= 28) {
                            Field declaredField2 = TextView.class.getDeclaredField("mCursorDrawableRes");
                            declaredField2.setAccessible(true);
                            declaredField2.set(editText2, 2131233563);
                        } else {
                            editText2.setTextCursorDrawable(AppCompatResources.getDrawable(editText2.getContext(), 2131233563));
                        }
                    }
                } else {
                    EditText editText3 = this.f81633d;
                    if (editText3 != null) {
                        if (Build.VERSION.SDK_INT <= 28) {
                            Field declaredField3 = TextView.class.getDeclaredField("mCursorDrawableRes");
                            declaredField3.setAccessible(true);
                            declaredField3.set(editText3, 2131233562);
                        } else {
                            editText3.setTextCursorDrawable(AppCompatResources.getDrawable(editText3.getContext(), 2131233562));
                        }
                    }
                }
            } catch (Throwable th) {
            }
        }
        if (this.f81634e == null) {
            this.f81634e = (ViewGroup) viewGroup2.findViewById(2131304780);
        }
        if (this.f81635f == null) {
            this.f81635f = viewGroup2.findViewById(2131298598);
        }
        if (this.f81636g == null) {
            this.f81636g = viewGroup2.findViewById(2131312793);
        }
        if (this.f81637i == null) {
            PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip = (PlayerPagerSlidingTabStrip) viewGroup2.findViewById(2131308542);
            this.f81637i = playerPagerSlidingTabStrip;
            if (playerPagerSlidingTabStrip != null) {
                playerPagerSlidingTabStrip.setIndicatorColor(ThemeUtils.getColorById(context2, 2131102728));
            }
        }
        if (this.f81638j == null) {
            this.f81638j = (ViewPager) viewGroup2.findViewById(2131305458);
        }
        if (this.h == null) {
            this.h = (TextView) viewGroup2.findViewById(2131312832);
        }
        ViewPager viewPager = this.f81638j;
        if (viewPager != null) {
            Context context3 = viewPager.getContext();
            a aVar = new a();
            if (this.f81639k == null) {
                this.f81639k = new h(this, context3);
            }
            if (this.f81640l == null) {
                this.f81640l = new i(this, context3);
            }
            if (this.f81641m == null) {
                this.f81641m = new j(this, context3);
            }
            h hVar = this.f81639k;
            if (hVar != null) {
                aVar.f81652a.add(hVar);
            }
            i iVar = this.f81640l;
            if (iVar != null) {
                aVar.f81652a.add(iVar);
            }
            j jVar = this.f81641m;
            if (jVar != null) {
                aVar.f81652a.add(jVar);
            }
            ViewPager viewPager2 = this.f81638j;
            if (viewPager2 != null) {
                viewPager2.setAdapter(aVar);
            }
            PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip2 = this.f81637i;
            if (playerPagerSlidingTabStrip2 != null) {
                playerPagerSlidingTabStrip2.setViewPager(this.f81638j);
                PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip3 = this.f81637i;
                if (playerPagerSlidingTabStrip3 != null) {
                    playerPagerSlidingTabStrip3.setOnTabClickListener(new k(this));
                }
                PlayerPagerSlidingTabStrip playerPagerSlidingTabStrip4 = this.f81637i;
                if (playerPagerSlidingTabStrip4 != null) {
                    playerPagerSlidingTabStrip4.setOnPageChangeListener(new l(this, aVar));
                }
            }
            aVar.notifyDataSetChanged();
        }
        HandlerThreads.getHandler(2).post(new RunnableC5799c(0, context, this));
        viewGroup2.setOnTouchListener(this.f81650v);
        IPlayerContainer iPlayerContainer3 = this.f81630a;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        if (iPlayerContainer3.getControlContainerService().getScreenModeType() == ScreenModeType.VERTICAL_FULLSCREEN && (viewGroup = this.f81634e) != null) {
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new g(viewGroup.getContext(), this, viewGroup, NewPlayerUtilsKt.toPx(10.0f)));
        }
        return viewGroup2;
    }

    @Override // lr0.C7887d.b
    public final void e(int i7, @NotNull UserKeywordItem userKeywordItem, @NotNull String str) {
        tv.danmaku.biliplayerv2.widget.function.danmaku.filter.l lVar;
        if (i7 < 0) {
            return;
        }
        IReporterService iReporterService = this.f81631b;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReporterService");
            iReporterService2 = null;
        }
        iReporterService2.report(new NeuronsEvents.NormalEvent("player.player.danmaku-filter.delete.player", new String[]{"type", str}));
        Context mContext = getMContext();
        if (BiliAccounts.get(mContext).mid() == -1 || (lVar = this.f81648t) == null) {
            return;
        }
        m mVar = new m(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(userKeywordItem);
        lVar.b(mContext, arrayList, mVar);
    }

    @Nullable
    public final tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(0, 30);
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, false);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerDanmakuKeywordsBlockFunctionWidget";
    }

    public final void i(List<? extends UserKeywordItem> list) {
        List<UserKeywordItem> list2;
        List<UserKeywordItem> list3 = this.f81645q;
        if (list3 != null) {
            ((ArrayList) list3).clear();
        }
        List<UserKeywordItem> list4 = this.f81646r;
        if (list4 != null) {
            ((ArrayList) list4).clear();
        }
        List<UserKeywordItem> list5 = this.f81647s;
        if (list5 != null) {
            ((ArrayList) list5).clear();
        }
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        for (UserKeywordItem userKeywordItem : list) {
            int i7 = ((BaseKeywordItem) userKeywordItem).b;
            if (i7 == 0) {
                List<UserKeywordItem> list6 = this.f81645q;
                if (list6 != null) {
                    ((ArrayList) list6).add(userKeywordItem);
                }
            } else if (1 == i7) {
                List<UserKeywordItem> list7 = this.f81646r;
                if (list7 != null) {
                    ((ArrayList) list7).add(userKeywordItem);
                }
            } else if (2 == i7 && (list2 = this.f81647s) != null) {
                ((ArrayList) list2).add(userKeywordItem);
            }
        }
    }

    public final void k(boolean z6) {
        ViewPager viewPager = this.f81638j;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        if (z6) {
            C7887d c7887d = this.f81642n;
            if (c7887d != null) {
                c7887d.c(this.f81645q);
            }
            C7887d c7887d2 = this.f81643o;
            if (c7887d2 != null) {
                c7887d2.c(this.f81646r);
            }
            C7887d c7887d3 = this.f81644p;
            if (c7887d3 != null) {
                c7887d3.c(this.f81647s);
                return;
            }
            return;
        }
        C7887d c7887d4 = this.f81642n;
        if (c7887d4 != null) {
            C7887d.c cVar = c7887d4.f123348f;
            if (cVar != null) {
                cVar.notifyDataSetChanged();
            }
            c7887d4.b();
        }
        C7887d c7887d5 = this.f81643o;
        if (c7887d5 != null) {
            C7887d.c cVar2 = c7887d5.f123348f;
            if (cVar2 != null) {
                cVar2.notifyDataSetChanged();
            }
            c7887d5.b();
        }
        C7887d c7887d6 = this.f81644p;
        if (c7887d6 != null) {
            C7887d.c cVar3 = c7887d6.f123348f;
            if (cVar3 != null) {
                cVar3.notifyDataSetChanged();
            }
            c7887d6.b();
        }
    }

    public final void l(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        PlayerToast playerToastBuild = qb.g.a(33, 20, "extra_title", str).duration(2000L).build();
        IPlayerContainer iPlayerContainer = this.f81630a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getToastService().showToast(playerToastBuild);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.NotNull android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.e.onClick(android.view.View):void");
    }

    public final void onRelease() {
        this.f81648t = null;
    }

    public final void onWidgetDismiss() {
        Window window;
        super.onWidgetDismiss();
        View view = this.f81635f;
        if (view != null) {
            view.setOnClickListener(null);
        }
        PlayerKeywordsSyncView playerKeywordsSyncView = this.f81636g;
        if (playerKeywordsSyncView != null) {
            playerKeywordsSyncView.setOnClickListener(null);
        }
        View view2 = this.f81632c;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        ViewGroup viewGroup = this.f81634e;
        if (viewGroup != null) {
            viewGroup.setOnApplyWindowInsetsListener(null);
        }
        PlayerContainer playerContainer = this.f81630a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
        if (activityFindActivityOrNull != null && (window = activityFindActivityOrNull.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        IPlayerContainer iPlayerContainer = this.f81630a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        LifecycleState lifecycleState = iPlayerContainer2.getActivityStateService().getLifecycleState();
        if (this.f81649u && lifecycleState == LifecycleState.ACTIVITY_RESUME) {
            IPlayerContainer iPlayerContainer3 = this.f81630a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getPlayerCoreService().resume();
        }
        this.f81649u = false;
    }

    public final void onWidgetShow() {
        Window window;
        super.onWidgetShow();
        PlayerContainer playerContainer = this.f81630a;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(playerContainer2.getContext());
        if (activityFindActivityOrNull != null && (window = activityFindActivityOrNull.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        IPlayerContainer iPlayerContainer = this.f81630a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        if (iPlayerContainer2.getPlayerCoreService().getState() == 4) {
            this.f81649u = true;
            IPlayerContainer iPlayerContainer3 = this.f81630a;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer3 = null;
            }
            iPlayerContainer3.getPlayerCoreService().pause();
        }
        EditText editText = this.f81633d;
        if (editText != null) {
            editText.setText("");
        }
        EditText editText2 = this.f81633d;
        if (editText2 != null) {
            editText2.addTextChangedListener(this.f81651w);
        }
        View view = this.f81635f;
        if (view != null) {
            view.setOnClickListener(this);
        }
        PlayerKeywordsSyncView playerKeywordsSyncView = this.f81636g;
        if (playerKeywordsSyncView != null) {
            playerKeywordsSyncView.setOnClickListener(this);
        }
        View view2 = this.f81632c;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        HandlerThreads.getHandler(2).post(new RunnableC5799c(0, getMContext(), this));
    }
}
