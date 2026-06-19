package com.bilibili.studio.editor.asr.multi;

import F3.J2;
import J1.z;
import android.view.ViewGroup;
import androidx.compose.runtime.snapshots.C4340n;
import com.bili.rvext.ThreadLayoutInflater;
import com.bilibili.ad.adview.pegasus.holders.inline.card149.FeedAdHolder149;
import com.bilibili.app.authorspace.ui.pages.s;
import com.bilibili.commons.security.DigestUtils;
import com.bilibili.studio.centerplus.util.UpperCoroutineExceptionHandler;
import com.bilibili.studio.editor.asr.bean.AsrExtraMsg;
import com.bilibili.studio.editor.asr.bean.AsrSource;
import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.editor.asr.k;
import com.bilibili.studio.editor.asr.l;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.video.story.player.M;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/BiliEditorMultiAsrManager.class */
public final class BiliEditorMultiAsrManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static CoroutineScope f105609b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final BiliEditorMultiAsrManager f105608a = new BiliEditorMultiAsrManager();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Iw0.a f105610c = new Iw0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ExecutorCoroutineDispatcher f105611d = ExecutorsKt.from(Executors.newSingleThreadExecutor());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy f105612e = LazyKt.lazy(new J2(7));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Map<String, Jw0.a> f105613f = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v7, types: [Ew0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Hw0.d, java.lang.Object] */
    static {
        Ew0.b.f4798a = new Object();
        Fw0.b.f6462a = new Object();
    }

    public static String a(AudioInfo audioInfo) {
        int from = audioInfo.getFrom();
        String audioFilePath = audioInfo.getAudioFilePath();
        String captionType = audioInfo.getCaptionType();
        long trimInUs = audioInfo.getTrimInUs();
        long trimOutUs = audioInfo.getTrimOutUs();
        StringBuilder sb = new StringBuilder();
        sb.append(from);
        sb.append("_");
        sb.append(audioFilePath);
        sb.append("_");
        sb.append(captionType);
        z.a(trimInUs, "_", "_", sb);
        sb.append(trimOutUs);
        return DigestUtils.md5(sb.toString());
    }

    public static String c() {
        return ec.a.a(com.bilibili.adcommon.utils.a.a(), System.currentTimeMillis(), "_");
    }

    public static void f(BiliEditorMultiAsrManager biliEditorMultiAsrManager, EditVideoInfo editVideoInfo, AsrSource asrSource, boolean z6, boolean z7, boolean z8, Function2 function2, Function1 function1, Function1 function12) {
        biliEditorMultiAsrManager.getClass();
        String strC = c();
        com.bilibili.studio.editor.asr.b.f(strC, false, true, asrSource);
        if (asrSource == AsrSource.EDITOR) {
            com.bilibili.studio.editor.asr.b.c(true);
        }
        List<AudioInfo> listB = biliEditorMultiAsrManager.b(editVideoInfo, z6, z7, z8);
        g gVar = new g(function2, function1, function12, null, null, 16);
        gVar.f105643f = false;
        s sVar = new s(gVar, 2);
        l lVar = gVar.f105646j;
        lVar.f105593b = false;
        Timer timer = lVar.f105592a;
        if (timer != null) {
            timer.cancel();
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        Timer timer2 = new Timer();
        timer2.schedule(new k(intRef, 99, 1, lVar, sVar), 0L, 10000 / ((long) 99));
        lVar.f105592a = timer2;
        biliEditorMultiAsrManager.e(false, strC, asrSource, listB, gVar);
    }

    public final List<AudioInfo> b(EditVideoInfo editVideoInfo, boolean z6, boolean z7, boolean z8) {
        if (editVideoInfo == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (z8) {
            List<RecordInfo> recordInfoList = editVideoInfo.getRecordInfoList();
            List<RecordInfo> listEmptyList = recordInfoList;
            if (recordInfoList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            SequencesKt.toCollection(SequencesKt.mapNotNull(CollectionsKt.asSequence(listEmptyList), new BiliEditorMultiAsrManager$generateAudioInfo$1(this)), arrayList);
        }
        if (z7) {
            EditorMusicInfo editorMusicInfo = editVideoInfo.getEditorMusicInfo();
            ArrayList<BMusic> arrayList2 = editorMusicInfo != null ? editorMusicInfo.bMusicList : null;
            List listEmptyList2 = arrayList2;
            if (arrayList2 == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            Sequence sequenceAsSequence = CollectionsKt.asSequence(listEmptyList2);
            EditorMusicInfo editorMusicInfo2 = editVideoInfo.getEditorMusicInfo();
            BMusic bMusic = null;
            if (editorMusicInfo2 != null) {
                bMusic = editorMusicInfo2.themeMusic;
            }
            SequencesKt.toCollection(SequencesKt.mapNotNull(SequencesKt.plus(sequenceAsSequence, bMusic), new BiliEditorMultiAsrManager$generateAudioInfo$2(this)), arrayList);
        }
        if (z6) {
            List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
            List<BClip> listEmptyList3 = userTrackBClipList;
            if (userTrackBClipList == null) {
                listEmptyList3 = CollectionsKt.emptyList();
            }
            final int i7 = 0;
            SequencesKt.toCollection(SequencesKt.mapNotNull(SequencesKt.filter(CollectionsKt.asSequence(listEmptyList3), new Function1(i7) { // from class: com.bilibili.studio.editor.asr.multi.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f105626a;

                {
                    this.f105626a = i7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f105626a) {
                        case 0:
                            return Boolean.valueOf(((BClip) obj).isVideo());
                        default:
                            ViewGroup viewGroup = (ViewGroup) obj;
                            return new FeedAdHolder149(M.a(viewGroup, ThreadLayoutInflater.Companion, 2131502367, viewGroup, false));
                    }
                }
            }), new BiliEditorMultiAsrManager$generateAudioInfo$4(this)), arrayList);
        }
        return arrayList;
    }

    public final void d(@Nullable String str, @NotNull AsrSource asrSource, @Nullable EditVideoInfo editVideoInfo, @NotNull Function2<? super Bw0.d, ? super AsrExtraMsg, Unit> function2, @Nullable Function0<Unit> function0) {
        if (str == null) {
            str = c();
        }
        com.bilibili.studio.editor.asr.b.g(8, str, true);
        if (asrSource == AsrSource.EDITOR) {
            com.bilibili.studio.editor.asr.b.c(true);
        }
        e(true, str, asrSource, b(editVideoInfo, true, false, false), new g(null, null, null, function0, function2, 7));
    }

    public final void e(boolean z6, String str, AsrSource asrSource, List<AudioInfo> list, g gVar) {
        CoroutineScope CoroutineScope;
        Jw0.a aVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<AudioInfo> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C4340n.a(list2, 10, 16));
        for (Object obj : list2) {
            AudioInfo audioInfo = (AudioInfo) obj;
            synchronized (f105608a) {
                String cacheKey = audioInfo.getCacheKey();
                String strA = cacheKey;
                if (cacheKey == null) {
                    strA = a(audioInfo);
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) f105613f;
                Object obj2 = linkedHashMap2.get(strA);
                Object asrSingleTask = obj2;
                if (obj2 == null) {
                    asrSingleTask = new AsrSingleTask(strA, audioInfo.getAudioFilePath(), audioInfo.getCaptionType(), f105610c);
                    linkedHashMap2.put(strA, asrSingleTask);
                }
                aVar = (Jw0.a) asrSingleTask;
            }
            linkedHashMap.put(obj, aVar);
        }
        a aVar2 = new a(z6, str, asrSource, jCurrentTimeMillis, list, linkedHashMap, gVar, f105611d, (ExecutorCoroutineDispatcher) f105612e.getValue());
        synchronized (this) {
            CoroutineScope coroutineScope = f105609b;
            CoroutineScope = coroutineScope;
            if (coroutineScope == null) {
                CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new CoroutineName("BiliEditorMultiAsrManager")).plus(new UpperCoroutineExceptionHandler()));
            }
            f105609b = CoroutineScope;
        }
        BuildersKt.launch$default(CoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AsrCombineTask$start$1(aVar2, CoroutineScope, null), 3, (Object) null);
    }
}
