package com.bilibili.pegasus.vm;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/s.class */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f79088b;

    public /* synthetic */ s(Object obj, int i7) {
        this.f79087a = i7;
        this.f79088b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f79087a) {
            case 0:
                ((RecyclerView.Adapter) obj).notifyItemInserted(((h) this.f79088b).f79062b);
                return Unit.INSTANCE;
            default:
                BiliEditorStickerInfo biliEditorStickerInfo = (BiliEditorStickerInfo) obj;
                boolean selectedByUser = biliEditorStickerInfo.getSelectedByUser();
                UC0.g gVar = ((com.bilibili.upper.module.cover_v2.service.d) this.f79088b).f112859a.f12750i;
                if (gVar != null) {
                    gVar.k(biliEditorStickerInfo);
                }
                return Boolean.valueOf(!selectedByUser);
        }
    }
}
