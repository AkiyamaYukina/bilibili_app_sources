package com.bilibili.pegasus.utils;

import com.bilibili.spmid.SPMID;
import com.bilibili.spmid.SPMTrackNodeWrapper;
import java.util.HashMap;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.utils.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/i.class */
public final class C5765i implements SPMTrackNodeWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Pair<SPMID, ? extends HashMap<String, String>> f78872a;

    public C5765i() {
        throw null;
    }

    @Override // com.bilibili.spmid.SPMTrackNodeWrapper
    @Nullable
    public final Pair<SPMID, HashMap<String, String>> fillTrackParams() {
        return this.f78872a;
    }
}
