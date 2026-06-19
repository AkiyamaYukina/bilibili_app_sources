package com.bilibili.search2.result.all;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.main.data.SearchContainerType;
import com.bilibili.search2.result.base.BaseSearchResultViewModel;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.category.CategoryMeta;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel.class */
@StabilityInferred(parameters = 0)
public final class SearchResultAllViewModel extends BaseSearchResultViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f87233A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.result.p f87234B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f87235C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f87236D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public Integer f87237E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public String f87238F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public Long f87239G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public Long f87240H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public String f87241I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public String f87242J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f87243K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public SearchContainerType f87244L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Calendar f87245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Calendar f87246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Calendar f87247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Calendar f87248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f87249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f87250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Integer f87251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public Xs0.a f87252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final C6059m f87253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f87254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public List<? extends CategoryMeta> f87255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public String f87256t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f87257u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f87258v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final List<Integer> f87259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final List<Integer> f87260x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final List<Integer> f87261y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public String f87262z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f87263a;

        static {
            int[] iArr = new int[SearchContainerType.values().length];
            try {
                iArr[SearchContainerType.HALF_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchContainerType.FULLSCREEN_FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchContainerType.FULLSCREEN_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f87263a = iArr;
        }
    }

    public SearchResultAllViewModel(@NotNull Application application) {
        super(application);
        BLog.d("SearchResultAllViewMode create " + this);
        Calendar calendar = Calendar.getInstance();
        this.f87245i = calendar;
        calendar.clear();
        calendar.set(2009, 5, 26);
        m1();
        this.f87249m = "";
        this.f87252p = new Xs0.a(this.h);
        this.f87253q = C6059m.f87303a;
        this.f87259w = new ArrayList();
        this.f87260x = new ArrayList();
        this.f87261y = new ArrayList();
        this.f87262z = "";
        this.f87244L = SearchContainerType.FULLSCREEN_ACTIVITY;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object X0(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.base.u.f r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bilibili.search2.result.base.q>> r8) {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$7
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$7 r0 = (com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$7) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L33
        L29:
            com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$7 r0 = new com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$7
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L33:
            r0 = r8
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L69
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L5f
            r0 = r8
            java.lang.Object r0 = r0.L$0
            com.bilibili.search2.result.base.u$f r0 = (com.bilibili.search2.result.base.u.f) r0
            r7 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r8 = r0
            goto L9a
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            com.bilibili.search2.result.ogv.aggregate.a r0 = r0.f87633a
            r10 = r0
            r0 = r8
            r1 = r7
            r0.L$0 = r1
            r0 = r8
            r1 = 1
            r0.label = r1
            com.bilibili.search2.result.all.SearchResultAllViewModel$searchOGVAggregateQuest$2 r0 = new com.bilibili.search2.result.all.SearchResultAllViewModel$searchOGVAggregateQuest$2
            r1 = r0
            r2 = r10
            r3 = 0
            r1.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flow(r0)
            r10 = r0
            r0 = r10
            r8 = r0
            r0 = r10
            r1 = r11
            if (r0 != r1) goto L9a
            r0 = r11
            return r0
        L9a:
            com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$$inlined$transform$4 r0 = new com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$$inlined$transform$4
            r1 = r0
            r2 = r8
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            r3 = 0
            r4 = r7
            r1.<init>(r2, r3, r4)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flow(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllViewModel.X0(com.bilibili.search2.result.base.u$f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y0(@org.jetbrains.annotations.NotNull com.bilibili.search2.result.base.u.g r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bilibili.search2.result.base.q>> r9) {
        /*
            r7 = this;
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$5
            if (r0 == 0) goto L29
            r0 = r9
            com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$5 r0 = (com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$5) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r11
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r11
            r9 = r0
            goto L33
        L29:
            com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$5 r0 = new com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$5
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            r9 = r0
        L33:
            r0 = r9
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r9
            int r0 = r0.label
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L69
            r0 = r10
            r1 = 1
            if (r0 != r1) goto L5f
            r0 = r9
            java.lang.Object r0 = r0.L$0
            com.bilibili.search2.result.base.u$g r0 = (com.bilibili.search2.result.base.u.g) r0
            r8 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r11
            r9 = r0
            goto L9b
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            com.bilibili.search2.result.base.o r0 = r0.f87634a
            r11 = r0
            r0 = r9
            r1 = r8
            r0.L$0 = r1
            r0 = r9
            r1 = 1
            r0.label = r1
            com.bilibili.search2.result.all.SearchResultAllViewModel$searchRecAfterQuest$2 r0 = new com.bilibili.search2.result.all.SearchResultAllViewModel$searchRecAfterQuest$2
            r1 = r0
            r2 = r7
            r3 = r11
            r4 = 0
            r1.<init>(r2, r3, r4)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flow(r0)
            r11 = r0
            r0 = r11
            r9 = r0
            r0 = r11
            r1 = r12
            if (r0 != r1) goto L9b
            r0 = r12
            return r0
        L9b:
            com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$$inlined$transform$3 r0 = new com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$$inlined$transform$3
            r1 = r0
            r2 = r9
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            r3 = 0
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flow(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllViewModel.Y0(com.bilibili.search2.result.base.u$g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @Nullable
    public final Flow Z0() {
        return FlowKt.flow(new SearchResultAllViewModel$toEffectFlow$16(null));
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @Nullable
    public final Flow a1(@NotNull u.a aVar) {
        return FlowKt.flow(new SearchResultAllViewModel$toEffectFlow$14(aVar, null));
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @Nullable
    public final Flow b1(@NotNull u.c cVar) {
        return FlowKt.flow(new SearchResultAllViewModel$toEffectFlow$$inlined$transform$1(FlowKt.flow(new SearchResultAllViewModel$makeInitSearchFlowWrapper$1(cVar.f87628a, this, cVar.f87629b, null)), null, this));
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @Nullable
    public final Flow c1(@NotNull u.d dVar) {
        return FlowKt.flow(new SearchResultAllViewModel$toEffectFlow$12(this, dVar, null));
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @Nullable
    public final Flow d1(@NotNull u.e eVar) {
        return FlowKt.catch(S0(FlowKt.flow(new SearchResultAllViewModel$toEffectFlow$$inlined$transform$2(S0(FlowKt.flow(new SearchResultAllViewModel$makeSearchMoreFlow$1(eVar.f87631a, this, eVar.f87632b, null)), "more1"), new SearchResultAllViewModel$onSearchResponseSuspend$1(this, null), null)), "more2"), new SearchResultAllViewModel$toEffectFlow$4(null));
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultViewModel
    @Nullable
    public final Flow e1(@NotNull u.h hVar) {
        return FlowKt.flow(new SearchResultAllViewModel$toEffectFlow$10(this, hVar, null));
    }

    public final int g1() {
        StateFlow<SearchState> stateFlow = this.f87499f;
        List<BaseSearchItem> allResultList = ((SearchState) stateFlow.getValue()).getAllResultList();
        int size = allResultList != null ? allResultList.size() : 0;
        List<BaseSearchItem> allResultList2 = ((SearchState) stateFlow.getValue()).getAllResultList();
        int i7 = size;
        if ((allResultList2 != null ? (BaseSearchItem) CollectionsKt.getOrNull(allResultList2, size - 1) : null) instanceof com.bilibili.search2.result.base.s) {
            i7 = size - 1;
        }
        return i7;
    }

    @Nullable
    public final SearchResultAll h1() {
        return ((SearchState) this.f87499f.getValue()).getData();
    }

    @NotNull
    public final Calendar j1() {
        Calendar calendar = this.f87248l;
        if (calendar != null) {
            return calendar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endCalendar");
        return null;
    }

    @NotNull
    public final Calendar k1() {
        Calendar calendar = this.f87247k;
        if (calendar != null) {
            return calendar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startCalendar");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l1(kotlinx.coroutines.flow.FlowCollector r6, com.bilibili.search2.result.base.q r7, boolean r8, boolean r9, com.bilibili.search2.api.SearchResultAll r10, com.bilibili.search2.result.base.t r11, com.bilibili.search2.result.base.v r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllViewModel.l1(kotlinx.coroutines.flow.FlowCollector, com.bilibili.search2.result.base.q, boolean, boolean, com.bilibili.search2.api.SearchResultAll, com.bilibili.search2.result.base.t, com.bilibili.search2.result.base.v, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void m1() {
        this.f87247k = Calendar.getInstance();
        k1().set(k1().get(1), k1().get(2), 1);
        this.f87246j = Calendar.getInstance();
        this.f87248l = Calendar.getInstance();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void n1(@NotNull SearchContainerType searchContainerType) throws NoWhenBranchMatchedException {
        this.f87244L = searchContainerType;
        boolean z6 = searchContainerType != SearchContainerType.FULLSCREEN_ACTIVITY;
        Xs0.a aVar = this.f87252p;
        aVar.h = z6 ? "1" : "0";
        int i7 = a.f87263a[searchContainerType.ordinal()];
        String str = "1";
        if (i7 != 1) {
            if (i7 == 2) {
                str = "2";
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "";
            }
        }
        aVar.f28320i = str;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        Job job;
        this.f87253q.getClass();
        C6059m.c();
        if (!EntryPointKt.getMemleakOptEnable() || (job = ViewModelKt.getViewModelScope(this).getCoroutineContext().get(Job.Key)) == null) {
            return;
        }
        JobKt.cancelChildren$default(job, (CancellationException) null, 1, (Object) null);
    }
}
