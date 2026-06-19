package com.bilibili.playerbizcommonv2.utils;

import By0.C1466j0;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.annotation.WorkerThread;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.commons.time.FastDateFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/m.class */
@StabilityInferred(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FastDateFormat f81941a = FastDateFormat.getInstance("yyyy-MM-dd-HH-mm-ss", Locale.US);

    @JvmStatic
    @WorkerThread
    @Nullable
    public static final void a(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull File file, long j7) {
        String strSubstring;
        long j8 = j7 / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", "snapshot_" + f81941a.format(new Date(j7)) + ".jpeg");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            contentValues.put("datetaken", Long.valueOf(j7));
        }
        contentValues.put("date_added", Long.valueOf(j8));
        contentValues.put("date_modified", Long.valueOf(j8));
        contentValues.put("mime_type", "image/jpeg");
        String strRemovePrefix = StringsKt.removePrefix(file.getCanonicalPath(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getCanonicalPath());
        C1466j0 c1466j0 = new C1466j0(bitmap, 1);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String str = File.separator;
        String strRemovePrefix2 = StringsKt.removePrefix(strRemovePrefix, str);
        if (i7 < 29) {
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), strRemovePrefix2);
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                c1466j0.invoke(fileOutputStream);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                contentValues.put("_data", file2.getPath());
                contentResolver.insert(uri, contentValues);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        }
        int iC = StringsKt.C(strRemovePrefix2, File.separatorChar);
        if (iC < 0) {
            strSubstring = "";
        } else {
            strSubstring = strRemovePrefix2.substring(0, iC);
            strRemovePrefix2 = strRemovePrefix2.substring(iC + 1, strRemovePrefix2.length());
        }
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + str + strSubstring);
        contentValues.put("_display_name", strRemovePrefix2);
        contentValues.put("is_pending", Boolean.TRUE);
        Uri uriInsert = contentResolver.insert(uri, contentValues);
        if (uriInsert == null) {
            return;
        }
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            try {
                c1466j0.invoke(outputStreamOpenOutputStream);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStreamOpenOutputStream, (Throwable) null);
                contentValues.put("is_pending", Boolean.FALSE);
                contentResolver.update(uriInsert, contentValues, null, null);
            } finally {
            }
        } catch (Throwable th3) {
            contentResolver.delete(uriInsert, null, null);
            throw th3;
        }
    }
}
