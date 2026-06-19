package com.bilibili.lib.upload;

import LA.f;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadLibLoader.class */
public class UploadLibLoader {
    private static final String TAG = "BILI-UPLOAD";
    private static UploadLibLoader mLibLoader;
    private File mPath;
    private Boolean mHasLoaded = Boolean.FALSE;
    private final String UPLOAD_LIB_NAME = "bili-upload";
    private final String BVC_LIB_NAME = "bvc-xcode-tools";

    private UploadLibLoader(File file) {
        this.mPath = null;
        Log.i(TAG, "UploadLibLoader struct");
        this.mPath = file;
    }

    public static UploadLibLoader getInstance() {
        UploadLibLoader uploadLibLoader;
        synchronized (UploadLibLoader.class) {
            try {
                synchronized (UploadLibLoader.class) {
                    if (mLibLoader == null) {
                        mLibLoader = new UploadLibLoader(null);
                    }
                    uploadLibLoader = mLibLoader;
                }
                return uploadLibLoader;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        return uploadLibLoader;
    }

    public static UploadLibLoader getInstance(File file) {
        UploadLibLoader uploadLibLoader;
        synchronized (UploadLibLoader.class) {
            try {
                synchronized (UploadLibLoader.class) {
                    if (mLibLoader == null) {
                        mLibLoader = new UploadLibLoader(file);
                    }
                    uploadLibLoader = mLibLoader;
                }
                return uploadLibLoader;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        return uploadLibLoader;
    }

    private void loadLibraries() {
        Log.i(TAG, "UploadLibLoader load libs");
        if (this.mPath == null) {
            System.loadLibrary("bvc-xcode-tools");
            System.loadLibrary("bili-upload");
            return;
        }
        String strC = f.c(this.mPath, new StringBuilder(), "/libbili-upload.so");
        Log.i(TAG, "UploadLibLoader load tribe lib:" + strC);
        System.load(strC);
    }

    public void loadLibrariesOnce() {
        synchronized (this) {
            synchronized (UploadLibLoader.class) {
                try {
                    if (!this.mHasLoaded.booleanValue()) {
                        loadLibraries();
                        this.mHasLoaded = Boolean.TRUE;
                    }
                } finally {
                }
            }
        }
    }
}
