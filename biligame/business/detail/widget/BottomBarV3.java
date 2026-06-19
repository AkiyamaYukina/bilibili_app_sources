package com.bilibili.biligame.business.detail.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.biligame.api.BiligameHotGame;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.api.cloudgame.bean.MicroGameInfo;
import com.bilibili.biligame.business.detail.widget.BottomBarV3;
import com.bilibili.biligame.mod.ImageModLoader;
import com.bilibili.biligame.report.ReportExtra;
import com.bilibili.biligame.report.ReportHelper;
import com.bilibili.biligame.report3.ReportParams;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.ui.book.BookCallback;
import com.bilibili.biligame.ui.gamedetail.GameDetailCallback;
import com.bilibili.biligame.ui.gamedetail.widget.GameBookIcon;
import com.bilibili.biligame.ui.gamedetail.widget.GameFollowIcon;
import com.bilibili.biligame.utils.CatchUtils;
import com.bilibili.biligame.utils.GameActionUtilsKt;
import com.bilibili.biligame.utils.OnSafeClickListener;
import com.bilibili.biligame.widget.action.GameActionBase;
import com.bilibili.biligame.widget.action.GameActionBtn;
import com.bilibili.biligame.widget.action.GameDownloadBtn;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/BottomBarV3.class */
@StabilityInferred(parameters = 0)
public final class BottomBarV3 extends ConstraintLayout implements BookCallback, DefaultLifecycleObserver, GameActionBtn.ActionListener {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f62593H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public ReportExtra f62594A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public ReportExtra f62595B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public GameDetailCallback f62596C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final uo.b f62597D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final d f62598E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public Map<String, String> f62599F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final ArrayMap<String, Boolean> f62600G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ImageView f62601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ImageView f62602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final GameBookIcon f62603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f62604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final FrameLayout f62605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f62606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final GameFollowIcon f62607g;

    @NotNull
    public final GameActionBtn h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final FrameLayout f62608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final GameDownloadBtn f62609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public GameDetailInfo f62610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public MicroGameInfo f62611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public List<Integer> f62612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Rect f62613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Rect f62614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Drawable f62615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f62616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f62617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public ValueAnimator f62618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final Drawable f62619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public String f62620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public String f62621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f62622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f62623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f62624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public String f62625z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/BottomBarV3$a.class */
    public final class a implements GameActionBtn.OnActionStatusChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomBarV3 f62626a;

        public a(BottomBarV3 bottomBarV3) {
            this.f62626a = bottomBarV3;
        }

