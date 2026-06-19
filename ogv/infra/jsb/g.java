package com.bilibili.ogv.infra.jsb;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.ogv.infra.jsb.d;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/g.class */
public interface g {
    void a(@NotNull d.a aVar, @NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2, @NotNull CoroutineScope coroutineScope);

    @NotNull
    Set<String> getMethodNames();

    @NotNull
    String getName();
}
