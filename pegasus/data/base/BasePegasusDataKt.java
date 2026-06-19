package com.bilibili.pegasus.data.base;

import fp0.m;
import fp0.u;
import fp0.w;
import jp0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/base/BasePegasusDataKt.class */
public final class BasePegasusDataKt {
    public static final int getCreateType(@NotNull BasePegasusData basePegasusData) {
        return 1;
    }

    @Nullable
    public static final String getGetRecommendReason(@NotNull BasePegasusData basePegasusData) {
        String str;
        if (basePegasusData instanceof u) {
            e eVarP = ((u) basePegasusData).p();
            str = "";
            if (eVarP != null) {
                String strL = eVarP.l();
                str = strL;
                if (strL == null) {
                    str = "";
                }
            }
        } else if (basePegasusData instanceof w) {
            e eVarQ = ((w) basePegasusData).q();
            str = "";
            if (eVarQ != null) {
                String strL2 = eVarQ.l();
                str = strL2;
                if (strL2 == null) {
                    str = "";
                }
            }
        } else if (basePegasusData instanceof m) {
            e eVarG = ((m) basePegasusData).g();
            str = "";
            if (eVarG != null) {
                String strL3 = eVarG.l();
                str = strL3;
                if (strL3 == null) {
                    str = "";
                }
            }
        } else {
            str = null;
        }
        return str;
    }
}
