package com.bilibili.pegasus.components.interest.ui.v26;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4886s0;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubSection;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubType;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseDialogSecondTab$initBasicView$2.class */
final class InterestChooseDialogSecondTab$initBasicView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseDialogSecondTab this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseDialogSecondTab$initBasicView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseDialogSecondTab$initBasicView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<kp0.g, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseDialogSecondTab this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseDialogSecondTab$initBasicView$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseDialogSecondTab$initBasicView$2$1$a.class */
        public static final class a extends RecyclerView.ItemDecoration {
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView, state);
                rect.top = ListExtentionsKt.toPx(recyclerView.getChildAdapterPosition(view) == 0 ? 12 : 28);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseDialogSecondTab interestChooseDialogSecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseDialogSecondTab;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void invokeSuspend$lambda$0(int r22, int r23, int r24) {
            /*
                Method dump skipped, instruction units count: 564
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseDialogSecondTab$initBasicView$2.AnonymousClass1.invokeSuspend$lambda$0(int, int, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(int i7, int i8, int i9) {
            StateFlow<InterestChoose> stateFlow;
            InterestChoose interestChoose;
            List<InterestChooseSubSection> subSections;
            InterestChooseMultiPageViewModel interestChooseMultiPageViewModel = l.f76461a;
            if (interestChooseMultiPageViewModel == null || (stateFlow = interestChooseMultiPageViewModel.f76436b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                return;
            }
            List<InterestChooseItem> listU = interestChoose.u();
            InterestChooseItem interestChooseItem = listU != null ? (InterestChooseItem) CollectionsKt.getOrNull(listU, i7) : null;
            InterestChooseSubSection interestChooseSubSection = (interestChooseItem == null || (subSections = interestChooseItem.getSubSections()) == null) ? null : (InterestChooseSubSection) CollectionsKt.getOrNull(subSections, i8);
            InterestChooseSubItem interestChooseSubItem = null;
            if (interestChooseSubSection != null) {
                List<InterestChooseSubItem> subItems = interestChooseSubSection.getSubItems();
                interestChooseSubItem = null;
                if (subItems != null) {
                    interestChooseSubItem = (InterestChooseSubItem) CollectionsKt.getOrNull(subItems, i9);
                }
            }
            if (interestChooseItem == null || interestChooseSubSection == null || interestChooseSubItem == null) {
                return;
            }
            com.bilibili.pegasus.components.interest.e.o(interestChooseItem, i7 + 1, interestChooseSubItem.j(), interestChooseSubItem.i(), interestChooseSubItem.f77423i + 1, interestChoose.D(), interestChoose.O(), android.support.v4.media.a.a("{\"group_name\":\"", interestChooseSubSection.getTitle(), "\"}"), false, 768);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(kp0.g gVar, Continuation<? super Unit> continuation) {
            return create(gVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [com.bilibili.pegasus.components.interest.ui.v26.f, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.bilibili.pegasus.components.interest.ui.v26.g, java.lang.Object] */
        public final Object invokeSuspend(Object obj) {
            RecyclerView.ItemAnimator itemAnimator;
            RecyclerView.ItemAnimator itemAnimator2;
            RecyclerView.ItemAnimator itemAnimator3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kp0.g gVar = (kp0.g) this.L$0;
            InterestChooseItem interestChooseItem = gVar.f122943b;
            if (interestChooseItem == null) {
                return Unit.INSTANCE;
            }
            C4886s0 c4886s0 = this.this$0.f76434b;
            if (c4886s0 != null) {
                c4886s0.f54147f.setText(interestChooseItem.getName());
            }
            C4886s0 c4886s02 = this.this$0.f76434b;
            InterestChooseItem interestChooseItem2 = gVar.f122943b;
            if (c4886s02 != null) {
                c4886s02.f54146e.setText(interestChooseItem2.getTip());
            }
            C4886s0 c4886s03 = this.this$0.f76434b;
            if (!((c4886s03 != null ? c4886s03.f54145d.getAdapter() : null) instanceof q)) {
                C4886s0 c4886s04 = this.this$0.f76434b;
                if (c4886s04 != null) {
                    c4886s04.f54145d.setAdapter(new q(new Object(), new Object()));
                }
                C4886s0 c4886s05 = this.this$0.f76434b;
                if (c4886s05 != null) {
                    c4886s05.f54145d.addItemDecoration(new RecyclerView.ItemDecoration());
                }
                C4886s0 c4886s06 = this.this$0.f76434b;
                if (c4886s06 != null && (itemAnimator3 = c4886s06.f54145d.getItemAnimator()) != null) {
                    itemAnimator3.setAddDuration(0L);
                }
                C4886s0 c4886s07 = this.this$0.f76434b;
                if (c4886s07 != null && (itemAnimator2 = c4886s07.f54145d.getItemAnimator()) != null) {
                    itemAnimator2.setChangeDuration(0L);
                }
                C4886s0 c4886s08 = this.this$0.f76434b;
                if (c4886s08 != null && (itemAnimator = c4886s08.f54145d.getItemAnimator()) != null) {
                    itemAnimator.setRemoveDuration(0L);
                }
            }
            C4886s0 c4886s09 = this.this$0.f76434b;
            if (c4886s09 != null) {
                ImageExtentionKt.displayImage$default(c4886s09.f54144c, interestChooseItem2.getIcon(), (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
            }
            C4886s0 c4886s010 = this.this$0.f76434b;
            RecyclerView.Adapter adapter = c4886s010 != null ? c4886s010.f54145d.getAdapter() : null;
            q qVar = null;
            if (adapter instanceof q) {
                qVar = (q) adapter;
            }
            if (qVar != null) {
                List<InterestChooseSubSection> subSections = interestChooseItem2.getSubSections();
                List<InterestChooseSubSection> listEmptyList = subSections;
                if (subSections == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                boolean z6 = interestChooseItem2.getSubType() == InterestChooseSubType.BUBBLE.getValue();
                int originPos = interestChooseItem2.getOriginPos();
                qVar.f76472c = z6;
                qVar.f76473d = originPos;
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(qVar.f76474e, listEmptyList));
                ((ArrayList) qVar.f76474e).clear();
                ((ArrayList) qVar.f76474e).addAll(listEmptyList);
                diffResultCalculateDiff.dispatchUpdatesTo(qVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseDialogSecondTab$initBasicView$2(InterestChooseDialogSecondTab interestChooseDialogSecondTab, Continuation<? super InterestChooseDialogSecondTab$initBasicView$2> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseDialogSecondTab;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseDialogSecondTab$initBasicView$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<kp0.g> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseMultiPageViewModel interestChooseMultiPageViewModel = l.f76461a;
            if (interestChooseMultiPageViewModel != null && (flow = interestChooseMultiPageViewModel.f76438d) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
