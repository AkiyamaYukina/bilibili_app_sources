package com.bilibili.studio.editor.moudle.templatev2.vm;

import android.app.Activity;
import com.bilibili.app.authorspace.ui.pages.V;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.moudle.templatev2.vm.e;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateDownloader$switchRecommendTemplate$1.class */
final class BiliEditorTemplateDownloader$switchRecommendTemplate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Activity $context;
    final EditVideoInfo $editVideoInfo;
    final long $startTime;
    final BiliTemplateEngineManager $templateEngineManager;
    final EditorTemplateTabItemBean $templateItem;
    final EditVideoIntelligenceInfo $useIntelligenceInfo;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateDownloader$switchRecommendTemplate$1(EditorTemplateTabItemBean editorTemplateTabItemBean, e eVar, Activity activity, EditVideoIntelligenceInfo editVideoIntelligenceInfo, EditVideoInfo editVideoInfo, BiliTemplateEngineManager biliTemplateEngineManager, long j7, Continuation<? super BiliEditorTemplateDownloader$switchRecommendTemplate$1> continuation) {
        super(2, continuation);
        this.$templateItem = editorTemplateTabItemBean;
        this.this$0 = eVar;
        this.$context = activity;
        this.$useIntelligenceInfo = editVideoIntelligenceInfo;
        this.$editVideoInfo = editVideoInfo;
        this.$templateEngineManager = biliTemplateEngineManager;
        this.$startTime = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(EditorTemplateTabItemBean editorTemplateTabItemBean, e eVar, int i7, EditorTemplateTabItemBean editorTemplateTabItemBean2, String str) {
        V.a(i7, "智能成片-模板切换 失败 retryCount=", ",errorMsg=", str, "BiliEditorTemplateDownloader");
        if (Intrinsics.areEqual(editorTemplateTabItemBean, eVar.f108168e)) {
            eVar.b(editorTemplateTabItemBean, 5);
            eVar.f108166c.tryEmit(new e.b(editorTemplateTabItemBean, str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(EditorTemplateTabItemBean editorTemplateTabItemBean, e eVar, EditVideoIntelligenceInfo editVideoIntelligenceInfo, long j7, int i7, EditVideoInfo editVideoInfo, EditorTemplateTabItemBean editorTemplateTabItemBean2) {
        bilibili.live.app.service.resolver.c.a(i7, "智能成片-模板切换 成功 retryCount=", "BiliEditorTemplateDownloader");
        if (Intrinsics.areEqual(editorTemplateTabItemBean, eVar.f108168e)) {
            eVar.b(editorTemplateTabItemBean, 5);
            e.a(eVar, editVideoInfo, editVideoIntelligenceInfo);
            eVar.f108166c.tryEmit(new e.C1199e(editorTemplateTabItemBean, editVideoInfo, j7));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(EditorTemplateTabItemBean editorTemplateTabItemBean, e eVar, int i7, EditorTemplateTabItemBean editorTemplateTabItemBean2) {
        bilibili.live.app.service.resolver.c.a(i7, "智能成片-模板切换 取消 retryCount=", "BiliEditorTemplateDownloader");
        if (Intrinsics.areEqual(editorTemplateTabItemBean, eVar.f108168e)) {
            eVar.b(editorTemplateTabItemBean, 5);
            eVar.f108166c.tryEmit(new e.c(editorTemplateTabItemBean));
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateDownloader$switchRecommendTemplate$1(this.$templateItem, this.this$0, this.$context, this.$useIntelligenceInfo, this.$editVideoInfo, this.$templateEngineManager, this.$startTime, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$templateItem.isValid()) {
            final e eVar = this.this$0;
            Activity activity = this.$context;
            final EditVideoIntelligenceInfo editVideoIntelligenceInfo = this.$useIntelligenceInfo;
            int i7 = editVideoIntelligenceInfo.videoCount;
            EditVideoInfo editVideoInfo = this.$editVideoInfo;
            BiliTemplateEngineManager biliTemplateEngineManager = this.$templateEngineManager;
            final EditorTemplateTabItemBean editorTemplateTabItemBean = this.$templateItem;
            Function3<? super Integer, ? super EditorTemplateTabItemBean, ? super String, Unit> function3 = new Function3(editorTemplateTabItemBean, eVar) { // from class: com.bilibili.studio.editor.moudle.templatev2.vm.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EditorTemplateTabItemBean f108184a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final e f108185b;

                {
                    this.f108184a = editorTemplateTabItemBean;
                    this.f108185b = eVar;
                }

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BiliEditorTemplateDownloader$switchRecommendTemplate$1.invokeSuspend$lambda$0(this.f108184a, this.f108185b, ((Integer) obj2).intValue(), (EditorTemplateTabItemBean) obj3, (String) obj4);
                }
            };
            final long j7 = this.$startTime;
            eVar.c(activity, editVideoIntelligenceInfo, i7, editVideoInfo, biliTemplateEngineManager, 0, editorTemplateTabItemBean, function3, new Function3(editorTemplateTabItemBean, eVar, editVideoIntelligenceInfo, j7) { // from class: com.bilibili.studio.editor.moudle.templatev2.vm.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EditorTemplateTabItemBean f108186a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final e f108187b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final EditVideoIntelligenceInfo f108188c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f108189d;

                {
                    this.f108186a = editorTemplateTabItemBean;
                    this.f108187b = eVar;
                    this.f108188c = editVideoIntelligenceInfo;
                    this.f108189d = j7;
                }

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    EditVideoIntelligenceInfo editVideoIntelligenceInfo2 = this.f108188c;
                    long j8 = this.f108189d;
                    return BiliEditorTemplateDownloader$switchRecommendTemplate$1.invokeSuspend$lambda$1(this.f108186a, this.f108187b, editVideoIntelligenceInfo2, j8, ((Integer) obj2).intValue(), (EditVideoInfo) obj3, (EditorTemplateTabItemBean) obj4);
                }
            }, new Function2(editorTemplateTabItemBean, eVar) { // from class: com.bilibili.studio.editor.moudle.templatev2.vm.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EditorTemplateTabItemBean f108190a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final e f108191b;

                {
                    this.f108190a = editorTemplateTabItemBean;
                    this.f108191b = eVar;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    return BiliEditorTemplateDownloader$switchRecommendTemplate$1.invokeSuspend$lambda$2(this.f108190a, this.f108191b, ((Integer) obj2).intValue(), (EditorTemplateTabItemBean) obj3);
                }
            });
        } else {
            ArrayList<CaptionInfo> arrayListB = WC0.b.b(this.$editVideoInfo.getCaptionInfoList());
            ArrayList arrayListC = WC0.b.c(arrayListB, this.$editVideoInfo.getTtsInfoList());
            Lazy lazy = com.bilibili.studio.editor.moudle.intelligence.logic.d.f107350a;
            com.bilibili.studio.editor.moudle.intelligence.logic.d.a(this.$editVideoInfo);
            this.this$0.getClass();
            if (arrayListB != null) {
                for (CaptionInfo captionInfo : arrayListB) {
                    captionInfo.font = "";
                    captionInfo.idFont = 0;
                    captionInfo.idTmp = 0;
                    if (captionInfo.captionAssetBean == null) {
                        captionInfo.captionAssetBean = new CaptionAssetBean();
                    }
                    OC0.h.a(captionInfo.captionAssetBean);
                }
            }
            this.$editVideoInfo.setClipBackgroundBlur(true);
            EditVideoInfo editVideoInfo2 = this.$editVideoInfo;
            if (editVideoInfo2 != null && arrayListB != null) {
                editVideoInfo2.getCaptionInfoList().addAll(arrayListB);
            }
            EditVideoInfo editVideoInfo3 = this.$editVideoInfo;
            if (editVideoInfo3 != null && arrayListC != null) {
                editVideoInfo3.getTtsInfoList().addAll(arrayListC);
            }
            e.a(this.this$0, this.$editVideoInfo, this.$useIntelligenceInfo);
            this.this$0.b(this.$templateItem, 5);
            Boxing.boxBoolean(this.this$0.f108166c.tryEmit(new e.C1199e(this.$templateItem, this.$editVideoInfo, this.$startTime)));
        }
        return Unit.INSTANCE;
    }
}
