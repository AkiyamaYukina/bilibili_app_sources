package com.bilibili.spmid;

import java.util.HashMap;
import kotlin.Pair;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/spmid/SPMTrackNodeWrapper.class */
public interface SPMTrackNodeWrapper {
    @Nullable
    default Pair<SPMID, HashMap<String, String>> fillTrackParams() {
        return null;
    }
}
