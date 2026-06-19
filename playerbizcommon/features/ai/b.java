package com.bilibili.playerbizcommon.features.ai;

import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kntr.base.localization.Localization;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/b.class */
public final class b {
    @NotNull
    public static final Map<String, String> a() {
        PlayerMultiLangStore.f79562a.getClass();
        String str = PlayerMultiLangStore.h;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return MapsKt.mapOf(TuplesKt.to("cur_language", str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Nullable
    public static final LanguageItem b(@NotNull Languages languages) {
        LanguageItem languageItem;
        LanguageItem languageItem2;
        Object next;
        Object next2;
        boolean z6;
        Object obj;
        PlayerMultiLangStore.f79562a.getClass();
        String str = PlayerMultiLangStore.h;
        String language = str;
        if (str == null) {
            language = Localization.INSTANCE.getCurrent().getLanguage();
        }
        List listH = languages.h();
        if (listH != null) {
            List list = listH;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((LanguageItem) obj2).c(), language)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    if (((LanguageItem) next2).h() == 1) {
                        z6 = false;
                        obj = next2;
                    } else {
                        z6 = true;
                        obj = next2;
                    }
                    do {
                        Object next3 = it.next();
                        boolean z7 = ((LanguageItem) next3).h() != 1;
                        next2 = obj;
                        boolean z8 = z6;
                        if (z6 > z7) {
                            next2 = next3;
                            z8 = z7;
                        }
                        obj = next2;
                        z6 = z8;
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            languageItem = (LanguageItem) next2;
        } else {
            languageItem = null;
        }
        if (languageItem == null) {
            List listH2 = languages.h();
            languageItem2 = null;
            if (listH2 != null) {
                Iterator it2 = listH2.iterator();
                while (true) {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                    String strC = ((LanguageItem) next).c();
                    if (strC != null && strC.length() != 0) {
                        break;
                    }
                }
                languageItem2 = (LanguageItem) next;
            }
        } else {
            languageItem2 = languageItem;
        }
        return languageItem2;
    }
}
