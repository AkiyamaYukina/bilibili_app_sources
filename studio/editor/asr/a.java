package com.bilibili.studio.editor.asr;

import com.bilibili.studio.editor.asr.bean.AsrResultWrapper;
import com.bilibili.studio.editor.asr.exception.AsrAudioTooLargeException;
import com.bilibili.studio.editor.asr.exception.AsrExtractException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<AsrResultWrapper> f105524a;

    public a(@NotNull List<AsrResultWrapper> list) {
        this.f105524a = list;
    }

    public final int a() {
        boolean z6;
        int i7;
        int i8;
        List<AsrResultWrapper> list = this.f105524a;
        if ((list instanceof Collection) && list.isEmpty()) {
            z6 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((AsrResultWrapper) it.next()).getAsrUtterances() == null) {
                    z6 = false;
                    break;
                }
            }
            z6 = true;
        }
        List<AsrResultWrapper> list2 = this.f105524a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            int i9 = 0;
            while (true) {
                i7 = i9;
                if (!it2.hasNext()) {
                    break;
                }
                if (((AsrResultWrapper) it2.next()).getAudioInfo().getFrom() == 1) {
                    int i10 = i9 + 1;
                    i9 = i10;
                    if (i10 < 0) {
                        CollectionsKt.throwCountOverflow();
                        i9 = i10;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        List<AsrResultWrapper> list3 = this.f105524a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            int i11 = 0;
            while (true) {
                i8 = i11;
                if (!it3.hasNext()) {
                    break;
                }
                if (((AsrResultWrapper) it3.next()).getAudioInfo().getFrom() == 0) {
                    int i12 = i11 + 1;
                    i11 = i12;
                    if (i12 < 0) {
                        CollectionsKt.throwCountOverflow();
                        i11 = i12;
                    }
                }
            }
        } else {
            i8 = 0;
        }
        int i13 = i8 + i7;
        if (i13 > 800) {
            return 100001;
        }
        List<AsrResultWrapper> list4 = this.f105524a;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return 100003;
        }
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            if (!(((AsrResultWrapper) it4.next()).getException() instanceof AsrExtractException)) {
                List<AsrResultWrapper> list5 = this.f105524a;
                if ((list5 instanceof Collection) && list5.isEmpty()) {
                    return 100004;
                }
                Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    if (!(((AsrResultWrapper) it5.next()).getException() instanceof AsrAudioTooLargeException)) {
                        return (z6 && i13 == 0) ? 100002 : 100099;
                    }
                }
                return 100004;
            }
        }
        return 100003;
    }
}
