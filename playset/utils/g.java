package com.bilibili.playset.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.playset.constants.FolderGroupEnum;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/g.class */
public final class g {
    public static void a(@Nullable Context context, @NonNull FolderGroupEnum folderGroupEnum) {
        if (context == null) {
            return;
        }
        BiliGlobalPreferenceHelper.getBLKVSharedPreference(context).edit().putInt("key_store_last_visited_folder_group-" + BiliAccounts.get(context).mid(), folderGroupEnum.ordinal()).apply();
    }
}
