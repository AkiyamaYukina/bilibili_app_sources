package com.bilibili.ogv.misc.topicplaylist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.okretro.ServiceGenerator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final RemoteLogicService f69663a = (RemoteLogicService) ServiceGenerator.createRetrofitBuilder().baseUrl("https://api.bilibili.com").build().create(RemoteLogicService.class);
}
