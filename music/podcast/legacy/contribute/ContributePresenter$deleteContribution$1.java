package com.bilibili.music.podcast.legacy.contribute;

import com.bilibili.droid.ToastHelper;
import com.bilibili.music.podcast.legacy.fragment.ContributionsFragment;
import com.bilibili.music.podcast.view.LoadingErrorEmptyView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ui0.DialogC8736a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/contribute/ContributePresenter$deleteContribution$1.class */
public final class ContributePresenter$deleteContribution$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $id;
    int label;
    final ContributePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContributePresenter$deleteContribution$1(ContributePresenter contributePresenter, long j7, Continuation<? super ContributePresenter$deleteContribution$1> continuation) {
        super(2, continuation);
        this.this$0 = contributePresenter;
        this.$id = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContributePresenter$deleteContribution$1(this.this$0, this.$id, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = this.this$0.f66817c;
            long j7 = this.$id;
            this.label = 1;
            Object objA = aVar.a(j7, this);
            obj2 = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        ContributePresenter contributePresenter = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            ContributionsFragment contributionsFragment = contributePresenter.f66815a;
            DialogC8736a dialogC8736a = contributionsFragment.f66828f;
            DialogC8736a dialogC8736a2 = dialogC8736a;
            if (dialogC8736a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingDialog");
                dialogC8736a2 = null;
            }
            dialogC8736a2.dismiss();
            ToastHelper.showToast(contributionsFragment.getContext(), contributionsFragment.getString(2131841470), 0);
            contributionsFragment.f66833l.remove(contributionsFragment.f66837p);
            ContributionsFragment.a aVar2 = contributionsFragment.f66832k;
            ContributionsFragment.a aVar3 = aVar2;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContributionAdapter");
                aVar3 = null;
            }
            aVar3.notifyItemRemoved(contributionsFragment.f66837p);
            if (contributionsFragment.f66833l.size() == 0) {
                LoadingErrorEmptyView loadingErrorEmptyView = contributionsFragment.f66827e;
                LoadingErrorEmptyView loadingErrorEmptyView2 = loadingErrorEmptyView;
                if (loadingErrorEmptyView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLeeView");
                    loadingErrorEmptyView2 = null;
                }
                loadingErrorEmptyView2.c(contributionsFragment.getString(2131831684));
            }
        }
        ContributePresenter contributePresenter2 = this.this$0;
        if (Result.exceptionOrNull-impl(obj2) != null) {
            ContributionsFragment contributionsFragment2 = contributePresenter2.f66815a;
            DialogC8736a dialogC8736a3 = contributionsFragment2.f66828f;
            if (dialogC8736a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingDialog");
                dialogC8736a3 = null;
            }
            dialogC8736a3.dismiss();
            ToastHelper.showToast(contributionsFragment2.getContext(), contributionsFragment2.getString(2131841692), 0);
        }
        return Unit.INSTANCE;
    }
}
