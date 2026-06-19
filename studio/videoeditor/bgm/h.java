package com.bilibili.studio.videoeditor.bgm;

import android.content.Context;
import android.text.TextUtils;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.xpref.Xpref;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/h.class */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f109078b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, Bgm> f109079a;

    @NotNull
    public final ArrayList<Bgm> a(Context context) {
        HashMap<String, Bgm> map = this.f109079a;
        if (map == null || map.size() == 0) {
            return new ArrayList<>();
        }
        String string = Xpref.getSharedPreferences(context, "editor_config").getString("key_bgm_listened_sids" + BiliAccounts.get(context).mid(), null);
        ArrayList<Bgm> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(",")) {
                Bgm bgm = this.f109079a.get(str);
                if (bgm != null) {
                    arrayList.add(bgm);
                }
            }
        }
        return arrayList;
    }
}
