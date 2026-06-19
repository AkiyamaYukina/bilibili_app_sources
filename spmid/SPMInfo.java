package com.bilibili.spmid;

import androidx.annotation.Keep;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/spmid/SPMInfo.class */
@Keep
public final class SPMInfo {

    @NotNull
    private HashMap<String, String> params = new HashMap<>();

    @NotNull
    private List<SPMID> spms = new ArrayList();

    public final void append(@Nullable SPMID spmid, @Nullable HashMap<String, String> map) {
        Set<String> setKeySet;
        if (spmid != null) {
            this.spms.add(0, spmid);
        }
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        for (String str : setKeySet) {
            this.params.put(str, map.get(str));
        }
    }

    @NotNull
    public final HashMap<String, String> getParams() {
        return this.params;
    }

    @NotNull
    public final String getSpmId() {
        String[] strArr = new String[4];
        for (int i7 = 0; i7 < 4; i7++) {
            strArr[i7] = "0";
        }
        for (SPMID spmid : this.spms) {
            if (4 > spmid.getSegment().ordinal()) {
                strArr[spmid.getSegment().ordinal()] = spmid.getId();
            }
        }
        return ArraysKt.F(strArr, UtilsKt.DOT, (CharSequence) null, (CharSequence) null, (Function1) null, 62);
    }

    @NotNull
    public final List<SPMID> getSpms() {
        return this.spms;
    }

    public final void setParams(@NotNull HashMap<String, String> map) {
        this.params = map;
    }

    public final void setSpms(@NotNull List<SPMID> list) {
        this.spms = list;
    }

    @NotNull
    public String toString() {
        return getSpmId();
    }
}
