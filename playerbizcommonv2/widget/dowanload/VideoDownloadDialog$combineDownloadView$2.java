package com.bilibili.playerbizcommonv2.widget.dowanload;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.widget.dowanload.q;
import com.bilibili.playerbizcommonv2.widget.setting.channel.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineDownloadView$2.class */
final class VideoDownloadDialog$combineDownloadView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final StateFlow<Long> $currentCidFlow;
    final RecyclerView $selectView;
    final RecyclerView $tabView;
    private Object L$0;
    int label;
    final VideoDownloadDialog this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineDownloadView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final StateFlow<Long> $currentCidFlow;
        final List<Long> $selectComponentIdList;
        final RecyclerView $selectView;
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineDownloadView$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            final List<Long> $selectComponentIdList;
            final RecyclerView $selectView;
            long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecyclerView recyclerView, List<Long> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$selectView = recyclerView;
                this.$selectComponentIdList = list;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selectView, this.$selectComponentIdList, continuation);
                anonymousClass1.J$0 = ((Number) obj).longValue();
                return anonymousClass1;
            }

            public final Object invoke(long j7, Continuation<? super Unit> continuation) {
                return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long j7 = this.J$0;
                if (j7 <= 0) {
                    return Unit.INSTANCE;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.$selectView.getLayoutManager();
                Iterator<Long> it = this.$selectComponentIdList.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (it.next().longValue() == j7) {
                        break;
                    }
                    i7++;
                }
                linearLayoutManager.scrollToPositionWithOffset(i7, DimenUtilsKt.dpToPx(30.0f));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StateFlow<Long> stateFlow, RecyclerView recyclerView, List<Long> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentCidFlow = stateFlow;
            this.$selectView = recyclerView;
            this.$selectComponentIdList = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$currentCidFlow, this.$selectView, this.$selectComponentIdList, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Long> stateFlow = this.$currentCidFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selectView, this.$selectComponentIdList, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloadDialog$combineDownloadView$2(RecyclerView recyclerView, RecyclerView recyclerView2, VideoDownloadDialog videoDownloadDialog, StateFlow<Long> stateFlow, Continuation<? super VideoDownloadDialog$combineDownloadView$2> continuation) {
        super(2, continuation);
        this.$tabView = recyclerView;
        this.$selectView = recyclerView2;
        this.this$0 = videoDownloadDialog;
        this.$currentCidFlow = stateFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoDownloadDialog$combineDownloadView$2 videoDownloadDialog$combineDownloadView$2 = new VideoDownloadDialog$combineDownloadView$2(this.$tabView, this.$selectView, this.this$0, this.$currentCidFlow, continuation);
        videoDownloadDialog$combineDownloadView$2.L$0 = obj;
        return videoDownloadDialog$combineDownloadView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        RecyclerView.Adapter fVar;
        RecyclerView.Adapter adapter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            fVar = new com.bilibili.app.gemini.ui.f(false);
            this.$tabView.setItemAnimator(null);
            this.$tabView.setNestedScrollingEnabled(false);
            this.$tabView.setAdapter(null);
            this.$tabView.setVisibility(8);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            this.$selectView.setAdapter(fVar);
            this.$selectView.setItemAnimator(null);
            List<q.a> list = this.this$0.f82491d;
            StateFlow<Long> stateFlow = this.$currentCidFlow;
            for (q.a aVar : list) {
                arrayList.add(Boxing.boxLong(aVar.f82586a));
                arrayList2.add(new q(aVar, stateFlow));
            }
            arrayList2.add(new com.bilibili.app.gemini.ui.m());
            arrayList2.add(new w(20));
            fVar.N(arrayList2);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$currentCidFlow, this.$selectView, arrayList, null), 3, (Object) null);
            try {
                this.L$0 = fVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                fVar.N(CollectionsKt.emptyList());
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RecyclerView.Adapter adapter2 = (com.bilibili.app.gemini.ui.f) this.L$0;
            adapter = adapter2;
            try {
                ResultKt.throwOnFailure(obj);
                fVar = adapter2;
            } catch (Throwable th2) {
                fVar = adapter;
                th = th2;
                fVar.N(CollectionsKt.emptyList());
                throw th;
            }
        }
        RecyclerView.Adapter adapter3 = fVar;
        adapter = fVar;
        throw new KotlinNothingValueException();
    }
}
