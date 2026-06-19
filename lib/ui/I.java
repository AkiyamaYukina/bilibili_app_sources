package com.bilibili.lib.ui;

import android.os.Environment;
import bolts.Continuation;
import bolts.Task;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/I.class */
public final class I implements Continuation<Void, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64758b;

    public I(String str, String str2) {
        this.f64757a = str;
        this.f64758b = str2;
    }

    @Override // bolts.Continuation
    public final File then(Task<Void> task) throws Exception {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            throw new FileNotFoundException("External storage isn't mounted");
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(this.f64757a);
        String str = this.f64758b;
        if (str != null) {
            externalStoragePublicDirectory = new File(externalStoragePublicDirectory, str);
        }
        return externalStoragePublicDirectory;
    }
}
