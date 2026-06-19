package com.bilibili.upper.module.aistory.view.dragflowlayout;

import Qw0.a;
import Xz0.j;
import Xz0.k;
import android.view.MotionEvent;
import android.view.View;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/aistory/view/dragflowlayout/b.class */
public class b implements DragFlowLayout$j {
    @Override // com.bilibili.upper.module.aistory.view.dragflowlayout.DragFlowLayout$j
    public final void a(DragFlowLayout dragFlowLayout, View view, MotionEvent motionEvent) {
        View viewFindViewById;
        if (view == null || (viewFindViewById = view.findViewById(2131302932)) == null) {
            return;
        }
        boolean zA = i.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), viewFindViewById);
        if (viewFindViewById.getVisibility() == 0 && zA) {
            a aVarA = dragFlowLayout.getDragAdapter().a(view);
            BLog.i("AIStoryContainerFragment", "onDeleteClicked...child = " + view + ", data = " + aVarA);
            a aVar = aVarA != null ? aVarA : null;
            if (aVar != null) {
                boolean zIsVideo = aVar.isVideo();
                j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                j.c("router_topic_id", Xz0.g.f28463b);
                Map mapB = j.b(k.f28474a);
                ((HashMap) mapB).put("material_type", zIsVideo ? "视频" : "图片");
                Neurons.reportClick(false, "creation.ai-story-play.material-editor.delete-material.click", mapB);
            }
            dragFlowLayout.postDelayed(new a(this, dragFlowLayout, view, aVarA), 60L);
        }
    }
}
