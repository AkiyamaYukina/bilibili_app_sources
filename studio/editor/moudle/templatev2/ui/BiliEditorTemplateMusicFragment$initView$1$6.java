package com.bilibili.studio.editor.moudle.templatev2.ui;

import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.extension.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/BiliEditorTemplateMusicFragment$initView$1$6.class */
final /* synthetic */ class BiliEditorTemplateMusicFragment$initView$1$6 extends FunctionReferenceImpl implements Function2<Integer, EditorMusicItem, Unit> {
    public BiliEditorTemplateMusicFragment$initView$1$6(Object obj) {
        super(2, obj, BiliEditorTemplateMusicFragment.class, "onMusicItemShow", "onMusicItemShow(ILcom/bilibili/studio/editor/moudle/music/model/EditorMusicItem;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (EditorMusicItem) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(int i7, EditorMusicItem editorMusicItem) {
        BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment = (BiliEditorTemplateMusicFragment) ((CallableReference) this).receiver;
        biliEditorTemplateMusicFragment.getClass();
        Xz0.d dVar = Xz0.d.f28458a;
        k.c cVar = biliEditorTemplateMusicFragment.of().f108198f;
        int i8 = cVar != null ? cVar.f108204f : 0;
        String strL = com.bilibili.studio.videoeditor.extension.f.l(editorMusicItem);
        EditorTemplateTabItemBean value = biliEditorTemplateMusicFragment.qf().f108117f.getValue();
        long jLongValue = 0;
        if (value != null) {
            long originId = value.getOriginId();
            Long lValueOf = Long.valueOf(originId);
            if (originId < 0) {
                lValueOf = null;
            }
            jLongValue = 0;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            }
        }
        EditVideoInfo editVideoInfo = biliEditorTemplateMusicFragment.of().f108197e;
        String strI = null;
        if (editVideoInfo != null) {
            strI = com.bilibili.studio.videoeditor.extension.f.i(editVideoInfo);
        }
        String str = editorMusicItem.isAIRec ? "1" : editorMusicItem.isTemplateBind ? "2" : "3";
        String strE = l.e(biliEditorTemplateMusicFragment.of().f108196d);
        dVar.getClass();
        Map mapE = Xz0.d.e();
        HashMap map = (HashMap) mapE;
        P4.a.a(i8, "fast_video", strE, "enter_from", map);
        String str2 = strL;
        if (strL == null) {
            str2 = "";
        }
        map.put("music_id", str2);
        map.put(EditCustomizeSticker.TAG_TEMPLATE_ID, String.valueOf(jLongValue));
        String str3 = strI;
        if (strI == null) {
            str3 = "";
        }
        map.put("tag_name", str3);
        P4.a.a(i7 + 1, "music_type", str, Constant.IN_KEY_LOCATION, map);
        Neurons.reportExposure$default(false, "creation.new-video-editor.template.music.show", mapE, (List) null, 8, (Object) null);
    }
}
