package com.bilibili.studio.editor.moudle.aistory.step;

import L50.a;
import R50.o;
import R50.r;
import android.content.Context;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryTtsBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import com.bilibili.studio.videoeditor.extension.ContextExtKt;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/d.class */
public class d extends m {
    public static void c(@NotNull CaptionInfo captionInfo, @Nullable List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BClip bClip = (BClip) it.next();
                if (captionInfo.inPoint >= bClip.getInPoint() && captionInfo.inPoint < bClip.getOutPoint()) {
                    captionInfo.bClipID = bClip.id;
                    captionInfo.capTimeInVideo = bClip.getTrimIn() + ((long) ((captionInfo.inPoint - bClip.getInPoint()) * bClip.playRate));
                    captionInfo.capTimeDuration = captionInfo.tempDuration;
                }
            }
        }
    }

    public static void f(EditVideoInfo editVideoInfo, TransitionInfo transitionInfo) {
        List<BClip> bClipList;
        String str;
        if (transitionInfo == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        if (userVideoTrack != null && (bClipList = userVideoTrack.getBClipList()) != null) {
            String str2 = "";
            int i7 = 0;
            for (Object obj : bClipList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                BClip bClip = (BClip) obj;
                if (i7 == 0) {
                    str = bClip.id;
                } else {
                    str = str2;
                    if (i7 < bClipList.size()) {
                        TransitionInfo transitionInfoM10485clone = transitionInfo.m10485clone();
                        transitionInfoM10485clone.preBClipId = str2;
                        str = bClip.id;
                        transitionInfoM10485clone.nextBClipId = str;
                        arrayList.add(transitionInfoM10485clone);
                    }
                }
                i7++;
                str2 = str;
            }
        }
        EditVideoClip userVideoTrack2 = editVideoInfo.getUserVideoTrack();
        if (userVideoTrack2 != null) {
            userVideoTrack2.setTransitionInfoList(arrayList);
        }
    }

    public static Qw0.a j(float f7, Map map) {
        float fAbs = Float.MAX_VALUE;
        Object orDefault = null;
        for (String str : map.keySet()) {
            List listR = StringsKt.R(str, new String[]{":"}, 0, 6);
            if (listR.size() == 2) {
                Float floatOrNull = StringsKt.toFloatOrNull((String) listR.get(0));
                Float floatOrNull2 = StringsKt.toFloatOrNull((String) listR.get(1));
                if (floatOrNull2 != null && floatOrNull != null && !Intrinsics.areEqual(floatOrNull2, 0.0f)) {
                    float fFloatValue = ((floatOrNull.floatValue() * 1.0f) / floatOrNull2.floatValue()) - f7;
                    if (Math.abs(fFloatValue) < fAbs) {
                        fAbs = Math.abs(fFloatValue);
                        orDefault = map.getOrDefault(str, null);
                    }
                }
            }
        }
        return (Qw0.a) orDefault;
    }

    @Nullable
    public static BClip k(@NotNull EditVideoInfo editVideoInfo, long j7) {
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList == null) {
            return null;
        }
        for (BClip bClip : userTrackBClipList) {
            if (j7 >= bClip.getInPoint() && j7 <= bClip.getOutPoint()) {
                return bClip;
            }
        }
        return null;
    }

    @Nullable
    public static BiliEditorStickerInfo.Range m(@Nullable Size size) {
        float f7 = 2;
        float width = (size.getWidth() * 1.0f) / f7;
        float height = (size.getHeight() * 1.0f) / f7;
        return new BiliEditorStickerInfo.Range(-width, height, width, -height);
    }

    public static void n(EditVideoInfo editVideoInfo, TransitionInfo transitionInfo, Integer num) {
        String str;
        int iIntValue;
        List<BClip> bClipList;
        List<BClip> userTrackBClipList;
        BClip bClip;
        String str2;
        List<BClip> userTrackBClipList2;
        BClip bClip2;
        String str3;
        EditVideoClip userVideoTrack;
        List<TransitionInfo> transitionInfoList;
        int iIntValue2;
        if (transitionInfo == null || (str = transitionInfo.transitionFile) == null || str.length() == 0) {
            return;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            EditVideoClip userVideoTrack2 = editVideoInfo.getUserVideoTrack();
            Integer numValueOf = (userVideoTrack2 == null || (bClipList = userVideoTrack2.getBClipList()) == null) ? null : Integer.valueOf(bClipList.size() - 2);
            iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        }
        if (iIntValue == -1 || (userTrackBClipList = editVideoInfo.getUserTrackBClipList()) == null || (bClip = (BClip) CollectionsKt.getOrNull(userTrackBClipList, iIntValue)) == null || (str2 = bClip.id) == null || (userTrackBClipList2 = editVideoInfo.getUserTrackBClipList()) == null || (bClip2 = (BClip) CollectionsKt.getOrNull(userTrackBClipList2, iIntValue + 1)) == null || (str3 = bClip2.id) == null || (userVideoTrack = editVideoInfo.getUserVideoTrack()) == null || (transitionInfoList = userVideoTrack.getTransitionInfoList()) == null) {
            return;
        }
        if (num != null) {
            iIntValue2 = num.intValue();
        } else {
            EditVideoClip userVideoTrack3 = editVideoInfo.getUserVideoTrack();
            Integer numValueOf2 = null;
            if (userVideoTrack3 != null) {
                List<TransitionInfo> transitionInfoList2 = userVideoTrack3.getTransitionInfoList();
                numValueOf2 = null;
                if (transitionInfoList2 != null) {
                    numValueOf2 = Integer.valueOf(transitionInfoList2.size());
                }
            }
            iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        }
        TransitionInfo transitionInfoM10485clone = transitionInfo.m10485clone();
        transitionInfoM10485clone.preBClipId = str2;
        transitionInfoM10485clone.nextBClipId = str3;
        Unit unit = Unit.INSTANCE;
        transitionInfoList.add(iIntValue2, transitionInfoM10485clone);
    }

    public static void o(EditVideoInfo editVideoInfo, Qw0.a aVar, Integer num) {
        Integer numValueOf;
        int iIntValue;
        List<BClip> bClipList;
        String filePath = aVar.getFilePath();
        if (filePath == null || filePath.length() == 0 || !cn.com.chinatelecom.account.api.d.m.b(filePath)) {
            return;
        }
        List<BClip> listConvertBClipListCopy = EditVideoInfoUtils.convertBClipListCopy(CollectionsKt.mutableListOf(new SelectVideo[]{new SelectVideo(filePath)}), new com.bilibili.studio.videoeditor.editor.editdata.a(new ArrayList()));
        if (V.e(editVideoInfo.getUserTrackBClipList())) {
            return;
        }
        ((com.bilibili.studio.editor.moudle.material.j) com.bilibili.studio.editor.moudle.material.j.f107898a.getValue()).getClass();
        com.bilibili.studio.editor.moudle.material.j.c(listConvertBClipListCopy);
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        if (num == null) {
            numValueOf = (userVideoTrack == null || (bClipList = userVideoTrack.getBClipList()) == null) ? null : Integer.valueOf(bClipList.size());
            if (numValueOf == null) {
                iIntValue = -1;
            }
            if (iIntValue != -1 || userVideoTrack == null) {
            }
            userVideoTrack.insertBClipAtIndex(iIntValue, listConvertBClipListCopy.get(0));
            return;
        }
        numValueOf = num;
        iIntValue = numValueOf.intValue();
        if (iIntValue != -1) {
        }
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.n
    public final int a() {
        return 6;
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.n
    @Nullable
    public final Object b(@NotNull final Context context, @NotNull final AIStoryBean aIStoryBean, @NotNull final com.bilibili.studio.editor.moudle.aistory.a aVar, @NotNull Continuation continuation) {
        ContextExtKt.runOnMainThreadSafely(context, new Function0(this, context, aIStoryBean, aVar) { // from class: com.bilibili.studio.editor.moudle.aistory.step.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f105758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f105759b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AIStoryBean f105760c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.aistory.a f105761d;

            {
                this.f105758a = this;
                this.f105759b = context;
                this.f105760c = aIStoryBean;
                this.f105761d = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:105:0x0508  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x05d4  */
            /* JADX WARN: Removed duplicated region for block: B:252:0x0a12  */
            /* JADX WARN: Removed duplicated region for block: B:269:0x0a52  */
            /* JADX WARN: Removed duplicated region for block: B:271:0x0a69  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0464  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 3663
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.step.c.invoke():java.lang.Object");
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.m, com.bilibili.studio.editor.moudle.aistory.step.n
    public final void cancel() {
    }

    public void d(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
        throw null;
    }

    public void e(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
    }

    public void g(@NotNull EditVideoInfo editVideoInfo, @Nullable List<AIStoryTtsBean> list) {
        if (list == null) {
            return;
        }
        editVideoInfo.setEditorMusicInfo(new EditorMusicInfo());
        ArrayList arrayList = new ArrayList();
        long j7 = 0;
        for (AIStoryTtsBean aIStoryTtsBean : list) {
            RecordInfo recordInfo = new RecordInfo();
            recordInfo.setPath(aIStoryTtsBean.getFilePath());
            long duration = aIStoryTtsBean.getDuration();
            recordInfo.capTimeDuration = duration;
            recordInfo.inPoint = j7;
            recordInfo.outPoint = duration + j7;
            recordInfo.setTrimIn(0L);
            recordInfo.fxName = Az0.a.d(aIStoryTtsBean.getFilePath());
            recordInfo.volumn = 2.0f;
            recordInfo.setTrimOut(recordInfo.capTimeDuration);
            List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
            if (userTrackBClipList != null) {
                Iterator<T> it = userTrackBClipList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        BClip bClip = (BClip) it.next();
                        if (recordInfo.inPoint >= bClip.getInPoint() && recordInfo.inPoint < bClip.getOutPoint()) {
                            recordInfo.bClipID = bClip.id;
                            recordInfo.capTimeInVideo = bClip.getTrimIn() + ((long) ((recordInfo.inPoint - bClip.getInPoint()) * bClip.playRate));
                            recordInfo.videoPath = bClip.videoPath;
                            break;
                        }
                    }
                }
            }
            j7 += recordInfo.capTimeDuration + 1;
            arrayList.add(recordInfo);
        }
        editVideoInfo.setRecordInfoList(arrayList);
        editVideoInfo.setNativeVolume(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(@org.jetbrains.annotations.NotNull com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r8, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean r9) {
        /*
            r7 = this;
            r0 = r9
            java.lang.Long r0 = r0.getStyleId()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = r0.longValue()
            r10 = r0
            goto L18
        L14:
            r0 = -1
            r10 = r0
        L18:
            r0 = r8
            r1 = r10
            r0.setAiStyleId(r1)
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.getStyleName()
            r0.setAiStyleName(r1)
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.getFinalPrompt()
            r0.setAiPrompt(r1)
            r0 = r9
            java.util.List r0 = r0.getMatchedMaterials()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L9c
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r13 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r13
            r3 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r1.<init>(r2)
            r12 = r0
            r0 = r13
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
        L58:
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L78
            r0 = r12
            r1 = r13
            java.lang.Object r1 = r1.next()
            Qw0.a r1 = (Qw0.a) r1
            java.lang.String r1 = r1.getKeyword()
            boolean r0 = r0.add(r1)
            goto L58
        L78:
            r0 = r12
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 62
            java.lang.String r0 = kotlin.collections.CollectionsKt.p(r0, r1, r2, r3, r4, r5)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L9c
            r0 = r12
            java.lang.String r1 = "，"
            java.lang.String r2 = ","
            java.lang.String r0 = kotlin.text.StringsKt.L(r0, r1, r2)
            r12 = r0
            goto L9f
        L9c:
            r0 = 0
            r12 = r0
        L9f:
            r0 = r8
            r1 = r12
            r0.setAiKeyword(r1)
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.getStory()
            r0.setAiContent(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.step.d.h(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(@org.jetbrains.annotations.NotNull com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r9, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean r10) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.step.d.i(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean):void");
    }

    @Nullable
    public Float l(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
        List<BClip> bClipList;
        BClip bClip;
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        String str = (userVideoTrack == null || (bClipList = userVideoTrack.getBClipList()) == null || (bClip = (BClip) CollectionsKt.getOrNull(bClipList, 0)) == null) ? null : bClip.videoPath;
        if (str == null || str.length() == 0) {
            return null;
        }
        r rVarU = a.a.a.a != null ? r.u() : null;
        R50.a aVarS = rVarU != null ? rVarU.s(str) : null;
        if (aVarS == null) {
            return null;
        }
        o oVarA = aVarS.a();
        int width = oVarA.getWidth();
        int height = oVarA.getHeight();
        if (height != 0) {
            return Float.valueOf((width * 1.0f) / height);
        }
        return null;
    }

    public boolean p(@NotNull AIStoryBean aIStoryBean, @NotNull com.bilibili.studio.editor.moudle.aistory.a aVar) {
        if ((a.a.a.a != null ? r.u() : null) == null) {
            Result.Companion companion = Result.Companion;
            aVar.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("StreamingContext is null")))));
            return false;
        }
        List<Qw0.a> matchedMaterials = aIStoryBean.getMatchedMaterials();
        if (matchedMaterials == null || matchedMaterials.isEmpty()) {
            Result.Companion companion2 = Result.Companion;
            aVar.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("matchedMaterials is null")))));
            return false;
        }
        String story = aIStoryBean.getStory();
        if (story != null && story.length() != 0) {
            return true;
        }
        Result.Companion companion3 = Result.Companion;
        aVar.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("story is null")))));
        return false;
    }
}
