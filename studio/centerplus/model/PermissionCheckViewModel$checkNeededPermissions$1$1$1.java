package com.bilibili.studio.centerplus.model;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/PermissionCheckViewModel$checkNeededPermissions$1$1$1.class */
public final class PermissionCheckViewModel$checkNeededPermissions$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final boolean $checkAllPermission;
    final PreviewData $checkArchiveResult;
    final String $curPage;
    final Integer[] $permissions;
    final String $relationFrom;
    final int $tabIndex;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    boolean Z$0;
    int label;
    final g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionCheckViewModel$checkNeededPermissions$1$1$1(g gVar, PreviewData previewData, String str, String str2, int i7, Integer[] numArr, FragmentActivity fragmentActivity, boolean z6, Continuation<? super PermissionCheckViewModel$checkNeededPermissions$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$checkArchiveResult = previewData;
        this.$relationFrom = str;
        this.$curPage = str2;
        this.$tabIndex = i7;
        this.$permissions = numArr;
        this.$activity = fragmentActivity;
        this.$checkAllPermission = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PermissionCheckViewModel$checkNeededPermissions$1$1$1(this.this$0, this.$checkArchiveResult, this.$relationFrom, this.$curPage, this.$tabIndex, this.$permissions, this.$activity, this.$checkAllPermission, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0315 -> B:87:0x0325). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0382 -> B:88:0x037c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.model.PermissionCheckViewModel$checkNeededPermissions$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
