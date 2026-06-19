package com.bilibili.ogv.review.detailpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ogv.pub.review.bean.UserReview;
import com.bilibili.ogv.review.data.ReviewTag;
import com.bilibili.ogv.review.data.ReviewType;
import com.bilibili.ogv.review.detailpage.j;
import com.bilibili.ogv.review.detailpage.v;
import com.bilibili.ogv.review.widget.ReviewRatingBar;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/b.class */
@StabilityInferred(parameters = 0)
public final class b extends tv.danmaku.bili.widget.section.adapter.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f72329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final BangumiReviewFragment f72330g;

    @Nullable
    public final BangumiReviewFragment h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final BangumiReviewFragment f72331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final FragmentManager f72332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f72333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f72334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f72335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f72336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f72337o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public ReviewPublishInfo f72340r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public io.reactivex.rxjava3.subjects.a f72343u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f72338p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public Map<String, String> f72339q = MapsKt.emptyMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public List<ReviewItem> f72341s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final List<ReviewTag> f72342t = new ArrayList();

    public b(@NotNull String str, @Nullable BangumiReviewFragment bangumiReviewFragment, @Nullable BangumiReviewFragment bangumiReviewFragment2, @NotNull BangumiReviewFragment bangumiReviewFragment3, @NotNull FragmentManager fragmentManager, int i7, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f72329f = str;
        this.f72330g = bangumiReviewFragment;
        this.h = bangumiReviewFragment2;
        this.f72331i = bangumiReviewFragment3;
        this.f72332j = fragmentManager;
        this.f72333k = i7;
        this.f72334l = str2;
        this.f72335m = str3;
        this.f72336n = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String O() {
        /*
            r3 = this;
            r0 = r3
            java.util.List<com.bilibili.ogv.review.data.ReviewTag> r0 = r0.f72342t
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        Lc:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L38
            r0 = r7
            java.lang.Object r0 = r0.next()
            r5 = r0
            r0 = r5
            com.bilibili.ogv.review.data.ReviewTag r0 = (com.bilibili.ogv.review.data.ReviewTag) r0
            r6 = r0
            int r0 = com.bilibili.ogv.review.detailpage.v.f72420d
            r4 = r0
            r0 = r6
            com.bilibili.ogv.review.data.ReviewType r0 = r0.f72222b
            int r0 = com.bilibili.ogv.review.detailpage.v.a.b(r0)
            r1 = r3
            int r1 = r1.f72337o
            if (r0 != r1) goto Lc
            goto L3a
        L38:
            r0 = 0
            r5 = r0
        L3a:
            r0 = r5
            com.bilibili.ogv.review.data.ReviewTag r0 = (com.bilibili.ogv.review.data.ReviewTag) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L4f
            r0 = r5
            java.lang.String r0 = r0.f72221a
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L4f
            goto L7d
        L4f:
            r0 = r3
            int r0 = r0.f72337o
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L78
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L70
            r0 = r4
            r1 = 2
            if (r0 == r1) goto L68
            java.lang.String r0 = ""
            r5 = r0
            goto L7d
        L68:
            r0 = r3
            java.lang.String r0 = r0.f72335m
            r5 = r0
            goto L7d
        L70:
            r0 = r3
            java.lang.String r0 = r0.f72334l
            r5 = r0
            goto L7d
        L78:
            r0 = r3
            java.lang.String r0 = r0.f72336n
            r5 = r0
        L7d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.detailpage.b.O():java.lang.String");
    }

    public final void P(@NotNull ReviewType reviewType, @NotNull List<ReviewItem> list) {
        for (final ReviewItem reviewItem : list) {
            reviewItem.f72299n = new ExposureEntry(Pl0.b.f19035a, new Function0(this, reviewItem) { // from class: com.bilibili.ogv.review.detailpage.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f72327a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ReviewItem f72328b;

                {
                    this.f72327a = this;
                    this.f72328b = reviewItem;
                }

                public final Object invoke() {
                    String str;
                    b bVar = this.f72327a;
                    String strO = bVar.O();
                    long j7 = this.f72328b.h;
                    Neurons.reportExposure$default(false, "pgc.pgc-group-detail.review-list.0.show", MapsKt.plus(bVar.f72339q, MapsKt.mapOf(new Pair[]{TuplesKt.to("review_id", String.valueOf(j7)), TuplesKt.to("item_id", String.valueOf(j7)), TuplesKt.to("tag_name", strO)})), (List) null, 8, (Object) null);
                    int i7 = bVar.f72337o;
                    String str2 = bVar.f72329f;
                    if (i7 != 1) {
                        str = i7 == 2 ? ".long-review.review-card.show" : ".short-review.review-card.show";
                        return Unit.INSTANCE;
                    }
                    Neurons.reportExposure$default(false, G.p.a(str2, str), MapsKt.plus(bVar.f72339q, TuplesKt.to("entity_id", String.valueOf(j7))), (List) null, 8, (Object) null);
                    return Unit.INSTANCE;
                }
            });
        }
        this.f72341s = list;
        int i7 = this.f72337o;
        int i8 = v.f72420d;
        if (i7 == v.a.b(reviewType)) {
            if (list.isEmpty()) {
                this.f72338p = 2;
                notifySectionData();
            } else {
                this.f72338p = 0;
                notifySectionData();
            }
            notifySectionData();
        }
    }

    public final void fillSection(@NotNull BaseSectionAdapter.SectionManager sectionManager) {
        ReviewPublishInfo.PublishReview publishReview;
        UserReview userReview;
        ReviewPublishInfo.PublishReview publishReview2;
        UserReview userReview2;
        boolean zIsLogin = com.bilibili.ogv.infra.account.a.f67852b.isLogin();
        sectionManager.addSectionWithNone(1, 105);
        int i7 = this.f72337o;
        int i8 = this.f72333k;
        if (i7 == 1) {
            ReviewPublishInfo reviewPublishInfo = this.f72340r;
            if (((reviewPublishInfo == null || (publishReview2 = reviewPublishInfo.f71724b) == null || (userReview2 = publishReview2.f71731d) == null) ? 0L : userReview2.f71758a) != 0 && zIsLogin && i8 != 3 && i8 != 4) {
                sectionManager.addSectionWithNone(1, 103);
            }
            int i9 = this.f72338p;
            if (i9 == 3) {
                sectionManager.addSectionWithNone(1, 102);
                return;
            }
            if (i9 == 1) {
                sectionManager.addSectionWithNone(1, 100);
                return;
            }
            if (i9 == 2) {
                sectionManager.addSectionWithNone(1, 101);
                return;
            } else if (this.f72341s.size() > 0) {
                sectionManager.addSectionWithNone(this.f72341s.size(), BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD);
                return;
            } else {
                sectionManager.addSectionWithNone(1, 101);
                return;
            }
        }
        if (i7 != 2) {
            if (i7 == 0) {
                int i10 = this.f72338p;
                if (i10 == 3) {
                    sectionManager.addSectionWithNone(1, 102);
                    return;
                }
                if (i10 == 1) {
                    sectionManager.addSectionWithNone(1, 100);
                    return;
                }
                if (i10 == 2) {
                    sectionManager.addSectionWithNone(1, 101);
                    return;
                } else if (this.f72341s.size() > 0) {
                    sectionManager.addSectionWithNone(this.f72341s.size(), 108);
                    return;
                } else {
                    sectionManager.addSectionWithNone(1, 101);
                    return;
                }
            }
            return;
        }
        ReviewPublishInfo reviewPublishInfo2 = this.f72340r;
        if (((reviewPublishInfo2 == null || (publishReview = reviewPublishInfo2.f71724b) == null || (userReview = publishReview.f71732e) == null) ? 0L : userReview.f71758a) != 0 && zIsLogin && i8 != 3 && i8 != 4) {
            sectionManager.addSectionWithNone(1, 104);
        }
        int i11 = this.f72338p;
        if (i11 == 3) {
            sectionManager.addSectionWithNone(1, 102);
            return;
        }
        if (i11 == 1) {
            sectionManager.addSectionWithNone(1, 100);
            return;
        }
        if (i11 == 2) {
            sectionManager.addSectionWithNone(1, 101);
        } else if (this.f72341s.size() > 0) {
            sectionManager.addSectionWithNone(this.f72341s.size(), BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD);
        } else {
            sectionManager.addSectionWithNone(1, 101);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.ogv.review.detailpage.k] */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.ogv.review.detailpage.j, java.lang.Object, tv.danmaku.bili.widget.section.holder.BaseViewHolder] */
    /* JADX WARN: Type inference failed for: r0v82, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.ogv.review.detailpage.p] */
    public final void onBindHolder(@Nullable BaseViewHolder baseViewHolder, int i7, @Nullable View view) {
        String str;
        VipUserInfo.VipLabel label;
        if (baseViewHolder instanceof p) {
            ?? r02 = (p) baseViewHolder;
            ReviewPublishInfo reviewPublishInfo = this.f72340r;
            Context context = r02.itemView.getContext();
            ReviewPublishInfo.PublishReview publishReview = reviewPublishInfo.f71724b;
            ((ReviewRatingBar) r02.f72386d.getValue()).setRating(publishReview != null ? publishReview.f71728a : 0.0f);
            ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(((BiliImageView) r02.f72387e.getValue()).getContext());
            BiliAccountInfo biliAccountInfo = com.bilibili.ogv.infra.account.a.f67851a;
            AccountInfo accountInfoFromCache = biliAccountInfo.getAccountInfoFromCache();
            imageRequestBuilderWith.url(accountInfoFromCache != null ? accountInfoFromCache.getAvatar() : null).into((BiliImageView) r02.f72387e.getValue());
            VipUserInfo vipInfo = biliAccountInfo.getVipInfo();
            String labelTheme = (vipInfo == null || (label = vipInfo.getLabel()) == null) ? null : label.getLabelTheme();
            AccountInfo accountInfoFromCache2 = biliAccountInfo.getAccountInfoFromCache();
            ((TextView) r02.f72388f.getValue()).setText(Cl0.a.b(context, accountInfoFromCache2 != null ? accountInfoFromCache2.getUserName() : null, labelTheme));
            TextView textView = r02.f72389g;
            if (textView != null) {
                if (r02.f72385c) {
                    str = null;
                    if (publishReview != null) {
                        UserReview userReview = publishReview.f71731d;
                        str = null;
                        if (userReview != null) {
                            str = userReview.f71760c;
                        }
                    }
                } else {
                    str = null;
                    if (publishReview != null) {
                        UserReview userReview2 = publishReview.f71732e;
                        str = null;
                        if (userReview2 != null) {
                            str = userReview2.f71760c;
                        }
                    }
                }
                textView.setText(str);
                return;
            }
            return;
        }
        if (baseViewHolder instanceof r) {
            ((r) baseViewHolder).r0((ReviewItem) CollectionsKt.getOrNull(this.f72341s, getIndexInSection(i7)));
            return;
        }
        if (baseViewHolder instanceof o) {
            ((o) baseViewHolder).p0((ReviewItem) CollectionsKt.getOrNull(this.f72341s, getIndexInSection(i7)));
            return;
        }
        if (!(baseViewHolder instanceof j)) {
            if (baseViewHolder instanceof k) {
                ?? r03 = (k) baseViewHolder;
                ((TextView) r03.f72363b.getValue()).setText(this.f72337o == 1 ? r03.itemView.getContext().getString(2131857137) : r03.itemView.getContext().getString(2131857165));
                return;
            }
            return;
        }
        ?? r04 = (j) baseViewHolder;
        ReviewItem reviewItem = (ReviewItem) CollectionsKt.getOrNull(this.f72341s, getIndexInSection(i7));
        if (reviewItem == null) {
            r04.getClass();
            return;
        }
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(r04.itemView, reviewItem.f72299n);
        View view2 = r04.itemView;
        ViewGroup viewGroup = null;
        if (view2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) view2;
        }
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        int i8 = j.a.f72362a[reviewItem.f72290d.ordinal()];
        if (i8 == 1) {
            new r(p.a(viewGroup, 2131499862, viewGroup, true), r04.getAdapter(), r04.f72356b, r04.f72357c, r04.f72358d, r04.f72359e, r04.f72360f, r04.f72361g).r0(reviewItem);
        } else {
            if (i8 != 2) {
                return;
            }
            new o(p.a(viewGroup, 2131499860, viewGroup, true), r04.getAdapter(), r04.f72357c, r04.f72358d, r04.f72359e).p0(reviewItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [tv.danmaku.bili.widget.section.holder.BaseViewHolder] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.ogv.review.detailpage.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @NotNull
    public final BaseViewHolder onCreateHolder(@NotNull ViewGroup viewGroup, int i7) {
        ?? lVar;
        BangumiReviewFragment bangumiReviewFragment = this.f72331i;
        Context context = null;
        switch (i7) {
            case 100:
                Context context2 = null;
                if (viewGroup != null) {
                    context2 = viewGroup.getContext();
                }
                lVar = new l(LayoutInflater.from(context2).inflate(2131499858, viewGroup, false), this, this.h);
                break;
            case 101:
            default:
                Context context3 = null;
                if (viewGroup != null) {
                    context3 = viewGroup.getContext();
                }
                lVar = new k(LayoutInflater.from(context3).inflate(2131499857, viewGroup, false), this);
                break;
            case 102:
                Context context4 = null;
                if (viewGroup != null) {
                    context4 = viewGroup.getContext();
                }
                lVar = new BaseViewHolder(LayoutInflater.from(context4).inflate(2131499859, viewGroup, false), this);
                break;
            case 103:
                lVar = new p(p.a(viewGroup, 2131499861, viewGroup, false), this, bangumiReviewFragment, true);
                break;
            case 104:
                lVar = new p(p.a(viewGroup, 2131499861, viewGroup, false), this, bangumiReviewFragment, false);
                break;
            case 105:
                int i8 = v.f72420d;
                Observable observable = this.f72343u;
                if (observable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("reviewTagListObservable");
                    observable = null;
                }
                final ?? baseViewHolder = new BaseViewHolder(p.a(viewGroup, 2131499863, viewGroup, false), this);
                baseViewHolder.f72421b = this.f72330g;
                baseViewHolder.f72422c = new y(new com.bilibili.bplus.followingpublish.fragments.n((Object) baseViewHolder, 1));
                observable.subscribe(new u(baseViewHolder));
                ((ComposeView) baseViewHolder.itemView.findViewById(2131299283)).setContent(ComposableLambdaKt.composableLambdaInstance(558396579, true, new Function2(baseViewHolder) { // from class: com.bilibili.ogv.review.detailpage.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final v f72418a;

                    {
                        this.f72418a = baseViewHolder;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(558396579, iIntValue, -1, "com.bilibili.ogv.review.detailpage.ReviewTabHolder.<anonymous>.<anonymous> (ReviewTabHolder.kt:76)");
                            }
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1961245787, true, new com.bilibili.common.chronoscommon.p(this.f72418a, 1), composer, 54), composer, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }));
                lVar = baseViewHolder;
                break;
            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD /* 106 */:
                int i9 = r.f72392w;
                Map<String, String> map = this.f72339q;
                String strO = O();
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                lVar = new r(LayoutInflater.from(context).inflate(2131499862, viewGroup, false), this, this.f72331i, this.f72329f, map, this.f72332j, this.f72333k, strO);
                break;
            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD /* 107 */:
                int i10 = o.f72368r;
                lVar = new o(p.a(viewGroup, 2131499860, viewGroup, false), this, this.f72329f, this.f72339q, this.f72332j);
                break;
            case 108:
                int i11 = j.h;
                Map<String, String> map2 = this.f72339q;
                String strO2 = O();
                Context context5 = null;
                if (viewGroup != null) {
                    context5 = viewGroup.getContext();
                }
                lVar = new j(LayoutInflater.from(context5).inflate(2131499856, viewGroup, false), this, this.f72331i, this.f72329f, map2, this.f72332j, this.f72333k, strO2);
                break;
        }
        return lVar;
    }
}
