package com.bilibili.storagechecker;

import G.p;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import com.bilibili.app.authorspace.local.service.j;
import com.bilibili.lib.gson.GsonKt;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.sistersplayer.httpserver.SimpleBaseClient;
import com.bilibili.studio.material.util.UtilsKt;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, List<a>> f105076a = new HashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/f$a.class */
    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("p")
        @Expose
        public String f105077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName(DynamicModel.KEY_ABBR_ADYNAMIC_SWI)
        @Expose
        public long f105078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient boolean f105079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient String f105080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName(DynamicModel.KEY_ABBR_DYNAMIC_CONFIG)
        @Expose
        public long f105081e;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return (int) (aVar.f105078b - this.f105078b);
        }

        public final String toString() {
            String strA;
            if (this.f105079c) {
                strA = "dir:[" + this.f105077a + "," + f.a(this.f105078b) + "]";
            } else {
                File file = new File(this.f105077a);
                StringBuilder sb = new StringBuilder("file:[");
                sb.append(file.getName());
                sb.append(",");
                sb.append(f.a(this.f105078b));
                sb.append(", lastModifyTime: ");
                strA = C8770a.a(sb, this.f105080d, "]");
            }
            return strA;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/f$b.class */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f105082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f105084c;

        public b(String str, int i7) {
            this.f105083b = str;
            this.f105082a = i7;
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull b bVar) {
            b bVar2 = bVar;
            int i7 = 0;
            int iCompareTo = (TextUtils.isEmpty(this.f105083b) || TextUtils.isEmpty(bVar2.f105083b)) ? 0 : this.f105083b.compareTo(bVar2.f105083b);
            if (iCompareTo >= 0) {
                i7 = iCompareTo;
            }
            return i7;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(10);
            int i7 = 0;
            while (true) {
                int i8 = this.f105082a;
                if (i7 >= i8) {
                    break;
                }
                if (i7 == i8 - 1) {
                    sb.append("\t+ ");
                } else {
                    sb.append("\t");
                }
                i7++;
            }
            String name = new File(this.f105083b).getName();
            if (this.f105082a == 0) {
                name = this.f105083b;
            }
            return ((Object) sb) + name + " [" + f.a(this.f105084c) + "]";
        }
    }

    public static String a(long j7) {
        if (j7 < 1024) {
            return j.a(j7, "B");
        }
        if (j7 < 1048576) {
            return b((j7 * 1.0f) / 1024.0f) + "K";
        }
        if (j7 < 1073741824) {
            return b((j7 * 1.0f) / 1048576.0f) + "M";
        }
        if (j7 < BLMobileHumanActionNative.BL_MOBILE_HAND_ILOVEYOU) {
            return b((j7 * 1.0f) / 1.0737418E9f) + "G";
        }
        if (j7 >= 1125899906842624L) {
            return j.a(j7, "B");
        }
        return b((j7 * 1.0f) / 1.0995116E12f) + ExifInterface.GPS_DIRECTION_TRUE;
    }

    public static String b(float f7) {
        String str = f7 + "";
        int iIndexOf = str.indexOf(UtilsKt.DOT) + 1;
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf);
        String strSubstring3 = strSubstring2;
        if (strSubstring2.length() >= 1) {
            strSubstring3 = strSubstring2.substring(0, 1);
        }
        return p.a(strSubstring, strSubstring3);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.bilibili.storagechecker.f$a, java.lang.Object] */
    public static void c(File file) {
        if (!file.isFile()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
            return;
        }
        String absolutePath = file.getAbsolutePath();
        long length = file.length();
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(file.lastModified()));
        long jLastModified = file.lastModified();
        ?? obj = new Object();
        obj.f105077a = absolutePath;
        obj.f105078b = length;
        obj.f105079c = false;
        obj.f105080d = str;
        obj.f105081e = jLastModified;
        String parent = file.getParent();
        HashMap<String, List<a>> map = f105076a;
        if (map.containsKey(parent)) {
            if (map.get(parent) != null) {
                map.get(parent).add(obj);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            map.put(parent, arrayList);
        }
    }

    public static long d(File file) {
        long length = 0;
        long j7 = 0;
        if (file.exists()) {
            j7 = 0;
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                int length2 = fileArrListFiles.length;
                int i7 = 0;
                while (true) {
                    j7 = length;
                    if (i7 >= length2) {
                        break;
                    }
                    File file2 = fileArrListFiles[i7];
                    length = (file2.isFile() ? file2.length() : d(file2)) + length;
                    i7++;
                }
            }
        }
        return j7;
    }

    public static String e(Context context) {
        String parent;
        long j7;
        Iterator it;
        String str;
        long j8;
        long j9;
        File internalStorageFilesDir = StorageChecker.getInternalStorageFilesDir(context, "");
        StringBuilder sb = new StringBuilder();
        sb.append(internalStorageFilesDir.getAbsolutePath());
        String str2 = "/";
        sb.append("/");
        String string = sb.toString();
        StorageChecker.scanSDCards(context);
        ArrayList<StorageItem> arrayList = new ArrayList();
        try {
            parent = context.getFilesDir().getParent();
        } catch (Exception e7) {
            parent = "/data/data/tv.danmaku.bili";
        }
        StorageItem storageItem = new StorageItem(p.a(parent, "/"), "fuse", -1);
        List<StorageItem> availableStorageItems = StorageChecker.getAvailableStorageItems(context);
        arrayList.add(0, storageItem);
        arrayList.addAll(availableStorageItems);
        ArrayList arrayList2 = new ArrayList();
        for (StorageItem storageItem2 : arrayList) {
            String str3 = storageItem2.path;
            if (str3 != null) {
                arrayList2.add(str3.startsWith("/data") ? storageItem2.path : storageItem2.path + "Android/data/" + context.getApplicationContext().getPackageName());
            }
        }
        String strA = p.a(string, "storage_detail.txt");
        String str4 = "storage_summary.txt";
        String strA2 = p.a(string, "storage_summary.txt");
        String str5 = string + "storage_data.json";
        com.bilibili.storagechecker.a.b("", strA, false);
        com.bilibili.storagechecker.a.b("", strA2, false);
        com.bilibili.storagechecker.a.b("", str5, false);
        String str6 = "**文件扫描报告**\n报告路径:" + strA2 + "\n";
        if (!TextUtils.isEmpty(strA2)) {
            com.bilibili.storagechecker.a.b(str6, strA2, true);
        }
        String str7 = "";
        String str8 = str2;
        String str9 = str4;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                int i7 = 0;
                str7 = "";
                str8 = str2;
                str9 = str4;
                if (!it2.hasNext()) {
                    break;
                }
                String str10 = (String) it2.next();
                HashMap<String, List<a>> map = f105076a;
                map.clear();
                if (TextUtils.isEmpty(str10)) {
                    Iterator it3 = it2;
                    str = str4;
                    it = it3;
                } else {
                    c(new File(str10));
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<Map.Entry<String, List<a>>> it4 = map.entrySet().iterator();
                    int i8 = 0;
                    long j10 = 0;
                    while (true) {
                        j7 = j10;
                        if (!it4.hasNext()) {
                            break;
                        }
                        Iterator<a> it5 = it4.next().getValue().iterator();
                        long j11 = 0;
                        while (it5.hasNext()) {
                            j11 += it5.next().f105078b;
                            i8++;
                        }
                        i7++;
                        j10 = j7 + j11;
                    }
                    sb2.append(SimpleBaseClient.CRLF);
                    sb2.append("扫描路径:" + str10);
                    sb2.append("\n");
                    sb2.append("占用存储:" + a(j7));
                    sb2.append("\n");
                    sb2.append("文件夹个数:" + i7);
                    sb2.append("\n");
                    sb2.append("文件个数:" + i8);
                    sb2.append("\n");
                    String string2 = sb2.toString();
                    if (!TextUtils.isEmpty(strA2)) {
                        com.bilibili.storagechecker.a.b(string2, strA2, true);
                    }
                    File[] fileArrListFiles = new File(str10).listFiles();
                    ArrayList<b> arrayList3 = new ArrayList();
                    arrayList3.add(new b(str10, 0));
                    if (fileArrListFiles != null) {
                        int length = fileArrListFiles.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length) {
                                Collections.sort(arrayList3);
                                break;
                            }
                            File file = fileArrListFiles[i9];
                            if (file.getAbsolutePath().endsWith("files")) {
                                arrayList3.add(new b(file.getAbsolutePath(), 1));
                                File[] fileArrListFiles2 = file.listFiles();
                                if (fileArrListFiles2 == null) {
                                    break;
                                }
                                for (File file2 : fileArrListFiles2) {
                                    if (file2.isDirectory()) {
                                        String absolutePath = file2.getAbsolutePath();
                                        String str11 = str2;
                                        arrayList3.add(new b(absolutePath, 2));
                                        File[] fileArrListFiles3 = file2.listFiles();
                                        if (fileArrListFiles3 == null) {
                                            str2 = str11;
                                            break;
                                        }
                                        for (File file3 : fileArrListFiles3) {
                                            if (file3.isDirectory()) {
                                                arrayList3.add(new b(file3.getAbsolutePath(), 3));
                                            }
                                        }
                                    }
                                }
                            } else {
                                arrayList3.add(new b(file.getAbsolutePath(), 1));
                            }
                            i9++;
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        for (b bVar : arrayList3) {
                            bVar.f105084c = d(new File(bVar.f105083b));
                        }
                        StringBuilder sb3 = new StringBuilder(100);
                        sb3.append("\r\n存储报告总结，以树形结构展示:\n");
                        for (b bVar2 : arrayList3) {
                            if (bVar2.f105084c >= 2097152) {
                                sb3.append(bVar2.toString());
                                sb3.append("\n");
                            }
                        }
                        String string3 = sb3.toString();
                        if (!TextUtils.isEmpty(strA2)) {
                            com.bilibili.storagechecker.a.b(string3, strA2, true);
                        }
                    }
                    ArrayList<a> arrayList4 = new ArrayList();
                    for (Map.Entry<String, List<a>> entry : f105076a.entrySet()) {
                        Iterator<a> it6 = entry.getValue().iterator();
                        while (true) {
                            j9 = j8;
                            j8 = it6.hasNext() ? j9 + it6.next().f105078b : 0L;
                        }
                        a aVar = new a();
                        aVar.f105077a = entry.getKey();
                        aVar.f105079c = true;
                        aVar.f105078b = j9;
                        arrayList4.add(aVar);
                    }
                    String str12 = str4;
                    Collections.sort(arrayList4);
                    StringBuilder sb4 = new StringBuilder("扫描路径:");
                    sb4.append(str10);
                    sb4.append("\n详情信息:\n");
                    for (a aVar2 : arrayList4) {
                        sb4.append("\n");
                        sb4.append(aVar2.toString());
                        sb4.append("\n");
                        List<a> list = f105076a.get(aVar2.f105077a);
                        Collections.sort(list);
                        if (list != null) {
                            Iterator<a> it7 = list.iterator();
                            while (it7.hasNext()) {
                                sb4.append(it7.next().toString());
                                sb4.append("\n");
                            }
                        }
                    }
                    String string4 = sb4.toString();
                    if (!TextUtils.isEmpty(strA)) {
                        com.bilibili.storagechecker.a.b(string4, strA, true);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<Map.Entry<String, List<a>>> it8 = f105076a.entrySet().iterator();
                    while (it8.hasNext()) {
                        arrayList5.addAll(it8.next().getValue());
                    }
                    String strA3 = com.bilibili.storagechecker.a.a(str5);
                    if (!strA3.isEmpty()) {
                        arrayList5.addAll((List) GsonKt.getSGlobalGson().fromJson(strA3, new e().getType()));
                    }
                    com.bilibili.storagechecker.a.b(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(arrayList5), str5, false);
                    it = it2;
                    str = str12;
                }
                f105076a.clear();
                String str13 = str;
                it2 = it;
                str4 = str13;
            }
        }
        com.bilibili.storagechecker.a.b(B0.a.a(com.bilibili.storagechecker.a.a(string + str9), "\n\n", com.bilibili.storagechecker.a.a(string + "storage_detail.txt")), string + "storage_full.txt", false);
        return p.a(LA.f.c(StorageChecker.getInternalStorageFilesDir(context, str7), new StringBuilder(), str8), "storage_full.txt");
    }
}
