package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import com.bilibili.studio.videoeditor.ms.transition.TransitionSelectItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionViewModel$fetchAllTransition$1.class */
final class BiliEditorTransitionViewModel$fetchAllTransition$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliEditorTransitionViewModel this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionViewModel$fetchAllTransition$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionViewModel$fetchAllTransition$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final List<TransitionData.TransitionTabBean> $tabList;
        final List<TransitionSelectItem> $transList;
        int label;
        final BiliEditorTransitionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BiliEditorTransitionViewModel biliEditorTransitionViewModel, List<TransitionData.TransitionTabBean> list, List<TransitionSelectItem> list2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = biliEditorTransitionViewModel;
            this.$tabList = list;
            this.$transList = list2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$tabList, this.$transList, continuation);
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
            this.this$0.f107025n.setValue(this.$tabList);
            this.this$0.f107026o.setValue(this.$transList);
            this.this$0.P0();
            this.this$0.O0();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTransitionViewModel$fetchAllTransition$1(BiliEditorTransitionViewModel biliEditorTransitionViewModel, Continuation<? super BiliEditorTransitionViewModel$fetchAllTransition$1> continuation) {
        super(2, continuation);
        this.this$0 = biliEditorTransitionViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTransitionViewModel$fetchAllTransition$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = this.this$0.f107016d;
            this.label = 1;
            jVar.getClass();
            Object objWithContext = BuildersKt.withContext(getContext(), new BiliEditorTransitionRepository$fetchAllTransition$2(jVar, null), this);
            obj = objWithContext;
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        List<Pair> list2 = (List) obj;
        Pair pair = (Pair) CollectionsKt.firstOrNull(list2);
        if (pair != null && (list = (List) pair.getSecond()) != null) {
            list.add(0, this.this$0.f107031t);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair2 : list2) {
            TransitionData.TransitionTabBean transitionTabBean = (TransitionData.TransitionTabBean) pair2.component1();
            List list3 = (List) pair2.component2();
            if (!list3.isEmpty()) {
                arrayList.add(transitionTabBean);
                arrayList2.addAll(list3);
            }
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, arrayList, arrayList2, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
