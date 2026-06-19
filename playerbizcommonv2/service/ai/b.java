package com.bilibili.playerbizcommonv2.service.ai;

import Jr0.f;
import com.bilibili.lib.media.resource.Badge;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/b.class */
public final class b {
    public static final boolean a(@Nullable Languages languages) {
        boolean z6 = false;
        if (languages != null) {
            List listH = languages.h();
            z6 = false;
            if (listH != null) {
                z6 = false;
                if (!listH.isEmpty()) {
                    List list = listH;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z6 = true;
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            z6 = false;
                            if (((LanguageItem) it.next()).h() != 2) {
                                break;
                            }
                        }
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    public static final boolean b(@Nullable Languages languages) {
        String strB = languages != null ? languages.b() : null;
        if (strB == null || strB.length() == 0) {
            return false;
        }
        if (a(languages)) {
            return !new tv.danmaku.bili.widget.preference.a(0).a.getBoolean("KEY_HAS_PLAYER_AI_AUDIO_GUIDE_BUBBLE_SHOWN", false);
        }
        if (c(languages)) {
            return !new tv.danmaku.bili.widget.preference.a(0).a.getBoolean("KEY_HAS_PLAYER_UPLOADER_AUDIO_GUIDE_BUBBLE_SHOWN", false);
        }
        return false;
    }

    public static final boolean c(@Nullable Languages languages) {
        boolean z6 = false;
        if (languages != null) {
            List listH = languages.h();
            z6 = false;
            if (listH != null) {
                List list = listH;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z6 = false;
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        z6 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((LanguageItem) it.next()).h() == 1) {
                            z6 = true;
                            break;
                        }
                    }
                }
            }
        }
        return z6;
    }

    public static final void d(@Nullable Languages languages) {
        if (a(languages)) {
            new tv.danmaku.bili.widget.preference.a(0).l("KEY_HAS_PLAYER_AI_AUDIO_GUIDE_BUBBLE_SHOWN", true);
        } else if (c(languages)) {
            new tv.danmaku.bili.widget.preference.a(0).l("KEY_HAS_PLAYER_UPLOADER_AUDIO_GUIDE_BUBBLE_SHOWN", true);
        }
    }

    @NotNull
    public static final f e(@NotNull Badge badge) {
        return new f(badge.c(), 0, badge.i(), badge.j(), badge.m(), badge.a(), badge.b(), badge.d(), badge.h(), "");
    }
}
