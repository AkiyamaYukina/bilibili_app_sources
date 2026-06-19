package com.bilibili.ogv.misc.follow.api.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/FollowMovableList.class */
@StabilityInferred(parameters = 0)
@Bson
public final class FollowMovableList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("movable_list")
    @NotNull
    private List<Long> f69125a = new ArrayList();

    @NotNull
    public final List<Long> a() {
        return this.f69125a;
    }

    public final void b(@NotNull List<Long> list) {
        this.f69125a = list;
    }
}
