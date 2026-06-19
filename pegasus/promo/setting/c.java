package com.bilibili.pegasus.promo.setting;

import android.content.SharedPreferences;
import com.bilibili.base.BiliGlobalPreferenceHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/c.class */
public final class c {
    public static final void a() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
        if (bLKVSharedPreference == null || (editorEdit = bLKVSharedPreference.edit()) == null || (editorPutBoolean = editorEdit.putBoolean("pegasus_inline_volume_setting_operated", true)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }
}
