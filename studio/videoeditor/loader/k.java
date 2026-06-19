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
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.C6598f;
import com.bilibili.studio.videoeditor.loader.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Callable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/k.class */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f109801a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoaderManager f109803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.loader.app.LoaderManager f109804d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f109806f;
    public final int h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f109802b = {"_display_name", "_data", "_size", "width", "height", "mime_type", "date_added", EditCustomizeSticker.TAG_DURATION, "_id"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<ImageFolder> f109805e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f109807g = 1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/k$a.class */
    public final class a implements LoaderManager.LoaderCallbacks<Cursor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f109808a;

        public a(k kVar) {
            this.f109808a = kVar;
        }

        @Override // android.app.LoaderManager.LoaderCallbacks
        public final Loader<Cursor> onCreateLoader(int i7, Bundle bundle) {
            CursorLoader cursorLoader;
            if (i7 == 1) {
                k kVar = this.f109808a;
                cursorLoader = new CursorLoader(kVar.f109801a, k.a(kVar), this.f109808a.f109802b, null, null, "date_modified DESC");
            } else {
                k kVar2 = this.f109808a;
                cursorLoader = new CursorLoader(kVar2.f109801a, k.a(kVar2), this.f109808a.f109802b, this.f109808a.f109802b[1] + " like '%" + bundle.getString("path") + "%'", null, C8770a.a(new StringBuilder(), this.f109808a.f109802b[6], " DESC"));
            }
            return cursorLoader;
        }

        @Override // android.app.LoaderManager.LoaderCallbacks
        public final void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
            final Cursor cursor2 = cursor;
            Task.callInBackground(new Callable(this, cursor2) { // from class: com.bilibili.studio.videoeditor.loader.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k.a f109799a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Cursor f109800b;

                {
                    this.f109799a = this;
                    this.f109800b = cursor2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Cursor cursor3 = this.f109800b;
                    k kVar = this.f109799a.f109808a;
                    if (kVar.f109801a == null) {
                        return null;
                    }
                    k.b(kVar, cursor3);
                    return null;
                }
            });
        }

        @Override // android.app.LoaderManager.LoaderCallbacks
        public final void onLoaderReset(Loader<Cursor> loader) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/k$b.class */
    public final class b implements LoaderManager.LoaderCallbacks<Cursor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f109809a;

        public b(k kVar) {
            this.f109809a = kVar;
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        @NonNull
        public final androidx.loader.content.Loader<Cursor> onCreateLoader(int i7, Bundle bundle) {
            androidx.loader.content.CursorLoader cursorLoader;
            k kVar = this.f109809a;
            if (i7 == 1) {
                cursorLoader = new androidx.loader.content.CursorLoader(kVar.f109801a, k.a(kVar), kVar.f109802b, null, null, "date_modified DESC");
            } else {
                cursorLoader = new androidx.loader.content.CursorLoader(kVar.f109801a, k.a(kVar), kVar.f109802b, kVar.f109802b[1] + " like '%" + bundle.getString("path") + "%'", null, C8770a.a(new StringBuilder(), kVar.f109802b[6], " DESC"));
            }
            return cursorLoader;
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public final void onLoadFinished(@NonNull androidx.loader.content.Loader<Cursor> loader, Cursor cursor) {
            final Cursor cursor2 = cursor;
            Task.callInBackground(new Callable(this, cursor2) { // from class: com.bilibili.studio.videoeditor.loader.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k.b f109810a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Cursor f109811b;

                {
                    this.f109810a = this;
                    this.f109811b = cursor2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Cursor cursor3 = this.f109811b;
                    k kVar = this.f109810a.f109809a;
                    if (kVar.f109801a == null) {
                        return null;
                    }
                    k.b(kVar, cursor3);
                    return null;
                }
            });
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public final void onLoaderReset(@NonNull androidx.loader.content.Loader<Cursor> loader) {
        }
    }

    public k(@NonNull Object obj, int i7, g gVar) {
        this.h = i7;
        Activity activity = (Activity) (Activity.class.isInstance(obj) ? Activity.class.cast(obj) : null);
        Fragment fragment = (Fragment) (Fragment.class.isInstance(obj) ? Fragment.class.cast(obj) : null);
        if (activity != null) {
            this.f109801a = activity;
            android.app.LoaderManager loaderManager = activity.getLoaderManager();
            this.f109803c = loaderManager;
            loaderManager.initLoader(this.f109807g, null, new a(this));
        } else {
            if (fragment == null) {
                throw new RuntimeException("illegal context~");
            }
            this.f109801a = fragment.getContext();
            androidx.loader.app.LoaderManager loaderManager2 = fragment.getLoaderManager();
            this.f109804d = loaderManager2;
            loaderManager2.initLoader(this.f109807g, null, new b(this));
        }
        this.f109806f = gVar;
    }

    public static Uri a(k kVar) {
        kVar.getClass();
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        int i7 = kVar.h;
        Uri uriBuild = uri;
        if (i7 != -1) {
            uriBuild = uri.buildUpon().appendQueryParameter("limit", i7 + "").build();
        }
        return uriBuild;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Comparator] */
    public static void b(final k kVar, Cursor cursor) {
        int i7;
        kVar.f109805e.clear();
        ArrayList<ImageItem> arrayList = new ArrayList<>();
        if (cursor != null) {
            int count = cursor.getCount();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (cursor.moveToFirst()) {
                int i8 = 0;
                while (true) {
                    int i9 = i8;
                    int i10 = 0;
                    if (kVar.f109801a == null) {
                        return;
                    }
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
                    String[] strArr = kVar.f109802b;
                    String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[0]));
                    String string3 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                    File file = new File(string3);
                    if (!file.exists() || file.length() == 0) {
                        i7 = i9 + 1;
                    } else {
                        long j7 = cursor.getLong(cursor.getColumnIndexOrThrow(strArr[2]));
                        int i11 = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[3]));
                        int i12 = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                        long j8 = cursor.getLong(cursor.getColumnIndexOrThrow(strArr[6]));
                        long j9 = cursor.getLong(cursor.getColumnIndexOrThrow(strArr[7]));
                        if (TextUtils.isEmpty(string3)) {
                            i7 = i9;
                        } else {
                            String lowerCase = string3.toLowerCase(Locale.getDefault());
                            String[] strArr2 = f.f109797c;
                            while (true) {
                                if (i10 >= 22) {
                                    int i13 = count;
                                    long j10 = jCurrentTimeMillis;
                                    String[] strArrSplit = lowerCase.split("\\.");
                                    i7 = i9;
                                    count = i13;
                                    jCurrentTimeMillis = j10;
                                    if (strArrSplit.length > 0) {
                                        Xz0.d.a("视频格式不支持(" + strArrSplit[strArrSplit.length - 1] + ")", "1");
                                        i7 = i9;
                                        count = i13;
                                        jCurrentTimeMillis = j10;
                                    }
                                } else if (lowerCase.endsWith(strArr2[i10])) {
                                    ImageItem imageItem = new ImageItem(string, string2, string3, j7, i11, i12, string4, j8);
                                    imageItem.setDuration(j9);
                                    imageItem.uri = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, Long.parseLong(string)).toString();
                                    arrayList.add(imageItem);
                                    File parentFile = new File(string3).getParentFile();
                                    ImageFolder imageFolder = new ImageFolder();
                                    imageFolder.name = parentFile.getName();
                                    imageFolder.path = parentFile.getAbsolutePath();
                                    if (kVar.f109805e.contains(imageFolder)) {
                                        ArrayList<ImageFolder> arrayList2 = kVar.f109805e;
                                        arrayList2.get(arrayList2.indexOf(imageFolder)).images.add(imageItem);
                                        i7 = i9;
                                    } else {
                                        ArrayList<ImageItem> arrayList3 = new ArrayList<>();
                                        arrayList3.add(imageItem);
                                        imageFolder.cover = imageItem;
                                        imageFolder.images = arrayList3;
                                        kVar.f109805e.add(imageFolder);
                                        i7 = i9;
                                    }
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    if (!cursor.moveToNext()) {
                        break;
                    } else {
                        i8 = i7;
                    }
                }
            } else {
                i7 = 0;
            }
            C6598f.b(1, System.currentTimeMillis() - jCurrentTimeMillis, cursor.getCount(), i7);
            Collections.sort(kVar.f109805e, new Object());
            if (cursor.getCount() > 0 && arrayList.size() > 0) {
                ImageFolder imageFolder2 = new ImageFolder();
                imageFolder2.name = kVar.f109801a.getString(2131842236);
                imageFolder2.isAllDic = true;
                imageFolder2.path = File.separator;
                imageFolder2.cover = arrayList.get(0);
                imageFolder2.images = arrayList;
                imageFolder2.allVideoCount = count;
                kVar.f109805e.add(0, imageFolder2);
            }
        }
        if (kVar.f109806f != null) {
            Task.call(new Callable(kVar) { // from class: com.bilibili.studio.videoeditor.loader.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k f109798a;

                {
                    this.f109798a = kVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    k kVar2 = this.f109798a;
                    if (kVar2.f109801a == null) {
                        return null;
                    }
                    kVar2.f109806f.a(kVar2.f109805e);
                    kVar2.f109801a = null;
                    android.app.LoaderManager loaderManager = kVar2.f109803c;
                    int i14 = kVar2.f109807g;
                    if (loaderManager != null) {
                        loaderManager.destroyLoader(i14);
                    }
                    androidx.loader.app.LoaderManager loaderManager2 = kVar2.f109804d;
                    if (loaderManager2 == null) {
                        return null;
                    }
                    loaderManager2.destroyLoader(i14);
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
        }
    }
}
