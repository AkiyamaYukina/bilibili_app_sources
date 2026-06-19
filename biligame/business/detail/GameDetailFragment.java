package com.bilibili.biligame.business.detail;

import De0.C1566D;
import De0.C1567E;
import De0.C1583p;
import De0.N;
import De0.O;
import Fc.c;
import Ny0.r;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import bk.x;
import bolts.Task;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.emoticon.emoji2.n;
import com.bilibili.app.comm.supermenu.core.MenuView;
import com.bilibili.app.comm.supermenu.share.v2.SharePanelShowCallback;
import com.bilibili.base.MainThread;
import com.bilibili.biligame.api.BiligameTag;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.api.comment.CommentBanStatus;
import com.bilibili.biligame.business.detail.GameDetailFragment;
import com.bilibili.biligame.business.detail.tab.DetailFragmentV2;
import com.bilibili.biligame.business.detail.widget.BottomBarV3;
import com.bilibili.biligame.business.detail.widget.DetailTabLayout;
import com.bilibili.biligame.business.detail.widget.GameDetailHeader;
import com.bilibili.biligame.business.detail.widget.GameDetailToolbar;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.biligame.detail.GameDetailLoadCallback;
import com.bilibili.biligame.download.GameDownloadManager;
import com.bilibili.biligame.helper.GameCommentHelper;
import com.bilibili.biligame.helper.GameConfigHelper;
import com.bilibili.biligame.helper.GameShareDelegate;
import com.bilibili.biligame.helper.GameSourceFromManager;
import com.bilibili.biligame.helper.GameTeenagersModeHelper;
import com.bilibili.biligame.report.ReportExtra;
import com.bilibili.biligame.report3.ReportParams;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.ui.gamedetail.GameDetailCallback;
import com.bilibili.biligame.ui.gamedetail.SourceFromEvent;
import com.bilibili.biligame.ui.gamedetail.comment.CommentTabService;
import com.bilibili.biligame.utils.CatchUtils;
import com.bilibili.biligame.utils.GameImageExtensionsKt;
import com.bilibili.biligame.utils.GameUtils;
import com.bilibili.biligame.utils.KotlinExtensionsKt;
import com.bilibili.biligame.utils.NumUtils;
import com.bilibili.biligame.utils.OnSafeClickListener;
import com.bilibili.biligame.utils.Utils;
import com.bilibili.biligame.utils.bus.GloBus;
import com.bilibili.biligame.web.JavaScriptParams;
import com.bilibili.biligame.widget.BaseLoadFragment;
import com.bilibili.biligame.widget.BaseSafeFragment;
import com.bilibili.biligame.widget.TabLayout;
import com.bilibili.biligame.widget.action.GameActionBase;
import com.bilibili.bililive.room.ui.roomv3.viewv5.business.vertical.K;
import com.bilibili.campus.tabs.billboard.H;
import com.bilibili.game.service.bean.DownloadInfo;
import com.bilibili.game.service.interfaces.DownloadCallback;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.studio.editor.moudle.templatev2.ui.d;
import com.bilibili.studio.editor.moudle.templatev2.ui.e;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import to.f;
import to.j;
import to.s;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/GameDetailFragment.class */
@StabilityInferred(parameters = 0)
public final class GameDetailFragment extends BaseLoadFragment<FrameLayout> implements GameDetailCallback, DownloadCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public AppBarLayout f62484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public GameDetailToolbar f62485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public GameDetailHeader f62486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public DetailTabLayout f62487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public BottomBarV3 f62488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public f f62489g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public GameDetailInfo f62490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public GameDetailContent f62491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f62492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public CommentBanStatus f62493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f62494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f62495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f62496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f62497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f62498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f62499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public ReportExtra f62500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f62501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public GameDetailLoadCallback f62502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f62503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public DownloadInfo f62504w;

    @NotNull
    public final Lazy h = LazyKt.lazy(new C1567E(this, 5));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final to.a f62505x = new FragmentOnAttachListener(this) { // from class: to.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GameDetailFragment f127572a;

        {
            this.f127572a = this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.FragmentOnAttachListener
        public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
            boolean z6 = fragment instanceof DetailFragmentV2;
            GameDetailFragment gameDetailFragment = this.f127572a;
            if (z6) {
                ((DetailFragmentV2) fragment).h = gameDetailFragment;
            }
            CommentTabService commentTabService = (CommentTabService) BLRouter.INSTANCE.get(CommentTabService.class, "comment_tab_service");
            if (commentTabService != null) {
                commentTabService.tryInjectCallback(fragment, gameDetailFragment);
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/GameDetailFragment$a.class */
    public static final class a<V> implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<V> f62506a = (a<V>) new Object();

        @Override // java.util.concurrent.Callable
        public final Object call() {
            BiliAccountInfo.Companion.get().requestForMyAccountInfo();
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/GameDetailFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f62507a;

        public b(Function1 function1) {
            this.f62507a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f62507a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f62507a.invoke(obj);
        }
    }

    public static Unit jf(GameDetailFragment gameDetailFragment, String str) {
        if (GameUtils.checkSourceFrom(((BaseSafeFragment) gameDetailFragment).mSourceFrom)) {
            ((BaseSafeFragment) gameDetailFragment).mSourceFrom = str;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final JSONObject getExtra() {
        ReportExtra reportExtraCopy;
        ReportExtra reportExtra = this.f62500s;
        return (reportExtra == null || (reportExtraCopy = reportExtra.copy()) == null) ? null : reportExtraCopy.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kf() {
        DownloadInfo downloadInfo;
        GameDetailInfo gameDetailInfo = this.f62490i;
        if (gameDetailInfo != null && (downloadInfo = this.f62504w) != null && this.f62498q && this.f62503v && this.f62496o) {
            this.f62498q = false;
            if (!GameUtils.isDownloadableGame(gameDetailInfo) || GameTeenagersModeHelper.isEnable() || p3() == null) {
                return;
            }
            FragmentActivity fragmentActivityP3 = p3();
            if (fragmentActivityP3 == null || !fragmentActivityP3.isFinishing()) {
                try {
                    if (downloadInfo.status != 9 || downloadInfo.installedVersion >= NumUtils.parseInt(gameDetailInfo.getPkgVer())) {
                        int i7 = downloadInfo.status;
                        if (i7 != 1 && i7 != 6 && i7 != 10) {
                            return;
                        }
                    }
                    ReportExtra reportExtra = this.f62500s;
                    gameDetailInfo.extra = reportExtra != null ? reportExtra.build() : null;
                    GameDownloadManager.INSTANCE.handleClickDownload(getContext(), gameDetailInfo);
                } catch (Throwable th) {
                }
            }
        }
    }

    public final j lf() {
        return (j) this.h.getValue();
    }

    public final void loadData() {
        super.loadData();
        GameDetailLoadCallback gameDetailLoadCallback = this.f62502u;
        if (gameDetailLoadCallback != null) {
            gameDetailLoadCallback.onLoadStart();
        }
        lf().startLoad(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mf() {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.detail.GameDetailFragment.mf():void");
    }

    public final void nf(DownloadInfo downloadInfo) {
        GameDetailInfo gameDetailInfo;
        if (downloadInfo == null || (gameDetailInfo = this.f62490i) == null) {
            return;
        }
        if (TextUtils.equals(downloadInfo.pkgName, gameDetailInfo != null ? gameDetailInfo.androidPkgName : null)) {
            this.f62504w = downloadInfo;
        }
    }

    public final void of(boolean z6) {
        GameDetailInfo gameDetailInfo = this.f62490i;
        if (gameDetailInfo == null || this.f62491j == null) {
            return;
        }
        GameDetailHeader gameDetailHeader = this.f62486d;
        if (gameDetailHeader != null && gameDetailInfo != null) {
            if (z6) {
                gameDetailHeader.f62665R.startMarquee(gameDetailInfo.subTitle, 1000L);
            } else {
                gameDetailHeader.f62665R.stopMarquee();
            }
        }
        GameDetailToolbar gameDetailToolbar = this.f62485c;
        if (gameDetailToolbar != null) {
            if (z6) {
                gameDetailToolbar.setBackgroundColor(0);
                gameDetailToolbar.f62705g.setVisibility(8);
                gameDetailToolbar.f62704f.setVisibility(8);
                gameDetailToolbar.f62703e.setVisibility(8);
                gameDetailToolbar.f62699a.setBackgroundResource(2131233243);
                gameDetailToolbar.f62700b.setBackgroundResource(2131233243);
                gameDetailToolbar.f62702d.setBackgroundResource(2131233243);
            } else {
                gameDetailToolbar.setBackgroundColor(gameDetailToolbar.f62706i);
                gameDetailToolbar.f62705g.setVisibility(0);
                gameDetailToolbar.f62704f.setVisibility(0);
                gameDetailToolbar.f62703e.setVisibility(0);
                gameDetailToolbar.f62699a.setBackground(null);
                gameDetailToolbar.f62700b.setBackground(null);
                gameDetailToolbar.f62702d.setBackground(null);
            }
            if (gameDetailToolbar.f62708k) {
                gameDetailToolbar.f62702d.setVisibility(8);
                gameDetailToolbar.f62703e.setVisibility(8);
            }
        }
    }

    public final void onAppbarExpand(boolean z6, boolean z7) {
        AppBarLayout appBarLayout = this.f62484b;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(z6, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBack() {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onComment(@Nullable String str) {
        GameCommentHelper.goToInputComment$default(GameCommentHelper.INSTANCE, requireContext(), "", String.valueOf(this.f62497p), str, 0, this.f62493l, false, (String) null, 128, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onComment(@Nullable String str, int i7, @NotNull String str2) {
        GameCommentHelper.goToInputComment$default(GameCommentHelper.INSTANCE, requireContext(), str2, String.valueOf(this.f62497p), str, i7, this.f62493l, false, (String) null, 128, (Object) null);
    }

    public final View onCreateRootView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (FrameLayout) layoutInflater.inflate(2131496875, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreateSafe(@Nullable Bundle bundle) {
        super.onCreateSafe(bundle);
        GloBus.get().register(this);
        this.f62489g = (f) new ViewModelProvider(requireActivity()).get(f.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f62496o = false;
            int i7 = NumUtils.parseInt(arguments.getString("id"), 0);
            this.f62497p = i7;
            f fVar = this.f62489g;
            if (fVar != null) {
                fVar.f127580d = Integer.valueOf(i7);
            }
            this.f62498q = TextUtils.equals(arguments.getString("auto-D"), "1");
            arguments.getString("sourceType");
            this.f62499r = arguments.getString(GameCardButton.extraParamSource);
            String sourceFrom = KotlinExtensionsKt.getSourceFrom(this, String.valueOf(this.f62497p));
            ((BaseSafeFragment) this).mSourceFrom = sourceFrom;
            if (!Intrinsics.areEqual("9800000014", sourceFrom)) {
                lf().f127605t = ((BaseSafeFragment) this).mSourceFrom;
                j jVarLf = lf();
                jVarLf.f127587a.getLeadFlowSourceFromList().enqueue(new s(((BaseSafeFragment) this).mSourceFrom, jVarLf));
            }
            Object obj = arguments.get("reportExtra");
            ReportExtra reportExtraCreate = ReportExtra.create(obj instanceof JSONObject ? (JSONObject) obj : null);
            reportExtraCreate.put(GameCardButton.extraParamSource, this.f62499r);
            reportExtraCreate.put("frombusiness", "1");
            this.f62500s = reportExtraCreate;
        }
        if (this.f62497p == 0) {
            return;
        }
        this.f62494m = BiliAccounts.get(getContext()).isLogin();
        lf().f127604s = String.valueOf(this.f62497p);
        lf().f127606u = true;
        lf().f127590d.observe(this, new b(new N(this, 3)));
        lf().f127592f.observe(this, new b(new O(this, 6)));
        lf().f127599n.observe(this, new b(new n(this, 2)));
        lf().f127593g.observe(this, new b(new H(this, 3)));
        lf().f127597l.observe(this, new b(new d(2, this)));
        lf().f127603r.observe(this, new b(new e(3, this)));
        lf().f127595j.observe(this, new b(new AP.d(2, this)));
        lf().f127596k.observe(this, new b(new C1583p(this, 2)));
        lf().f127594i.observe(this, new b(new r(this, 2)));
        lf().f127602q.observe(this, new b(new K(this, 3)));
        getChildFragmentManager().addFragmentOnAttachListener(this.f62505x);
        GameDownloadManager.INSTANCE.register(this);
        KotlinExtensionsKt.subscribeLogin$default(this, (Topic[]) null, new c(this, 4), 1, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroySafe() {
        super/*com.bilibili.biligame.widget.BaseSafeFragment*/.onDestroySafe();
        GloBus.get().unregister(this);
        GameDownloadManager.INSTANCE.unregister(this);
        getChildFragmentManager().removeFragmentOnAttachListener(this.f62505x);
        GameDetailHeader gameDetailHeader = this.f62486d;
        if (gameDetailHeader != null) {
            gameDetailHeader.f62665R.destroy();
        }
    }

    public final void onDownload() {
    }

    public final void onError(@Nullable DownloadInfo downloadInfo) {
        nf(downloadInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe
    public final void onEventRefresh(@NotNull ArrayList<JavaScriptParams.NotifyInfo> arrayList) {
        try {
            if (this.f62490i != null && isAdded()) {
                boolean z6 = false;
                for (JavaScriptParams.NotifyInfo notifyInfo : arrayList) {
                    if (notifyInfo != null && notifyInfo.type == 6 && !z6 && !Utils.isEmpty(notifyInfo.list)) {
                        ArrayList arrayList2 = notifyInfo.list;
                        GameDetailInfo gameDetailInfo = this.f62490i;
                        if (arrayList2.contains(gameDetailInfo != null ? String.valueOf(gameDetailInfo.gameBaseId) : null)) {
                            boolean z7 = notifyInfo.isNative;
                            if (z7 && notifyInfo.isAdd) {
                                this.f62492k = true;
                                mf();
                            } else if (z7 && BiliAccountInfo.Companion.get().getUserLevel() >= GameCommentHelper.INSTANCE.getNeedUserLV()) {
                                this.f62492k = false;
                                mf();
                            }
                            z6 = true;
                        }
                    }
                }
                if (z6) {
                    lf().requestCommentedGameIdList();
                }
            }
        } catch (Throwable th) {
            CatchUtils.e("GameDetailFragment", "", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe
    public final void onEventSourceFrom(@Nullable SourceFromEvent sourceFromEvent) {
        try {
            if (Intrinsics.areEqual(((BaseSafeFragment) this).mSourceFrom, "9800000014")) {
                return;
            }
            GameSourceFromManager.INSTANCE.setSourceFrom(getContext(), ((BaseSafeFragment) this).mSourceFrom);
        } catch (Throwable th) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFillQuestionnaire(@Nullable String str) {
        this.f62495n = true;
        BiligameRouterHelper.openUrl(getContext(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onGameCenter() {
        try {
            GameConfigHelper.sSourceFrom = "100004";
            BiligameRouterHelper.openGameCenterHome(getContext(), GameConfigHelper.sSourceFrom);
            GloBus.get().post(new SourceFromEvent());
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public final void onInit(@Nullable DownloadInfo downloadInfo) {
        this.f62503v = true;
        nf(downloadInfo);
        if (this.f62498q) {
            kf();
        }
    }

    public final void onPauseSafe() {
        super/*com.bilibili.biligame.widget.BaseSafeFragment*/.onPauseSafe();
        GameDetailHeader gameDetailHeader = this.f62486d;
        if (gameDetailHeader != null) {
            gameDetailHeader.f62665R.stopMarquee();
        }
    }

    public final void onPlayCloudGame() {
    }

    public final void onProgress(@Nullable DownloadInfo downloadInfo) {
        nf(downloadInfo);
    }

    public final void onResumeSafe() {
        GameDetailInfo gameDetailInfo;
        super/*com.bilibili.biligame.widget.BaseSafeFragment*/.onResumeSafe();
        GameDetailHeader gameDetailHeader = this.f62486d;
        if (gameDetailHeader != null && (gameDetailInfo = this.f62490i) != null) {
            gameDetailHeader.f62665R.startMarquee(gameDetailInfo.subTitle, 1000L);
        }
        if (this.f62495n) {
            this.f62495n = false;
            lf().startLoad(true);
        }
        if (GameCommentHelper.INSTANCE.getSAccountsChange()) {
            Task.callInBackground(a.f62506a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [android.widget.HorizontalScrollView, com.bilibili.biligame.business.detail.widget.DetailTabLayout, com.bilibili.biligame.widget.TabLayout] */
    public final void onRootViewCreated(View view, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) view;
        CollapsingToolbarLayout collapsingToolbarLayoutFindViewById = frameLayout.findViewById(2131299011);
        this.f62484b = frameLayout.findViewById(2131296646);
        GameDetailToolbar gameDetailToolbar = (GameDetailToolbar) frameLayout.findViewById(2131302065);
        this.f62485c = gameDetailToolbar;
        if (gameDetailToolbar != null) {
            gameDetailToolbar.setLifecycle(getLifecycle());
        }
        GameDetailToolbar gameDetailToolbar2 = this.f62485c;
        if (gameDetailToolbar2 != null) {
            gameDetailToolbar2.setGameDetailCallback(this);
        }
        GameDetailToolbar gameDetailToolbar3 = this.f62485c;
        if (gameDetailToolbar3 != null) {
            gameDetailToolbar3.f62699a.setVisibility(8);
            gameDetailToolbar3.f62702d.setVisibility(8);
        }
        GameDetailToolbar gameDetailToolbar4 = this.f62485c;
        if (gameDetailToolbar4 != null) {
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                ReportParams reportParamsCreateWithGameBaseId = ReportParams.Companion.createWithGameBaseId(String.valueOf(gameDetailToolbar4.h));
                ReportExtra reportExtra = gameDetailToolbar4.f62707j;
                gameDetailToolbar4.a("game-center-icon", "all", reportParamsCreateWithGameBaseId.put(reportExtra != null ? reportExtra.build() : null).build());
            }
            gameDetailToolbar4.f62700b.setVisibility(Intrinsics.areEqual(bool, bool2) ? 0 : 8);
            View view2 = gameDetailToolbar4.f62701c;
            int i7 = 8;
            if (Intrinsics.areEqual(bool, bool2)) {
                i7 = 0;
            }
            view2.setVisibility(i7);
        }
        GameDetailToolbar gameDetailToolbar5 = this.f62485c;
        if (gameDetailToolbar5 != null) {
            gameDetailToolbar5.setReportExtra(this.f62500s);
        }
        GameDetailHeader gameDetailHeader = (GameDetailHeader) frameLayout.findViewById(2131302064);
        this.f62486d = gameDetailHeader;
        if (gameDetailHeader != null) {
            gameDetailHeader.setLifecycle(getLifecycle());
        }
        GameDetailHeader gameDetailHeader2 = this.f62486d;
        if (gameDetailHeader2 != null) {
            gameDetailHeader2.setGameDetailCallback(this);
        }
        GameDetailHeader gameDetailHeader3 = this.f62486d;
        if (gameDetailHeader3 != null) {
            gameDetailHeader3.setReportExtra(this.f62500s);
        }
        DetailTabLayout detailTabLayout = (DetailTabLayout) frameLayout.findViewById(2131311422);
        this.f62487e = detailTabLayout;
        GameDetailHeader gameDetailHeader4 = this.f62486d;
        if (gameDetailHeader4 != null) {
            gameDetailHeader4.setTabLayout(detailTabLayout);
        }
        ViewPager viewPager = (ViewPager) frameLayout.findViewById(2131300084);
        DetailTabLayout detailTabLayout2 = this.f62487e;
        if (detailTabLayout2 != null) {
            ReportExtra reportExtra2 = this.f62500s;
            JSONObject jSONObjectBuild = null;
            if (reportExtra2 != null) {
                jSONObjectBuild = reportExtra2.build();
            }
            detailTabLayout2.setReportExtra(jSONObjectBuild);
        }
        ?? r02 = this.f62487e;
        if (r02 != 0) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            GameDetailToolbar gameDetailToolbar6 = this.f62485c;
            r02.f62632I = true;
            r02.f62635L = viewPager;
            r02.f62639P = childFragmentManager;
            r02.setSelectedTabIndicatorWidthAndCorner(r02.getResources().getDimensionPixelOffset(2131165678), r02.getResources().getDimensionPixelOffset(2131165676));
            ViewPager viewPager2 = r02.f62635L;
            if (viewPager2 != null) {
                viewPager2.addOnPageChangeListener(new xo.d(r02));
            }
            DetailTabLayout.a aVar = new DetailTabLayout.a(r02, childFragmentManager);
            r02.f62638O = aVar;
            ViewPager viewPager3 = r02.f62635L;
            if (viewPager3 != null) {
                viewPager3.setAdapter(aVar);
            }
            r02.f62636M = gameDetailToolbar6;
            r02.f62637N = collapsingToolbarLayoutFindViewById;
        }
        DetailTabLayout detailTabLayout3 = this.f62487e;
        if (detailTabLayout3 != null) {
            detailTabLayout3.setGameDetailCallback(this);
        }
        BottomBarV3 bottomBarV3 = (BottomBarV3) frameLayout.findViewById(2131297837);
        this.f62488f = bottomBarV3;
        if (bottomBarV3 != null) {
            bottomBarV3.setLifecycle(getLifecycle());
        }
        BottomBarV3 bottomBarV32 = this.f62488f;
        if (bottomBarV32 != null) {
            bottomBarV32.setGameDetailCallback(this);
        }
        BottomBarV3 bottomBarV33 = this.f62488f;
        if (bottomBarV33 != null) {
            bottomBarV33.setReportExtra(this.f62500s);
        }
        BottomBarV3 bottomBarV34 = this.f62488f;
        if (bottomBarV34 != null) {
            bottomBarV34.setSourceAd(this.f62499r);
        }
        AppBarLayout appBarLayout = this.f62484b;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: to.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GameDetailFragment f127573a;

                {
                    this.f127573a = this;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i8) {
                    int iAbs = Math.abs(i8);
                    GameDetailFragment gameDetailFragment = this.f127573a;
                    AppBarLayout appBarLayout3 = gameDetailFragment.f62484b;
                    boolean z6 = false;
                    if (iAbs <= (appBarLayout3 != null ? appBarLayout3.getTotalScrollRange() : 0) - 2) {
                        z6 = true;
                    }
                    gameDetailFragment.of(z6);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onShare() {
        GameShareDelegate.share$default(new GameShareDelegate(requireActivity(), (GameShareDelegate.OnShareListener) null), this.f62490i, this.f62491j, false, false, (MenuView) null, (SharePanelShowCallback) null, 60, (Object) null);
    }

    public final void onStartSafe() {
        super/*com.bilibili.biligame.widget.BaseSafeFragment*/.onStartSafe();
        BottomBarV3 bottomBarV3 = this.f62488f;
        if (bottomBarV3 == null || !bottomBarV3.f62622w) {
            return;
        }
        bottomBarV3.stop();
        bottomBarV3.m0(bottomBarV3.getWidth());
        ValueAnimator valueAnimator = bottomBarV3.f62618s;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public final void onStatusChange(@Nullable DownloadInfo downloadInfo) {
        nf(downloadInfo);
    }

    public final void onStopSafe() {
        super/*com.bilibili.biligame.widget.BaseSafeFragment*/.onStopSafe();
        BottomBarV3 bottomBarV3 = this.f62488f;
        if (bottomBarV3 != null) {
            bottomBarV3.stop();
        }
    }

    public final void onTabSwitch(int i7) {
        int iIndexOf;
        TabLayout.Tab tabAt;
        DetailTabLayout detailTabLayout = this.f62487e;
        if (detailTabLayout == null || i7 == detailTabLayout.f62633J || (iIndexOf = detailTabLayout.f62629F.indexOf(Integer.valueOf(i7))) < 0 || (tabAt = detailTabLayout.getTabAt(iIndexOf)) == null) {
            return;
        }
        tabAt.select();
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [android.widget.HorizontalScrollView, com.bilibili.biligame.business.detail.widget.DetailTabLayout, com.bilibili.biligame.widget.TabLayout, com.bilibili.biligame.widget.TabLayout$OnTabSelectedListener] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void pf() {
        List<BiligameTag> list;
        int dimensionPixelOffset;
        int i7;
        int i8;
        GameDetailInfo gameDetailInfo;
        GameDetailInfo gameDetailInfo2 = this.f62490i;
        if (gameDetailInfo2 != null) {
            FrameLayout frameLayout = (FrameLayout) getRootView();
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(gameDetailInfo2.getBgColor());
            }
            TabLayout tabLayout = this.f62487e;
            if (tabLayout != null) {
                tabLayout.setBackgroundColor(gameDetailInfo2.getBgColor());
            }
        }
        if (this.f62490i == null || this.f62491j == null) {
            return;
        }
        if (!this.f62501t) {
            this.f62501t = true;
            GameDetailLoadCallback gameDetailLoadCallback = this.f62502u;
            if (gameDetailLoadCallback != null) {
                gameDetailLoadCallback.onLoadSuccess();
            }
        }
        MainThread.postOnMainThread(new C1566D(this, 8));
        hideLoadTips();
        GameDetailToolbar gameDetailToolbar = this.f62485c;
        if (gameDetailToolbar != null && (gameDetailInfo = this.f62490i) != null) {
            gameDetailToolbar.h = gameDetailInfo.gameBaseId;
            gameDetailToolbar.f62706i = gameDetailInfo.getBgColor();
            gameDetailToolbar.f62704f.setText(GameUtils.formatGameName(gameDetailInfo));
            GameActionBase.bindGame$default(gameDetailToolbar.f62703e, gameDetailInfo, (String) null, 2, (Object) null);
            if (gameDetailToolbar.f62702d.isShown()) {
                ReportParams reportParamsCreateWithGameBaseId = ReportParams.Companion.createWithGameBaseId(String.valueOf(gameDetailToolbar.h));
                ReportExtra reportExtra = gameDetailToolbar.f62707j;
                gameDetailToolbar.a("basic-function", "top-share-button", reportParamsCreateWithGameBaseId.put(reportExtra != null ? reportExtra.build() : null).build());
            }
        }
        of(true);
        GameDetailHeader gameDetailHeader = this.f62486d;
        if (gameDetailHeader != null) {
            GameDetailInfo gameDetailInfo3 = this.f62490i;
            GameDetailContent gameDetailContent = this.f62491j;
            if (gameDetailInfo3 != null) {
                gameDetailHeader.f62671a.setBackgroundColor(gameDetailInfo3.getBgColor());
                gameDetailHeader.f62669V = gameDetailInfo3;
                GameImageExtensionsKt.displayGameImage(gameDetailHeader.f62673b, gameDetailInfo3.icon);
                gameDetailHeader.f62674c.setText(GameUtils.formatGameName(gameDetailInfo3));
                gameDetailHeader.f62676d.setText(gameDetailInfo3.inputDeveloperName);
                boolean zIsBookGame = GameUtils.isBookGame(gameDetailInfo3);
                int i9 = gameDetailInfo3.source;
                if (i9 == 3) {
                    gameDetailHeader.f62679g.setText(gameDetailInfo3.platformStr);
                    gameDetailHeader.f62679g.setVisibility(TextUtils.isEmpty(gameDetailInfo3.platformStr) ? 8 : 0);
                } else if (i9 == 0 || i9 == 1 || !zIsBookGame) {
                    gameDetailHeader.f62679g.setVisibility(8);
                }
                int i10 = TextUtils.isEmpty(gameDetailInfo3.subTitle) ? 8 : 0;
                gameDetailHeader.f62677e.setVisibility(i10);
                gameDetailHeader.f62678f.setVisibility(i10);
                gameDetailHeader.f62678f.setText(gameDetailInfo3.subTitle);
                gameDetailHeader.f62665R.stopMarquee();
                gameDetailHeader.f62665R.startMarquee(gameDetailInfo3.subTitle, 1000L);
                if (gameDetailInfo3.platformScore <= 0.0f) {
                    gameDetailHeader.f62681j.setVisibility(0);
                    gameDetailHeader.h.setVisibility(0);
                    gameDetailHeader.f62689q.setVisibility(8);
                    gameDetailHeader.f62687p.setVisibility(8);
                    if (GameUtils.isVailComment(gameDetailInfo3)) {
                        gameDetailHeader.f62680i.setText(String.valueOf(gameDetailInfo3.grade));
                        gameDetailHeader.f62682k.setRating(gameDetailInfo3.grade / 2);
                        gameDetailHeader.f62680i.setVisibility(0);
                        gameDetailHeader.f62682k.setVisibility(0);
                        gameDetailHeader.f62683l.setVisibility(8);
                        gameDetailHeader.f62684m.setText(gameDetailHeader.getContext().getString(2131823231, Utils.toCountStr(gameDetailHeader.getContext(), gameDetailInfo3.commentCount)));
                    } else {
                        gameDetailHeader.f62680i.setVisibility(8);
                        gameDetailHeader.f62682k.setVisibility(8);
                        gameDetailHeader.f62683l.setVisibility(0);
                    }
                } else {
                    gameDetailHeader.f62681j.setVisibility(8);
                    gameDetailHeader.h.setVisibility(8);
                    gameDetailHeader.f62689q.setVisibility(0);
                    gameDetailHeader.f62687p.setVisibility(0);
                    gameDetailHeader.f62696x.setText(String.valueOf(gameDetailInfo3.platformScore));
                    RatingBar ratingBar = gameDetailHeader.f62697y;
                    float f7 = gameDetailInfo3.platformScore;
                    float f8 = 2;
                    ratingBar.setRating(f7 / f8);
                    gameDetailHeader.f62693u.setText(String.valueOf(gameDetailInfo3.grade));
                    gameDetailHeader.f62694v.setRating(gameDetailInfo3.grade / f8);
                    if (GameUtils.isVailComment(gameDetailInfo3)) {
                        gameDetailHeader.f62695w.setText(gameDetailHeader.getContext().getString(2131823231, Utils.toCountStr(gameDetailHeader.getContext(), gameDetailInfo3.commentCount)));
                    } else {
                        gameDetailHeader.f62692t.setVisibility(8);
                        gameDetailHeader.f62690r.setVisibility(0);
                        gameDetailHeader.f62691s.setText(gameDetailHeader.getContext().getString(2131823231, Utils.toCountStr(gameDetailHeader.getContext(), gameDetailInfo3.commentCount)));
                    }
                }
                if (gameDetailHeader.f62672a0) {
                    gameDetailHeader.f62698z.setVisibility(8);
                } else {
                    boolean zIsBookGame2 = GameUtils.isBookGame(gameDetailInfo3);
                    int i11 = gameDetailInfo3.source;
                    if (i11 == 0 || i11 == 1) {
                        if (GameUtils.isDownloadGame(gameDetailInfo3) && (i7 = gameDetailInfo3.downloadCount) > 0) {
                            gameDetailHeader.f62650C.setText(GameUtils.formatNumPlus(i7));
                        }
                    } else if (!zIsBookGame2) {
                        gameDetailHeader.f62679g.setVisibility(8);
                        TextView textView = gameDetailHeader.f62650C;
                        int i12 = gameDetailInfo3.downloadCount;
                        textView.setText(i12 > 0 ? GameUtils.formatNum(i12) : "");
                    }
                    if (zIsBookGame2 && (i8 = gameDetailInfo3.bookNum) > 0) {
                        gameDetailHeader.f62650C.setText(GameUtils.formatBookNumPlus(i8));
                        gameDetailHeader.f62651D.setText(gameDetailHeader.getContext().getString(2131823646));
                    }
                    if (TextUtils.isEmpty(gameDetailHeader.f62650C.getText())) {
                        x.a(gameDetailHeader.f62650C, GameUtils.formatBIndex(gameDetailInfo3.bIndexNum), gameDetailInfo3.bIndexNum >= 10000 ? "+" : "");
                        gameDetailHeader.f62651D.setText(gameDetailHeader.getContext().getString(2131823053));
                    }
                    long j7 = gameDetailInfo3.bRank;
                    if (j7 <= 0) {
                        gameDetailHeader.f62648A.setText("-");
                    } else {
                        gameDetailHeader.f62648A.setText("#" + j7);
                    }
                    String string = gameDetailHeader.getContext().getString(2131823703);
                    String globalRankName = GameConfigHelper.getGlobalRankName(gameDetailHeader.getContext(), 7);
                    if (!TextUtils.isEmpty(globalRankName)) {
                        string = globalRankName;
                    }
                    gameDetailHeader.f62649B.setText(string);
                    long j8 = gameDetailInfo3.forumHeat;
                    if (j8 > 0) {
                        gameDetailHeader.f62654G.setText(GameUtils.formatNumPlus(j8));
                    } else {
                        gameDetailHeader.f62653F.setVisibility(8);
                    }
                    GameActionBase.bindGame$default(gameDetailHeader.f62652E, gameDetailInfo3, (String) null, 2, (Object) null);
                    gameDetailHeader.f62652E.setCanUnfollow(true).setUnfollowModule("track-detail-unfollow").setReportPage("detailTag").setReportModule("track-detail-follow");
                }
            }
            if (gameDetailContent != null && (list = gameDetailContent.tagList) != null && !Intrinsics.areEqual(list, gameDetailHeader.f62666S)) {
                gameDetailHeader.f62666S = gameDetailContent.tagList;
                gameDetailHeader.f62685n.removeAllViews();
                if (list.isEmpty()) {
                    gameDetailHeader.f62685n.setVisibility(8);
                } else {
                    OnSafeClickListener fVar = new xo.f(gameDetailContent, gameDetailHeader);
                    List<? extends BiligameTag> list2 = gameDetailHeader.f62666S;
                    if (list2 != null) {
                        for (BiligameTag biligameTag : list2) {
                            if (biligameTag != null) {
                                TextView textView2 = (TextView) LayoutInflater.from(gameDetailHeader.getContext()).inflate(2131497063, (ViewGroup) gameDetailHeader.f62685n, false);
                                gameDetailHeader.f62685n.addView(textView2);
                                textView2.setText(biligameTag.name);
                                textView2.setTag(biligameTag);
                                textView2.setOnClickListener(fVar);
                                ReportParams reportParamsPut = ReportParams.Companion.createWithGameBaseId(String.valueOf(gameDetailContent.gameBaseId)).put("tag_name", biligameTag.name);
                                ReportExtra reportExtra2 = gameDetailHeader.f62670W;
                                ReporterV3.reportExposure("game-detail-page", "game-tags", "all", reportParamsPut.put(reportExtra2 != null ? reportExtra2.build() : null).build());
                            }
                        }
                    }
                    gameDetailHeader.f62686o.setImageResource(gameDetailHeader.f62667T ? 2131235849 : 2131235844);
                    gameDetailHeader.f62686o.setOnClickListener(new xo.e(gameDetailHeader));
                    int i13 = gameDetailHeader.getResources().getDisplayMetrics().widthPixels;
                    ViewGroup.LayoutParams layoutParams = gameDetailHeader.f62685n.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i13 -= marginLayoutParams.leftMargin;
                        dimensionPixelOffset = marginLayoutParams.rightMargin;
                    } else {
                        dimensionPixelOffset = gameDetailHeader.getResources().getDimensionPixelOffset(2131165611) * 2;
                    }
                    gameDetailHeader.f62685n.measure(View.MeasureSpec.makeMeasureSpec(i13 - dimensionPixelOffset, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), 0);
                    gameDetailHeader.f62686o.setVisibility(gameDetailHeader.f62685n.getLineCount() == 1 ? 8 : 0);
                }
            }
        }
        ?? r02 = this.f62487e;
        if (r02 != 0) {
            GameDetailInfo gameDetailInfo4 = this.f62490i;
            GameDetailContent gameDetailContent2 = this.f62491j;
            if (gameDetailInfo4 != null && gameDetailContent2 != null) {
                r02.f62630G = gameDetailInfo4;
                r02.f62631H = gameDetailContent2;
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(0);
                arrayList.add(1);
                if (gameDetailInfo4.showTopic) {
                    arrayList.add(4);
                }
                if (gameDetailInfo4.showStrategy) {
                    arrayList.add(2);
                }
                if (gameDetailInfo4.showForum) {
                    arrayList.add(5);
                }
                if (Intrinsics.areEqual(arrayList, r02.f62629F)) {
                    TabLayout.Tab tabAt = r02.getTabAt(arrayList.indexOf(1));
                    if ((tabAt != null ? tabAt.getCustomView() : null) != null) {
                        View customView = tabAt.getCustomView();
                        TextView textView3 = customView != null ? (TextView) customView.findViewById(2131310558) : null;
                        if (textView3 != null) {
                            textView3.setText(gameDetailInfo4.commentCount > 0 ? Utils.toCountStr(r02.getContext(), gameDetailInfo4.commentCount) : "");
                        }
                    }
                } else {
                    r02.f62629F = arrayList;
                    ViewPager viewPager = r02.f62635L;
                    if (viewPager != null) {
                        viewPager.setOffscreenPageLimit(arrayList.size());
                    }
                    DetailTabLayout.a aVar = r02.f62638O;
                    if (aVar != null) {
                        aVar.f62646b = arrayList;
                        aVar.f62645a.clear();
                        aVar.notifyDataSetChanged();
                    }
                    r02.setupWithViewPager(r02.f62635L);
                    int i14 = arrayList.contains(Integer.valueOf(r02.f62633J)) ? r02.f62633J : 0;
                    r02.removeOnTabSelectedListener((TabLayout.OnTabSelectedListener) r02);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        TabLayout.Tab tabAt2 = r02.getTabAt(arrayList.indexOf(Integer.valueOf(iIntValue)));
                        TabLayout.Tab tabNewTab = tabAt2;
                        if (tabAt2 == null) {
                            tabNewTab = r02.newTab();
                        }
                        if (iIntValue == 1) {
                            tabNewTab.setCustomView(2131496442);
                            View customView2 = tabNewTab.getCustomView();
                            if (customView2 != null) {
                                TextView textView4 = (TextView) customView2.findViewById(2131310560);
                                textView4.setText(r02.p(iIntValue));
                                ((TextView) customView2.findViewById(2131310558)).setText(gameDetailInfo4.commentCount > 0 ? Utils.toCountStr(r02.getContext(), gameDetailInfo4.commentCount) : "");
                                textView4.setTextColor(r02.getTabTextColors());
                            }
                        } else {
                            tabNewTab.setText(r02.p(iIntValue));
                        }
                        tabNewTab.setTag(Integer.valueOf(iIntValue));
                    }
                    int iMax = Math.max(arrayList.indexOf(Integer.valueOf(i14)), 0);
                    ViewPager viewPager2 = r02.f62635L;
                    if (viewPager2 != null) {
                        viewPager2.setCurrentItem(iMax);
                    }
                    if (iMax == 0) {
                        r02.n(i14);
                    }
                    r02.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) r02);
                }
            }
        }
        BottomBarV3 bottomBarV3 = this.f62488f;
        if (bottomBarV3 != null) {
            bottomBarV3.setVisibility(0);
        }
        mf();
    }

    public final boolean pvReport() {
        return true;
    }
}
