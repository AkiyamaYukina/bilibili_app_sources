package com.bilibili.studio.editor.moudle.aistory.sensitive;

import com.alibaba.fastjson.JSON;
import com.bilibili.studio.editor.moudle.aistory.sensitive.bean.SensitiveRequestBean;
import com.bilibili.studio.editor.moudle.aistory.sensitive.bean.SensitiveRequestBody;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/sensitive/c.class */
public final class c {
    public static RequestBody a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i7 = 0;
        for (Object obj : list2) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SensitiveRequestBean((String) obj, i7));
            i7++;
        }
        return RequestBody.create(MediaType.parse("application/json; charset=UTF-8"), JSON.toJSONString(new SensitiveRequestBody(arrayList)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.util.List r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.sensitive.c.b(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
