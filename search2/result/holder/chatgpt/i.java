package com.bilibili.search2.result.holder.chatgpt;

import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/i.class */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f88013a;

    public /* synthetic */ i(j jVar) {
        this.f88013a = jVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        j jVar = this.f88013a;
        jVar.f88020g += iIntValue2;
        SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
        if (iIntValue < jVar.f88014a.size() - 1) {
            jVar.f88014a.get(iIntValue + 1).getAnimStartShow().setValue(Boolean.TRUE);
        } else {
            BS0.e eVar = jVar.f88015b;
            if (eVar != null) {
                eVar.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
