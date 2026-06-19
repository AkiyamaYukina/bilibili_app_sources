package com.bilibili.relation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.bilibili.relation.api.AttentionGroup;
import kntr.common.comment.card.action.CardAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.relation.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/e.class */
public final /* synthetic */ class C6013e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f86064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f86065c;

    public /* synthetic */ C6013e(int i7, Object obj, Object obj2) {
        this.f86063a = i7;
        this.f86064b = obj;
        this.f86065c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        switch (this.f86063a) {
            case 0:
                AttentionGroup attentionGroup = (AttentionGroup) obj;
                String str = attentionGroup.groupId;
                if (str != null) {
                    String str2 = attentionGroup.groupName;
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    ((SnapshotStateMap) this.f86064b).put(str, str3);
                }
                MutableState mutableState = (MutableState) this.f86065c;
                mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
                break;
            default:
                W41.a aVar = (W41.a) this.f86064b;
                O41.b bVar = (O41.b) this.f86065c;
                a81.a aVar2 = bVar.f;
                aVar.c.a(new CardAction.ClickUser(bVar.a, aVar2.a, CardAction.ClickUser.ReportPosition.AVATAR));
                break;
        }
        return Unit.INSTANCE;
    }
}
