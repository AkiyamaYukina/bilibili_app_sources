package com.bilibili.studio.centerplus.bubble;

import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.gripper.api.Producer;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import yw0.C9103a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/a.class */
public final class a {

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.bubble.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/a$a.class */
    public static final class C1179a implements kntr.app.upper.entrance.ab.b {
        public final Map<String, String> a() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C0.b()) {
                linkedHashMap.put(EditCustomizeSticker.TAG_MID, String.valueOf(BiliAccounts.get(FoundationAlias.getFapp()).mid()));
            }
            String str = C9103a.f129912a;
            linkedHashMap.put("ab_extra", C9103a.C1393a.a());
            return linkedHashMap;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kntr.app.upper.entrance.ab.b] */
    @Producer(singleton = true)
    @NotNull
    public static final kntr.app.upper.entrance.ab.b produceABParamsProvider() {
        return new Object();
    }
}
