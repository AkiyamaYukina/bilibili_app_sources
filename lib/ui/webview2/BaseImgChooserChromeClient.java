package com.bilibili.lib.ui.webview2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bilibili.droid.ToastHelper;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/BaseImgChooserChromeClient.class */
public abstract class BaseImgChooserChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueCallback f64954a = null;

    private Uri getImageFileUri(Uri uri) {
        Cursor cursorQuery = getContext().getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
            cursorQuery.close();
            if (string == null) {
                return null;
            }
            if (!string.endsWith(".png") && !string.endsWith(".PNG") && !string.endsWith(".jpg") && !string.endsWith(".JPG") && !string.endsWith(".gif") && !string.endsWith(".GIF") && !string.endsWith(".jpeg") && !string.endsWith(".JPEG")) {
                return null;
            }
            File file = new File(string);
            if (file.exists()) {
                return Uri.fromFile(file);
            }
            return null;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    private boolean intentToFileChooser(Intent intent) {
        try {
            onShowFileChooser(intent);
            return true;
        } catch (Exception e7) {
            ToastHelper.showToastShort(getContext().getApplicationContext(), 2131826194);
            return true;
        }
    }

    private void resetFileCallback() {
        ValueCallback valueCallback = this.f64954a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
            this.f64954a = null;
        }
    }

    @NonNull
    public abstract Context getContext();

    public void onReceiveFile(int i7, Intent intent) {
        if (this.f64954a == null) {
            return;
        }
        if (i7 != -1 || intent == null || intent.getData() == null) {
            this.f64954a.onReceiveValue(null);
        } else {
            this.f64954a.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i7, intent));
        }
        this.f64954a = null;
    }

    public abstract boolean onShowFileChooser(Intent intent);

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        resetFileCallback();
        this.f64954a = valueCallback;
        return intentToFileChooser(fileChooserParams.createIntent());
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        resetFileCallback();
        this.f64954a = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        intentToFileChooser(Intent.createChooser(intent, "选择文件"));
    }

    public void openFileChooser(ValueCallback valueCallback, String str) {
        resetFileCallback();
        if (str == null || !str.contains("image")) {
            valueCallback.onReceiveValue(null);
            return;
        }
        this.f64954a = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        intentToFileChooser(Intent.createChooser(intent, "选择文件"));
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        resetFileCallback();
        if (str == null || !str.contains("image")) {
            valueCallback.onReceiveValue(null);
            return;
        }
        this.f64954a = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        intentToFileChooser(Intent.createChooser(intent, "选择文件"));
    }
}
