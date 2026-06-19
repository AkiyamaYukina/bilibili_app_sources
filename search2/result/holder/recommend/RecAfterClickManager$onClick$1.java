package com.bilibili.search2.result.holder.recommend;

import Vn.A;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.api.SearchVideoItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.u;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/RecAfterClickManager$onClick$1.class */
public final class RecAfterClickManager$onClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $bindingPosition;
    final SearchVideoItem $data;
    final SearchResultAllFragment $fragment;
    final AtomicBoolean $lastCancel;
    final Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecAfterClickManager$onClick$1(SearchResultAllFragment searchResultAllFragment, Uri uri, int i7, SearchVideoItem searchVideoItem, AtomicBoolean atomicBoolean, Continuation<? super RecAfterClickManager$onClick$1> continuation) {
        super(2, continuation);
        this.$fragment = searchResultAllFragment;
        this.$uri = uri;
        this.$bindingPosition = i7;
        this.$data = searchVideoItem;
        this.$lastCancel = atomicBoolean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        BLog.d("RecAfterClickManager", "onStateChanged " + event);
        if (event == Lifecycle.Event.ON_PAUSE) {
            booleanRef.element = true;
        }
        if (event == Lifecycle.Event.ON_RESUME && booleanRef.element) {
            booleanRef2.element = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(AtomicBoolean atomicBoolean, Ref.BooleanRef booleanRef, SearchResultAllFragment searchResultAllFragment, LifecycleEventObserver lifecycleEventObserver) {
        BLog.d("RecAfterClickManager", "lastCancel " + atomicBoolean.get() + " discard " + booleanRef.element);
        try {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment.getViewLifecycleOwner()), Dispatchers.getMain(), (CoroutineStart) null, new RecAfterClickManager$onClick$1$1$1(searchResultAllFragment, lifecycleEventObserver, null), 2, (Object) null);
        } catch (Exception e7) {
            BLog.e("RecAfterClickManager", e7.toString());
        }
        return booleanRef.element || atomicBoolean.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(SearchResultAllFragment searchResultAllFragment, int i7, int i8) {
        RecyclerView recyclerView = searchResultAllFragment.h;
        int firstVisible = recyclerView != null ? ListExtentionsKt.getFirstVisible(recyclerView) : 0;
        com.bilibili.ad.adview.videodetail.pausedpage.brand.base.b.b(i8, "RecAfterClickManager", A.b(firstVisible, i7, "replaceOffset ", " index ", " height "));
        if (firstVisible >= i7) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment.getViewLifecycleOwner()), Dispatchers.getMain(), (CoroutineStart) null, new RecAfterClickManager$onClick$1$2$1(searchResultAllFragment, i8, null), 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecAfterClickManager$onClick$1(this.$fragment, this.$uri, this.$bindingPosition, this.$data, this.$lastCancel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.lifecycle.LifecycleObserver, com.bilibili.search2.result.holder.recommend.a] */
    public final Object invokeSuspend(Object obj) {
        long j7;
        Lifecycle lifecycle;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Fragment parentFragment = this.$fragment.getParentFragment();
        Fragment fragment = parentFragment;
        if (parentFragment == null) {
            fragment = this.$fragment;
        }
        SearchResultAllViewModel searchResultAllViewModel = (SearchResultAllViewModel) new ViewModelProvider(fragment).get(SearchResultAllViewModel.class);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        ?? r02 = new LifecycleEventObserver(booleanRef2, booleanRef) { // from class: com.bilibili.search2.result.holder.recommend.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.BooleanRef f88160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.BooleanRef f88161b;

            {
                this.f88160a = booleanRef2;
                this.f88161b = booleanRef;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                RecAfterClickManager$onClick$1.invokeSuspend$lambda$0(this.f88160a, this.f88161b, lifecycleOwner, event);
            }
        };
        FragmentActivity fragmentActivityP3 = this.$fragment.p3();
        if (fragmentActivityP3 != null && (lifecycle = fragmentActivityP3.getLifecycle()) != 0) {
            lifecycle.addObserver(r02);
        }
        Uri uri = this.$uri;
        int i7 = this.$bindingPosition;
        SearchVideoItem searchVideoItem = this.$data;
        try {
            String str = RecAfterClickManager.f88149a;
            j7 = 500;
            if (str != null) {
                j7 = Long.parseLong(str);
            }
        } catch (NumberFormatException e7) {
            BLog.e(RecAfterClickManager.class.getSimpleName(), e7.toString());
            j7 = 500;
        }
        AtomicBoolean atomicBoolean = this.$lastCancel;
        SearchResultAllFragment searchResultAllFragment = this.$fragment;
        searchResultAllViewModel.V0(new u.g(new com.bilibili.search2.result.base.o(uri, i7 + 1, searchVideoItem, j7, new b(atomicBoolean, booleanRef, searchResultAllFragment, r02), new c(searchResultAllFragment))));
        return Unit.INSTANCE;
    }
}
