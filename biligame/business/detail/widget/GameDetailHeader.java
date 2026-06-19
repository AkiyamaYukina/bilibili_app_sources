package com.bilibili.biligame.business.detail.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bilibili.biligame.api.BiligameTag;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.helper.GameDialogHelper;
import com.bilibili.biligame.helper.GameMarqueeHelper;
import com.bilibili.biligame.mod.ErrorConfigManager;
import com.bilibili.biligame.report.ReportExtra;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.ui.gamedetail.GameDetailCallback;
import com.bilibili.biligame.ui.gamedetail.widget.GameFollowView;
import com.bilibili.biligame.utils.KotlinExtensionsKt;
import com.bilibili.biligame.widget.TagFlowLayout;
import com.bilibili.lib.image2.view.BiliImageView;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/GameDetailHeader.class */
@StabilityInferred(parameters = 0)
public final class GameDetailHeader extends ConstraintLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final TextView f62648A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final TextView f62649B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final TextView f62650C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final TextView f62651D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final GameFollowView f62652E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final View f62653F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final TextView f62654G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final View f62655H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final View f62656I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final View f62657J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final BiliImageView f62658K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final BiliImageView f62659L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final BiliImageView f62660M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final TextView f62661N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final View f62662O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final TextView f62663P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final View f62664Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final GameMarqueeHelper f62665R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public List<? extends BiligameTag> f62666S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f62667T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public GameDetailCallback f62668U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @Nullable
    public GameDetailInfo f62669V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public ReportExtra f62670W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f62671a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f62672a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliImageView f62673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f62674c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f62675c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f62676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final HorizontalScrollView f62677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f62678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TextView f62679g;

    @NotNull
    public final LinearLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TextView f62680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final View f62681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final RatingBar f62682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TextView f62683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TextView f62684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final TagFlowLayout f62685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ImageView f62686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final View f62687p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public DetailTabLayout f62688p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final LinearLayout f62689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final View f62690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final TextView f62691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final View f62692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final TextView f62693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final RatingBar f62694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final TextView f62695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final TextView f62696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final RatingBar f62697y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final LinearLayout f62698z;

    @JvmOverloads
    public GameDetailHeader(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public GameDetailHeader(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public GameDetailHeader(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        ViewGroup.inflate(context, 2131496918, this);
        this.f62671a = findViewById(2131316689);
        this.f62673b = findViewById(2131302734);
        this.f62674c = (TextView) findViewById(2131310495);
        TextView textView = (TextView) findViewById(2131314593);
        this.f62676d = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById(2131302899);
        this.f62677e = horizontalScrollView;
        TextView textView2 = (TextView) findViewById(2131315305);
        this.f62678f = textView2;
        this.f62665R = new GameMarqueeHelper(horizontalScrollView, textView2);
        this.f62679g = (TextView) findViewById(2131314594);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131305515);
        this.h = linearLayout;
        this.f62681j = findViewById(2131305516);
        linearLayout.setOnClickListener(this);
        this.f62680i = (TextView) linearLayout.findViewById(2131312742);
        this.f62684m = (TextView) linearLayout.findViewById(2131314662);
        this.f62682k = (RatingBar) linearLayout.findViewById(2131308360);
        this.f62683l = (TextView) linearLayout.findViewById(2131314320);
        this.f62685n = findViewById(2131301755);
        this.f62686o = (ImageView) findViewById(2131304058);
        this.f62687p = findViewById(2131300281);
        this.f62689q = (LinearLayout) findViewById(2131305545);
        this.f62690r = findViewById(2131305775);
        this.f62691s = (TextView) findViewById(2131315483);
        this.f62692t = findViewById(2131310462);
        this.f62693u = (TextView) findViewById(2131314587);
        this.f62694v = (RatingBar) findViewById(2131309867);
        this.f62695w = (TextView) findViewById(2131314317);
        this.f62696x = (TextView) findViewById(2131314586);
        this.f62697y = (RatingBar) findViewById(2131309866);
        this.f62698z = (LinearLayout) findViewById(2131304848);
        this.f62648A = (TextView) findViewById(2131314194);
        this.f62649B = (TextView) findViewById(2131314195);
        this.f62650C = (TextView) findViewById(2131314193);
        this.f62651D = (TextView) findViewById(2131314462);
        this.f62652E = findViewById(2131301819);
        View viewFindViewById = findViewById(2131305544);
        this.f62653F = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        this.f62654G = (TextView) findViewById(2131314448);
        findViewById(2131304076).setOnClickListener(this);
        this.f62655H = findViewById(2131304849);
        this.f62656I = findViewById(2131305678);
        View viewFindViewById2 = findViewById(2131305677);
        this.f62657J = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        this.f62658K = findViewById(2131304583);
        this.f62659L = findViewById(2131304584);
        this.f62660M = findViewById(2131304585);
        this.f62661N = (TextView) findViewById(2131315008);
        View viewFindViewById3 = findViewById(2131305580);
        this.f62662O = viewFindViewById3;
        viewFindViewById3.setOnClickListener(this);
        this.f62663P = (TextView) findViewById(2131314612);
        ((ImageView) findViewById(2131304253)).setImageDrawable(KotlinExtensionsKt.tint(2131232608, context, 2131103603));
        ((ImageView) findViewById(2131304233)).setImageDrawable(KotlinExtensionsKt.tint(2131232608, context, 2131103603));
        this.f62664Q = findViewById(2131300240);
        ((Barrier) findViewById(2131297224)).setReferencedIds(new int[]{2131311916, 2131305740});
    }

    public final boolean getOperatorClickable() {
        return this.f62675c0;
    }

    public final boolean getPrivateRecruit() {
        return this.f62672a0;
    }

    @Nullable
    public final DetailTabLayout getTabLayout() {
        return this.f62688p0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Activity activityRequireActivity;
        int id = view.getId();
        if (id == 2131305544) {
            GameDetailCallback gameDetailCallback = this.f62668U;
            if (gameDetailCallback != null) {
                gameDetailCallback.onTabSwitch(5);
                return;
            }
            return;
        }
        if (id == 2131305515) {
            GameDetailCallback gameDetailCallback2 = this.f62668U;
            if (gameDetailCallback2 != null) {
                gameDetailCallback2.onTabSwitch(1);
                return;
            }
            return;
        }
        if (id == 2131305677) {
            Context context = getContext();
            GameDetailInfo gameDetailInfo = this.f62669V;
            String strValueOf = "";
            if (gameDetailInfo != null) {
                strValueOf = String.valueOf(gameDetailInfo.gameBaseId);
                if (strValueOf == null) {
                    strValueOf = "";
                }
            }
            BiligameRouterHelper.openAttentionPlayers(context, strValueOf);
            return;
        }
        if (id == 2131305580) {
            Context context2 = getContext();
            GameDetailInfo gameDetailInfo2 = this.f62669V;
            String strValueOf2 = "";
            if (gameDetailInfo2 != null) {
                strValueOf2 = String.valueOf(gameDetailInfo2.gameBaseId);
                if (strValueOf2 == null) {
                    strValueOf2 = "";
                }
            }
            BiligameRouterHelper.openGiftAll(context2, strValueOf2);
            return;
        }
        String str = null;
        if (id != 2131314593) {
            if (id == 2131304076) {
                try {
                    activityRequireActivity = ContextUtilKt.requireActivity(getContext());
                } catch (IllegalArgumentException e7) {
                    activityRequireActivity = null;
                }
                GameDialogHelper.showSingleDialog(activityRequireActivity, ErrorConfigManager.INSTANCE.getBIndexTips("default"), getContext().getString(2131823030), (View.OnClickListener) null);
                return;
            }
            return;
        }
        if (!this.f62675c0 || this.f62669V == null) {
            return;
        }
        Context context3 = getContext();
        GameDetailInfo gameDetailInfo3 = this.f62669V;
        if (gameDetailInfo3 != null) {
            str = gameDetailInfo3.operatorId;
        }
        BiligameRouterHelper.openOperatorGameList(context3, str, gameDetailInfo3 != null ? gameDetailInfo3.gameBaseId : 0);
    }

    public final void setGameDetailCallback(@Nullable GameDetailCallback gameDetailCallback) {
        this.f62668U = gameDetailCallback;
    }

    public final void setLifecycle(@Nullable Lifecycle lifecycle) {
        this.f62652E.setLifecycle(lifecycle);
    }

    public final void setOperatorClickable(boolean z6) {
        this.f62675c0 = z6;
    }

    public final void setPrivateRecruit(boolean z6) {
        this.f62672a0 = z6;
    }

    public final void setReportExtra(@Nullable ReportExtra reportExtra) {
        this.f62670W = reportExtra;
        this.f62652E.setReportExtra(reportExtra);
    }

    public final void setTabLayout(@Nullable DetailTabLayout detailTabLayout) {
        this.f62688p0 = detailTabLayout;
    }
}
