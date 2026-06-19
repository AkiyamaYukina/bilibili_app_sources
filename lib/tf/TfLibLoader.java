package com.bilibili.lib.tf;

import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfLibLoader.class */
public class TfLibLoader {
    private static TfLibLoader mLibLoader;
    private final String BILI_TF_LIB_NAME;
    private boolean mHasLoaded;
    private File mPath;

    private TfLibLoader() {
        this.mHasLoaded = false;
        this.BILI_TF_LIB_NAME = "tf";
        this.mPath = null;
    }

    private TfLibLoader(File file) {
        this.mHasLoaded = false;
        this.BILI_TF_LIB_NAME = "tf";
        this.mPath = file;
    }

    public static TfLibLoader getInstance() {
        TfLibLoader tfLibLoader;
        synchronized (TfLibLoader.class) {
            try {
                synchronized (TfLibLoader.class) {
                    if (mLibLoader == null) {
                        mLibLoader = new TfLibLoader();
                    }
                    tfLibLoader = mLibLoader;
                }
                return tfLibLoader;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        return tfLibLoader;
    }

    public static TfLibLoader getInstance(File file) {
        TfLibLoader tfLibLoader;
        synchronized (TfLibLoader.class) {
            try {
                synchronized (TfLibLoader.class) {
                    if (mLibLoader == null) {
                        mLibLoader = new TfLibLoader(file);
                    }
                    tfLibLoader = mLibLoader;
                }
                return tfLibLoader;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        return tfLibLoader;
    }

    private void loadLibraries() {
        if (this.mPath == null) {
            System.loadLibrary("tf");
            return;
        }
        System.load(this.mPath.getAbsolutePath() + "/libtf.so");
    }

    public void loadLibrariesOnce() {
        synchronized (this) {
            synchronized (TfLibLoader.class) {
                try {
                    if (!this.mHasLoaded) {
                        loadLibraries();
                        this.mHasLoaded = true;
                    }
                } finally {
                }
            }
        }
    }
}
