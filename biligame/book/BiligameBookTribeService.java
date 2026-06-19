package com.bilibili.biligame.book;

import android.content.Context;
import com.bilibili.biligame.api.BiligameHotGame;
import com.bilibili.biligame.ui.book.BookCallback;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/book/BiligameBookTribeService.class */
public interface BiligameBookTribeService {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void cancelBookVersion$default(BiligameBookTribeService biligameBookTribeService, Context context, BiligameHotGame biligameHotGame, boolean z6, HashMap map, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelBookVersion");
        }
        if ((i7 & 8) != 0) {
            map = null;
        }
        biligameBookTribeService.cancelBookVersion(context, biligameHotGame, z6, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void getBookCaptchaDialog$default(BiligameBookTribeService biligameBookTribeService, Context context, int i7, BookCallback bookCallback, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, BiligameHotGame biligameHotGame, Function0 function0, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBookCaptchaDialog");
        }
        if ((i8 & 8) != 0) {
            z6 = false;
        }
        if ((i8 & 16) != 0) {
            str = "";
        }
        if ((i8 & 32) != 0) {
            z7 = true;
        }
        if ((i8 & 64) != 0) {
            z8 = true;
        }
        if ((i8 & 128) != 0) {
            str2 = null;
        }
        if ((i8 & 256) != 0) {
            z9 = true;
        }
        if ((i8 & 512) != 0) {
            biligameHotGame = null;
        }
        if ((i8 & 1024) != 0) {
            function0 = null;
        }
        biligameBookTribeService.getBookCaptchaDialog(context, i7, bookCallback, z6, str, z7, z8, str2, z9, biligameHotGame, function0);
    }

    void cancelBookVersion(@NotNull Context context, @NotNull BiligameHotGame biligameHotGame, boolean z6, @Nullable HashMap<String, String> map);

    void getBookCaptchaDialog(@NotNull Context context, int i7, @Nullable BookCallback bookCallback, boolean z6, @Nullable String str, boolean z7, boolean z8, @Nullable String str2, boolean z9, @Nullable BiligameHotGame biligameHotGame, @Nullable Function0<Unit> function0);

    void showBook();
}
