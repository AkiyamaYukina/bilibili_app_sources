package com.bilibili.socialize.share.util;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/util/IOUtil.class */
public class IOUtil {
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e7) {
            }
        }
    }

    public static void closeQuietly(@Nullable InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    public static void closeQuietly(@Nullable OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copyLarge(inputStream, outputStream, new byte[4096]);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j7 = 0;
        while (true) {
            long j8 = j7;
            int i7 = inputStream.read(bArr);
            if (-1 == i7) {
                return j8;
            }
            outputStream.write(bArr, 0, i7);
            j7 = j8 + ((long) i7);
        }
    }
}
