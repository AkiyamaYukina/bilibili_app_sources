package com.bilibili.ogv.infra.jsb;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.ogv.infra.jsb.d;
import com.google.gson.JsonElement;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/e.class */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsBridgeClassRecord f67880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f67881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67882c;

    public e(f fVar, String str) {
        this.f67881b = fVar;
        this.f67882c = str;
        this.f67880a = new JsBridgeClassRecord(fVar.getClass());
    }

    @Override // com.bilibili.ogv.infra.jsb.g
    public final void a(d.a aVar, String str, JSONObject jSONObject, String str2, CoroutineScope coroutineScope) {
        JsBridgeClassRecord jsBridgeClassRecord = this.f67880a;
        Function2<Object, JSONObject, JsonElement> function2 = jsBridgeClassRecord.f67869a.get(str);
        if (function2 != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new JsbBuilderKt$jsbUnit$1$invoke$1$1(function2, this.f67881b, jSONObject, aVar, str2, null), 3, (Object) null);
            return;
        }
        Function3<Object, JSONObject, Continuation<? super JsonElement>, Object> function3 = jsBridgeClassRecord.f67870b.get(str);
        if (function3 != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new JsbBuilderKt$jsbUnit$1$invoke$2$1(function3, this.f67881b, jSONObject, aVar, str2, null), 3, (Object) null);
            return;
        }
        com.bilibili.ogv.infra.util.e.b(new IllegalStateException(("Method `" + str + "` not found!").toString()));
    }

    @Override // com.bilibili.ogv.infra.jsb.g
    public final Set<String> getMethodNames() {
        return this.f67880a.f67871c;
    }

    @Override // com.bilibili.ogv.infra.jsb.g
    public final String getName() {
        return this.f67882c;
    }
}
