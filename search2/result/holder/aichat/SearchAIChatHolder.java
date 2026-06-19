package com.bilibili.search2.result.holder.aichat;

import android.view.ViewGroup;
import androidx.compose.foundation.lazy.d0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.search.v2.Action;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.search2.api.BaseSearchItem;
import dt0.AbstractC6843f;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kntr.app.search.aicard.container.CardLayoutMode;
import kntr.app.search.aicard.container.LikeState;
import kntr.app.search.aicard.redux.CardPhase;
import kntr.app.search.aicard.redux.SearchAICardViewModel;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder.class */
@StabilityInferred(parameters = 0)
public final class SearchAIChatHolder extends AbstractC6843f<SearchAIChatItem> implements Et0.a, Et0.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f87753m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Bl.l f87754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public kntr.app.search.aicard.e f87755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public l f87756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Job f87757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public CoroutineScope f87758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public d f87759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Lifecycle f87760g;

    @Nullable
    public com.bilibili.search2.result.j h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f87761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public CardPhase f87762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableState f87763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f87764l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f87765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f87766b;

        static {
            int[] iArr = new int[LikeState.values().length];
            try {
                iArr[LikeState.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f87765a = iArr;
            int[] iArr2 = new int[CardPhase.values().length];
            try {
                iArr2[CardPhase.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr2[CardPhase.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[CardPhase.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[CardPhase.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[CardPhase.UNABLE.ordinal()] = 5;
            } catch (NoSuchFieldError e12) {
            }
            f87766b = iArr2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f87767a;

        public b(d0 d0Var) {
            this.f87767a = d0Var;
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
            return this.f87767a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f87767a.invoke(obj);
        }
    }

    public SearchAIChatHolder(@NotNull Bl.l lVar) {
        super(lVar.a);
        this.f87754a = lVar;
        this.f87762j = CardPhase.LOADING;
        this.f87763k = SnapshotStateKt.mutableStateOf$default(new kntr.app.search.aicard.container.b(false, (LikeState) null, false, (CardLayoutMode) null, 31), null, 2, null);
        lVar.b.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c1  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.aichat.SearchAIChatHolder.bind():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.LifecycleObserver, com.bilibili.search2.result.holder.aichat.d] */
    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        MutableLiveData<Boolean> mutableLiveData;
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        super.bindFragment(fragment);
        d dVar = this.f87759f;
        if (dVar != null && (lifecycle2 = this.f87760g) != null) {
            lifecycle2.removeObserver(dVar);
        }
        ?? r02 = new LifecycleEventObserver(this) { // from class: com.bilibili.search2.result.holder.aichat.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchAIChatHolder f87775a;

            {
                this.f87775a = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.f87775a.q0();
                }
            }
        };
        this.f87759f = r02;
        this.f87760g = fragment != null ? fragment.getLifecycle() : null;
        if (fragment != null && (lifecycle = fragment.getLifecycle()) != 0) {
            lifecycle.addObserver(r02);
        }
        if (fragment != null) {
            com.bilibili.search2.result.j jVar = (com.bilibili.search2.result.j) new ViewModelProvider(fragment).get(com.bilibili.search2.result.j.class);
            this.h = jVar;
            if (jVar == null || (mutableLiveData = jVar.f88254a) == null) {
                return;
            }
            mutableLiveData.observe(fragment, new b(new d0(this, 2)));
        }
    }

    @Override // Et0.a
    public final boolean isNeedDrawDivider() {
        return false;
    }

    @Override // Et0.d
    public final boolean needWideScreenMargin() {
        return false;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        v0(this.f87762j, this.f87762j != CardPhase.LOADING ? Double.valueOf((System.currentTimeMillis() - this.f87761i) / 1000.0d) : null, false);
    }

    public final void onRecycled() {
        super.onRecycled();
        s0();
        w0();
        Job job = this.f87757d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f87757d = null;
        CoroutineScope coroutineScope = this.f87758e;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
        this.f87758e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q0() {
        /*
            r9 = this;
            r0 = r9
            boolean r0 = r0.isDataInitialized()
            if (r0 == 0) goto L99
            r0 = r9
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.result.holder.aichat.SearchAIChatItem r0 = (com.bilibili.search2.result.holder.aichat.SearchAIChatItem) r0
            java.lang.String r0 = r0.getSessionId()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L99
            kotlin.Lazy<com.bilibili.search2.result.holder.aichat.b> r0 = com.bilibili.search2.result.holder.aichat.b.f87770c
            java.lang.Object r0 = r0.getValue()
            com.bilibili.search2.result.holder.aichat.b r0 = (com.bilibili.search2.result.holder.aichat.b) r0
            com.bilibili.search2.result.holder.aichat.c r0 = r0.f87772b
            r12 = r0
            r0 = r9
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.result.holder.aichat.SearchAIChatItem r0 = (com.bilibili.search2.result.holder.aichat.SearchAIChatItem) r0
            Xs0.a r0 = r0.getReportExtra()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L41
            r0 = r10
            java.lang.String r0 = r0.f28314b
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L45
        L41:
            java.lang.String r0 = ""
            r10 = r0
        L45:
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            r2 = 0
            com.bilibili.search2.result.holder.aichat.SearchAIChatHolder$cleanup$1 r3 = new com.bilibili.search2.result.holder.aichat.SearchAIChatHolder$cleanup$1
            r4 = r3
            r5 = r13
            r6 = r10
            r7 = 0
            r4.<init>(r5, r6, r7)
            r4 = 2
            r5 = 0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            r0 = r12
            monitor-enter(r0)
            r0 = r12
            java.lang.String r0 = r0.f87773a     // Catch: java.lang.Throwable -> L7e
            r1 = r13
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L8c
            r0 = r12
            kotlinx.coroutines.CompletableDeferred<com.bapis.bilibili.broadcast.message.main.ChatResultV2> r0 = r0.f87774b     // Catch: java.lang.Throwable -> L7e
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L82
            r0 = r10
            r1 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r10 = move-exception
            goto L95
        L82:
            r0 = r12
            r1 = 0
            r0.f87774b = r1     // Catch: java.lang.Throwable -> L7e
            r0 = r12
            r1 = 0
            r0.f87773a = r1     // Catch: java.lang.Throwable -> L7e
        L8c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r10 = r0
            r0 = r12
            monitor-exit(r0)
            goto L99
        L95:
            r0 = r12
            monitor-exit(r0)
            r0 = r10
            throw r0
        L99:
            r0 = r9
            kntr.app.search.aicard.container.b r1 = new kntr.app.search.aicard.container.b
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 31
            r2.<init>(r3, r4, r5, r6, r7)
            r0.x0(r1)
            r0 = r9
            r0.t0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.aichat.SearchAIChatHolder.q0():void");
    }

    public final kntr.app.search.aicard.container.b r0() {
        return (kntr.app.search.aicard.container.b) this.f87763k.getValue();
    }

    public final void s0() {
        this.f87764l++;
    }

    public final void t0() {
        s0();
        w0();
        Job job = this.f87757d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f87757d = null;
        l lVar = this.f87756c;
        if (lVar != null) {
            Job job2 = lVar.f87805j;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            Job job3 = lVar.f87804i;
            if (job3 != null) {
                Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
            }
            CoroutineScopeKt.cancel$default(lVar.h, (CancellationException) null, 1, (Object) null);
        }
        this.f87756c = null;
        kntr.app.search.aicard.e eVar = this.f87755b;
        if (eVar != null) {
            SearchAICardViewModel searchAICardViewModelB = eVar.a.b();
            searchAICardViewModelB.f.setValue(searchAICardViewModelB.b);
            CoroutineScopeKt.cancel$default(searchAICardViewModelB.a, (CancellationException) null, 1, (Object) null);
        }
        this.f87755b = null;
        CoroutineScope coroutineScope = this.f87758e;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
        this.f87758e = null;
    }

    public final void u0(String str, Map<String, String> map) {
        Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchAIChatItem) getData()).getLinkType(), (BaseSearchItem) getData(), null, null, Xs0.b.d((BaseSearchItem) getData(), str, null, 2), null, null, map, false, null, 7088);
    }

    public final void v0(CardPhase cardPhase, Double d7, boolean z6) {
        int i7;
        if (z6) {
            ((SearchAIChatItem) getData()).setExposed(false);
        }
        if (!((SearchAIChatItem) getData()).isExposed()) {
            SearchAIChatItem searchAIChatItem = (SearchAIChatItem) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z7 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z7 = true;
            }
            searchAIChatItem.setAtFirstScreen(z7);
        }
        int i8 = a.f87766b[cardPhase.ordinal()];
        if (i8 != 1) {
            i7 = 2;
            if (i8 != 2) {
                i7 = 3;
                if (i8 != 3) {
                    i7 = 4;
                    if (i8 != 4) {
                        i7 = 5;
                        if (i8 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        } else {
            i7 = 1;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to(NotificationCompat.CATEGORY_STATUS, String.valueOf(i7))});
        if (i7 != 1 && d7 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            mapMutableMapOf.put("loading_time", String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{d7}, 1)));
        }
        if (cardPhase == CardPhase.CONTENT) {
            l lVar = this.f87756c;
            mapMutableMapOf.put("message_id", lVar != null ? String.valueOf(lVar.f87800d.getMessageId()) : null);
        }
        String linkType = ((SearchAIChatItem) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "";
        }
        Xs0.b.k("search.search-result.search-card.all.show", str, (BaseSearchItem) getData(), null, mapMutableMapOf, false, null, null, null, 1000);
    }

    public final void w0() {
        Bl.l lVar = this.f87754a;
        ViewGroup.LayoutParams layoutParams = lVar.b.getLayoutParams();
        if (layoutParams == null || layoutParams.height == -2) {
            return;
        }
        layoutParams.height = -2;
        lVar.b.setLayoutParams(layoutParams);
        BLog.d("[Search]SearchAIChatHolder", "restoreComposeViewWrapContent");
    }

    public final void x0(kntr.app.search.aicard.container.b bVar) {
        this.f87763k.setValue(bVar);
    }

    public final void y0(LikeState likeState) {
        CoroutineScope coroutineScope;
        SearchAIChatItem searchAIChatItem = (SearchAIChatItem) getData();
        l lVar = this.f87756c;
        if (lVar == null || (coroutineScope = this.f87758e) == null) {
            return;
        }
        boolean z6 = searchAIChatItem.getLikeState() == likeState;
        searchAIChatItem.setLikeState(z6 ? LikeState.DEFAULT : likeState);
        x0(kntr.app.search.aicard.container.b.a(r0(), false, false, searchAIChatItem.getLikeState(), false, 27));
        int i7 = !z6 ? 2131841402 : likeState == LikeState.DISLIKE ? 2131847681 : 2131847887;
        Bl.l lVar2 = this.f87754a;
        PromoToast.showBottomToast(lVar2.a.getContext(), lVar2.a.getContext().getString(i7));
        int[] iArr = a.f87765a;
        u0(iArr[likeState.ordinal()] == 1 ? z6 ? "cancel-like" : IVideoLikeRouteService.ACTION_LIKE : z6 ? "cancel-dislike" : "dislike", MapsKt.emptyMap());
        Action action = iArr[likeState.ordinal()] == 1 ? !z6 ? Action.ACTION_LIKE : Action.ACTION_CANCEL_LIKE : !z6 ? Action.ACTION_DISLIKE : Action.ACTION_CANCEL_DISLIKE;
        SearchAIChatItem searchAIChatItem2 = lVar.f87800d;
        String business = searchAIChatItem2.getBusiness();
        if (business == null) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SearchAIChatHolder$reportLikeAction$1(action, business, searchAIChatItem2.getMessageId(), null), 3, (Object) null);
    }
}
