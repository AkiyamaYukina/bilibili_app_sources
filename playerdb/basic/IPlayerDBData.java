package com.bilibili.playerdb.basic;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerdb/basic/IPlayerDBData.class */
public interface IPlayerDBData extends Parcelable {
    String L0() throws JSONException;

    void V0(String str) throws JSONException;

    void k(@Nullable String str) throws JSONException;

    String l() throws JSONException;
}
