package com.bilibili.studio.videoeditor.loader;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.loader.app.LoaderManager;
import bolts.Task;
import com.bilibili.studio.videoeditor.C6598f;
import com.bilibili.studio.videoeditor.loader.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/d.class */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f109784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f109785c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LoaderManager f109787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.loader.app.LoaderManager f109788f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f109790i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f109783a = {"_display_name", "_data", "_size", "width", "height", "mime_type", "date_added", "_id"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<ImageFolder> f109786d = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f109789g = f.a();
    public final int h = 11;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/d$a.class */
    public final class a implements LoaderManager.LoaderCallbacks<Cursor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f109791a;

        public a(d dVar) {
            this.f109791a = dVar;
        }

        @Override // android.app.LoaderManager.LoaderCallbacks
        public final Loader<Cursor> onCreateLoader(int i7, Bundle bundle) {
            CursorLoader cursorLoader;
            if (i7 == 11) {
                d dVar = this.f109791a;
                cursorLoader = new CursorLoader(dVar.f109784b, d.a(dVar), this.f109791a.f109783a, null, null, "date_modified DESC");
            } else {
                d dVar2 = this.f109791a;
                cursorLoader = new CursorLoader(dVar2.f109784b, d.a(dVar2), this.f109791a.f109783a, this.f109791a.f109783a[1] + " like '%" + bundle.getString("path") + "%'", null, C8770a.a(new StringBuilder(), this.f109791a.f109783a[6], " DESC"));
            }
            return cursorLoader;
        }

        @Override // android.app.LoaderManager.LoaderCallbacks
        public final void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
            final Cursor cursor2 = cursor;
            Task.callInBackground(new Callable(this, cursor2) { // from class: com.bilibili.studio.videoeditor.loader.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d.a f109781a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Cursor f109782b;

                {
                    this.f109781a = this;
                    this.f109782b = cursor2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Cursor cursor3 = this.f109782b;
                    d dVar = this.f109781a.f109791a;
                    if (dVar.f109784b == null) {
                        return null;
                    }
                    d.b(dVar, cursor3);
                    return null;
                }
            });
        }

        @Override // android.app.LoaderManager.LoaderCallbacks
        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/d$b.class */
    public final class b implements LoaderManager.LoaderCallbacks<Cursor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f109792a;

        public b(d dVar) {
            this.f109792a = dVar;
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        @NonNull
        public final androidx.loader.content.Loader<Cursor> onCreateLoader(int i7, Bundle bundle) {
            androidx.loader.content.CursorLoader cursorLoader;
            d dVar = this.f109792a;
            if (i7 == 11) {
                cursorLoader = new androidx.loader.content.CursorLoader(dVar.f109784b, d.a(dVar), dVar.f109783a, null, null, "date_modified DESC");
            } else {
                cursorLoader = new androidx.loader.content.CursorLoader(dVar.f109784b, d.a(dVar), dVar.f109783a, dVar.f109783a[1] + " like '%" + bundle.getString("path") + "%'", null, C8770a.a(new StringBuilder(), dVar.f109783a[6], " DESC"));
            }
            return cursorLoader;
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public final void onLoadFinished(@NonNull androidx.loader.content.Loader<Cursor> loader, Cursor cursor) {
            final Cursor cursor2 = cursor;
            Task.callInBackground(new Callable(this, cursor2) { // from class: com.bilibili.studio.videoeditor.loader.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d.b f109793a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Cursor f109794b;

                {
                    this.f109793a = this;
                    this.f109794b = cursor2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Cursor cursor3 = this.f109794b;
                    d dVar = this.f109793a.f109792a;
                    if (dVar.f109784b == null) {
                        return null;
                    }
                    d.b(dVar, cursor3);
                    return null;
                }
            });
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public final void onLoaderReset(@NonNull androidx.loader.content.Loader<Cursor> loader) {
        }
    }

    public d(@NonNull Object obj, int i7, g gVar) {
        this.f109790i = i7;
        Activity activity = (Activity) (Activity.class.isInstance(obj) ? Activity.class.cast(obj) : null);
        Fragment fragment = (Fragment) (Fragment.class.isInstance(obj) ? Fragment.class.cast(obj) : null);
        if (activity != null) {
            this.f109784b = activity;
            android.app.LoaderManager loaderManager = activity.getLoaderManager();
            this.f109787e = loaderManager;
            loaderManager.initLoader(this.h, null, new a(this));
        } else {
            if (fragment == null) {
                throw new RuntimeException("illegal context~");
            }
            this.f109784b = fragment.getContext();
            androidx.loader.app.LoaderManager loaderManager2 = fragment.getLoaderManager();
            this.f109788f = loaderManager2;
            loaderManager2.initLoader(this.h, null, new b(this));
        }
        this.f109785c = gVar;
    }

    public static Uri a(d dVar) {
        dVar.getClass();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        int i7 = dVar.f109790i;
        Uri uriBuild = uri;
        if (i7 != -1) {
            uriBuild = uri.buildUpon().appendQueryParameter("limit", i7 + "").build();
        }
        return uriBuild;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Comparator] */
    public static void b(final d dVar, Cursor cursor) {
        dVar.f109786d.clear();
        ArrayList<ImageItem> arrayList = new ArrayList<>();
        if (cursor != null) {
            int count = cursor.getCount();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (cursor.moveToFirst()) {
                while (dVar.f109784b != null) {
                    String[] strArr = dVar.f109783a;
                    String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                    if (!TextUtils.isEmpty(string)) {
                        String lowerCase = string.toLowerCase(Locale.getDefault());
                        Iterator it = ((ArrayList) dVar.f109789g).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                String[] strArrSplit = string.split("\\.");
                                if (strArrSplit.length > 0) {
                                    Xz0.d.a("图片格式不支持(" + strArrSplit[strArrSplit.length - 1] + ")", "1");
                                }
                            } else if (lowerCase.endsWith((String) it.next())) {
                                String string2 = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
                                ImageItem imageItem = new ImageItem(string2);
                                imageItem.name = cursor.getString(cursor.getColumnIndexOrThrow(strArr[0]));
                                imageItem.path = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                                imageItem.size = cursor.getLong(cursor.getColumnIndexOrThrow(strArr[2]));
                                imageItem.width = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[3]));
                                imageItem.height = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                                imageItem.mimeType = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                                imageItem.addTime = cursor.getLong(cursor.getColumnIndexOrThrow(strArr[6]));
                                imageItem.uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(string2)).toString();
                                arrayList.add(imageItem);
                                File parentFile = new File(string).getParentFile();
                                ImageFolder imageFolder = new ImageFolder();
                                imageFolder.name = parentFile.getName();
                                imageFolder.path = parentFile.getAbsolutePath();
                                if (dVar.f109786d.contains(imageFolder)) {
                                    ArrayList<ImageFolder> arrayList2 = dVar.f109786d;
                                    arrayList2.get(arrayList2.indexOf(imageFolder)).images.add(imageItem);
                                } else {
                                    ArrayList<ImageItem> arrayList3 = new ArrayList<>();
                                    arrayList3.add(imageItem);
                                    imageFolder.cover = imageItem;
                                    imageFolder.images = arrayList3;
                                    dVar.f109786d.add(imageFolder);
                                }
                            }
                        }
                    }
                    if (!cursor.moveToNext()) {
                    }
                }
                return;
            }
            C6598f.b(2, System.currentTimeMillis() - jCurrentTimeMillis, cursor.getCount(), 0L);
            Collections.sort(dVar.f109786d, new Object());
            if (cursor.getCount() > 0 && arrayList.size() > 0) {
                ImageFolder imageFolder2 = new ImageFolder();
                imageFolder2.name = dVar.f109784b.getString(2131842443);
                imageFolder2.isAllDic = true;
                imageFolder2.path = "/";
                imageFolder2.cover = arrayList.get(0);
                imageFolder2.images = arrayList;
                imageFolder2.allImageCount = count;
                dVar.f109786d.add(0, imageFolder2);
            }
        }
        if (dVar.f109785c != null) {
            Task.call(new Callable(dVar) { // from class: com.bilibili.studio.videoeditor.loader.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f109780a;

                {
                    this.f109780a = dVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    d dVar2 = this.f109780a;
                    if (dVar2.f109784b == null) {
                        return null;
                    }
                    dVar2.f109785c.a(dVar2.f109786d);
                    dVar2.f109784b = null;
                    android.app.LoaderManager loaderManager = dVar2.f109787e;
                    int i7 = dVar2.h;
                    if (loaderManager != null) {
                        loaderManager.destroyLoader(i7);
                    }
                    androidx.loader.app.LoaderManager loaderManager2 = dVar2.f109788f;
                    if (loaderManager2 == null) {
                        return null;
                    }
                    loaderManager2.destroyLoader(i7);
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
        }
    }
}
