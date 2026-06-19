package com.bilibili.search2.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bilibili.bplus.followinglist.service.C0;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.SearchView;

/* JADX INFO: renamed from: com.bilibili.search2.main.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/m.class */
@StabilityInferred(parameters = 0)
public final class C6046m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SearchPageStateModel f86844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C6042i f86845b;

    /* JADX INFO: renamed from: com.bilibili.search2.main.m$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/m$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f86846a;

        public a(Function1 function1) {
            this.f86846a = function1;
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
            return this.f86846a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86846a.invoke(obj);
        }
    }

    @NotNull
    public final SearchPageStateModel a() {
        SearchPageStateModel searchPageStateModel = this.f86844a;
        if (searchPageStateModel != null) {
            return searchPageStateModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
        return null;
    }

    @NotNull
    public final C6042i b() {
        C6042i c6042i = this.f86845b;
        if (c6042i != null) {
            return c6042i;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSearchFragmentManager");
        return null;
    }

    public final void c(@NotNull LifecycleOwner lifecycleOwner, @NotNull SearchPageStateModel searchPageStateModel, @NotNull C6042i c6042i, @NotNull final u uVar, @NotNull final Function1<? super SearchPageStateModel.a, Unit> function1) {
        this.f86844a = searchPageStateModel;
        this.f86845b = c6042i;
        BLog.i("SearchPageController", "init: pageShowFragment current value=" + a().f86754a.getValue() + ", lifecycleOwner=" + lifecycleOwner.getClass().getSimpleName() + ", stateModel=" + a().hashCode());
        a().f86754a.observe(lifecycleOwner, new a(new Function1(this, uVar) { // from class: com.bilibili.search2.main.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6046m f86839a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final u f86840b;

            {
                this.f86839a = this;
                this.f86840b = uVar;
            }

            public final Object invoke(Object obj) throws Exception {
                ConstraintLayout constraintLayout;
                Unit unit;
                ConstraintLayout constraintLayout2;
                BaseSearchResultFragment<?> baseSearchResultFragmentYf;
                SearchPageStateModel.ShowFragmentState showFragmentState = (SearchPageStateModel.ShowFragmentState) obj;
                if (showFragmentState == null) {
                    unit = Unit.INSTANCE;
                } else {
                    BLog.i("SearchPageController", "pageShowFragment observer fired: pageShow=" + showFragmentState + ", caller=" + CollectionsKt.p(ArraysKt.J(new Throwable().getStackTrace()), " <- ", (CharSequence) null, (CharSequence) null, new com.bilibili.app.comm.list.common.widget.bottomsheet.drag.model.a(1), 30));
                    SearchPageStateModel.ShowFragmentState showFragmentState2 = SearchPageStateModel.ShowFragmentState.DISCOVER;
                    C6046m c6046m = this.f86839a;
                    if (showFragmentState == showFragmentState2) {
                        boolean zAreEqual = Intrinsics.areEqual(c6046m.a().f86764l.getValue(), Boolean.TRUE);
                        u uVar2 = this.f86840b;
                        if (zAreEqual) {
                            uVar2.b(true);
                            c6046m.a().f86764l.setValue(Boolean.FALSE);
                        } else {
                            SearchView searchView = uVar2.f86919b;
                            if (searchView != null) {
                                searchView.postDelayed(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.A(uVar2, 1), 100L);
                            }
                        }
                        BiliMainSearchResultFragment biliMainSearchResultFragmentD = c6046m.b().d();
                        if (biliMainSearchResultFragmentD != null && (baseSearchResultFragmentYf = biliMainSearchResultFragmentD.yf()) != null) {
                            baseSearchResultFragmentYf.setUserVisibleHint(false);
                        }
                        c6046m.b().h(true);
                        C6042i c6042iB = c6046m.b();
                        c6042iB.k(c6042iB.d(), c6042iB.c());
                        OH.e eVar = c6042iB.f86836b;
                        if (eVar != null && (constraintLayout2 = ((M) eVar.b).f86722c) != null && constraintLayout2.getVisibility() == 0) {
                            c6042iB.g();
                        }
                        c6046m.a().f86774v.tryEmit(SearchPageStateModel.DisplayPage.DISCOVER);
                    } else if (showFragmentState == SearchPageStateModel.ShowFragmentState.RESULT) {
                        C6042i c6042iB2 = c6046m.b();
                        c6042iB2.k(c6042iB2.c(), c6042iB2.d());
                        cJ.v vVar = c6042iB2.f86838d;
                        if (vVar != null ? ((Boolean) vVar.invoke()).booleanValue() : false) {
                            OH.e eVar2 = c6042iB2.f86836b;
                            if (eVar2 != null && (constraintLayout = ((M) eVar2.b).f86722c) != null) {
                                constraintLayout.setVisibility(0);
                            }
                            cJ.u uVar3 = c6042iB2.f86837c;
                            if (uVar3 != null) {
                                uVar3.invoke();
                            }
                        }
                        c6046m.a().f86774v.tryEmit(SearchPageStateModel.DisplayPage.RESULT);
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }));
        a().f86755b.observe(lifecycleOwner, new Observer(this, uVar) { // from class: com.bilibili.search2.main.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6046m f86841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final u f86842b;

            {
                this.f86841a = this;
                this.f86842b = uVar;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchPageStateModel.c cVar = (SearchPageStateModel.c) obj;
                if (cVar == null || this.f86841a.a().f86776x) {
                    return;
                }
                boolean z6 = cVar.f86791a;
                u uVar2 = this.f86842b;
                if (!z6) {
                    uVar2.b(true);
                    return;
                }
                if (cVar.f86792b) {
                    uVar2.c();
                    return;
                }
                SearchView searchView = uVar2.f86919b;
                if (searchView != null) {
                    searchView.postDelayed(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.A(uVar2, 1), 100L);
                }
            }
        });
        a().f86756c.observe(lifecycleOwner, new C0(this, 1));
        a().f86757d.observe(lifecycleOwner, new Ai1.a(uVar, 1));
        a().f86758e.observe(lifecycleOwner, new com.bilibili.bililive.room.ui.topic.slide.p(uVar, 1));
        a().f86759f.observe(lifecycleOwner, new a(new KH.a(uVar, 3)));
        a().f86760g.observe(lifecycleOwner, new Observer(function1) { // from class: com.bilibili.search2.main.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function1 f86843a;

            {
                this.f86843a = function1;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f86843a.invoke((SearchPageStateModel.a) obj);
            }
        });
        a().f86766n.setValue(Boolean.TRUE);
    }
}
