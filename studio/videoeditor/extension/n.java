package com.bilibili.studio.videoeditor.extension;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import com.bilibili.lib.foundation.FoundationAlias;
import java.io.FileNotFoundException;
import kotlin.io.CloseableKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/n.class */
public final class n {
    public static final boolean a(@Nullable Uri uri, @Nullable String str) throws FileNotFoundException {
        if (str != null && str.length() != 0 && Build.VERSION.SDK_INT < 29) {
            return cn.com.chinatelecom.account.api.d.m.b(str);
        }
        boolean z6 = false;
        if (uri != null) {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = FoundationAlias.getFapp().getContentResolver().openFileDescriptor(uri, "r");
            z6 = false;
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, (Throwable) null);
                    z6 = true;
                } catch (Throwable th) {
                    z6 = false;
                }
            }
        }
        return z6;
    }

    public static final long b(@Nullable Context context, @Nullable String str) {
        Cursor cursorQuery;
        if (str == null || str.length() == 0 || context == null) {
            return 0L;
        }
        String[] strArr = {"_id"};
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Build.VERSION.SDK_INT >= 29 ? MediaStore.Files.getContentUri("external") : MediaStore.Files.getContentUri("external"), strArr, "_data = ?", new String[]{str}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    cursor2 = cursorQuery;
                    cursor = cursorQuery;
                    long j7 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(strArr[0]));
                    cursorQuery.close();
                    return j7;
                }
                if (cursorQuery == null) {
                    return 0L;
                }
            } catch (Exception e7) {
                cursor2 = cursor;
                e7.printStackTrace();
                if (cursor == null) {
                    return 0L;
                }
                cursorQuery = cursor;
            }
            cursorQuery.close();
            return 0L;
        } catch (Throwable th) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
