package com.bilibili.upper.module.cover.editor;

import android.app.Application;
import android.content.Context;
import android.graphics.PointF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.studio.videoeditor.editor.editdata.OperationCover;
import com.bilibili.upper.module.cover.entity.CoverEditorCaptionInfo;
import com.bilibili.xpref.Xpref;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/f.class */
@StabilityInferred(parameters = 0)
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public EditorMaterialEntity f112679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f112680b;

    @Override // com.bilibili.upper.module.cover.editor.h
    @Nullable
    public final CoverEditorInfo a() {
        return null;
    }

    @Override // com.bilibili.upper.module.cover.editor.h
    @Nullable
    public final String b() {
        return this.f112680b;
    }

    @Override // com.bilibili.upper.module.cover.editor.h
    public final void c(@Nullable final OperationCover operationCover) {
        this.f112680b = operationCover.getLocalPath();
        CaptionDataManager.d(operationCover.getCaptionTempId(), new CaptionDataManager.a(operationCover, this) { // from class: com.bilibili.upper.module.cover.editor.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OperationCover f112677a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f f112678b;

            {
                this.f112677a = operationCover;
                this.f112678b = this;
            }

            @Override // com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager.a
            public final void a(CaptionListItem captionListItem, String str) {
                int iD = Jf1.h.d(BiliContext.application());
                int px = ListExtentionsKt.toPx(36);
                CoverEditorCaptionInfo coverEditorCaptionInfo = new CoverEditorCaptionInfo();
                OperationCover operationCover2 = this.f112677a;
                PointF pointFB = nG0.a.b(operationCover2.getOffsetXY());
                PointF pointFA = nG0.a.a(operationCover2.getLocation(), iD - px);
                coverEditorCaptionInfo.captionScale = operationCover2.getCaptionScale();
                coverEditorCaptionInfo.captionId = System.currentTimeMillis();
                coverEditorCaptionInfo.text = operationCover2.getCaptionText();
                coverEditorCaptionInfo.fontSize = 84.0f;
                coverEditorCaptionInfo.fontColor = -1;
                coverEditorCaptionInfo.textLimitLength = 60;
                coverEditorCaptionInfo.translationX = pointFA.x + pointFB.x;
                coverEditorCaptionInfo.translationY = pointFA.y + pointFB.y;
                coverEditorCaptionInfo.anchorPointX = 0.0f;
                coverEditorCaptionInfo.anchorPointY = 0.0f;
                coverEditorCaptionInfo.idFontTemplateIndex = operationCover2.getCaptionTempId();
                coverEditorCaptionInfo.captionAssetBean = captionListItem.captionAssetBean.m9883clone();
                coverEditorCaptionInfo.fontType = str;
                f fVar = this.f112678b;
                fVar.getClass();
                Application application = BiliContext.application();
                if (application != null) {
                    Xpref.getSharedPreferences(application, "editor_config").edit().putString("cover_apply_16_9_cover_editor_info_16_9", JSON.toJSONString(null)).apply();
                    Xpref.getSharedPreferences(application, "editor_config").edit().putString("cover_apply_16_9_cover_material_16_9", JSON.toJSONString(fVar.f112679a)).apply();
                    Xpref.getSharedPreferences(application, "editor_config").edit().putString("cover_apply_16_9_cover_input_image_path_16_9", fVar.f112680b).apply();
                }
            }
        });
    }

    @Override // com.bilibili.upper.module.cover.editor.h
    public final void d(@Nullable Context context) {
        if (context != null) {
            Xpref.getSharedPreferences(context, "editor_config").edit().putString("cover_apply_16_9_cover_editor_info_16_9", "").apply();
            Xpref.getSharedPreferences(context, "editor_config").edit().putString("cover_apply_16_9_cover_material_16_9", "").apply();
            Xpref.getSharedPreferences(context, "editor_config").edit().putString("cover_apply_16_9_cover_input_image_path_16_9", "").apply();
        }
    }

    @Override // com.bilibili.upper.module.cover.editor.h
    public final void release() {
        this.f112679a = null;
        this.f112680b = null;
    }
}
