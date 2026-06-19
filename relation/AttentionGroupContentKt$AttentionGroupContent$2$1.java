package com.bilibili.relation;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.bilibili.relation.W;
import com.bilibili.relation.api.AttentionGroup;
import com.bilibili.relation.api.RelationService;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/AttentionGroupContentKt$AttentionGroupContent$2$1.class */
final class AttentionGroupContentKt$AttentionGroupContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $accessKey;
    final RelationService $apiService;
    final SnapshotStateMap<String, String> $checkedGroups;
    final Context $context;
    final long $mid;
    final List<String> $oldGroups;
    final MutableState<W> $pageState$delegate;
    final SnapshotStateMap<String, String> $pendingCheckedGroups;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttentionGroupContentKt$AttentionGroupContent$2$1(Context context, RelationService relationService, String str, long j7, MutableState<W> mutableState, SnapshotStateMap<String, String> snapshotStateMap, SnapshotStateMap<String, String> snapshotStateMap2, List<String> list, Continuation<? super AttentionGroupContentKt$AttentionGroupContent$2$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$apiService = relationService;
        this.$accessKey = str;
        this.$mid = j7;
        this.$pageState$delegate = mutableState;
        this.$checkedGroups = snapshotStateMap;
        this.$pendingCheckedGroups = snapshotStateMap2;
        this.$oldGroups = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, List list, MutableState mutableState, List list2, Map map, AttentionGroup attentionGroup, String str) {
        snapshotStateMap.clear();
        snapshotStateMap.putAll(map);
        snapshotStateMap.putAll(snapshotStateMap2);
        snapshotStateMap2.clear();
        list.clear();
        list.addAll(map.keySet());
        mutableState.setValue(new W.b(list2, attentionGroup, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(MutableState mutableState, String str) {
        mutableState.setValue(new W.a(str));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AttentionGroupContentKt$AttentionGroupContent$2$1(this.$context, this.$apiService, this.$accessKey, this.$mid, this.$pageState$delegate, this.$checkedGroups, this.$pendingCheckedGroups, this.$oldGroups, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [com.bilibili.relation.t] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.bilibili.relation.u] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.$pageState$delegate.setValue(W.c.f85987a);
            Context context = this.$context;
            RelationService relationService = this.$apiService;
            String str = this.$accessKey;
            long j7 = this.$mid;
            final SnapshotStateMap<String, String> snapshotStateMap = this.$checkedGroups;
            final SnapshotStateMap<String, String> snapshotStateMap2 = this.$pendingCheckedGroups;
            final List<String> list = this.$oldGroups;
            final MutableState<W> mutableState = this.$pageState$delegate;
            ?? r02 = new Function4(snapshotStateMap, snapshotStateMap2, list, mutableState) { // from class: com.bilibili.relation.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SnapshotStateMap f86137a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SnapshotStateMap f86138b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List f86139c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final MutableState f86140d;

                {
                    this.f86137a = snapshotStateMap;
                    this.f86138b = snapshotStateMap2;
                    this.f86139c = list;
                    this.f86140d = mutableState;
                }

                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    SnapshotStateMap snapshotStateMap3 = this.f86138b;
                    MutableState mutableState2 = this.f86140d;
                    return AttentionGroupContentKt$AttentionGroupContent$2$1.invokeSuspend$lambda$0(this.f86137a, snapshotStateMap3, this.f86139c, mutableState2, (List) obj2, (Map) obj3, (AttentionGroup) obj4, (String) obj5);
                }
            };
            ?? r03 = new Function1(mutableState) { // from class: com.bilibili.relation.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MutableState f86141a;

                {
                    this.f86141a = mutableState;
                }

                public final Object invoke(Object obj2) {
                    return AttentionGroupContentKt$AttentionGroupContent$2$1.invokeSuspend$lambda$1(this.f86141a, (String) obj2);
                }
            };
            this.label = 1;
            if (C6029v.k(context, relationService, str, j7, r02, r03, this) == coroutine_suspended) {
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
