package com.bilibili.ogv.review.detailpage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ogv.pub.review.bean.ReviewShareData;
import com.bilibili.ogv.pub.review.bean.ShortReview;
import com.bilibili.ogv.review.data.BangumiReviewApiService;
import com.bilibili.ogv.review.data.ReviewTag;
import com.bilibili.ogv.review.data.ReviewType;
import com.bilibili.ogv.review.detailpage.OGVReviewService;
import com.bilibili.ogv.review.detailpage.ReviewSourceType;
import com.bilibili.ogv.review.detailpage.v;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.gson.reflect.TypeToken;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;
import tv.danmaku.bili.widget.section.holder.LoadMoreHolder;
import wl0.InterfaceC8899a;
import zl0.C9206e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment.class */
@StabilityInferred(parameters = 0)
public final class BangumiReviewFragment extends BaseFragment implements View.OnClickListener, InterfaceC8899a, BaseAdapter.HandleClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f72233d;

    @Nullable
    public ShortReview h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f72237i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f72239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.bilibili.ogv.review.detailpage.b f72240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public OGVReviewService f72241m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f72243o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public PinnedBottomScrollingBehavior f72247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f72248t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f72249u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f72250v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f72231b = LazyKt.lazy(new com.bilibili.bililive.room.ui.roomv3.base.viewmodel.l(this, 1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f72232c = LazyKt.lazy(new com.bilibili.biligame.ui.playing.widget.j(this, 3));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f72234e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public Map<String, String> f72235f = MapsKt.emptyMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public ReviewSourceType f72236g = ReviewSourceType.PLAYER_DETAIL;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72238j = ReviewType.SHORT_REVIEW.m7667getValue().intValue();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f72242n = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<wl0.c> f72244p = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ReviewShareData> f72245q = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.review.k f72246r = new com.bilibili.ogv.review.k(new Function0(this) { // from class: com.bilibili.ogv.review.detailpage.c

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiReviewFragment f72344a;

        {
            this.f72344a = this;
        }

        public final Object invoke() {
            BangumiReviewFragment bangumiReviewFragment = this.f72344a;
            Neurons.reportClick(false, "pgc.pgc-video-detail.review-detail.short-publish.click", bangumiReviewFragment.f72235f);
            Neurons.reportClick(false, G.p.a(bangumiReviewFragment.f72234e, ".popup-review.button.click"), MapsKt.plus(bangumiReviewFragment.f72235f, TuplesKt.to("button_name", "short-evaluate")));
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(bangumiReviewFragment), (CoroutineContext) null, (CoroutineStart) null, new BangumiReviewFragment$menuVm$1$1(bangumiReviewFragment, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }, new Function0(this) { // from class: com.bilibili.ogv.review.detailpage.d

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiReviewFragment f72345a;

        {
            this.f72345a = this;
        }

        public final Object invoke() {
            BangumiReviewFragment bangumiReviewFragment = this.f72345a;
            Neurons.reportClick(false, "pgc.pgc-video-detail.review-detail.long-publish.click", bangumiReviewFragment.f72235f);
            Neurons.reportClick(false, G.p.a(bangumiReviewFragment.f72234e, ".popup-review.button.click"), MapsKt.plus(bangumiReviewFragment.f72235f, TuplesKt.to("button_name", "long-evaluate")));
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(bangumiReviewFragment), (CoroutineContext) null, (CoroutineStart) null, new BangumiReviewFragment$menuVm$2$1(bangumiReviewFragment, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$a.class */
    public static final class a extends TypeToken<Map<String, ? extends String>> {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$b.class */
    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f72251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiReviewFragment f72252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f72253c;

        public b(View view, BangumiReviewFragment bangumiReviewFragment, View view2) {
            this.f72251a = view;
            this.f72252b = bangumiReviewFragment;
            this.f72253c = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f72251a.removeOnAttachStateChangeListener(this);
            this.f72252b.f72247s = Ll0.a.a(this.f72253c);
            BangumiReviewFragment bangumiReviewFragment = this.f72252b;
            PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior = bangumiReviewFragment.f72247s;
            if (pinnedBottomScrollingBehavior != null) {
                pinnedBottomScrollingBehavior.addPinnedView(bangumiReviewFragment.jf());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$c.class */
    public static final class c extends Nl0.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiReviewFragment f72254b;

        public c(BangumiReviewFragment bangumiReviewFragment) {
            this.f72254b = bangumiReviewFragment;
        }

        @Override // Nl0.e
        public final void onLastItemVisible() {
            BangumiReviewFragment bangumiReviewFragment = this.f72254b;
            BaseSectionAdapter baseSectionAdapter = bangumiReviewFragment.f72240l;
            com.bilibili.ogv.review.detailpage.b bVar = null;
            BaseSectionAdapter baseSectionAdapter2 = baseSectionAdapter;
            if (baseSectionAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                baseSectionAdapter2 = null;
            }
            if (baseSectionAdapter2.getItemCount() >= 3) {
                com.bilibili.ogv.review.detailpage.b bVar2 = bangumiReviewFragment.f72240l;
                com.bilibili.ogv.review.detailpage.b bVar3 = bVar2;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    bVar3 = null;
                }
                if (bVar3.f72338p == 0) {
                    OGVReviewService oGVReviewService = bangumiReviewFragment.f72241m;
                    if (oGVReviewService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("reviewService");
                        oGVReviewService = null;
                    }
                    int i7 = v.f72420d;
                    com.bilibili.ogv.review.detailpage.b bVar4 = bangumiReviewFragment.f72240l;
                    if (bVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        bVar = bVar4;
                    }
                    OGVReviewService.d(oGVReviewService, v.a.a(bVar.f72337o), true, bangumiReviewFragment.getLifecycle(), bangumiReviewFragment.f72236g, null, 0L, 0, 240);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$d.class */
    public static final class d<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiReviewFragment f72255a;

        public d(BangumiReviewFragment bangumiReviewFragment) {
            this.f72255a = bangumiReviewFragment;
        }

        public final void accept(Object obj) {
            List list = (List) obj;
            com.bilibili.ogv.review.detailpage.b bVar = this.f72255a.f72240l;
            com.bilibili.ogv.review.detailpage.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                bVar2 = null;
            }
            ((ArrayList) bVar2.f72342t).clear();
            ((ArrayList) bVar2.f72342t).addAll(list);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$e.class */
    public static final class e<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiReviewFragment f72256a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$e$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f72257a;

            static {
                int[] iArr = new int[OGVReviewService.ReviewLoadState.values().length];
                try {
                    iArr[OGVReviewService.ReviewLoadState.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[OGVReviewService.ReviewLoadState.LOAD_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[OGVReviewService.ReviewLoadState.LOAD_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f72257a = iArr;
            }
        }

        public e(BangumiReviewFragment bangumiReviewFragment) {
            this.f72256a = bangumiReviewFragment;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void accept(Object obj) throws NoWhenBranchMatchedException {
            OGVReviewService.a aVar = (OGVReviewService.a) obj;
            int i7 = a.f72257a[aVar.f72271a.ordinal()];
            com.bilibili.ogv.review.detailpage.b bVar = null;
            BangumiReviewFragment bangumiReviewFragment = this.f72256a;
            boolean z6 = aVar.f72272b;
            if (i7 == 1) {
                if (z6) {
                    com.bilibili.ogv.review.detailpage.b bVar2 = bangumiReviewFragment.f72240l;
                    if (bVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        bVar = bVar2;
                    }
                    bVar.showFooterLoading();
                    return;
                }
                BaseSectionAdapter baseSectionAdapter = bangumiReviewFragment.f72240l;
                if (baseSectionAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    baseSectionAdapter = null;
                }
                baseSectionAdapter.f72338p = 3;
                baseSectionAdapter.notifySectionData();
                return;
            }
            if (i7 == 2) {
                com.bilibili.ogv.review.detailpage.b bVar3 = bangumiReviewFragment.f72240l;
                com.bilibili.ogv.review.detailpage.b bVar4 = bVar3;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    bVar4 = null;
                }
                bVar4.hideFooter();
                if (aVar.f72273c) {
                    return;
                }
                com.bilibili.ogv.review.detailpage.b bVar5 = bangumiReviewFragment.f72240l;
                if (bVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    bVar5 = null;
                }
                bVar5.showFooterEmpty();
                return;
            }
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            com.bilibili.ogv.review.detailpage.b bVar6 = bangumiReviewFragment.f72240l;
            com.bilibili.ogv.review.detailpage.b bVar7 = bVar6;
            if (bVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                bVar7 = null;
            }
            bVar7.hideFooter();
            if (z6) {
                com.bilibili.ogv.review.detailpage.b bVar8 = bangumiReviewFragment.f72240l;
                if (bVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    bVar8 = null;
                }
                bVar8.showFooterError();
                return;
            }
            BaseSectionAdapter baseSectionAdapter2 = bangumiReviewFragment.f72240l;
            if (baseSectionAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                baseSectionAdapter2 = null;
            }
            baseSectionAdapter2.f72338p = 1;
            baseSectionAdapter2.notifySectionData();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$f.class */
    public static final class f<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiReviewFragment f72258a;

        public f(BangumiReviewFragment bangumiReviewFragment) {
            this.f72258a = bangumiReviewFragment;
        }

        public final void accept(Object obj) {
            ReviewPublishInfo reviewPublishInfo = (ReviewPublishInfo) obj;
            BaseSectionAdapter baseSectionAdapter = this.f72258a.f72240l;
            BaseSectionAdapter baseSectionAdapter2 = baseSectionAdapter;
            if (baseSectionAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                baseSectionAdapter2 = null;
            }
            baseSectionAdapter2.f72340r = reviewPublishInfo;
            baseSectionAdapter2.notifySectionData();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$g.class */
    public static final class g<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiReviewFragment f72259a;

        public g(BangumiReviewFragment bangumiReviewFragment) {
            this.f72259a = bangumiReviewFragment;
        }

        public final void accept(Object obj) {
            List list = (List) obj;
            BangumiReviewFragment bangumiReviewFragment = this.f72259a;
            com.bilibili.ogv.review.detailpage.b bVar = bangumiReviewFragment.f72240l;
            com.bilibili.ogv.review.detailpage.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                bVar2 = null;
            }
            int i7 = v.f72420d;
            bVar2.f72337o = v.a.b(((ReviewTag) list.get(0)).f72222b);
            bangumiReviewFragment.kf(((ReviewTag) list.get(0)).f72222b);
            ((RecyclerView) bangumiReviewFragment.f72231b.getValue()).smoothScrollBy(0, 1);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$h.class */
    public static final class h<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiReviewFragment f72260a;

        public h(BangumiReviewFragment bangumiReviewFragment) {
            this.f72260a = bangumiReviewFragment;
        }

        public final void accept(Object obj) {
            Pair pair = (Pair) obj;
            ReviewType reviewType = (ReviewType) pair.component1();
            List<ReviewItem> list = (List) pair.component2();
            com.bilibili.ogv.review.detailpage.b bVar = this.f72260a.f72240l;
            com.bilibili.ogv.review.detailpage.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                bVar2 = null;
            }
            bVar2.P(reviewType, list);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.review.detailpage.BangumiReviewFragment$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BangumiReviewFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.review.detailpage.BangumiReviewFragment$onCreate$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$onCreate$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiReviewFragment f72261a;

            public a(BangumiReviewFragment bangumiReviewFragment) {
                this.f72261a = bangumiReviewFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f72261a.mf();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BangumiReviewFragment bangumiReviewFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bangumiReviewFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<String> mutableSharedFlow = com.bilibili.ogv.review.reviewpublish.c.f72526a;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // wl0.InterfaceC8899a
    public final void X6() {
        RecyclerView recyclerView;
        if (getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) < 0 || (recyclerView = (RecyclerView) this.f72231b.getValue()) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    public final void handleClick(@Nullable BaseViewHolder baseViewHolder) {
        if (baseViewHolder instanceof LoadMoreHolder) {
            ((LoadMoreHolder) baseViewHolder).itemView.setOnClickListener(new OR0.c(this, 1));
        }
    }

    public final View jf() {
        return (View) this.f72232c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void kf(com.bilibili.ogv.review.data.ReviewType r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.detailpage.BangumiReviewFragment.kf(com.bilibili.ogv.review.data.ReviewType):void");
    }

    public final void lf() {
        OGVReviewService oGVReviewService = this.f72241m;
        com.bilibili.ogv.review.detailpage.b bVar = null;
        if (oGVReviewService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService = null;
        }
        int i7 = v.f72420d;
        com.bilibili.ogv.review.detailpage.b bVar2 = this.f72240l;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            bVar = bVar2;
        }
        OGVReviewService.d(oGVReviewService, v.a.a(bVar.f72337o), false, getLifecycle(), this.f72236g, this.h, this.f72237i, this.f72238j, 128);
    }

    public final void mf() {
        OGVReviewService oGVReviewService = this.f72241m;
        OGVReviewService oGVReviewService2 = oGVReviewService;
        if (oGVReviewService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService2 = null;
        }
        oGVReviewService2.f72269i = false;
        OGVReviewService oGVReviewService3 = this.f72241m;
        if (oGVReviewService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService3 = null;
        }
        oGVReviewService3.e(getLifecycle());
        lf();
    }

    public final void nf() {
        if (this.f72249u) {
            return;
        }
        this.f72249u = true;
        Neurons.reportExposure$default(false, "pgc.pgc-video-detail.review-detail.long-list.show", this.f72235f, (List) null, 8, (Object) null);
        Neurons.reportExposure$default(false, G.p.a(this.f72234e, ".long-review.0.show"), this.f72235f, (List) null, 8, (Object) null);
    }

    public final void of() {
        if (this.f72250v) {
            return;
        }
        this.f72250v = true;
        Neurons.reportExposure$default(false, "pgc.pgc-video-detail.review-detail.short-list.show", this.f72235f, (List) null, 8, (Object) null);
        Neurons.reportExposure$default(false, G.p.a(this.f72234e, ".short-review.0.show"), this.f72235f, (List) null, 8, (Object) null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (Intrinsics.areEqual(view, jf())) {
            if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                Nl0.h.c(view.getContext(), "activity://main/login/", 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
                return;
            }
            this.f72246r.a(true);
            if (!this.f72248t) {
                this.f72248t = true;
                Neurons.reportExposure$default(false, G.p.a(this.f72234e, ".popup-review.button.show"), MapsKt.plus(this.f72235f, TuplesKt.to("button_name", "short-evaluate")), (List) null, 8, (Object) null);
                Neurons.reportExposure$default(false, G.p.a(this.f72234e, ".popup-review.button.show"), MapsKt.plus(this.f72235f, TuplesKt.to("button_name", "long-evaluate")), (List) null, 8, (Object) null);
            }
            Neurons.reportClick(false, G.p.a(this.f72234e, ".0.button-review.click"), this.f72235f);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Object next;
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        this.f72233d = String.valueOf(bundleRequireArguments.getString("media_id"));
        this.f72234e = String.valueOf(bundleRequireArguments.getString("page_name"));
        String string = bundleRequireArguments.getString("report_extras");
        Map<String, String> map = string != null ? (Map) JsonUtilKt.parseJson(string, new a().getType()) : null;
        Map<String, String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        this.f72235f = mapEmptyMap;
        this.f72243o = Fj0.a.a(bundleRequireArguments, "show_float_button");
        ReviewSourceType.a aVar = ReviewSourceType.Companion;
        int i7 = bundleRequireArguments.getInt("source_type");
        aVar.getClass();
        Iterator it = ReviewSourceType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ReviewSourceType) next).m7677getValue().intValue() == i7) {
                    break;
                }
            }
        }
        ReviewSourceType reviewSourceType = (ReviewSourceType) next;
        ReviewSourceType reviewSourceType2 = reviewSourceType;
        if (reviewSourceType == null) {
            reviewSourceType2 = ReviewSourceType.PLAYER_DETAIL;
        }
        this.f72236g = reviewSourceType2;
        this.h = (ShortReview) bundleRequireArguments.getParcelable("top_item_default");
        this.f72237i = bundleRequireArguments.getLong("top_review_id");
        this.f72238j = bundleRequireArguments.getInt("top_review_type");
        Context contextRequireContext = requireContext();
        OGVReviewService oGVReviewService = new OGVReviewService(contextRequireContext);
        this.f72241m = oGVReviewService;
        String str = this.f72233d;
        String str2 = str;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaId");
            str2 = null;
        }
        oGVReviewService.f72270j = str2;
        this.f72240l = new com.bilibili.ogv.review.detailpage.b(this.f72234e, this, this, this, getChildFragmentManager(), this.f72236g.m7677getValue().intValue(), contextRequireContext.getString(2131857162), contextRequireContext.getString(2131857138), contextRequireContext.getString(2131857128));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499846, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior = this.f72247s;
        if (pinnedBottomScrollingBehavior != null) {
            pinnedBottomScrollingBehavior.removePinnedView(jf());
        }
        this.f72247s = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        OGVReviewService oGVReviewService = this.f72241m;
        OGVReviewService oGVReviewService2 = oGVReviewService;
        if (oGVReviewService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService2 = null;
        }
        if (oGVReviewService2.f72269i) {
            mf();
        }
        if (this.f72242n) {
            this.f72242n = false;
            Neurons.reportExposure$default(false, "pgc.pgc-video-detail.review-detail.score.show", this.f72235f, (List) null, 8, (Object) null);
            Neurons.reportExposure$default(false, "pgc.pgc-video-detail.review-detail.0.show", this.f72235f, (List) null, 8, (Object) null);
            com.bilibili.ogv.review.detailpage.b bVar = this.f72240l;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                bVar = null;
            }
            int i7 = bVar.f72337o;
            if (i7 == 1) {
                of();
            } else {
                if (i7 != 2) {
                    return;
                }
                nf();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r1v33, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view.isAttachedToWindow()) {
            PinnedBottomScrollingBehavior pinnedBottomScrollingBehaviorA = Ll0.a.a(view);
            this.f72247s = pinnedBottomScrollingBehaviorA;
            if (pinnedBottomScrollingBehaviorA != null) {
                pinnedBottomScrollingBehaviorA.addPinnedView(jf());
            }
        } else {
            view.addOnAttachStateChangeListener(new b(view, this, view));
        }
        ComposeView composeView = (ComposeView) view.findViewById(2131299283);
        ComposeView composeView2 = composeView;
        if (composeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("composeAnchor");
            composeView2 = null;
        }
        composeView2.setContent(ComposableLambdaKt.composableLambdaInstance(1718217606, true, new com.bilibili.lib.fasthybrid.uimodule.widget.webview.h(this, 1)));
        jf().setOnClickListener(this);
        jf().setVisibility(this.f72243o ? 0 : 8);
        if (this.f72243o) {
            Neurons.reportExposure$default(false, G.p.a(this.f72234e, ".0.button-review.show"), this.f72235f, (List) null, 8, (Object) null);
        }
        ?? r02 = (RecyclerView) this.f72231b.getValue();
        if (r02 != 0) {
            r02.setLayoutManager(new LinearLayoutManager(p3(), 1, false));
            com.bilibili.ogv.review.detailpage.b bVar = this.f72240l;
            com.bilibili.ogv.review.detailpage.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                bVar2 = null;
            }
            r02.setAdapter(bVar2);
            r02.addOnScrollListener(new c(this));
        }
        com.bilibili.ogv.review.detailpage.b bVar3 = this.f72240l;
        com.bilibili.ogv.review.detailpage.b bVar4 = bVar3;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            bVar4 = null;
        }
        OGVReviewService oGVReviewService = this.f72241m;
        OGVReviewService oGVReviewService2 = oGVReviewService;
        if (oGVReviewService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService2 = null;
        }
        bVar4.f72343u = oGVReviewService2.f72266e;
        com.bilibili.ogv.review.detailpage.b bVar5 = this.f72240l;
        com.bilibili.ogv.review.detailpage.b bVar6 = bVar5;
        if (bVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            bVar6 = null;
        }
        Observable observable = bVar6.f72343u;
        if (observable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewTagListObservable");
            observable = null;
        }
        com.bilibili.okretro.call.rxjava.c.a(observable.subscribe(new d(this)), getLifecycle());
        BaseAdapter baseAdapter = this.f72240l;
        BaseAdapter baseAdapter2 = baseAdapter;
        if (baseAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            baseAdapter2 = null;
        }
        baseAdapter2.setHandleClickListener(this);
        BaseSectionAdapter baseSectionAdapter = this.f72240l;
        BaseSectionAdapter baseSectionAdapter2 = baseSectionAdapter;
        if (baseSectionAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            baseSectionAdapter2 = null;
        }
        baseSectionAdapter2.f72339q = this.f72235f;
        baseSectionAdapter2.notifySectionData();
        OGVReviewService oGVReviewService3 = this.f72241m;
        OGVReviewService oGVReviewService4 = oGVReviewService3;
        if (oGVReviewService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService4 = null;
        }
        oGVReviewService4.e(getLifecycle());
        OGVReviewService oGVReviewService5 = this.f72241m;
        OGVReviewService oGVReviewService6 = oGVReviewService5;
        if (oGVReviewService5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService6 = null;
        }
        Lifecycle lifecycle = getLifecycle();
        oGVReviewService6.getClass();
        BangumiReviewApiService bangumiReviewApiService = C9206e.f130331a;
        Single<List<ReviewTag>> reviewTags = C9206e.f130333c.getReviewTags(oGVReviewService6.f72270j);
        Functions.v vVar = Functions.a;
        final OGVReviewService oGVReviewService7 = oGVReviewService6;
        com.bilibili.okretro.call.rxjava.c.a(reviewTags.subscribe(new Consumer(oGVReviewService7) { // from class: com.bilibili.ogv.review.detailpage.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OGVReviewService f72355a;

            {
                this.f72355a = oGVReviewService7;
            }

            public final void accept(Object obj) {
                this.f72355a.f72266e.onNext((List) obj);
            }
        }, new com.bilibili.lib.fasthybrid.ability.backgroundaudio.b(oGVReviewService6)), lifecycle);
        OGVReviewService oGVReviewService8 = this.f72241m;
        OGVReviewService oGVReviewService9 = oGVReviewService8;
        if (oGVReviewService8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService9 = null;
        }
        com.bilibili.okretro.call.rxjava.c.a(oGVReviewService9.f72263b.subscribe(new e(this)), getLifecycle());
        OGVReviewService oGVReviewService10 = this.f72241m;
        OGVReviewService oGVReviewService11 = oGVReviewService10;
        if (oGVReviewService10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService11 = null;
        }
        com.bilibili.okretro.call.rxjava.c.a(oGVReviewService11.f72267f.subscribe(new f(this)), getLifecycle());
        OGVReviewService oGVReviewService12 = this.f72241m;
        OGVReviewService oGVReviewService13 = oGVReviewService12;
        if (oGVReviewService12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService13 = null;
        }
        com.bilibili.okretro.call.rxjava.c.a(oGVReviewService13.f72266e.subscribe(new g(this)), getLifecycle());
        OGVReviewService oGVReviewService14 = this.f72241m;
        if (oGVReviewService14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewService");
            oGVReviewService14 = null;
        }
        com.bilibili.okretro.call.rxjava.c.a(oGVReviewService14.f72264c.subscribe(new h(this)), getLifecycle());
    }

    @Override // wl0.InterfaceC8899a
    public final MutableSharedFlow zc() {
        return this.f72244p;
    }
}
