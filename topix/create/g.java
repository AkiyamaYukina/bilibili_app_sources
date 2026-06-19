package com.bilibili.topix.create;

import Hh.h;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.topix.model.TopicCreationResult;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/g.class */
@StabilityInferred(parameters = 0)
public final class g extends h<f, TopicCreationResult> {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.bilibili.lib.blrouter.MutableBundleLike r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = r6
            com.bilibili.topix.create.f r0 = (com.bilibili.topix.create.f) r0
            r9 = r0
            java.lang.String r0 = ""
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L1d
            r0 = r9
            java.lang.String r0 = r0.f112596a
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L20
        L1d:
            java.lang.String r0 = ""
            r6 = r0
        L20:
            r0 = r5
            java.lang.String r1 = "name"
            r2 = r6
            com.bilibili.lib.blrouter.MutableBundleLike r0 = r0.put(r1, r2)
            r0 = r9
            if (r0 == 0) goto L3e
            r0 = r9
            java.lang.String r0 = r0.f112597b
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L41
        L3e:
            java.lang.String r0 = ""
            r6 = r0
        L41:
            r0 = r5
            java.lang.String r1 = "desc"
            r2 = r6
            com.bilibili.lib.blrouter.MutableBundleLike r0 = r0.put(r1, r2)
            r0 = r7
            r6 = r0
            r0 = r9
            if (r0 == 0) goto L61
            r0 = r9
            java.lang.String r0 = r0.f112598c
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L61
            r0 = r7
            r6 = r0
            goto L61
        L61:
            r0 = r5
            java.lang.String r1 = "scene"
            r2 = r6
            com.bilibili.lib.blrouter.MutableBundleLike r0 = r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.create.g.a(com.bilibili.lib.blrouter.MutableBundleLike, java.lang.Object):void");
    }

    public final Object parseResult(int i7, Intent intent) {
        TopicCreationResult topicCreationResult = null;
        if (i7 == -1) {
            topicCreationResult = null;
            if (intent != null) {
                String stringExtra = intent.getStringExtra("publish_result");
                topicCreationResult = null;
                if (stringExtra != null) {
                    Json.Default r02 = Json.Default;
                    r02.getSerializersModule();
                    topicCreationResult = (TopicCreationResult) r02.decodeFromString(BuiltinSerializersKt.getNullable(TopicCreationResult.Companion.serializer()), stringExtra);
                }
            }
        }
        return topicCreationResult;
    }
}
