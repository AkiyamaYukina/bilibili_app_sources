package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import androidx.annotation.NonNull;
import com.bilibili.studio.videoeditor.picker.bean.StorageBean;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/Q.class */
public final class Q {
    @NonNull
    public static List<StorageBean> a(Context context) {
        ArrayList arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<StorageVolume> it = ((StorageManager) context.getSystemService("storage")).getStorageVolumes().iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                StorageVolume next = it.next();
                StorageBean storageBean = new StorageBean();
                storageBean.mounted = next.getState();
                File directory = next.getDirectory();
                if (directory != null) {
                    storageBean.path = directory.getPath();
                }
                storageBean.removable = next.isRemovable();
                arrayList2.add(storageBean);
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            try {
                int i7 = 0;
                Method method = storageManager.getClass().getMethod("getVolumeList", null);
                Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                Method method2 = cls.getMethod("getPath", null);
                Method method3 = cls.getMethod("isRemovable", null);
                Method method4 = cls.getMethod("getState", null);
                Object objInvoke = method.invoke(storageManager, null);
                if (objInvoke != null) {
                    int length = Array.getLength(objInvoke);
                    while (true) {
                        arrayList = arrayList3;
                        if (i7 >= length) {
                            break;
                        }
                        Object obj = Array.get(objInvoke, i7);
                        String str = (String) method2.invoke(obj, null);
                        boolean zBooleanValue = ((Boolean) method3.invoke(obj, null)).booleanValue();
                        String storageState = method4 != null ? (String) method4.invoke(obj, null) : Environment.getStorageState(new File(str));
                        StorageBean storageBean2 = new StorageBean();
                        storageBean2.mounted = storageState;
                        storageBean2.path = str;
                        storageBean2.removable = zBooleanValue;
                        arrayList3.add(storageBean2);
                        i7++;
                    }
                } else {
                    arrayList = arrayList3;
                }
            } catch (ClassNotFoundException e7) {
                e7.printStackTrace();
                arrayList = arrayList3;
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
                arrayList = arrayList3;
            } catch (NoSuchMethodException e9) {
                e9.printStackTrace();
                arrayList = arrayList3;
            } catch (InvocationTargetException e10) {
                e10.printStackTrace();
                arrayList = arrayList3;
            } catch (Exception e11) {
                e11.printStackTrace();
                arrayList = arrayList3;
            }
        }
        return arrayList;
    }
}
