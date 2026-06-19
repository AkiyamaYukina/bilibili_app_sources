package com.bilibili.studio.upper.publish;

import com.bilibili.studio.upper.publish.d;
import com.bilibili.studio.upper.service.UpperArchiveMossWatcher;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/c.class */
public final /* synthetic */ class c implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        IA0.b bVar;
        long jLongValue = ((Long) obj).longValue();
        if (d.b.f108678a[((UploadConfig$Status) obj2).ordinal()] == 1 && (bVar = d.f108675b) != null && bVar.a(String.valueOf(jLongValue)) != null) {
            Map<Long, com.bilibili.studio.upper.service.d> map = UpperArchiveMossWatcher.f108683a;
            UpperArchiveMossWatcher.a(d.f108676c);
        }
        return Unit.INSTANCE;
    }
}
