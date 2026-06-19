package com.bilibili.upper.module.cover_v2.data;

import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/MultiCoverDataLoader$FetchTask$coverTemplatesState$1.class */
final /* synthetic */ class MultiCoverDataLoader$FetchTask$coverTemplatesState$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public MultiCoverDataLoader$FetchTask$coverTemplatesState$1(Object obj) {
        super(1, obj, MultiCoverDataLoader.a.class, "onAnyResult", "onAnyResult(Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z6) {
        MultiCoverDataLoader.a aVar = (MultiCoverDataLoader.a) ((CallableReference) this).receiver;
        if (aVar.f112792c) {
            return;
        }
        if (!z6) {
            aVar.f112790a.invoke(Boolean.FALSE);
            aVar.f112792c = true;
            return;
        }
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new MultiCoverDataLoader.b[]{aVar.f112791b});
        if (arrayListArrayListOf == null || !arrayListArrayListOf.isEmpty()) {
            Iterator it = arrayListArrayListOf.iterator();
            while (it.hasNext()) {
                if (!((MultiCoverDataLoader.b) it.next()).f112796c) {
                    return;
                }
            }
        }
        aVar.f112790a.invoke(Boolean.TRUE);
        aVar.f112792c = true;
    }
}
