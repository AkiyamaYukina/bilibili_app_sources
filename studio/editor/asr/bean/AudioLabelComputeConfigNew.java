package com.bilibili.studio.editor.asr.bean;

import Bw0.b;
import androidx.annotation.Keep;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/AudioLabelComputeConfigNew.class */
@Keep
public final class AudioLabelComputeConfigNew extends ArrayList<b> {
    public /* bridge */ boolean contains(b bVar) {
        return super.contains((Object) bVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return contains((b) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(b bVar) {
        return super.indexOf((Object) bVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof b) {
            return indexOf((b) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(b bVar) {
        return super.lastIndexOf((Object) bVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof b) {
            return lastIndexOf((b) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ b remove(int i7) {
        return removeAt(i7);
    }

    public /* bridge */ boolean remove(b bVar) {
        return super.remove((Object) bVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof b) {
            return remove((b) obj);
        }
        return false;
    }

    public /* bridge */ b removeAt(int i7) {
        return remove(i7);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
