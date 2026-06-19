package com.bilibili.relation;

import android.content.Context;
import com.bilibili.okretro.utils.ExBilowUtil;
import com.bilibili.relation.api.AllGroup;
import com.bilibili.relation.api.AttentionGroup;
import com.bilibili.relation.api.RelationService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/AttentionGroupContentKt$loadGroupData$2.class */
final class AttentionGroupContentKt$loadGroupData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $accessKey;
    final RelationService $apiService;
    final Context $context;
    final long $mid;
    final Function4<List<? extends AttentionGroup>, Map<String, String>, AttentionGroup, String, Unit> $onSuccess;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AttentionGroupContentKt$loadGroupData$2(RelationService relationService, String str, Context context, long j7, Function4<? super List<? extends AttentionGroup>, ? super Map<String, String>, ? super AttentionGroup, ? super String, Unit> function4, Continuation<? super AttentionGroupContentKt$loadGroupData$2> continuation) {
        super(2, continuation);
        this.$apiService = relationService;
        this.$accessKey = str;
        this.$context = context;
        this.$mid = j7;
        this.$onSuccess = function4;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AttentionGroupContentKt$loadGroupData$2(this.$apiService, this.$accessKey, this.$context, this.$mid, this.$onSuccess, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        Map mapEmptyMap;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            AllGroup allGroup = (AllGroup) ExBilowUtil.extractResponseData(this.$apiService.getUserGroup(this.$accessKey).execute());
            if (allGroup == null) {
                throw new Exception(this.$context.getString(2131858012));
            }
            ArrayList arrayList = new ArrayList();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            List<AttentionGroup> list = allGroup.specialGroup;
            if (list != null) {
                List<AttentionGroup> list2 = list;
                arrayList.addAll(list2);
                if (!list2.isEmpty()) {
                    objectRef.element = list.get(0).groupId;
                }
            }
            List<AttentionGroup> list3 = allGroup.customGroup;
            if (list3 != null) {
                Boxing.boxBoolean(arrayList.addAll(list3));
            }
            List<AttentionGroup> list4 = allGroup.defaultGroup;
            AttentionGroup attentionGroup = null;
            if (list4 != null) {
                attentionGroup = null;
                if (list4 != null) {
                    attentionGroup = null;
                    if (list4.size() == 1) {
                        List<AttentionGroup> list5 = allGroup.defaultGroup;
                        attentionGroup = null;
                        if (list5 != null) {
                            attentionGroup = list5.get(0);
                        }
                    }
                }
            }
            try {
                Map map = (Map) ExBilowUtil.extractResponseData(this.$apiService.getGroupsOfMid(this.$accessKey, this.$mid).execute());
                mapEmptyMap = map;
                if (map == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
            } catch (Exception e7) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            this.$onSuccess.invoke(arrayList, mapEmptyMap, attentionGroup, objectRef.element);
            return Unit.INSTANCE;
        } catch (Exception e8) {
            throw new Exception(this.$context.getString(2131858012));
        }
    }
}
