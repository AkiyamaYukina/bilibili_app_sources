package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import com.bilibili.studio.videoeditor.ms.transition.TransitionSelectItem;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionRepository$fetchAllTransition$2.class */
final class BiliEditorTransitionRepository$fetchAllTransition$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Pair<? extends TransitionData.TransitionTabBean, ? extends List<TransitionSelectItem>>>>, Object> {
    private Object L$0;
    int label;
    final j this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionRepository$fetchAllTransition$2$a.class */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((TransitionData.TransitionTabBean) t7).rank), Integer.valueOf(((TransitionData.TransitionTabBean) t8).rank));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTransitionRepository$fetchAllTransition$2(j jVar, Continuation<? super BiliEditorTransitionRepository$fetchAllTransition$2> continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BiliEditorTransitionRepository$fetchAllTransition$2 biliEditorTransitionRepository$fetchAllTransition$2 = new BiliEditorTransitionRepository$fetchAllTransition$2(this.this$0, continuation);
        biliEditorTransitionRepository$fetchAllTransition$2.L$0 = obj;
        return biliEditorTransitionRepository$fetchAllTransition$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Pair<? extends TransitionData.TransitionTabBean, ? extends List<TransitionSelectItem>>>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionRepository$fetchAllTransition$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
