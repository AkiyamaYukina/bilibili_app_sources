package com.bilibili.pegasus.components.interest.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/SubCategoryInterestChooseDialog$handleConfirmButtonClicked$1.class */
final class SubCategoryInterestChooseDialog$handleConfirmButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final SubCategoryInterestChooseDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoryInterestChooseDialog$handleConfirmButtonClicked$1(SubCategoryInterestChooseDialog subCategoryInterestChooseDialog, Continuation<? super SubCategoryInterestChooseDialog$handleConfirmButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = subCategoryInterestChooseDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubCategoryInterestChooseDialog$handleConfirmButtonClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04b7 A[PHI: r23 r24 r29 r37 r38 r39 r40 r41 r42 r43
  0x04b7: PHI (r23v1 int) = (r23v0 int), (r23v2 int) binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r24v1 int) = (r24v0 int), (r24v2 int) binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r29v1 long) = (r29v0 long), (r29v2 long) binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r37v3 java.util.List) = (r37v0 java.util.List), (r37v8 java.util.List) binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r38v2 com.bilibili.pegasus.data.interestchoose.InterestChoose) = 
  (r38v0 com.bilibili.pegasus.data.interestchoose.InterestChoose)
  (r38v3 com.bilibili.pegasus.data.interestchoose.InterestChoose)
 binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r39v2 java.lang.String) = (r39v0 java.lang.String), (r39v3 java.lang.String) binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r40v1 java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem>) = 
  (r40v0 java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem>)
  (r40v2 java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem>)
 binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r41v1 java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseItem>) = 
  (r41v0 java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseItem>)
  (r41v2 java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseItem>)
 binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r42v1 kotlin.Pair[]) = (r42v0 kotlin.Pair[]), (r42v2 kotlin.Pair[]) binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]
  0x04b7: PHI (r43v1 kotlin.Pair[]) = (r43v0 kotlin.Pair[]), (r43v2 kotlin.Pair[]) binds: [B:115:0x0492, B:113:0x0485] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0619 A[LOOP:0: B:133:0x060f->B:135:0x0619, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0737 A[LOOP:1: B:159:0x072d->B:161:0x0737, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0366 A[LOOP:4: B:92:0x035c->B:94:0x0366, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog$handleConfirmButtonClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
