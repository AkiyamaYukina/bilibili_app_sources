package com.bilibili.ogv.misc.sponsor;

import Nl0.e;
import Y80.p;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment;
import com.bilibili.lib.ui.RouteConstKt;
import com.bilibili.ogv.misc.sponsor.SponsorApiService;
import com.bilibili.pegasus.components.interest.i;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xk0.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRankFragment.class */
@StabilityInferred(parameters = 0)
public final class BangumiSponsorRankFragment extends BaseRecyclerViewToolbarFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f69346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f69347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f69349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f69350g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f69351i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f69352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f69353k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRankFragment$RankType.class */
    public static final class RankType {
        private static final EnumEntries $ENTRIES;
        private static final RankType[] $VALUES;
        public static final RankType WEEK = new RankType("WEEK", 0);
        public static final RankType TOTAL = new RankType("TOTAL", 1);

        private static final /* synthetic */ RankType[] $values() {
            return new RankType[]{WEEK, TOTAL};
        }

        static {
            RankType[] rankTypeArr$values = $values();
            $VALUES = rankTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(rankTypeArr$values);
        }

        private RankType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<RankType> getEntries() {
            return $ENTRIES;
        }

        public static RankType valueOf(String str) {
            return (RankType) Enum.valueOf(RankType.class, str);
        }

        public static RankType[] values() {
            return (RankType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRankFragment$a.class */
    public static final class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiSponsorRankFragment f69354b;

        public a(BangumiSponsorRankFragment bangumiSponsorRankFragment) {
            this.f69354b = bangumiSponsorRankFragment;
        }

        @Override // Nl0.e
        public final void onLastItemVisible() {
            BangumiSponsorRankFragment bangumiSponsorRankFragment = this.f69354b;
            if (bangumiSponsorRankFragment.f69346c.getItemCount() > 1) {
                bangumiSponsorRankFragment.mf(true);
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final BangumiSponsorRankFragment nf(@NotNull RankType rankType, long j7, @Nullable String str, int i7) {
        BangumiSponsorRankFragment bangumiSponsorRankFragment = new BangumiSponsorRankFragment();
        Bundle bundle = new Bundle();
        bundle.putString("bundle_rank_type", String.valueOf(rankType.ordinal()));
        bundle.putString("bundle_av_id", String.valueOf(j7));
        bundle.putString("bundle_extra_id", str);
        bundle.putString("bundle_extra_type", String.valueOf(i7));
        Bundle bundle2 = new Bundle();
        bundle2.putString(RouteConstKt.PROPS_TOOLBAR_HIDE, "1");
        bundle.putBundle(RouteConstKt.BLROUTER_PROPS, bundle2);
        bangumiSponsorRankFragment.setArguments(bundle);
        return bangumiSponsorRankFragment;
    }

    public final void mf(boolean z6) {
        Single<BangumiSponsorRank> sponsorRankTotal;
        if (this.f69352j || this.f69353k) {
            return;
        }
        this.f69352j = true;
        if (z6) {
            this.f69351i++;
            this.f69346c.showFooterLoading();
        } else {
            showLoading();
            this.f69351i = 1;
        }
        this.f69347d = this.f69352j;
        if (this.f69349f <= 0) {
            String str = this.f69350g;
            sponsorRankTotal = null;
            if (str != null) {
                if (str.length() == 0) {
                    sponsorRankTotal = null;
                } else if (RankType.WEEK.ordinal() == this.f69348e) {
                    sponsorRankTotal = SponsorApiService.f69383a.getSponsorRankWeek(new SponsorApiService.SponsorRankParamsMap(this.f69350g, this.h, this.f69351i));
                } else {
                    sponsorRankTotal = null;
                    if (RankType.TOTAL.ordinal() == this.f69348e) {
                        sponsorRankTotal = SponsorApiService.f69383a.getSponsorRankTotal(new SponsorApiService.SponsorRankParamsMap(this.f69350g, this.h, this.f69351i));
                    }
                }
            }
        } else if (RankType.WEEK.ordinal() == this.f69348e) {
            sponsorRankTotal = SponsorApiService.f69383a.getSponsorRankWeek(new SponsorApiService.SponsorRankParamsMap(this.f69349f, this.f69351i));
        } else {
            sponsorRankTotal = null;
            if (RankType.TOTAL.ordinal() == this.f69348e) {
                sponsorRankTotal = SponsorApiService.f69383a.getSponsorRankTotal(new SponsorApiService.SponsorRankParamsMap(this.f69349f, this.f69351i));
            }
        }
        if (sponsorRankTotal != null) {
            Functions.v vVar = Functions.a;
            Disposable disposableSubscribe = sponsorRankTotal.subscribe(new p(this, 4), new i(this));
            if (disposableSubscribe != null) {
                com.bilibili.okretro.call.rxjava.c.a(disposableSubscribe, getLifecycle());
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        setTitle(getString(2131856740));
        this.f69353k = false;
        mf(false);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f69348e = BundleUtil.getInteger(arguments, "bundle_rank_type", new Integer[]{0}).intValue();
            this.f69349f = BundleUtil.getLong(arguments, "bundle_av_id", new long[]{0});
            this.f69350g = arguments.getString("bundle_extra_id");
            this.h = BundleUtil.getInteger(arguments, "bundle_extra_type", new Integer[]{0}).intValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$Adapter, xk0.c] */
    @Override // com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment
    public final void onViewCreated(@Nullable RecyclerView recyclerView, @Nullable Bundle bundle) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(p3());
        linearLayoutManager.setSmoothScrollbarEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        ?? cVar = new c();
        this.f69346c = cVar;
        recyclerView.setAdapter(cVar);
        recyclerView.addOnScrollListener(new a(this));
    }
}
