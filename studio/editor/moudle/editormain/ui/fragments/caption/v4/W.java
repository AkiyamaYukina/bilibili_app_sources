package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import fq0.C7139a;
import fq0.C7146h;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/W.class */
public final /* synthetic */ class W implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f106609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f106610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f106611c;

    public /* synthetic */ W(int i7, Object obj, Object obj2) {
        this.f106609a = i7;
        this.f106610b = obj;
        this.f106611c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f106609a) {
            case 0:
                BiliEditorCaptionTemplateListV4Fragment biliEditorCaptionTemplateListV4Fragment = (BiliEditorCaptionTemplateListV4Fragment) this.f106610b;
                Ref.IntRef intRef = (Ref.IntRef) this.f106611c;
                ArrayList<CaptionListItem> arrayList = BiliEditorCaptionTemplateV4Fragment.f106543n;
                int i7 = intRef.element;
                RecyclerView recyclerView = biliEditorCaptionTemplateListV4Fragment.f106539k;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(i7);
                }
                break;
            default:
                C7146h c7146h = (C7146h) this.f106610b;
                C7139a c7139a = (C7139a) this.f106611c;
                LruCache<String, Bitmap> lruCache = C7146h.f119206a;
                c7146h.getClass();
                C7146h.a(c7139a);
                break;
        }
    }
}
