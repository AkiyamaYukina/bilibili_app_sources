package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment;

import TB0.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.bean.RecordVoiceCategory;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/c.class */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorRecordVoiceFragment f106925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayoutManager f106926b;

    public c(BiliEditorRecordVoiceFragment biliEditorRecordVoiceFragment, LinearLayoutManager linearLayoutManager) {
        this.f106925a = biliEditorRecordVoiceFragment;
        this.f106926b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        super.onScrollStateChanged(recyclerView, i7);
        this.f106925a.f106891l = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        int iJ02;
        List<RecordVoiceCategory.FxData> list;
        List<RecordVoiceCategory.FxData> list2;
        List<RecordVoiceCategory.FxData> list3;
        super.onScrolled(recyclerView, i7, i8);
        BiliEditorRecordVoiceFragment biliEditorRecordVoiceFragment = this.f106925a;
        if (biliEditorRecordVoiceFragment.f106891l) {
            LinearLayoutManager linearLayoutManager = this.f106926b;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            m mVar = biliEditorRecordVoiceFragment.f106889j;
            if (mVar != null && (list3 = mVar.f106937b) != null) {
            }
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            LinearLayoutManager linearLayoutManager2 = null;
            if (i7 < 0) {
                sy0.e eVarKf = biliEditorRecordVoiceFragment.kf();
                m mVar2 = biliEditorRecordVoiceFragment.f106889j;
                iJ02 = eVarKf.J0((mVar2 == null || (list2 = mVar2.f106937b) == null) ? null : (RecordVoiceCategory.FxData) CollectionsKt.getOrNull(list2, iFindFirstVisibleItemPosition));
            } else {
                sy0.e eVarKf2 = biliEditorRecordVoiceFragment.kf();
                m mVar3 = biliEditorRecordVoiceFragment.f106889j;
                iJ02 = eVarKf2.J0((mVar3 == null || (list = mVar3.f106937b) == null) ? null : (RecordVoiceCategory.FxData) CollectionsKt.getOrNull(list, iFindLastVisibleItemPosition));
            }
            if (iJ02 > -1) {
                o oVar = biliEditorRecordVoiceFragment.f106890k;
                if (oVar == null || iJ02 != oVar.f106948c) {
                    if (oVar != null) {
                        oVar.f106948c = iJ02;
                    }
                    if (oVar != null) {
                        oVar.notifyDataSetChanged();
                    }
                    j0 j0Var = biliEditorRecordVoiceFragment.f106887g;
                    RecyclerView.LayoutManager layoutManager = j0Var != null ? j0Var.h.getLayoutManager() : null;
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager2 = (LinearLayoutManager) layoutManager;
                    }
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.scrollToPositionWithOffset(iJ02, 0);
                    }
                }
            }
        }
    }
}
