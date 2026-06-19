package com.bilibili.lib.projection.internal.search.searchv2;

import De0.C1572e;
import De0.C1592z;
import De0.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchPanelExtKt$autoRefresh$1.class */
public final class SearchPanelExtKt$autoRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $fromExpand;
    final SearchPanelContainer $this_autoRefresh;
    int label;

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelExtKt$autoRefresh$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchPanelExtKt$autoRefresh$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C1592z $offlineList;
        final SearchPanelContainer $this_autoRefresh;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchPanelContainer searchPanelContainer, C1592z c1592z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_autoRefresh = searchPanelContainer;
            this.$offlineList = c1592z;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_autoRefresh, this.$offlineList, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SearchPanelExtKt.f(this.$this_autoRefresh, this.$offlineList);
            SearchPanelExtKt.b(this.$this_autoRefresh);
            SearchPanelExtKt.e(this.$this_autoRefresh);
            SearchPanelExtKt.d(this.$this_autoRefresh, false);
            SearchPanelExtKt.c(this.$this_autoRefresh, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPanelExtKt$autoRefresh$1(SearchPanelContainer searchPanelContainer, boolean z6, Continuation<? super SearchPanelExtKt$autoRefresh$1> continuation) {
        super(2, continuation);
        this.$this_autoRefresh = searchPanelContainer;
        this.$fromExpand = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchPanelExtKt$autoRefresh$1(this.$this_autoRefresh, this.$fromExpand, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$this_autoRefresh.getManuallySearching()) {
                BLog.i("SearchPanelExt", "SearchPanelContainer.autoRefresh, is manuallySearching, return");
                return Unit.INSTANCE;
            }
            if (System.currentTimeMillis() - this.$this_autoRefresh.getLastRefreshTime() < ((Number) SearchPanelExtKt.f63780a.getValue()).longValue() && !this.$fromExpand) {
                BLog.i("SearchPanelExt", "SearchPanelContainer.autoRefresh, delta < autoRefreshInterval, return");
                return Unit.INSTANCE;
            }
            C1592z c1592zA = r.a(this.$this_autoRefresh.getContext());
            BLog.i("SearchPanelExt", "SearchPanelContainer.autoRefresh auto refresh start.");
            C1572e c1572e = C1572e.f2836a;
            c1572e.getClass();
            if (C1572e.f2840e) {
                BLog.i("SearchPanelExt", "DeviceListHelper.isTouchingOfflineDevice=true");
                return Unit.INSTANCE;
            }
            c1572e.getClass();
            C1572e.f2840e = false;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_autoRefresh, c1592zA, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$this_autoRefresh.setLastRefreshTime(System.currentTimeMillis());
        return Unit.INSTANCE;
    }
}
