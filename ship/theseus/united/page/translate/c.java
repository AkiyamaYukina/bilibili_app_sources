package com.bilibili.ship.theseus.united.page.translate;

import com.bapis.bilibili.app.translation.v1.TranslationSimpleReply;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tb0.h;
import tb0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f103471a = j.c();

    @Nullable
    public static final String a(@NotNull TranslationSimpleReply translationSimpleReply) {
        Object next;
        Iterator it = translationSimpleReply.getResultsOrBuilderList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((com.bapis.bilibili.app.translation.v1.b) next).getField(), "title")) {
                break;
            }
        }
        com.bapis.bilibili.app.translation.v1.b bVar = (com.bapis.bilibili.app.translation.v1.b) next;
        String translatedText = null;
        if (bVar != null) {
            translatedText = bVar.getTranslatedText();
        }
        return translatedText;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r5, long r6, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull com.bapis.bilibili.app.translation.v1.TranslationBusiness r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.translate.c.b(java.lang.String, long, java.lang.String, com.bapis.bilibili.app.translation.v1.TranslationBusiness, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
