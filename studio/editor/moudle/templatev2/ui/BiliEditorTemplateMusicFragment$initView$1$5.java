package com.bilibili.studio.editor.moudle.templatev2.ui;

import androidx.lifecycle.MutableLiveData;
import cn.com.chinatelecom.account.api.d.m;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateMusicViewModel;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.extension.l;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/BiliEditorTemplateMusicFragment$initView$1$5.class */
final /* synthetic */ class BiliEditorTemplateMusicFragment$initView$1$5 extends FunctionReferenceImpl implements Function2<Integer, EditorMusicItem, Unit> {
    public BiliEditorTemplateMusicFragment$initView$1$5(Object obj) {
        super(2, obj, BiliEditorTemplateMusicFragment.class, "onMusicItemClick", "onMusicItemClick(ILcom/bilibili/studio/editor/moudle/music/model/EditorMusicItem;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (EditorMusicItem) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(int i7, EditorMusicItem editorMusicItem) {
        EditorMusicItem musicItem;
        EditorMusicItem editorMusicItem2;
        EditorMusicItem musicItem2;
        EditorMusicItem editorMusicItem3;
        BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment = (BiliEditorTemplateMusicFragment) ((CallableReference) this).receiver;
        k.c cVar = biliEditorTemplateMusicFragment.of().f108198f;
        if (cVar != null) {
            cVar.f108203e = true;
        }
        String str = editorMusicItem.flag;
        Pair<EditorMusicItem, Boolean> value = biliEditorTemplateMusicFragment.qf().f108120j.getValue();
        int i8 = !Intrinsics.areEqual(str, (value == null || (editorMusicItem3 = (EditorMusicItem) value.getFirst()) == null) ? null : editorMusicItem3.flag) ? 1 : 2;
        Xz0.d dVar = Xz0.d.f28458a;
        k.c cVar2 = biliEditorTemplateMusicFragment.of().f108198f;
        int i9 = cVar2 != null ? cVar2.f108204f : 0;
        String strL = com.bilibili.studio.videoeditor.extension.f.l(editorMusicItem);
        EditorTemplateTabItemBean value2 = biliEditorTemplateMusicFragment.qf().f108117f.getValue();
        long jLongValue = 0;
        if (value2 != null) {
            long originId = value2.getOriginId();
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
        String strI = editVideoInfo != null ? com.bilibili.studio.videoeditor.extension.f.i(editVideoInfo) : null;
        String str2 = editorMusicItem.isAIRec ? "1" : editorMusicItem.isTemplateBind ? "2" : "3";
        String strE = l.e(biliEditorTemplateMusicFragment.of().f108196d);
        dVar.getClass();
        Map mapE = Xz0.d.e();
        HashMap map = (HashMap) mapE;
        P4.a.a(i9, "fast_video", strE, "enter_from", map);
        String str3 = strL;
        if (strL == null) {
            str3 = "";
        }
        map.put("music_id", str3);
        map.put(EditCustomizeSticker.TAG_TEMPLATE_ID, String.valueOf(jLongValue));
        String str4 = strI;
        if (strI == null) {
            str4 = "";
        }
        map.put("tag_name", str4);
        P4.a.a(i7 + 1, "music_type", str2, Constant.IN_KEY_LOCATION, map);
        map.put("click_type", String.valueOf(i8));
        Neurons.reportClick(false, "creation.new-video-editor.template.music.click", mapE);
        BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModelQf = biliEditorTemplateMusicFragment.qf();
        MutableLiveData<MusicDownloadData> mutableLiveData = biliEditorTemplateMusicViewModelQf.f108121k;
        MusicDownloadData value3 = mutableLiveData.getValue();
        if (Intrinsics.areEqual(editorMusicItem.flag, (value3 == null || (musicItem2 = value3.getMusicItem()) == null) ? null : musicItem2.flag)) {
            return;
        }
        String str5 = editorMusicItem.flag;
        MutableLiveData<Pair<EditorMusicItem, Boolean>> mutableLiveData2 = biliEditorTemplateMusicViewModelQf.f108120j;
        Pair<EditorMusicItem, Boolean> value4 = mutableLiveData2.getValue();
        if (Intrinsics.areEqual(str5, (value4 == null || (editorMusicItem2 = (EditorMusicItem) value4.getFirst()) == null) ? null : editorMusicItem2.flag)) {
            mutableLiveData2.setValue(null);
            return;
        }
        if (value3 != null && (musicItem = value3.getMusicItem()) != null) {
            musicItem.downloadStatus = 5;
        }
        if (editorMusicItem.isEdit) {
            mutableLiveData.setValue(null);
            mutableLiveData2.setValue(TuplesKt.to(editorMusicItem, Boolean.TRUE));
            return;
        }
        if (editorMusicItem.isLocalMusic) {
            mutableLiveData.setValue(null);
            mutableLiveData2.setValue(TuplesKt.to(editorMusicItem, Boolean.TRUE));
            return;
        }
        Bgm bgm = editorMusicItem.editBgm;
        String str6 = bgm != null ? bgm.localPath : null;
        if (str6 != null && str6.length() != 0 && m.b(str6)) {
            mutableLiveData.setValue(null);
            mutableLiveData2.setValue(TuplesKt.to(editorMusicItem, Boolean.TRUE));
        } else {
            MusicDownloadData musicDownloadData = new MusicDownloadData(editorMusicItem.editBgm, 0L, 0L, editorMusicItem);
            editorMusicItem.downloadStatus = 3;
            biliEditorTemplateMusicViewModelQf.R0(musicDownloadData);
        }
    }
}
