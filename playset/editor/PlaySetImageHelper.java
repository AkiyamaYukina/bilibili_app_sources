package com.bilibili.playset.editor;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.commons.io.IOUtils;
import com.bilibili.mediautils.FileUtils;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetImageHelper.class */
public final class PlaySetImageHelper {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetImageHelper$PhotoSource.class */
    public enum PhotoSource {
        TAKE,
        CHOOSE
    }

    public static boolean a(String str) {
        boolean z6 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strTrim = str.toLowerCase(Locale.getDefault()).trim();
        if (strTrim.endsWith(".jpg") || strTrim.endsWith(".jpeg") || strTrim.endsWith(".png") || strTrim.endsWith(".heif") || strTrim.endsWith(".heic")) {
            z6 = true;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.net.Uri r7, androidx.fragment.app.FragmentActivity r8) {
        /*
            r0 = r8
            android.content.ContentResolver r0 = r0.getContentResolver()
            r1 = r7
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "_data"
            r3[r4] = r5
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)
            r8 = r0
            r0 = 0
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L55
            r0 = r8
            boolean r0 = r0.moveToFirst()
            if (r0 == 0) goto L31
            r0 = r8
            r1 = 0
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            goto L33
        L31:
            r0 = 0
            r7 = r0
        L33:
            r0 = r8
            r0.close()
            r0 = r10
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L55
            r0 = r7
            java.lang.String r1 = ".gif"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L53
            r0 = r10
            r9 = r0
            r0 = r7
            java.lang.String r1 = ".GIF"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L55
        L53:
            r0 = 1
            r9 = r0
        L55:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.PlaySetImageHelper.b(android.net.Uri, androidx.fragment.app.FragmentActivity):boolean");
    }

    public static String c(Context context, @Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        if (string.startsWith(FileUtils.SCHEME_FILE)) {
            return string.replaceFirst(FileUtils.SCHEME_FILE, "");
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        String string2 = null;
        if (cursorQuery != null) {
            string2 = null;
            if (cursorQuery.moveToFirst()) {
                string2 = cursorQuery.getString(0);
            }
            cursorQuery.close();
        }
        return string2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|9|10|(8:11|12|(2:29|30)(1:45)|33|34|35|36|37)|17|18|41|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap d(android.content.Context r4, android.net.Uri r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.PlaySetImageHelper.d(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    public static Bitmap e(@Nullable Context context, @Nullable Uri uri) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        InputStream inputStreamOpenInputStream;
        Bitmap bitmapDecodeStream;
        if (uri == null || context == null) {
            return null;
        }
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
        } catch (FileNotFoundException e7) {
            e7.printStackTrace();
            parcelFileDescriptorOpenFileDescriptor = null;
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i7 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
        int i8 = options.outHeight;
        int i9 = options.outWidth;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        while (true) {
            if (500 >= i8 && 500 >= i9) {
                break;
            }
            i9 /= 2;
            i8 /= 2;
            i7 *= 2;
        }
        options2.inSampleSize = i7;
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
            } catch (FileNotFoundException e8) {
                bitmapDecodeStream = null;
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly(inputStreamOpenInputStream);
                throw th;
            }
        } catch (FileNotFoundException e9) {
            inputStreamOpenInputStream = null;
            bitmapDecodeStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenInputStream = null;
        }
        IOUtils.closeQuietly(inputStreamOpenInputStream);
        return bitmapDecodeStream;
    }
}
