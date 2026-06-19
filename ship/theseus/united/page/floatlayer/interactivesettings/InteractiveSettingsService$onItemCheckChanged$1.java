package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$onItemCheckChanged$1.class */
final class InteractiveSettingsService$onItemCheckChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $currentState;
    final int $type;
    int label;
    final InteractiveSettingsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveSettingsService$onItemCheckChanged$1(InteractiveSettingsService interactiveSettingsService, int i7, boolean z6, Continuation<? super InteractiveSettingsService$onItemCheckChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = interactiveSettingsService;
        this.$type = i7;
        this.$currentState = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InteractiveSettingsService$onItemCheckChanged$1(this.this$0, this.$type, this.$currentState, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            List<InteractionSection> list = (List) this.this$0.f99785d.f99808c.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (InteractionSection interactionSection : list) {
                String strA = interactionSection.a();
                String strB = interactionSection.b();
                List<InteractionItem> listC = interactionSection.c();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listC, 10));
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    arrayList2.add(InteractionItem.c((InteractionItem) it.next()));
                }
                arrayList.add(new InteractionSection(strA, strB, arrayList2));
            }
            d dVar = this.this$0.f99785d;
            int i8 = this.$type;
            boolean z6 = this.$currentState;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList);
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList4, ((InteractionSection) it2.next()).d());
            }
            Iterator it3 = arrayList4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (((InteractionItem) next).h() == i8) {
                    break;
                }
            }
            InteractionItem interactionItem = (InteractionItem) next;
            if (interactionItem != null) {
                interactionItem.i((!z6 ? InteractionItemStatus.On : InteractionItemStatus.Off).getStatus());
            }
            dVar.f99808c.setValue(arrayList3);
            int i9 = this.$type;
            if (i9 == InteractionItemType.DanmakuSwitch.getType()) {
                InteractiveSettingsService interactiveSettingsService = this.this$0;
                boolean z7 = this.$currentState;
                this.label = 1;
                if (InteractiveSettingsService.a(interactiveSettingsService, z7, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i9 == InteractionItemType.CommentSwitch.getType()) {
                InteractiveSettingsService interactiveSettingsService2 = this.this$0;
                boolean z8 = this.$currentState;
                this.label = 2;
                Object objEmit = interactiveSettingsService2.f99787f.f99225K.emit(Boxing.boxBoolean(z8), this);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i9 == InteractionItemType.NiceCommentSwitch.getType()) {
                InteractiveSettingsService interactiveSettingsService3 = this.this$0;
                boolean z9 = this.$currentState;
                this.label = 3;
                Object objEmit2 = interactiveSettingsService3.f99787f.f99224J.emit(Boxing.boxBoolean(!z9), this);
                if (objEmit2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit2 = Unit.INSTANCE;
                }
                if (objEmit2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i9 == InteractionItemType.ChargeCommentSwitch.getType()) {
                InteractiveSettingsService interactiveSettingsService4 = this.this$0;
                boolean z10 = this.$currentState;
                this.label = 4;
                Object objEmit3 = interactiveSettingsService4.f99787f.f99223I.emit(Boxing.boxBoolean(!z10), this);
                if (objEmit3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit3 = Unit.INSTANCE;
                }
                if (objEmit3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
