package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/ActReserve.class */
@Keep
public class ActReserve implements Serializable {
    public ArrayList<ActReserveItem> act_reserve_list;
    public boolean act_reserve_open;
    public boolean is_default_bind;
    public boolean is_default_create;
}
