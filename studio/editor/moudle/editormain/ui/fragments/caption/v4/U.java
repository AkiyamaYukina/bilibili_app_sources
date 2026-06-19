package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/U.class */
public final class U extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionTemplateListV4Fragment f106608a;

    public U(BiliEditorCaptionTemplateListV4Fragment biliEditorCaptionTemplateListV4Fragment) {
        this.f106608a = biliEditorCaptionTemplateListV4Fragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        CaptionListItem captionListItem;
        super.onScrolled(recyclerView, i7, i8);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        while (true) {
            BiliEditorCaptionTemplateListV4Fragment biliEditorCaptionTemplateListV4Fragment = this.f106608a;
            if (iFindFirstVisibleItemPosition >= iFindLastVisibleItemPosition + 1) {
                biliEditorCaptionTemplateListV4Fragment.getClass();
                return;
            }
            List<? extends CaptionListItem> list = biliEditorCaptionTemplateListV4Fragment.f106538j;
            if (list != null && (captionListItem = (CaptionListItem) CollectionsKt.getOrNull(list, iFindFirstVisibleItemPosition)) != null) {
                biliEditorCaptionTemplateListV4Fragment.f106542n.add(String.valueOf(captionListItem.getId()));
            }
            iFindFirstVisibleItemPosition++;
        }
    }
}
