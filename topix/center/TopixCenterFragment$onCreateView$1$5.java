package com.bilibili.topix.center;

import PD0.C2771m;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterFragment$onCreateView$1$5.class */
public final class TopixCenterFragment$onCreateView$1$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TopixCenterFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterFragment$onCreateView$1$5$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopixCenterFragment f112376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<C6664b> f112377b;

        public a(TopixCenterFragment topixCenterFragment, Ref.ObjectRef<C6664b> objectRef) {
            this.f112376a = topixCenterFragment;
            this.f112377b = objectRef;
        }

        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            TopixCenterFragment topixCenterFragment = this.f112376a;
            C2771m c2771m = topixCenterFragment.f112372c;
            if (c2771m != null) {
                RecyclerView recyclerView = c2771m.f18767d;
                Ref.ObjectRef<C6664b> objectRef = this.f112377b;
                if (zBooleanValue) {
                    C6664b c6664b = new C6664b(new C6663a(topixCenterFragment.getString(2131854506), ListExtentionsKt.sp2Px(13, recyclerView.getContext()), 6.0f, ContextCompat.getColor(recyclerView.getContext(), R$color.Brand_pink), ContextCompat.getColor(recyclerView.getContext(), R$color.Text_white), -19.0f, 0, 1, 2.0f, 10.0f, 6.0f, 8.0f, 12.0f, Integer.MAX_VALUE, 0.0f, 0.0f));
                    objectRef.element = c6664b;
                    recyclerView.addItemDecoration(c6664b);
                } else {
                    C6664b c6664b2 = (C6664b) objectRef.element;
                    if (c6664b2 != null) {
                        recyclerView.removeItemDecoration(c6664b2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopixCenterFragment$onCreateView$1$5(TopixCenterFragment topixCenterFragment, Continuation<? super TopixCenterFragment$onCreateView$1$5> continuation) {
        super(2, continuation);
        this.this$0 = topixCenterFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopixCenterFragment$onCreateView$1$5(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.ObjectRef objectRefB = G0.g.b(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.mf().h);
            a aVar = new a(this.this$0, objectRefB);
            this.label = 1;
            if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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