        public final void onStatusChanged(int i7) {
            boolean z6 = i7 == 14 || i7 == 1 || i7 == 8;
            BottomBarV3 bottomBarV3 = this.f62626a;
            bottomBarV3.setMLightEnable(z6);
            d dVar = bottomBarV3.f62598E;
            boolean z7 = false;
            if (i7 == 3) {
                z7 = true;
            }
            if (dVar.f127905c == z7) {
                return;
            }
            dVar.f127905c = z7;
            GameDetailInfo gameDetailInfo = dVar.f127910i;
            if (gameDetailInfo == null) {
                return;
            }
            if (!z7 || !gameDetailInfo.showForum) {
                dVar.f127909g.removeCallbacks(dVar.f127907e);
            } else {
                dVar.h = ((long) gameDetailInfo.downloadWaitTime) * 1000;
                dVar.b();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/BottomBarV3$b.class */
    public final class b implements GameActionBase.GameActionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomBarV3 f62627a;

        public b(BottomBarV3 bottomBarV3) {
            this.f62627a = bottomBarV3;
        }

        public final boolean onAction(BiligameHotGame biligameHotGame, int i7) {
            BottomBarV3 bottomBarV3 = this.f62627a;
            ReportHelper module = ReportHelper.getHelperInstance(bottomBarV3.getContext()).setGadata("1100122").setModule("track-function");
            GameDetailInfo gameDetailInfo = bottomBarV3.f62610k;
            ReportHelper value = module.setValue(gameDetailInfo != null ? String.valueOf(gameDetailInfo.gameBaseId) : null);
            ReportExtra reportExtra = bottomBarV3.getReportExtra();
            ReportExtra reportExtraCopy = null;
            if (reportExtra != null) {
                reportExtraCopy = reportExtra.copy();
            }
            value.setExtra(reportExtraCopy).clickReport();
            return false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/BottomBarV3$c.class */
    public final class c extends OnSafeClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BottomBarV3 f62628c;

        public c(BottomBarV3 bottomBarV3) {
            this.f62628c = bottomBarV3;
        }

        public final void onSafeClick(View view) {
            super.onSafeClick(view);
            if (this.f62628c.f62610k == null) {
                return;
            }
            Object tag = view.getTag();
            if (tag instanceof Integer) {
                BottomBarV3 bottomBarV3 = this.f62628c;
                int iIntValue = ((Number) tag).intValue();
                bottomBarV3.getClass();
                try {
                    if (bottomBarV3.f62610k == null) {
                        return;
                    }
                    Context applicationContext = bottomBarV3.getContext().getApplicationContext();
                    GameDetailInfo gameDetailInfo = bottomBarV3.f62610k;
                    if (gameDetailInfo != null) {
                        int i7 = gameDetailInfo.gameBaseId;
                        if (iIntValue == 0) {
                            ReportParams reportParamsCreateWithGameBaseId = ReportParams.Companion.createWithGameBaseId(String.valueOf(i7));
                            ReportExtra reportExtra = bottomBarV3.f62594A;
                            ReporterV3.reportClick("game-detail-page", "basic-function", "bottom-share-button", reportParamsCreateWithGameBaseId.put(reportExtra != null ? reportExtra.build() : null).build());
                            GameDetailCallback gameDetailCallback = bottomBarV3.f62596C;
                            if (gameDetailCallback != null) {
                                gameDetailCallback.onShare();
                                return;
                            }
                            return;
                        }
                        if (iIntValue != 1) {
                            if (iIntValue == 5) {
                                ReportParams reportParamsPut = new ReportParams().put(bottomBarV3.f62599F);
                                ReportExtra reportExtra2 = bottomBarV3.f62594A;
                                ReporterV3.reportClick("game-detail-page", "basic-function", "function-button", reportParamsPut.put(reportExtra2 != null ? reportExtra2.build() : null).build());
                                Context context = bottomBarV3.getContext();
                                GameDetailInfo gameDetailInfo2 = bottomBarV3.f62610k;
                                BiligameRouterHelper.openUrl(context, gameDetailInfo2 != null ? gameDetailInfo2.h5GameLink : null);
                                return;
                            }
                            if (iIntValue != 13) {
                                switch (iIntValue) {
                                    case 7:
                                        if (!TextUtils.isEmpty(gameDetailInfo.wikiLink)) {
                                            ReportHelper module = ReportHelper.getHelperInstance(applicationContext).setGadata("1100111").setModule("track-function");
                                            GameDetailInfo gameDetailInfo3 = bottomBarV3.f62610k;
                                            ReportHelper value = module.setValue(gameDetailInfo3 != null ? gameDetailInfo3.gameBaseId : 0);
                                            ReportExtra reportExtra3 = bottomBarV3.f62594A;
                                            value.setExtra(reportExtra3 != null ? reportExtra3.copy() : null).clickReport();
                                            ReportParams.Companion companion = ReportParams.Companion;
                                            GameDetailInfo gameDetailInfo4 = bottomBarV3.f62610k;
                                            ReportParams reportParamsCreateWithGameBaseId2 = companion.createWithGameBaseId(gameDetailInfo4 != null ? String.valueOf(gameDetailInfo4.gameBaseId) : null);
                                            ReportExtra reportExtra4 = bottomBarV3.f62594A;
                                            ReporterV3.reportClick("game-detail-page", "basic-function", "bottom-wiki-button", reportParamsCreateWithGameBaseId2.put(reportExtra4 != null ? reportExtra4.build() : null).build());
                                            BiligameRouterHelper.openWikiLink(bottomBarV3.getContext(), bottomBarV3.f62610k);
                                        }
                                        break;
                                    case 8:
                                        ReportHelper value2 = ReportHelper.getHelperInstance(applicationContext).setGadata("1100113").setModule("track-function").setValue(String.valueOf(i7));
                                        ReportExtra reportExtra5 = bottomBarV3.f62594A;
                                        value2.setExtra(reportExtra5 != null ? reportExtra5.copy() : null).clickReport();
                                        ReportParams reportParamsPut2 = new ReportParams().put(bottomBarV3.f62599F);
                                        ReportExtra reportExtra6 = bottomBarV3.f62594A;
                                        ReporterV3.reportClick("game-detail-page", "basic-function", "function-button", reportParamsPut2.put(reportExtra6 != null ? reportExtra6.build() : null).build());
                                        Context context2 = bottomBarV3.getContext();
                                        GameDetailInfo gameDetailInfo5 = bottomBarV3.f62610k;
                                        BiligameRouterHelper.openUrl(context2, gameDetailInfo5 != null ? gameDetailInfo5.steamLink : null);
                                        break;
                                    case 9:
                                        ReportHelper value3 = ReportHelper.getHelperInstance(bottomBarV3.getContext()).setGadata("1100117").setModule("track-function").setValue(String.valueOf(i7));
                                        ReportExtra reportExtra7 = bottomBarV3.f62595B;
                                        value3.setExtra(reportExtra7 != null ? reportExtra7.copy() : null).clickReport();
                                        ReportParams.Companion companion2 = ReportParams.Companion;
                                        GameDetailInfo gameDetailInfo6 = bottomBarV3.f62610k;
                                        ReportParams reportParamsCreateWithGameBaseId3 = companion2.createWithGameBaseId(gameDetailInfo6 != null ? String.valueOf(gameDetailInfo6.gameBaseId) : null);
                                        ReportExtra reportExtra8 = bottomBarV3.f62594A;
                                        ReporterV3.reportClick("game-detail-page", "basic-function", "cloud-trial-button", reportParamsCreateWithGameBaseId3.put(reportExtra8 != null ? reportExtra8.build() : null).build());
                                        GameDetailCallback gameDetailCallback2 = bottomBarV3.f62596C;
                                        if (gameDetailCallback2 != null) {
                                            gameDetailCallback2.onPlayCloudGame();
                                        }
                                        break;
                                    case 10:
                                        ReportParams reportParamsPut3 = new ReportParams().put(bottomBarV3.f62599F);
                                        ReportExtra reportExtra9 = bottomBarV3.f62594A;
                                        ReporterV3.reportClick("game-detail-page", "basic-function", "function-button", reportParamsPut3.put(reportExtra9 != null ? reportExtra9.build() : null).build());
                                        Context context3 = bottomBarV3.getContext();
                                        GameDetailInfo gameDetailInfo7 = bottomBarV3.f62610k;
                                        BiligameRouterHelper.openSmallGame(context3, i7, gameDetailInfo7 != null ? gameDetailInfo7.smallGameLink : null, 66025);
                                        break;
                                }
                                return;
                            }
                        }
                        ReportHelper value4 = ReportHelper.getHelperInstance(applicationContext).setGadata("1100502").setModule("track-function").setValue(String.valueOf(i7));
                        ReportExtra reportExtra10 = bottomBarV3.f62594A;
                        value4.setExtra(reportExtra10 != null ? reportExtra10.copy() : null).clickReport();
                        if (iIntValue == 1) {
                            ReportParams.Companion companion3 = ReportParams.Companion;
                            GameDetailInfo gameDetailInfo8 = bottomBarV3.f62610k;
                            ReportParams reportParamsCreateWithGameBaseId4 = companion3.createWithGameBaseId(gameDetailInfo8 != null ? String.valueOf(gameDetailInfo8.gameBaseId) : null);
                            ReportExtra reportExtra11 = bottomBarV3.f62594A;
                            ReporterV3.reportClick("game-detail-page", "basic-function", "comment-button", reportParamsCreateWithGameBaseId4.put(reportExtra11 != null ? reportExtra11.build() : null).build());
                        } else {
                            ReportParams reportParamsPut4 = new ReportParams().put(bottomBarV3.f62599F);
                            ReportExtra reportExtra12 = bottomBarV3.f62594A;
                            ReporterV3.reportClick("game-detail-page", "basic-function", "function-button", reportParamsPut4.put(reportExtra12 != null ? reportExtra12.build() : null).build());
                        }
                        GameDetailCallback gameDetailCallback3 = bottomBarV3.f62596C;
                        if (gameDetailCallback3 != null) {
                            gameDetailCallback3.onComment("", 0, "底部栏评价icon");
                        }
                    }
                } catch (Throwable th) {
                    CatchUtils.e("GameDetailActivityV3", "onAction", th);
                }
            }
        }
    }

    @JvmOverloads
    public BottomBarV3(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f62612m = CollectionsKt.emptyList();
        Rect rect = new Rect();
        this.f62613n = rect;
        this.f62614o = new Rect();
        OnSafeClickListener cVar = new c(this);
        this.f62623x = true;
        LifecycleOwner lifecycleOwner = BiliCallLifeCycleObserverKt.getLifecycleOwner(context);
        this.f62597D = new uo.b(context, lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null);
        float f7 = d.f127902n;
        LifecycleOwner lifecycleOwner2 = BiliCallLifeCycleObserverKt.getLifecycleOwner(context);
        this.f62598E = new d(context, lifecycleOwner2 != null ? lifecycleOwner2.getLifecycle() : null);
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup.inflate(context, 2131496773, this);
        this.f62605e = (FrameLayout) findViewById(2131304870);
        TextView textView = (TextView) findViewById(2131314113);
        this.f62606f = textView;
        GameActionBtn gameActionBtnFindViewById = findViewById(2131297719);
        this.h = gameActionBtnFindViewById;
        gameActionBtnFindViewById.setActionStatusChangedListener(new a(this));
        gameActionBtnFindViewById.setActionListener(this);
        gameActionBtnFindViewById.setBookCallback(this);
        gameActionBtnFindViewById.setReportPage("detailTag").setReportModule("track-function").setReportPagev3("game-detail-page").setReportModuleV3("basic-function").setReportPositionV3("function-button");
        GameFollowIcon gameFollowIconFindViewById = findViewById(2131314112);
        this.f62607g = gameFollowIconFindViewById;
        gameFollowIconFindViewById.setCanUnfollow(true).setUnfollowModule("track-detail-unfollow").setReportPage("detailTag").setReportModule("track-detail-follow").setReportPagev3("game-detail-page").setReportModuleV3("basic-function").setReportPositionV3("follow-button");
        gameFollowIconFindViewById.setGameActionCallback(new b(this));
        ImageView imageView = (ImageView) findViewById(2131314115);
        this.f62601a = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131314111);
        this.f62602b = imageView2;
        GameBookIcon gameBookIconFindViewById = findViewById(2131314109);
        this.f62603c = gameBookIconFindViewById;
        gameBookIconFindViewById.setReportPage("detailTag").setReportModule("track-function");
        gameBookIconFindViewById.setBookCallback(this);
        this.f62608i = (FrameLayout) findViewById(2131304810);
        TextView textView2 = (TextView) findViewById(2131314110);
        this.f62604d = textView2;
        GameDownloadBtn gameDownloadBtnFindViewById = findViewById(2131298029);
        this.f62609j = gameDownloadBtnFindViewById;
        GameDownloadBtn.setButtonStyle$default(gameDownloadBtnFindViewById, true, 0.0f, 2, (Object) null);
        textView2.setOnClickListener(cVar);
        textView.setOnClickListener(cVar);
        imageView.setOnClickListener(cVar);
        imageView2.setOnClickListener(cVar);
        this.f62619t = ContextCompat.getDrawable(getContext(), 2131232325);
        Drawable drawableLoadImageDrawable = ImageModLoader.Companion.loadImageDrawable("biligame_button_light.png");
        Drawable drawable = null;
        if (drawableLoadImageDrawable != null) {
            rect.set(0, 0, drawableLoadImageDrawable.getIntrinsicWidth(), drawableLoadImageDrawable.getIntrinsicHeight());
            drawable = drawableLoadImageDrawable;
        }
        this.f62615p = drawable;
        this.f62600G = new ArrayMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMLightEnable(boolean z6) {
        if (this.f62622w == z6 || MultipleThemeUtils.isNightTheme(getContext())) {
            return;
        }
        this.f62622w = z6;
        if (!z6 || this.f62618s != null) {
            stop();
            return;
        }
        m0(getWidth());
        ValueAnimator valueAnimator = this.f62618s;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.view.View
    public final void draw(@NotNull Canvas canvas) {
        super.draw(canvas);
        if (this.f62622w && this.f62605e.isShown() && this.f62615p != null) {
            int left = this.f62605e.getLeft();
            int right = this.f62605e.getRight();
            int height = getHeight();
            if (right - left <= 0 || height <= 0) {
                return;
            }
            canvas.save();
            this.f62614o.set(left, 0, right, height);
            canvas.clipRect(this.f62614o);
            Rect rect = this.f62613n;
            rect.offsetTo((this.f62616q + left) - rect.width(), this.f62617r);
            Drawable drawable = this.f62615p;
            if (drawable != null) {
                drawable.setBounds(this.f62613n);
            }
            Drawable drawable2 = this.f62615p;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            canvas.restore();
        }
    }

    @NotNull
    public final List<Integer> getActionList() {
        return this.f62612m;
    }

    @Nullable
    public final GameDetailCallback getGameDetailCallback() {
        return this.f62596C;
    }

    public final boolean getPrivateRecruit() {
        return this.f62624y;
    }

    @Nullable
    public final ReportExtra getReportExtra() {
        return this.f62594A;
    }

    @Nullable
    public final String getSourceAd() {
        return this.f62625z;
    }

    public final int getStatus() {
        return this.h.getStatus();
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x037d A[PHI: r15
  0x037d: PHI (r15v11 boolean) = 
  (r15v1 boolean)
  (r15v2 boolean)
  (r15v3 boolean)
  (r15v4 boolean)
  (r15v5 boolean)
  (r15v6 boolean)
  (r15v7 boolean)
  (r15v8 boolean)
  (r15v9 boolean)
  (r15v12 boolean)
 binds: [B:108:0x0574, B:100:0x04fc, B:96:0x04e8, B:98:0x04f2, B:69:0x03a7, B:68:0x0385, B:66:0x037b, B:58:0x02df, B:53:0x028d, B:52:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(boolean r13) {
        /*
            Method dump skipped, instruction units count: 2418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.detail.widget.BottomBarV3.k0(boolean):void");
    }

    public final void l0() {
        this.f62608i.setVisibility(8);
        int childCount = this.f62608i.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            this.f62608i.getChildAt(i7).setVisibility(8);
        }
    }

    public final void m0(int i7) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (this.f62613n.width() + i7) * 2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: xo.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BottomBarV3 f129379a;

            {
                this.f129379a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomBarV3 bottomBarV3 = this.f129379a;
                int i8 = BottomBarV3.f62593H;
                bottomBarV3.f62616q = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                bottomBarV3.invalidate();
            }
        });
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.setRepeatCount(-1);
        this.f62618s = valueAnimatorOfInt;
    }

    public final void n0(String str, Map<String, String> map) {
        Boolean bool = this.f62600G.get(str);
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        ReporterV3.reportExposure("game-detail-page", "basic-function", str, map);
        this.f62600G.put(str, Boolean.TRUE);
    }

    public final void o0() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != null) {
                childAt.setTag(null);
                childAt.setVisibility(8);
            }
        }
        l0();
        this.f62606f.setVisibility(8);
        this.h.setVisibility(8);
    }

    public final boolean onBook(@NotNull BiligameHotGame biligameHotGame) {
        return false;
    }

    public final void onBookFailure() {
    }

    public final boolean onBookShare(int i7) {
        GameDetailCallback gameDetailCallback = this.f62596C;
        if (gameDetailCallback == null) {
            return true;
        }
        gameDetailCallback.onShare();
        return true;
    }

    public final void onBookSuccess(int i7) {
    }

    public final boolean onDetail(@NotNull BiligameHotGame biligameHotGame) {
        return false;
    }

    public final boolean onDownload(@NotNull BiligameHotGame biligameHotGame, int i7) {
        ReportExtra reportExtra = this.f62594A;
        ReportExtra reportExtraCreate = ReportExtra.create(reportExtra != null ? reportExtra.build() : null);
        if (i7 == 3 && this.f62597D.f127898k) {
            reportExtraCreate.put("dl-anim-showed", "1");
        }
        if (biligameHotGame.isPatchUpdate) {
            reportExtraCreate.put("patchSize", String.valueOf(biligameHotGame.getPatchSize()));
            reportExtraCreate.put("downloadType", "增量更新");
        }
        if (i7 != 3 || this.f62597D.f127898k) {
            this.h.setReportExtra(reportExtraCreate);
        } else {
            this.h.setReportExtra(reportExtraCreate);
        }
        GameDetailCallback gameDetailCallback = this.f62596C;
        if (gameDetailCallback == null) {
            return false;
        }
        gameDetailCallback.onDownload();
        return false;
    }

    public final boolean onFollow(@NotNull BiligameHotGame biligameHotGame) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function3] */
    public final boolean onPay(@NotNull BiligameHotGame biligameHotGame) {
        GameActionUtilsKt.buyGameUtils(getContext(), biligameHotGame, (Function3) new Object());
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (this.f62622w) {
            stop();
            m0(i7);
            ValueAnimator valueAnimator = this.f62618s;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
            this.f62617r = (i8 - this.f62613n.height()) / 2;
        }
    }

    public final boolean onSteamDetail(@NotNull BiligameHotGame biligameHotGame) {
        return false;
    }

    public final void setGameDetailCallback(@Nullable GameDetailCallback gameDetailCallback) {
        this.f62596C = gameDetailCallback;
        this.f62598E.f127906d = gameDetailCallback;
    }

    public final void setLifecycle(@Nullable Lifecycle lifecycle) {
        uo.b bVar = this.f62597D;
        if (lifecycle == null) {
            bVar.getClass();
        } else if (!Intrinsics.areEqual(lifecycle, bVar.f127890b)) {
            Lifecycle lifecycle2 = bVar.f127890b;
            if (lifecycle2 != null) {
                lifecycle2.removeObserver(bVar);
            }
            lifecycle.addObserver(bVar);
            bVar.f127890b = lifecycle;
        }
        d dVar = this.f62598E;
        if (lifecycle == null) {
            dVar.getClass();
        } else if (!Intrinsics.areEqual(lifecycle, dVar.f127904b)) {
            Lifecycle lifecycle3 = dVar.f127904b;
            if (lifecycle3 != null) {
                lifecycle3.removeObserver(dVar);
            }
            lifecycle.addObserver(dVar);
            dVar.f127904b = lifecycle;
        }
        this.h.setLifecycle(lifecycle);
        this.f62609j.setLifecycle(lifecycle);
        this.f62603c.setLifecycle(lifecycle);
        this.f62607g.setLifecycle(lifecycle);
    }

    public final void setPrivateRecruit(boolean z6) {
        this.f62624y = z6;
    }

    public final void setReportExtra(@Nullable ReportExtra reportExtra) {
        this.f62594A = reportExtra;
        this.h.setReportExtra(reportExtra);
        this.f62607g.setReportExtra(reportExtra);
        this.f62597D.f127899l = reportExtra;
        this.f62598E.f127914m = reportExtra;
    }

    public final void setSourceAd(@Nullable String str) {
        this.f62625z = str;
        this.h.setSourceAd(str);
    }

    public final void setVideoFullScreen(boolean z6) {
        uo.b bVar = this.f62597D;
        if (z6) {
            bVar.f127893e.removeCallbacks(bVar.f127891c);
        } else {
            bVar.a();
        }
        d dVar = this.f62598E;
        if (z6) {
            dVar.f127909g.removeCallbacks(dVar.f127907e);
        } else {
            dVar.b();
        }
    }

    public final void stop() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f62618s;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f62618s) != null) {
            valueAnimator.cancel();
        }
        this.f62616q = 0;
        this.f62618s = null;
    }
}
