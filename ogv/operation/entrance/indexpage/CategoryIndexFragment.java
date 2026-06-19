package com.bilibili.ogv.operation.entrance.indexpage;

import ES0.C;
import ES0.G;
import ES0.H;
import ES0.I;
import ES0.J;
import Hk0.A;
import Hk0.j;
import Hk0.l;
import Hk0.m;
import Hk0.n;
import Hk0.s;
import Hk0.t;
import Hk0.u;
import Hk0.w;
import VS.a;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.risk.banned.LiveBanUserDialog;
import com.bilibili.bplus.followingcard.widget.DynamicTagItemLayout;
import com.bilibili.bplus.im.aichat.conversation.AiConversationActivity;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout;
import com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryCondition;
import com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryResult;
import com.bilibili.ogv.operation.entrance.indexpage.CategoryIndexFragment;
import com.bilibili.ogv.operation.entrance.indexpage.PreSelectedFilter;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.google.android.material.appbar.AppBarLayout;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppBuildConfig;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/CategoryIndexFragment.class */
@StabilityInferred(parameters = 0)
public final class CategoryIndexFragment extends BaseFragment implements View.OnClickListener, BaseAdapter.HandleClickListener, IPvTracker, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public static final String[] f70134A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f70135y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f70136z;

    @Nullable
    public List<PreSelectedFilter> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Boolean f70143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public d f70144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public GridLayoutManager f70145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public List<? extends BangumiCategoryCondition.Item> f70146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f70147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f70148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f70149o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f70152r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f70154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f70155u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f70137b = LazyKt.lazy(new C(this, 1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f70138c = LazyKt.lazy(new I(this, 1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f70139d = LazyKt.lazy(new J(this, 1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f70140e = LazyKt.lazy(new l(this, 0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f70141f = LazyKt.lazy(new m(this, 0));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f70142g = LazyKt.lazy(new n(this, 0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f70150p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public Bundle f70151q = new Bundle();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f70153s = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public List<? extends BangumiCategoryCondition.Filter> f70156v = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final HashMap<String, BangumiCategoryCondition.Item> f70157w = new LinkedHashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final A f70158x = new A();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/CategoryIndexFragment$Type.class */
    public static final class Type {
        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;

        @NotNull
        private final String type;
        private final long value;
        public static final Type BANGUMI = new Type("BANGUMI", 0, "bangumi", 1);
        public static final Type MOVIE = new Type("MOVIE", 1, "movie", 2);
        public static final Type DOC = new Type("DOC", 2, "doc", 3);
        public static final Type DOMESTIC = new Type("DOMESTIC", 3, "domestic", 4);
        public static final Type TV = new Type("TV", 4, "tv", 5);
        public static final Type VARIETY = new Type("VARIETY", 5, "variety", 7);
        public static final Type ANIME = new Type("ANIME", 6, "anime", 101);
        public static final Type REALLIFE = new Type("REALLIFE", 7, "reallife", 102);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BANGUMI, MOVIE, DOC, DOMESTIC, TV, VARIETY, ANIME, REALLIFE};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        private Type(String str, int i7, String str2, long j7) {
            this.type = str2;
            this.value = j7;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final long getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/CategoryIndexFragment$a.class */
    public static final class a<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CategoryIndexFragment f70159a;

        public a(CategoryIndexFragment categoryIndexFragment) {
            this.f70159a = categoryIndexFragment;
        }

        public final void accept(Object obj) {
            this.f70159a.f70143i = (Boolean) obj;
        }
    }

    static {
        AppBuildConfig.Companion companion = AppBuildConfig.Companion;
        f70135y = companion.isHDApp() ? 6 : 3;
        f70136z = companion.isHDApp() ? 24 : 21;
        f70134A = new String[]{"style_id", "producer_id", "year", "area", "is_finish", "season_version", "season_status", "copyright", "season_month", "pub_date", "order", "sort"};
    }

    public static final String jf(CategoryIndexFragment categoryIndexFragment) {
        return StringsKt.isBlank(categoryIndexFragment.f70150p) ? Intrinsics.areEqual(categoryIndexFragment.f70152r, "type_bangumi") ? "pgc.bangumi-index.botton.0.click" : "pgc.cinema-index.botton.0.click" : android.support.v4.media.a.a("pgc.", categoryIndexFragment.f70150p, ".botton.0.click");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final String getPvEventId() {
        if (Intrinsics.areEqual(this.f70152r, "type_bangumi")) {
            return "pgc.bangumi-index.0.0.pv";
        }
        return this.f70150p.length() == 0 ? null : android.support.v4.media.a.a("pgc.", this.f70150p, ".0.0.pv");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return this.f70151q;
    }

    public final void handleClick(@NotNull BaseViewHolder baseViewHolder) {
        if (baseViewHolder instanceof e) {
            final int i7 = 0;
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: Hk0.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f8707a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f8708b;

                {
                    this.f8707a = i7;
                    this.f8708b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f8707a) {
                        case 0:
                            CategoryIndexFragment categoryIndexFragment = (CategoryIndexFragment) this.f8708b;
                            int i8 = CategoryIndexFragment.f70135y;
                            if (view.getTag(2131312914) instanceof BangumiCategoryResult.ResultBean) {
                                BangumiCategoryResult.ResultBean resultBean = (BangumiCategoryResult.ResultBean) view.getTag(2131312914);
                                Nl0.h.c(view.getContext(), resultBean.link, 3, 64, StringsKt.isBlank(categoryIndexFragment.f70150p) ? Intrinsics.areEqual(categoryIndexFragment.f70152r, "type_bangumi") ? "pgc.bangumi-index.0.0" : "pgc.cinema-index.0.0" : android.support.v4.media.a.a("pgc.", categoryIndexFragment.f70150p, ".0.0"));
                                List<? extends BangumiCategoryCondition.Item> list = categoryIndexFragment.f70146l;
                                if (list == null || !list.isEmpty()) {
                                    List<? extends BangumiCategoryCondition.Item> list2 = categoryIndexFragment.f70146l;
                                    String str = "";
                                    String str2 = str;
                                    if (list2 != null) {
                                        Iterator<T> it = list2.iterator();
                                        while (true) {
                                            str2 = str;
                                            if (it.hasNext()) {
                                                BangumiCategoryCondition.Item item = (BangumiCategoryCondition.Item) it.next();
                                                if (Intrinsics.areEqual(item.field, categoryIndexFragment.f70147m)) {
                                                    str = item.name;
                                                }
                                            }
                                        }
                                    }
                                    String strA = StringsKt.isBlank(categoryIndexFragment.f70150p) ? Intrinsics.areEqual(categoryIndexFragment.f70152r, "type_bangumi") ? "pgc.bangumi-index.0.0.click" : "pgc.cinema-index.0.0.click" : android.support.v4.media.a.a("pgc.", categoryIndexFragment.f70150p, ".0.0.click");
                                    long j7 = categoryIndexFragment.f70149o;
                                    long j8 = resultBean.seasonId;
                                    String str3 = resultBean.title;
                                    HashMap<String, BangumiCategoryCondition.Item> map = categoryIndexFragment.f70157w;
                                    HashMap map2 = new HashMap();
                                    if (map != null) {
                                        map2.put("season_id", String.valueOf(j8));
                                        map2.put("season_title", str3);
                                        map2.put("order", str2);
                                        map2.put("index_type", String.valueOf(j7));
                                        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                                            map2.put((String) entry.getKey(), ((BangumiCategoryCondition.Item) entry.getValue()).name);
                                        }
                                    }
                                    Neurons.reportClick(false, strA, map2);
                                }
                            }
                            break;
                        case 1:
                            LiveBanUserDialog liveBanUserDialog = (LiveBanUserDialog) this.f8708b;
                            LiveBanUserDialog.Companion companion = LiveBanUserDialog.Companion;
                            liveBanUserDialog.dismissAllowingStateLoss();
                            break;
                        default:
                            DynamicTagItemLayout.a aVar = (DynamicTagItemLayout.a) this.f8708b;
                            int i9 = DynamicTagItemLayout.h;
                            a.a aVar2 = aVar.a;
                            com.bilibili.bplus.followinglist.page.browser.ui.a aVar3 = aVar2.a.c;
                            if (aVar3 != null) {
                                DynamicTagItemLayout dynamicTagItemLayout = aVar2.b;
                                Context context = dynamicTagItemLayout.getContext();
                                Boolean bool = Boolean.TRUE;
                                Object tag = dynamicTagItemLayout.getTag(2131312914);
                                Object obj = tag;
                                if (tag == null) {
                                    obj = null;
                                }
                                aVar3.invoke(context, bool, obj);
                            }
                            break;
                    }
                }
            });
        }
    }

    public final BangumFilterLayout kf() {
        return (BangumFilterLayout) this.f70139d.getValue();
    }

    public final RecyclerView lf() {
        return (RecyclerView) this.f70137b.getValue();
    }

    public final void mf() {
        this.f70155u = false;
        of(false);
    }

    public final void nf() {
        Map<String, String> mapBuild;
        ComposeView composeView = (ComposeView) this.f70138c.getValue();
        if (composeView != null) {
            Tl0.f.a(composeView);
        }
        A a7 = this.f70158x;
        if (Intrinsics.areEqual(this.f70152r, "type_bangumi")) {
            mapBuild = MapsKt.mapOf(TuplesKt.to("season_type", String.valueOf(this.f70149o)));
        } else {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("index_type", String.valueOf(this.f70149o));
            mapBuild = MapsKt.build(mapCreateMapBuilder);
        }
        Single<BangumiCategoryCondition> indexCondition = a7.f8685a.getIndexCondition(mapBuild, "0");
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(indexCondition.subscribe(new Hk0.i(this), new j(this)), getLifecycle());
    }

    public final void of(final boolean z6) {
        if (this.f70154t || this.f70155u) {
            return;
        }
        this.f70154t = true;
        if (z6) {
            this.f70153s++;
            d dVar = this.f70144j;
            if (dVar != null) {
                dVar.showFooterLoading();
            }
        } else {
            d dVar2 = this.f70144j;
            if (dVar2 != null) {
                ((ArrayList) dVar2.f70171f).clear();
                dVar2.hideLoadMore();
            }
            ComposeView composeView = (ComposeView) this.f70138c.getValue();
            if (composeView != null) {
                Tl0.f.a(composeView);
            }
            this.f70153s = 1;
        }
        HashMap map = new HashMap();
        map.put("index_type", String.valueOf(this.f70149o));
        map.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, String.valueOf(this.f70153s));
        map.put("pagesize", String.valueOf(f70136z));
        String str = this.f70147m;
        if (str != null && str.length() != 0) {
            String str2 = this.f70147m;
            String str3 = str2;
            if (str2 == null) {
                str3 = "0";
            }
            map.put("order", str3);
            String str4 = this.f70148n;
            String str5 = str4;
            if (str4 == null) {
                str5 = "0";
            }
            map.put("sort", str5);
        }
        for (Map.Entry entry : ((LinkedHashMap) this.f70157w).entrySet()) {
            map.put((String) entry.getKey(), ((BangumiCategoryCondition.Item) entry.getValue()).keyword);
        }
        A a7 = this.f70158x;
        a7.getClass();
        Single<BangumiCategoryResult> indexResult = a7.f8685a.getIndexResult(MapsKt.plus(map, MapsKt.mapOf(TuplesKt.to("type", "0"))));
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(indexResult.subscribe(new Consumer(this, z6) { // from class: Hk0.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CategoryIndexFragment f8710a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f8711b;

            {
                this.f8710a = this;
                this.f8711b = z6;
            }

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
            public final void accept(Object obj) {
                com.bilibili.ogv.operation.entrance.indexpage.d dVar3;
                com.bilibili.ogv.operation.entrance.indexpage.d dVar4;
                BangumiCategoryResult bangumiCategoryResult = (BangumiCategoryResult) obj;
                CategoryIndexFragment categoryIndexFragment = this.f8710a;
                categoryIndexFragment.f70154t = false;
                List<BangumiCategoryResult.ResultBean> list = bangumiCategoryResult.list;
                if (list == null || list.isEmpty()) {
                    categoryIndexFragment.f70155u = true;
                }
                com.bilibili.ogv.operation.entrance.indexpage.d dVar5 = categoryIndexFragment.f70144j;
                int size = dVar5 != null ? ((ArrayList) dVar5.f70171f).size() : 0;
                com.bilibili.ogv.operation.entrance.indexpage.d dVar6 = categoryIndexFragment.f70144j;
                boolean z7 = this.f8711b;
                if (dVar6 != null) {
                    List<BangumiCategoryResult.ResultBean> list2 = bangumiCategoryResult.list;
                    if (!z7) {
                        ((ArrayList) dVar6.f70171f).clear();
                    }
                    if (list2 != null && !list2.isEmpty()) {
                        ((ArrayList) dVar6.f70171f).addAll(list2);
                    }
                }
                if (categoryIndexFragment.f70155u && (dVar4 = categoryIndexFragment.f70144j) != null) {
                    dVar4.showFooterEmpty();
                }
                if (z7) {
                    com.bilibili.ogv.operation.entrance.indexpage.d dVar7 = categoryIndexFragment.f70144j;
                    if (dVar7 != null) {
                        dVar7.notifySectionData(false);
                    }
                    tv.danmaku.bili.widget.section.adapter.a aVar = categoryIndexFragment.f70144j;
                    if (aVar != null) {
                        List<BangumiCategoryResult.ResultBean> list3 = bangumiCategoryResult.list;
                        aVar.notifyItemRangeInserted(size, list3 != null ? list3.size() : 0);
                    }
                } else {
                    com.bilibili.ogv.operation.entrance.indexpage.d dVar8 = categoryIndexFragment.f70144j;
                    if (dVar8 != null) {
                        dVar8.notifySectionData();
                    }
                }
                if (z7 || (dVar3 = categoryIndexFragment.f70144j) == null || ((ArrayList) dVar3.f70171f).size() != 0) {
                    ComposeView composeView2 = (ComposeView) categoryIndexFragment.f70138c.getValue();
                    if (composeView2 != null) {
                        composeView2.setVisibility(8);
                        return;
                    }
                    return;
                }
                com.bilibili.ogv.operation.entrance.indexpage.d dVar9 = categoryIndexFragment.f70144j;
                if (dVar9 != null) {
                    dVar9.hideFooter();
                }
                ComposeView composeView3 = (ComposeView) categoryIndexFragment.f70138c.getValue();
                if (composeView3 != null) {
                    long j7 = categoryIndexFragment.f70149o;
                    String string = categoryIndexFragment.getString(j7 == CategoryIndexFragment.Type.TV.getValue() ? 2131824502 : j7 == CategoryIndexFragment.Type.DOC.getValue() ? 2131824500 : j7 == CategoryIndexFragment.Type.MOVIE.getValue() ? 2131824501 : j7 == CategoryIndexFragment.Type.VARIETY.getValue() ? 2131824503 : 2131821950);
                    G g7 = new G(categoryIndexFragment, 1);
                    composeView3.setVisibility(0);
                    composeView3.setContent(ComposableLambdaKt.composableLambdaInstance(-202755488, true, new Tl0.c(string, g7, 0)));
                }
            }
        }, new Consumer(this, z6) { // from class: Hk0.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CategoryIndexFragment f8712a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f8713b;

            {
                this.f8712a = this;
                this.f8713b = z6;
            }

            public final void accept(Object obj) {
                CategoryIndexFragment categoryIndexFragment = this.f8712a;
                categoryIndexFragment.f70154t = false;
                if (!this.f8713b) {
                    ComposeView composeView2 = (ComposeView) categoryIndexFragment.f70138c.getValue();
                    if (composeView2 != null) {
                        Tl0.f.b(composeView2, new H(categoryIndexFragment, 1));
                        return;
                    }
                    return;
                }
                categoryIndexFragment.f70153s--;
                com.bilibili.ogv.operation.entrance.indexpage.d dVar3 = categoryIndexFragment.f70144j;
                if (dVar3 != null) {
                    dVar3.showFooterError();
                }
            }
        }), getLifecycle());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131314690) {
            RecyclerView recyclerViewLf = lf();
            int i7 = 0;
            if (recyclerViewLf != null) {
                recyclerViewLf.scrollToPosition(0);
            }
            qf(0);
            final BangumFilterLayout bangumFilterLayoutKf = kf();
            if (bangumFilterLayoutKf != null) {
                bangumFilterLayoutKf.c();
                int i8 = bangumFilterLayoutKf.f70108o;
                int i9 = bangumFilterLayoutKf.f70110q;
                if (i9 < 0) {
                    i7 = i9;
                }
                int i10 = i8;
                if (i8 > i9) {
                    i10 = i9;
                }
                ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(i7, i10);
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.addListener(new c(bangumFilterLayoutKf));
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(bangumFilterLayoutKf) { // from class: Hk0.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BangumFilterLayout f8686a;

                    {
                        this.f8686a = bangumFilterLayoutKf;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BangumFilterLayout bangumFilterLayout = this.f8686a;
                        LinearLayout linearLayout = bangumFilterLayout.f70098d;
                        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
                        if (layoutParams != null) {
                            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        }
                        if (layoutParams != null) {
                            layoutParams.width = -1;
                        }
                        LinearLayout linearLayout2 = bangumFilterLayout.f70098d;
                        if (linearLayout2 != null) {
                            linearLayout2.setLayoutParams(layoutParams);
                        }
                        LinearLayout linearLayout3 = bangumFilterLayout.f70098d;
                        if (linearLayout3 != null) {
                            linearLayout3.requestLayout();
                        }
                    }
                });
                valueAnimatorOfInt.start();
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        PreSelectedFilter preSelectedFilter;
        List<PreSelectedFilter> list;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f70149o = arguments.getLong("index_type");
            String string = arguments.getString("page_name");
            String str = string;
            if (string == null) {
                str = "";
            }
            this.f70150p = str;
            arguments.getInt("page_index");
            Bundle bundle2 = arguments.getBundle("report");
            Bundle bundle3 = bundle2;
            if (bundle2 == null) {
                bundle3 = new Bundle();
            }
            this.f70151q = bundle3;
            this.f70152r = arguments.getString("page_type");
            this.h = new ArrayList();
            for (String str2 : f70134A) {
                long j7 = this.f70149o;
                if ((j7 == 0 || j7 == -100) && Intrinsics.areEqual(str2, "area")) {
                    String string2 = arguments.getString(str2);
                    this.f70149o = (string2 == null || !Intrinsics.areEqual(string2, "1,6,7")) ? Type.BANGUMI.getValue() : Type.DOMESTIC.getValue();
                }
                String string3 = arguments.getString(str2);
                if (string3 == null || string3.length() == 0) {
                    preSelectedFilter = null;
                } else {
                    preSelectedFilter = new PreSelectedFilter();
                    preSelectedFilter.f70160a = str2;
                    preSelectedFilter.f70162c = new ArrayList();
                    PreselectedFilterItem preselectedFilterItem = new PreselectedFilterItem();
                    preselectedFilterItem.f70163a = string3;
                    preSelectedFilter.f70162c.add(preselectedFilterItem);
                }
                if (preSelectedFilter != null && (list = this.h) != null) {
                    ((ArrayList) list).add(preSelectedFilter);
                }
            }
        }
        if (this.h != null) {
            final int i7 = 0;
            com.bilibili.okretro.call.rxjava.c.a(Single.fromCallable(new Callable(this, i7) { // from class: Hk0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f8699a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f8700b;

                {
                    this.f8699a = i7;
                    this.f8700b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z6;
                    Object obj = this.f8700b;
                    switch (this.f8699a) {
                        case 0:
                            List<PreSelectedFilter> list2 = ((CategoryIndexFragment) obj).h;
                            Parcelable.Creator<PreSelectedFilter> creator = PreSelectedFilter.CREATOR;
                            if (list2 == null) {
                                z6 = false;
                            } else {
                                Iterator it = ((ArrayList) list2).iterator();
                                while (it.hasNext()) {
                                    Collections.sort(((PreSelectedFilter) it.next()).f70162c);
                                }
                                Collections.sort(list2);
                                z6 = true;
                            }
                            return Boolean.valueOf(z6);
                        default:
                            int i8 = AiConversationActivity.y1;
                            return Boolean.valueOf(BiliImageLoaderHelper.isInDiskCacheSync((String) obj));
                    }
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(this)), getLifecycle());
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499609, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        BangumFilterLayout bangumFilterLayoutKf = kf();
        if (bangumFilterLayoutKf != null && (viewTreeObserver = bangumFilterLayoutKf.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        ThemeUtils.removeSwitchColor(getContext());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        BangumFilterLayout bangumFilterLayoutKf;
        if (((CoordinatorLayout) this.f70141f.getValue()) == null || (bangumFilterLayoutKf = kf()) == null) {
            return;
        }
        bangumFilterLayoutKf.setMaxHeight(((CoordinatorLayout) this.f70141f.getValue()).getHeight() - ((CoordinatorLayout) this.f70141f.getValue()).getContext().getResources().getDimensionPixelSize(2131165356));
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        BangumFilterLayout bangumFilterLayoutKf = kf();
        if (bangumFilterLayoutKf != null) {
            bangumFilterLayoutKf.setOnFilterMenuItemClickListener(new f(this));
        }
        BangumFilterLayout bangumFilterLayoutKf2 = kf();
        if (bangumFilterLayoutKf2 != null) {
            bangumFilterLayoutKf2.setOnFilterSortItemClickListener(new g(this));
        }
        BangumFilterLayout bangumFilterLayoutKf3 = kf();
        if (bangumFilterLayoutKf3 != null) {
            bangumFilterLayoutKf3.setOnExpandClickListener(new h(this));
        }
        BangumFilterLayout bangumFilterLayoutKf4 = kf();
        if (bangumFilterLayoutKf4 != null && (viewTreeObserver = bangumFilterLayoutKf4.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        TextView textView = (TextView) this.f70142g.getValue();
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        Context contextRequireContext = requireContext();
        int iB = Uj0.c.b(6.0f, contextRequireContext);
        RecyclerView recyclerViewLf = lf();
        if (recyclerViewLf != null) {
            recyclerViewLf.addItemDecoration(new s(iB));
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(contextRequireContext, f70135y);
        this.f70145k = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new t(this));
        this.f70144j = new d();
        RecyclerView recyclerViewLf2 = lf();
        if (recyclerViewLf2 != null) {
            recyclerViewLf2.setLayoutManager(this.f70145k);
        }
        RecyclerView recyclerViewLf3 = lf();
        if (recyclerViewLf3 != null) {
            recyclerViewLf3.setAdapter(this.f70144j);
        }
        d dVar = this.f70144j;
        if (dVar != null) {
            dVar.setHandleClickListener(this);
        }
        RecyclerView recyclerViewLf4 = lf();
        if (recyclerViewLf4 != null) {
            recyclerViewLf4.addOnScrollListener(new u(this));
        }
        RecyclerView recyclerViewLf5 = lf();
        if (recyclerViewLf5 != null) {
            recyclerViewLf5.addOnScrollListener(new w(this));
        }
        AppBarLayout appBarLayout = (AppBarLayout) this.f70140e.getValue();
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: Hk0.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CategoryIndexFragment f8709a;

                {
                    this.f8709a = this;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i7) {
                    FrameLayout frameLayout;
                    FrameLayout frameLayout2;
                    int i8 = CategoryIndexFragment.f70135y;
                    int iAbs = Math.abs(i7);
                    int totalScrollRange = appBarLayout2.getTotalScrollRange();
                    CategoryIndexFragment categoryIndexFragment = this.f8709a;
                    if (iAbs < totalScrollRange) {
                        TextView textView2 = (TextView) categoryIndexFragment.f70142g.getValue();
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                        BangumFilterLayout bangumFilterLayoutKf5 = categoryIndexFragment.kf();
                        if (bangumFilterLayoutKf5 == null || (frameLayout = bangumFilterLayoutKf5.f70101g) == null) {
                            return;
                        }
                        frameLayout.setVisibility(0);
                        return;
                    }
                    TextView textView3 = (TextView) categoryIndexFragment.f70142g.getValue();
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    TextView textView4 = (TextView) categoryIndexFragment.f70142g.getValue();
                    if (textView4 != null) {
                        BangumFilterLayout bangumFilterLayoutKf6 = categoryIndexFragment.kf();
                        textView4.setText(bangumFilterLayoutKf6 != null ? bangumFilterLayoutKf6.getSelectedItem() : null);
                    }
                    BangumFilterLayout bangumFilterLayoutKf7 = categoryIndexFragment.kf();
                    if (bangumFilterLayoutKf7 == null || (frameLayout2 = bangumFilterLayoutKf7.f70101g) == null) {
                        return;
                    }
                    frameLayout2.setVisibility(8);
                }
            });
        }
        nf();
    }

    public final void pf() {
        BangumFilterLayout.a aVar;
        List<? extends BangumiCategoryCondition.Filter> list = this.f70156v;
        if (list != null) {
            for (BangumiCategoryCondition.Filter filter : list) {
                List<BangumiCategoryCondition.Item> list2 = filter.values;
                if (list2 != null) {
                    int size = list2.size();
                    int i7 = 0;
                    while (i7 < size) {
                        BangumiCategoryCondition.Item item = list2.get(i7);
                        boolean z6 = i7 == 0;
                        item.isSelect = z6;
                        if (z6) {
                            this.f70157w.put(filter.field, item);
                        }
                        i7++;
                    }
                }
            }
        }
        List<? extends BangumiCategoryCondition.Item> list3 = this.f70146l;
        if (list3 != null && !list3.isEmpty()) {
            this.f70147m = list3.get(0).field;
            int size2 = list3.size();
            int i8 = 0;
            while (i8 < size2) {
                list3.get(i8).isSelect = i8 == 0;
                i8++;
            }
        }
        BangumFilterLayout bangumFilterLayoutKf = kf();
        if (bangumFilterLayoutKf == null || (aVar = bangumFilterLayoutKf.f70103j) == null) {
            return;
        }
        aVar.notifyDataSetChanged();
    }

    public final void qf(int i7) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f70140e.getValue();
        AppBarLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) (appBarLayout != null ? appBarLayout.getLayoutParams() : null)).getBehavior();
        if (behavior instanceof AppBarLayout.Behavior) {
            behavior.setTopAndBottomOffset(i7);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        PageViewTracker.getInstance().setFragmentVisibility(this, z6);
    }
}
