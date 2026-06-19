package com.bilibili.studio.videoeditor.loader;

import java.util.Comparator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/h.class */
public final /* synthetic */ class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((ImageFolder) obj).name.compareTo(((ImageFolder) obj2).name);
    }
}
