package com.bilibili.music.podcast.legacy.contribute;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.music.podcast.legacy.data.ContributionPage;
import com.bilibili.music.podcast.legacy.fragment.ContributionsFragment;
import com.bilibili.music.podcast.view.LoadingErrorEmptyView;
import fH.h;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/contribute/ContributePresenter$getContributionList$1.class */
public final class ContributePresenter$getContributionList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $refresh;
    int label;
    final ContributePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContributePresenter$getContributionList$1(ContributePresenter contributePresenter, boolean z6, Continuation<? super ContributePresenter$getContributionList$1> continuation) {
        super(2, continuation);
        this.this$0 = contributePresenter;
        this.$refresh = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContributePresenter$getContributionList$1(this.this$0, this.$refresh, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        boolean z6 = true;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ContributePresenter contributePresenter = this.this$0;
            contributePresenter.f66819e = true;
            int i8 = contributePresenter.f66818d;
            int i9 = contributePresenter.f66820f;
            int i10 = contributePresenter.h;
            int i11 = contributePresenter.f66821g;
            this.label = 1;
            Object objB = contributePresenter.f66817c.b(i8, 20, i9, i10, i11, this);
            obj2 = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        ContributePresenter contributePresenter2 = this.this$0;
        boolean z7 = this.$refresh;
        if (Result.isSuccess-impl(obj2)) {
            ContributionPage contributionPage = (ContributionPage) obj2;
            contributePresenter2.f66818d++;
            ContributionsFragment contributionsFragment = contributePresenter2.f66815a;
            if (contributionPage != null) {
                SwipeRefreshLayout swipeRefreshLayout = contributionsFragment.f66829g;
                SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
                if (swipeRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRefreshView");
                    swipeRefreshLayout2 = null;
                }
                swipeRefreshLayout2.setRefreshing(false);
                if (contributionPage.getPageNum() >= contributionPage.getPages()) {
                    z6 = false;
                }
                contributionsFragment.f66836o = z6;
                if (z7) {
                    contributionsFragment.f66833l.clear();
                }
                ArrayList<ContributionPage.Contribution> list = contributionPage.getList();
                if (list != null && !list.isEmpty()) {
                    contributionsFragment.f66833l.addAll(list);
                    LoadingErrorEmptyView loadingErrorEmptyView = contributionsFragment.f66827e;
                    LoadingErrorEmptyView loadingErrorEmptyView2 = loadingErrorEmptyView;
                    if (loadingErrorEmptyView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLeeView");
                        loadingErrorEmptyView2 = null;
                    }
                    loadingErrorEmptyView2.b();
                    ContributionsFragment.a aVar = contributionsFragment.f66832k;
                    ContributionsFragment.a aVar2 = aVar;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContributionAdapter");
                        aVar2 = null;
                    }
                    aVar2.notifyDataSetChanged();
                } else if (z7) {
                    LoadingErrorEmptyView loadingErrorEmptyView3 = contributionsFragment.f66827e;
                    LoadingErrorEmptyView loadingErrorEmptyView4 = loadingErrorEmptyView3;
                    if (loadingErrorEmptyView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mLeeView");
                        loadingErrorEmptyView4 = null;
                    }
                    loadingErrorEmptyView4.c(contributionsFragment.getString(2131831684));
                }
            }
        }
        ContributePresenter contributePresenter3 = this.this$0;
        if (Result.exceptionOrNull-impl(obj2) != null) {
            ContributionsFragment contributionsFragment2 = contributePresenter3.f66815a;
            LoadingErrorEmptyView loadingErrorEmptyView5 = contributionsFragment2.f66827e;
            LoadingErrorEmptyView loadingErrorEmptyView6 = loadingErrorEmptyView5;
            if (loadingErrorEmptyView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLeeView");
                loadingErrorEmptyView6 = null;
            }
            loadingErrorEmptyView6.b();
            ContributionsFragment.a aVar3 = contributionsFragment2.f66832k;
            ContributionsFragment.a aVar4 = aVar3;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContributionAdapter");
                aVar4 = null;
            }
            aVar4.notifyDataSetChanged();
            LoadingErrorEmptyView loadingErrorEmptyView7 = contributionsFragment2.f66827e;
            if (loadingErrorEmptyView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLeeView");
                loadingErrorEmptyView7 = null;
            }
            loadingErrorEmptyView7.d(new h(contributionsFragment2, 1));
        }
        this.this$0.f66819e = false;
        return Unit.INSTANCE;
    }
}
