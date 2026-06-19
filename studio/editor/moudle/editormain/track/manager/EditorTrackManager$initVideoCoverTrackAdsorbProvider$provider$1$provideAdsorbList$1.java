package com.bilibili.studio.editor.moudle.editormain.track.manager;

import Mx0.g;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.TrackAdsorbBean;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/manager/EditorTrackManager$initVideoCoverTrackAdsorbProvider$provider$1$provideAdsorbList$1.class */
final /* synthetic */ class EditorTrackManager$initVideoCoverTrackAdsorbProvider$provider$1$provideAdsorbList$1 extends FunctionReferenceImpl implements Function1<BiliEditorMaterialMultiInfo, List<? extends TrackAdsorbBean>> {
    public EditorTrackManager$initVideoCoverTrackAdsorbProvider$provider$1$provideAdsorbList$1(Object obj) {
        super(1, obj, g.class, "materialToAbsorb", "materialToAbsorb(Lcom/bilibili/studio/editor/moudle/editormain/track/beans/BiliEditorMaterialMultiInfo;)Ljava/util/List;", 0);
    }

    public final List<TrackAdsorbBean> invoke(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
        return g.c((g) ((CallableReference) this).receiver, biliEditorMaterialMultiInfo);
    }
}
