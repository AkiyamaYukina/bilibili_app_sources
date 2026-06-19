package com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm;

import Yy0.i;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxSticker;
import com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/vm/BiliEditorStickerListViewModel$handleDownloadStickerV2$1.class */
final class BiliEditorStickerListViewModel$handleDownloadStickerV2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<EditStickerItem> $curSelectSticker;
    final Function1<EditStickerItem, Unit> $notifyTabsDownloadState;
    final EditStickerItem $stickerItem;
    final Function1<EditStickerItem, Unit> $updateStickerItemState;
    Object L$0;
    Object L$1;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.BiliEditorStickerListViewModel$handleDownloadStickerV2$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/vm/BiliEditorStickerListViewModel$handleDownloadStickerV2$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function0<EditStickerItem> $curSelectSticker;
        final Function1<EditStickerItem, Unit> $notifyTabsDownloadState;
        final Ref.ObjectRef<i> $stickerDownloadResult;
        final EditStickerItem $stickerItem;
        final Function1<EditStickerItem, Unit> $updateStickerItemState;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(a aVar, Ref.ObjectRef<i> objectRef, Function0<? extends EditStickerItem> function0, Function1<? super EditStickerItem, Unit> function1, EditStickerItem editStickerItem, Function1<? super EditStickerItem, Unit> function12, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$stickerDownloadResult = objectRef;
            this.$curSelectSticker = function0;
            this.$updateStickerItemState = function1;
            this.$stickerItem = editStickerItem;
            this.$notifyTabsDownloadState = function12;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$stickerDownloadResult, this.$curSelectSticker, this.$updateStickerItemState, this.$stickerItem, this.$notifyTabsDownloadState, continuation);
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
            a aVar = this.this$0;
            if (aVar.f106986l) {
                return Unit.INSTANCE;
            }
            Object obj2 = this.$stickerDownloadResult.element;
            if (obj2 != null) {
                i iVar = (i) obj2;
                int i7 = iVar.f29374a;
                if (i7 != 0) {
                    Integer numBoxInt = null;
                    if (i7 == 1) {
                        int i8 = iVar.f29378e;
                        if (i8 != 0) {
                            aVar.f106982g.postValue(Boxing.boxInt(i8));
                        }
                        if (((i) this.$stickerDownloadResult.element).f29376c == 0) {
                            a aVar2 = this.this$0;
                            EditFxSticker editFxSticker = this.$stickerItem.getEditFxSticker();
                            if (editFxSticker != null) {
                                numBoxInt = Boxing.boxInt(editFxSticker.getId());
                            }
                            String str = ((i) this.$stickerDownloadResult.element).f29377d;
                            aVar2.getClass();
                            if (numBoxInt != null) {
                                Xz0.d dVar = Xz0.d.f28458a;
                                int iIntValue = numBoxInt.intValue();
                                dVar.getClass();
                                Xz0.d.y("editor", "error", "sticker", String.valueOf(iIntValue), str);
                            }
                        }
                        this.$notifyTabsDownloadState.invoke(this.$stickerItem);
                    } else if (i7 == 2) {
                        EditFxSticker editFxSticker2 = iVar.f29375b.getEditFxSticker();
                        Integer numBoxInt2 = editFxSticker2 != null ? Boxing.boxInt(editFxSticker2.getId()) : null;
                        if (numBoxInt2 != null) {
                            Xz0.d dVar2 = Xz0.d.f28458a;
                            int iIntValue2 = numBoxInt2.intValue();
                            dVar2.getClass();
                            Xz0.d.y("editor", "cancel", "sticker", String.valueOf(iIntValue2), null);
                        }
                        this.$notifyTabsDownloadState.invoke(((i) this.$stickerDownloadResult.element).f29375b);
                    }
                } else if (Intrinsics.areEqual(this.$curSelectSticker.invoke(), ((i) this.$stickerDownloadResult.element).f29375b)) {
                    this.this$0.K0(((i) this.$stickerDownloadResult.element).f29375b, this.$updateStickerItemState);
                }
            } else {
                this.$notifyTabsDownloadState.invoke(this.$stickerItem);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BiliEditorStickerListViewModel$handleDownloadStickerV2$1(a aVar, EditStickerItem editStickerItem, Function0<? extends EditStickerItem> function0, Function1<? super EditStickerItem, Unit> function1, Function1<? super EditStickerItem, Unit> function12, Continuation<? super BiliEditorStickerListViewModel$handleDownloadStickerV2$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$stickerItem = editStickerItem;
        this.$curSelectSticker = function0;
        this.$updateStickerItemState = function1;
        this.$notifyTabsDownloadState = function12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(a aVar, EditStickerItem editStickerItem) {
        EditFxSticker editFxSticker = editStickerItem.getEditFxSticker();
        Integer numValueOf = editFxSticker != null ? Integer.valueOf(editFxSticker.getId()) : null;
        aVar.getClass();
        if (numValueOf != null) {
            Xz0.d.z(Xz0.d.f28458a, "editor", "success", "sticker", String.valueOf(numValueOf.intValue()));
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorStickerListViewModel$handleDownloadStickerV2$1(this.this$0, this.$stickerItem, this.$curSelectSticker, this.$updateStickerItemState, this.$notifyTabsDownloadState, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.BiliEditorStickerListViewModel$handleDownloadStickerV2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
